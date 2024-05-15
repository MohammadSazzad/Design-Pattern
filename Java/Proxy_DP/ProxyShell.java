import java.util.ArrayList;
import java.util.List;

public class ProxyShell implements Terminal{
    private Powershell powershell;
    private List<String> vulnerableCommand;
    
    public ProxyShell() {
        powershell = new Powershell();
        vulnerableCommand = new ArrayList<>();
        vulnerableCommand.add("rm -rf");
    }

    @Override
    public void run(String command, String user) {
        if(vulnerableCommand.contains(command) && user != "admin"){
            System.out.println("Can't run command: " + command);
        }
        else{
            powershell.run(command,user);
        }
    }

}
