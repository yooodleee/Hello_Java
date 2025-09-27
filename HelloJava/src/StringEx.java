public class StringEx {
    public static void main(String[] args) {
        String name = "Ja" + "va";
        String str = name + 21;

        System.out.println(name);
        System.out.println(str);

        System.out.println(7 + " ");
        System.out.println(" " + 7);
        System.out.println(7 + "");         // empty string ""
        System.out.println("" + 7);
        System.out.println("" + "");
        System.out.println(7 + 7 + "");     // 14 + ""
        System.out.println("" + 7 + 7);     // "7" + 7
    }
}

/*
output:
Java
Java21
7
 7
7
7

14
77
 */