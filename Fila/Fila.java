public class Fila{

	private int[] valores;
	private int inicio;
	private int fim;
	private int total;



	public  Fila(){
		valores = new int[10];
		inicio  = 0;
		fim     = 0;
		total   = 0;
	}



	public void inserir(int elemento){
		// A insercao deve ser feita sempre no final da fila
		valores[fim] = elemento;
		fim = (fim + 1)%10;
		total++; 
	}

	public int retirar(){
		// A remoçao deve ser feita sempre no inicio da fila
		int elemento = valores[inicio];
		inicio = (inicio+1)%10;
		total --;
		return elemento;
	}

	public boolean isEmpty(){
		return(total == 0);

	}

	public boolean isFull(){
		return (total == 10);
	}

}