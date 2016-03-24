import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.*;
import java.util.Locale.Category;

public class GetAverage {
    public static void average(double a, double b, double c) {
        double avg = (a+b+c)/3;
        System.out.printf("%.2f", avg);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        double a = input.nextDouble();
        System.out.print("Enter B: ");
        double b = input.nextDouble();
        System.out.print("Enter C: ");
        double c = input.nextDouble();

        average(a,b,c);
    }
}
