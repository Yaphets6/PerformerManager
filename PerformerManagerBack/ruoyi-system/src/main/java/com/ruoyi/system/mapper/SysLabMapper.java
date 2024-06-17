package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysLab;

/**
 * 标签管理Mapper接口
 * 
 * @author cooc
 * @date 2024-06-16
 */
public interface SysLabMapper 
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
     * 删除标签管理
     * 
     * @param id 标签管理主键
     * @return 结果
     */
    public int deleteSysLabById(Long id);

    /**
     * 批量删除标签管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysLabByIds(Long[] ids);
}
