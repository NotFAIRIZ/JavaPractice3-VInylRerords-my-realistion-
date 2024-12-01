import java.util.ArrayList;
import java.util.List;

public class ShopController {
    private List<AbstractCommand> commandsToExecute = new ArrayList<>();
    private List<AbstractCommand> commandHistory = new ArrayList<>();
    private List<VinylRecord> vinylCollection = new ArrayList<>();

    public void addCommand(AbstractCommand command) {
        commandsToExecute.add(command);
    }

    public void removeCommand(AbstractCommand command) {
        commandsToExecute.remove(command);
    }

    public void executeAllCommands() {
        for (AbstractCommand command : commandsToExecute) {
            command.execute();
            commandHistory.add(command);
        }
        commandsToExecute.clear();
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            AbstractCommand lastCommand = commandHistory.get(commandHistory.size() - 1);
            lastCommand.undo();
            commandHistory.remove(commandHistory.size() - 1);
        }
    }

    public List<VinylRecord> getVinylCollection() {
        return vinylCollection;
    }
}