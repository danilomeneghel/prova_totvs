package com.totvs.factory;

import java.util.ArrayList;
import java.util.List;

import com.totvs.entity.Venda;

import java.util.Comparator;

public class VendaFactory {

    private final List<Venda> venda = new ArrayList<Venda>();

    public void getVendas(String[] dados) {
        venda.add(new Venda(dados[1], Integer.parseInt(dados[2]), Integer.parseInt(dados[3]), Double.parseDouble(dados[4]), dados[5]));
    }

    public int TotalVendas() {
        return venda.size();
    }

    public double getPrecoVenda(String preco) {
        return Double.parseDouble(preco);
    }

    public String getIdVendaCara() {
        venda.sort(Comparator.comparing(Venda::getItemPrice).reversed());
        return venda.get(0).getSaleId();
    }

    public String getPiorVenda() {
		venda.sort(Comparator.comparing(Venda::getItemPrice));
		return venda.get(0).getSalesMan();
	}
}
