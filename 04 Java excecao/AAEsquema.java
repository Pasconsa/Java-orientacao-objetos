
/*         Java Pilha
         		objetivo 
         		* PILHA IGUAL SEQUENCIA DE PROGRAMA��O
         		* 05 trabalhar com excess�es de java
         		* 17 Hierarquia de excec�o
         	
 		Class Fluxos
 				*obj: como funciona metodo pilha
 			01 criar 
 			02 copiar c�digo
 			03 testar analisar sequencias do c�digo metodo pilha
 			04 Debugar aplica��o
 					*olhar por dentro do sistema
 			
			05 add codigo para ocorrer erro Aritmetric Exception
			
			06 Tratamento erro try catch try catch
					* trata a excess�o e mostra para  compilador continuar isolando erro
			
			07 copiar codigo try e colar no metodo 2
					try{
		                int a = i / 0;
		            } catch(ArithmeticException ex) {
		                System.out.println("ArithmeticException");
		            }
			08 copiar codigo colar metodo 1
					*
					try{
						    metodo1();
						} catch(ArithmeticException ex) {
						    String msg = ex.getMessage();
						    System.out.println("ArithmeticException " + msg);
						    ex.printStackTrace();
						}
			
			10 Dentro for metodo 2 colocar codigo:
			       *segunda maneira de observar as menssagens e caminhos de erros
						for(int i = 1; i <= 5; i++) {
						    System.out.println(i);
						    Conta c = null;
						    c.deposita();
						}
						}
			
			11  terceira maneira ; colar metodo1
			  
						try {
						    metodo1();
						} catch(ArithmeticException | NullPointerException ex) {
						    String msg = ex.getMessage();
						    System.out.println("Exception " + msg);
						    ex.printStackTrace();
						}
									
			
		Class Conta
			
			09 criar class , + void deposita
			
			
		Class fluxoComTratamento
				*Como lan�ar exce��es.
                *Como atribuir uma mensagem � exce��o
			
			12 copiar classe fluxo essa classe
			13 apague la�o For metodo 2
			14 Instancie ArithmeticException 
			15 lance exce��o metodo 2
			16 lanca�ar excessa�    
			20 kancar exce��o no metodo 2, na classe fluxo vamos substitir o throw.
			
			 
		Class MinhaExcecao
			17 criar
			18 herdar RuntimException
			19 Criar um construtor  para construtor mae Runtimeexception
			
 */
