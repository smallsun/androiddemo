package com.example.unsizetest;

public class Msg {
	public static final int TYPE_RECEIVED = 0;
	public static final int TYPE_SENT = 1;
	
	
	private Integer type;
	private String content;

	public Integer getType() {
		return type;
	}

	public Msg() {
		super();
	}

	public Msg(Integer type, String content) {
		super();
		this.type = type;
		this.content = content;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
