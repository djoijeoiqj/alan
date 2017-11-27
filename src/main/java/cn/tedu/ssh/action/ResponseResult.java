package cn.tedu.ssh.action;

public class ResponseResult<T> {
	//响应状态码
	private Integer state;
	//响应消息，例如：登录成功或登录失败
    private String message;
    //响应的数据
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
