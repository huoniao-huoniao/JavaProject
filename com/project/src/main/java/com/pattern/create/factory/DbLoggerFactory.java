package com.pattern.create.factory;

public class DbLoggerFactory implements ILoggerFactory {

    @Override
    public ILogger createLogger() {
        return new DbLogger();
    }

}
