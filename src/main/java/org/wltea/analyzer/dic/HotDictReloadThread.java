package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

/**
 * @author liwei
 * @create: 2020/4/3 10:02 上午
 */
public class HotDictReloadThread implements Runnable {

    private static final Logger logger = ESPluginLoggerFactory.getLogger(HotDictReloadThread.class.getName());

    @Override
    public void run() {
        while (true) {
            logger.info("[==============]reload hot dict from mysql........");
            Dictionary.getSingleton().reLoadMainDict();
        }
    }
}