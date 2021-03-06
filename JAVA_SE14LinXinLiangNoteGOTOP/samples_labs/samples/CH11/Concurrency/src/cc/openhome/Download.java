package cc.openhome;

import java.net.URL;
import java.io.*;

public class Download {
    public static void main(String[] args) throws Exception {
        URL[] urls = {
            new URL("https://openhome.cc/Gossip/Encoding/"),
            new URL("https://openhome.cc/Gossip/Scala/"),
            new URL("https://openhome.cc/Gossip/JavaScript/"),
            new URL("https://openhome.cc/Gossip/Python/")
        };
        
        String[] fileNames = {
            "Encoding.html",
            "Scala.html",
            "JavaScript.html",
            "Python.html"
        };

        new Pages(urls, fileNames, new DirectExecutor()).download();
    }
}
