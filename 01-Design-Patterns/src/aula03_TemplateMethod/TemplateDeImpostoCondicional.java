package aula03_TemplateMethod;

public abstract class TemplateDeImpostoCondicional implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento);
		}else{
			return miniTaxacao(orcamento);
		}
			
		
	}

	public abstract double miniTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
