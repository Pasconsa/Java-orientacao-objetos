
public class ContaCorrente extends Conta {  // construtor n�o � herdado necess�rio fazer manualmente.
	
	public ContaCorrente(int agencia, int numero) {   //02 contrutor manual class Conta
		super(agencia, numero);
		
	}
	
	//exercicio a regra de saque � diferente entre as contas tem uma taxa de 20 cents
	
	@Override // copilador verifica as regras
		public boolean saca(double valor) {
			double valorASacar = valor + 0.2;  //colocar o valor que deseja sacar do saldo a taxa de 20 cents observe teste conta
			return super.saca(valorASacar);
		}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;    //atribui��o saldo n�o � visivel porque � private ent�o passar para protec
		
	}
	
	
}


		
