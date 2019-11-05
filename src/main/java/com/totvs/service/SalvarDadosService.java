package com.totvs.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.totvs.entity.Relatorio;
import com.totvs.util.Constantes;
import com.totvs.util.ValidarDirArq;

public class SalvarDadosService {

    public static void salvar(List<Relatorio> relatorio, String nomeArquivo) {
        String pathOut = Constantes.dirOut;
        
        try {
            //Verifica se existe o diretório para salvar o arquivo
            ValidarDirArq.validar(new File(pathOut));
            
            File arquivo = new File(pathOut + "/" + nomeArquivo + ".proc");
            FileWriter writer = new FileWriter(arquivo);
            
            //Gera a data atual 
            LocalDateTime dataAtual = LocalDateTime.now();
            String dataFormatada = dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            
            //Faz o loop nos dados e escreve no arquivo
            for (Relatorio dado : relatorio) {
                writer.append("Qtd Clientes: " + dado.getTotalClientes().toString() + "\r\n");
                writer.append("Qtd Vendedores: " + dado.getTotalVendedores().toString() + "\r\n");
                writer.append("Id Venda Mais Cara: " + dado.getIdVendaCara() + "\r\n");
                writer.append("Pior Vendedor: " + dado.getPiorVendedor() + "\r\n\r\n");
                writer.append("Arquivo gerado em " + dataFormatada + "\r\n");
            }

            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
