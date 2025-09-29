import java.util.*;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        // int num = scanner.nextInt();

        System.out.println("The input number is " + input);
        System.out.printf("num=%d%n", num);
    }
}

// output:
/*
Case 1
Enter a string: 22
The input number is 22
num=22

Case 2
Enter a string: abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:564)
	at java.base/java.lang.Integer.parseInt(Integer.java:661)
	at ScannerEx.main(ScannerEx.java:9)

Case 3
Enter a string:
Exception in thread "main" java.lang.NumberFormatException: For input string: " "
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:564)
	at java.base/java.lang.Integer.parseInt(Integer.java:661)
	at ScannerEx.main(ScannerEx.java:9)

Case 4
Enter a string: +
Exception in thread "main" java.lang.NumberFormatException: For input string: "+"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:564)
	at java.base/java.lang.Integer.parseInt(Integer.java:661)
	at ScannerEx.main(ScannerEx.java:9)
 */
