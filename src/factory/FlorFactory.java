package factory;

public class FlorFactory {

	public TipoFlor gerarFlor(String nomeFlor) {
		switch (nomeFlor.toUpperCase()) {
		case "ROSA":
			return new Rosa();
		case "ORQUIDIA":
			return new Orquidia();
		default:
			return null;
		}
	}
}
