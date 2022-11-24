//Build and run the project
//Right click RunnableThreadTest1 project and select Run.
//Observe the result in the Output window. 
//Output Window ACBACBACBACBACABCABCABCABCABC
public class ThreadProblem3 extends Thread {
	public void run() {
		for (int i = 1; i < 3; i++)
			System.out.print("ACB");
		for (int i = 1; i < 3; i++)
			System.out.print("ABC");
	}

	public static void main(String[] args) {
		ThreadProblem3 t = new ThreadProblem3();
		ThreadProblem3 t1 = new ThreadProblem3();
		ThreadProblem3 t2 = new ThreadProblem3();
		t.start();
		t1.start();
		t2.start();

	}
}