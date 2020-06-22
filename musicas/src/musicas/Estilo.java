package musicas;

public class Estilo {
	
	private String tipoEstilo;
	private String tipoDescricao;
	
	public Estilo() {
		
	}

	public Estilo(String estilo, String descricao) {
		this.tipoEstilo = estilo;
		this.tipoDescricao = descricao;
		
	}

	public String getTipoEstilo() {
		return tipoEstilo;
	}

	public String getTipoDescricao() {
		return tipoDescricao;
	}
	
	
	
}