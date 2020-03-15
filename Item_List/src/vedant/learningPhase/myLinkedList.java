package vedant.learningPhase;

public class myLinkedList implements NodeList {

    private ListItem root = null;


    public myLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison > 0) {
                //new item is bigger so check list possible positions...
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison < 0) {
                // current item is bigger so check list possible position...
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // same
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removerItem(ListItem newItem) {
        if(newItem != null){
            System.out.println("Deleting item  " + newItem.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison  = currentItem.compareTo(newItem);
            if(comparison == 0){
                // found item to delete (match)...
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison <0){
                currentItem = currentItem.next();
            } else {
                //item is greater than current one so it is not exist in list. no need to delete
                return false;
            }
        }
        return false;
    }

    @Override
    public void Traverse(ListItem item) {
        if(this.root == null){
            System.out.println("The List is empty");
        } else {
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
