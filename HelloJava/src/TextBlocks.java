public class TextBlocks {
    public static void main(String[] args) {
        // bad case
        String str = "class Main {\n"
                + "\tpublic String main(String args[] {\n"
                + "\t\tSystem.out.println(\"Hello\"); \n"
                + "\t}\n"
                + "}\n";

        // better case(text blocks)
        String str2 = """
        class Main {
            public String main(String args[]) {
                System.out.println("Hello");
            }
        }
        """;

        //String str3 = """Hello""";  wrong start with text block
        String str3 = """
                    Hello"""; // "Hello"

        // etc cases...
        String str4 = """
                    Hello"""; // "Hello\n"

        String str5 = """
                        Hello
                    """;      // "   Hello\n"


        String str6 = """
                      Hello
                      """.indent(2); // same as str5 case

        String str7 = """
                      Hello\
                      """;     // "Hello"

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);
        System.out.println(str7);
    }
}

// output:
/*
class Main {
	public String main(String args[] {
		System.out.println("Hello");
	}
}

class Main {
    public String main(String args[]) {
        System.out.println("Hello");
    }
}

Hello
Hello
    Hello

  Hello

Hello

 */