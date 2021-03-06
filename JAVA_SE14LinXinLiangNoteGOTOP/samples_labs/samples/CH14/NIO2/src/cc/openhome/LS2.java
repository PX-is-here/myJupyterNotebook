package cc.openhome;

import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.*;

public class LS2 {
    public static void main(String[] args) throws IOException {
        // 預設使用Glob取得所有檔案
        var syntax = args.length == 2 ? args[0] : "glob";
        var pattern = args.length == 2 ? args[1] : "*";
        out.println(syntax + ":" + pattern);
        
        // 取得目前工作路徑
        var userPath = Paths.get(System.getProperty("user.dir"));
        var matcher = FileSystems.getDefault()
                                 .getPathMatcher(syntax + ":" + pattern);
       try(var directoryStream = Files.newDirectoryStream(userPath)) {
           directoryStream.forEach(path -> {
               var file = Paths.get(path.getFileName().toString());
               if(matcher.matches(file)) {
                   out.println(file.getFileName());
               }
           });
        }
    }
}
