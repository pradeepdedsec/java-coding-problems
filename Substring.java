public class Substring {
    public static void main(String[] args) {
        String s="hello buddy buddy";
        String o="buddy";
        String n="bro";
        String temp="";
        int ostart,oend;

        one:
        for(int i=0;i<s.length() && o.length()>0;i++){
            if(o.charAt(0)==s.charAt(i)){
                for(int j=i,k=0;j<s.length() && k<o.length();j++,k++){
                    if(!(s.charAt(j)==o.charAt(k)))
                        continue one;
                }
                ostart=i;
                oend=i+o.length()-1;
                for(int l=0;l<s.length();l++){
                    if(l==ostart){
                        for(int m=0;m<n.length();m++)
                            temp+=n.charAt(m);
                        l=oend; 
                    }
                    else
                        temp+=s.charAt(l);
                }
                s=temp;
                temp="";
            }
        }
        System.out.println("Replaced String :"+s);
    }
}
