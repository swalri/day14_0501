package OP;

import java.util.HashMap;

class ClassDTO01 {
	protected String id, pwd;
	protected HashMap<String, String> player = new HashMap<>();
	// id
	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	// pwd
	protected String getPwd() {
		return pwd;
	}

	protected void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
