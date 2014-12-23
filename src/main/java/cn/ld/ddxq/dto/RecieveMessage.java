package cn.ld.ddxq.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "xml")
public class RecieveMessage {
    private String ToUserName;
    private String FromUserName;
    private long CreateTime;
    private String MsgType;
    private String Content;
    private String MsgId;
    private String Event;
    private String EventKey;
    private String PicUrl;

    @XmlElement(name = "PicUrl")
    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    @XmlElement(name = "Event")
    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    @XmlElement(name = "EventKey")
    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    @XmlElement(name = "ToUserName")
    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    @XmlElement(name = "FromUserName")
    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    @XmlElement(name = "CreateTime")
    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    @XmlElement(name = "MsgType")
    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    @XmlElement(name = "Content")
    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @XmlElement(name = "MsgId")
    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }

}
