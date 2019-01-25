
package banco;
public class AvlTree {
    private Node raiz;
    
    public void inserir(Cliente c){
       if(raiz == null){
           raiz = new Node(c);
       }
       else{
           
           raiz = raiz.inserirNo(c);
       }
    }
    public void verificaBal(){
        
    }
}
