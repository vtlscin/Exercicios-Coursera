package SextaSemana;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessadorArquivo {

	//Para testar substituir path pelo caminho dos arquivos;
	
	public static Map<String,String> processar(String arquivo) throws LeituraArquivoException {
		Map<String,String> arquivoProcessado = new HashMap<String, String>();
	
		String path = "/home/vinicius-santos/arquivosTeste/";
		
		File arquivoLido = new File(path + arquivo);
		if(arquivoLido.length() == 0){
			throw new LeituraArquivoException("Arquivo vazio");
		}
		
		try (BufferedReader bf = new BufferedReader(new FileReader(path + arquivo))){
		
			String linha = bf.readLine();
			while (linha != null){
				analisaLinha(linha);
				String[] vect = linha.split("->");
				arquivoProcessado.put(vect[0], vect[1]);
				linha = bf.readLine();
			}
			
			
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo" + e.getMessage());
		}
		
		return arquivoProcessado;
	}
	
	private static void analisaLinha(String linha) throws LeituraArquivoException{
		
		if(!linha.contains("->") || contaCaracteres(linha) > 1){
			throw new LeituraArquivoException("Formato de arquivo invalido");
		}
		
	}
	
	private static int contaCaracteres(String linha){
		int index = 0;
		List<String> caracteresSeparados = new ArrayList<String>();
		int quantidadeCaracterEspecial = 0;
		
		String linhaAlterada = linha.replaceAll("->", "0");
		
		while(index < linhaAlterada.length()){
			caracteresSeparados.add(linhaAlterada.substring(index, index+1));
			index++;
		}
		
		for(String c : caracteresSeparados){
			if (c.equals("0")){
				quantidadeCaracterEspecial++;
			}
		}
		
		return quantidadeCaracterEspecial;
	}
	
}
