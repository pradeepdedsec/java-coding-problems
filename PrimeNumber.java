public class PrimeNumber {
    public static void main(String[] args) {
        int target=4;
        Boolean prime=false;

        if(target==2 || target==3)
            prime=true;

        for(int i=2;i<target/2;i++){
            if(target%i!=0){
                prime=false;
                break;
            }
            else
                prime=true;
        }

        if(prime)
            System.out.println(target+" is a prime number");
        else    
            System.out.println(target+" is not a prime number");
    }
}
