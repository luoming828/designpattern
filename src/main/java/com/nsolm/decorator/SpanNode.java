package com.nsolm.decorator;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/9 10:59
 */
public class SpanNode implements TextNode{

    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}
