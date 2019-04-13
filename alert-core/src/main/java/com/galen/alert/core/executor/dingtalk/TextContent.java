package com.galen.alert.core.executor.dingtalk;

import com.alibaba.fastjson.JSON;

/**
 * @author shuaiys
 * @version 1.0
 * @Package com.ald.bubble.alert.executor.dingtalk
 * @Description text类型
 * @Date 2019/3/28 11:22
 */
public class TextContent {

    private String msgtype = "text";

    private Text text;

    private At at;

    private class Text {
        private String content = "";

        private Text(){}

        private Text(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        private Text setContent(String content) {
            this.content = content;
            return this;
        }
    }

    public class At {
        private String[] atMobiles;

        private boolean isAtAll = false;

        public At() {}

        public At(String[] atMobiles, boolean isAtAll) {
            this.atMobiles = atMobiles;
            this.isAtAll = isAtAll;
        }
        private At(String[] atMobiles) {
            this.atMobiles = atMobiles;
        }

        public String[] getAtMobiles() {
            return atMobiles;
        }

        private At setAtMobiles(String[] atMobiles) {
            this.atMobiles = atMobiles;
            return this;
        }

        public boolean isAtAll() {
            return isAtAll;
        }

        private At setAtAll(boolean atAll) {
            isAtAll = atAll;
            return this;
        }
    }

    public String getMsgtype() {
        return msgtype;
    }

    private TextContent setMsgtype(String msgtype) {
        this.msgtype = msgtype;
        return this;
    }

    public Text getText() {
        return text;
    }

    private TextContent setText(Text text) {
        this.text = text;
        return this;
    }

    public At getAt() {
        return at;
    }

    private TextContent setAt(At at) {
        this.at = at;
        return this;
    }

    public static TextContent build(String content) {
        return getInstance(content);
    }

    public static TextContent build(String content,String[] atMobiles) {
        TextContent textContent = getInstance(content);
        textContent.at = textContent.new At(atMobiles);
        return textContent;
    }

    public static TextContent build(String content,String[] atMobiles, boolean isAtAll) {
        TextContent textContent = getInstance(content);
        textContent.at = textContent.new At(atMobiles,isAtAll);
        return textContent;
    }

    private static TextContent getInstance(String content) {
        TextContent textContent = new TextContent();
        textContent.text = textContent.new Text(content == null ? "" : content);
        return textContent;
    }

    public static void main(String[] args) {
        TextContent content = TextContent.build("abcdef",new String[]{"234","4324"});
        System.err.println(JSON.toJSONString(content));
    }

}
