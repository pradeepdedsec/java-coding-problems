public class LargestandSmallest {
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,6,3,7,9,3,3,6,22,19,6,4,3,8,9};

        int min=arr[0],max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }

        System.out.println("min :"+min+"\nmax :"+max);
    }
}
