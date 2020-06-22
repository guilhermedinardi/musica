package musicas;

public class Cantor extends Interprete {
	private String tipoDeCantor;
	
	public Cantor(String nome) {
		super(nome);
		
	}
	
	
	public void printTipoInterprete() {
		System.out.println("Cantor");
		
	}
}