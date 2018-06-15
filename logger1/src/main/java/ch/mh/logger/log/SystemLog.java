package ch.mh.logger.log;

/**
 * Logs messages to System.out
 * @author mike
 */
public class SystemLog extends AbstractLog {
	//TRIGGERTEST

	@Override
	public void logMessage(String message) {
		System.out.println(message);
		messageCount++;
	}
}
