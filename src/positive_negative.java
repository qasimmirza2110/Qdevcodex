import java.util.Scanner;
public class positive_negative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = scan.nextInt();
        scan.close();
        if(num<0){
            System.out.println("Negative Numbers");
        }
        else if(num>0){
            System.out.println("Positive Numbers");
        }
        else {
            System.out.println("Number is Zero ");
        }
    }
}
