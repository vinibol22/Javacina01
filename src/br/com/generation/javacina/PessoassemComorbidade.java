package br.com.generation.javacina;

public class PessoassemComorbidade extends Pessoa {
	

	public void setData(int idade) {
		this.idade = idade;
		
		if(idade>=80) {
			System.out.println("Sua vacina��o come�ar� amanh� e ir� at� o dia 20 deste m�s");
			
		}
		
		else if(idade>=70 && idade<80) {
			System.out.println("Sua vacina��o come�ar� dia 21 at� o dia 28 de agosto");	
			
		}
		else if(idade>=60 && idade<70) {
			System.out.println("Sua vacina��o come�ar� dia 29 de agosto at� o dia 12 de setembro");	
			
		}
		else if(idade>=50 && idade<60) {
			System.out.println("Sua vacina��o come�ar� dia 13 de setembro at� o dia 27");	
			
		}
		else if(idade>=40 && idade<50) {
			System.out.println("Sua vacina��o come�ar� dia 28 de setembro at� o dia 12 de outubro");	
			
		}
		else if(idade>=30 && idade<40) {
			System.out.println("Sua vacina��o come�ar� dia 13 de outrubro at� o dia 26");	
			
		}
		else if(idade>=18 && idade<=29) {
			System.out.println("Sua vacina��o come�ar� dia 27 de outubro at� o dia 10 de novembro");	
			
		}
		else if(idade<18) {
			System.out.println("Ainda n�o come�ou o agendamento para sua faixa de idade");
			System.out.println("Fique atento ao calend�rio de vacina��o do seu munic�pio");
		}
		
		
	}

}