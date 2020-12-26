public class Lista{

	private Caixinha inicio;
	

	//Criando a lista vazia
	public Lista(){
		this.inicio = null;                   //O inicio da lista e vazio 
	}	

	public void inserir(int elemento){

		//Criando uma nova caixinha

		Caixinha nova = new Caixinha();
		nova.setElemento(elemento);           //Insere o elemento na caixinha
		nova.setProximo(null);                //Depois dela nao vem niguem. Ela é o primeito elemento da lista

		if(inicio == null){                   //Se estiver vazia, essa vai ser a 1 caixinha.
			inicio = nova;                    //Inicio aponta pra nova caixinnha
		}else{                                //Se ela não estiver vazia
			Caixinha aux = new Caixinha();    //Cria um objeto auxiliar
			aux = inicio;                     //aux  recebe inicio que no caso vale null
			while(aux.getProximo() != null){  //Testa se o proximo elemento de aux é difetente de  null.
				aux = aux.getProximo();       //Se não for nulo percorre mais um elemento ate achar o utimo elemento que é aquele que aponta para null
			}
			aux.setProximo(nova);             //Se o proximo elemento de aux for nulo a lista recebe mais um elemento.
		}
	}

	//public int retirar(){}

	public void listar(){
		if(inicio == null){                                         //Se a lista estiver vazia
			System.out.println("Nada a exibir");
		}else{										                //Se a lista possuir algum elemento
			Caixinha aux = inicio;
			while(aux.getProximo() != null){                        //Enquanto o proximo de aux nao for nullo. Ou seja, enquanto nao for o ultimo
			System.out.println("Elemento visto "+aux.getElemento());//Imprima o elemto
			aux = aux.getProximo();                                 //Percorre mais um elemento

			}
		}
	}

	public boolean isEmpty(){         //Se a lista esta vazia
		return this.inicio == null;
	}
}