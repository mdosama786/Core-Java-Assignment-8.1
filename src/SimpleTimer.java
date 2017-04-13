
/**@Import Timer & Timer task package*/
import java.util.Timer;
import java.util.TimerTask;

/** @Creat a Simple Timer */
public class SimpleTimer extends Thread {
	/** @Creat UpdaterThread Class */
	private static class UpdaterThread extends Thread {
		private final int TIMEOUT = 50;

		public void run() {
			while (true) {
				try {
					Timer t = new Timer();
					t.schedule(new TimerTask() {

						/** @Override Method */
						public void run() {
							/** @Show a message in between running timer */
							System.out.println(" 5 Seconds Passed");
						}
					}, TIMEOUT);
				} catch (Exception ex) {
					System.out.println(ex);
				}
			}
		}
	}

	/** @Main Method */
	public static void main(String[] args) {
		/** @Try */
		try {
			Thread u = new UpdaterThread();
			u.start();
			while (true) {
				/** @Print output */
				System.out.println("* * *");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}