package Pr_21;
//  Узел для использования в связанном списке
public class Node {
    public Object value; // Значение элемента, хранимого в узле
    public Node next; // Ссылка на следующий узел в связанном списке

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }
}
