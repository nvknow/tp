package command.servicecommand;

import command.Command;
import service.ServiceList;

public class RemoveServiceCommand extends Command {
    public static final String COMMAND_WORD = "remove";

    private int serviceId;

    public RemoveServiceCommand(int serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public void execute() {
        ServiceList.removeService(serviceId);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}