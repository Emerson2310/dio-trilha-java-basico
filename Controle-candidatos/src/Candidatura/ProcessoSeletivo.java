package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Augusto", "Monica", "Moacir", "Julio", "Renato"};
        for(String c : candidatos){
            entrandoEmContato(c);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;

            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }
        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }
    
    static boolean atender (){
        return new Random().nextInt(3)==1;
    }

    static void imprimindoSelecionados(){
        String [] candidatos = {"Augusto", "Monica", "Moacir", "Julio", "Renato"};

        System.out.println("Lista de candidatos selecionandos\n");
        for(int indice = 0; indice < candidatos.length; indice++){
             System.out.println("O candidato nº " + (indice +1) + " é o " + candidatos[indice]);
        }

    System.out.println("\nSimplificando com o Foreach\n");

    for(String c : candidatos){
        System.out.println("Candidato selecionado foi: " + c);
    }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Augusto", "Monica", "Moacir", "Julio", "Renato"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatoAtual < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + candidato + " solicitou: R$ " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
                candidatosSelecionados++;
                System.out.println("O Candidato foi selecionado para a vaga!");
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0 , 2200.00);
    }

    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
