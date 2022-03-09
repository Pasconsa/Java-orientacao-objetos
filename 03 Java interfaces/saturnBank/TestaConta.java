
public class TestaConta {

	public static void main(String[] args) {
	
		//Instancias para teste
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);

		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(100.0);
		
		//Metodo transferir   =  conta cor para conta poup.
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
     }
}
