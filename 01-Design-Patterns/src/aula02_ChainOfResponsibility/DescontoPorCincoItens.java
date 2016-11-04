package aula02_ChainOfResponsibility;

public class DescontoPorCincoItens implements Desconto{
	private Desconto proximo;

	public double desconto(Orcamento orcamento){
		
		//mais de 5 itens, desconto!! (mesmo que CalculadorDeDesconto)
		if(orcamento.getItens().size() > 5){
			return orcamento.getValor() * 0.1;
		}

		// caso contrário PROXIMO DESCONTO
		return proximo.desconto(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		// TODO Auto-generated method stub
		
	}
}
