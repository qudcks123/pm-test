
public class MyExcepion extends Exception{

	private static final long serialVersionUID = 7718828512143293558L;
	
	private final int ERR_CODE;
	
	MyExcepion(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	MyExcepion(String msg) {
		this(msg,100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	
}
	