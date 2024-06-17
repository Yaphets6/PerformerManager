package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
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
import com.ruoyi.system.domain.SysArtist;
import com.ruoyi.system.service.ISysArtistService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 艺人管理Controller
 * 
 * @author cooc
 * @date 2024-06-16
 */
@RestController
@RequestMapping("/system/artist")
public class SysArtistController extends BaseController
{
    @Autowired
    private ISysArtistService sysArtistService;

    /**
     * 查询艺人管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:artist:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysArtist sysArtist)
    {
        startPage();
        List<SysArtist> list = sysArtistService.selectSysArtistList(sysArtist);
        return getDataTable(list);
    }

    /**
     * 导出艺人管理列表
     */
    @PreAuthorize("@ss.hasPermi('system:artist:export')")
    @Log(title = "艺人管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysArtist sysArtist)
    {
        List<SysArtist> list = sysArtistService.selectSysArtistList(sysArtist);
        ExcelUtil<SysArtist> util = new ExcelUtil<SysArtist>(SysArtist.class);
        util.exportExcel(response, list, "艺人管理数据");
    }

    /**
     * 获取艺人管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:artist:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(sysArtistService.selectSysArtistById(id));
    }

    /**
     * 新增艺人管理
     */
    @PreAuthorize("@ss.hasPermi('system:artist:add')")
    @Log(title = "艺人管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysArtist sysArtist)
    {

        sysArtist.setCreateBy(getUsername());
        return toAjax(sysArtistService.insertSysArtist(sysArtist));
    }

    /**
     * 修改艺人管理
     */
    @PreAuthorize("@ss.hasPermi('system:artist:edit')")
    @Log(title = "艺人管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysArtist sysArtist)
    {
        sysArtist.setUpdateBy(getUsername());
        return toAjax(sysArtistService.updateSysArtist(sysArtist));
    }

    /**
     * 删除艺人管理
     */
    @PreAuthorize("@ss.hasPermi('system:artist:remove')")
    @Log(title = "艺人管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(sysArtistService.deleteSysArtistByIds(ids));
    }
}
