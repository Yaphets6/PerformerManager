package com.ruoyi.system.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.system.domain.SysLab;

/**
 * 标签管理Service接口
 * 
 * @author cooc
 * @date 2024-06-16
 */
public interface ISysLabService 
{
    /**
     * 查询标签管理
     * 
     * @param id 标签管理主键
     * @return 标签管理
     */
    public SysLab selectSysLabById(Long id);

    /**
     * 查询标签管理列表
     * 
     * @param sysLab 标签管理
     * @return 标签管理集合
     */
    public List<SysLab> selectSysLabList(SysLab sysLab);

    /**
     * 新增标签管理
     * 
     * @param sysLab 标签管理
     * @return 结果
     */
    public int insertSysLab(SysLab sysLab);

    /**
     * 修改标签管理
     * 
     * @param sysLab 标签管理
     * @return 结果
     */
    public int updateSysLab(SysLab sysLab);

    /**
     * 批量删除标签管理
     * 
     * @param ids 需要删除的标签管理主键集合
     * @return 结果
     */
    public int deleteSysLabByIds(Long[] ids);

    /**
     * 删除标签管理信息
     * 
     * @param id 标签管理主键
     * @return 结果
     */
    public int deleteSysLabById(Long id);


    public Map<Map<String,String>,List<SysLab>> formatLabList(String groupKeyName);
}
