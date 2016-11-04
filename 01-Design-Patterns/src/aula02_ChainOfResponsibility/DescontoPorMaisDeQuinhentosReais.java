package aula02_ChainOfResponsibility;

public class DescontoPorMaisDeQuinhentosReais implements Desconto{
	private Desconto proximo;

	public double desconto(Orcamento orcamento) {

		// mais de 500 itens, desconto!! (mesmo que CalculadorDeDesconto)
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		} else {
			// caso contrário PROXIMO DESCONTO
			return proximo.desconto(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		// TODO Auto-generated method stub
		
	}
}
