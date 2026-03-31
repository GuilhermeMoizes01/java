import java.util.Scanner;

public class Matrizexercicio2 {
    public static void main(String[] args) {
        //ex1_ exibir e somar elementos da Diagonal Secundaria  (4x4)
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o tamanho da Matriz");
        int n = entrada.nextInt();
        //Declarção da matriz
        int[][]matriz = new int [n][n]; // matriz quadrada
        //calcular a soma dos elementos da DS
        int  soma = 0;
        // Alimenta a Matriz
        for( int i=0; i < matriz.length; i++ ){
            for(int j=0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random() * 10 ) + 10;
                if(( i + j) == matriz.length - 1 ){// é DS
                    System.out.println(" Elemento faz parte da DS  " + matriz[i][j]);
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos elementos da DS  " + soma );
    }
}

