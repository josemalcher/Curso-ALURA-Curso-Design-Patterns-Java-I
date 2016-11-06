package aula06_Builder;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {

		NotaFIscalBuilder criador = new NotaFIscalBuilder();
		criador.paraEmpresa("EMPRESA NOME")
		.comCnpj("123.456.789/0001-10")
		.comItem(new ItemDaNota("item 1", 100.0))
		.comItem(new ItemDaNota("item 2", 200.0))
		.comItem(new ItemDaNota("item 3", 300.0))
		
		
		.comObservacoes("Observaçoes qualquer")
		.naDataAtual();
		
		NotaFiscal nf = criador.constroi();
		
		System.out.println(nf.getValorBruto());

	}
}
