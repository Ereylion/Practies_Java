package Pr_22;

public class TextDocument implements IDocument {
    private String info;

    @Override
    public void openFile() {
        System.out.println("Открыть текстовый документ: " + info);
    }

    @Override
    public void newFile() {
        info = "";
        System.out.println("Новый текстовый документ создан");
    }

    @Override
    public void saveFile() {
        System.out.println("Текстовый документ сохранен");
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
