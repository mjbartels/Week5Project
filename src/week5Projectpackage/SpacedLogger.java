package week5Projectpackage;

public class SpacedLogger implements Logger {

	@Override
    public void log(String message) {
        System.out.println(addSpaces(message));
    }

	@Override
    public void error(String message) {
        System.out.println("ERROR: " + addSpaces(message));
    }

	private String addSpaces(String message) {
	    StringBuilder spacedMessage = new StringBuilder();
	    for (int i = 0; i < message.length(); i++) {
	        spacedMessage.append(message.charAt(i));
	        if (i < message.length() - 1) {
	            spacedMessage.append(" ");
	        }
	    }
	    return spacedMessage.toString();
	}
}
