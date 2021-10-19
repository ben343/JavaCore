package Array1;

public class Array {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a' };
// Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մասիվի մեջ
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char c = bolola[i];
            if (c == 'o') {
                count++;
            }
        }
        System.out.println(count);
        System.out.println();
//գրում ենք կոդ, որըկտպի  մեջտեղի 2 սինվոլները
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a' };
        for (int i = 0; i < bolola1.length; i++) {
            if (i == bolola1.length / 2) {
                System.out.println(bolola1[i - 1] + " " + bolola1[i]);
            }
        }

        System.out.println(bolola[bolola1.length / 2 - 1]);
        System.out.println(bolola[bolola1.length / 2 - 2]);
        System.out.println();
//տպում ենք true եթե մեր մասիվը վերջանում է 'l' կամ  'y'-ով
        char[] bolola3 = {'b', 'o', 'l', 'o', 'l', 'a' };
        boolean c = false;
        for (int i = 0; i < bolola3.length; i++) {
            if (bolola3[bolola3.length - 1] == 'l' || bolola3[bolola3.length - 1] == 'y') {
                c = true;
            }
        }
        System.out.println(c);
        System.out.println();
//Տպում ենք true եթե տեքստը պարունակում է bob բառը

        char[] bolola2 = {'b', 'a', 'b', 'o', 'l', 'a' };
        boolean a = false;
        for (int i = 0; i < bolola2.length; i++) {
            if (bolola1[i] == 'b') {
                if (bolola2[i] == bolola2[i + 2]) {
                    a = true;
                }
            }
        }
        System.out.println(a);
        System.out.println();
        //Դասավորել մասիվը փոքրից մեծ
        int[] array = {89, 4, 87, 3, 2, 90, 1, 65, 12, 76, 54};

        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
    }
}













