public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A'; // char ch = 65;
        int code = (int)ch;

        System.out.printf("%c=%d(%#X) %n", ch, code, code);

        char hch = '가'; // char hch = 0xAC00;
        System.out.printf("%c=%d(%#X) %n", hch, (int)hch, (int)hch);
    }
}

// output:
/*
A=65(0X41)
가=44032(0XAC00)
 */