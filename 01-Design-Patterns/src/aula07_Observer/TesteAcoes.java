package aula07_Observer;

public class TesteAcoes {
	public static void main(String[] args) {
		NotaFIscalBuilder builder = new NotaFIscalBuilder();
		builder.adicionaAcao(new EnviadorDeEmail());
		builder.adicionaAcao(new NotaFiscalDAO());
		builder.adicionaAcao(new EnviadorDeSMS());
		builder.adicionaAcao(new Impressora());

		NotaFiscal nf = builder.paraEmpresa("Caelumm").comCnpj("123").comItem(new ItemDaNota("item 1", 100))
				.comObservacoes("Obs teste").naDataAtual().constroi();
		
		
		System.out.println(nf.getValorBruto());
		
		
	}
}
