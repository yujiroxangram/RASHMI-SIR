public class DoWhileDemo {

    public static void main(String[] args) {
        String str = "ahaa";
        int i = 0;
        do {
            System.out.println(str.charAt(i));
            i++;
        } while (i < str.length());
    }
}
