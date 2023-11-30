package com.nsolm.decorator;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/9 11:18
 */
public class DelDecorator extends NodeDecorator{

    protected DelDecorator(TextNode target) {
        super(target);
    }

    @Override
    public String getText() {
        return "<del>" + this.target.getText() + "</del>";
    }
}
