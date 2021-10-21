package com.app.api.output;

import java.util.ArrayList;
import java.util.List;

import com.app.dto.UserDTO;

import javassist.expr.NewArray;

public class UserOutput {
	private int page;
	private int totalPage;
	private List<UserDTO> list =  new ArrayList<UserDTO>();
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public List<UserDTO> getList() {
		return list;
	}
	public void setList(List<UserDTO> list) {
		this.list = list;
	}

	
	
}
