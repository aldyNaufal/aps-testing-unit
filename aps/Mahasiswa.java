public class Mahasiswa extends User{
    String nim;
    String jurusan;
    String email;

    public Mahasiswa(String name, String idUser, String alamat, String password, String nim, String jurusan, String email){


        super(name, idUser, alamat, password);
        this.nim = nim;
        this.jurusan = jurusan;
        this.email = email;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
