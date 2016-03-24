import java.util.*;

public class PrintCharacterTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        while(num > 26 || num < 1) {
            num = input.nextInt();
        }

        for(int i = 0; i < num; i++) {
            char size = (char)('a'+i);
            for(char j = 'a'; j < size; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for(int k = num; k > -1; k--) {
            char size = (char)('a'+k);
            for(char p = 'a'; p < size; p++) {
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
