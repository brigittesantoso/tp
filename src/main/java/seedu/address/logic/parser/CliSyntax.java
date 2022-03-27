package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_PHONE = new Prefix("p/");
    public static final Prefix PREFIX_EMAIL = new Prefix("e/");
    public static final Prefix PREFIX_ADDRESS = new Prefix("a/");
    public static final Prefix PREFIX_APPLICATION = new Prefix("j/");
    public static final Prefix PREFIX_DATE = new Prefix("d/");
    public static final Prefix PREFIX_TIME = new Prefix("t/");
    public static final Prefix PREFIX_GROUP = new Prefix("g/");
    // for EVENT & DEADLINE
    public static final Prefix PREFIX_BY = new Prefix("by/");
    public static final Prefix PREFIX_AT = new Prefix("at/");
    // for TASK's description 
    public static final Prefix PREFIX_DESCRIPTION = new Prefix("des/");

    /* Type definitions */
    public static final String TYPE_INTERVIEW = "[i]";
    public static final String TYPE_PERSON = "[p]";
}
