public class Nat {
    private final int valor;

    public Nat(int valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Natural debe ser >= 0");
        }
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return Integer.toString(valor);
    }
}
