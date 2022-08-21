package p03_22;

public class T2 extends Thread{
	public void run(){
		for (int i=0; i<10; i++){
			System.out.println("T2: " + i);
		}
	}
}
