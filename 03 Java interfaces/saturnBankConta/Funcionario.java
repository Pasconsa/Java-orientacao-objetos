
public class Funcionario {
	String Nome;
	String Cpf;
	Double Salario;
	
	
	//funcionario tem  bonificação, de 10% do salário,
	public double getBonificacao() {  
	    return this.Salario * 0.1;
	}
	
	

	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public Double getSalario() {
		return Salario;
	}
	public void setSalario(Double salario) {
		Salario = salario;
	}
	
	

}
