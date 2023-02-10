package br.com.guifer;

import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		
		String aula1 = "curso de informática";
		String aula2 = "curso de informática intermediario";
		String aula3 = "curso de informática avançado";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.forEach(aula -> {
			System.out.println("percorrendo");
			System.out.println(aula);
		});
	}

}
