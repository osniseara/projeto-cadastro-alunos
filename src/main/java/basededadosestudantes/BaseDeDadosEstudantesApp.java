package basededadosestudantes;

import java.util.Scanner;

public class BaseDeDadosEstudantesApp {
	
	public static void main(String[]args) {
		
		//perguntar quantos usuarios serão adicionados
		
		System.out.println("Adicione o número de estudantes que serão matriculados: ");
		Scanner in = new Scanner(System.in);
		int numeroDeEstudantes =  in.nextInt();
		Estudantes[] estudantes = new Estudantes[numeroDeEstudantes];
		
		for (int n = 0; n < numeroDeEstudantes; n++) {
			
			estudantes[n] = new Estudantes();
			estudantes[n].materia();
			estudantes[n].condicaoFinanceira();
			estudantes[n].pagamentoALuno();
			System.out.println(estudantes[n].toString());
		} 		
		for (int n = 0; n < numeroDeEstudantes; n++) {
			System.out.println(estudantes[n].toString());
		}
			
		
		//criar n numeros de novos estudantes
		
	}

}
