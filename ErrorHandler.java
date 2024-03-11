public class ErrorHandler extends Handler {

    public ErrorHandler(String handlerName) {
        super(handlerName);
    }

    @Override
    public void process(LogClass log) {
        if (log.getLevel().equals("ERROR")) {
            System.out.println("Error Console::Logger " + log.getMessage());
        }
        if (next != null) {
            next.process(log);
        }
    }
}