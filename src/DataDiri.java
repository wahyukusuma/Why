//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("L")) ? "laki-laki" : "perempuan";

        // Input tanggal lahir
        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirString = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Hitung umur berdasarkan tahun sekarang
        LocalDate sekarang = LocalDate.now();
        int umur = Period.between(tanggalLahir, sekarang).getYears();

        // Output data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}