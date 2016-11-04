package aula04_Decorator;

public abstract class TemplateDeImpostoCondicional extends Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + calculoDoOutroImpostos(orcamento);
		}else{
			return miniTaxacao(orcamento) + calculoDoOutroImpostos(orcamento);
		}
			
		
	}

	public abstract double miniTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
