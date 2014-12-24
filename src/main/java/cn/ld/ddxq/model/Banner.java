/*
 *
 * Project Name: ddxq
 * $Id:  Banner.java 2014-12-24 22:57:42 $
 */



package cn.ld.ddxq.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.*;

public class Banner extends BaseDomain{
    private String title;
    private String imageUrl;
    private Date createTime;

	public Banner(){
	}
    public void setTitle(String value) {
        this.title = value;
    }

    public String getTitle() {
        return this.title;
    }
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setCreateTime(Date value) {
        this.createTime = value;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Title",getTitle())
			.append("ImageUrl",getImageUrl())
			.append("CreateTime",getCreateTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Banner == false) return false;
		if(this == obj) return true;
		Banner other = (Banner)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

