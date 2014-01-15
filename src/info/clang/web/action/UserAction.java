/*
 * 工程名称: ClangWEBA
 * 文件名称: UserAction.java
 * 包名名称: info.clang.web.action
 * 创建日期: 2013年12月25日上午10:51:07
 * 授权方式: Copyright (c) 2013, All Rights Reserved.
 *
 */
package info.clang.web.action;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * 类名名称: UserAction <br/>
 * 功能说明: 用户Action相关的跳转控制类. <br/>
 * 创建原因: 主要用来处理用户相关的跳转控制，与其他的控制进行隔离. <br/>
 *
 * @author zhoucl 2013年12月25日
 * @version 
 * @since JDK 1.5
 */
public class UserAction extends BaseAction4 {
	/**
	 * serialVersionUID.
	 * @since JDK 1.5
	 */
	private static final long serialVersionUID = -6823460113567069261L;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String  userAdd() {
		Map reqParams = request.getParameterMap();
		Iterator<Entry<String, String[]>> iter =  reqParams.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<String, String[]> entry = iter.next();
			logger.info(entry.getKey() + ":\t" + entry.getValue()[0]);
		}
		
		return SUCCESS;
	}

	/**
	 * @see com.opensymphony.xwork2.ActionSupport#validate()
	 */
	@Override
	public void validate() {
		super.validate();
		this.addFieldError("name", "test");
	}
	
}
