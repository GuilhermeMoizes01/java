public class Matriz {
    public static void main(String[] args) {
        //declarando matriz
        float[][] notas = new float[3][4];

        //leitura da matriz
        //soma das notas
        float soma = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                // gera notas entre 0 e 10
               // System.out.println("\n informe a nota"); //se o usuario for digitar a nota
                notas[i][j] = (float) (Math.random() * 10);
                soma += notas[i][j];
                System.out.println(" %.2f"+ notas[i][j]);
            }
            System.out.println("");
        }
        int qtdeNotas = notas.length * notas[0].length;
        System.out.println("\n A média de notas é %.2f"+ soma / qtdeNotas);



    }
}