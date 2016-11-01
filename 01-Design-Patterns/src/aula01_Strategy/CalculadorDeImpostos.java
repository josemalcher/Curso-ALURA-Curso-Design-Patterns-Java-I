package aula01_Strategy;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto importoQualquer){
		
		double icms = importoQualquer.calcula(orcamento);
		System.out.println(icms);
	}
	
}
