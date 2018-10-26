package com.sh.zfc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PsersonInvocationHandle<T> implements InvocationHandler {
    T target;

    public PsersonInvocationHandle(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
    }
}
