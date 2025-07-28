public class NatOps {

    public static Nat suma(Nat a, Nat b) {
        return new Nat(sumar(a.getValor(), b.getValor()));
    }

    private static int sumar(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return sumar(incrementar(x), decrementar(y));
        }
    }

    private static int incrementar(int x) {
        return x - (-1); // suma 1 sin usar '+'
    }

    private static int decrementar(int x) {
        return x + (-1); // resta 1
    }
}
