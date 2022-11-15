package ch;

public class ExceptionArrayIndex extends Exception{

	public ExceptionArrayIndex() {
		//super("화면에 보이는 번호중 하나를 입력해주세요.");
	}
	public static void exceptionIndex(int num,Object[] objs) throws ExceptionArrayIndex {
		//배열 인덱스 미리 예외처리
		if(num < 1 || objs.length < num ) throw new ExceptionArrayIndex();
	}
	public String getMessage() {
		return "\n화면에 보이는 번호중 하나를 입력해주세요.";
	}
	
}
