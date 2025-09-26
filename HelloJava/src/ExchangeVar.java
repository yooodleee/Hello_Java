public class ExchangeVar {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println("x:" + x + " y:" + y);

        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x:" + x + " y:" + y);
    }
}
// output:
//x: 10 y: 20
//x: 20 y: 10
