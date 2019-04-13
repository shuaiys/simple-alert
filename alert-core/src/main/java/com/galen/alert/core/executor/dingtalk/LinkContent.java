package com.galen.alert.core.executor.dingtalk;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

/**
 * @author shuaiys
 * @version 1.0
 * @Package com.ald.bubble.alert.executor.dingtalk
 * @Description TODO
 * @Date 2019/3/28 14:01
 */
public class LinkContent {

    private String msgtype = "link";

    private Link link;

    private class Link {
        private String text;
        private String title;
        private String picUrl;
        private String messageUrl;

        private Link(){}

        public String getText() {
            return text;
        }

        private Link setText(String text) {
            this.text = text;
            return this;
        }

        public String getTitle() {
            return title;
        }

        private Link setTitle(String title) {
            this.title = title;
            return this;
        }

        public String getPicUrl() {
            return picUrl;
        }

        private Link setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }

        public String getMessageUrl() {
            return messageUrl;
        }

        private Link setMessageUrl(String messageUrl) {
            this.messageUrl = messageUrl;
            return this;
        }
    }

    public String getMsgtype() {
        return msgtype;
    }

    private void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Link getLink() {
        return link;
    }

    private void setLink(Link link) {
        this.link = link;
    }

    public static LinkContent build(String title, String text, String messageUrl) {
        return getInstance(title,text,messageUrl,null);
    }

    public static LinkContent build(String title, String text, String messageUrl, String picUrl) {
        return getInstance(title,text,messageUrl,picUrl);
    }

    private static LinkContent getInstance(String title, String text, String messageUrl, String picUrl) {
        LinkContent content = new LinkContent();
        Link link = content.new Link();
        link.setTitle(title).setText(text).setMessageUrl(messageUrl);
        if (StringUtils.isNotBlank(picUrl)) {
            link.setPicUrl(picUrl);
        } else {
            link.setPicUrl("");
        }
        content.link = link;
        return content;
    }

    public static void main(String[] args) {
        LinkContent content = LinkContent.build("标题","这里是内容","https://fdsfsdfs", "");
        System.err.println(JSON.toJSONString(content));
    }

}
