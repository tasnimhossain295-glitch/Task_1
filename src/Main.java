import java.util.Scanner;

public class Main {
    // int মানের জন্য মেথড
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    // double মানের জন্য ওভারলোডেড মেথড
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // উদাহরণ টেস্ট (int)
        int intArea = calculateArea(5, 4);
        System.out.println("Area (int): " + intArea);

        // উদাহরণ টেস্ট (double)
        double doubleArea = calculateArea(5.5, 4.2);
        System.out.println("Area (double): " + doubleArea);

        scanner.close();
    }
}