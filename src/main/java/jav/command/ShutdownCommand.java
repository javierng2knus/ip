package jav.command;

import jav.Jav;

/**
 * ShutdownCommand handles the shutdown of the program.
 */
public class ShutdownCommand extends Command {

    @Override
    public void execute() {
        Jav.exit();
    }

}
