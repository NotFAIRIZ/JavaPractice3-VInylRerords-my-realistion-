public class SetGradingCommand extends AbstractCommand {
    private VinylRecord vinyl;
    private String newGrading;
    private String oldGrading;

    public SetGradingCommand(VinylRecord vinyl, String newGrading) {
        this.vinyl = vinyl;
        this.newGrading = newGrading;
        this.oldGrading = vinyl.toString(); // Save the old grading for undo
    }

    @Override
    public void execute() {
        oldGrading = vinyl.toString();
        vinyl.setGrading(newGrading);
    }

    @Override
    public void undo() {
        vinyl.setGrading(oldGrading);
    }
}