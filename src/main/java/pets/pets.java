package pets;

import java.util.*;

public class pets {
    String name;
    List<String> commands;

    public pets(String name) {
        this.name = name;
        this.commands = new ArrayList<>();
    }

    public void learnCommand(String command){
        commands.add(command);
    }

    public void listCommands() {
        System.out.println("Commands for " + name);
        for(String cmd : commands) {
            System.out.println(cmd);
        }
    }
}

