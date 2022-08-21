package p03_22;

class T1 extends Thread {

	public void run(){
		for (int i=0; i<10; i++){
			System.out.println("T1: " + i);
		}
	}
}
