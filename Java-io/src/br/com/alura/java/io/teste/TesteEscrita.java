package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de Entrada com Arquivo
		// Fluxo = Stream
		// Entrada = Input

		OutputStream fos = new FileOutputStream("lorem2.txt");
		// criando fluxo concreto binario

		Writer osw = new OutputStreamWriter(fos);
		// melhorando e transformando binarios para caracteres

		BufferedWriter bw = new BufferedWriter(osw);
		// guarda os characteres em uma linha para leitura

		bw.write("Ola, vamos nos tornar o melhor programador java!!");
		bw.newLine();
		bw.write("PODEMOS SER O MELHOR!!");
		
		
		bw.close();

	}

}
