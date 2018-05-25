package com.github.hellorpc.initializer;

import com.georgeinfo.ginkgo.dynamic.ScannerException;
import com.georgeinfo.ginkgo.injection.BAC;
import com.georgeinfo.ginkgo.injection.context.ApplicationContext;
import com.georgeinfo.ginkgo.injection.exception.DIException;
import com.github.hellorpc.logger.GeorgeLogger;
import com.github.hellorpc.logger.GeorgeLoggerFactory;

/**
 * 总入口类
 *
 * @author George (GeorgeWorld@qq.com)
 */
public class Hello {
    private static final GeorgeLogger LOG = GeorgeLoggerFactory.getLogger(Hello.class);

    public static Hello rpc() {
        //初始化DI环境
        try {
            //扫描并注册应用层服务
            LOG.debug("--- Initialize the DI environment BEGIN... ---");
            ApplicationContext context = BAC
                    .annotation()
                    .setBeanPackPath(new String[]{"hello.service.impl"})//扫描这个包下面的所有服务类
                    .build();

            //开始注册内置服务对象
            LOG.debug("--- Registered built-in service class... ---");
//                context = BAC.manual(context)
//                        .add(loggerImpl.getClass())
//                        .build();

            LOG.debug("## DI environment initialization has been completed, we got [" + context.getBeanSize() + "] instances");

            LOG.debug("--- Initialize the DI environment END... ---");
        } catch (ScannerException e) {
            LOG.error("### Exception when scanning services.", e);
        } catch (DIException e) {
            LOG.error("### Exception when init DI Env.", e);
        }

        return new Hello();
    }
}
