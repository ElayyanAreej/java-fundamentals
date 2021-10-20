package inheritance;

import java.util.ArrayList;

public class Restaurant implements Places{
    private String name;
    private double stars;
    private String category;

    ArrayList<String> restaurantReviews=new ArrayList<String>();
    ArrayList<Double> restaurantStars=new ArrayList<Double>();

    public Restaurant(String name, double stars, String category) {
        this.name = name;
        this.stars = stars;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

      public String toString(){
        return  this.name + " Restaurant has "+ this.stars + " Stars and the price category "+ this.category;
    }

    public void addReview(Review r){
        // add the review stars
        restaurantStars.add(r.getStars());

        //loop on the Arraylist to calc the avg of satrs
        double sum =0;
        int count=0;
        for(Double stars:restaurantStars){
            sum+=stars;
            count++;
        }

        this.stars= sum/count;

        restaurantReviews.add(r.toString());
        System.out.println(r.toString());
//        System.out.println(this.toString());
    }

    public ArrayList viewReview(){
 return restaurantReviews;

    }

}
