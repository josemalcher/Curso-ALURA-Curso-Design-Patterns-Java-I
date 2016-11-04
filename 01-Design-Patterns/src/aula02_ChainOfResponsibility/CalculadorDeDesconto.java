package aula02_ChainOfResponsibility;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {
		/*
		 * //mais de 5 itens, desconto!! if(orcamento.getItens().size() > 5){
		 * return orcamento.getValor() * 0.1; } //segunda regra else
		 * if(orcamento.getValor() > 500.0){ return orcamento.getValor() * 0.07;
		 * } // caso contrário return 0;
		 */
/*		double desconto = new DescontoPorCincoItens().desconto(orcamento);
		if (desconto == 0)
			desconto = new DescontoPorMaisDeQuinhentosReais().desconto(orcamento);
		return 0;*/
		
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		return d1.desconto(orcamento);

	}

}
