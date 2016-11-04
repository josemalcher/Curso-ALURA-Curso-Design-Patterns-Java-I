package aula04_Decorator;

import aula01_Strategy.CalculadorDeImpostos;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto){
		super(outroImposto);
	}
	public ISS() {
		
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.6 + calculoDoOutroImpostos(orcamento);
	}

}
