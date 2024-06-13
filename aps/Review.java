public class Review {
    private static int idCounter = 0;
    private int idReview;
    private int rating;
    private String ulasan;
    private User reviewer;
    private Buku buku; 

    public Review(int rating, String ulasan, User reviewer, Buku buku) {
        this.idReview = ++idCounter; // Auto increment
        this.rating = rating;
        this.ulasan = ulasan;
        this.reviewer = reviewer;
        this.buku = buku;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public int getIdReview() {
        return idReview;
    }

    public void setReview(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setUlasan(String ulasan) {
        this.ulasan = ulasan;
    }

    public String getUlasan() {
        return ulasan;
    }

    public Buku getBuku() {
        return buku;
    }

    public String getReviewerName() {
        return reviewer.getName(); 
    }

 

}
