public class Main {
    public static void main(String[] args) {
        Nat cero = new Nat(0);
        Nat uno = new Nat(1);
        Nat dos = new Nat(2);
        Nat tres = new Nat(3);

        System.out.println("Cero: " + cero);
        System.out.println("Uno: " + uno);
        System.out.println("Dos: " + dos);
        System.out.println("Tres: " + tres);

        Nat suma = NatOps.suma(dos, tres);
        System.out.println("2 + 3 = " + suma);

        Nat suma2 = NatOps.suma(cero, cero);
        System.out.println("0 + 0 = " + suma2);
    }
}
