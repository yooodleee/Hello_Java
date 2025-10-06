public class DecimalToBinaryManual {
    public static void main(String[] args) {
        int decmial = 46;
        String binary = "";

        int num = decmial;
        while (num > 0) {
            int remainder = num % 2;    // remainder(0 or 1)
            binary = remainder + binary;
            num = num / 2;  // num /= 2
        }

        System.out.println("Decimal: " + decmial);
        System.out.println("Binary: " + binary);
    }
}

// output:
/*
Decimal: 46
Binary: 101110
 */