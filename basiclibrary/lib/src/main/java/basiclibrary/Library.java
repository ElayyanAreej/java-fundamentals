/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args){

        // calling roll function and save the return array
        int[] arryOfRollsDice=roll(5); // 5 number >>> u roll the dice
        for(int i=0;i<arryOfRollsDice.length;i++){
            System.out.print(arryOfRollsDice[i]+" ");
        }

        System.out.println("");

        // calling ContainsDuplicates function
        System.out.println("rolls values duplicate : "+ContainsDuplicates(arryOfRollsDice));


        // calling  calculateAverages function
        System.out.println("rolls values Average  : "+calculateAverages(arryOfRollsDice));


        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };


        int[] arryOfTheLowestAvg= lowestArrayAverage(weeklyMonthTemperatures);
        for(int i=0;i< arryOfTheLowestAvg.length;i++){
            System.out.print( arryOfTheLowestAvg[i]+" ");
        }

    }

    ///////////////////////////////////////////////////////////////////////////////

    public static int[] roll(int n){
        // n number rolls the dice
        // every time we roll it will get a random num 1-6
        ArrayList<Integer> valuesOfRollsDice= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            //(int) (Math.random()*(maximum - minimum))) + minimum
            int randomNum=(int)(Math.random()*5)+1;
            valuesOfRollsDice.add(randomNum);
        }

        // normal array to return it with the function
        int[] arryvaluesOfRollsDice=new int[valuesOfRollsDice.size()];
        for(int i=0;i<valuesOfRollsDice.size();i++){
            arryvaluesOfRollsDice[i]=valuesOfRollsDice.get(i);
        }
        return arryvaluesOfRollsDice;
    }
    ///////////////////////////////////////////////////////////////////////////////
    // check an array if it containes duplicate values
    public static boolean ContainsDuplicates(int[] arr) {
        // we should test each item with all of others
        boolean dublicate = false;
        for (int y = 0; y < arr.length; y++) {  // to loop over items (index) one by one
            for (int i = 0; i < arr.length; i++) {  // to loop the one item with all of others
                if (i == y) {
                    i++;
                } else if (arr[i] == arr[y]) {
                    dublicate = true;
                    break;
                }
            }

        }
        return dublicate;
    }

///////////////////////////////////////////////////////////////////////////////

    public static double calculateAverages(int[] arr){
        double avg;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        avg=(double) ((double)sum/(double)arr.length);
        return avg;
    }
    ///////////////////////////////////////////////////////////////////////////////
//    Given an array of arrays calculate the average
//        value for each array and return the array with the lowest average.

    public static int[] lowestArrayAverage(int[][] arrays) {
        // asuome that it is the lowest one
        int[] subArray=arrays[0];
        double lowestAvg=calculateAverages(subArray);
        int arrIndexForTheLowest=0;

        for(int i=0;i<arrays.length;i++){// to loop over super array
//        for(int[] arr: arrays) {
            double avg=calculateAverages(arrays[i]);
            if(avg<lowestAvg){
                lowestAvg=avg;
                arrIndexForTheLowest=i;
            }
            }

        int arrLengthForTheLowest=arrays[arrIndexForTheLowest].length;
        int[] arryOfTheLowestAvg=arrays[arrIndexForTheLowest];

        return arryOfTheLowestAvg;
    }


}
