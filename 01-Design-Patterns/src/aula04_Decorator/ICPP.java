package aula04_Decorator;

//public class ICPP implements Imposto {
	public class ICPP extends TemplateDeImpostoCondicional {
	/*@Override
	public double calcula(Orcamento orcamento) {
		
		if(orcamento.getValor()  > 500){
			return orcamento.getValor() * 0.07;
		}else{
			return orcamento.getValor() * 0.05;
		}
		
	}*/

	@Override
	public double miniTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() > 500;
	}

}
