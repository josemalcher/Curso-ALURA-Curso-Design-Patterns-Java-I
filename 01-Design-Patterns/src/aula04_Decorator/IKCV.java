package aula04_Decorator;

//public class IKCV implements Imposto{
public class IKCV extends TemplateDeImpostoCondicional{	
/*	@Override
	public double calcula(Orcamento orcamento) {

		if (orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento)) {
			return orcamento.getValor() * 0.10;
		} else {
			return orcamento.getValor() * 0.05;
		}

	}*/

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {

		for(Item item : orcamento.getItens()){
			if(item.getValor() > 100){
				return true;
			}
		}
		
		return false;
	}

	@Override
	public double miniTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}
}
