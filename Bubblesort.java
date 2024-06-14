public class Bubblesort {
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,10,6,0,3,7,9,3,1,3,6,22,19,2,6,4,3,8,9,0};

        int temp;
        int swaps;
        int p1=0,p2=1;
        
        while(p1<arr.length && p2<arr.length){
            swaps=0;
            while(p2<arr.length){
                if(arr[p1]>arr[p2] && p1!=p2){
                    temp=arr[p2];
                    arr[p2]=arr[p1];
                    arr[p1]=temp;
                    swaps++;
                    p2=p1+1;
                }
                else
                    p2+=1;
            }
            if(swaps!=0){
                p1+=1;
                p2=p1+1;
            }  
        }
        for(int s:arr)
            System.out.print(s+"  ");
    }
}
