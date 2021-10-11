import java.lang.Math;  
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  


import java.time.LocalTime;

public class Main{
  public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);
    int dogCount=1;

System.out.println("I own " + dogCount + " " + Pluralize("dog",dogCount) + ".");

 int catCount = 2;
System.out.println("I own " + catCount + " " + Pluralize("cat", catCount) + ".");

 int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + Pluralize("turtle", turtleCount) + ".");

flipNHeads(3);

clock();

// double randomNumber=Math.random();
// System.out.println("1st Random Number: " + randomNumber);  
// // Math.round()
// System.out.println("Math.round() " + Math.round(randomNumber));  

    // int x = 7;
    // float f = 42.3f;
    // double d = 42.3;

    // // execute the function called "loopTo" and pass 10 as a parameter
    // loopTo(10);

    // int four = 4;
    // int result = multiplyByTwo(four);
    // System.out.println(four + " doubled is " + result);
  }

  // Functions that return nothing have a return type of "void"
  public static void loopTo(int max) {
    for (int i = 0; i < max; i++) {
      System.out.println("Loop #" + i);
    }
  }

  // This function has a return type of "int"
  public static int multiplyByTwo(int n) {
    return n * 2;
  }

  public static String Pluralize(String word, int number ){
if(number==1)
return word;
else
return word+'s';
  }

public static void flipNHeads(int n){

int headN=n;//3
int countHeadN=0;
int flip=0;

while(countHeadN<headN){

 double randomNumber=Math.random();

 if(Math.round(randomNumber)==0)
 {
 System.out.println("tail");
 countHeadN=0;
 }
 else{
 System.out.println("head");
countHeadN=countHeadN+1;
}

flip=flip+1;
}
System.out.println("It took "+ flip + " flip to flip "+ headN + " head in a row.");

}

public static void clock(){
// LocalTime time = LocalTime.now();
// System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
// LocalTime time2 = LocalTime.now();
long lastSec = 0;
while(true){
    long sec = System.currentTimeMillis() / 1000;
    if (sec != lastSec) {
    LocalTime time = LocalTime.now();
System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
       lastSec = sec;
    }//If():
}//While

}
//   while(true){
// // System.out.println(java.time.LocalTime.now()); 


//   }
}

