package Chapter3;

public class FigurePainter {
    public static void main(String[] args) {
        //Տնային աշխատանք
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Տնային աշխատանք 2
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        //Տնային աշխատանք 3
        System.out.println();
        for (int i = 4; i > 0; i--) {
            for (int c = i; c > 0; c--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}








