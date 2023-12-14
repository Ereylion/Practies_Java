package Pr_22;

public class Application {
    public static void main(String[] args) {
        // Создание фабрик для создания различных типов документов
        IDocumentFactory textFactory = new TextDocumentFactory();
        IDocumentFactory musicFactory = new MusicDocumentFactory();
        IDocumentFactory imageFactory = new ImageDocumentFactory();

        // Создание экземпляров приложений для работы с разными типами документов
        Application textApp = new Application(textFactory);
        textApp.createNewDocument();
        textApp.setDocumentInfo("Тестовый текстовый документ");
        textApp.saveDocument();

        // Создание новых документов, установка информации и сохранение
        Application musicApp = new Application(musicFactory);
        musicApp.createNewDocument();
        musicApp.setDocumentInfo("Тестовый документ с музыкой");
        musicApp.saveDocument();

        Application imageApp = new Application(imageFactory);
        imageApp.createNewDocument();
        imageApp.setDocumentInfo("Тестовый документ с изображение");
        imageApp.saveDocument();
    }
    private IDocumentFactory documentFactory;
    private IDocument document;

    public Application(IDocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }
    // Создание нового документа с помощью соответствующей фабрики
    public void createNewDocument() {
        document = documentFactory.createNewDocument();
        document.newFile();
    }
    // Открытие существующего документа с помощью соответствующей фабрики и передачей информации о документе
    public void openExistingDocument(String info) {
        document = documentFactory.openExistingDocument(info);
        document.openFile();
    }
    // Сохранение документа, если он существует
    public void saveDocument() {
        if (document != null) {
            document.saveFile();
        } else {
            System.out.println("Нет документа для сохранения");
        }
    }
    // Установка информации о документе, если документ существует
    public void setDocumentInfo(String info) {
        if (document != null) {
            document.setInfo(info);
        } else {
            System.out.println("Нет документа для установки информации");
        }
    }
    // Получение информации о документе, если документ существует
    public String getDocumentInfo() {
        if (document != null) {
            return document.getInfo();
        } else {
            System.out.println("Нет документа для получения информации");
            return null;
        }
    }
}
