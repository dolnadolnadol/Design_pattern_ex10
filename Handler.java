public class Handler {
    protected Handler next;
    protected String handlerName;

    public Handler(String handlerName) {
		this.handlerName = handlerName;
	}
	public void setHandler(Handler handler) {
		if (next != null) {
			next.setHandler(handler);
		}
		else {
			next = handler;
		}
	}
	public void process(LogClass log) {
		if (next != null) {
			next.process(log);
		}
	}
	public String getHandlerName() {
		return handlerName;
	}
}