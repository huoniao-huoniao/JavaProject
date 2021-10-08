package JavaProject.com.liubb.structure.bridge;

public class Windows implements OS {

    private Image _image;

    public Windows(Image image) {
        this._image = image;
    }

    @Override
    public void doPaint() {
        // TODO Auto-generated method stub
        System.out.println("window操作系统");
        _image.Drawing();
    }

}
