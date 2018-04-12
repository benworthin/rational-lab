import java.util.Scanner;

public class lab09avst {

    static int num, den;

    public static void main(String[] args) {

        enterData();

        Rational r = new Rational(num, den);

        r.displayData();

    }

    public static void enterData() {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = keyboard.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = keyboard.nextInt();

    }

}
