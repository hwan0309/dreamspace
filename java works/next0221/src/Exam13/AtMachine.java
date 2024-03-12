package Exam13;

import java.lang.reflect.Array;

public class AtMachine {
	private Product[] tray1 = new Product[5];
	private Product[] tray2 = new Product[5];
	private Product[] tray3 = new Product[5];
	private Product[] tray4 = new Product[5];
	
	private int money; 	//자판기에 넣은 돈
	
	//
	private Product[][] arr = {tray1, tray2, tray3, tray4};
	
	public AtMachine() {
		for (int i =0; i < tray1.length; i++) {
			tray1[i] = new Product("cock", 800);
		}
		for (int i =0; i < tray2.length; i++) {
			tray2[i] = new Product("사이다", 700);
	}
		for (int i =0; i < tray3.length; i++) {
			tray3[i] = new Product("냉커피", 900);
}
		for (int i =0; i < tray4.length; i++) {
			tray4[i] = new Product("미에로화이버", 500);
}
	}
	
	private int getMinPrice() {
		int minPrice = 999999;
		for(int i =0; i< arr.length; i++) {
			for(int j=0; j< arr[i].length;j++) {
				if(arr[i][j] != null && arr[i][j].getPrice() < minPrice) {
					minPrice = arr[i][j].getPrice();
				}
			}
		}
		return minPrice;
	}
	//돈을 입력받는 함수
	public boolean inputMoney(int money) {
		this.money += money;
		int minPrice = getMinPrice();
		return this.money >= minPrice;
	}
	private int countOfTray(Product[]tray) {
		int count = 0;
		for(int i =0; i< tray.length; i++) {
			if(tray[i] !=null) {
				count++;
			}
			return count;
			
		}
		
		void show() {
			System.out.println();
			System.out.println("%s (%개)\n", tray1[0].toString(), countOfTray(tray));
			System.out.println("%s (%개)\n", tray2[0].toString(), countOfTray(tray));
			System.out.println("%s (%개)\n", tray3[0].toString(), countOfTray(tray));
			System.out.println("%s (%개)\n", tray4[0].toString(), countOfTray(tray));
		}
	}
	
}