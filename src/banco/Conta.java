package banco;


public class Conta {
   
   private final int nconta; 
   private String cpf;
   private final int tipoConta;// 1 para conta corrente normal  2 para conta corrente especial
   private float saldo;

    public Conta(int nconta, String cpf, int tipoConta, float saldo) {
        this.nconta = nconta;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNconta() {
        return nconta;
    }

    public String getCpf() {
        return cpf;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" + "nconta=" + nconta + ", cpf=" + cpf + ", tipoConta=" + tipoConta + ", saldo=" + saldo + '}';
    }
   
}
