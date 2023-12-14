package Pr_22;

public class ImageDocument implements IDocument {
    private String info;

    @Override
    public void openFile() {
        System.out.println("Открыть документ с изображением: " + info);
    }

    @Override
    public void newFile() {
        info = "";
        System.out.println("Новый документ с изображением создан");
    }

    @Override
    public void saveFile() {
        System.out.println("Документ с изображением сохранен");
    }

    @Override
    public String getInfo() {
        return info;
    }

    @Override
    public void setInfo(String info) {
        this.info = info;
    }
}
