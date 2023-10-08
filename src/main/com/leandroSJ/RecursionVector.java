package main.com.leandroSJ;

public class RecursionVector {
    public static void Recursion(int i) {
        System.out.println(i);
        if (i == 0) return;
        else {
            Recursion(i - 1);
        }

    }
    public static void main(String[] args){
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        Recursion(10);
    }
}