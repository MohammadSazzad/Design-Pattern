public class Client {
    public static void main(String[] args) {
        Files f0 = new Files(18);
        Files f1 = new Files(76);
        Files f2 = new Files(78);

        Directory dir1 = new Directory();
        Directory root = new Directory();

        root.add(dir1);
        root.add(f0);
        root.add(f1);
        dir1.add(f2);

        System.out.println(root.fs());

    }
}
