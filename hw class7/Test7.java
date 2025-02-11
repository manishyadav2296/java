public class Test7 {
    public static void main(String[] args) {
        // Given three numbers
        int num1 = 25, num2 = 50, num3 = 75;
        
        // Find the least number using if-else
        int least;
        
        if (num1 < num2 && num1 < num3) {
            least = num1;
        } else if (num2 < num1 && num2 < num3) {
            least = num2;
        } else {
            least = num3;
        }
        
        // Print the least number
        System.out.println("The least number is: " + least);
    }
}


