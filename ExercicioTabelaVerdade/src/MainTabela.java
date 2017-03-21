import java.util.Scanner;

public class MainTabela {
	
	public static void main(String[] args) {
	
	Scanner t = new Scanner(System.in);

	String res1 = "";
	String res2 = "";
	
		System.out.println("Bem vindo ao programa de cálculo lógico usando a Tabela Verdade.");
		System.out.println("Dado as três proposições p,q, r. Resolva a equação. p v (q ^ r) <-> (p v q) ^ (p v r)");
	
		final String arrayp[] = new String[8];
		final String arrayq[] = new String[8];
		final String arrayr[] = new String[8];
		
		arrayp[0] = "| v |";
		arrayp[1] = "| v |";
		arrayp[2] = "| v |";
		arrayp[3] = "| v |";
		arrayp[4] = "| f |";
		arrayp[5] = "| f |";
		arrayp[6] = "| f |";
		arrayp[7] = "| f |";
	
		arrayq[0] = " v |";
		arrayq[1] = " v |";
		arrayq[2] = " f |";
		arrayq[3] = " f |";
		arrayq[4] = " v |";
		arrayq[5] = " v |";
		arrayq[6] = " f |";
		arrayq[7] = " f |";
	
		arrayr[0] = " v |";
		arrayr[1] = " f |";
		arrayr[2] = " v |";
		arrayr[3] = " f |";
		arrayr[4] = " v |";
		arrayr[5] = " f |";
		arrayr[6] = " v |";
		arrayr[7] = " f |";
		
		System.out.println("| p |" + " q |" + " r |" + " (q ^ r) ");
		
		for( int i = 0; i < 8; i++){
	
			System.out.println(arrayp[i] + arrayq[i] + arrayr[i]);
		
		}
	
		final String array1[] = new String[8];
			for (int count = 0; count < array1.length; count++) {
			
				int count1 = 1 + count;
			
				System.out.print("Digite v ou f para q: ");
				res1 = t.next();
			
				System.out.print("Digite v or f para r: ");
				res2 = t.next();
							
						
						if ((res1.equals("v")) && (res2.equals("v"))) {
							
							array1[count] = "   v";
							System.out.println("Resultado lógico na posição " + count1 + " de (q ^ r) é: " + true);
							System.out.println("--------------------------------------------------------------------------");
							
						} else {
							
							array1[count] = "   f";
							System.out.println("Resultado lógico na posição " + count1 + " de (q ^ r) é: " + false);
							System.out.println("--------------------------------------------------------------------------");
							
						 }
			
			}
			
			System.out.println("| p |" + " q |" + " r |" + " (q ^ r) |" + "  p v (q ^ r)");
			  
			for( int i = 0; i < 8; i++){
		  
				System.out.println(arrayp[i] + arrayq[i] + arrayr[i] + array1[i] + "     |");
			
			}
			
		 final String array2[] = new String[8];
		 	for (int count = 0; count < array2.length; count++) {
		 		
		 		int count2 = 1 + count;
		 		
		 		System.out.print("Digite v ou f para p: ");
		 		res1 = t.next();
		 		
		 		System.out.print("Digite v ou f para (q^r): ");
		 		res2 = t.next();
		 		     
			 				 		
						 if (res1.equals("f") && res2.equals("f")) {
	
							 array2[count] = " f";
							 System.out.println("Resultado lógico na posição " + count2 + " de p v (q^ r) é: " + false);
							 System.out.println("--------------------------------------------------------------------------");
							 
						 } else {
							
							 array2[count] = " v";
							 System.out.println("Resultado lógico na posição " + count2 + " de p v (q^ r) é: " + true);
							 System.out.println("--------------------------------------------------------------------------");
							 
						 }
		 
		 	}
		 	
		 	System.out.println("| p |" + " q |" + " r |" + " (q ^r) |" + " p v(q ^ r) |" +" <-->" + " (p v q) ");
	 		
	 		for( int i = 0; i < 8; i++){
	 			  
				System.out.println(arrayp[i] + arrayq[i] + arrayr[i] + array1[i] + "    |     "  + array2[i] + "     |");
			
			}	
		 	
		 final String array3[] = new String[8];
			 for (int count = 0; count < 8; count++) {
			 
				 int count3 = 1 + count;
			 
				 System.out.print("Digite v ou f para p: ");
				 res1 = t.next();
			 
				 System.out.print("Digite v ou f para q: ");
				 res2 = t.next();
			
						 if (res1.equals("f") && res2.equals("f")) {
						 
							 array3[count] = " f";
							 System.out.println("Resultado lógico na posição " + count3 + " de (p v q) é: " + false);
							 System.out.println("--------------------------------------------------------------------------");
							 
						 } else {
						 
							 array3[count] = " v";
							 System.out.println("Resultado lógico na posição " + count3 + " de (p v q) é: " + true);
							 System.out.println("--------------------------------------------------------------------------");
				
						 }
			 }
			
			 System.out.println("| p |" + " q |" + " r |" + " (q ^r) |" + " p v(q ^ r) |" +" <-->" + " | (p v q) |"  + " (p v r) ");
			 
			 for( int i = 0; i < 8; i++){
	 			  
					System.out.println(arrayp[i] + arrayq[i] + arrayr[i] + array1[i] + "    |     "  + array2[i] + "     |      |   " + array3[i] + "    |");
				
				}
			 		
		 final String array4[] = new String[8];
			 for (int count = 0; count < 8; count++) {
				
				 int count4 = 1 + count;
				 
				 System.out.print("Digite v ou f para p: ");
				 res1 = t.next();
				 
				 System.out.print("Digite v ou f para r: ");
				 res2 = t.next();
		
						 if (res1.equals("f") && res2.equals("f")) {
							
							 array4[count] = " f";
							System.out.println("Resultado lógico na posição " + count4 + " de (p v r) é: " + false);
							System.out.println("--------------------------------------------------------------------------");
						
						 } else {
							 
							 array4[count] = " v";
						 	System.out.println("Resultado lógico na posição " + count4 + " de (p v r) é: " + true);
						 	System.out.println("--------------------------------------------------------------------------");
						
						 }
			 }
			
			 System.out.println("| p |" + " q |" + " r |" + " (q ^r) |" + " p v(q ^ r) |" +" <-->" + " | (p v q) |"  + " (p v r) |" + " (p v q) ^ (p v r)");
				 	
			 for( int i = 0; i < 8; i++){
	 			  
					System.out.println(arrayp[i] + arrayq[i] + arrayr[i] + array1[i] + "    |     "  + array2[i] + "     |      |   " + array3[i] + "    |    " + array4[i] + "   | ");
				
				}	
		 
		 final String array5[] = new String[8];
		 	 for (int count = 0; count < 8; count++) {
				 
		 		int count5 = 1 + count;
				 
				 System.out.print("Digite v ou f para (p v q): ");
				 res1 = t.next();
				 
				 System.out.print("Digite v ou f para (q v r): ");
				 res2 = t.next();
		
						 if (res1.equals("v") && res2.equals("v")) {
						
							 array5[count] = " v";
							 System.out.println("Resultado lógico na posição " + count5 + " de ((p v q) ^ (p v r)) é: " + true);
							 System.out.println("--------------------------------------------------------------------------");
						
						 } else {
							 
							 array5[count] = " f";
							 System.out.println("Resultado lógico na posição " + count5 + " de ((p v q) ^ (p v r)) é: " + false);
							 System.out.println("--------------------------------------------------------------------------");
						
						 }
		 	 }
		
		 	System.out.println("| p |" + " q |" + " r |" + " (q ^r) |" + " p v(q ^ r) |" +" <-->" + " | (p v q) |"  + " (p v r) |" + " (p v q) ^ (p v r) |");
		 	
		 	for( int i = 0; i < 8; i++){
	 			  
				System.out.println(arrayp[i] + arrayq[i] + arrayr[i] + array1[i] + "    |     "  + array2[i] + "     |      |   " + array3[i] + "    |    " + array4[i] + "   |        " + array5[i] + "         |" );
			
			}	 
		
		 final String array6[] = new String[8];
			 for (int count = 0; count < 8; count++) {
			 
				 int count6 = 1 + count;
			 
				 System.out.print("Digite v ou f para p v(q ^ r) : ");
				 res1 = t.next();
				 
				 System.out.print("Digite v ou f para ((p v q) ^ ( p v r)): ");
				 res2 = t.next();
		
						 if (res1.equals("v") && res2.equals("v") || res1.equals("f") && res2.equals("f")) {
						
							 array6[count] = "v";
							 System.out.println("Resultado lógico na posição " + count6 + " de p v(q ^ r) " + "<-->" + " ((p v q) ^ ( p v r) é: " + true);
							 System.out.println("--------------------------------------------------------------------------");
						
						 } else {
						 
							 array6[count] = "f";
							 System.out.println("Resultado lógico na posição " + count6 + " de p v(q ^ r) " + "<-->" + " ((p v q) ^ ( p v r) é: " + false);
							 System.out.println("--------------------------------------------------------------------------");
						
						 }
			 }
		
			 System.out.println("| p |" + " q |" + " r |" + " (q ^r) |" + " p v(q ^ r) |" +" <-->" + " | (p v q) |"  + " (p v r) |" + " (p v q) ^ (p v r) |");
			 
			 for( int i = 0; i < 8; i++){
	 			  
					System.out.println(arrayp[i] + arrayq[i] + arrayr[i] + array1[i] + "    |     "  + array2[i] + "     |   " + array6[i] +"  |   " + array3[i] + "     |   " + array4[i] + "   |        " + array5[i] + "         |" );
				
				}
			 
		 if (array6[0].equals("v") && array6[1].equals("v") && array6[2].equals("v") && array6[3].equals("v") && array6[4].equals("v") && array6[5].equals("v") && array6[6].equals("v") && array6[7] == "v") {
			 
			 System.out.println("Parabéns, você conseguiu achar o resultado da equação.");
			 System.out.println("A equação p v (q ^ r) <-> (p v q) ^ (p v r). Tem como todos os resultados da bicondicional, simultaneidade, nos dois sentidos. Portanto, a equação é verdadeira.");
		 
		 } else {
			 
			 System.out.println("O resultado informado não equivale a equação proposta no início, verifique as respostas e refaça.");
			 System.out.println("Pesquise a tabela verdade!");
		
		 	}
	
		}
	}

