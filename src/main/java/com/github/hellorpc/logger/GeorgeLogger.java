package com.github.hellorpc.logger;

/**
 * 通用日志接口（具体的日志实现类，在应用层来传入，以兼容所有主流的日志框架）
 * 此接口的实现类，一定要有一个无参构造方法
 *
 * @author George (GeorgeWorld@qq.com)
 **/
public interface GeorgeLogger {
    public static final String ROOT_LOGGER_NAME = "ROOT";

    /**
     * 使用给定的Class作为Logger构造函数，构造一个具体的Logger对象（slf4j或者apache commons logging
     *
     * @param clazz 当前在哪个类里面打印日志
     * @return logger日志实例，如slf4j log或者commons logging
     */
    public Object bindingClassInitLogger(Class<?> clazz);

    public boolean isTraceEnabled();

    public void trace(String paramString);

    public void trace(String paramString, Throwable paramThrowable);

    public void trace(Throwable paramThrowable);

    public boolean isDebugEnabled();

    public void debug(String paramString);

    public void debug(String paramString, Throwable paramThrowable);

    public void debug(Throwable paramThrowable);

    public boolean isInfoEnabled();

    public void info(String paramString);

    public void info(String paramString, Throwable paramThrowable);

    public void info(Throwable paramThrowable);

    public boolean isWarnEnabled();

    public void warn(String paramString);

    public void warn(String paramString, Throwable paramThrowable);

    public void warn(Throwable paramThrowable);

    public boolean isErrorEnabled();

    public void error(String paramString);

    public void error(String paramString, Throwable paramThrowable);

    public void error(Throwable paramThrowable);
}