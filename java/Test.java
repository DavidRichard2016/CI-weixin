import org.python.core.PyFunction;
import org.python.core.PyString;
import org.python.util.PythonInterpreter;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SenderIF s = new Sender();
		 s.initial();
		 boolean b = s.GroupSend("weixin", "˧�磬������Ⱥ�����յ���ظ���", "��չ��Ϣ");
		
	}
}
