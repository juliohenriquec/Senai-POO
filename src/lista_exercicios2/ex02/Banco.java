package lista_exercicios2.ex02;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Cliente> clientes;
    private Map<Integer, Conta> contas;

    public Banco() {
        clientes = new HashMap<>();
        contas = new HashMap<>();
    }

    public void cadastrarCliente(String nome, String cpf) {
        if (!clientes.containsKey(cpf)) {
            Cliente cliente = new Cliente(nome, cpf);
            clientes.put(cpf, cliente);
            System.out.println("Cliente cadastrado com sucesso: " + cliente);
        } else {
            System.out.println("Cliente com CPF " + cpf + " já está cadastrado.");
        }
    }

    public void abrirConta(String cpf) {
        Cliente cliente = clientes.get(cpf);
        if (cliente != null) {
            Conta conta = new Conta(cliente);
            contas.put(conta.getNumero(), conta);
            System.out.println("Conta aberta com sucesso: " + conta);
        } else {
            System.out.println("Cliente com CPF " + cpf + " não encontrado.");
        }
    }

    public Conta getConta(int numeroConta) {
        return contas.get(numeroConta);
    }

    @Override
    public String toString() {
        return "Banco{clientes=" + clientes.values() + ", contas=" + contas.values() + "}";
    }

}

