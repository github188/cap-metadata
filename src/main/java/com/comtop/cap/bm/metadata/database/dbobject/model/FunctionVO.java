
package com.comtop.cap.bm.metadata.database.dbobject.model;

import java.util.ArrayList;
import java.util.List;

import com.comtop.cap.bm.metadata.base.model.BaseModel;
import comtop.org.directwebremoting.annotations.DataTransferObject;

/**
 * 字段VO
 * 
 * @author zhangzunzhi
 * @since 1.0
 * @version 2015-12-22 zhangzunzhi
 */
@DataTransferObject
public class FunctionVO extends BaseModel {
    
    /** 序列化ID */
    private static final long serialVersionUID = -7835839784462125856L;
    
    /** 中文名称 */
    private String chName;
    
    /** 英文名称 */
    private String engName;
    
    /** 描述 */
    private String description;
    
    /** 存储语句 */
    private String sqlProcedure;
    
    /** 包含字段 */
    private List<FunctionColumnVO> functionColumns = new ArrayList<FunctionColumnVO>();
    
    /**
     * @return 获取 chName属性值
     */
    public String getChName() {
        return chName;
    }
    
    /**
     * @param chName 设置 chName 属性值为参数值 chName
     */
    public void setChName(String chName) {
        this.chName = chName;
    }
    
    /**
     * @return 获取 engName属性值
     */
    public String getEngName() {
        return engName;
    }
    
    /**
     * @param engName 设置 engName 属性值为参数值 engName
     */
    public void setEngName(String engName) {
        this.engName = engName;
    }
    
    /**
     * @return 获取 description属性值
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * @param description 设置 description 属性值为参数值 description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * @return 获取 sqlProcedure属性值
     */
    public String getSqlProcedure() {
        return sqlProcedure;
    }
    
    /**
     * @param sqlProcedure 设置 sqlProcedure 属性值为参数值 sqlProcedure
     */
    public void setSqlProcedure(String sqlProcedure) {
        this.sqlProcedure = sqlProcedure;
    }
    
    /**
     * @return 获取 functionColumns属性值
     */
    public List<FunctionColumnVO> getFunctionColumns() {
        return functionColumns;
    }
    
    /**
     * @param functionColumns 设置 functionColumns 属性值为参数值 functionColumns
     */
    public void setFunctionColumns(List<FunctionColumnVO> functionColumns) {
        this.functionColumns = functionColumns;
    }
    
}
