package com.totvs.factory;

import java.util.ArrayList;
import java.util.List;

import com.totvs.entity.Cliente;

public class ClienteFactory {

    private final List<Cliente> cliente = new ArrayList<Cliente>();

    public void getClientes(String[] dados) {
        cliente.add(new Cliente(dados[1], dados[2], dados[3]));
    }

    public Integer TotalClientes() {
        return cliente.size();
    }

}
