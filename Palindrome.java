public class Palindrome {
    public static void main(String[] args) {
        String s="madam";

        String rev="";

        for(int i=s.length()-1;i>-1;i--)
            rev=rev+s.charAt(i);
        
        if(s.equals(rev))
            System.out.print("The given String is palindrome");
        else
            System.out.print("The given String is not a palindrome");    
    }
}
