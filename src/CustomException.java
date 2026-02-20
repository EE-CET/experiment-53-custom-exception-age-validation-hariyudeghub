
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
// TODO: Create class InvalidAgeException extends Exception
// Create a constructor that accepts a message string and passes it to super(message)
public class CustomException {
    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Not Eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        try{
            validate(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
    
    // TODO: Create a static method validate(int age) that throws InvalidAgeException
    // Check if age < 18, throw new InvalidAgeException("Not eligible to vote")
    // Else print "Eligible to vote"
        // TODO: Read age
        
}
