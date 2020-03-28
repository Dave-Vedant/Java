package vedant.learningPhase;

public class NOde extends ListItem {

    public NOde(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightClick;
    }

    @Override
    ListItem setNext(ListItem item) {
        this.rightClick = item;
        return this.rightClick;
    }

    @Override
    ListItem previous() {
        return this.leftClick;
    }

    @Override
    ListItem setPrevious(ListItem item) {
        this.leftClick = item;
        return this.leftClick;
    }

    @Override
    int compareTo(ListItem item){
        if(item != null) {
            return ((String) super.getValue()).compareTo(((String) item.getValue()));
        }
        return -1;
    }
}
