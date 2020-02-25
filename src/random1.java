import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class random1 {
    public static void main(String[] args) {
        String sentence = "flap jack are awesome!";

        Scanner metro = new Scanner( sentence );

     //  String sentence = "flap jack are awesome!";

        ArrayList<String> words = new ArrayList<String>();

        words.add("dopp");
        words.add("cop");
        words.add("poris");


        while(metro.hasNext()){
           words.add(metro.next());


 }

       System.out.println( words );

         }
    }
