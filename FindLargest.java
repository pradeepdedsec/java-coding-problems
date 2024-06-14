public class FindLargest {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,6,3,12,8,4,7,9,4,3,2};

        if(arr.length>0){
            int res=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>res){
                    res=arr[i];
                }
            }

            System.out.print("Largest Number :"+res);
        }
        else
            System.out.print("given array is empty");
    }
}
