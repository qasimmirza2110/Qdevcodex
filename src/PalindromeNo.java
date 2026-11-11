import java.util.Scanner;
public class PalindromeNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.close();
        int original = num ;
        int rev = 0;
        while(num!=0){
            int digit = num %10;
            rev = rev *10+digit;
            num = num/10;
        }
        if (original==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
        }
}
