public class PenggemarBuku extends User {

    String bukuFavorit;
    String genreFavorit;
    String email;

    public PenggemarBuku(String name, String idUser, String alamat, String password, String bukuFavorit, String genreFavorit, String email){


        super(name, idUser, alamat, password);
        this.bukuFavorit = bukuFavorit;
        this.genreFavorit = genreFavorit;
        this.email = email;
    }

    public String getBukuFavorit() {
        return bukuFavorit;
    }

    public void setBukuFavorit(String bukuFavorit) {
        this.bukuFavorit = bukuFavorit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenreFavorit() {
        return genreFavorit;
    }

    public void setGenreFavorit(String genreFavorit) {
        this.genreFavorit = genreFavorit;
    }

    
}
