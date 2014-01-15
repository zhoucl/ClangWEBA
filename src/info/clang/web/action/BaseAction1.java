/*
 * 工程名称: ClangWEBA
 * 文件名称: BaseAction1.java
 * 包名名称: info.clang.web.action
 * 创建日期: 2013年12月25日上午10:51:07
 * 授权方式: Copyright (c) 2013, All Rights Reserved.
 *
 */
package info.clang.web.action;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 类名名称: BaseAction1 <br/>
 * 功能说明: 通过ActionContext方式获取request,session和application. <br/>
 * 创建原因: 创建一个工程的基类Action. <br/>
 *
 * @author zhoucl 2013年12月25日
 * @version 
 * @since JDK 1.5
 */
public class BaseAction1 extends ActionSupport {
	
	/**
	 * serialVersionUID.
	 * @since JDK 1.5
	 */
	private static final long serialVersionUID = 7617824616805045020L;
	
	/**
	 * request.
	 * @since JDK 1.5
	 */
	protected Map<String, Object> request;
	
	
	/**
	 * session.
	 * @since JDK 1.5
	 */
	protected Map<String, Object> session;
	
	/**
	 * application.
	 * @since JDK 1.5
	 */
	protected Map<String, Object> application;
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 构造函数: BaseAction1.<br />
	 * 通过构造函数来初始化request等对象.
	 *
	 */
	@SuppressWarnings("unchecked")
	public BaseAction1() {
		request = (Map<String, Object>)ActionContext.getContext().get("request");
		session = ActionContext.getContext().getSession();
		application = ActionContext.getContext().getApplication();
	}
}
