package com.yao.HandlerExecptionResolver;

public class MyExecption extends Exception{
    private String msg;

    public MyExecption(String msg) {
        super();
        this.msg = msg;
    }

    public MyExecption(){}
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
