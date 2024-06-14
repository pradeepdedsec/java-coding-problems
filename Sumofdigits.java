public class Sumofdigits {
    public static void main(String[] args) {
        int value=12345;
        int sod=0;

        while(value!=0){
            sod+=value%10;
            value/=10;
        }
        System.out.println("Sum Of Digits :"+sod);
    }
}
