class A {
    private int x = 666;
    public class B {
        private int x = 999;
        public void foo() {
            System.out.println(A.this.x);
        }
    }
}

public class Test {
    public static void main(String... args) {
        A a = new A();
        var b = a.new B(); // instancia de clase interna no estática
        b.foo(); // imprime 666
    }
}