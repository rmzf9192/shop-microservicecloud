package com.el.provider8001.configure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: roman.zhang
 * @Date: 2019/4/29 11:07
 * @Version:V1.0
 * @Description:MapperScanConfigure
 */
@Configuration
@MapperScan(value = {
        "com.el.provider8001.mapper",
        "com.el.provider8001.*.mapper",
        "com.el.provider8001.*.*.mapper",
})
public class MapperScanConfigure {
}
