import java.util.*;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N: ");
        int num = input.nextInt();

        int sum = 0;

        for(int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
