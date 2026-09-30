import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero de Linhas da matriz: ");
        int n =  sc.nextInt();
        System.out.print("Insira o numero de Colunas da matriz: ");
        int m = sc.nextInt();

        //criando a matriz
        int[][] matriz = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("Selecione um numero para achar os vizinhos ");
        int procurado = sc.nextInt();
        int[][] vizinhos = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(procurado == matriz[i][j]){
                    System.out.println("Posicao [" + i + "][" + j + "]");
                    if(j>0){//se se tiver coluna a esquerda sobrando
                        System.out.printf("Vizinho a esquerda: %d \n",  matriz[i][j-1]);
                    }else{
                        System.out.print("Vizinho a esquerda não existe \n ");
                    }

                    if(j<m-1){//se tiver coluna a direita sobrando
                        System.out.printf("Vizinho a direita: %d \n",   matriz[i][j+1]);
                    }else{
                        System.out.print("Vizinho a direita não existe \n" );
                    }

                    if(i>0){//se existir linha a cima
                        System.out.printf("Vizinho em cima: %d\n",  matriz[i-1][j]);
                    }else{
                        System.out.print("Vizinho acima não existe\n");
                    }
                    if(i < n - 1){// se existir linha em baixo
                        System.out.printf("Vizinho a baixo: %d\n",  matriz[i+1][j]);
                    }else{
                        System.out.print("Vizinho abaixo não existe \n");
                    }
                    System.out.println();
                }
            }
        }

    sc.close();
    }
}
