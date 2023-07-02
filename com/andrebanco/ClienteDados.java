import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteDados {
    private Map<String, Cliente> clientes;

    public ClienteDados(){
        clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscarCliente(String cpf){
        return clientes.get(cpf);
    }

    public void removerCliente(String cpf){
        clientes.remove(cpf);
    }

    public List<Cliente> listarClientes(){
        return new ArrayList<>(clientes.values());
    }
    
}
