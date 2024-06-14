import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="pradeep";
        String str2="dperape";
        Boolean res=false;

        if(str1.length()==str2.length()){
            String s1[]=str1.split("");
            String s2[]=str2.split("");
            Arrays.sort(s1);
            Arrays.sort(s2);

            for(int i=0;i<str1.length();i++){
                if(s1[i].equals(s2[i]))
                    res=true;  
                else{
                    res=false;
                    break;
                }
            }
        }

        if(res)
            System.out.println("Given strings are Anagram");
        else
            System.out.println("Given strings are not Anagram");
    }
}

