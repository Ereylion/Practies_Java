package Pr_22;

public interface IDocumentFactory {
    IDocument createNewDocument();
    IDocument openExistingDocument(String info);
}
