public class Client {
    public static void main(String[] args) {

        ProxyShell proxyShell = new ProxyShell();
        proxyShell.run("mkdir design pattern", "user");
        proxyShell.run("rm -rf", "user");
        proxyShell.run("rm -rf", "admin");
        
    }
}
