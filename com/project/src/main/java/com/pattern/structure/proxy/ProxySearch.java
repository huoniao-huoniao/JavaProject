package com.pattern.structure.proxy;

public class ProxySearch implements Searcher {

    private RealSearch realSearch;

    public ProxySearch(RealSearch realSearch) {
        this.realSearch = realSearch;
    }

    @Override
    public void doSearch() {
        otherMethod();
        realSearch.doSearch();
    }

    public void otherMethod() {
        System.out.println("其他方法");
    }

}
