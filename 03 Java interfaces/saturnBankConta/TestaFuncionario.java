//Objetivo testar cadastro funcionario
public class TestaFuncionario {
	
	    public static void main(String[] args) {

	        Funcionario saulo = new Funcionario();

	        saulo.setNome("Saulo Pascon");
	        saulo.setCpf("223355646-9");
	        saulo.setSalario(2590.80);

	        System.out.println(saulo.getNome());
	        System.out.println(saulo.getBonificacao());

	    }

	

}