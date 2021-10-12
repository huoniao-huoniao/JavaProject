package com.pattern.structure.proxy;

public class RealSearch implements Searcher {

    @Override
    public void doSearch() {
        System.out.println("搜索");
    }

}
