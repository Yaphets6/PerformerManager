package com.ruoyi.system.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.ruoyi.common.core.domain.entity.SysDictData;
import com.ruoyi.system.mapper.SysDictDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysLabMapper;
import com.ruoyi.system.domain.SysLab;
import com.ruoyi.system.service.ISysLabService;

/**
 * 标签管理Service业务层处理
 * 
 * @author cooc
 * @date 2024-06-16
 */
@Service
public class SysLabServiceImpl implements ISysLabService 
{
    @Autowired
    private SysLabMapper sysLabMapper;

    @Autowired
    private SysDictDataMapper dictDataMapper;

    /**
     * 查询标签管理
     * 
     * @param id 标签管理主键
     * @return 标签管理
     */
    @Override
    public SysLab selectSysLabById(Long id)
    {
        return sysLabMapper.selectSysLabById(id);
    }

    /**
     * 查询标签管理列表
     * 
     * @param sysLab 标签管理
     * @return 标签管理
     */
    @Override
    public List<SysLab> selectSysLabList(SysLab sysLab)
    {
        return sysLabMapper.selectSysLabList(sysLab);
    }

    /**
     * 新增标签管理
     * 
     * @param sysLab 标签管理
     * @return 结果
     */
    @Override
    public int insertSysLab(SysLab sysLab)
    {
        return sysLabMapper.insertSysLab(sysLab);
    }

    /**
     * 修改标签管理
     * 
     * @param sysLab 标签管理
     * @return 结果
     */
    @Override
    public int updateSysLab(SysLab sysLab)
    {
        return sysLabMapper.updateSysLab(sysLab);
    }

    /**
     * 批量删除标签管理
     * 
     * @param ids 需要删除的标签管理主键
     * @return 结果
     */
    @Override
    public int deleteSysLabByIds(Long[] ids)
    {
        return sysLabMapper.deleteSysLabByIds(ids);
    }

    /**
     * 删除标签管理信息
     * 
     * @param id 标签管理主键
     * @return 结果
     */
    @Override
    public int deleteSysLabById(Long id)
    {
        return sysLabMapper.deleteSysLabById(id);
    }

    public Map<Map<String,String>,List<SysLab>> formatLabList(List<SysLab> labList,String groupKeyName) {
        Map<Map<String,String>,List<SysLab>> result = new HashMap<>();
        for (SysLab lab : labList) {
            SysDictData sysDictData = dictDataMapper.selectDictDataById(lab.getType());
            String group = sysDictData.getDictLabel();
            HashMap<String,String> objectObjectHashMap = new HashMap<>();
            objectObjectHashMap.put(groupKeyName,group);
            List<SysLab> sysLabs = result.get(objectObjectHashMap);
            if(sysLabs ==null){
                sysLabs = new ArrayList<>();
                result.put(objectObjectHashMap,sysLabs);
            }
            sysLabs.add(lab);
        }

        return result;
    }
}
