public class DecimalToHexManual {
    public static void main(String[] args) {
        int decimal = 1615;
        String hex = "";

        int num = decimal;
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7',
                           '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (num > 0) {
            int remainder = num % 16;
            hex = hexChars[remainder] + hex;
            num = num / 16;     // num /= 16;
        }

        System.out.println("Decimal: " + decimal);
        System.out.println("Hex: " + hex);
    }
}

// output:
/*
Decimal: 1615
Hex: 64F
 */