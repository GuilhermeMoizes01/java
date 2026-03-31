import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Digite: A. Cadastro B. Consulta C. sair ");
        String opcao = entrada.next();
        switch (opcao) {
            case "A":
                System.out.println("Cadastro realizado com sucesso");
                break;
            case "B":
                System.out.println(" Consulta realizada com sucesso");
                break;
            case "C":
                System.out.println("Programa sera encerrado");
                break;
            default:
                System.out.println("Opção invalida");

        }
    }
}