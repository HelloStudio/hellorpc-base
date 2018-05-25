package com.github.hellorpc.logger;


/**
 * 系统默认日志代理实现类
 *
 * @author George (GeorgeWorld@qq.com)
 **/
public class SystemLogProxy implements GeorgeLogger {
    private String className;
    private Class<?> clazz;

    public SystemLogProxy() {
    }

    @Override
    public Object bindingClassInitLogger(Class<?> clazz) {
        this.clazz = clazz;
        this.className = clazz.getName();

        return "System";
    }

    public boolean isTraceEnabled() {
        return false;
    }

    public void trace(String msg) {
        System.out.println("###### " + this.className + " --  trace : " + msg);
    }

    public void trace(String msg, Throwable t) {
        System.out.println("###### " + this.className + " --  trace : " + msg + ",exception : " + t.getMessage());
        t.printStackTrace();
    }

    public void trace(Throwable t) {
        System.out.println("###### " + this.className + " --  trace exception : " + t.getMessage());
        t.printStackTrace();
    }

    public boolean isDebugEnabled() {
        return false;
    }

    public void debug(String msg) {
        System.out.println("###### " + this.className + " --  debug : " + msg);
    }

    public void debug(String msg, Throwable t) {
        System.out.println("###### " + this.className + " --  debug : " + msg + ",exception : " + t.getMessage());
        t.printStackTrace();
    }

    public void debug(Throwable t) {
        System.out.println("###### " + this.className + " --  debug exception : " + t.getMessage());
        t.printStackTrace();
    }

    public boolean isInfoEnabled() {
        return false;
    }

    public void info(String msg) {
        System.out.println("###### " + this.className + " --  info : " + msg);
    }

    public void info(String msg, Throwable t) {
        System.out.println("###### " + this.className + " --  info : " + msg + ",exception : " + t.getMessage());
        t.printStackTrace();
    }

    public void info(Throwable t) {
        System.out.println("###### " + this.className + " --  info exception : " + t.getMessage());
        t.printStackTrace();
    }

    public boolean isWarnEnabled() {
        return false;
    }

    public void warn(String msg) {
        System.out.println("###### " + this.className + " --  warn : " + msg);
    }

    public void warn(String msg, Throwable t) {
        System.out.println("###### " + this.className + " --  warn : " + msg + ",exception : " + t.getMessage());
        t.printStackTrace();
    }

    public void warn(Throwable t) {
        System.out.println("###### " + this.className + " --  warn exception : " + t.getMessage());
        t.printStackTrace();
    }

    public boolean isErrorEnabled() {
        return true;
    }

    public void error(String msg) {
        System.err.println("###### " + this.className + " --  error : " + msg);
    }

    public void error(String msg, Throwable t) {
        System.err.println("###### " + this.className + " --  error : " + msg + ",exception : " + t.getMessage());
        t.printStackTrace();
    }

    public void error(Throwable t) {
        System.err.println("###### " + this.className + " --  error exception : " + t.getMessage());
        t.printStackTrace();
    }

    public String getClassName() {
        return this.className;
    }
}