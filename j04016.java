import java.util.Scanner;

class Matrix {
    private int column, row;
    private int [][] matrix;

    public Matrix() {}
    public Matrix(int row, int column) {
        this.column = column;
        this.row = row;
        this.matrix = new int[row][column];
    }

    public void nextMatrix(Scanner sc) {
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public int [][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int [][] matrix) {
        this.matrix = matrix;
    }

    public Matrix mul(Matrix m2) {
        int [][] ma = new int[row][m2.column];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < m2.column; j ++) {
                int mul = 0;
                for(int k = 0; k < column; k++) {
                    mul += matrix[i][k] * m2.matrix[k][j];
                }
                ma[i][j] = mul;
            }
        }
        Matrix ne = new Matrix();
        ne.setMatrix(ma);
        return ne;
    }

    public Matrix trans() {
        Matrix tran = new Matrix(column, row);
        tran.matrix = new int[column][row];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                tran.matrix[j][i] = matrix[i][j];
            }
        }
        return tran;
    }

    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < matrix.length; i ++) {
            for(int j = 0; j < matrix[i].length; j ++) {
                str += matrix[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
}

public class j04016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
    
}
