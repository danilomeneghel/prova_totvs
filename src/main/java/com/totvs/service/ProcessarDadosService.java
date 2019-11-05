package com.totvs.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.totvs.entity.Relatorio;
import com.totvs.factory.ClienteFactory;
import com.totvs.factory.VendaFactory;
import com.totvs.factory.VendedorFactory;
import com.totvs.util.Constantes;

public class ProcessarDadosService {

    private static List<Relatorio> relatorio = new ArrayList<Relatorio>();
    private static String nomeArquivo;

    public static void processar() throws Exception {
        try {
            //Pega os arquivos do diretorio para processar
            File[] arquivos = LerDadosService.getArquivos();
            
            //Faz o loop nos arquivos do diretório
            for (int i = 0; i < arquivos.length; i++) {
                VendedorFactory vendedor = new VendedorFactory();
                ClienteFactory cliente = new ClienteFactory();
                VendaFactory venda = new VendaFactory();

                File arquivo = arquivos[i];
                nomeArquivo = arquivo.getName();
                relatorio = new ArrayList<Relatorio>();

                System.out.println("Lendo o arquivo '" + nomeArquivo + "'.");

                //Verifica se o arquivo não está vazio
                if (arquivo.length() != 0) {
                    //Le o arquivo
                    BufferedReader br = new BufferedReader(new FileReader(arquivo));
                    String linha;
                    //Faz o loop em cada uma das linhas
                    while ((linha = br.readLine()) != null) {
                        String[] dados = linha.split(Constantes.delimitador);

                        if (linha.startsWith(Constantes.idVendedor)) {
                            vendedor.getVendedores(dados);
                        } else if (linha.startsWith(Constantes.idCliente)) {
                            cliente.getClientes(dados);
                        } else if (linha.startsWith(Constantes.idVenda)) {
                            venda.getVendas(dados);
                        }
                    }

                    //Adiciona os novos dados
                    relatorio.add(new Relatorio(cliente.TotalClientes(), vendedor.TotalVendedores(), venda.getIdVendaCara(), venda.getPiorVenda()));

                    //Salva os dados no arquivo
                    SalvarDadosService.salvar(relatorio, nomeArquivo);

                    System.out.println("Arquivo '" + nomeArquivo + ".proc' processado com sucesso!");
                    br.close();
                } else {
                    System.out.println("Arquivo '" + nomeArquivo + "' vazio.");
                }
            }
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: \n", e.getMessage());
        }
    }
}
