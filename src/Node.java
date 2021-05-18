//@author Rai Mota RGM: 23327774

public class Node {
   
    private Object value; //valor do nó
    private Node next; //endereço para acessar o próximo item
    
    public Object getValue(){ //retorna o valor do nó
        return value;
    }
    
    public void setValue(Object value){ //para alternar o valor do nó
        this.value = value;
    }
    
    public Node getNext(){ //retorna o endereço do próximo item
        return next;
    }
    
    public void setNext(Node next){ //alterar endereço do nó
        this.next = next;
    }    
    
}
