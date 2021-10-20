package inheritance;

import java.util.ArrayList;

public class Review {
    private String author;
    private double stars;
    private String body ;
    private String shownMovie;

    public Review(String author, double stars, String body) {
        this.author = author;
        this.stars = stars;
        this.body = body;
    }
    public Review(String author, double stars, String body,String shownMovie) {
        this.author = author;
        this.stars = stars;
        this.body = body;
        this.shownMovie=shownMovie;
    }
    public String getShownMovie() {
        return shownMovie;
    }

    public void setShownMovie(String shownMovie) {
        this.shownMovie = shownMovie;
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
    public String toStringTheater(){
        return  this.author +"  watched "+this.shownMovie+ " Review: "+ this.body + " Stars: "+ this.stars;
    }

}
