package com.zrysj.po;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserVo {
	private String[] ids = new String[2];
	private List<User> list ;
	public String[] getIds() {
		return ids;
	}
	public void setIds(String[] ids) {
		this.ids = ids;
	}
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "UserVo [ids=" + Arrays.toString(ids) + ", list=" + list + "]";
	}
	
	
	
	
}
