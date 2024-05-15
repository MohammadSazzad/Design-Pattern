import java.util.ArrayList;
import java.util.List;

public class Directory implements FSComponent {
    private int size;
    private List<FSComponent> childrens;
    public Directory() {
        this.size = 0;
        childrens = new ArrayList<>();
    }
    public void add(FSComponent component){
        childrens.add(component);
    }
    @Override
    public int fs() {
        for (FSComponent component : childrens) {
            size += component.fs();
        }
        return size;
    }
}
