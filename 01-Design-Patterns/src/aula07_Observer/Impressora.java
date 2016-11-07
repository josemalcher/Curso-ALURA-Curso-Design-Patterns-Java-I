package aula07_Observer;

public class Impressora implements AcaoAposGerarNota{
	public void executa(NotaFiscal nf) {
		System.out.println("Enviei para IMPRESSORA");

	}
}
