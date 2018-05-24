package com.github.hellorpc.initializer;

import com.georgeinfo.ginkgo.dynamic.ClasspathFileScanner;
import com.georgeinfo.ginkgo.dynamic.ScannerException;
import com.github.hellorpc.exception.HelloBaseException;

import java.util.Set;

/**
 * 总入口类
 *
 * @author George (GeorgeWorld@qq.com)
 */
public class Hello {
    public static Hello rpc() throws HelloBaseException, ScannerException {
        //扫描内置约定包，寻找SPI实现类
        Set<String> classpathFileSet = null;
        try {
            classpathFileSet = ClasspathFileScanner.scanFilesInClassPath(
                    new String[]{"META-INF/services"},
                    true,
                    new SPIFileNameFilter()
            );
        } catch (ScannerException e) {
            throw e;
        }
        if (classpathFileSet == null || classpathFileSet.isEmpty()) {
            throw new HelloBaseException("### Can't read SPI implements class in META-INF/services.");
        }

        for (String fileName : classpathFileSet) {
            if (fileName.equals("com.github.hellorpc.logger.GeorgeLogger")) {
                //读取其实现类，实例化
            }
        }

        return new Hello();
    }
}
