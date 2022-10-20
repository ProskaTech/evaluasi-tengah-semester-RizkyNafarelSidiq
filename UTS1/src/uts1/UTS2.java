/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts1;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */

import java.util.Scanner;

public class UTS2 {
    public static void main (String [] args) {
        int A,B,C,input;

        Scanner dataMasuk = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris = ");
        input = dataMasuk.nextInt();

        for(A=0;A<=input;A++){
            for(B=1;B<=A;B++){
            System.out.print(" ");
            }
            for(C=1;C<=input-A;C++){
            System.out.print(" #");
            }
            System.out.println();
        }

        for(A=1;A<=input;A++){
            for(B=1;B<=input-A;B++){
            System.out.print(" ");
            }
            for(C=1;C<=A;C++){
            System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
