package pw.zakharov.vkbot.util;

import com.google.common.io.Resources;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Alexey Zakharov
 * @since 06.06.2020
 */
public final class ConfigUtil {

    private static final Logger log = LoggerFactory.getLogger(ConfigUtil.class);

    public static void saveDefaultConfig() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(new File("config.conf"));

        saveResource("config.conf", outputStream);
    }

    public static void saveResource(final String fileName, final OutputStream outputStream) throws IOException {
        Resources.copy(Resources.getResource(fileName), outputStream);
    }

}
