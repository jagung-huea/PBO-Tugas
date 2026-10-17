package Quiz1;

import java.util.Scanner; //buat input

public class PengolahanNilai {
    
    public static double hitungNilaiAkhir(double tugas, double uts, double uas) {
        return (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================================================");
        System.out.println("       SISTEM PENGOLAHAN NILAI MAHASISWA         ");
        System.out.println("=================================================");
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        String[] npm = new String[jumlah];
        String[] nama = new String[jumlah];
        double[] tugas = new double[jumlah];
        double[] uts = new double[jumlah];
        double[] uas = new double[jumlah];
        double[] akhir = new double[jumlah];
        String[] huruf = new String[jumlah];
        String[] status = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa Ke-" + (i + 1));
            System.out.println("-------------------------------------------------");
            System.out.print("NPM         : ");
            npm[i] = input.nextLine();
            System.out.print("Nama        : ");
            nama[i] = input.nextLine();

            //cek tugas
            do {
                System.out.print("Nilai Tugas : ");
                tugas[i] = input.nextDouble();
                if (tugas[i] < 0 || tugas[i] > 100) {
                    System.out.println("Nilai tidak valid! Masukkan nilai 0-100.");
                }
            } while (tugas[i] < 0 || tugas[i] > 100);

            //cek uts
            do {
                System.out.print("Nilai UTS   : ");
                uts[i] = input.nextDouble();
                if (uts[i] < 0 || uts[i] > 100) {
                    System.out.println("Nilai tidak valid! Masukkan nilai 0-100.");
                }
            } while (uts[i] < 0 || uts[i] > 100);

            //cek uas
            do {
                System.out.print("Nilai UAS   : ");
                uas[i] = input.nextDouble();
                if (uas[i] < 0 || uas[i] > 100) {
                    System.out.println("Nilai tidak valid! Masukkan nilai 0-100.");
                }
            } while (uas[i] < 0 || uas[i] > 100);
            
            input.nextLine(); // clear enter biar tidak error

            //call fungsi untuk menghitung nilai akhir
            akhir[i] = hitungNilaiAkhir(tugas[i], uts[i], uas[i]);

            //menentukan huruf dan status berdasaarkan nilai yg diinput
            if (akhir[i] >= 80) {
                huruf[i] = "A";
                status[i] = "LULUS";
            } else if (akhir[i] >= 70) {
                huruf[i] = "B";
                status[i] = "LULUS";
            } else if (akhir[i] >= 60) {
                huruf[i] = "C";
                status[i] = "LULUS";
            } else if (akhir[i] >= 50) {
                huruf[i] = "D";
                status[i] = "TIDAK LULUS";
            } else {
                huruf[i] = "E";
                status[i] = "TIDAK LULUS";
            }
        }

        //output     
        System.out.println("\n==========================================================================================");
        System.out.println("                                  DAFTAR NILAI MAHASISWA                                  ");
        System.out.println("==========================================================================================");
        System.out.println("No   NPM           Nama         Tugas   UTS     UAS     Akhir   Huruf   Status");
        System.out.println("------------------------------------------------------------------------------------------");

        //deklare variabel buat nampung statistik mhs
        int jmlLulus = 0;
        int jmlTidakLulus = 0;
        
        //inisialisasi nilai tertinggi dan terendah di data pertama
        double nilaiTertinggi = akhir[0];
        double nilaiTerendah = akhir[0];
        double totalNilai = 0;

        //loop untuk cetak tabel 
        for (int i = 0; i < jumlah; i++) {

            System.out.printf("%-4d %-13s %-12s %-7.0f %-7.0f %-7.0f %-7.1f %-7s %s\n",
                    (i + 1), npm[i], nama[i], tugas[i], uts[i], uas[i], akhir[i], huruf[i], status[i]);

            //hitung mhs yang lulus/tidak
            if (status[i].equals("LULUS")) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }

            //cari yang paling tinggi dan paling rendah
            if (akhir[i] > nilaiTertinggi) {
                nilaiTertinggi = akhir[i];
            }
            if (akhir[i] < nilaiTerendah) {
                nilaiTerendah = akhir[i];
            }
            
            //tambh semua nilai akhir untuk hitung rata2
            totalNilai += akhir[i];
        }
        System.out.println("==========================================================================================");

        //output akhir
        System.out.println("\nSTATISTIK NILAI");
        System.out.println("-------------------------------------------------");
        System.out.println("Jumlah Mahasiswa       : " + jumlah);
        System.out.println("Jumlah Mahasiswa Lulus : " + jmlLulus);
        System.out.println("Jumlah Tidak Lulus     : " + jmlTidakLulus);
        System.out.println("Nilai Tertinggi        : " + nilaiTertinggi);
        System.out.println("Nilai Terendah         : " + nilaiTerendah);
        System.out.printf("Rata-rata Kelas        : %.2f\n", (totalNilai / jumlah));
        System.out.println("=================================================");
    }
}
