
//Controle de bonificação dos gerentes

public class ControleBonificacao {

	private double soma;                    //atributo soma
	
	public void registra(Funcionario f) {   //metodo registra
	    double boni = f.getBonificacao();
	    this.soma = this.soma + boni;
	}

	public double getSoma() {               //metodo get soma
	    return this.soma;
	}
}
