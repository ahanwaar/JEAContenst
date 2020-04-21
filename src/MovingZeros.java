import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MovingZeros {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int[] array = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] arr = new int[n];
        int count = 0;
        int j =0;
        for(int i = 0; i < n; i++){
            if(array[i] == 0){
                count++;
                arr[n-count]=array[i];
            }else if(array[i] != 0){
                arr[j]=array[i];
                j++;
            }
        }

        for(int i =0; i < n ; i++){
            System.out.print(arr[i]+" ");
        }
        bufferedReader.close();
    }
}
