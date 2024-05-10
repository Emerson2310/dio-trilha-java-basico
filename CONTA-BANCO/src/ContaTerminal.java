import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int num;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = teclado.nextLine();

        System.out.println("Digite o número de sua conta!");
        num = teclado.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        agencia = teclado.next();

        System.out.println("Digite seu saldo bancário!");
        saldo = teclado.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso " +
        "banco, sua agência é " + agencia + ", conta " + num + " e seu saldo " + saldo +" já está disponível para saque");

        teclado.close();
    }
}

/**
 * Atributo	Tipo	Exemplo
Numero	Inteiro	1021
Agencia	Texto	067-8
Nome Cliente	Texto	MARIO ANDRADE
Saldo	Decimal	237.48
 * 
 * 
 * 
 */