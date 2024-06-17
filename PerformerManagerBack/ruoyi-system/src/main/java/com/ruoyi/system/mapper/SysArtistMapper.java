package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysArtist;

/**
 * 艺人管理Mapper接口
 * 
 * @author cooc
 * @date 2024-06-16
 */
public interface SysArtistMapper 
{
    /**
     * 查询艺人管理
     * 
     * @param id 艺人管理主键
     * @return 艺人管理
     */
    public SysArtist selectSysArtistById(Long id);

    /**
     * 查询艺人管理列表
     * 
     * @param sysArtist 艺人管理
     * @return 艺人管理集合
     */
    public List<SysArtist> selectSysArtistList(SysArtist sysArtist);

    /**
     * 新增艺人管理
     * 
     * @param sysArtist 艺人管理
     * @return 结果
     */
    public int insertSysArtist(SysArtist sysArtist);

    /**
     * 修改艺人管理
     * 
     * @param sysArtist 艺人管理
     * @return 结果
     */
    public int updateSysArtist(SysArtist sysArtist);

    /**
     * 删除艺人管理
     * 
     * @param id 艺人管理主键
     * @return 结果
     */
    public int deleteSysArtistById(Long id);

    /**
     * 批量删除艺人管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysArtistByIds(Long[] ids);
}
