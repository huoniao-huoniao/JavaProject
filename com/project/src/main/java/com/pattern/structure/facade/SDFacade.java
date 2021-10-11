package com.pattern.structure.facade;

public class SDFacade implements ImlFacade {

    private FileManage fileManage;
    private MediaManage mediaManage;
    private AddressBookManage addressBookManage;

    public SDFacade(FileManage file, MediaManage media, AddressBookManage address) {
        this.fileManage = file;
        this.addressBookManage = address;
        this.mediaManage = media;
    }

    @Override
    public void backUp() {
        mediaManage.getMediaList();
        addressBookManage.getAddressBoooks();
        fileManage.send("文件1", "目标文件1");
    }

}
