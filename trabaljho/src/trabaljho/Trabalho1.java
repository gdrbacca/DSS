package trabaljho;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trabalho1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int aux, numero, somamultiplos, 
		fatorial, somanumeros, maior, media, menor, somaprimos, vezes22, contador;
		boolean primo;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		maior = 0;
		somaprimos = 0;
		somamultiplos = 0;
		vezes22 = 0;
		contador = 0;
		somanumeros = 0;
		System.out.println("Informe um numero");
		numero = Integer.parseInt(teclado.readLine());
		menor = numero;
		while (numero != 38) {
			if (numero < menor) {
				menor = numero; // menor numero
			}
			if (numero > maior) {
				maior = numero; // maior numero
			}
			if ((numero % 2) == 0){  // define se é par ou ímpar
				System.out.println(numero+" é par.");
			} else {
				System.out.println(numero+" é ímpar.");
			}
			aux = numero - 1;
			primo = true;
			while (aux > 1) {   // define se é primo ou nao
				if ((numero % aux) == 0) {
					primo = false;
				}
				aux = aux - 1;
			}
			if (primo) {
				System.out.println(numero+" é primo.");
				somaprimos = somaprimos + 1;
			} else {                                      // escreve se é primo ou nao
				System.out.println(numero+" não é primo.");
			}
			if ((numero % 5) == 0) {
				somamultiplos++;
			}
			if (numero == 22) {
				vezes22++;
			}
			somanumeros = somanumeros + numero;
			contador++;
			System.out.println("proximo numero");
			numero = Integer.parseInt(teclado.readLine());
		}
		aux = menor;
		System.out.println(aux);
		fatorial = 1;
		while (aux > 1){
			fatorial = fatorial * aux;        // define o fatorial do menor numero
			aux--;
		}
		media = somanumeros / contador;
		System.out.println("Quantos eram primos: "+somaprimos);
		System.out.println("Quantas vezes o 22 foi informado: "+vezes22);
		System.out.println("Quantos eram multiplos de 5: "+somamultiplos);
		System.out.println("Media aritmetica geral: "+media);
		System.out.println("Maior numero: "+maior);
		System.out.println("Fatorial do menor "+ fatorial);
	}
}
