package Lambdas;

@FunctionalInterface // a interface precisa ter apenas um unico metodo
public interface Calculo {

	double executar(double a, double b);

	default String legal() {
		return "legal";
	}
	
	
}
