public class SpecialCharEx {
    public static void main(String[] args) {
        System.out.println('\'');
        System.out.println("abc\t123\b456"); // \b -> del 3
        System.out.println('\n'); // new line
        System.out.println("\"Hello\""); // print "Hello"
        System.out.println("c:\\");
    }
}

// output:
/*
'
abc	12456


"Hello"
c:\
 */