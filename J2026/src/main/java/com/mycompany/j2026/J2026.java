/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.j2026;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Tran Hoang
 */
public class J2026 {

    /**
     * @param args the command line arguments
     */
    
    static boolean ok = false;
    
    public static void nextCombination(ArrayList<Integer> arr, int n, int k) {
        int i = k - 1;
        while(i >= 0 && arr.get(i) == n - k + i) {
            i --;
        }
        if(i < 0) {
            ok = true;
        }
        else {
            arr.set(i, arr.get(i) + 1);
            for(int j = i + 1; j < arr.size(); j ++) {
                arr.set(j, arr.get(j - 1) + 1);
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            ArrayList<Integer> adarr = new ArrayList<>();
            
            for(int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
                adarr.add(i);
            }
            Collections.sort(arr);
            ok = false;
            while(!ok) {
                for(int i = 0; i < k; i++) {
                    System.out.print(arr.get(adarr.get(i)) + " ");
                }
                System.out.println();
                
                nextCombination(adarr,n, k);
            }
            
            
        }

    }
}
