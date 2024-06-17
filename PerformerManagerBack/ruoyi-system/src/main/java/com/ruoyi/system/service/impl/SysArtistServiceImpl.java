package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.domain.SysArtistLab;
import com.ruoyi.system.mapper.SysArtistLabMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysArtistMapper;
import com.ruoyi.system.domain.SysArtist;
import com.ruoyi.system.service.ISysArtistService;

/**
 * 艺人管理Service业务层处理
 * 
 * @author cooc
 * @date 2024-06-16
 */
@Service
public class SysArtistServiceImpl implements ISysArtistService 
{
    @Autowired
    private SysArtistMapper sysArtistMapper;

    @Autowired
    private SysArtistLabMapper sysArtistLabMapper;

    /**
     * 查询艺人管理
     * 
     * @param id 艺人管理主键
     * @return 艺人管理
     */
    @Override
    public SysArtist selectSysArtistById(Long id)
    {
        return sysArtistMapper.selectSysArtistById(id);
    }

    /**
     * 查询艺人管理列表
     * 
     * @param sysArtist 艺人管理
     * @return 艺人管理
     */
    @Override
    public List<SysArtist> selectSysArtistList(SysArtist sysArtist)
    {
        return sysArtistMapper.selectSysArtistList(sysArtist);
    }

    /**
     * 新增艺人管理
     * 
     * @param sysArtist 艺人管理
     * @return 结果
     */
    @Override
    public int insertSysArtist(SysArtist sysArtist)
    {
        return sysArtistMapper.insertSysArtist(sysArtist);
    }

    /**
     * 修改艺人管理
     * 
     * @param sysArtist 艺人管理
     * @return 结果
     */
    @Override
    public int updateSysArtist(SysArtist sysArtist)
    {
        return sysArtistMapper.updateSysArtist(sysArtist);
    }

    /**
     * 批量删除艺人管理
     * 
     * @param ids 需要删除的艺人管理主键
     * @return 结果
     */
    @Override
    public int deleteSysArtistByIds(Long[] ids)
    {
        return sysArtistMapper.deleteSysArtistByIds(ids);
    }

    /**
     * 删除艺人管理信息
     * 
     * @param id 艺人管理主键
     * @return 结果
     */
    @Override
    public int deleteSysArtistById(Long id)
    {
        return sysArtistMapper.deleteSysArtistById(id);
    }



    private Long[] getArtistLabsIds(SysArtist sysArtist){
        SysArtistLab sysArtistLab = new SysArtistLab();
        sysArtistLab.setArtistId(sysArtist.getId());
        List<SysArtistLab> sysArtistLabs = sysArtistLabMapper.selectSysArtistLabList(sysArtistLab);
        return sysArtistLabs.stream().map(SysArtistLab::getLabId).toArray(Long[]::new);
    }

    private void insertArtistLab(SysArtist sysArtist){
        Long[] labs = getArtistLabsIds(sysArtist);
        if(labs.length > 0){
            for (Long lab : labs) {
                sysArtistLabMapper.deleteSysArtistLabByArtistId(sysArtist.getId());
                SysArtistLab sysArtistLab = new SysArtistLab();
                sysArtistLab.setLabId(lab);
                sysArtistLab.setArtistId(sysArtist.getId());
                sysArtistLabMapper.insertSysArtistLab(sysArtistLab);
            }
        }
    }
}
