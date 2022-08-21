package p03_22;

public class Client {

	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		t1.start();//threading
		//t1.run();//non-threading
		t2.start();//threading
		//t2.run();//non-threading
		for (int i=0; i<10; i++){
			System.out.println("main: " + i);
		}
	}
}

