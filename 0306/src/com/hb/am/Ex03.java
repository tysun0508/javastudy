package com.hb.am;

public class Ex03 implements Runnable {

	private int depositeMoney = 20000; 
	
	

	public int getDepositeMoney() {
		return depositeMoney;
	}



	public void setDepositeMoney(int depositeMoney) {
		this.depositeMoney = depositeMoney;
	}
	
	public void withDraw(int su){
		if(getDepositeMoney()>0){
			depositeMoney = depositeMoney - su ;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("ÀÜ¾× : " + getDepositeMoney());
		}else{
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("ÀÜ¾×ÀÌ ¾ø³×¿ä");
		}
	}


	@Override
	public void run() {
		for(int i = 0; i<10; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			if(getDepositeMoney()<=0) break ;
				withDraw(100);
			
		}
		
	}
	
	

}
