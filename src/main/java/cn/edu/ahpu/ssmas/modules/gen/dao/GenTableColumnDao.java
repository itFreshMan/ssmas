/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.gen.dao;

import cn.edu.ahpu.ssmas.common.persistence.CrudDao;
import cn.edu.ahpu.ssmas.common.persistence.annotation.MyBatisDao;
import cn.edu.ahpu.ssmas.modules.gen.entity.GenTableColumn;

/**
 * 业务表字段DAO接口
* @author ssmas
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableColumnDao extends CrudDao<GenTableColumn> {
	
	public void deleteByGenTableId(String genTableId);
}
