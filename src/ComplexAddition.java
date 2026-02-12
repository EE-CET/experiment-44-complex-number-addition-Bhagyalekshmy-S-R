import java.util.Scanner;

class Complex {
    int real;
    int imag;

    // Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        int realSum = this.real + c.real;
        int imagSum = this.imag + c.imag;
        return new Complex(realSum, imagSum);
    }
}

public class ComplexAddition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first complex number
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        // Input second complex number
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        // Create objects
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        // Add complex numbers
        Complex result = c1.add(c2);

        // Output
        System.out.println(result.real + " + " + result.imag + "i");

        sc.close();
    }
}

