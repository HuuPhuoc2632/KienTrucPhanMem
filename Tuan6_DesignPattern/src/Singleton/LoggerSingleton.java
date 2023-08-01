package Singleton;

import java.util.ArrayList;
import java.util.List;

public class LoggerSingleton {

    private static LoggerSingleton instance;
    private List<String> loggerMessages;

    private LoggerSingleton() {
        loggerMessages = new ArrayList<>();
    }

    public static LoggerSingleton getInstance(){
        if (instance==null){
            instance = new LoggerSingleton();
        }
        return instance;
    }

    public void log(String message) {
        loggerMessages.add(message);
    }

    public List<String> getLogs() {
        return loggerMessages;
    }
}
