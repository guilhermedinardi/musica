package musicas;

public class Interprete {

	private String nomeInterprete;

	
	public Interprete() {
		
	}
	
	public Interprete(String nome) {
		this.nomeInterprete = nome;
		
	}

	public String getNomeInterprete() {
		return nomeInterprete;
		
	}
	
	public void printTipoInterprete() {
		System.out.println("Interprete");
		
	}

}
