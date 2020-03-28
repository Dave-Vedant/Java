package vedant.learningPhase;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem newItem);
    boolean removerItem(ListItem newItem);
    void Traverse(ListItem item);
}