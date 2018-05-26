package com.github.hellorpc.configuration;

/**
 * 默认RPC配置实现类
 * @author George (GeorgeWorld@qq.com)
 */
public class RPConfigurationDefaultImpl implements RPConfiguration {
    @Override
    public int getPort() {
        return 9919;
    }
}
