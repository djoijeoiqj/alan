package cn.tedu.ssh.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class ResponseResultAction implements SessionAware{

	private String query;
	private Map<String, Object> session;
	private ResponseResult<User> responseResult;
	private String message;
	public String getQuery() {
		return query;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public ResponseResult<User> getResponseResult() {
		return responseResult;
	}

	public void setResponseResult(ResponseResult<User> responseResult) {
		this.responseResult = responseResult;
	}

	public Map<String, Object> getSession(){
		return session;
		
	}
	
	public void setSession(Map<String, Object> session) {
		this.session=session;
		
	}
	public String execute(){
		User user=new User(9527, "周星星", "zhou9527", "13800139527", "zhouxingxing@tedu.cn");
		ResponseResult<User> responseResult=new ResponseResult<User>();
		responseResult.setState(1);
		responseResult.setData(user);
		
		setResponseResult(responseResult);
		setMessage("这是一个message");
		
		if("full-result".equals(query)){
			return "full";
		}else {
			return "response-result-only";
		}
	}

}
