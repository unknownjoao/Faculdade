import java.util.Scanner;

public class App 
{
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
