public class Powershell implements Terminal{

    @Override
    public void run(String command, String user) {
        System.out.println(command + " run as " + user + " successfully");
    }

}
