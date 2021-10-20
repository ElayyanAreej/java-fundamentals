package inheritance;

import java.util.ArrayList;

public class Shop implements Places{
    private String name;
    private String description;
    private String numberOfDollar;
    private double stars;

    public Shop(String name, String description, String numberOfDollar,double stars) {
        this.name = name;
        this.description = description;
        this.numberOfDollar = numberOfDollar;
        this.stars=stars;
    }
    ArrayList<String> shopReviews=new ArrayList<String>();
    ArrayList<Double> shopStars=new ArrayList<Double>();

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumberOfDollar() {
        return numberOfDollar;
    }

    public void setNumberOfDollar(String numberOfDollar) {
        this.numberOfDollar = numberOfDollar;
    }

    public String toString(){
        return  this.name + " Shop : "+ this.description ;

    }

    public void addReview(Review r){
        // add the review stars
        shopStars.add(r.getStars());

        //loop on the Arraylist to calc the avg of satrs
        double sum =0;
        int count=0;
        for(Double stars:shopStars){
            sum+=stars;
            count++;
        }

        this.stars= sum/count;

      shopReviews.add(r.toString());
        System.out.println(r.toString());
//        System.out.println(this.toString());
    }

    public ArrayList viewReview(){
        return shopReviews;

    }
}
