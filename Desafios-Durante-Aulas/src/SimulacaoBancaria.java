import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double deposito = scanner.nextDouble();
                    
                    saldo += deposito;
                    System.out.println(String.format("Saldo Atual: %.1f", saldo));
                    break;
                case 2:
                    double saque = scanner.nextDouble();
                    
                    if (saldo > saque){
                      
                      saldo -= saque;
                        System.out.println(String.format("Saldo atual: %.1f", saldo));
                        
                    }else{
                    System.out.println("Saldo insuficiente");
                    }
                    
                    break;
                case 3:
                    System.out.println(String.format("%.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}