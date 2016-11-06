package aula05_State;

public class Aprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento JÁ está APROVADO!");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		
		throw new RuntimeException("Orçamentos APROVADOS não podem ser REPROVADOS");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		
		orcamento.estadoAtual = new Finalizado();
		
	}
}
