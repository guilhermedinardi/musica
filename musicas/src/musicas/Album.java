package musicas;

import java.util.ArrayList;

public class Album {
	private String tituloDoAlbum;
	private String anoGravacao;
	
	ArrayList<Musica> gravacaoListaAlbum = new ArrayList();
	
	public Album() {
		
	}
	
	public Album(String tituloDoAlbum, String anoGravacao) {
		this.tituloDoAlbum = tituloDoAlbum;
		this.anoGravacao = anoGravacao;
		
	}
	
	public String getTituloDoAlbum() {
		return tituloDoAlbum;
	}

	public String getAnoLancamento() {
		return anoGravacao;
	}
	
}


