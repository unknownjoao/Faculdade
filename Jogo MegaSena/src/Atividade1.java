import java.io.*;
import java.util.*;

public class Atividade1{
    public static void main(String args[]) 
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos jogos você deseja fazer? ");
        int quantidadeJogos = teclado.nextInt();
        System.out.println("Quantos números em cada jogo você deseja? ");
        int quantidadeNumeros = teclado.nextInt();

        String jogos = gerarJogosMegaSena(quantidadeJogos, quantidadeNumeros);
        mostrarEGravar(jogos, "MegaSena.txt");

        teclado.close();
    }

    public static int aleatorio(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Intervalo inválido");
        }
        return new Random().nextInt(max - min + 1) + min;
    }

    public static boolean existe(int[] vetor, int elemento) {
        boolean achou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == elemento)
                achou = true;
        }
        return achou;
    }

    public static int[] gerarJogo(int numeros, int min, int max) {
        int[] jogo = new int[numeros];
        int numerosGerados = 0;
        while (numerosGerados < numeros) {
            int numeroAleatorio = aleatorio(min, max);
            if (!existe(jogo, numeroAleatorio))
                jogo[numerosGerados++] = numeroAleatorio;
        }
        Arrays.sort(jogo);
        return jogo;
    }

    public static int[] gerarJogoMegaSena() {
        return gerarJogo(6, 1, 60);
    }

    public static int[] gerarJogoMegaSena(int numeros) {
        return gerarJogo(numeros, 1, 60);
    }

    public static String jogoParaString(int[] jogo, String delimitador) {
        String jogoString = "";
        for (int i = 0; i < jogo.length; i++) {
            jogoString += jogo[i] + delimitador;
        }
        return jogoString;
    }

    public static String gerarJogosMegaSena(int quantidadeJogos, int quantidadeNumeros) {
        String jogos = "";
        for (int i = 0; i < quantidadeJogos; i++) {
            jogos += jogoParaString(gerarJogoMegaSena(quantidadeNumeros), "\t") + "\n";
        }
        return jogos;
    }

    public static void mostrarEGravar(String texto, String arquivo) //o erro tava aqui 
    {
        System.out.println(texto);
        try {
            FileWriter file = new FileWriter("MegaSena.txt");
            BufferedWriter escritor = new BufferedWriter(file);
            escritor.append(texto);
            escritor.close();
            file.close();
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}