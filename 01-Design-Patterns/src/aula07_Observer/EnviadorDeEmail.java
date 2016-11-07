package aula07_Observer;

public class EnviadorDeEmail implements AcaoAposGerarNota {
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei por email");

	}
}
