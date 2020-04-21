import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double countZero = 0;
        double countPositive = 0;
        double countNegative = 0;

        for(int i = 0; i < arr.length ; i++){
            if(arr[i] == 0){
                countZero++;
            }else if (arr[i] > 0){
                countPositive++;
            }else{
                countNegative++;
            }
        }
        double positive =countPositive/arr.length;
        double negative = countNegative/arr.length;
        double zero = countZero/arr.length;
        System.out.print(positive + "\n"+ negative +"\n" + zero);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}