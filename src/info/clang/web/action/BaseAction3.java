/*
 * 工程名称: ClangWEBA
 * 文件名称: BaseAction3.java
 * 包名名称: info.clang.web.action
 * 创建日期: 2013年12月25日上午10:54:01
 * 授权方式: Copyright (c) 2013, All Rights Reserved.
 *
 */
package info.clang.web.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 类名名称: BaseAction3 <br/>
 * 功能说明: 利用ServletActionContext获取HttpServletRequest，HttpSession等对象 <br/>
 * 创建原因: 创建一个工程的基类Action. <br/>
 *
 * @author zhoucl 2013年12月25日
 * @version 
 * @since JDK 1.5
 */
public class BaseAction3 extends ActionSupport {
	/**
	 * serialVersionUID.
	 * @since JDK 1.5
	 */
	private static final long serialVersionUID = -2226634614207729302L;
	
	/**
	 * request:{@link HttpServletRequest}.
	 * @since JDK 1.5
	 */
	protected HttpServletRequest request;
	/**
	 * session: {@link HttpSession}.
	 * @since JDK 1.5
	 */
	protected HttpSession session;
	/**
	 * application:{@link ServletContext}.
	 * @since JDK 1.5
	 */
	protected ServletContext application;
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 构造函数: BaseAction3.<br />
	 * 通过构造函数来初始化request等对象.
	 */
	public BaseAction3() {
		request = ServletActionContext.getRequest();
		session = request.getSession();
		application = session.getServletContext();
	}
}
