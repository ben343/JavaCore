package Chapter3;

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // Լույսի արագությունը վարկյանում 300_000 կմ:
        lightspeed = 300000;
        days = 1000; // նշում ենք օրերի քանակը։
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        // Հաշվել հեռավորությունը։
        System.out.print(+days);
        System.out.print(" օր հետո լուսը կանցնի  ");
        System.out.println(distance + " կմ․ ");
    }

}
