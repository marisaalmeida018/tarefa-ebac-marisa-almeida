package DAO;

import br.marisaalmeida.domain.Cliente;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteMapDAO implements IClienteDAO{

    private Map<Long, Cliente> map;

    public ClienteMapDAO() {
        map = new HashMap<>();

    }
    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clientecadastrado = this.map.get(cpf);

        if (clientecadastrado != null) {
            this.map.remove(clientecadastrado.getCpf(),  clientecadastrado);
        }

    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = this.map.get(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setNumero(cliente.getNumero());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setEstado(cliente.getEstado());
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }
}
