package com.zl.smbms.pojo;

import java.util.List;

public class Page {

	// 总页数
	private int totalPageCount = 0;
	// 页面大小，即每页显示记录数
	private int pageSize = 5;
	// 记录总数
	private int totalCount;
	// 当前页码

	private int currPageNo = 1;

	// 每页订单集合
	private List<Smbms_user> tuserList;

	public List<Smbms_user> getTuserList() {
		return tuserList;
	}

	public void setTuserList(List<Smbms_user> tuserList) {
		this.tuserList = tuserList;
	}

	public int getCurrPageNo() {
		if (totalPageCount == 0)
			return 0;
		return currPageNo;
	}

	public void setCurrPageNo(int currPageNo) {
		if (currPageNo > 0)
			this.currPageNo = currPageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if (pageSize > 0)
			this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		if (totalCount > 0) {
			this.totalCount = totalCount;
			// ������ҳ��
			totalPageCount = this.totalCount % pageSize == 0 ? (this.totalCount / pageSize)
					: (this.totalCount / pageSize + 1);
		}
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}



}
