import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic_Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] nums = new int[T];
        for(int i =0; i<T ; i++){
            nums[i]=input.nextInt();
        }

        String ans = "YES";
        Arrays.sort(nums);
        int diff = nums[1] - nums[0];

        for(int i = 0; i < nums.length -1; i++) {
            if(nums[i+1] - nums[i] != diff){
            ans = "NO";
            break;
            }
        }
        System.out.println(ans);
    }
}
