/*
 * 工程名称: ClangWEBA
 * 文件名称: BaseAction4.java
 * 包名名称: info.clang.web.action
 * 创建日期: 2013年12月25日上午11:00:42
 * 授权方式: Copyright (c) 2013, All Rights Reserved.
 *
 */
package info.clang.web.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 类名名称: BaseAction4 <br/>
 * 功能说明: 通过struts2的{@link ServletRequestAware}来获取request等对象. <br/>
 * 创建原因: 创建一个工程的基类Action. <br/>
 *
 * @author zhoucl 2013年12月25日
 * @version 
 * @since JDK 1.5
 */
public class BaseAction4 extends ActionSupport implements ServletRequestAware {
	/**
	 * serialVersionUID.
	 * @since JDK 1.5
	 */
	private static final long serialVersionUID = -9089117284941666113L;
	
	/**
	 * request:{@link HttpServletRequest}.
	 * @since JDK 1.5
	 */
	protected HttpServletRequest request = null;
	
	/**
	 * session:{@link HttpSession}.
	 * @since JDK 1.5
	 */
	protected HttpSession session = null;
	
	/**
	 * application:{@link ServletContext}.
	 * @since JDK 1.5
	 */
	protected ServletContext application = null;
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 重写setServletRequest，来对request等变量赋值
	 * @see org.apache.struts2.interceptor.ServletRequestAware#setServletRequest(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public void setServletRequest(HttpServletRequest _request) {
		this.request = _request;
		this.session = request.getSession();
		this.application = session.getServletContext();
	}

}
