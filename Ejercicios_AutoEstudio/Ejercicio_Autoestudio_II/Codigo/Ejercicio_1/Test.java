public class Test {
    static class A {
        static int x = 1;
    }

    static class B {
        static int x = 2;
    }

    static class C {
        static int x = x;

        public static void main(String[] args) {
            System.out.println(x);
        }
    }
}