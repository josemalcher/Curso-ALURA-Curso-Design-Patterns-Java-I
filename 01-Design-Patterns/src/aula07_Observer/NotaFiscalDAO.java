package aula07_Observer;

public class NotaFiscalDAO implements AcaoAposGerarNota {
	public void executa(NotaFiscal nf) {
		System.out.println("Salvei no Banco");
		
	}
}
