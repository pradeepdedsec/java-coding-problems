public class Wordcount {
    public static void main(String[] args) {
        String str="hello    bro  how      are           you    ";
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
                temp+=str.substring(wst,str.charAt(i)==' '?i:i+1);
        }

        String res[]=temp.split(" ");

        for (int i=0;i<res.length;i++) {
            if(i==res.length-1)
                System.out.print(res[i]+" : "+res.length);
            else
                System.out.print(res[i]+",");
        }
    }
}
