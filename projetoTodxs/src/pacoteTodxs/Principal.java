package pacoteTodxs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
       
       //Variav�is
        double valor = 0;  //Valor desejado de cr�dito pelo usu�rio
        int parcelas = 49; //Atribu�do o valor 49 para primeira entrada no la�o "while"
        double juros = 0;  //Juros com base no que o usu�rio optar
        String contrato;   //Vari�vel para receber o aceite do usu�rio
        double total = 0;  //Var�vel que receber� o cr�dito solicitado somado aos juros
        DecimalFormat df = new DecimalFormat("#.##");  //Formata os valores decimais em 2 casas

        
        //
        System.out.print("Informe o Valor que deseja financiar : R$");
        valor = scan.nextDouble();
        
        //Informa��es para o usu�rio escolher o n�mero de parcelas que melhor lhe atende
        System.out.println("\n \n           ** Condi��es **  ");
        System.out.println(" Parcelado em at� 12x com juros de 10%   ");
        System.out.println(" Parcelado em at� 24x com juros de 30%   ");	
        System.out.println(" Parcelado em at� 36x com juros de 40%   ");	
        System.out.println(" Parcelado em at� 48x com juros de 50%   \n \n");	
        
        //While usado para "for�ar" o usu�rio a digitar uma quantidade de parcelas v�lida
        while (parcelas > 48) {
        System.out.print("Informe o n�mero de parcelas desejadas (Max 48x) : ");
        parcelas = scan.nextInt(); 
        
      //Primeira condi��o para financiamento em at� 12x     
      if (parcelas <= 12 ) {
          juros = (valor * 10) / 100; //C�lculo dos juros
          total = (valor + juros) / parcelas;  //Somat�rio dos juros com o valor desejado e divis�o pelo n�mero de parcelas
          System.out.println("\n \nSeu financiamento no valor R$" + df.format(valor) +  " ser� de : " + parcelas + "x de  R$" + df.format(total) + " com juros totais de 10% \n \n");
          System.out.print("Digite sim para contratar : ");
          contrato = scan.next();
          if (contrato == ("sim") || contrato == ("SIM") || contrato == ("Sim") )     	//Condi��o para caso o usu�rio aceite o financiamento.  
        	  System.out.print("Contrata��o realizada com sucesso !");
          
          else System.out.println("Contrata��o negada.");
          } 
       
      //Segunda condi��o para financiamento at� 24x
      else if (parcelas > 12 && parcelas <= 24) {
            juros = (valor * 30) / 100;
            total = (valor + juros) / parcelas;
            System.out.println("\n \nSeu financiamento no valor R$" + df.format(valor) +  " ser� de : " + parcelas + "x de  R$" + df.format(total) + " com juros totais de 30% \n \n");
            System.out.print("Digite sim para contratar : ");
            contrato = scan.next();
            if (contrato == ("sim") || contrato == ("SIM") || contrato == ("Sim") )     	  
          	  System.out.print("Contrata��o realizada com sucesso !");
            
            else System.out.println("Contrata��o negada.");
        	}
      
      //Terceira condi��o para financimento at� 36x
      else if (parcelas > 24 && parcelas <= 36) {
            juros = (valor * 40) / 100;
            total = (valor + juros) / parcelas;
            System.out.println("\n \nSeu financiamento no valor R$" + df.format(valor) + " ser� de : " + parcelas + "x de  R$" + df.format(total) + " com juros totais de 40% \n \n"); 
            System.out.print("Digite sim para contratar : ");
            contrato = scan.next();
            if (contrato == ("sim") || contrato == ("SIM") || contrato == ("Sim") )     	  
          	  System.out.print("Contrata��o realizada com sucesso !");
            
            else System.out.println("Contrata��o negada.");
        	}
      
      //Quarta condi��o para financiamento at� 48x
      else if (parcelas > 36 && parcelas <= 48) {
          juros = (valor * 50) / 100;
          total = (valor + juros) / parcelas;
          System.out.println("\n \nSeu financiamento no valor R$" + df.format(valor) +  " ser� de : " + parcelas + "x de R$" + df.format(total) + " com juros totais de 50% \n \n"); 
          System.out.print("Digite sim para contratar : ");
          contrato = scan.next();
          if (contrato == ("sim") || contrato == ("SIM") || contrato == ("Sim") )     	  
        	  System.out.print("Contrata��o realizada com sucesso !");
          
          else System.out.println("Contrata��o negada.");         
      	}
      
      //Condi��o final para caso o usu�rio tenha digitado o n�mero de parcelas maior do que 48x
      else {
    	  System.out.println("\n \n**** N�mero de parcelas excedido **** \n \n");

      }
    }
}
} 