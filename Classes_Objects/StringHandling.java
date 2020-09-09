public class StringHandling {
    public static void main(String[] args) {
        // use String Buffer class to handle in multithreading
        // StringBuilder one = new StringBuilder();
        // one.append("Hello").append(" ").append("World!!");
        // System.out.println(one.toString());

        System.out.printf("Integer: %-5d yes\n",8);
        String name = "Jackson";
        System.out.printf("String: %s\n",name);
        System.out.printf("Floating point %.1f",4.98); // the .1 notation rounds and not clips
    }
}
