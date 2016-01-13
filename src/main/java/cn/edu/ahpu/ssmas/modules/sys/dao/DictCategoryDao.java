/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.sys.dao;

import cn.edu.ahpu.ssmas.common.persistence.CrudDao;
import cn.edu.ahpu.ssmas.common.persistence.annotation.MyBatisDao;
import cn.edu.ahpu.ssmas.modules.sys.entity.DictCategory;

/**
 * 业务字典类型DAO接口
 * @author JHS
 * @version 2015-12-25
 */
@MyBatisDao
public interface DictCategoryDao extends CrudDao<DictCategory> {
	
}