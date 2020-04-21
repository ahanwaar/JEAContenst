import java.util.HashMap;
import java.util.Scanner;

public class CountUniqueIntegers {
    public static int countUniques(int[] arr){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }else {
                mp.put(arr[i], 1);
            }
        }
        for(int i = 0; i < n; i++){
            if(mp.get(arr[i]) == 1){
                count++;
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int s = 0;

        for(int i =0; i < n; i++){
            s += input.nextInt();
        }

        int[] array = new int[s];
        for(int i =0; i < s; i++){
            array[i] = input.nextInt();
        }

        input.close();
        int u = countUniques(array);
        System.out.println(u);
    }
}
