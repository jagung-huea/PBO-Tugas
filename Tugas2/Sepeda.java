
package p5;
    

public class Sepeda {
    String merk;
    int jarakTempuh = 0;

    void bergerakMaju() {
        jarakTempuh = jarakTempuh + 10;
        System.out.println("Bergerak Maju 10 Km");
        System.out.println("Object Sepeda " + merk +
                ", Jarak tempuh " + jarakTempuh + " Km");
    }

    void bergerakMundur() {
        jarakTempuh = jarakTempuh - 5;
        System.out.println("Bergerak Mundur 5 Km");
        System.out.println("Object Sepeda " + merk +
                ", Jarak tempuh " + jarakTempuh + " Km");
    }

    void berhenti() {
        System.out.println("Sepeda Berhenti");
        System.out.println("Object Sepeda " + merk +
                ", Jarak tempuh akhir " + jarakTempuh + " Km");
    }
}

