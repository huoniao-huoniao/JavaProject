package com.pattern.create.factory;

public class FileLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLogger() {
        return new FileLogger();
    }

}
