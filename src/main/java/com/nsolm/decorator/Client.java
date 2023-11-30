package com.nsolm.decorator;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/9 11:08
 */
public class Client {
    public static void main(String[] args) {
        TextNode textNode = new SpanNode();
        textNode.setText("hello world");

        TextNode textNode1 = new DelDecorator(new BoldDecorator(textNode));
        String text = textNode1.getText();
        System.out.println(text);
    }
}
