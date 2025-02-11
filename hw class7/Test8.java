public class Test8 {
    public static void main(String[] args) {
        int num1=11; int num2=10; int num3=14;
        int temp;
    
        // Sorting numbers using if-else
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 < num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 < num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        
        // Print numbers in descending order
        System.out.println("Numbers in descending order: " + num1 + ", " + num2 + ", " + num3);
}
    }
    

