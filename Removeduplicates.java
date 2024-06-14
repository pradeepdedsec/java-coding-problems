public class Removeduplicates {
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,6,3,7,9,3,3,6,22,19,6,4,3,8,9};
        String res="";

        for(int i=0;i<arr.length;i++){
            if(!(res.contains(arr[i]+"")))
                res+=arr[i]+",";
        }

        String temp[]=res.split(",");
        int result[]=new int[temp.length];

        for(int i=0;i<result.length;i++)
            result[i]=Integer.valueOf(temp[i]);

        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+"  "); 
    }
}
