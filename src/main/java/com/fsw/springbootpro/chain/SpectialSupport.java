package com.fsw.springbootpro.chain;

/**
 * 只解决特定数字的类
 */
public class SpectialSupport extends Support{
    private int number;

    public SpectialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()==number){
            return true;
        }
        return false;
    }
}
