public class Conversion {
    public static void main(String[] args) {
        int number = 127;

        conversion(number, 2);
        conversion(number, 3);
        conversion(number, 4);
        conversion(number, 5);
        conversion(number, 8);
        conversion(number, 16);

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toOctalString(number));
        System.out.println(Integer.toHexString(number));

    }

    public static void conversion(int number, int N) {
        StringBuilder sb = new StringBuilder();
        int current = number;

        while(current > 0) {
            if (current % N < 10) {
                sb.append(current % N);
            } else {
                sb.append((char)(current % N - 10 + 'A'));
            }
            current /= N;
        }
        System.out.println(number + N + sb.reverse().toString());
    }
}

// output:
/*
1291111111
13011201
1311333
1321002
135177
1437F
1111111
177
7f
 */