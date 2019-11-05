package com.totvs.factory;

import java.util.ArrayList;
import java.util.List;

import com.totvs.entity.Vendedor;

public class VendedorFactory {

    private final List<Vendedor> vendedor = new ArrayList<Vendedor>();

    public void getVendedores(String[] dados) {
        vendedor.add(new Vendedor(dados[1], dados[2], Double.parseDouble(dados[3])));
    }

    public Integer TotalVendedores() {
        return vendedor.size();
    }

}
