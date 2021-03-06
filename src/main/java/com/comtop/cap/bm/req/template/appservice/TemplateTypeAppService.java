/******************************************************************************
 * Copyright (C) 2015 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/

package com.comtop.cap.bm.req.template.appservice;

import java.util.List;

import com.comtop.cap.bm.req.template.dao.TemplateTypeDAO;
import com.comtop.cap.bm.req.template.model.TemplateTypeVO;
import com.comtop.cip.jodd.petite.meta.PetiteBean;
import com.comtop.cip.jodd.petite.meta.PetiteInject;
import com.comtop.cap.runtime.base.appservice.BaseAppService;

/**
 * 需求模板类型服务扩展类
 * 
 * @author 姜子豪
 * @since 1.0
 * @version 2015-9-22 姜子豪
 */
@PetiteBean
public class TemplateTypeAppService extends BaseAppService {
    
    /** 注入DAO **/
    @PetiteInject
    protected TemplateTypeDAO templateTypeDAO;
    
    /** 注入AppService **/
    @PetiteInject
    protected TemplateInfoAppService templateInfoAppService;
    
    /**
     * 获取需求模板类型ID
     * 
     * @return 需求模板类型ID数组
     */
    public List<TemplateTypeVO> reqTemplateTypeIDLst() {
        return templateTypeDAO.reqTemplateTypeIDLst();
    }
    
    /**
     * 
     * 新增需求模板类型对象
     *
     * @param templateTypeVO 需求模板类型对象
     * @return 需求模板类型ID
     */
    public String insetTemplateType(TemplateTypeVO templateTypeVO) {
        return templateTypeDAO.insetTemplateType(templateTypeVO);
    }
    
    /**
     * 
     * 删除需求模板类型对象
     * 
     * @param templateTypeVO 需求模板类型对象
     * @return 删除结果
     */
    public boolean deleteTemplateType(TemplateTypeVO templateTypeVO) {
        String templateTypeId = templateTypeVO.getId();
        templateInfoAppService.deleteTemplateInfoByTypeId(templateTypeId);
        return templateTypeDAO.deleteTemplateType(templateTypeVO);
    }
    
    /**
     * 
     * 修改需求模板类型对象
     *
     * @param templateTypeVO 需求模板类型对象
     * @return 需求模板类型ID
     */
    public boolean updateTemplateType(TemplateTypeVO templateTypeVO) {
        return templateTypeDAO.updateTemplateType(templateTypeVO);
    }
}
