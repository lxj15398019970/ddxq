/*
 *
 * Project Name: ddxq
 * $Id:  User.java 2014-12-24 22:57:43 $
 */



package cn.ld.ddxq.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class User extends BaseDomain{
    private Long comunityId;
    private String nickName;
    private String headUrl;
    private String userType;

	public User(){
	}
    public void setComunityId(Long value) {
        this.comunityId = value;
    }

    public Long getComunityId() {
        return this.comunityId;
    }
    public void setNickName(String value) {
        this.nickName = value;
    }

    public String getNickName() {
        return this.nickName;
    }
    public void setHeadUrl(String value) {
        this.headUrl = value;
    }

    public String getHeadUrl() {
        return this.headUrl;
    }
    public void setUserType(String value) {
        this.userType = value;
    }

    public String getUserType() {
        return this.userType;
    }

	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
			.append("Id",getId())
			.append("ComunityId",getComunityId())
			.append("NickName",getNickName())
			.append("HeadUrl",getHeadUrl())
			.append("UserType",getUserType())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof User == false) return false;
		if(this == obj) return true;
		User other = (User)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

