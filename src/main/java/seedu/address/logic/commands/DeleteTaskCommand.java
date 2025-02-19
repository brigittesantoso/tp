package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.Type.TASK;

import java.util.List;

import seedu.address.commons.core.Messages;
import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.logic.parser.Type;
import seedu.address.model.Model;
import seedu.address.model.tasks.Task;

public class DeleteTaskCommand extends DeleteCommand {

    public static final String MESSAGE_USAGE = COMMAND_WORD
        + " [t] : Deletes the task identified by the index number used in the displayed task list,\n"
        + "Parameters: INDEX (must be a positive integer),\n "
            + "Example: " + COMMAND_WORD + " [t] 1\n";

    public static final String MESSAGE_DELETE_TASK_SUCCESS = "Deleted Task: %1$s";

    private final Index targetIndex;

    /**
     * Constructor for DeleteTaskCommand.
     * @param targetIndex
     */
    public DeleteTaskCommand(Index targetIndex) {
        this.targetIndex = targetIndex;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);
        List<Task> lastShownList = model.getFilteredTaskList();

        if (targetIndex.getZeroBased() >= lastShownList.size()) {
            throw new CommandException(Messages.MESSAGE_INVALID_TASK_DISPLAYED_INDEX);
        }
        Task taskToDelete = lastShownList.get(targetIndex.getZeroBased());
        model.deleteTask(taskToDelete);
        return new CommandResult(String.format(MESSAGE_DELETE_TASK_SUCCESS, taskToDelete), getType());
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }

    @Override
    public Type getType() {
        return TASK;
    }
}
