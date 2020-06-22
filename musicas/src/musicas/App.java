package musicas;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		/*Interprete interprete = new Interprete("Teto Preto", "Grupo");
		Estilo estilo = new Estilo("Eletronica", "Esse estilo � formado por "
				+ "baterias eletronicas e sintetizadores"); 
		Musica musicaNova = new Musica (interprete, estilo,"6:50", "alta", "mp3", "2017");
		Album novoAlbum = new Album (tituloDoAlbum, anoLancamento, "Turn Blue", "2014");*/
				
		int i =0;
		int j = 0;
		ArrayList<Musica> gravacaoListaMusica = new ArrayList();
		
		
		Scanner scanner = new Scanner(System.in);
		for(i = 0; i < 1; i++) {	
			
			System.out.println("Favor insira um álbum: ");
			String tituloDoAlbum = scanner.nextLine();	
			
			System.out.println("Favor insira uma ano de gravação: ");
			String anoGravacao = scanner.nextLine();
			
			Album album = new Album(tituloDoAlbum, anoGravacao);
			
			for(j = 0; j < 1; j++) {
				System.out.println("Favor insira uma musica: ");
				String nomeDaMusica = scanner.nextLine();
			
				System.out.println("Favor insira um intérprete: ");
				String nomeInterprete = scanner.nextLine();
			
				System.out.println("Favor insira o tipo do intérprete: ");
				String tipoInterprete = scanner.nextLine();
			
				System.out.println("Favor insira o estilo: ");
				String tipoEstilo = scanner.nextLine();
			
				System.out.println("Favor insira a descrição do estilo: ");
				String tipoDescricao = scanner.nextLine();
			
				System.out.println("Favor insira uma duração: ");
				String tempoDuracao = scanner.nextLine();
			
				System.out.println("Favor insira uma qualidade de gravação: ");
				String qualidadeGravacao = scanner.nextLine();
			
				System.out.println("Favor insira um formato: ");
				String formato = scanner.nextLine();
		
			
				Interprete interprete;
				if(tipoInterprete.equals("cantor")) {
					interprete = new Cantor(nomeInterprete);
				} else if(tipoInterprete.equals("Guitarrista")) {
					interprete = new Guitarrista(nomeInterprete);
				} else {
					interprete = new Interprete(nomeInterprete);
				}
				
				interprete.printTipoInterprete();
				
				Estilo estilo = new Estilo(tipoEstilo, tipoDescricao);
						
				Musica definicaoMusica = new Musica(nomeDaMusica, interprete, estilo, tempoDuracao,
					qualidadeGravacao, formato, album);
			
				gravacaoListaMusica.add(definicaoMusica);
			
			
			}
		}
		scanner.close();
		
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("| Musica          | Intérprete      | Duração         | Estilo          | Álbum                 ");
		System.out.println("------------------------------------------------------------------------------------------------");
		for (i = 0; i < 1 ; i++) {
			Musica musica = gravacaoListaMusica.get(i);
			System.out.println("| " + String.format("%-15s", musica.getNomeMusica())
							+ " | " + String.format("%-15s", musica.getInterprete().getNomeInterprete())
							+ " | " + String.format("%-15s", musica.getTempoDuracao())
							+ " | " + String.format("%-15s", musica.getEstilo().getTipoEstilo())
							+ " |"  + String.format("%-15s", musica.getAlbum().getTituloDoAlbum()));
			System.out.println("------------------------------------------------------------------------------------------------");
		}
	
		
	}

}
