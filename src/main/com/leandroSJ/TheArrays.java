package main.com.leandroSJ;
import java.util.Arrays;


public class TheArrays {
    public static void main(String [] args){
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));
    }
}
