package cn.ld.ddxq.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//<item>
//<Title><![CDATA[title1]]></Title> 
//<Description><![CDATA[description1]]></Description>
//<PicUrl><![CDATA[picurl]]></PicUrl>
//<Url><![CDATA[url]]></Url>
//</item>
@XmlRootElement(name = "item")
public class TuWenMessageDetail {
    private String Title;
    private String Description;
    private String PicUrl;
    private String Url;

    @XmlElement(name = "Title")
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    @XmlElement(name = "Description")
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @XmlElement(name = "PicUrl")
    public String getPicUrl() {
        return PicUrl;
    }

    public void setPicUrl(String picUrl) {
        PicUrl = picUrl;
    }

    @XmlElement(name = "Url")
    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

}
