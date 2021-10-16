package Chapter7;

public class MissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 13; i++)
            switch (i) {
                case 0:
                case 1:
                case 3:
                case 4:
                    System.out.println("i փոքր է 5 ");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i փոքր է 10 ");
                    break;
                default:

            }
        System.out.println("i հավասար է կամ մեխ է 10 ից ");
    }
}
