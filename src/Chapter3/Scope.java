package Chapter3;

public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) ;
        {
            int y = 20;
            System.out.println("x և y: " + x + " " + y);
            x = y * x;
        }
        System.out.println("x havasar " + x);

    }
}