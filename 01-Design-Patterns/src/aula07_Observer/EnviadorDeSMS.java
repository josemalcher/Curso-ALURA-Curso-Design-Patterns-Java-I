package aula07_Observer;

public class EnviadorDeSMS implements AcaoAposGerarNota {
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por SMS");

	}
}
