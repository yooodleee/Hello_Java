public class PrintfEx {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // long big = 100000000000L;
        long hex = 0XFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010; // octal 10, decimal 8
        int hexNum = 0x10; // hex-decimal 10, decimal 16
        int binNum = 0b10; // binary 10, decimal 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);

        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);

        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}

// output:
/*
b=1
s=2
c=A, 65
finger=[   10]
finger=[10   ]
finger=[00010
big=100000000000
hex=0xffffffffffffffff
octNum=10, 8
hexNum=10, 16
binNum=10, 2
 */