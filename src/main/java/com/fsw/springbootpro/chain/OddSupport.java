package com.fsw.springbootpro.chain;

/**
 * 只解决奇数类问题
 */
public class OddSupport extends Support{

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber()%2==1){
            return true;
        }
        return false;
    }
}
