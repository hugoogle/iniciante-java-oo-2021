package command;

import interfaces.ICommand;

import java.util.List;

public class Executor {
    public void execute(List<ICommand> tasks) {
        for (ICommand task : tasks) {
            task.execute();
        }
    }
}