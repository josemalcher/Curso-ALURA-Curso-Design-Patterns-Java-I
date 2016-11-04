package aula02_ChainOfResponsibility;

public class SemDesconto implements Desconto {

	@Override
	public double desconto(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// Não tem PROXIMO

	}

}
