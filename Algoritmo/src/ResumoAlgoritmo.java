import java.util.Scanner;

public class ResumoAlgoritmo {

	// * BASE DE L�GICA DE PROGRAMA��O / ALGORITMOS //
	// Coment�rios e entendimentos e c�digos exemplos.

	public static void main(String[] args) {
		
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// EXPLICA��ES //////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////

		/*
		 * RESUMO TIPOS PRIMITIVOS E VARI�VEIS
		 * 
		 * Os tipos primitivos s�o definidos em 8
		 * Tipos. S�o eles: 
		 * char, boolean, byte, long, double, short, float,int. 
		 * Cada tipo primitivo tem o seu valor dentro da programa��o.
		 * 
		 * As vari�veis s�o os parametros no qual definimos para esses tipos
		 * primitivos elas podem ter qualquer nome dentro do alfabeto.
		 * 
		 * Ent�o quando usamos um exemplo. 
		 * int a = 10. 
		 * Definimos o tipo inteiro "int" na vari�vel "a" no qual foi atribuido "=" um valor "10" a ele.
		 * 
		 * Cada Tipo primitivo tem seus tamanhos de execu��o na mem�ria do PC. Quando
		 * chamados, esses tipos alocam um espa�o na mem�ria de acordo com seu
		 * tamanho para agregarem os valores atribuidos a vari�vel na qual voc�
		 * digitou.
		 * Exemplo int ocupa 4BYTES, long 8 BYTES. Com a evolu��o de capacidade quase n�o
		 * tem mais mt valor isso mas � bom ter conhecimento em qual vari�vel chamar sempre,
		 * para evitar o uso de armazenamento de mem�ria.
		 */
		
		
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// EXEMPLOS //////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////
		
		
		// IMPRESS�O EM TELA;
		// Comando System.out.println utilizado para imprimir em tela.
		System.out.println();
		
		//S�O CONSIDERADOS COMO TIPOS PRIMITIVOS - INTEIROS
		// byte, short, int, long 
		
		//C�DIGOS TESTES.
		
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
		
		//S�O CONSIDERADOS COMO TIPOS PRIMITIVOS - PONTOS FLUTANTES
		// float, double 
		
		//IMPORTANTE o long deve utilizar um f no final sempre.
		float salario = 3.250f;
		System.out.println(salario);
		
		double PI = 3.14;
		System.out.println(PI * 2);
		
		//S�O CONSIDERADOS COMO TIPOS PRIMITIVOS - BOOLEANOS - Retorna Verdade ou False.
		// Boolean 
		boolean amigo = true;
		boolean inimigo = !amigo;
		boolean MaiordeIdade = idadeJoao >= 18;
		
		//S�O CONSIDERADOS COMO TIPOS PRIMITIVOS - LETRA - Imprime o valor de uma letra somente.
		//Char.
		char letra = 'M';
		System.out.println(letra);
		
		//STRING N�O � UM TIPO PRIMIRIVO � UM OBJETO(VER EM OO). RETORNA VALORES COMO TEXTOS. 
		// String
		String NomeCompleto = "Joao da Silva";
		System.out.println(NomeCompleto);


		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// ESTRUTURAS //////////// ///////////////////////////
		///////////////////////////////////////////////////////////////////////////////////

		 
		// Estruturas de controles referem-se a instru��es a serem executadas pelo PC.
		
	
		
		///////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////// EXEMPLOS //////////////////////////////////////////
		///////////////////////////////////////////////////////////////////////////////////

		
		// ESTRUTURAS DE CONTROLE - (IF, ELSE IF, ELSE)
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite a sua idade:");
		int EntradaFesta = valor.nextInt();
		boolean amigodoDono = false;
		
		//SE o valor digitado de entrar na festa for maior ou igual a 18 e ele for amigo
		// t� liberado, SEN�O nem pode entrar.
		if (EntradaFesta >= 18 && amigodoDono) {
			System.out.println("Pro�bido a entrada na festa");
		} else {
			System.out.println("Liberado, pode entrar!");
		}

		// ESTRUTURA DE REPETI��O - LOOP - FOR 

		/*
		 * (INICIALIZA��O, CONDI��O, INCREMENTO). 
		 * Exemplo: 
		 * For(INICIALIZA��O INT I = 0; CONDI��O I < OU > OU >= OU <= 10); 
		 * INCREMENTO I = I + 1 OU I = I -1){ }
		 */
		
		/* Exemplo de acordo com o c�digo. 
		 * ENQUANTO( int i = 0; I que � 0 � menor ou igual a 100?; Sim e N�o. Ok, ent�o i = 0 + 1.)
   		   ENQUANTO ( int i = 0; i agora � 1, porque i = i + 1, na pr�tica 0 + 1 = 1
		   ent�o, 1 � menor ou igual a 100? Sim e N�o. Ent�o i = 1 + 1. Depois vai ser 2 +1)
		   E assim vai at� chegar a 100. Isso � um loop de repeti��o.
		*/
		
		for (int i = 0; i <= 100; i++) {
			System.out.println("Parab�ns pelo seu aniversio" + i);
		}

		
		//ESTRUTURA DE REPETI��O - WHILE - PARECIDA COM FOR
		  
		//(INICIALIZA��O){ CONDI��O(); INCREMENTO;
		 
		int j = 1;
		while (j <= 99) {
			System.out.println("Parab�ns pelo anivers�rio" + j);
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
			// N�o conseguimos imprimir uma condi��o fora do IF quando declarado
			// dentro dele.
			// a vari�vel s� � definida dentro do ESCOPO dela pr�pria.
		}

		
		
		 // ESTRUTURA DE CONTROLE - SWITCH 
		 
		 /* Parecido com o IF, cria condi��es e vai varrendo todas as condi��es
		 * de acordo com o q for solicitado. Default � parecido com o ELSE.
		 * DETALHE!! embaixo de cada case eu posso colocar um break para q ele
		 * pare a impress�o aonde eu quero.
		 */
		
		
		/* Exemplo com o c�digo: 
		Quando digitar um numero se eu digitar 1 ele vai imprimir Janeiro 
		se eu digitar 2 ele vai imprimir Fevereiro se eu digitar 3 ele vai imprimir Mar�o.
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
			System.out.println("Mar�o");
			break;
		default:
			System.out.println("Numero inv�lido");
			break;
		}

		/*
		 * ARRAY - Como se fosse um reservat�rio de dados, onde posso alocar
		 * diversos valores em suas posi��es e assim utiliza-los. LEMBRE-SE o
		 * array sempre � iniciado por 0 n�o por 1.
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
