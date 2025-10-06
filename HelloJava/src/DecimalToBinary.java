public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 46;
        String binary = Integer.toBinaryString(decimal);    // inner function(toBinaryString)

        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
    }
}

// output:
/*
Decimal: 46
Binary: 101110
 */