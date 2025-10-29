import java.util.Scanner;

public class NilaiKelompok17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ulangi proses untuk 6 kelompok menggunakan while (outer loop)
        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            int totalNilai = 0; // nilai awal untuk setiap kelompok

            // Input 5 nilai dari penilai dan akumulasi
            for (int j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari Kelompok Penilai " + j + ": ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }

            // Tampilkan total dan rata-rata untuk kelompok saat ini
            System.out.println("Total nilai: " + totalNilai);
            double rataNilai = (double) totalNilai / 5.0;
            System.out.printf("Rata-rata nilai: %.2f%n", rataNilai);
            System.out.println();

            i++; // tingkatkan counter kelompok
        }

        sc.close();
    }
}
