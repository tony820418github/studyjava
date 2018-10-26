package com.sh.zfc.classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader {
    @Override
    public Class<?> loadClass(String name1) throws ClassNotFoundException {
        //return super.loadClass(name);
       // String fileName = name.substring(name.lastIndexOf(".")+1)+".class";
       String name="com.sh.zfc.sort.HeapSort";
        File file = new File("D:\\com\\sh\\zfc\\sort\\HeapSort.class");
        try {
        InputStream is = new FileInputStream(file);
            if (is == null) {
            return super.loadClass(name);
        }

            byte[] b = new byte[is.available()];
            is.read(b);
            return defineClass(name,b,0,b.length);
        } catch (IOException e) {
            throw new ClassNotFoundException(name);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader myld = new MyClassLoader();
        Object obj = myld.loadClass("com.sh.zfc.sort.HeapSort").newInstance();
//        System.out.println(obj.getClass());
//        System.out.println(obj.getClass().getClassLoader());
//        System.out.println(obj instanceof com.sh.zfc.sort.HeapSort);
    }
}
