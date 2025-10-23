
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hargaTiket = 50000;
        int jumlahPelanggan, jumlahTiket;
        double totalPendapatan = 0;
        double totalHarga;

        System.out.print("Masukkan jumlah pelanggan hari ini: ");
        jumlahPelanggan = sc.nextInt();

        int i = 1;
        while (i <= jumlahPelanggan) {
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan ke-" + i + ": ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan ulang.");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                totalHarga *= 0.85;
                System.out.println("Anda mendapatkan diskon 15%!");
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;
                System.out.println("Anda mendapat diskon 10%!");
            }

            System.out.println("Total harga untuk pelanggan ke-" + i + ": Rp " + totalHarga);
            totalPendapatan += totalHarga;
            i++;
        }

        System.out.println("---------------------------------------");
        System.out.println("Total penjualan tiket hari ini: Rp " + totalPendapatan);
        System.out.println("---------------------------------------");
    }
}
