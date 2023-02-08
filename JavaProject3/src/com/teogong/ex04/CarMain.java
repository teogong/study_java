package com.teogong.ex04;

public class CarMain {
	public static void main(String[] args) {
		Car choiSorento = new Car(new GasolineEngine());
		
		Car parkSorento = new Car(new DieselEngine());
		
		Car jungSorento = new Car(new HybridEngine());
		
//		Engine engine = new HybridEngine();
//		Car jungSorento = new Car(engine);
		
		choiSorento.drive();
		parkSorento.drive();
		jungSorento.drive();
	}
}
