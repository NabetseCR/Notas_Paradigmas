public class Test {
    static class A {
        static int x = 1;
    }

    static class B {
        static int x = 2;
    }

    static class C {
        // Esto es ambiguo: ¿A.x o B.x?
        static int x = x; // ⚠️ Aquí está el problema

        public static void main(String[] args) {
            System.out.println(x);
        }
    }
}