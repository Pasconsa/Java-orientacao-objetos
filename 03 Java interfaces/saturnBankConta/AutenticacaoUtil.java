	//obj classe responsavel para n�o repeti�ao de codigos do metodo senha
public class AutenticacaoUtil{

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }
}