import java.util.Scanner;

public class ReplaceAll {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String replaceString = s1.replaceAll("a", "e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString);
    }
}
// Output: geeksforgeeks is better then jevetpoint