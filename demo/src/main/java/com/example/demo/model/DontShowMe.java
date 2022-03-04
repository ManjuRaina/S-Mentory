package com.example.demo.model;

public class DontShowMe {
	
	private boolean error;
	private Object data;
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "DontShowMe [error=" + error + ", data=" + data + "]";
	}
	
	
	
	

}
