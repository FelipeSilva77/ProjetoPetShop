package sistemaDeControle;

public class calculoAtendimentoCachorro extends CalculoValorAtendimento {

	public calculoAtendimentoCachorro(double tamanho) {
		super(tamanho);
	}
	
	public calculoAtendimentoCachorro(double tamanho,boolean porte) {
		super(tamanho,porte);
	}
	
	public double calculoTosa() {
		return getTamanho() * 1.0;
	}
	
	public double calculoBanho() {
		return getTamanho() * 1.2;
	}
}
