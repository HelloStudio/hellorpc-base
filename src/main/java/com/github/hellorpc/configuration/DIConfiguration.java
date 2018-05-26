package com.github.hellorpc.configuration;

import com.georgeinfo.ginkgo.injection.annotation.Configuration;
import com.georgeinfo.ginkgo.injection.config.BasicConfiguration;
import com.georgeinfo.ginkgo.injection.handler.ClassScanningHandler;
import com.github.hellorpc.handler.HelloClassScanningHandler;

/**
 * Hello RPC提供的DI环境配置实现类
 *
 * @author George (GeorgeWorld@qq.com)
 */
@Configuration
public class DIConfiguration implements BasicConfiguration {
    @Override
    public ClassScanningHandler getClassScanningHandler() {
        return new HelloClassScanningHandler();
    }
}
