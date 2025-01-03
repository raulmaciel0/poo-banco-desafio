import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Conta> contas = new ArrayList<>();



    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void listarClientes(){
        System.out.println("Lista de Clientes do Banco ");
        for (Cliente cliente : clientes){
            System.out.println(cliente.getNome());
        }
    }


}
