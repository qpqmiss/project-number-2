import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть по черзі: ціле число, дробове (з комою), слово, true/false");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.next();
        boolean b = scan.nextBoolean();

        System.out.println("\n--- Результат ---");

        // Спосіб 1: println
        System.out.println("1. Все разом: " + i + " " + d + " " + s + " " + b);

        // Спосіб 2: printf
        System.out.printf("2. Int: %d \n", i);
        System.out.printf("3. Hex: %x \n", i);
        System.out.printf("4. Octal: %o \n", i);
        System.out.printf("5. Double (2 знаки): %.2f \n", d);
        System.out.printf("6. Науковий: %e \n", d);
        System.out.printf("7. String (ширина): %10s \n", s);
        System.out.printf("8. Upper: %S \n", s);

        // Спосіб 3: String.format
        System.out.println(String.format("9. Boolean: %b", b));
        System.out.println(String.format("10. Мікс: %d та %.1f", i, d));
    }
}