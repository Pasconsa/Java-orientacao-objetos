
public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override  //metodo deposita classe filha da conta
	public void deposita(double valor){
	    super.saldo += valor;
	}

}
