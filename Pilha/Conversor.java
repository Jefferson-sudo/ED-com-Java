
/**
 *
 * @author Jefferson Mateus
 */

public class Conversor{
	public static void main(String args[]){
		int numero = Integer.parseInt(args[0]);
		Pilha p = new Pilha();

		int resto;

		//Faze 1. Empilhamento dos restos

		while (numero != 0){
			resto = numero %2;  //Pego o resto da divisao
			p.push(resto);      //Armazeno na pilha
			numero = numero / 2;//Gera um novo numero, resultado da divisao dele por 2
		}

		//Faze 2. Exibicao dos restos

		while(!p.isEmpty()){
			resto = p.pop(); //Desempilha
			System.out.print(resto);
		}
		System.out.println("\nfim do programa!");
	}
}