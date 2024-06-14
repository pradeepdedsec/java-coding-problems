public class Vowel {
    public static void main(String[] args) {
        String target="f";

        if("aeiou".contains(target))
            System.out.print(target+" is a vowel");
        else
            System.out.print(target+" is a consonant");
    }
}
