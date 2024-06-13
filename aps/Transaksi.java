import java.util.Date;


public class Transaksi {
    private static int idCounter = 0;

    private int idTransaksi;
    private Date tanggalPeminjaman;
    private Date tanggalPengembalian;
    private String statusPeminjaman;
    private User peminjam;
    private Buku buku; 

    public Transaksi(Date tanggalPeminjaman, String statusPeminjaman, User peminjam, Buku buku) {
        this.idTransaksi = ++idCounter; // Auto increment
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.statusPeminjaman = statusPeminjaman;
        this.peminjam = peminjam;
        this.buku = buku;
    }

    public void kembalikanBuku(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
        this.statusPeminjaman = "Dikembalikan";
        this.buku.kembalikanBuku();
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }


    public void setStatusPeminjaman(String statusPeminjaman) {
        this.statusPeminjaman = statusPeminjaman;
    }

    public String getStatusPeminjaman() {
        return statusPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public Buku getBuku() {
        return buku;
    }

    public User getPeminjam() {
        return peminjam;
    }

}
