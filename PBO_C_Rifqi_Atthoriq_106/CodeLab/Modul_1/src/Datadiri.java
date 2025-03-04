import java.util.Scanner;
import java.time.LocalDate;

public class Datadiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelaminInput = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        String jenisKelamin;
        if (jenisKelaminInput == 'L' || jenisKelaminInput == 'l') {
            jenisKelamin = "Laki-laki";
        } else if (jenisKelaminInput == 'P' || jenisKelaminInput == 'p') {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "Tidak diketahui";
        }

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur          : " + umur + " tahun");

        scanner.close();
    }
}
