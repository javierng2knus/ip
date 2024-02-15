package jav.command;

import jav.exception.InvalidParamException;
import jav.manager.StorageManager;
import jav.manager.UiManager;

/**
 * DeleteTaskCommand handles the executing of deletion of tasks.
 */
public class DeleteTaskCommand extends TaskCommand {
    /**
     * Constructs a new DeleteTaskCommand.
     *
     * @param param the parameter of the command.
     * @return a new DeleteTaskCommand.
     */
    public DeleteTaskCommand(String param) {
        this.param = param;
    }

    @Override
    public String execute() throws InvalidParamException {
        // Check if given a -ve index
        if (Integer.parseInt(param) < 1) {
            throw new InvalidParamException("Cannot delete task, given num is -ve", null);
        }

        // Check if given an index bigger than size of list
        if (StorageManager.getInstance().deleteTask(Integer.parseInt(param) - 1)) {
            return UiManager.getInstance().printDeletingTask();
        } else {
            throw new InvalidParamException("Cannot delete task, given num is out of scope", null);
        }
    }
}
