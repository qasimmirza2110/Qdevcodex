import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        scan.close();
        String rev="";
        for(int  i = str.length()-1;i>=0;i--){
            rev=rev +str.charAt(i);

        }
        System.out.println(rev);
    }
}
