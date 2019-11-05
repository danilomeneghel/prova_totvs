package com.totvs.service;

import java.io.File;

import com.totvs.util.Constantes;
import com.totvs.util.ValidarDirArq;

public class LerDadosService {

    public static File[] getArquivos() throws Exception {
        String pathIn = Constantes.dirIn;

        //Verifica se existe o diretório para ler o arquivo
        ValidarDirArq.validar(new File(pathIn));

        File diretorio = new File(pathIn);
        return diretorio.listFiles();
    }
}
