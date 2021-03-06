package seedu.resireg.logic.parser;

import static seedu.resireg.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.resireg.commons.core.Messages.MESSAGE_UNKNOWN_COMMAND;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import seedu.resireg.logic.commands.AddCommand;
import seedu.resireg.logic.commands.AllocateCommand;
import seedu.resireg.logic.commands.ClearCommand;
import seedu.resireg.logic.commands.Command;
import seedu.resireg.logic.commands.DeallocateCommand;
import seedu.resireg.logic.commands.DeleteCommand;
import seedu.resireg.logic.commands.EditCommand;
import seedu.resireg.logic.commands.ExitCommand;
import seedu.resireg.logic.commands.FindCommand;
import seedu.resireg.logic.commands.HelpCommand;
import seedu.resireg.logic.commands.ListCommand;
import seedu.resireg.logic.commands.ListRoomCommand;
import seedu.resireg.logic.commands.ReallocateCommand;
import seedu.resireg.logic.parser.exceptions.ParseException;

/**
 * Parses user input.
 */
public class AddressBookParser {

    /**
     * Used for initial separation of command word and args.
     */
    private static final Pattern BASIC_COMMAND_FORMAT = Pattern.compile("(?<commandWord>\\S+)(?<arguments>.*)");

    /**
     * Parses user input into command for execution.
     *
     * @param userInput full user input string
     * @return the command based on the user input
     * @throws ParseException if the user input does not conform the expected format
     */
    public Command parseCommand(String userInput) throws ParseException {
        final Matcher matcher = BASIC_COMMAND_FORMAT.matcher(userInput.trim());
        if (!matcher.matches()) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT, HelpCommand.MESSAGE_USAGE));
        }

        final String commandWord = matcher.group("commandWord");
        final String arguments = matcher.group("arguments");
        switch (commandWord) {

        case AddCommand.COMMAND_WORD:
            return new AddCommandParser().parse(arguments);

        case EditCommand.COMMAND_WORD:
            return new EditCommandParser().parse(arguments);

        case DeleteCommand.COMMAND_WORD:
            return new DeleteCommandParser().parse(arguments);

        case ClearCommand.COMMAND_WORD:
            return new ClearCommand();

        case FindCommand.COMMAND_WORD:
            return new FindCommandParser().parse(arguments);

        case ListCommand.COMMAND_WORD:
            return new ListCommand();

        case ListRoomCommand.COMMAND_WORD:
            return new ListRoomCommandParser().parse(arguments);

        case ExitCommand.COMMAND_WORD:
            return new ExitCommand();

        case HelpCommand.COMMAND_WORD:
            return new HelpCommand();

        case AllocateCommand.COMMAND_WORD:
            return new AllocateCommandParser().parse(arguments);

        case ReallocateCommand.COMMAND_WORD:
            return new ReallocateCommandParser().parse(arguments);

        case DeallocateCommand.COMMAND_WORD:
            return new DeallocateCommandParser().parse(arguments);

        default:
            throw new ParseException(MESSAGE_UNKNOWN_COMMAND);
        }
    }

}
