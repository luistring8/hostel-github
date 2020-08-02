package ProgramaHotel;

import java.util.Locale;
import java.util.Scanner;

import Hospedes.hospedes;

public class ProgramaHotel {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		hospedes[] vet = new hospedes[10];
		
		System.out.println("Quantos quartos serão disponibilizados? ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i<=n ; i++) {
			System.out.println();
			System.out.println("Hóspede #" + i);
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int nQuarto = sc.nextInt();
			vet[nQuarto] = new hospedes(nome, email);
					
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i = 0 ; i<10 ; i++) {
			if(vet[i]!=null) {
				System.out.println(i + ": " + vet[i]);
				
			}
			
			sc.close();
		}
	
		
		
		
		
	}
	

}
