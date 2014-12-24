/*
 *
 * Project Name: ddxq
 * $Id:  UserHead.java 2014-12-24 22:57:43 $
 */



package cn.ld.ddxq.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class UserHead extends BaseDomain{
    private String url;

	public UserHead(){
	}
    public void setUrl(String value) {
        this.url = value;
    }

    public String getUrl() {
        return this.url;
    }

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("Url",getUrl())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof UserHead == false) return false;
		if(this == obj) return true;
		UserHead other = (UserHead)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

