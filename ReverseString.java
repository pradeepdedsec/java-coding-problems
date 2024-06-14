public class ReverseString {
    public static void main(String[] args) {
        String s="teststring";

        String res="";

        for(int i=s.length()-1;i>-1;i--)
            res=res+s.charAt(i);

        System.out.println("result :"+res);
    }
}
