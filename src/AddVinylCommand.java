import java.util.List;
public class AddVinylCommand extends AbstractCommand {
    private VinylRecord vinyl;
    private List<VinylRecord> vinylCollection;

    public AddVinylCommand(VinylRecord vinyl, List<VinylRecord> vinylCollection) {
        this.vinyl = vinyl;
        this.vinylCollection = vinylCollection;
    }

    @Override
    public void execute() {
        vinylCollection.add(vinyl);
    }

    @Override
    public void undo() {
        vinylCollection.remove(vinyl);
    }
}