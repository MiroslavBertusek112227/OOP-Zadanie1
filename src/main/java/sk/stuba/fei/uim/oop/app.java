package sk.stuba.fei.uim.oop;

public class app {
    public static void main(String[] args) {
        System.out.println("hello world");
        int c = porovnanie(0, 0);
        System.out.println(c);
    }
    public static int porovnanie(int a, int b) {
        int c = 0;
        if (a > b) {
            c=1;
        } else if (a==b) {
            c=0;
        } else {
            c=-1;
        }
        return c;
    }
}
