package com.zyd.spi.test;

import com.zyd.spi.service.Czbk;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 测试类
 */
public class SpiTest {

    public static void main(String[] args) {

        /**
         * java原生的SPI：
         * 1、创建接口
         * 2、创建接口的实现类
         * 3、在resource下创建META-INF/services文件夹
         * 4、创建文件，文件名称必须是接口的全类名，并且文件的内容是实现类的全类名
         */
        /*ServiceLoader<Czbk> serviceLoader = ServiceLoader.load(Czbk.class);
        Iterator<Czbk> iterator = serviceLoader.iterator();
        while(iterator.hasNext()){
            Czbk czbkImpl = iterator.next();
            czbkImpl.service();
        }*/

        /**
         * Dubbo SPI：
         * 1、创建接口
         * 2、创建接口的实现类
         * 3、在resource下创建META-INF/services文件夹
         * 4、创建文件，文件名称必须是接口的全类名,文件内容格式：
         * college=com.zyd.spi.service.impl.Czxy
         * shortTrain=com.zyd.spi.service.impl.Itheima
         */
        ExtensionLoader<Czbk> extensionLoader = ExtensionLoader.getExtensionLoader(Czbk.class);
        Czbk college = extensionLoader.getExtension("college");
        college.service();

    }
}
