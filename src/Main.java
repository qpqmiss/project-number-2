import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Byte: " + Byte.SIZE + " біт, Мін: " + Byte.MIN_VALUE + ", Макс: " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.SIZE + " біт, Мін: " + Short.MIN_VALUE + ", Макс: " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.SIZE + " біт, Мін: " + Integer.MIN_VALUE + ", Макс: " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.SIZE + " біт, Мін: " + Long.MIN_VALUE + ", Макс: " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.SIZE + " біт, Мін: " + Float.MIN_VALUE + ", Макс: " + Float.MAX_VALUE);
        System.out.println("Double: " + Double.SIZE + " біт, Мін: " + Double.MIN_VALUE + ", Макс: " + Double.MAX_VALUE);

        Scanner scan = new Scanner(System.in);
        String text;

        System.out.println("\nВведіть ціле число (int):");
        text = scan.nextLine();
        int myInt = Integer.parseInt(text);
        System.out.println("Ви ввели int: " + myInt);

        System.out.println("\nВведіть дробове число (double):");
        text = scan.nextLine();
        double myDouble = Double.parseDouble(text);
        System.out.println("Ви ввели double: " + myDouble);

        System.out.println("\nВведіть true або false (boolean):");
        text = scan.nextLine();
        boolean myBool = Boolean.parseBoolean(text);
        System.out.println("Ви ввели boolean: " + myBool);

        scan.close();
    }
}