package indi.hanlonia.meaning.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZKUtils {

    public static final Logger log = LoggerFactory.getLogger(ZKUtils.class);

    public static void logPrint() {
        String auther = "Lin Han";
        log.trace("TRACE LOG:{}", auther);
        log.debug("DEBUG LOG:{}", auther);
        log.info("INFO LOG:{}", auther);
        log.warn("WARN LOG:{}", auther);
        log.error("ERROR LOG:{}", auther);
    }
}
