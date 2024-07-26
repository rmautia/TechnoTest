package test;

import java.util.LinkedHashSet;

public class Paths {
    public static void main(String[] args) {
        String [][] paths = {{"Nairobi", "Nakuru"}, {"Nakuru", "Eldoret"}, {"Eldoret", "Kisumu"}};
        System.out.println(cities(paths));

    }

    public static String cities(String[][] paths){
        LinkedHashSet<String> journey = new LinkedHashSet<>();
        String destination = "";
        for (String[] path: paths){
            for (String city: path){
                journey.add(city);
            }
        }
        for (String city: journey){
            destination = city;
        }
        return destination;
    }


}



