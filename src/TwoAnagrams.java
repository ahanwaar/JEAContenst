import java.util.*;
import java.io.*;
public class TwoAnagrams {
    /*
     * Complete the 'anagrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */
    public static String anagrams(String s1, String s2) {
        // return "YES" if s1 and s2 are anagrams and return "NO" otherwise
        // return "YES" if s1 and s2 are anagrams and return "NO" otherwise
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        String ans = null;

        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) {
            ans = "NO";
        } else {
            Arrays.sort(str1);
            Arrays.sort(str2);

            for (int i = 0; i < n1; i++) {
                if (str1[i] != str2[i]) {
                    ans = "NO";
                    break;
                } else ans = "YES";
            }
        }
        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();

        s1 = s1.replaceAll("\\s", "");
        s2 = s2.replaceAll("\\s", "");

        String t = anagrams(s1, s2);

        bufferedWriter.write(t);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

