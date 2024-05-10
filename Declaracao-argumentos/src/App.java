public class App {
    public static void main(String[] args) throws Exception {
        String nome = args[0];
        int idade = Integer.valueOf(args[1]);
        double peso = Double.valueOf(args[2]);


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
}
}