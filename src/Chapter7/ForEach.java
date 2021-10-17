package Chapter7;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {2, 67, 89, 9, 67, 54, 3, 43};
        int sum = 0;
        for (int x : nums) {
            System.out.println("Знaчeниe равно " + x);
            sum += x;
        }
    }
}
