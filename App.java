public class App {
    public static void main(String[] args) {
        Handler stdConsole = new StdConsoleHandler("stdConsole");
        Handler errorHandler = new ErrorHandler("errConsole");
        Handler fileHandler = new FileHandler("fileHandler");

        errorHandler.setHandler(fileHandler);
        fileHandler.setHandler(stdConsole);

        LogClass log = new LogClass("ERROR", "This is a error message");
        errorHandler.process(log);
        System.out.println("-----------------");
        log = new LogClass("DEBUG", "This is an debug message");
        errorHandler.process(log);
        System.out.println("-----------------");
        log = new LogClass("INFO", "This is an info message");
        errorHandler.process(log);
    }
}