import java.util.Scanner;

public class ExcelFormat {
    private static void printString(int Number) {
        StringBuilder str = new StringBuilder();

        while (Number > 0) {
            int rem = Number % 26;

            if (rem == 0) {
                str.append("Z");
                Number = (Number / 26) - 1;
            }else{
                str.append((char)((rem - 1) + 'A'));
                Number = Number / 26;
            }
        }
        System.out.println(str.reverse());
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int[] nums = new int[T];
        for(int i =0; i<T ; i++){
            nums[i]=input.nextInt();
        }
        for (int i =0 ; i<T ; i++){
            printString(nums[i]);
        }
    }
}
