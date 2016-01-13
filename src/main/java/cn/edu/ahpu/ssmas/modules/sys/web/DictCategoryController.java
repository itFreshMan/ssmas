/**
 * Copyright &copy; 2012-2015 <a href="http://www.ahpu.edu.cn">ssmas</a> All rights reserved.
 */
package cn.edu.ahpu.ssmas.modules.sys.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.edu.ahpu.ssmas.common.config.Global;
import cn.edu.ahpu.ssmas.common.persistence.Page;
import cn.edu.ahpu.ssmas.common.web.BaseController;
import cn.edu.ahpu.ssmas.common.utils.StringUtils;
import cn.edu.ahpu.ssmas.modules.sys.entity.DictCategory;
import cn.edu.ahpu.ssmas.modules.sys.service.DictCategoryService;

/**
 * 业务字典类型Controller
 * @author JHS
 * @version 2015-12-25
 */
@Controller
@RequestMapping(value = "${adminPath}/sys/dictCategory")
public class DictCategoryController extends BaseController {

	@Autowired
	private DictCategoryService dictCategoryService;
	
	@ModelAttribute
	public DictCategory get(@RequestParam(required=false) String id) {
		DictCategory entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = dictCategoryService.get(id);
		}
		if (entity == null){
			entity = new DictCategory();
		}
		return entity;
	}
	
	@RequiresPermissions("sys:dictCategory:view")
	@RequestMapping(value = {"list", ""})
	public String list(DictCategory dictCategory, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<DictCategory> page = dictCategoryService.findPage(new Page<DictCategory>(request, response), dictCategory); 
		model.addAttribute("page", page);
		return "modules/sys/dictCategory/dictCategoryList";
	}

	@RequiresPermissions("sys:dictCategory:view")
	@RequestMapping(value = "form")
	public String form(DictCategory dictCategory, Model model) {
		model.addAttribute("dictCategory", dictCategory);
		return "modules/sys/dictCategory/dictCategoryForm";
	}

	@RequiresPermissions("sys:dictCategory:edit")
	@RequestMapping(value = "save")
	public String save(DictCategory dictCategory, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, dictCategory)){
			return form(dictCategory, model);
		}
		dictCategoryService.save(dictCategory);
		addMessage(redirectAttributes, "保存业务字典类型成功");
		return "redirect:"+Global.getAdminPath()+"/sys/dictCategory/?repage";
	}
	
	@RequiresPermissions("sys:dictCategory:edit")
	@RequestMapping(value = "delete")
	public String delete(DictCategory dictCategory, RedirectAttributes redirectAttributes) {
		dictCategoryService.delete(dictCategory);
		addMessage(redirectAttributes, "删除业务字典类型成功");
		return "redirect:"+Global.getAdminPath()+"/sys/dictCategory/?repage";
	}

}