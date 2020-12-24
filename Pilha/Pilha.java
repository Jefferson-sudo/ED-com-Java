
/**
 *
 * @author Jefferson Mateus
 */

public class Pilha {

    private int valores[];
    private int topo;

    public Pilha() {
        valores = new int[10];//Pilha de 10 posicoes
        topo    = -1;//topo inicia em uma posicao nao valida. Segnifica que esta vazio.
    }

    public void push(int elemento) {//Inserir valor no topo da piha
        topo = topo + 1;
        valores[topo] = elemento;
    }

    public boolean isEmpty() {
        return(topo == -1);//Se topo = -1 segnifica que a pilha esta vazia
    }

    public boolean isFull() {
        return (topo == 9);//Se topo = 9 segnifica que a pilha esta cheia    
    }

    public int pop() {//Remove valores da pilha
        int elemento = valores[topo];//Pega os valotes que esta no indice topo
        topo --;                     //Diminui o topo
        return elemento;
    }
}
