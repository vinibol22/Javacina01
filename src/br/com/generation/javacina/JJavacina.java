package br.com.generation.javacina;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JJavacina {

	public static void main(String[] args) {
				
				int laudov=0;
				Scanner entrada = new Scanner(System.in);

				Pessoa p = new Pessoa();
			

				System.out.println("Por favor insira seu nome: ");
				p.setnome(entrada.nextLine());
				
				while(p.getnome().length()<=2 || p.getnome().length()>=30) {
				System.out.println("-------------------------------------------------------");
				System.out.println("Nome incorreto ");
				System.out.println("Digite novamente");
				p.setnome(entrada.nextLine());
					
				}
				
				try {			
				System.out.println();
				System.out.println("-------------------------------------------------------");		
				System.out.println("Digite sua idade: ");
				p.setidade(entrada.nextInt());
				
			
				
				while(p.getidade()<0 ||p.getidade()>130) {
					System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println("Idade incorreta");
					System.out.println("Digite novamente");
					p.setidade(entrada.nextInt());

					}


				if(p.getidade()>=80) {

						PessoassemComorbidade ps = new PessoassemComorbidade();
						ps.setnome(p.getnome());
						ps.setidade(p.getidade());

						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println("Nome: " + ps.getnome());
						System.out.println("Idade: " + ps.getidade());
						
						ps.setData(ps.getidade());
						System.exit(0);

					}
					if(p.getidade()<18) {

					PessoassemComorbidade ps = new PessoassemComorbidade();
					ps.setnome(p.getnome());
					ps.setidade(p.getidade());
					
					
					System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println("Nome: " + ps.getnome());
					System.out.println("Idade: " + ps.getidade());
					ps.setData(ps.getidade());
						
					System.exit(0);
									}
			
					System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println("Digite o n�mero caso tenha alguma dessas comorbidades: ");
					System.out.println();
					System.out.println("1-Obesidade grau 3" + "\n" + "2-Diabetes" + "\n" + "3-Doen�a do cora��o " + "\n"
						+ "4-Doen�a respirat�ria " + "\n" + "5-Caso tenha nehuma dessas op��es \n");
			
					
					p.setpresen�adeComorbidade(entrada.nextInt());	
				
					
					while (p.getpresen�adeComorbidade() < 1 || p.getpresen�adeComorbidade() >=6 ) {
					System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println("Comorbidade incorreta ");
					System.out.println("Digite novamente");
					p.setpresen�adeComorbidade(entrada.nextInt());
				}

				if (p.getpresen�adeComorbidade() == 1 || p.getpresen�adeComorbidade() == 2 || p.getpresen�adeComorbidade() == 3
						|| p.getpresen�adeComorbidade() == 4) {
					PessoacomComorbidade pc = new PessoacomComorbidade();

					pc.setnome(p.getnome());
					pc.setidade(p.getidade());
					
					System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println("Nome: " + pc.getnome());
					System.out.println("Idade: " + pc.getidade());
					pc.setcomorbidade(p.getpresen�adeComorbidade());

					}
				
			
				
				
			   if (p.getpresen�adeComorbidade() == 5) {
				   	System.out.println();
					System.out.println("-------------------------------------------------------");
					System.out.println("Digite o n�mero respectivo de sua complica��o m�dica:");
					System.out.println();
					System.out.println("1-Voc� toma algum rem�dio anticoagulante "+"\n"+"2-Voc� tem alergia a algum componente da vacina"+"\n"+"3-Nehuma das op��es \n");
					
					p.setComplicavacia(entrada.nextInt());		
					
					while(p.getComplicavacia()<1||p.getComplicavacia()>3) {
							System.out.println("Digito inv�lido ");
							System.out.println("Digite novamente ");
							System.out.println();
							System.out.println("-------------------------------------------------------");
							System.out.println("1-Voc� toma algum rem�dio anticoagulante "+"\n"+"2-Voc� tem alergia a algum componente da vacina"+"\n"+"3-Nehuma das op��es \n");
							p.setComplicavacia(entrada.nextInt());
						}
				    if (p.getComplicavacia() == 3) {
				    	
						PessoassemComorbidade ps = new PessoassemComorbidade();
						ps.setnome(p.getnome());
						ps.setidade(p.getidade());

						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println("Nome: " + ps.getnome());
						System.out.println("Idade: " + ps.getidade());
						ps.setData(ps.getidade());
						}
						
						}
						
						laudov=entrada.nextInt();
						
						
						while(laudov<1||laudov>2) {
						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println("Digito inv�lido ");
						System.out.println("Digite novamente ");
						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println("Voc� tem algum laudo medico confirmando a sua possibilidade de se vacinar?"+"\n"+"1-Sim"+"\n"+"2-N�o \n");
						
						
						
						
						laudov=entrada.nextInt();}
					
					
						
						
						if(laudov==1) {
						
						PessoassemComorbidade ps = new PessoassemComorbidade();
						ps.setnome(p.getnome());
						ps.setidade(p.getidade());

						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println("Nome: " + ps.getnome());
						System.out.println("Idade: " + ps.getidade());
						ps.setData(ps.getidade());
							}
						if(laudov==2) {
							
							System.out.println("-------------------------------------------------------");
							System.out.println("Infelizmente voc� n�o poder� se vacinar at� apresentar um laudo com autoriza��o.");
							}
						
	
							}
						catch(InputMismatchException e) {
						System.out.println();
						System.out.println("-------------------------------------------------------");
						System.out.println("N�mero inv�lido Caracters N�o suportado pelo sistema");
						System.out.println("Reinicie o Programa");

							}
					
					
					entrada.close();
							}
				
							}

					