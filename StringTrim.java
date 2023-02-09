import java.util.Scanner;

public class StringTrim {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(s1+"javatpoint");//without trim()
        System.out.println(s1.trim()+"javatpoint");//with trim()
    }
}
//        this is java
//        this is javajavatpoint
//        this is javajavatpoint
