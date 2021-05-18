//@author Rai Mota RGM: 23327774

public class Pilha implements TAD_Pilha{
    
    private Node topo = null;
    public Pilha(){
        topo = null;
    }
    public Node push(Object x){ 
        try{
            if(x == null) return null; //para não entrar outro objeto nulo
            Node novo = new Node(); // alocando memória para um novo nó
            novo.setValue(x); //altera valor do nó
            novo.setNext(topo); //atualizando o endereço do nó
            topo = novo;
            return novo;
        }catch(Exception ex){
            return null; //memória insuficiente 
        }
    }
    
    public Object pop(){ //retorna e elimina objeto do topo 
        if(topo == null) return null; //se a pilha estiver vázia
        Object valor = topo.getValue();
        topo = topo.getNext(); //avançar o topo para o próximo da pilha
        return valor; //retorna valor que estava no topo
    }
    
    public Object top(){ //
        if(topo == null) return null;
        else return topo.getValue();
    }
    
    public boolean isEmpty(){
        return (topo == null);
    }
    
    public String toString(){
        if(!isEmpty()){
            String resp = "";
            Node aux = topo;
            while(aux != null){
                resp += aux.getValue().toString() + "\n";
                aux = aux.getNext();                
            }
            return ("p:[\n" + resp + "]");
        }else return ("pilha está vázia");
    }          
}
