package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.*;

public class LS {
    public static void main(String[] args) throws IOException {
        // 預設取得所有檔案
        var glob = args.length == 0 ? "*" : args[0];
        
        // 取得目前工作路徑
        var userPath = Paths.get(System.getProperty("user.dir"));
        try(var directoryStream = 
                Files.newDirectoryStream(userPath, glob)) {
            directoryStream.forEach(path -> out.println(path.getFileName()));
        }
    }
} 