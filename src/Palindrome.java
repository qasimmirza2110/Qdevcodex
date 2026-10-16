import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine();
        scan.close();
        boolean isPalindrome = true;
        for(int i = 0 ; i<str.length()/2;i++){
            if(Character.toLowerCase(str.charAt(i))!=(Character.toLowerCase(str.charAt(str.length()-1-i)))){
                isPalindrome = false;
            break;
            }
        }
        if (isPalindrome){
            System.out.println(str+" is a palindrome");
        }
        else {

            System.out.println(str+" is not  a palindrome");
        }
    }
}
