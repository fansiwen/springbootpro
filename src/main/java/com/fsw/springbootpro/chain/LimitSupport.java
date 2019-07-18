package com.fsw.springbootpro.chain;

/**
 * 只解决一定范围内的问题.
 */
public class LimitSupport extends Support{

    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber()<limit)
            return true;
        return false;
    }
}
