package com.demo.cnbn.dubbo.impl;

import com.demo.cnbn.dubbo.api.DubboDemoService;

/**
 * @author guochunyuan
 * @create on  2018-10-11 16:14
 */
public class DubboDemoServiceimpl implements DubboDemoService {
    @Override
    public String getString() {
        return "注册服务，分布式过来的数据。";
    }
}
