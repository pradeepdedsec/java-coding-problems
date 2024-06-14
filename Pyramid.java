public class Pyramid {
    public static void main(String[] args) {
        int star=5;
        int space=star-1;

        for(int i=1;i<=star;i++,space--)
            System.out.println(" ".repeat(space)+"* ".repeat(i));
    }
}
