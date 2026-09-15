import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int units = sc.nextInt();
        int bill;

        if (units <= 100) {
            bill = units * 5;
        }
        else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        }
        else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Bill = " + bill);
    }
}