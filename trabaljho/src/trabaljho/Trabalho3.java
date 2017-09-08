package trabaljho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trabalho3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int conta, contador, soma, vet1 [], vetor[], media, numero, opcao;
		vet1 = new int[3];
		vetor = new int [3];
		conta = 0;
		soma = 0;
		contador = 0;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < vet1.length ; i++) {
			System.out.println("Digite um numero  ("+i+"/9)");
			vet1[i] = Integer.parseInt(teclado.readLine());
			soma += vet1[i];
			contador++;
		}
		media = soma / contador;
		while (conta != 10){
			System.out.println("\n-------------------------------------------------------");
			System.out.println("1 - Media\n2 - Maiores que a media\n3 - Menores que a media\n"
					+ "4 - Fatorial\n5 - Maior numero\n6 - Inverte\n7 - Ordena crescente\n"
					+ "8 - Maior frequencia\n9 - Tem repetidos\n10 - Ver array\n11 - Acaba");
			opcao = Integer.parseInt(teclado.readLine());
			switch(opcao){
				case 1 : System.out.println("Media = "+media);;
				break;
				case 2 : System.out.println("Maiores que a media = "+maiores(vet1, media));;
				break;
				case 3 : System.out.println("Menores que a media = "+menores(vet1, media));;
				break;
				case 4 : for (int i = 0; i < vetor.length; i++) { 
							vetor[i] = vet1[i];
						 }
						fatorial(vetor);
				break;
				case 5 : System.out.println("Maior = "+maior(vet1));;
				break;
				case 6 : for (int i = 0; i < vetor.length; i++) {
							vetor[i] = vet1[i];
						 };
						 System.out.println("Invertidos");
						 vetor = inverte(vetor);
						 for (int i = 0; i < vetor.length; i++) {
							System.out.println(vetor[i]);
						}
				break;
				case 7 : for (int i = 0; i < vetor.length; i++) {
							vetor[i] = vet1[i];
				 		};
				 		vetor = ordena(vetor);
				 		System.out.println("Ordenados em ordem crescente:");
				 		for (int i = 0; i < vetor.length; i++) {
							System.out.println(vetor[i]);
						}
				break;
				case 8 : for (int i = 0; i < vetor.length; i++) {
							vetor[i] = vet1[i];
		 				 };
		 				 int maior = 0;
		 				 vetor = frequencia(vetor);
		 				 for (int i = 0; i < vetor.length; i++) {
							if(vetor[i] > maior){
								maior = vet1[i];
							} else{
								
							}
						 }
		 				 System.out.println("Numero de maior frequencia");
		 				 System.out.println(maior);
				break;
				case 9 :  if(repetidos(vet1)){
							System.out.println("Tem repetidos");
						  } else 
							System.out.println("Não tem repetidos");;
				break;
				case 10 : for (int i = 0; i < vet1.length; i++) { //Uma opçao a mais para ver o array
							System.out.println(vet1[i]);
				  		  }  
				break;
				case 11 : acaba();
				break;
			}
		}
	}
	
	public static int maiores(int nums[], int media){
		int soma;
		soma = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] > media){
				soma++;
			}
		}
		return soma;
		
	}
	public static int menores(int nums[], int media){
		int soma;
		soma = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] < media){
				soma++;
			}
		}
		return soma;
	}
	public static void  fatorial(int vet[]){
		int aux, fatorial;
		for (int i = 0; i < vet.length; i++) {
			aux = vet[i];
			fatorial = 1;
			while (aux > 1){
				fatorial = fatorial * aux;    
				aux--;
			}
			vet[i] = fatorial;
		}
		System.out.println("Fatoriais");
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
	public static int maior(int nums[]){
		int maior = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > maior) {
				maior = nums[i];
			}
		}
		return maior;
	}
	public static int[] inverte(int nums[]){
		int temp;
		for ( int i = 0; i < nums.length / 2; i++) { 
		    temp = nums[ nums.length - i - 1 ];  
		    nums[ nums.length - i - 1 ] = nums[ i ];  
		    nums[i] = temp;  
		}  
		return nums;
	}
	public static int[] ordena(int nums[]){
		int aux;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length - 1; j++) {
				if(nums[j] > nums[j + 1]){
					aux = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = aux;
				}
			}	
		}
		return nums;
	}
	public static boolean repetidos(int nums[]){
		int conta = 0;
		for(int i = 0; i < nums.length; i++){  
            for(int j = 0; j < nums.length; j++){  
                if(nums[i] == nums[j]){  
                    conta++;  
                }  
            }  
        }  
         if(conta > nums.length){  
        	 return true;  
         }else{  
        	 return false;  
         }  
	}
	public static int[] frequencia(int nums[]){
		int vet2 [];
		vet2 = new int[3];
		for (int i = 0; i < nums.length; i++) {
			vet2[i] = 0;
			for (int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j]){
					vet2[i]++;
				}
			}
		}
		return vet2;
	}
	public static void acaba(){
		System.out.println("Acabou.");
	}
}