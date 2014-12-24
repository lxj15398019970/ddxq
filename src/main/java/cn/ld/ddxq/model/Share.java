/*
 *
 * Project Name: ddxq
 * $Id:  Share.java 2014-12-24 22:57:43 $
 */



package cn.ld.ddxq.model;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.Date;

public class Share extends BaseDomain{
    private Long userId;
    private String content;
    private Integer comment;
    private Integer zan;
    private Date createTime;

	public Share(){
	}
    public void setUserId(Long value) {
        this.userId = value;
    }

    public Long getUserId() {
        return this.userId;
    }
    public void setContent(String value) {
        this.content = value;
    }

    public String getContent() {
        return this.content;
    }
    public void setComment(Integer value) {
        this.comment = value;
    }

    public Integer getComment() {
        return this.comment;
    }
    public void setZan(Integer value) {
        this.zan = value;
    }

    public Integer getZan() {
        return this.zan;
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
			.append("UserId",getUserId())
			.append("Content",getContent())
			.append("Comment",getComment())
			.append("Zan",getZan())
			.append("CreateTime",getCreateTime())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Share == false) return false;
		if(this == obj) return true;
		Share other = (Share)obj;
		return new EqualsBuilder()
			.append(getId(),other.getId())
			.isEquals();
	}
}

