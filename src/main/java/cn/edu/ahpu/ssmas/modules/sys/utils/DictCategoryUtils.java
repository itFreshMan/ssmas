/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.sys.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cn.edu.ahpu.ssmas.common.mapper.JsonMapper;
import cn.edu.ahpu.ssmas.common.utils.CacheUtils;
import cn.edu.ahpu.ssmas.common.utils.SpringContextHolder;
import cn.edu.ahpu.ssmas.modules.sys.dao.DictCategoryDao;
import cn.edu.ahpu.ssmas.modules.sys.dao.DictDao;
import cn.edu.ahpu.ssmas.modules.sys.entity.Dict;
import cn.edu.ahpu.ssmas.modules.sys.entity.DictCategory;

/**
 * 字典工具类
* @author ssmas
 * @version 2013-5-29
 */
public class DictCategoryUtils {
	
	private static DictCategoryDao dictCategoryDao = SpringContextHolder.getBean(DictCategoryDao.class);

	public static final String CACHE_DICT_CATEGORY = "dictCategoryDictCategory";

	public static String getDictCategoryLabel(String type){
		if (StringUtils.isNotBlank(type)){
			for (DictCategory dictCategory : getAllDictCategoryList()){
				if (type.equals(dictCategory.getType())){
					return dictCategory.getName();
				}
			}
		}
		return null;
	}
	
	
	public static String getDictCategoryValue(String name){
		if (StringUtils.isNotBlank(name)){
			for (DictCategory dictCategory : getAllDictCategoryList()){
				if (name.equals(dictCategory.getName()) ){
					return dictCategory.getType();
				}
			}
		}
		return null;
	}
	
	public static List<DictCategory> getAllDictCategoryList(){
		@SuppressWarnings("unchecked")
		List<DictCategory> dictCategoryList = (List<DictCategory>)CacheUtils.get(CACHE_DICT_CATEGORY);
		if (dictCategoryList==null || dictCategoryList.size() == 0){
			dictCategoryList = dictCategoryDao.findAllList();
			CacheUtils.put(CACHE_DICT_CATEGORY, dictCategoryList);
		}
		return dictCategoryList;
	}
	
	/**
	 * 返回字典列表（JSON）
	 * @param type
	 * @return
	 */
	public static String getAllDictCategoryListJson(){
		return JsonMapper.toJsonString(getAllDictCategoryList());
	}
	
}
