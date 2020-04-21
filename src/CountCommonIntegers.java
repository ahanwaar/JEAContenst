import java.util.*;
import java.io.*;

public class CountCommonIntegers {
    static int common(int ar1[], int ar2[], int ar3[]){
        Arrays.sort(ar1); Arrays.sort(ar2); Arrays.sort(ar3);
        int count =0, i = 0, j = 0, k = 0;

        while (i < ar1.length && j < ar2.length && k < ar3.length){
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]){
                count++;
                i++; j++; k++;
            }else if (ar1[i] < ar2[j]) {
                i++;
            }else if (ar2[j] < ar3[k]) {
                j++;
            }else{
                k++;
            }
        } return count;
    }

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] A = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] C = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .mapToInt(Integer::parseInt).toArray();



        System.out.println(common(A,B,C));

        bufferedReader.close();
    }
}
