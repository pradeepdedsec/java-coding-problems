import java.util.HashMap;
import java.util.Map;

public class Lettercount {
    public static void main(String[] args) {
        String words[]=new String[]{"am ma","appa","anna","pradeep"};
        int current,count=0;
        boolean mid;
        String temp="",temp2="",cword;
        int i,j;
        
        Map<String,Integer> m;
        Map<String,Map<String,Integer>> result=new HashMap<String,Map<String,Integer>>();

        for(String s:words){

            m=new HashMap<String,Integer>();
            temp="";
            mid=false;

            for(j=0;j<s.length();j++){  
                current=s.charAt(j);
                count=0;
                for(i=0;i<s.length();i++){
                    if(current==s.charAt(i))
                        count++;
                }
                temp2=Character.toString(current);
                if(!(temp.contains(temp2) || current==' ')){
                    m.put(temp2, count);
                    temp+=temp2;
                    mid=true;
                }
            }
            if(mid){
                result.put(s, m);
                mid=false;
            } 
        }
        
        for(i=0;i<words.length;i++){

            cword=words[i];
            System.out.println("For : "+cword);
            temp="";

            for(j=0;j<cword.length();j++){
                temp2=Character.toString(cword.charAt(j));
                if(!(temp.contains(temp2) || temp2.equals(" "))){
                    System.out.println(cword.charAt(j)+" : "+result.get(cword).get(temp2));
                    temp+=temp2;
                }
            }
            System.out.println("---------------------------------------");
        }
    }
}
