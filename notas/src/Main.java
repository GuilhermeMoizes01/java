import java.util.Scanner;

public class Main{
    public static void main(String[] args ){
        Scanner entrada = new Scanner(System.in);
       /* int condicao= 1;
        float nota= 0;
        float soma= 0;
        while ( condicao <= 10 ){
            System.out.println(" Informe uma nota:");
            nota = entrada.nextInt();
            if (nota < 0 ){
                break; //Força a saida do while
            }
            soma += nota;
            condicao ++;
        }// fecha while
        if (condicao == 11){// foi normal sem entrar no break
            float media = soma/ 10;
            System.out.println(" A média é:  "+ media);
        }
        else{
            System.out.println("nota invalida ");
        }*/
        int condicao = 1;
        float nota= 0;
        float soma = 0;
        while(condicao <= 10){
            nota = entrada.nextInt();
            if( nota < 0 || nota > 10 ){
                System.out.println(" Nota invalida, tente novamente");
                continue; // não sai do loop, ignora oque tem errado
            }
            condicao ++;
            soma += nota;
        }
        float media = soma / 10;
        System.out.println(" Média é:  "+ media );

    }
        }
