public class Factorial {

    public static int fact(int n){
        if(n==1 || n==0)
            return n;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println("FACTORIAL :"+fact(0));
    }
}
