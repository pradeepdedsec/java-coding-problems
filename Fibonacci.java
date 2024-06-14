public class Fibonacci {
    public static void main(String[] args) {
        int one=0;
        int two=1;
        int given=10;
        int temp;

        System.out.print(one);

        while(two<=given){
            System.out.print(" "+two);
            temp=two;
            two=one+two;
            one=temp;

            if(given==two)
                break;
        }
    }
}
