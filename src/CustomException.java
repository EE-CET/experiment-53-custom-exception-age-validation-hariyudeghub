import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomException {

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        try {
            validate(age);
            System.out.print("Eligible to vote");
        } catch (InvalidAgeException e) {
            System.out.print("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
