package practice_basic_day04;

import java.util.Arrays;

public class Me01 {
    /*
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini bulun )
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
    public static void main(String[] args) {

        int arr[]={2,6,4,5,8,9};

        String output="";

        for (int i = 0; i < arr.length; i++) {

            output+=arr[i]*arr[i]+" ";


        }
        System.out.println(output);








    }
}