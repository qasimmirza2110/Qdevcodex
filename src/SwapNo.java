import java.util.Scanner;
public class SwapNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two Number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        System.out.println("Before swap "+num1+" "+num2);
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swap "+num1+" "+num2);
    }
}
