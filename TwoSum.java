public class TwoSum {
    public static void main(String[] args) {
        int nums[]=new int[]{1,2,3,5,4,6};

        int target=10;
        int result[]=new int[2];
        Boolean res=false;
        

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=nums[i];
                    result[1]=nums[j];
                    res=true;
                    System.out.println("match :"+nums[i]+" "+nums[j]);
                }
            }
        }
        if(res)
            System.out.println("result numbers :"+result[0]+" "+result[1]);
        else
            System.out.println("No match found");
    }
}
