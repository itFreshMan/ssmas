/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.edu.ahpu.ssmas.common.persistence.Page;
import cn.edu.ahpu.ssmas.common.service.CrudService;
import cn.edu.ahpu.ssmas.common.utils.CacheUtils;
import cn.edu.ahpu.ssmas.modules.sys.dao.DictCategoryDao;
import cn.edu.ahpu.ssmas.modules.sys.entity.DictCategory;
import cn.edu.ahpu.ssmas.modules.sys.utils.DictCategoryUtils;

/**
 * 业务字典类型Service
 * @author JHS
 * @version 2015-12-25
 */
@Service
@Transactional(readOnly = true)
public class DictCategoryService extends CrudService<DictCategoryDao, DictCategory> {

	public DictCategory get(String id) {
		return super.get(id);
	}
	
	public List<DictCategory> findList(DictCategory dictCategory) {
		return super.findList(dictCategory);
	}
	
	public Page<DictCategory> findPage(Page<DictCategory> page, DictCategory dictCategory) {
		return super.findPage(page, dictCategory);
	}
	
	@Transactional(readOnly = false)
	public void save(DictCategory dictCategory) {
		super.save(dictCategory);
		
		CacheUtils.remove(DictCategoryUtils.CACHE_DICT_CATEGORY);
	}
	
	@Transactional(readOnly = false)
	public void delete(DictCategory dictCategory) {
		super.delete(dictCategory);
		
		CacheUtils.remove(DictCategoryUtils.CACHE_DICT_CATEGORY);
	}
	
}