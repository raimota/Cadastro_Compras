//@author Rai Mota RGM: 23327774

public interface TAD_Pilha {
    
    public Object push(Object x); //Método para inserir um objeto na pilha
    
        //Pré-condições:
            
            //objeto x não pode ser nulo       
            
    public Object pop(); //Método p/ retirar o item que se encontra no topo da pilha
    
        //Pré-condições:
            
            //Não pode retirar da pilha se ela estiver vázia
    
    public Object top(); //Método p/ retorna o item que se encontra no topo da pilha
    
        //Pré-condições:
            
            //Não poderá retornar o item se a pilha estiver vázia
    
    public boolean isEmpty(); //Verifica se a pilha está vázia
    
    public String toString(); //retorna os itens da pilha 
}
