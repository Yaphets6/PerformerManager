package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 艺人管理对象 sys_artist
 * 
 * @author cooc
 * @date 2024-06-16
 */
public class SysArtist extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 艺人主键 */
    private Long id;

    /** 艺人名字 */
    @Excel(name = "艺人名字")
    private String name;

    /** 艺人艺名 */
    @Excel(name = "艺人艺名")
    private String nickName;

    /** 身份证号 */
    @Excel(name = "身份证号")
    private String idCard;

    /** 籍贯 */
    @Excel(name = "籍贯")
    private String hometown;

    /** 住址 */
    @Excel(name = "住址")
    private String address;

    /** 手机 */
    @Excel(name = "手机")
    private String phone;

    private Long[] labs;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }
    public void setHometown(String hometown) 
    {
        this.hometown = hometown;
    }

    public String getHometown() 
    {
        return hometown;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public Long[] getLabs() {
        return labs;
    }

    public void setLabs(Long[] labs) {
        this.labs = labs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("nickName", getNickName())
            .append("idCard", getIdCard())
            .append("hometown", getHometown())
            .append("address", getAddress())
            .append("phone", getPhone())
            .toString();
    }
}
