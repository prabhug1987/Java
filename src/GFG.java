public class GFG {
	public static void main(String args[]) throws Exception {
		while (true) {
			new Thread(new Runnable() {
				public void run() {
					try {
						Thread.sleep(1000000000);
					} catch (InterruptedException e) {
					}
				}
			}).start();
		}
	}
}