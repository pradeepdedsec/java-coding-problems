public class Reversewords {
    public static void main(String[] args) {
        String str="hello    bro  how      are           you ";
        String temp="";
        int wst=0;
        char current='w';
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && current=='w'){
                temp+=str.substring(wst, i)+" ";
                current='s';
            }
            if(str.charAt(i)!=' ' && current=='s'){
                wst=i;
                current='w';
            }
            if(str.charAt(i)!=' ' && i==str.length()-1)
            temp+=str.substring(wst, i==' '?i:i+1);
        }

        String result[]=temp.split(" ");
        int one=0,two=result.length-1;
        
        while(one!=two){
            temp=result[one];
            result[one]=result[two];
            result[two]=temp;
            one++;
            two--;
        }

        System.out.print("result : ");
        for (int i=0;i<result.length;i++) 
            System.out.print(result[i]+" ");
    }
}
