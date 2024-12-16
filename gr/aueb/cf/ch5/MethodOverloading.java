package gr.aueb.cf.ch5;

public class MethodOverloading {
    public static void main(String[] args) {

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, long b){
        return a + (int) b;
    }
}
