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

		System.out.println("Menu de opções. Digite a opção que deseja:");
		System.out.println("1 - T.I.");
		System.out.println("2 - Administrativo.");
		System.out.println("3 - Recursos Humanos.");
		System.out.println("4 - Financeiro.");
		System.out.println("5 - Jurídico.");

		System.out.println("Digite a opção: ");
		Scanner t = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		opcao = t.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite a sua função em T.I:");
			digitefuncao = t.next();
			break;
		case 2:
			System.out.println("Digite a sua função em ADM:");
			digitefuncao = s.nextLine();
			break;
		case 3:
			System.out.println("Digite a sua função em RH:");
			digitefuncao = s.nextLine();
			break;
		case 4:
			System.out.println("Digite a sua função em Financeiro:");
			digitefuncao = s.nextLine();
			break;
		case 5:
			System.out.println("Digite a sua função em Jurídico:");
			digitefuncao = s.nextLine();
			break;

		default:
			System.out.println("Opção inválida!");
			break;
		}

		if (opcao < 6 && opcao > 0) {

			System.out.println("Digite o seu salário:");
			salario = t.nextDouble();

			System.out.println("Digite o percentual de aumento:");
			aumento = t.nextDouble();
			aumento = aumento / 100;
			novosalario = (salario * aumento) + salario;

			System.out.println("A sua função é: " + digitefuncao);
			System.out.println("O salario antes do aumento era: " + salario);
			System.out.println("O novo salario é: " + novosalario);

			t.close();
		}
	}
}