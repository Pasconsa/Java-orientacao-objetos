//Contrato Autenticavel
	//Quem assina este contrato, precisa implementar
		//metodo senha
        // metodo autentica
	
public abstract interface Autenticavel{        //Interfaces, transformando a antiga classe abstrata FuncionarioAutenticavel na interface Autenticavel como abaixo:

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
    
    
}

