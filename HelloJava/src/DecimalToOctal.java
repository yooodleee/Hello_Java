public class DecimalToOctal {
    public static void main(String[] args) {
        int decimal = 816;
        String octal = Integer.toOctalString(decimal);

        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
    }
}

// output:
/*
Decimal: 816
Octal: 1460
 */