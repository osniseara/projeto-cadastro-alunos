package basededadosestudantes;

import java.util.Scanner;

public class Estudantes {
	
	private String PrimeiroNome;
	private String SobrenomeCompleto;
	private int Ano;
	private String IdEstudante;
	private String materias;
	private int SaldoMensalidades = 0;
	private  static int CustoDosCursos = 600;
	private static int id = 1000;
	
	

	// construtor usar nomes e ano dos estudantes 
	
	public Estudantes() {
		Scanner in = new Scanner(System.in);
		System.out.println("Entre com o primeiro nome: ");
		this.PrimeiroNome = in.nextLine();
		
		System.out.println("Entre com o segundo nome: ");
		this.SobrenomeCompleto = in.nextLine();
		
		System.out.println("1- Primeiro Ano \n2 -Segundo Ano\n3- Terceiro ano\nEntre com o ano do estudante: ");
		this.Ano = in.nextInt();
		
		setIdEstudante();
		
					
	}
	
	//gerar id de indentifica��o 
	private void setIdEstudante() {
			id++;
		this.IdEstudante =  Ano + " " + id;
	}
	
	//matricular nas mat�rias
	public void materia () {
		do {
			System.out.print("Entre com a materia (S para sair): ");
			Scanner in = new Scanner(System.in);
			String materia = in.nextLine();
			
			if(!materia.equals("S")) {
				materias = materias + "\n  " + materia;
				SaldoMensalidades = SaldoMensalidades + CustoDosCursos;
			}
			else { 
				break;}
		}while (1 != 0);
				}
	//ver saldo
	
	public void condicaoFinanceira () {
		System.out.println("Valor a ser pago �: R$" + SaldoMensalidades);
	}
	
	// pay tuitton
	
	public void pagamentoALuno() {
		//condicaoFinanceira();
		System.out.println("Insira o valor que ser� pago: R$");
		Scanner in = new Scanner(System.in);
		int pagamento = in.nextInt();		
		if(pagamento <= SaldoMensalidades ) {
		SaldoMensalidades = SaldoMensalidades - pagamento;
		System.out.println("Obrigado por pagar o valor d�: R$ "+ pagamento);
		condicaoFinanceira();
		}else {
			System.out.println("Valor Inv�lido!");
		}
	}
	// mostrar status
	
	public String toString() {
		return "Nome " + PrimeiroNome +" "+ SobrenomeCompleto + "\nCursando o: "+ Ano + " ano do ensino m�dio" + "\nMatricula do Estudante: " + IdEstudante +
				"\nMatriculado nas Materias:" + materias + "\nSaldo devedor do aluno � d�: R$" + SaldoMensalidades;
		
		
	}
	
	
}
