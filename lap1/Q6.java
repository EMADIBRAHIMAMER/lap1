public class Q6 {
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("emad  amer");
        System.out.println(s1.charAt(0));

        System.out.println(s1.charAt(9));

        s1.deleteCharAt(0);

        s1.deleteCharAt(8);

        System.out.println(s1);
    }

}
