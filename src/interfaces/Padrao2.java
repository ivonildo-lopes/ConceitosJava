package interfaces;

public class Padrao2 implements Default {
	
	@Override
	public void teste(String msg) {
		Default.super.teste(msg.toUpperCase());
	}

}
