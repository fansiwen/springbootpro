package com.fsw.springbootpro.chain;

/**
 * 责任链抽象类
 */
public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
    public final void support(Trouble trouble){
        if(resolve(trouble)){
            //如果可以解决问题，就自行解决
            done(trouble);
        }else if(next!=null){
            //如果本身不能解决，并且有下一个节点，那么就由下一个节点进行解决
            next.support(trouble);
        }else{
            //如果都不能解决，进行失败处理
            fail(trouble);
        }
    }

    protected  void fail(Trouble trouble){
        System.out.println(trouble+"can not be resolved");
    }

    protected abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble){
        System.out.println(trouble+"is resolved by"+this);
    }
}
