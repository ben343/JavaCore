package Chapter7;

public class NoChange {
    public static void main(String[] args) {
        int nums[] = {5, 6, 98, 98, 65, 34, 8, 34, 2, 67, 4, 0};
        for (int x : nums) {
            x = x * 10;
        }
        System.out.println();
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
