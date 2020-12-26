public class ListaDeEspera{
	public  static void main(String args[]){
		Lista lista = new Lista();         //Cria um objeto lista
		lista.inserir(182);                //Insere elementos na lista
		lista.inserir(2);
		lista.inserir(33);
		lista.inserir(55);

		lista.listar();                    //Lista todos os objetos presentes na lista
	}
}