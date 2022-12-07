package Exercio04;
import java.util.Scanner;

public class Executar {

	public static void main(String[] args) {

		Cargo cargo = insereDadosCargo();
		mostrarDadosCargo(cargo);
		Departamento departamento = insereDadosDepartamento();
		mostrarDadosDepartamento(departamento);
		Funcionario funcionario = insereDadosFuncionario(cargo, departamento);
		mostrarDadosFuncionario(funcionario);
	}

	public static Cargo insereDadosCargo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserir os dados do Cargo");
		System.out.println("");
		System.out.println("Digite o IdCargo");
		int idCargo = sc.nextInt();
		System.out.println("");
		System.out.println("Digite o nome cargo ");
		String nome = sc.next();
		System.out.println("");
		System.out.println("Descrição");
		String descricao = sc.next();

		Cargo cargo = new Cargo(idCargo, nome, descricao);
		FaixaSalarialMensal faixaSalarialMensal = new FaixaSalarialMensal();
		System.out.println("Digite o IdSalario");
		faixaSalarialMensal.setIdSalario(sc.nextInt());
		System.out.println("");
		System.out.println("Digite a Faixa Salarial");
		faixaSalarialMensal.setFaixaSalarial(sc.next());
		cargo.setFaixaSalarialMensal(faixaSalarialMensal);
		return cargo;
	}

	public static void mostrarDadosCargo(Cargo cargo) {

		System.out.println("Mostrando dados de Cargo");
		System.out.println("");
		System.out.println("ID CARGO: " + cargo.getIdCargo());
		System.out.println("NOME: " + cargo.getNome());
		System.out.println("DESCRICAO: " + cargo.getDescricao());

	}

	public static Departamento insereDadosDepartamento() {

		Scanner ler = new Scanner(System.in);
		System.out.println("Inserir os dados do Departamento");
		System.out.println("");
		System.out.println("Digite o IdDepartamento");
		int idDepartamento = ler.nextInt();
		System.out.println("");
		System.out.println("Digite o nome do departamento ");
		String nome = ler.next();
		System.out.println("");
		System.out.println("Descrição");
		String descricao = ler.next();

		Departamento departamento = new Departamento(idDepartamento, nome, descricao);

		System.out.println("Digite a categoria é o funcionario:");
		System.out.println("1 - Vendas ");
		System.out.println("2 - Tecnologia ");
		System.out.println("3 - Markting");
		System.out.println("4 - Financeiro");
		int opcao = ler.nextInt();

		switch (opcao) {
		case 1:

			departamento.setCategoriaEnum(CategoriaEnum.VENDAS);

			break;

		case 2:

			departamento.setCategoriaEnum(CategoriaEnum.TECNOLOGIA);
			break;

		case 3:

			departamento.setCategoriaEnum(CategoriaEnum.MARKTING);
			break;

		case 4:

			departamento.setCategoriaEnum(CategoriaEnum.FINANCEIRO);
			break;
		default:
			departamento.setCategoriaEnum(null);
			break;
		}

		return departamento;
	}

	public static void mostrarDadosDepartamento(Departamento departamento) {
		System.out.println("Mostrando dados de Departamento");
		System.out.println("");
		System.out.println("ID Departamento: " + departamento.getIdDepartamento());
		System.out.println("NOME: " + departamento.getNome());
		System.out.println("DESCRICAO: " + departamento.getDescricao());
	}

	public static Funcionario insereDadosFuncionario(Cargo cargo, Departamento departamento) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Inserir os dados do Funcionario");
		System.out.println("");
		System.out.println("Digite o IdFuncionario");
		int idFuncionario = ler.nextInt();
		System.out.println("");
		System.out.println("Digite o nome ");
		String nome = ler.next();
		System.out.println("");
		System.out.println("Sobre Nome ");
		String sobreNome = ler.next();
		System.out.println("Data de nascimento ");
		String dataNascimento = ler.next();
		System.out.println(" Tem Carteira de Trabalho ");
		boolean temCarteiraTrabalho = ler.nextBoolean();
		System.out.println("Quantos anos de experiencia ");
		int anosExp = ler.nextInt();
		System.out.println("Digite o Salario bruto ");
		double salarioBruto = ler.nextDouble();

		Funcionario funcionario = new Funcionario(idFuncionario, nome, sobreNome, dataNascimento, temCarteiraTrabalho,
				anosExp, salarioBruto);

		funcionario.setCargo(cargo);

		funcionario.setDepartamento(departamento);

		System.out.println("Opcões do status do Funcionario");
		System.out.println("1 ATIVO");
		System.out.println("2 BLOQUEADO");

		int opcs = ler.nextInt();

		switch (opcs) {

		case 1:
			funcionario.setStatusFuncionarioEnum(StatusFuncionarioEnum.ATIVO);
			break;
		case 2:
			funcionario.setStatusFuncionarioEnum(StatusFuncionarioEnum.BLOQUEADO);
			break;
		}
		return funcionario;
	}

	public static void mostrarDadosFuncionario(Funcionario funcionario) {
		System.out.println("Mostrando dados DO Funcionario");
		System.out.println("");
		System.out.println("ID funcionario: " + funcionario.getIdFuncionario());
		System.out.println("NOME: " + funcionario.getNome());
		System.out.println("Sobre Nome : " + funcionario.getSobreNome());
		System.out.println(" Data de Nascimento : " + funcionario.getDataNascimento());
		System.out.println("tem carteira de trabalho : " + funcionario.isTemCarteiraTrabalho());
		System.out.println(" quantos anos de Exp : " + funcionario.getAnosExp());
		System.out.println("Salario Bruto : " + funcionario.getSalarioBruto());
		System.out.println("Cargo : " + funcionario.getCargo().getNome());
		System.out.println("Departamento : " + funcionario.getDepartamento().getNome());
		System.out.println("ID Salario: " + funcionario.getCargo().getFaixaSalarialMensal().getIdSalario());
		System.out.println("Faixa Salarial: " + funcionario.getCargo().getFaixaSalarialMensal().getFaixaSalarial());

	}

}
