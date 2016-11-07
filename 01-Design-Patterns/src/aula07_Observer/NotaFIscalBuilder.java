package aula07_Observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFIscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorTotal;
	private double impostos;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private String observacoes;
	private Calendar data;
	
	//observer
	private List<AcaoAposGerarNota> todaAcoesASeremExecutadas;
	
	
	//observer
	public NotaFIscalBuilder() {
		this.todaAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	}
	
	//observer
	public void adicionaAcao(AcaoAposGerarNota acao){
		this.todaAcoesASeremExecutadas.add(acao);
	}

	public NotaFIscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFIscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFIscalBuilder comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public NotaFIscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFIscalBuilder naDataAtual() {
		this.data = Calendar.getInstance();
		return this;

	}

	public NotaFiscal constroi() {

		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

		/*new EnviadorDeEmail().enviaPorEmail(nf);
		new NotaFiscalDAO().salvaNoBanco(nf);;
		new EnviadorDeEmail().enviaPorEmail(nf);;
		new Impressora().imprime(nf);*/
		// criando a interface

		for (AcaoAposGerarNota acao : todaAcoesASeremExecutadas) {
			acao.executa(nf);
		}
		
		return nf;
	}

}
