import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        if(num<=0){
            System.out.println("Invalid Number");
            return;
        }
        int first = 0 , second = 1;
        System.out.println("Fibonacci Series: ");
        if(num==0){
            System.out.print(first);
            return;
        }
        System.out.print(first+" "+ second);
        for(int i =3 ;i<=num;i++){
            int next = first + second;
            System.out.print(" "+next);
            first=second;
            second = next;
        }
    }
}
