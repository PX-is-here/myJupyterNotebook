package cc.openhome;

import static java.lang.System.out;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class URLClassLoaderDemo {
    public static void main(String[] args) {
        try {
            var path = args[0];    // 測試路徑
            var clzName = args[1]; // 測試類別
            
            var clz1 = loadClassFrom(path, clzName);
            out.println(clz1);
            var clz2 = loadClassFrom(path, clzName);
            out.println(clz2);

            out.printf("clz1 與 clz2 為%s實例", 
                    clz1 == clz2 ? "相同" : "不同");
        } catch (ArrayIndexOutOfBoundsException e) {
            out.println("沒有指定類別載入路徑與名稱");
        } catch (MalformedURLException e) {
            out.println("載入路徑錯誤");
        } catch (ClassNotFoundException e) {
            out.println("找不到指定的類別");
        }
    }

    private static Class loadClassFrom(String path, String clzName) 
            throws ClassNotFoundException, MalformedURLException {
        var loader = new URLClassLoader(new URL[] {new URL(path)});
        return loader.loadClass(clzName);
    }
}
