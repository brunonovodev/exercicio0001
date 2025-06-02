package application;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> fun = new ArrayList<>();
		
		System.out.println("Quantos funcionários iremos cadastrar?");
		Integer n = sc.nextInt();
		sc.nextLine();
		
		char opcao;
		for (int i = 0; i < n; i++) {
			do {
			
			System.out.print("Funcionário terceirizado? s/n ");
			opcao = sc.nextLine().trim().toLowerCase().charAt(0);
			System.out.println("Opção inválida, favor responder com s ou n");	
			}
			while ( opcao != 's' && opcao != 'n'); {
			
			
			}if (opcao == 's') {
				
				for (int j = 0; j < n; j++) {
					
				System.out.println(" funcionário Terceirizado " + ( i  + 1 ));
				System.out.print("Nome: ");
				String name = sc.nextLine()	;
				
				System.out.print("Horas Trabalhadas:");
				Integer horas = sc.nextInt()	;
				sc.nextLine();
				
				System.out.print("Valor por hora:");
				Double valorPorHora = sc.nextDouble();
				
				System.out.print("Valor adicional:");
				Double adicional = sc.nextDouble();
				
				fun.add(new FuncionarioTerceirizado(name, horas, valorPorHora, adicional));
				
				}
				
			} else if (opcao == 'n') {
				System.out.println(" funcionário Comum " + ( i  + 1 ));
				System.out.print("Nome: ");
				String name = sc.nextLine()	;
				
				System.out.print("Horas Trabalhadas:");
				Integer horas = sc.nextInt()	;
				sc.nextLine();
				
				System.out.print("Valor por hora:");
				Double valorPorHora = sc.nextDouble();
				
				fun.add(new Funcionario(name, horas, valorPorHora));
			}
		
			
			System.out.println();
			
		
		}
		for ( Funcionario f : fun) {
			System.out.println();
			System.out.println(f);
		
		}
	
		for ( Funcionario ff : fun ) {
		System.out.println(ff.mensagem());
		}
		
		
	}
}
	
		
		

		
		
		
			

