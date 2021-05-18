public class Queue {
   private Node head = null, tail = null;
   
   public Queue(){
       head = null;
       tail = null;
   }
   
   public Object enqueue(Object x){
      if(x == null) return null;
       try { //casos de memória insuficiente
           Node novo = new Node();
           novo.setValue(x);
           novo.setNext(null);
           if(tail == null){
              head = novo;
              tail = novo;
           }else{
               tail.setNext(novo);
               tail = novo;
           }
           return x;
       } catch (Exception ex) {
           return null;
       }
   }
   
   public Object dequeue(){
       if(head == null) return null;
       Object value = head.getValue();
       head = head.getNext();
       if(head == null) tail = null;
       return value;
   }
   
   public boolean isEmpty(){
       if(head == null) return true;
       else return false;
   }
   
   public Object peek(){
       if(head == null) return null;
       else return head.getValue();
   }
   
   public String toString(){
       if(!isEmpty()){
           String saida = "";
           Node aux = head;
           while(aux != null){
               saida += aux.getValue().toString() + "\n";
               aux = aux.getNext();
           }
           return ("f: [\n" + saida + "]");
       }else return ("Fila está vázia");
   }
}
