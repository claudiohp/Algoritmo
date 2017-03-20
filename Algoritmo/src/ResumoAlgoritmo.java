import java.util.Scanner;

public class ResumoAlgoritmo {

	// * BASE DE LÓGICA DE PROGRAMAÇÃO / ALGORITMOS //
	// Comentários e entendimentos e códigos exemplos.

	public static void main(String[] args) {
		
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// EXPLICAÇÕES //////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////

		/*
		 * RESUMO TIPOS PRIMITIVOS E VARIÁVEIS
		 * 
		 * Os tipos primitivos são definidos em 8
		 * Tipos. São eles: 
		 * char, boolean, byte, long, double, short, float,int. 
		 * Cada tipo primitivo tem o seu valor dentro da programação.
		 * 
		 * As variáveis são os parametros no qual definimos para esses tipos
		 * primitivos elas podem ter qualquer nome dentro do alfabeto.
		 * 
		 * Então quando usamos um exemplo. 
		 * int a = 10. 
		 * Definimos o tipo inteiro "int" na variável "a" no qual foi atribuido "=" um valor "10" a ele.
		 * 
		 * Cada Tipo primitivo tem seus tamanhos de execução na memória do PC. Quando
		 * chamados, esses tipos alocam um espaço na memória de acordo com seu
		 * tamanho para agregarem os valores atribuidos a variável na qual você
		 * digitou.
		 * Exemplo int ocupa 4BYTES, long 8 BYTES. Com a evolução de capacidade quase não
		 * tem mais mt valor isso mas é bom ter conhecimento em qual variável chamar sempre,
		 * para evitar o uso de armazenamento de memória.
		 */
		
		
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// EXEMPLOS //////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		
		
		// IMPRESSÃO EM TELA;
		// Comando System.out.println utilizado para imprimir em tela.
		System.out.println();
		
		//SÃO CONSIDERADOS COMO TIPOS PRIMITIVOS - INTEIROS
		// byte, short, int, long 
		
		//CÓDIGOS TESTES.
		
		byte a = 1;
		System.out.println(a);
		
		short abc = 64;
		System.out.println(abc);
		
		int idadeJoao = 18; 
		int idadeMaria = 21; 
		int soma = idadeJoao +idadeMaria; 
		System.out.println(soma);
		
		//IMPORTANTE o long deve utilizar um l no final sempre.
		long cpf = 123523215231321323l; 
		System.out.println(cpf);
		
		//SÃO CONSIDERADOS COMO TIPOS PRIMITIVOS - PONTOS FLUTANTES
		// float, double 
		
		//IMPORTANTE o long deve utilizar um f no final sempre.
		float salario = 3.250f;
		System.out.println(salario);
		
		double PI = 3.14;
		System.out.println(PI * 2);
		
		//SÃO CONSIDERADOS COMO TIPOS PRIMITIVOS - BOOLEANOS - Retorna Verdade ou False.
		// Boolean 
		boolean amigo = true;
		boolean inimigo = !amigo;
		boolean MaiordeIdade = idadeJoao >= 18;
		
		//SÃO CONSIDERADOS COMO TIPOS PRIMITIVOS - LETRA - Imprime o valor de uma letra somente.
		//Char.
		char letra = 'M';
		System.out.println(letra);
		
		//STRING NÃO É UM TIPO PRIMIRIVO É UM OBJETO(VER EM OO). RETORNA VALORES COMO TEXTOS. 
		// String
		String NomeCompleto = "Joao da Silva";
		System.out.println(NomeCompleto);


		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// ESTRUTURAS //////////// ///////////////////////////
		///////////////////////////////////////////////////////////////////////////////////

		 
		// Estruturas de controles referem-se a instruções a serem executadas pelo PC.
		
	
		
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// EXEMPLOS //////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////

		
		// ESTRUTURAS DE CONTROLE - (IF, ELSE IF, ELSE)
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
		int EntradaFesta = valor.nextInt();
		boolean amigodoDono = false;
		
		//SE o valor digitado de entrar na festa for maior ou igual a 18 e ele for amigo
		// tá liberado, SENÃO nem pode entrar.
		if (EntradaFesta >= 18 && amigodoDono) {
			System.out.println("Proíbido a entrada na festa");
		} else {
			System.out.println("Liberado, pode entrar!");
		}

		// ESTRUTURA DE REPETIÇÃO - LOOP - FOR 

		/*
		 * (INICIALIZAÇÃO, CONDIÇÃO, INCREMENTO). 
		 * Exemplo: 
		 * For(INICIALIZAÇÃO INT I = 0; CONDIÇÃO I < OU > OU >= OU <= 10); 
		 * INCREMENTO I = I + 1 OU I = I -1){ }
		 */
		
		/* Exemplo de acordo com o código. 
		 * ENQUANTO( int i = 0; I que é 0 é menor ou igual a 100?; Sim e Não. Ok, então i = 0 + 1.)
   		   ENQUANTO ( int i = 0; i agora é 1, porque i = i + 1, na prática 0 + 1 = 1
		   então, 1 é menor ou igual a 100? Sim e Não. Então i = 1 + 1. Depois vai ser 2 +1)
		   E assim vai até chegar a 100. Isso é um loop de repetição.
		*/
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("Parabéns pelo seu aniversio" + i);
		}

		
		//ESTRUTURA DE REPETIÇÃO - WHILE - PARECIDA COM FOR
		  
		//(INICIALIZAÇÃO){ CONDIÇÃO(); INCREMENTO;
		 
		int j = 1;
		while (j <= 99) {
			System.out.println("Parabéns pelo aniversário" + j);
			j++;

		}
		
		//IMPORTANTE.
		// Podem ser criadas outras estrutras dentro de estruturas por exemplo abaixo
		// IF dentro do FOR.

		int multiplicador = 2;
		for (int i = 0; i < 10; i++) {

			if (i % 2 == 0) {
				int numeroqualquer = 10;
				System.out.println(i * multiplicador);
				System.out.println(numeroqualquer);
			}

			// -> System.out.println(numeroqualquer);
			// Não conseguimos imprimir uma condição fora do IF quando declarado
			// dentro dele.
			// a variável só é definida dentro do ESCOPO dela própria.
		}

		
		
		 // ESTRUTURA DE CONTROLE - SWITCH 
		 
		 /* Parecido com o IF, cria condições e vai varrendo todas as condições
		 * de acordo com o q for solicitado. Default é parecido com o ELSE.
		 * DETALHE!! embaixo de cada case eu posso colocar um break para q ele
		 * pare a impressão aonde eu quero.
		 */
		
		
		/* Exemplo com o código: 
		Quando digitar um numero se eu digitar 1 ele vai imprimir Janeiro 
		se eu digitar 2 ele vai imprimir Fevereiro se eu digitar 3 ele vai imprimir Março.
		*/
		System.out.println("Digite uma opcao: ");
		int num = valor.nextInt();

		switch (num) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		default:
			System.out.println("Numero inválido");
			break;
		}

		/*
		 * ARRAY - Como se fosse um reservatório de dados, onde posso alocar
		 * diversos valores em suas posições e assim utiliza-los. LEMBRE-SE o
		 * array sempre é iniciado por 0 não por 1.
		 */

		int array[] = new int[20];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[19] = 100;
		System.out.println(array[0]);
		System.out.println(array[2]);
		System.out.println(array[19] + array[2] + array[0]);
	}
}
