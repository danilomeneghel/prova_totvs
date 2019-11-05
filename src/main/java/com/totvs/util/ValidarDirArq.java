package com.totvs.util;

import java.io.File;

public class ValidarDirArq {

	public static void validar(File diretorio) {
		if (!diretorio.isDirectory()) {
			System.err.println("Diretório '" + diretorio.getPath() + "' inexistente.");
			System.exit(0);
		}
		if (!diretorio.exists()) {
			System.err.println("Arquivo inexistente dentro do diretório '" + diretorio.getPath() + "'.");
			System.exit(0);
		}
	}
}
