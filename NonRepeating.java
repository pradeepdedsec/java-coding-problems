public class NonRepeating {
    public static void main(String[] args) {
        int arr[]=new int[]{3,4,2,5,2,5,2,1,5,2,5,10,7,0,7};

        String result="";
        int i,j;

        one:
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length;j++){
                if(arr[i]==arr[j] && i!=j)
                    continue one;
            }
            if(i!=j)
                result+=(arr[i])+"  ";
        }
        System.out.println("result :"+result);
    }
}
