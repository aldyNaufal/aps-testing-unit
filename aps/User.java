public class User {

    String name;
    String idUser;
    String alamat;
    String password;
    boolean isLoggedIn;

    public User(String name, String idUser, String alamat, String password) {
        this.name = name;
        this.idUser = idUser;
        this.alamat = alamat;
        this.password = password;
        this.isLoggedIn = false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public boolean login(String idUser, String password) {
        if (this.idUser.equals(idUser) && this.password.equals(password)) {
            this.isLoggedIn = true;
            return true;
        }
        return false;
    }

    public void logout() {
        if (this.isLoggedIn) {
            this.isLoggedIn = false;
        }
    }

    public boolean gantiPassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

}
