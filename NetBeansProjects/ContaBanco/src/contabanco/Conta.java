package contabanco;

public class Conta {
    //DECLARACAO DE VARIAVEIS
    public int numConta;
    public String tipo;
    public String dono;
    public float saldo;
    public boolean status;
    //-----------------------
    
    //METODO CONSTRUTOR
    public Conta(int n, String t, String d, float s){
        this.setnumConta(n);
        this.tipo = t;
        this.dono = d;
        this.saldo = s;
    }
    //------------------
    
    //METODOS GET AND SET PARA A VARIAVEL NUMCONTA
    public int getnumConta(){
        return this.numConta;
    }
    public void setnumConta(int n){
        this.numConta = n;
    }
    //--------------------------------------------
    
    //METODOS PARA EXIBIR INFORMACOES DAS CONTAS
    public void status(){
        System.out.println("DADOS DA CONTA");
        System.out.println("Numero da conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Dono: " + this.dono);
        System.out.println("Saldo: R$ " + this.saldo);          
    }
    //-------------------------------------------
    
    public void abrirConta(){
        System.out.println("QUAL DO TIPO DE COTA: ");
        System.out.println("POUPANCA: cp");
        System.out.println("CORRENTE: cc");
        
        
        
    }
    
    
    
    
}
