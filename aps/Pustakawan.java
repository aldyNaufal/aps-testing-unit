public class Pustakawan extends User{

        String nomerNIP;
        String nomerKontak;
        String email;
    
        public Pustakawan(String name, String idUser, String alamat, String password, String nomerNIP, String nomerKontak, String email){
    
            super(name, idUser, alamat, password);
            this.nomerKontak = nomerKontak;
            this.nomerNIP = nomerNIP;
            this.email = email;
        }
    
        public String getNomerNIP() {
            return nomerNIP;
        }

        public void setNomerNIP(String nomerNIP) {
            this.nomerNIP = nomerNIP;
        }
        
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }

        public void setNomerKontak(String nomerKontak) {
            this.nomerKontak = nomerKontak;
        }

        public String getNomerKontak() {
            return nomerKontak;
        }
    
}
