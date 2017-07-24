package com.hb.cm;

public class Ex08 extends Thread {
	
	Ex07 ball;
	int x;
	int y = -50;
	public Ex08() {
		// 공을 받는 생성자
	
	}
	public Ex08(Ex07 ball){
		this.ball = ball ;
	}
	@Override
	public void run() {
		while(y<ball.canvas.getHeight()){
			y = y+5;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ball.canvas.repaint();
		}
	}
}
