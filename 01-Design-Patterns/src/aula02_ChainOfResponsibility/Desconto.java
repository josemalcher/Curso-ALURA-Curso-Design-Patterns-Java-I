package aula02_ChainOfResponsibility;

public interface Desconto {

	double desconto(Orcamento orcamento);
	
	void setProximo(Desconto proximo);
	
}
