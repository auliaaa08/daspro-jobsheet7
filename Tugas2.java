import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis;      
        int durasi;     
        int total = 0;  

        do {
            System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break; 
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi tidak valid! Coba lagi.\n");
                continue; 
            }

            int biaya = 0;

            if (durasi > 5) {
                biaya = 12500;
            } else {
                if (jenis == 1) {
                    biaya = durasi * 3000;
                } else if (jenis == 2) { 
                    biaya = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid!\n");
                    continue;
                }
            }

            System.out.println("Biaya parkir: Rp " + biaya);
            total += biaya;
            System.out.println("Total sementara: Rp " + total + "\n");

        } while (jenis != 0);

        System.out.println("---------------------------------");
        System.out.println("Total pendapatan parkir hari ini: Rp " + total);
        
    }
}

