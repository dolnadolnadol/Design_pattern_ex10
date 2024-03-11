public class FileHandler extends Handler{
    
    public FileHandler(String handlerName) {
        super(handlerName);
    }
    
    @Override
    public void process(LogClass log) {
        if(log.getLevel().equals("DEBUG")) {
            System.out.println("File::Logger " + log.getMessage());
        } else if(log.getLevel().equals("ERROR")) {
            System.out.println("File::Logger " + log.getMessage());
        }
        if (next != null) {
            next.process(log);
        }
    }
}