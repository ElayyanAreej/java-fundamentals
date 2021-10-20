package inheritance;

public class Review {
    private String author;
    private double stars;
    private String body ;

    public Review(String author, double stars, String body) {
        this.author = author;
        this.stars = stars;
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public String toString(){
        return  this.author + " Review: "+ this.body + " Stars: "+ this.stars;
    }
}
