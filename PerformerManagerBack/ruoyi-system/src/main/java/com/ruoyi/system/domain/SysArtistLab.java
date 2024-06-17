package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 艺人标签关系对象 sys_artist_lab
 * 
 * @author cooc
 * @date 2024-06-16
 */
public class SysArtistLab extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标签关系主键 */
    private Long id;

    /** 艺人ID */
    private Long artistId;

    /** 标签ID */
    private Long labId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setArtistId(Long artistId) 
    {
        this.artistId = artistId;
    }

    public Long getArtistId() 
    {
        return artistId;
    }
    public void setLabId(Long labId) 
    {
        this.labId = labId;
    }

    public Long getLabId() 
    {
        return labId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("artistId", getArtistId())
            .append("labId", getLabId())
            .toString();
    }
}
