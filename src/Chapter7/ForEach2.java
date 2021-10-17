package Chapter7;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {3, 6, 87, 7, 54, 3, 345, 2, 345};
        for (int x : nums) {
            System.out.println("Знaчeниe равно: " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("Сумма пяти первых элементов равна: " + nums);
    }
}
