package com.hb.gm;
import java.util.*;
class Remo 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		TV  tv = new TV();
		Radio radio = new Radio();
		Computer computer = new Computer();

        int su1 = 0 ;
        int su2 = 0 ;
		exit :
		while(true){
          System.out.print("1.TV 2.���� 3.��ǻ�� 4. ���� >>> ");
           su1 = scan.nextInt();
		   if(su1 == 1 || su1 == 2 || su1 == 3){
			  System.out.print("1.UP 2.DOWN >> ");
			  su2 = scan.nextInt();
			  if(su2 == 1 || su2 ==2){
					switch(su1){
						case 1 : 
							switch(su2){
                               case 1 :   tv.volUp();  break; 
                               case 2 :   tv.volDown();  break; 
						    }
						break;				  
						case 2 : 
							switch(su2){
                               case 1 :   radio.volUp();  break; 
                               case 2 :   radio.volDown();  break; 
						    }							
						break;
						case 3 : 
							switch(su2){
                               case 1 :   computer.volUp();  break; 
                               case 2 :   computer.volDown();  break; 
						    }					 
						break;
					 }
                 System.out.println(":::::::::::::::::::::::::::::::::");
 				 System.out.print("TV : " + tv.getVol()+"  ");
 				 System.out.print("Radio : " + radio.getVol()+"  ");
 				 System.out.println("Computer : " + computer.getVol()+"  ");
				 System.out.println(":::::::::::::::::::::::::::::::::");

			  }else{
                System.out.println("�߸��Է��ϼ̽��ϴ�.");
			    continue exit;
			  }
		   	
		   }else if(su1 == 4){
			   System.out.println("�����մϴ�.");
				break;
		   }else{
              System.out.println("�߸��Է��ϼ̽��ϴ�.");
			  continue exit;
		   }
		}
	}
}
