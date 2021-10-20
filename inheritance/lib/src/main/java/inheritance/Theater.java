package inheritance;

import java.util.ArrayList;

public class Theater implements Places{
  private String name;
  private double stars=5;
  private ArrayList<String> movies  =new ArrayList<String>();

    public Theater(String name) {
        this.name = name;
    }

    ArrayList<String> theaterReviews=new ArrayList<String>();
    ArrayList<Double> theaterStars=new ArrayList<Double>();

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<String> movies) {
        this.movies = movies;
    }


    public void addMovie(String movie){
        this.movies.add(movie);
    }
    public void removeMovie(String movie){
   for(String item:movies){
       if(movie==item){
           this.movies.remove(item);
       }
   }
    }

    public String toString(){
        return  this.name + " Theater   "+this.stars;
    }

    public void addReview(Review r){
        // add the review stars
        theaterStars.add(r.getStars());

        //loop on the Arraylist to calc the avg of satrs
        double sum =0;
        int count=0;
        for(Double stars:theaterStars){
            sum+=stars;
            count++;
        }

        this.stars= sum/count;

        theaterReviews.add(r.toStringTheater());
        System.out.println(r.toStringTheater());
//        System.out.println(this.toString());
    }

    public ArrayList viewReview(){
        return theaterReviews;

    }
}
