package com;
public class App_3_2_3 {
	public static void main(String[] args){
		
		for(int i = 1;i<=100;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String s = new String("[");
			for(int j  = 1;j <= 100;j++){
				if(j <= i){
					s = s + '*';
				}else{
					s = s + '=';
				}
			}
			s = s + "]" + i + "%\r";
			System.out.print(s);
		}
	}
}
