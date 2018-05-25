package com.github.hellorpc.logger;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 通用日志工厂类
 *
 * @author George (GeorgeWorld@qq.com)
 */

public final class GeorgeLoggerFactory {
    private static GeorgeLogger LOGGER;

    static {
        synchronized (GeorgeLogger.class) {
            //使用SPI机制，扫描META-INF/services包，寻找日志实现类
            ServiceLoader<GeorgeLogger> loggerServices = ServiceLoader.load(GeorgeLogger.class);
            Iterator<GeorgeLogger> iterator = loggerServices.iterator();
            while (iterator.hasNext()) {
                LOGGER = iterator.next();
            }

            //for (GeorgeLogger logger : loggerServices) {
            //让logger实现类自己提供自己的实例，避免使用logger.getClass().newInstance()这种反射方式来实例化
            //    LOGGER = logger.getInstance();
            //}

            if (LOGGER == null) {
                LOGGER = new SystemLogProxy();
                LOGGER.bindingClassInitLogger(GeorgeLoggerFactory.class);

                LOGGER.error("### Logger instance not found in META-INF/services.");
            }
        }
    }

    public static GeorgeLogger getLogger(Class<?> clazz) {
        LOGGER.bindingClassInitLogger(clazz);
        return LOGGER;
    }


}