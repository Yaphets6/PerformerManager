package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysArtistLabMapper;
import com.ruoyi.system.domain.SysArtistLab;
import com.ruoyi.system.service.ISysArtistLabService;

/**
 * 艺人标签关系Service业务层处理
 * 
 * @author cooc
 * @date 2024-06-16
 */
@Service
public class SysArtistLabServiceImpl implements ISysArtistLabService 
{
    @Autowired
    private SysArtistLabMapper sysArtistLabMapper;

    /**
     * 查询艺人标签关系
     * 
     * @param id 艺人标签关系主键
     * @return 艺人标签关系
     */
    @Override
    public SysArtistLab selectSysArtistLabById(Long id)
    {
        return sysArtistLabMapper.selectSysArtistLabById(id);
    }

    /**
     * 查询艺人标签关系列表
     * 
     * @param sysArtistLab 艺人标签关系
     * @return 艺人标签关系
     */
    @Override
    public List<SysArtistLab> selectSysArtistLabList(SysArtistLab sysArtistLab)
    {
        return sysArtistLabMapper.selectSysArtistLabList(sysArtistLab);
    }

    /**
     * 新增艺人标签关系
     * 
     * @param sysArtistLab 艺人标签关系
     * @return 结果
     */
    @Override
    public int insertSysArtistLab(SysArtistLab sysArtistLab)
    {
        return sysArtistLabMapper.insertSysArtistLab(sysArtistLab);
    }

    /**
     * 修改艺人标签关系
     * 
     * @param sysArtistLab 艺人标签关系
     * @return 结果
     */
    @Override
    public int updateSysArtistLab(SysArtistLab sysArtistLab)
    {
        return sysArtistLabMapper.updateSysArtistLab(sysArtistLab);
    }

    /**
     * 批量删除艺人标签关系
     * 
     * @param ids 需要删除的艺人标签关系主键
     * @return 结果
     */
    @Override
    public int deleteSysArtistLabByIds(Long[] ids)
    {
        return sysArtistLabMapper.deleteSysArtistLabByIds(ids);
    }

    /**
     * 删除艺人标签关系信息
     * 
     * @param id 艺人标签关系主键
     * @return 结果
     */
    @Override
    public int deleteSysArtistLabById(Long id)
    {
        return sysArtistLabMapper.deleteSysArtistLabById(id);
    }
}
