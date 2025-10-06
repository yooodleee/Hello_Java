public class DecimalToOctalManual {
    public static void main(String[] args) {
        int decimal = 816;
        String octal = "";

        int num = decimal;
        while (num > 0) {
            int remainder = num % 8; // remainder(0 ~ 7)
            octal = remainder + octal;
            num = num / 8; // num /= 8;
        }

        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
    }
}

// output:
/*
Decimal: 816
Octal: 1460
 */