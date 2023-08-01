package Singleton;

import java.util.List;

public class SingletonMain {
    public static void main(String[] args) {
        LoggerSingleton log1 = LoggerSingleton.getInstance();
        LoggerSingleton log2 = LoggerSingleton.getInstance();

        log1.log("Nhat ky ngay 1");
        log2.log("Nhat ky ngay 2");

        List<String> logger = log1.getLogs();

        for (String log: logger) {
            System.out.println(log);
        }
    }

}
