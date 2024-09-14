import java.util.Scanner;

class Add1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers you want to add:");
        double n = sc.nextDouble();

       
        double[] numbers = newDouble[0];
        double sum = 0;

       
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            numbers[i] = sc.nextDouble();
            sum += numbers[i]; 
        }

        
        System.out.println("Sum: " + sum);
    }
}
