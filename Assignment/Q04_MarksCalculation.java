import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            int marks = sc.nextInt();
            total = total + marks;
        }

        double percentage = total / 5.0;
        double average = total / 5.0;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage);
        System.out.println("Average = " + average);
    }
}