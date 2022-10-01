import java.util.Random;
import java.util.Scanner;

public class Matrizes {
	public static int mult;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Dimensão 1: ");
		int m = sc.nextInt();
		System.out.print("Dimensao 2: ");
		int n = sc.nextInt();

		System.out.print("Multiplicar por: ");
		mult = sc.nextInt();

		System.out.println();
		System.out.println("Matriz Original: ");
		int[][] matriz = criaMatriz(m, n);
		imprimeMatriz(matriz);
		System.out.println();

		System.out.println("Matriz Transposta: ");
		int[][] transposta = transposta(matriz);
		imprimeMatriz(transposta);
		System.out.println();

		System.out.println("Matriz Oposta: ");
		int[][] oposta = oposta(matriz);
		imprimeMatriz(oposta);
		System.out.println();

		System.out.printf("Matriz transposta multiplicada por %d: \n", mult);
		int[][] multiplicarN = multiplicar(matriz);
		imprimeMatriz(multiplicarN);
		System.out.println();

		System.out.println("Soma da matriz: ");
		int[][] somar = somar(matriz);
		imprimeMatriz(somar);
		System.out.println();

		System.out.println("Subtração da matriz: ");
		int[][] subtrair = subtrair(matriz);
		imprimeMatriz(subtrair);
		System.out.println();

		System.out.println("Multiplicação da matriz: ");
		int[][] multiplicar = multiplicar(matriz);
		imprimeMatriz(multiplicar);
		System.out.println();
		
		int quadratica = quadratica(matriz);
		System.out.printf("Dominante da matriz quadratica %d por %d: %d%n", m, n, quadratica);
		
		sc.close();
	}

	static int[][] criaMatriz(int m, int n) {
		int[][] matriz = new int[m][n];
		Random gerador = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = gerador.nextInt(-9, 10);
			}
		}
		return matriz;
	}

	static void imprimeMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "] \t");
			}
			System.out.print("\n");
		}
	}

	static int[][] transposta(int[][] matriz) {
		int[][] matrizTransposta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizTransposta.length; i++) {
			for (int j = 0; j < matrizTransposta[0].length; j++) {
				matrizTransposta[i][j] = matriz[j][i];
			}
		}
		return matrizTransposta;
	}

	static int[][] oposta(int[][] matriz) {
		int[][] matrizOposta = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizOposta.length; i++) {
			for (int j = 0; j < matrizOposta[0].length; j++) {
				matrizOposta[i][j] = -matriz[j][i];
			}
		}
		return matrizOposta;
	}

	/* nao consegui multiplicar a matrizOriginal. */
	static int[][] multiplicarN(int[][] matriz) {
		int[][] matrizMultiplicar = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizMultiplicar.length; i++) {
			for (int j = 0; j < matrizMultiplicar[0].length; j++) {
				matrizMultiplicar[i][j] = matriz[j][i] * mult;
			}
		}
		return matrizMultiplicar;
	}

	static int quadratica(int[][] matriz) {
		int soma = 0;
		int[][] matrizQuadratica = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizQuadratica.length; i++) {
			for (int j = 0; j < matrizQuadratica.length; j++) {

				if (matriz[0].length == 2 && matriz.length == 2) {

					soma = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

				} else if (matriz[0].length <= 3 && matriz.length <= 3) {

					soma = ((matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[0][1] * matriz[1][2] * matriz[2][0])
							+ (matriz[0][2] * matriz[1][0] * matriz[2][1]))
							- ((matriz[0][2] * matriz[1][1] * matriz[2][0])
									- (matriz[0][0] * matriz[1][2] * matriz[2][1])
									- (matriz[0][1] * matriz[1][0] * matriz[2][2]));
				}
			}
		}
		return soma;

	}

	static int[][] somar(int[][] matriz) {
		int[][] somarMatriz = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < somarMatriz.length; i++) {
			for (int j = 0; j < somarMatriz[0].length; j++) {
				somarMatriz[i][j] = matriz[j][i] + matriz[j][i];
			}
		}
		return somarMatriz;
	}

	static int[][] subtrair(int[][] matriz) {
		int[][] subtrairMatriz = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < subtrairMatriz.length; i++) {
			for (int j = 0; j < subtrairMatriz[0].length; j++) {
				subtrairMatriz[i][j] = matriz[j][i] - matriz[j][i];
			}
		}
		return subtrairMatriz;
	}

	static int[][] multiplicar(int[][] matriz) {
		int[][] multiplicarMatriz = new int[matriz[0].length][matriz.length];
		for (int i = 0; i < multiplicarMatriz.length; i++) {
			for (int j = 0; j < multiplicarMatriz[0].length; j++) {
				multiplicarMatriz[i][j] = matriz[j][i] * matriz[j][i];
			}
		}
		return multiplicarMatriz;
	}

}