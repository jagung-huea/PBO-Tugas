
package Tugas1;

import java.util.Scanner;


public class L1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Tahun (1909 - 2024): ");
        int tahun = input.nextInt();
        
        if ((tahun %4 == 0 && tahun % 100 != 0) || (tahun % 400 ==0)){
            System.out.println(tahun + " adalah tahun kabisat");
        }else{
            System.out.println(tahun + " bukan tahun kabisat");
        }
    }
}
