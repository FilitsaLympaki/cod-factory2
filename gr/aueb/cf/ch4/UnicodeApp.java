package gr.aueb.cf.ch4;

public class UnicodeApp {
    public static void main(String[] args) {
        int codePoint = 0x1F600;

        System.out.println("smile: \uD83D\uDE03");
        System.out.println("smiley: ");
        System.out.println(Character.toChars(codePoint));
    }
}
