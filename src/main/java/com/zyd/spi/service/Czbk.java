package com.zyd.spi.service;


import org.apache.dubbo.common.extension.SPI;

/**
 *
 */
@SPI//dubbo实现SPI必须要加
public interface Czbk {

    void service();
}
