/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manualsha1encryptor;

/**
 *
 * @author GIAP
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class ManualSha1Encryptor extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Manual SHA-1 Encryptor");

        // Tạo các phần tử giao diện
        Label inputLabel = new Label("Input String:");
        TextField inputField = new TextField();
        inputField.setPromptText("Enter text to encrypt");

        Label outputLabel = new Label("SHA-1 Hash:");
        TextArea outputArea = new TextArea();
        outputArea.setEditable(false); // Đặt ô chứa kết quả ở chế độ chỉ đọc
        outputArea.setWrapText(true); // Tự động xuống dòng
        outputArea.setPrefHeight(100); // Đặt chiều cao ưu tiên cho TextArea

        // Tạo nút Encrypt
        Button encryptButton = new Button("Encrypt");

        // Tạo nút Copy
        Button copyButton = new Button("Copy");
        copyButton.setOnAction(e -> {
            String sha1Hash = outputArea.getText();
            if (!sha1Hash.isEmpty()) {
                Clipboard clipboard = Clipboard.getSystemClipboard();
                ClipboardContent content = new ClipboardContent();
                content.putString(sha1Hash);
                clipboard.setContent(content);
                showAlert(Alert.AlertType.INFORMATION, "Copied", "SHA-1 hash copied to clipboard.");
            } else {
                showAlert(Alert.AlertType.WARNING, "No Content", "There is no hash to copy.");
            }
        });

        // Tạo một HBox để chứa nút Copy
        HBox copyButtonBox = new HBox(10);
        copyButtonBox.setAlignment(Pos.CENTER_LEFT);
        copyButtonBox.getChildren().add(copyButton);

        // Đặt layout GridPane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Thêm các phần tử vào grid
        grid.add(inputLabel, 0, 0);
        grid.add(inputField, 1, 0);
        grid.add(encryptButton, 1, 1);
        grid.add(outputLabel, 0, 2);
        grid.add(outputArea, 1, 2);
        grid.add(copyButtonBox, 1, 3);

        // Xử lý sự kiện khi nhấn nút Encrypt
        encryptButton.setOnAction(e -> {
            String inputText = inputField.getText();
//            if (inputText.isEmpty()) {
//                showAlert(Alert.AlertType.WARNING, "Input Required", "Please enter a string to encrypt.");
//                return;
//            }

            try {
                String sha1Hash = computeSHA1(inputText);
                outputArea.setText(sha1Hash);
            } catch (Exception ex) {
                showAlert(Alert.AlertType.ERROR, "Encryption Error", "An error occurred during encryption.");
            }
        });

        // Đặt kích thước của TextArea
        outputArea.setPrefWidth(400); // Đặt chiều rộng ưu tiên

        // Thiết lập scene và hiển thị stage
        Scene scene = new Scene(grid, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Computes the SHA-1 hash of the given input string manually.
     *
     * @param input The input string to hash.
     * @return The SHA-1 hash as a hexadecimal string.
     */
    private String computeSHA1(String input) {
        // (Phần mã tính toán SHA-1 không thay đổi)
        byte[] message = input.getBytes(StandardCharsets.UTF_8);

        byte[] paddedMessage = padMessage(message);

        int numChunks = paddedMessage.length / 64;
        int h0 = 0x67452301;
        int h1 = 0xEFCDAB89;
        int h2 = 0x98BADCFE;
        int h3 = 0x10325476;
        int h4 = 0xC3D2E1F0;

        for (int i = 0; i < numChunks; i++) {
            int[] w = new int[80];
            for (int j = 0; j < 16; j++) {
                int index = i * 64 + j * 4;
                w[j] = ((paddedMessage[index] & 0xFF) << 24) |
                       ((paddedMessage[index + 1] & 0xFF) << 16) |
                       ((paddedMessage[index + 2] & 0xFF) << 8) |
                       (paddedMessage[index + 3] & 0xFF);
            }

            for (int j = 16; j < 80; j++) {
                w[j] = leftRotate(w[j - 3] ^ w[j - 8] ^ w[j - 14] ^ w[j - 16], 1);
            }

            int a = h0;
            int b = h1;
            int c = h2;
            int d = h3;
            int e = h4;

            for (int j = 0; j < 80; j++) {
                int f, k;
                if (j >= 0 && j <= 19) {
                    f = (b & c) | ((~b) & d);
                    k = 0x5A827999;
                } else if (j >= 20 && j <= 39) {
                    f = b ^ c ^ d;
                    k = 0x6ED9EBA1;
                } else if (j >= 40 && j <= 59) {
                    f = (b & c) | (b & d) | (c & d);
                    k = 0x8F1BBCDC;
                } else {
                    f = b ^ c ^ d;
                    k = 0xCA62C1D6;
                }

                int temp = leftRotate(a, 5) + f + e + k + w[j];
                e = d;
                d = c;
                c = leftRotate(b, 30);
                b = a;
                a = temp;
            }

            h0 += a;
            h1 += b;
            h2 += c;
            h3 += d;
            h4 += e;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(toHexString(h0));
        sb.append(toHexString(h1));
        sb.append(toHexString(h2));
        sb.append(toHexString(h3));
        sb.append(toHexString(h4));

        return sb.toString();
    }

    /**
     * Pads the input message according to SHA-1 specifications.
     *
     * @param message The original message bytes.
     * @return The padded message bytes.
     */
    private byte[] padMessage(byte[] message) {
        int originalLength = message.length;
        long bitLength = (long) originalLength * 8;

        int paddingLength = 64 - ((originalLength + 8 + 1) % 64);
        if (paddingLength < 0) {
            paddingLength += 64;
        }

        byte[] padded = Arrays.copyOf(message, originalLength + 1 + paddingLength + 8);
        padded[originalLength] = (byte) 0x80;

        for (int i = 0; i < 8; i++) {
            padded[padded.length - 1 - i] = (byte) ((bitLength >>> (8 * i)) & 0xFF);
        }

        return padded;
    }

    /**
     * Left rotates a 32-bit integer by the specified number of bits.
     *
     * @param value The integer to rotate.
     * @param bits  The number of bits to rotate.
     * @return The rotated integer.
     */
    private int leftRotate(int value, int bits) {
        return (value << bits) | (value >>> (32 - bits));
    }

    /**
     * Converts a 32-bit integer to an 8-character hexadecimal string.
     *
     * @param value The integer to convert.
     * @return The hexadecimal string.
     */
    private String toHexString(int value) {
        String hex = Integer.toHexString(value);
        while (hex.length() < 8) {
            hex = "0" + hex;
        }
        return hex;
    }

    /**
     * Utility method to show alerts.
     *
     * @param alertType The type of alert.
     * @param title     The title of the alert window.
     * @param message   The message content of the alert.
     */
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * The main method is needed to support running the application from IDEs with limited JavaFX support.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
