import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Informe o nome do cliente");
        String nome = entrada.next();
        System.out.println(" Informe o valor da compra");
        float valor = entrada.nextFloat();
        int opcao = 0;
        do {
            System.out.println(" Digite. 1. Á vista 2. á prazo sem juros 3. Á prazo com juros");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("15% de desconto" + (valor - valor * 0.15));
                    break;
                case 2:
                    System.out.println("Quantidade de parcelas (ate 5x)");
                    int qtde = entrada.nextInt();
                    for (int i = 1; i <= qtde; i++) {
                        System.out.println(" Valor da " + i + " a parcela:" + valor / qtde);
                    }
                    break;
                case 3:
                    System.out.println(" 2% ao mes ");
            }


        }
    }
}
