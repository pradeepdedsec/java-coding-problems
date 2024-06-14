public class Armstrong {
    public static void main(String[] args) {
        int target=153;

        String temp[]=String.valueOf(target).split("");
        int res=0;
        int pow=temp.length;

        for(int i=0;i<temp.length;i++)
            res+=Math.pow(Integer.parseInt(temp[i]), pow);

        if(target==res)
            System.out.print(target+" is Armstrong Number");
        else    
            System.out.print(target+" is not Armstrong Number");
    }
}

//vowel ,largest and smallest ,bubble sort
