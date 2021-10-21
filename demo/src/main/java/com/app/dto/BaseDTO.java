package com.app.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaseDTO<T> {
	private Long id;
	private Date createDate;
	private Date updateDate;
	private List<T> listResult = new ArrayList();
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public List<T> getListResult() {
		return listResult;
	}
	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}
	
	
}
