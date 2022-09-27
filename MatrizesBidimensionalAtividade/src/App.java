import java.util.Scanner;

public class App 
{

    /*
     * Faça um programa obrigatoriamente em JAVA que:
     * 1. Leia o tamanho de uma matriz bidimensional
     * 2. Crie uma matriz bidimensional com as dimensões informadas
     * 3. Preencha cada elemento da matriz com um valor aleatório de 0 a 9
     * 4. Mostre a matriz preenchida na tela
     * 5. Some todos os elementos de cada linha da matriz
     * 6. Mostrar a linha da matriz que tiver a maior soma.
     */

    public static void main(String[] args) throws Exception
    {

        /* Lendo o tamanho da matriz bidimensional */

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número de linha da matriz: ");
        int linha = sc.nextInt();

        System.out.print("Informe o número de coluna da matriz: ");
        int coluna = sc.nextInt();


        int[][] mat = new int[linha][coluna];

        for (int i = 0; i < mat.length; i++)
        {
            System.out.print("Informe os valores: ");
            
            for (int j = 0; j < mat[i].length; j++) 
            {
                mat[i][j] = sc.nextInt();
            }
            
        }

        /* Matriz preenchida na tela */

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                System.out.print("[" + mat[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        /* Soma dos elementos de cada linha */

        for (int i = 0; i < mat.length; i++)
        {
            int soma = 0;

            for (int j = 0; j < mat[i].length; j++)
            {
                soma += mat[i][j];
                System.out.print("[" + i + "][" + j + "] = " + mat[i][j] + " ");
                
            }
            System.out.println("| soma da linha " + i + " é: " + soma);

        }

        
        sc.close();
    }
}
