package com.pattern.structure.facade;

public class Client {
    public static void main(String[] args) {
        SDFacade sdFacade = new SDFacade(new FileManage(), new MediaManage(), new AddressBookManage());
        sdFacade.backUp();
    }
}
