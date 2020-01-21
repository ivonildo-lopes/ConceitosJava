package factory;

public class TesteFactory {
	
	public static void main(String[] args) {
		
		FlorFactory fabrica = new FlorFactory();
		
		TipoFlor flor = fabrica.gerarFlor("rosa");
		System.out.println(flor.criarFlor());
		
		flor = fabrica.gerarFlor("orquidia");
		System.out.println(flor.criarFlor());
	}

}
