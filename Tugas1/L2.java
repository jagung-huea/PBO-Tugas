
package Tugas1;

import java.util.Scanner;


public class L2 {
    public static void main(String[] args) {
        System.out.println("pilih run kelas a b c");
    }
}


class L2a{
    public static void main(String[] args) {
        float p=2;
        float l=5;
        float luas;
        
        luas = p*l;
        System.out.println(luas);
     }
}
        
class L2b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float jari, luas, keliling;
        float phi = 3.14F;
        
        System.out.print("Masukkan jari2: ");
        jari=input.nextFloat();
        
        luas=phi*jari*jari;
        keliling=2*phi*jari;
        
        System.out.println("Luas " + luas + ", Keliling " + keliling);
    }
}

class L2c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jam, mnt, dtk, total;
        
        System.out.print("Masukkan jam: ");
        jam=input.nextInt();
        System.out.print("Masukkan menit: ");
        mnt=input.nextInt();
        System.out.print("Masukkan detik: ");
        dtk=input.nextInt();
        
        total=(jam*3600) + (mnt*60) + dtk;
        System.out.println(total);
    }
}