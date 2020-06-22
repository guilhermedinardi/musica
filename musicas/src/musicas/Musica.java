package musicas;



public class Musica {
	
	private String nomeMusica;
	private Interprete interprete;
	private String tempoDuracao;
	private String qualidadeGravacao;
	private String formato;
	private Estilo estilo;
	private Album album;
	

	public Musica() {
		
	}
	
	public Musica(String nomeMusica, Interprete interprete, Estilo estilo, String tempoDuracao, 
			 String qualidadeGravacao, String formato, Album album) {
		
		this.nomeMusica = nomeMusica;
		this.interprete = interprete;
		this.estilo = estilo;
		this.tempoDuracao = tempoDuracao;
		this.qualidadeGravacao = qualidadeGravacao;
		this.formato = formato;	
		this.album = album;

	}

	public String getNomeMusica() {
		return nomeMusica;
	}

	public Interprete getInterprete() {
		return interprete;
	}

	public String getTempoDuracao() {
		return tempoDuracao;
	}

	public String getQualidadeGravacao() {
		return qualidadeGravacao;
	}

	public String getFormato() {
		return formato;
	}


	public Estilo getEstilo() {
		return estilo;
	}
	
	public Album getAlbum() {
		return album;
	}
	
}
