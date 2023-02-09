import java.util.Scanner;

public class Split {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);
        }
    }
}
//this is a white space
//        this
//        is
//        a
//        white
//        space
