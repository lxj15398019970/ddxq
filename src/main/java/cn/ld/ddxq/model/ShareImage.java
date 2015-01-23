/*
 * Copyright (c) 2013-2014, thinkjoy Inc. All Rights Reserved.
 *
 * Project Name: ddxq
 * $Id:  ShareImage.java 2015-01-19 18:21:11 $
 */



package cn.ld.ddxq.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import java.util.*;

public class ShareImage extends BaseDomain{
    private String imageUrl;
    private Long shareId;

	public ShareImage(){
	}
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
    public void setShareId(Long value) {
        this.shareId = value;
    }

    public Long getShareId() {
        return this.shareId;
    }

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("ImageUrl",getImageUrl())
			.append("ShareId",getShareId())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof ShareImage == false) return false;
		if(this == obj) return true;
		ShareImage other = (ShareImage)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

