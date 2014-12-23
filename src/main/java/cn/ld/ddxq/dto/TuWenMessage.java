package cn.ld.ddxq.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "xml")
public class TuWenMessage {

    private String ToUserName;
    private String FromUserName;
    private long CreateTime;
    private String MsgType;
    private String ArticleCount;

    @XmlElement(name = "ArticleCount")
    public String getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(String articleCount) {
        ArticleCount = articleCount;
    }

    private List<TuWenMessageDetail> item =new ArrayList<TuWenMessageDetail>();

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

    @XmlElementWrapper(name = "Articles")
    @XmlElement(name = "item")
    public List<TuWenMessageDetail> getItem() {
        return item;
    }

    public void setItem(List<TuWenMessageDetail> item) {
        this.item = item;
    }

}
