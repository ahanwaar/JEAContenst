import java.io.*;
import java.util.*;

public class CountMissingNumbers {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] array = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // your code starts here
        int count=0;
        Arrays.sort(array);
        int length = array[array.length-1]-array[0];
        int[] array2 = new int[length+1];
        array2[0] =array[0];
        for(int i =1 ; i < array2.length ; i++) {
            array2[i] = array2[i - 1] + 1;
        }
        System.out.println(array2.length-array.length);



        bufferedReader.close();
    }
}