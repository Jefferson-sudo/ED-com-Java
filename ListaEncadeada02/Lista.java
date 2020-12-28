public class Lista{
	private No inicio;

	//Criando lista vazia

	public Lista(){
		this.inicio = null; //Inicio aponta pra null
	}

	public void inserir(int elemento){
		//Insercao de elementos na lista
		No novo = new No();         //Crio a lista vazia
		novo.setElemento(elemento); //Pego o elemento que vem da aplicacao e insiro em No
		novo.setProximo(null);      //O proximo elemento é null

		if(inicio == null){ // Se inicio aponta pra null agora ele ira apontar para o novo elemento inserido na lista
			inicio = novo;  //Inicio entao aponta pra novo
		}else{              //Se o inicio nao estiver apontando pra null e estiver apontadando pra algum elemento
			No auxiliar = new No(); //Crio um auxiliar
			auxiliar = inicio;      //O auxiliar aponta pra onde o inicio esta apontando
			while(auxiliar.getProximo() != null){ //Para varrer a lista
				auxiliar = auxiliar.getProximo(); 
			}
			auxiliar.setProximo(novo); //O auxiliar aponta pro novo elemento
		}
	}

	public void listar(){
		if(inicio == null){
			System.out.println("A lista esta vazia!");
		}else{
			
			No auxiliar = inicio; //O aux pega a referencia do inicio

			while(auxiliar.getProximo()  != null){
				System.out.println("Elemento vista "+auxiliar.getElemento());
				auxiliar = auxiliar.getProximo();
			}

		}
	}

	public boolean isEmpty(){ //Se a lista esta vazia
		return this.inicio == null;
	}
	
}