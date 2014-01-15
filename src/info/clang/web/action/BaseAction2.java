/*
 * 工程名称: ClangWEBA
 * 文件名称: BaseAction2.java
 * 包名名称: info.clang.web.action
 * 创建日期: 2013年12月25日上午10:45:03
 * 授权方式: Copyright (c) 2013, All Rights Reserved.
 *
 */
package info.clang.web.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 类名名称: BaseAction2 <br/>
 * 功能说明: 实现RequestAware,SessionAware和ApplicationAware接口，获取request,session和
 * application对象. <br/>
 * 创建原因: 创建一个工程的基类Action. <br/>
 *
 * @author zhoucl 2013年12月25日
 * @version 
 * @since JDK 1.5
 */
public class BaseAction2 extends ActionSupport implements RequestAware,
		SessionAware, ApplicationAware {

	/**
	 * serialVersionUID.
	 * @since JDK 1.5
	 */
	private static final long serialVersionUID = -6598182255916877249L;
	/**
	 * request.
	 * @since JDK 1.5
	 */
	protected Map<String, Object> request = null;
	/**
	 * session.
	 * @since JDK 1.5
	 */
	protected Map<String, Object> session = null;
	/**
	 * application.
	 * @since JDK 1.5
	 */
	protected Map<String, Object> application = null;
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 重载函数对application对象赋值
	 * @see org.apache.struts2.interceptor.ApplicationAware#setApplication(java.util.Map)
	 */
	@Override
	public void setApplication(Map<String, Object> _application) {
		this.application = _application;
	}

	/**
	 * 重载函数对session对象赋值
	 * @see org.apache.struts2.interceptor.SessionAware#setSession(java.util.Map)
	 */
	@Override
	public void setSession(Map<String, Object> _session) {
		this.session = _session;
	}

	/**
	 * 重载函数对request对象赋值
	 * @see org.apache.struts2.interceptor.RequestAware#setRequest(java.util.Map)
	 */
	@Override
	public void setRequest(Map<String, Object> _request) {
		this.request = _request;
	}

}
