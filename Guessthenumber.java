import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int my_number = (int) (Math.random() * 100);

        int user_number;

        do {
            System.out.println("Guess the number:");
            user_number = sc.nextInt();

            if (user_number == 0) {
                System.out.println("My number is: " + my_number);
                break;
            } else if (user_number == my_number) {
                System.out.println("Correct");
                break;
            } else if (user_number > my_number) {
                System.out.println("My number is smaller");
            } else {
                System.out.println("My number is greater");
            }
        } while (user_number >= 0);

        sc.close();
    }
}
