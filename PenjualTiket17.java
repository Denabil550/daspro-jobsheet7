import java.util.Scanner;

public class PenjualTiket17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int jumlahTiket;
        double totalHarga;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan input ulang.");
                continue;
            }

            if (jumlahTiket == 0) {
                System.out.println("Tidak ada tiket yang dibeli.");
                break;
            }

            totalHarga = jumlahTiket * HARGA_TIKET;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85; // diskon 15%
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90; // diskon 10%
            }

            System.out.println("Total harga penjualan hari ini: Rp " + totalHarga);
            break;
        }
        input.close();
    }
}
