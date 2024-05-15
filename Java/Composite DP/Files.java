public class Files implements FSComponent{
    private int size;

    public Files(int size) {
        this.size = size;
    }


    @Override
    public int fs() {
        return size;
    }

}
