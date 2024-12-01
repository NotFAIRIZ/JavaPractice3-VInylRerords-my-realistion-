public class Main {
    public static void main(String[] args) {
        ShopController controller = new ShopController();
        VinylRecord vinyl1 = new VinylRecord("Album1", (short) 2022, "Author1", 12);
        VinylRecord vinyl2 = new VinylRecord("Album2", (short) 2021, "Author2", 12);

        AddVinylCommand addCommand1 = new AddVinylCommand(vinyl1, controller.getVinylCollection());
        AddVinylCommand addCommand2 = new AddVinylCommand(vinyl2, controller.getVinylCollection());

        controller.addCommand(addCommand1);
        controller.addCommand(addCommand2);
        controller.executeAllCommands();

        System.out.println("Vinyl collection after adding:");
        controller.getVinylCollection().forEach(System.out::println);

        RemoveVinylCommand removeCommand = new RemoveVinylCommand(vinyl1, controller.getVinylCollection());
        controller.addCommand(removeCommand);
        controller.executeAllCommands();

        System.out.println("\nVinyl collection after removing:");
        controller.getVinylCollection().forEach(System.out::println);

        SetGradingCommand setGradingCommand = new SetGradingCommand(vinyl2, "NM");
        controller.addCommand(setGradingCommand);
        controller.executeAllCommands();

        System.out.println("\nVinyl collection after setting grading:");
        controller.getVinylCollection().forEach(System.out::println);

        controller.undoLastCommand();

        System.out.println("\nVinyl collection after undoing last command:");
        controller.getVinylCollection().forEach(System.out::println);
    }
}