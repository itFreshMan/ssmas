/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.gen.dao;

import cn.edu.ahpu.ssmas.common.persistence.CrudDao;
import cn.edu.ahpu.ssmas.common.persistence.annotation.MyBatisDao;
import cn.edu.ahpu.ssmas.modules.gen.entity.GenTemplate;

/**
 * 代码模板DAO接口
* @author ssmas
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTemplateDao extends CrudDao<GenTemplate> {
	
}
