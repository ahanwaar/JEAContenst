import java.util.*;
public class CommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        String ans ="NO";
        int c=0;

        for (int i = 2 ; i< 100000 ; i++){
            if (c == n){
                ans ="YES";
                break;
            }else{
                c = 0;
                for (int j =0; j<n; j++){
                    if(arr[j]% i == 0){
                        c++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}