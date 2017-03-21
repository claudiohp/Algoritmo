import java.util.Scanner;

public class CargosSalarios {

	public static void main(String[] args) {

		double aumento, novosalario;
		int opcao = 0;
		String digitefuncao = null;
		double salario = 0;

		System.out.println("=============================");
		System.out.println("=======               =======");
		System.out.println("=======   Bem vindo   =======");
		System.out.println("=======               =======");
		System.out.println("=============================\n");

		System.out.println("Menu de op��es. Digite a op��o que deseja:");
		System.out.println("1 - T.I.");
		System.out.println("2 - Administrativo.");
		System.out.println("3 - Recursos Humanos.");
		System.out.println("4 - Financeiro.");
		System.out.println("5 - Jur�dico.");

		System.out.println("Digite a op��o:");
		Scanner t = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		opcao = t.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite a sua fun��o em T.I:");
			digitefuncao = t.next();
			break;
		case 2:
			System.out.println("Digite a sua fun��o em ADM:");
			digitefuncao = s.nextLine();
			break;
		case 3:
			System.out.println("Digite a sua fun��o em RH:");
			digitefuncao = s.nextLine();
			break;
		case 4:
			System.out.println("Digite a sua fun��o em Financeiro:");
			digitefuncao = s.nextLine();
			break;
		case 5:
			System.out.println("Digite a sua fun��o em Jur�dico:");
			digitefuncao = s.nextLine();
			break;

		default:
			System.out.println("Op��o inv�lida!");
			break;
		}

		if (opcao < 6 && opcao > 0) {

			System.out.println("Digite o seu sal�rio:");
			salario = t.nextDouble();

			System.out.println("Digite o percentual de aumento:");
			aumento = t.nextDouble();
			aumento = aumento / 100;
			novosalario = (salario * aumento) + salario;

			System.out.println("A sua fun��o �: " + digitefuncao);
			System.out.println("O salario antes do aumento era: " + salario);
			System.out.println("O novo salario �: " + novosalario);

			t.close();
		}
	}
}