package com.joshua;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
//		18. Fa�a um programa que pe�a um n�mero inteiro e determine se ele �
//			ou n�o um n�mero primo. Um n�mero primo � aquele que � divis�vel
//			somente por ele mesmo e por 1.
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		boolean primo = true;
		
		System.out.println("Digite um n�mero inteiro para determinar se � primo ou n�o");
		num = scan.nextInt();
		
		for(int i=2; i<num; i++){
			if(num % i == 0){
				System.out.println("N�o � primo - divis�vel por: "+i);
				primo = false;
			}
		}
		
		if(primo){
			System.out.println("� N�mero Primo");
		}
	}
}
