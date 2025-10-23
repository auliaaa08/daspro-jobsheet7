
import java.util.Scanner;
public class SiakadFor06Modifikasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int jumlahMahasiswaLulus = 0, jumlahMahasiswaTidakLulus = 0;
        double batasKelulusan = 60;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= batasKelulusan) {
                jumlahMahasiswaLulus++;
            } else {
                jumlahMahasiswaTidakLulus++;
            }
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + jumlahMahasiswaLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahMahasiswaTidakLulus);

    }
}