import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int k = Integer.parseInt(bufferedReader.readLine().trim());
        int[] array = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "")
                .split(" "))
                .mapToInt(Integer::parseInt).toArray();

        // your code starts here
        int[] a = new int[n];
        for (int i = 0; i < array.length; i++) {
            a[(i + k) % n] = array[i];
        }
        for (int i = 0; i < n; i++) {
            array[i] = a[i];
        }

        for(int i =0;i < (n) ; i++ ){
            System.out.print(array[i]+" ");
        }

        bufferedReader.close();
    }
}