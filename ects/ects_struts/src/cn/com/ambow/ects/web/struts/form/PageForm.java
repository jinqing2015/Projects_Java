package cn.com.ambow.ects.web.struts.form;

import org.apache.struts.action.ActionForm;

/**
 * 
 * 
 * 
 * @description 用于分页显示的工具类，此类继承于struts中的 ActionForm,主要用于封装分页显示的基本数据
 */
public class PageForm extends ActionForm {
	private int currentPageNo;

	private int toPageNo;

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public int getToPageNo() {
		return toPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public void setToPageNo(int toPageNo) {
		this.toPageNo = toPageNo;
	}

}
