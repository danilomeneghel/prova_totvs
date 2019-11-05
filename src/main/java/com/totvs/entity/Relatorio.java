package com.totvs.entity;

public class Relatorio {

    private Integer totalClientes;
    private Integer totalVendedores;
    private String idVendaCara;
    private String piorVendedor;

    public Relatorio(Integer totalClientes, Integer totalVendedores, String idVendaCara, String piorVendedor) {
        this.totalClientes = totalClientes;
        this.totalVendedores = totalVendedores;
        this.idVendaCara = idVendaCara;
        this.piorVendedor = piorVendedor;
    }

    public Integer getTotalClientes() {
        return totalClientes;
    }

    public void setTotalClientes(Integer totalClientes) {
        this.totalClientes = totalClientes;
    }

    public Integer getTotalVendedores() {
        return totalVendedores;
    }

    public void setTotalVendedores(Integer totalVendedores) {
        this.totalVendedores = totalVendedores;
    }

    public String getIdVendaCara() {
        return idVendaCara;
    }

    public void setIdVendaCara(String idVendaCara) {
        this.idVendaCara = idVendaCara;
    }

    public String getPiorVendedor() {
        return piorVendedor;
    }

    public void setPiorVendedor(String piorVendedor) {
        this.piorVendedor = piorVendedor;
    }

}
