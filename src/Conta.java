public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldo>=valor){
            this.saldo-=valor;
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino, Cliente cliente) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInformacoesComuns() {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: R$" + this.saldo);
    }

}
