public class ContaTerminal {

    int numConta;
    String agencia;
    String nomeCliente;
    double saldo;

    public ContaTerminal(){
        
    }

    public ContaTerminal(int numConta, String agencia, String nomeCliente, double saldo) {
        this.numConta = numConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return "Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
        +agencia+", conta "
        +numConta+" e seu saldo "
        +saldo+" já está disponível para saque";
    }

    
}
