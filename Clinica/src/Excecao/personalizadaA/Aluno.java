package Excecao.personalizadaA;

import java.util.Objects;

public class Aluno {

	public final String name;
	public final double nota;
	public final boolean bomComportamento;
	

	public Aluno(String name, double nota) {
		this(name, nota, true);
	}

	public Aluno(String name, double nota, boolean bomComportamento) {
		this.name = name;
		this.nota = nota;
		this.bomComportamento = bomComportamento;

	}

	public String toString() {
		return name + " Tem nota: " + nota;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bomComportamento, name, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
}
