//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Cliente raul = new Cliente("Raul");
        Cliente Fernanda = new Cliente("Fernanda");

        banco.adicionarCliente(raul);
        banco.adicionarCliente(Fernanda);

        banco.listarClientes();

        Conta CC = new ContaCorrente(Fernanda);
        CC.depositar(1000.00);

        Conta CP = new ContaPoupanca(raul);

        CC.imprimirExtrato();
        CP.imprimirExtrato();

        CC.transferir(200.00, CP, raul);

        CC.imprimirExtrato();
        CP.imprimirExtrato();

    }
}