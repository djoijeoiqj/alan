package cn.tedu.ssh.action;

public class ResponseResult<T> {
	//��Ӧ״̬��
	private Integer state;
	//��Ӧ��Ϣ�����磺��¼�ɹ����¼ʧ��
    private String message;
    //��Ӧ������
    private T data;
    
    
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	public ResponseResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseResult(Integer state, String message, T data) {
		super();
		this.state = state;
		this.message = message;
		this.data = data;
	}
    
}
