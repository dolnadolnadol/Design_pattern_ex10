public class StdConsoleHandler extends Handler{
    
    public StdConsoleHandler(String handlerName) {
        super(handlerName);
    }
    
    @Override
    public void process(LogClass log) {
        if(log.getLevel().equals("INFO")) {
            System.out.println("Standard Console::Logger " + log.getMessage());
        } else if(log.getLevel().equals("DEBUG")) {
            System.out.println("Standard Console::Logger " + log.getMessage());
        } else if(log.getLevel().equals("ERROR")) {
            System.out.println("Error Console::Logger " + log.getMessage());
        }
        if (next != null) {
            next.process(log);
        }
    }
}