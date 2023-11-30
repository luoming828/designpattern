package com.nsolm.decorator;

/**
 * @author : luoming@wedobest.com.cn
 * @date : 2023/11/9 11:02
 */
public abstract class NodeDecorator implements TextNode {

    protected final TextNode target;

    protected NodeDecorator(TextNode target){
        this.target = target;
    }

    @Override
    public void setText(String text){
        this.target.setText(text);
    }
}
