/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.sys.dao;

import cn.edu.ahpu.ssmas.common.persistence.CrudDao;
import cn.edu.ahpu.ssmas.common.persistence.annotation.MyBatisDao;
import cn.edu.ahpu.ssmas.modules.sys.entity.Log;

/**
 * 日志DAO接口
* @author ssmas
 * @version 2014-05-16
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
