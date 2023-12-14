package Pr_22;

public class MusicDocument implements IDocument {
    private String info;

    @Override
    public void openFile() {
        System.out.println("Открыть документ с музыкой: " + info);
    }

    @Override
    public void newFile() {
        info = "";
        System.out.println("Новый документ с музыкой создан");
    }

    @Override
    public void saveFile() {
        System.out.println("Документ с музыкой сохранен");
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
