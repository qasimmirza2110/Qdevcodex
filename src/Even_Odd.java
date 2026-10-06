import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scan.nextInt();
        scan.close();
        if(num%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number ");
        }
    }
}
