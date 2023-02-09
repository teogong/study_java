package com.teogong.ex08;

public class CarMain {
	public static void main(String[] args) {
//		Car choiSorento = new Car(new GasolineEngine());
		
		Car choiSorento = new Car(new Engine() {
			
			@Override
			public void runEngine() {
				// TODO Auto-generated method stub
				System.out.println("부르릉~~~~~~~~~~~~~");
			}
		});
		
		Car parkSorento = new Car(new DieselEngine());
		
		Car jungSorento = new Car(new HybridEngine());
		
//		Engine engine = new HybridEngine();
//		Car jungSorento = new Car(engine);
		
		choiSorento.drive();
		parkSorento.drive();
		jungSorento.drive();
	}
}
