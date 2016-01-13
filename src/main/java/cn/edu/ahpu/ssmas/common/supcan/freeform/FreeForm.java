/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.common.supcan.freeform;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import cn.edu.ahpu.ssmas.common.supcan.common.Common;
import cn.edu.ahpu.ssmas.common.supcan.common.properties.Properties;

/**
 * 硕正FreeForm
 * @author WangZhen
 * @version 2013-11-04
 */
@XStreamAlias("FreeForm")
public class FreeForm extends Common {

	public FreeForm() {
		super();
	}
	
	public FreeForm(Properties properties) {
		this();
		this.properties = properties;
	}
	
}
