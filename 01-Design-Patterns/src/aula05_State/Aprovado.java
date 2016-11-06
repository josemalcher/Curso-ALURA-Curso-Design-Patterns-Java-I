package aula05_State;

public class Aprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento J� est� APROVADO!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		
		throw new RuntimeException("Or�amentos APROVADOS n�o podem ser REPROVADOS");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		
		orcamento.estadoAtual = new Finalizado();
		
	}
}
