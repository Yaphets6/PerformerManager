package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysArtistLab;

/**
 * 艺人标签关系Service接口
 * 
 * @author cooc
 * @date 2024-06-16
 */
public interface ISysArtistLabService 
{
    /**
     * 查询艺人标签关系
     * 
     * @param id 艺人标签关系主键
     * @return 艺人标签关系
     */
    public SysArtistLab selectSysArtistLabById(Long id);

    /**
     * 查询艺人标签关系列表
     * 
     * @param sysArtistLab 艺人标签关系
     * @return 艺人标签关系集合
     */
    public List<SysArtistLab> selectSysArtistLabList(SysArtistLab sysArtistLab);

    /**
     * 新增艺人标签关系
     * 
     * @param sysArtistLab 艺人标签关系
     * @return 结果
     */
    public int insertSysArtistLab(SysArtistLab sysArtistLab);

    /**
     * 修改艺人标签关系
     * 
     * @param sysArtistLab 艺人标签关系
     * @return 结果
     */
    public int updateSysArtistLab(SysArtistLab sysArtistLab);

    /**
     * 批量删除艺人标签关系
     * 
     * @param ids 需要删除的艺人标签关系主键集合
     * @return 结果
     */
    public int deleteSysArtistLabByIds(Long[] ids);

    /**
     * 删除艺人标签关系信息
     * 
     * @param id 艺人标签关系主键
     * @return 结果
     */
    public int deleteSysArtistLabById(Long id);
}
