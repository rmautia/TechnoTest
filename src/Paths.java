import java.util.*;

public class Paths {


    public static String uniquePath(String [][] paths){
        String unique = "";
        for (String [] s : paths) {
            for (int i = 0; i <=3; i++) {
                boolean equal = s[i].equals(s[i]);

                if (!equal){
                    continue;
                }else {
                    unique = s[i];
                }
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        String [][] paths = {{"kl", "pl"}, {"pl", "tl"}, {"tl", "ml"}};
        System.out.println(uniquePath(paths));
    }
}



