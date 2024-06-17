package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.DateUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysLab;
import com.ruoyi.system.service.ISysLabService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 标签管理Controller
 * 
 * @author cooc
 * @date 2024-06-16
 */
@RestController
@RequestMapping("/system/lab")
public class SysLabController extends BaseController
{
    @Autowired
    private ISysLabService sysLabService;

    /**
     * 查询标签管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:lab:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysLab sysLab)
    {
        startPage();
        List<SysLab> list = sysLabService.selectSysLabList(sysLab);
        return getDataTable(list);
    }

    /**
     * 导出标签管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:lab:export')")
    @Log(title = "标签管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysLab sysLab)
    {
        List<SysLab> list = sysLabService.selectSysLabList(sysLab);
        ExcelUtil<SysLab> util = new ExcelUtil<SysLab>(SysLab.class);
        util.exportExcel(response, list, "标签管理数据");
    }

    /**
     * 获取标签管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:lab:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysLabService.selectSysLabById(id));
    }

    /**
     * 新增标签管理
     */
    @PreAuthorize("@ss.hasPermi('system:lab:add')")
    @Log(title = "标签管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysLab sysLab)
    {
        sysLab.setCreateBy(getUsername());
        return toAjax(sysLabService.insertSysLab(sysLab));
    }

    /**
     * 修改标签管理
     */
    @PreAuthorize("@ss.hasPermi('system:lab:edit')")
    @Log(title = "标签管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysLab sysLab)
    {
        sysLab.setUpdateBy(getUsername());
        return toAjax(sysLabService.updateSysLab(sysLab));
    }

    /**
     * 删除标签管理
     */
    @PreAuthorize("@ss.hasPermi('system:lab:remove')")
    @Log(title = "标签管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysLabService.deleteSysLabByIds(ids));
    }


    /**
     * 查询标签管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:lab:list')")
    @GetMapping("/optList")
    public AjaxResult list()
    {
        startPage();
        List<SysLab> list = sysLabService.selectSysLabList(sysLab);
        return success(sysLabService.formatLabList());
    }
}
