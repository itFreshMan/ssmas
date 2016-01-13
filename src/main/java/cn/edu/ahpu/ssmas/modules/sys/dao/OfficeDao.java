/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.sys.dao;

import cn.edu.ahpu.ssmas.common.persistence.TreeDao;
import cn.edu.ahpu.ssmas.common.persistence.annotation.MyBatisDao;
import cn.edu.ahpu.ssmas.modules.sys.entity.Office;

/**
 * 机构DAO接口
* @author ssmas
 * @version 2014-05-16
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
