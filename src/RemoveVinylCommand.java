import java.util.List;
public class RemoveVinylCommand extends AbstractCommand {
    private VinylRecord vinyl;
    private List<VinylRecord> vinylCollection;

    public RemoveVinylCommand(VinylRecord vinyl, List<VinylRecord> vinylCollection) {
        this.vinyl = vinyl;
        this.vinylCollection = vinylCollection;
    }

    @Override
    public void execute() {
        vinylCollection.remove(vinyl);
    }

    @Override
    public void undo() {
        vinylCollection.add(vinyl);
    }
}