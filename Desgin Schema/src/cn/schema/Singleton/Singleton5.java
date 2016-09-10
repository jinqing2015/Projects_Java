package cn.schema.Singleton;

import java.io.Serializable;


public enum Singleton5 implements Serializable {
	INSTANCE;
	private String field;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
}
