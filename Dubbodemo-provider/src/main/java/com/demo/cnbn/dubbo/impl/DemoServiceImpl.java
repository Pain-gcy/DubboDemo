package com.demo.cnbn.dubbo.impl;

import com.demo.cnbn.dubbo.api.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guochunyuan
 * @create on  2018-06-06 9:32
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public List<String> getPermissions(Long id) {
            List<String> demo = new ArrayList<String>();
            demo.add(String.format("Permission_%d", id - 1));
            demo.add(String.format("Permission_%d", id));
            demo.add(String.format("Permission_%d", id + 1));
            return demo;
    }
}
