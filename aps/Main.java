import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat user
        User user1 = new User("User A", "userA", "Alamat A", "passwordA");

        // Login user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ID User: ");
        String idUser = scanner.nextLine();
        System.out.print("Masukkan Password: ");
        String password = scanner.nextLine();

        if (user1.login(idUser, password)) {
            System.out.println("Login berhasil!");

            // Membuat buku baru dan menambahkannya ke daftar buku
            Buku buku1 = new Buku("Penerbit A", "Judul A", "Pengarang A", new Date());
            Buku buku2 = new Buku("Penerbit B", "Judul B", "Pengarang B", new Date());

            // Meminjam buku1
            if (buku1.pinjamBuku()) {
                Transaksi transaksi1 = new Transaksi(new Date(), "Dipinjam", user1, buku1);
                System.out.println("Buku '" + buku1.getJudul() + "' dipinjam pada " + transaksi1.getTanggalPeminjaman());

                // Mengembalikan buku1
                transaksi1.kembalikanBuku(new Date());
                System.out.println("Buku '" + buku1.getJudul() + "' dikembalikan pada " + transaksi1.getTanggalPengembalian());
            } else {
                System.out.println("Buku '" + buku1.getJudul() + "' sedang dipinjam.");
            }

            // Menambahkan review untuk buku
            System.out.println("Masukkan rating (1-5) untuk buku '" + buku1.getJudul() + "': ");
            int rating = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.println("Masukkan ulasan untuk buku '" + buku1.getJudul() + "': ");
            String ulasan = scanner.nextLine();

            buku1.reviewBuku(rating, ulasan, user1);

            // Tampilkan daftar buku yang tersedia dan yang sedang dipinjam
            System.out.println("\nDaftar Buku Tersedia:");
            for (Buku buku : Buku.getBukuTersedia()) {
                System.out.println("- " + buku.getJudul());
            }

            System.out.println("\nDaftar Buku Dipinjam:");
            for (Buku buku : Buku.getBukuDipinjam()) {
                System.out.println("- " + buku.getJudul());
            }

            // Tampilkan review dari buku1
            System.out.println("\nReview untuk buku '" + buku1.getJudul() + "':");
            for (Review review : buku1.getReviews()) {
                System.out.println("Reviewer: " + review.getReviewerName());
                System.out.println("Rating: " + review.getRating());
                System.out.println("Ulasan: " + review.getUlasan());
                System.out.println();
            }
        } else {
            System.out.println("Login gagal. ID User atau password salah.");
        }

        scanner.close();
    }
}
