//Obj Verificar quem pode entrar no sistema codigo correto
public class TesteSistema {
    
	//31 adicionar todo codigo
	public static void main(String[] args) {
		Gerente g = new Gerente ();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(1111);
		
	SistemaInterno si = new SistemaInterno();
	si.autentica(g);
	si.autentica(adm);
	si.autentica(cliente);

	}

}
