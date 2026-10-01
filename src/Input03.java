import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scanner = new Scanner(System.in);

        //Find and print the sum of three integers entered by the user
        System.out.print("Enter value (1/3): ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter value (2/3): ");
        int secondNumber = scanner.nextInt();
        
        System.out.print("Enter value (3/3): ");
        int thirdNumber = scanner.nextInt();

        System.out.println(firstNumber + secondNumber + thirdNumber);
        
        
        //Remember to close the Scanner
        scanner.close();
    }
}
