/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import cn.edu.ahpu.ssmas.common.persistence.DataEntity;

/**
 * 业务字典类型Entity
 * @author JHS
 * @version 2015-12-25
 */
public class DictCategory extends DataEntity<DictCategory> {
	
	private static final long serialVersionUID = 1L;
	private String type;		// 编码类型
	private String name;		// 编码名称
	private String sort;		// 排序
	private String description;		// 描述
	
	public DictCategory() {
		super();
	}

	public DictCategory(String id){
		super(id);
	}

	@Length(min=1, max=100, message="编码类型长度必须介于 1 和 100 之间")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Length(min=1, max=100, message="编码名称长度必须介于 1 和 100 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	
	@Length(min=0, max=100, message="描述长度必须介于 0 和 100 之间")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}