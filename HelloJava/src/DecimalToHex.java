public class DecimalToHex {
    public static void main(String[] args) {
        int decimal = 1615;
        String hex = Integer.toHexString(decimal);

        System.out.println("Decimal: " + decimal);
        System.out.println("Hex: " + hex);
    }
}

// output:
/*
Decimal: 1615
Hex: 64f
 */