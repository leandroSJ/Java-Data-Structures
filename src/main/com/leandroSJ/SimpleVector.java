package main.com.leandroSJ;

public class SimpleVector {
    public static void main(String[] args){
        int numbers[] = new int[5];

        numbers[0] = 5;
        numbers[1] = 3;
        numbers[2] = 7;
        numbers[3] = 10;
        numbers[4] = 33;

        for(int i=0; i< numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
