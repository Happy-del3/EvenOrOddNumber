public class EvenOrOddNumber {
 
    public static void main(String[] args) {
        // Declare variables 
        int number;
        
        // Instantiate --> Create the Scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        // Prompt for user to enter the number
        System.out.print("Please enter the number: ");
        
        // Read the integer from the keyboard, and store it in the number
        number = input.nextInt();
        
        // Check if the number is even or odd
        if(number % 2 == 0){
            // Display number if its an even
            System.out.println(number + " is an even number.");
        }else{
            // Display number if its an odd
            System.out.println(number + " is an odd number.");
        }
    }
    
}
