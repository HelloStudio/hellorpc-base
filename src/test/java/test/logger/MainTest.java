package test.logger;

import com.github.hellorpc.initializer.Hello;
import com.github.hellorpc.logger.GeorgeLogger;
import com.github.hellorpc.logger.GeorgeLoggerFactory;

/**
 * @author George (GeorgeWorld@qq.com)
 */
public class MainTest {
    private static final GeorgeLogger LOGGER = GeorgeLoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args) {
        //初始化环境
        Hello.rpc();

        //打印日志
        LOGGER.debug("这是测试默认日志代理类");
    }
}
