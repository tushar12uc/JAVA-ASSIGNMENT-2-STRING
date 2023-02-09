

import java.util.ArrayList;
public class EqualsIgnoreCaseExample {
    public static void main(String[] args) {
        String str1 = "Mukesh Kumar";
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Mukesh");
        list.add("RAVI");
        list.add("MuKesH kuMar");
        list.add("Suresh");
        for (String str : list) {
            if (str.equalsIgnoreCase(str1)) {
                System.out.println("Mukesh kumar is present");
            }
        }
    }
}


//Output

//Mukesh kumar is present