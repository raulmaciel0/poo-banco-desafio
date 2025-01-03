public interface iConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino, Cliente cliente);
    void imprimirExtrato();
}
