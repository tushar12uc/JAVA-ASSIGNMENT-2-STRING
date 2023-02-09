import java.util.Scanner;

public class StartsWith {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1.startsWith("ja"));  // true
        System.out.println(s1.startsWith("java string"));   // true
        System.out.println(s1.startsWith("Java string"));  // false as 'j' and 'J' are different
    }
}
//this is java
//        false
//        false
//        false