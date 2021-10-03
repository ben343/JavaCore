package Chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        // հաջորդ քայլով ստիպում ենք  որ int i ի արծեքը տեղավորի bytew ի մեջ
        // և նույն տրամաբանությամբ շարունակում
        b = (byte) i;
        System.out.println("i ev b " + i + " " + b);
        i = (int) d;
        System.out.println("d ev i " + d + " " + i);
        b = (byte) d;
        System.out.println("d eb b " + d + " " + b);
    }
}
