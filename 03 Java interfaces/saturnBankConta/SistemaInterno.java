
public class SistemaInterno {
	
	//metodo autentica criado
	 private int senha = 2222;

	    public void autentica(Autenticavel fa){     //22 Troque referencia metodo autentica p/ receber funcionario autenticavel

	        boolean autenticou = fa.autentica(this.senha);

	        if(autenticou){
	            System.out.println("Pode entrar no sistema");
	        } else {
	            System.out.println("Não pode entrar no sistema");
	        }
	    }
}
