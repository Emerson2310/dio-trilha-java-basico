public class Main {
    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Emerson Xavier");
        Cliente cl2 = new Cliente("Jorge Silva");

        ContaCorrente c1 = new ContaCorrente(cl1);
        ContaPoupanca c2 = new ContaPoupanca(cl1);
        Conta c3 = new Conta(cl2);
        ContaPoupanca c4 = new ContaPoupanca(cl1);


        c1.depositar(450.45);
        c2.depositar(500.50);
        c3.depositar(1500.00);
        c4.depositar(300.50);

        c1.sacar(50.00);
        c2.sacar(501.45);

        cl1.adicionarContas(c1);
        cl1.adicionarContas(c2);
        cl1.adicionarContas(c4);
        cl2.adicionarContas(c3);
        //cl1.imprimirContasPorTitular();

        Banco b1 = new Banco ("Santander");
        b1.adicionarContas(cl1);
        b1.adicionarContas(cl2);

        b1.imprimirContasPorBanco();



    }
}