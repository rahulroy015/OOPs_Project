import java.util.Scanner;

class Palindrome {

    public static void main(String args[]) {
        String str;
        String rev = "";
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        
        int length = str.length();
        for (int i = length - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        
        if (str.equals(rev)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}