
package p5;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Sepeda sepeda = new Sepeda();

        System.out.print("Masukan Object Merk Sepeda: ");
        sepeda.merk = input.nextLine();

        System.out.println("Object " + sepeda.merk +
                " dibuat, jarak tmpuh awal 0 km");

        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("Bergerak Maju (1)");
            System.out.println("Bergerak Mundur (2)");
            System.out.println("Berhenti (3)");
            System.out.println("Exit (0)");
            System.out.print("Pilihan : ");

            pilihan = input.nextInt();

            if (pilihan == 1) {
                sepeda.bergerakMaju();
            } else if (pilihan == 2) {
                sepeda.bergerakMundur();
            } else if (pilihan == 3) {
                sepeda.berhenti();
            } else if (pilihan == 0) {
                System.out.println("Keluar Program ..");
                System.out.println("Terimakasih sudah menggunakan program ini.");
            } else {
                System.out.println("Pilihan tidak tersedia");
            }

        } while (pilihan != 0);

        input.close();
    }
}

