package com.galen.alert.core.executor.dingtalk;

import com.alibaba.fastjson.JSON;

/**
 * @author shuaiys
 * @version 1.0
 * @Package com.ald.bubble.alert.executor.dingtalk
 * @Description TODO
 * @Date 2019/3/28 14:22
 */
public class MarkdownContent {

    private String msgtype;
    private Markdown markdown;
    private TextContent.At at;

    private class Markdown {
        private String title;
        private String text;

        private Markdown(){}

        private Markdown(String title, String text) {
            this.title = title;
            this.text = text;
        }

        public String getTitle() {
            return title;
        }

        private Markdown setTitle(String title) {
            this.title = title;
            return this;
        }

        public String getText() {
            return text;
        }

        private Markdown setText(String text) {
            this.text = text;
            return this;
        }
    }

    public String getMsgtype() {
        return msgtype;
    }

    private void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public Markdown getMarkdown() {
        return markdown;
    }

    private void setMarkdown(Markdown markdown) {
        this.markdown = markdown;
    }

    public TextContent.At getAt() {
        return at;
    }

    private void setAt(TextContent.At at) {
        this.at = at;
    }

    public static MarkdownContent build(String title, String text) {
        return getInstance(title, text, null, false);
    }

    public static MarkdownContent build(String title, String text, String[] atMobiles) {
        return getInstance(title, text, atMobiles, false);
    }

    public static MarkdownContent build(String title, String text, String[] atMobiles, boolean isAtAll) {
        return getInstance(title, text, atMobiles, isAtAll);
    }

    private static MarkdownContent getInstance(String title, String text, String[] atMobiles, boolean isAtAll) {
        MarkdownContent content = new MarkdownContent();
        content.at = new TextContent().new At(atMobiles, isAtAll);
        content.markdown = content.new Markdown(title == null ? "" : title, text == null ? "" : text);
        return content;
    }

    public static void main(String[] args) {
        MarkdownContent content = MarkdownContent.build("标题", "neirong", new String[]{"4324","325435"}, true);
        System.err.println(JSON.toJSONString(content));
    }

}
