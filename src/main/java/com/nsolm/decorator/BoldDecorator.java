package com.nsolm.decorator;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/9 11:05
 */
public class BoldDecorator extends NodeDecorator {

    protected BoldDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<b>" + target.getText() + "</b>";
    }
}
