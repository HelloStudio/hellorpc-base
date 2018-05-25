package com.github.hellorpc.logger;

/**
 * 通用日志接口（具体的日志实现类，在应用层来传入，以兼容所有主流的日志框架）
 *
 * @author George (GeorgeWorld@qq.com)
 **/
public interface GeorgeLogger {
    public static final String ROOT_LOGGER_NAME = "ROOT";

    public GeorgeLogger getInstance();

    public void bindingClass(Class<?> clazz);

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