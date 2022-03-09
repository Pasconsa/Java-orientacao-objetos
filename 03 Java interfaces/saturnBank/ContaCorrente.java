
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}	
		
	
	//Metodo nova regra de negocio 20 cents para saque  
	@Override // copilador verifica as regras
		public boolean saca(double valor) {
			double valorASacar = valor + 0.2;  //colocar o valor que deseja sacar do saldo a taxa de 20 cents observe teste conta
			return super.saca(valorASacar);
		}
	
	@Override  //metodo deposita classe filha da conta
	public void deposita(double valor){
	    super.saldo += valor;
	}

}
