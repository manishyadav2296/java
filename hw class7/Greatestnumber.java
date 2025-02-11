public class Greatestnumber {
    import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three numbers
        System.out.print("10: ");
        int num1 = scanner.nextInt(10);
        System.out.print("20: ");
        int num2 = scanner.nextInt(20);
        System.out.print("30: ");
        int num3 = scanner.nextInt(30);

        // Finding the greatest number
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Printing the greatest number
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    
}

    

