//Assignment 5_2
//2.	Design and implement a class named Logger to manage logging messages for an application. The class should be implemented as a singleton to ensure that only one instance of the Logger exists throughout the application.

class Logger
{	
	private static Logger instance;
	private StringBuilder logMessages = new StringBuilder();
	
	private Logger(){}	//Private constructor to prevent instantiation
	
	public static Logger getInstance()
	{
		if(instance == null)
		{
			instance=new Logger();
		}
		return instance;
	}
	
	public void log(String message)
	{
			logMessages.append(message).append("\n");
	}
	
	public String getLog()
	{
		return logMessages.toString();
	}
	public void clearLog() {
        logMessages.setLength(0);  // Clears the log by resetting the StringBuilder
    }
}

	class loggerM
	{
		public static void main(String args[])
		{
			
			Logger logger = Logger.getInstance();
			logger.log("APPLICATION STARTED...!");
			logger.log("AN ERROR OCCURRED...!");
			
			System.out.println("CURRENT LOGS:\n"	+logger.getLog());
			logger.clearLog();
			System.out.println("LOGS CLEARED...\n"+logger.getLog());
			
		}
	
	}










