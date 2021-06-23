package pacoteTodxs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        
       
       //Variavéis
        double valor = 0;  //Valor desejado de crédito pelo usuário
        int parcelas = 49; //Atribuído o valor 49 para primeira entrada no laço "while"
        double juros = 0;  //Juros com base no que o usuário optar
        String contrato;   //Variável para receber o aceite do usuário
        double total = 0;  //Varível que receberá o crédito solicitado somado aos juros
        DecimalFormat df = new DecimalFormat("#.##");  //Formata os valores decimais em 2 casas

        
        //
        System.out.print("Informe o Valor que deseja financiar : R$");
        valor = scan.nextDouble();
        
        //Informações para o usuário escolher o número de parcelas que melhor lhe atende
        System.out.println("\n \n           ** Condições **  ");
        System.out.println(" Parcelado em até 12x com juros de 10%   ");
        System.out.println(" Parcelado em até 24x com juros de 30%   ");	
        System.out.println(" Parcelado em até 36x com juros de 40%   ");	
        System.out.println(" Parcelado em até 48x com juros de 50%   \n \n");	
        
        //While usado para "forçar" o usuário a digitar uma quantidade de parcelas válida
        while (parcelas > 48) {
        System.out.print("Informe o número de parcelas desejadas (Max 48x) : ");
        parcelas = scan.nextInt(); 
        
      //Primeira condição para financiamento em até 12x     
      if (parcelas <= 12 ) {
          juros = (valor * 10) / 100; //Cálculo dos juros
          total = (valor + juros) / parcelas;  //Somatório dos juros com o valor desejado e divisão pelo número de parcelas
          System.out.println("\n \nSeu financiamento no valor R$" + df.format(valor) +  " será de : " + parcelas + "x de  R$" + df.format(total) + " com juros totais de 10% \n \n");
          System.out.print("Digite sim para contratar : ");
          contrato = scan.next();
          if (contrato == ("sim") || contrato == ("SIM") || contrato == ("Sim") )     	//Condição para caso o usuário aceite o financiamento.  
        	  System.out.print("Contratação realizada com sucesso !");
          
          else System.out.println("Contratação negada.");
          } 
       
      //Segunda condição para financiamento até 24x
      else if (parcelas > 12 && parcelas <= 24) {
            juros = (valor * 30) / 100;
            total = (valor + juros) / parcelas;
            System.out.println("\n \nSeu financiamento no valor R$" + df.format(valor) +  " será de : " + parcelas + "x de  R$" + df.format(total) + " com juros totais de 30% \n \n");
            System.out.print("Digite sim para contratar : ");
            contrato = scan.next();
            if (contrato == ("sim") || contrato == ("SIM") || contrato == ("Sim") )     	  
          	  System.out.print("Contratação realizada com sucesso !");
            
            else System.out.println("Contratação negada.");
        	}
      
      //Terceira condição para financimento até 36x
      else if (parcelas > 24 && parcelas <= 36) {
            juros = (valor * 40) / 100;
            total = (valor + juros) / parcelas;
            System.out.println("\n \nSeu financiamento no valor R$" + df.format(valor) + " será de : " + parcelas + "x de  R$" + df.format(total) + " com juros totais de 40% \n \n"); 
            System.out.print("Digite sim para contratar : ");
            contrato = scan.next();
            if (contrato == ("sim") || contrato == ("SIM") || contrato == ("Sim") )     	  
          	  System.out.print("Contratação realizada com sucesso !");
            
            else System.out.println("Contratação negada.");
        	}
      
      //Quarta condição para financiamento até 48x
      else if (parcelas > 36 && parcelas <= 48) {
          juros = (valor * 50) / 100;
          total = (valor + juros) / parcelas;
          System.out.println("\n \nSeu financiamento no valor R$" + df.format(valor) +  " será de : " + parcelas + "x de R$" + df.format(total) + " com juros totais de 50% \n \n"); 
          System.out.print("Digite sim para contratar : ");
          contrato = scan.next();
          if (contrato == ("sim") || contrato == ("SIM") || contrato == ("Sim") )     	  
        	  System.out.print("Contratação realizada com sucesso !");
          
          else System.out.println("Contratação negada.");         
      	}
      
      //Condição final para caso o usuário tenha digitado o número de parcelas maior do que 48x
      else {
    	  System.out.println("\n \n**** Número de parcelas excedido **** \n \n");

      }
    }
}
} 