public class Matrizexercicio1 {
    public static void main(String[] args) {
        //ex1_ exibir e somar elementos da Diagonal Principal (4x4)

        //Declarção da matriz
        int[][]matriz = new int [4][4];
        //calcular a soma dos elementos da DP
        int  soma = 0;
        // Alimenta a Matriz
        for( int i=0; i < matriz.length; i++ ){
            for(int j=0; j < matriz[i].length; j++){
                matriz[i][j] = (int) (Math.random() * 10 );
                if( i== j){
                    System.out.println(" Elemento faz parte da DP  " + matriz[i][j]);
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("Soma dos elementos da DP  " + soma );
    }
}

