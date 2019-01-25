
package banco;

// Node Cliente
class Node {
    private Node left;
    private Node right;
    private Cliente chave;
    private int fatBal;

    Node (Cliente c){
        chave = c;
    }
    
    void setLeft(Node left) {
        this.left = left;
    
    }

    void setRight(Node right) {
        this.right = right;
    }

    void setChave(Cliente chave) {
        this.chave = chave;
    }
    
    void setFatBal(int fatBal){
        this.fatBal = fatBal;
    }

    Node getLeft() {
        return left;
    }

    Node getRight() {
        return right;
    }

    Cliente getChave() {
        return chave;
    }
    int getFatBal(){
        return fatBal;
    }
    
    Node inserirNo(Cliente value){
        if(chave.getCpf().compareToIgnoreCase(value.getCpf())< 0){
            if(left == null){
                left = new Node (value);
                this.fatBal = this.fatBal-1;
                return this;
            }
            else{
                left.inserirNo(value);
            }
        }
        else if (chave.getCpf().compareToIgnoreCase(value.getCpf()) > 0){
            if(right == null){
                right = new Node (value);
                this.fatBal = this.fatBal +1;
                return this;
            }
            else{
                right.inserirNo(value);
            }
        }
    }
}
