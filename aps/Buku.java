import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Buku {
    private static int idCounter = 0; 
    private int idBuku;
    private String penerbit;
    private String judul;
    private String pengarang;
    private Date tahunTerbit;
    private boolean isBorrowed;

    private static List<Buku> bukuTersedia = new ArrayList<>();
    private static List<Buku> bukuDipinjam = new ArrayList<>();

    private List<Review> reviews;

    public Buku(String penerbit, String judul, String pengarang, Date tahunTerbit) {
        this.idBuku = ++idCounter; // Auto increment
        this.penerbit = penerbit;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.isBorrowed = false;
        this.reviews = new ArrayList<>(); // Inisialisasi daftar review
        bukuTersedia.add(this);
    }

    public static void addBuku(Buku buku) {
        bukuTersedia.add(buku);
    }

    public boolean pinjamBuku() {
        if (!isBorrowed) {
            this.isBorrowed = true;
            bukuTersedia.remove(this);
            bukuDipinjam.add(this);
            return true;
        }
        return false;
    }

    public void kembalikanBuku() {
        if (isBorrowed) {
            this.isBorrowed = false;
            bukuDipinjam.remove(this);
            bukuTersedia.add(this);
        }
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setTahunTerbit(Date tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public Date getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public static List<Buku> getBukuTersedia() {
        return bukuTersedia;
    }

    public static List<Buku> getBukuDipinjam() {
        return bukuDipinjam;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void reviewBuku(int rating, String ulasan, User reviewer) {
        Review review = new Review(rating, ulasan, reviewer, this);
        reviews.add(review);
    }

}
