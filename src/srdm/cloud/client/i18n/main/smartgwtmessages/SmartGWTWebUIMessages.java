package srdm.cloud.client.i18n.main.smartgwtmessages;

import com.smartgwt.client.i18n.SmartGwtMessages;

/**
 * @author mprasadreddy
 * 
 *         this call is overriding {@link SmartGwtMessages} to override
 *         {@link SmartGwtMessages} we need to find it's appropriate key in
 *         properties files OR in SmartGwtMessages.java class
 * 
 *         if JVM doesn't find specified key
 *         (exp:@Key("listGrid_sortFieldAscendingText")) it will displays
 *         default message as we given ( @DefaultMessage("Sort Ascending"))
 * 
 */
public interface SmartGWTWebUIMessages extends
	com.smartgwt.client.i18n.SmartGwtMessages {

    /**
     * Translated "Sort Ascending".
     * 
     * @return translated "Sort Ascending"
     */
    /* 0001 */
    @DefaultMessage("Sort Ascending")
    @Key("listGrid_sortFieldAscendingText")
    @Override
    String listGrid_sortFieldAscendingText();
    
    /**
     * Translated "No tiles to show.".
     * 
     * @return translated "No tiles to show."
     */
    @Override
	@DefaultMessage("No tiles to show.")
    @Key("tileGrid_emptyMessage")
    String tileGrid_emptyMessage();

    /**
     * Translated "Sort Descending".
     * 
     * @return translated "Sort Descending"
     */
    /* 0002 */
    @DefaultMessage("Sort Descending")
    @Key("listGrid_sortFieldDescendingText")
    @Override
    String listGrid_sortFieldDescendingText();

    /**
     * Translated "Columns".
     * 
     * @return translated "Columns"
     */
    /* 0003 */
    @DefaultMessage("Columns")
    @Key("listGrid_fieldVisibilitySubmenuTitle")
    @Override
    String listGrid_fieldVisibilitySubmenuTitle();

    /**
     * Translated "Configure Sort".
     * 
     * @return translated "Configure Sort"
     */
    /* 0004 */
    @DefaultMessage("Configure Sort")
    @Key("listGrid_configureSortText")
    @Override
    String listGrid_configureSortText();

    /**
     * Translated "Group by".
     * 
     * @return translated "Group by"
     */
    /* 0005 */
    @DefaultMessage("Group by")
    @Key("listGrid_groupByText")
    @Override
    String listGrid_groupByText();

    /**
     * Translated "Ungroup".
     * 
     * @return translated "Ungroup"
     */
    /* 0006 */
    @DefaultMessage("Ungroup")
    @Key("listGrid_ungroupText")
    @Override
    String listGrid_ungroupText();

    /**
     * Translated "Unfreeze".
     * 
     * @return translated "Unfreeze"
     */
    /* 0007 */
    @DefaultMessage("Unfreeze")
    @Key("listGrid_unfreezeFieldText")
    @Override
    String listGrid_unfreezeFieldText();

    /**
     * Translated "Freeze".
     * 
     * @return translated "Freeze"
     */
    /* 0008 */
    @DefaultMessage("Freeze")
    @Key("listGrid_freezeFieldText")
    @Override
    String listGrid_freezeFieldText();

    /**
     * Translated "Sort".
     * 
     * @return translated "Sort"
     */
    /* 0009 */
    @DefaultMessage("Sort")
    @Key("multiSortDialog_title")
    @Override
    String multiSortDialog_title();

    /**
     * Translated "Sort by".
     * 
     * @return translated "Sort by"
     */
    /* 0010 */
    @DefaultMessage("Sort by")
    @Key("multiSortDialog_firstSortLevelTitle")
    @Override
    String multiSortDialog_firstSortLevelTitle();

    /**
     * Translated "Add Level".
     * 
     * @return translated "Add Level"
     */
    /* 0011 */
    @DefaultMessage("Add Level")
    @Key("multiSortDialog_addLevelButtonTitle")
    @Override
    String multiSortDialog_addLevelButtonTitle();

    /**
     * Translated "Delete Level".
     * 
     * @return translated "Delete Level"
     */
    /* 0012 */
    @DefaultMessage("Delete Level")
    @Key("multiSortDialog_deleteLevelButtonTitle")
    @Override
    String multiSortDialog_deleteLevelButtonTitle();

    /**
     * Translated "Copy Level".
     * 
     * @return translated "Copy Level"
     */
    /* 0013 */
    @DefaultMessage("Copy Level")
    @Key("multiSortDialog_copyLevelButtonTitle")
    @Override
    String multiSortDialog_copyLevelButtonTitle();

    /**
     * Translated "Column".
     * 
     * @return translated "Column"
     */
    /* 0014 */
    @DefaultMessage("Column")
    @Key("multiSortDialog_propertyFieldTitle")
    @Override
    String multiSortDialog_propertyFieldTitle();

    /**
     * Translated "Order".
     * 
     * @return translated "Order"
     */
    /* 0015 */
    @DefaultMessage("Order")
    @Key("multiSortDialog_directionFieldTitle")
    @Override
    String multiSortDialog_directionFieldTitle();

    /**
     * Translated "Ascending".
     * 
     * @return translated "Ascending"
     */
    /* 0016 */
    @DefaultMessage("Ascending")
    @Key("multiSortDialog_ascendingTitle")
    @Override
    String multiSortDialog_ascendingTitle();

    /**
     * Translated "Descending".
     * 
     * @return translated "Descending"
     */
    /* 0017 */
    @DefaultMessage("Descending")
    @Key("multiSortDialog_descendingTitle")
    @Override
    String multiSortDialog_descendingTitle();

    /**
     * Translated "Then by".
     * 
     * @return translated "Then by"
     */
    /* 0018 */
    @DefaultMessage("Then by")
    @Key("multiSortDialog_otherSortLevelTitle")
    @Override
    String multiSortDialog_otherSortLevelTitle();

    /**
     * Translated "Apply".
     * 
     * @return translated "Apply"
     */
    /* 0019 */
    @DefaultMessage("Apply")
    @Key("multiSortDialog_applyButtonTitle")
    @Override
    String multiSortDialog_applyButtonTitle();

    /**
     * Translated "Cancel".
     * 
     * @return translated "Cancel"
     */
    /* 0020 */
    @DefaultMessage("Cancel")
    @Key("multiSortDialog_cancelButtonTitle")
    @Override
    String multiSortDialog_cancelButtonTitle();

    /**
     * Translated "Move Level Up".
     * 
     * @return translated "Move Level Up"
     */
    /* 0021 */
    @DefaultMessage("Move Level Up")
    @Key("multiSortDialog_levelUpPrompt")
    @Override
    String multiSortDialog_levelUpPrompt();

    /**
     * Translated "Move Level Down".
     * 
     * @return translated "Move Level Down"
     */
    /* 0022 */
    @DefaultMessage("Move Level Down")
    @Key("multiSortDialog_levelDownPrompt")
    @Override
    String multiSortDialog_levelDownPrompt();

    /**
     * Translated "No items to show.".
     * 
     * @return translated "No items to show."
     */
    /* 0023 */
    @DefaultMessage("No items to show.")
    @Key("listGrid_emptyMessage")
    @Override
    String listGrid_emptyMessage();

    /**
     * Translated "Loading data...".
     * 
     * @return translated "Loading data..."
     */
    /* 0024 */
    @DefaultMessage("Loading data...")
    @Key("listGrid_loadingDataMessage")
    @Override
    String listGrid_loadingDataMessage();

    /**
     * Translated "and".
     * 
     * @return translated "and"
     */
    /* 0025 */
    @DefaultMessage("and")
    @Key("filterBuilder_topOperator")
    @Override
    String filterBuilder_topOperator();

    /**
     * Translated "and".
     * 
     * @return translated "and"
     */
    /* 0026 */
    @DefaultMessage("and")
    @Key("filterBuilder_radioOptions_and")
    @Override
    String filterBuilder_radioOptions_and();

    /**
     * Translated "or".
     * 
     * @return translated "or"
     */
    /* 0027 */
    @DefaultMessage("or")
    @Key("filterBuilder_radioOptions_or")
    @Override
    String filterBuilder_radioOptions_or();

    /**
     * Translated "not".
     * 
     * @return translated "not"
     */
    /* 0028 */
    @DefaultMessage("not")
    @Key("filterBuilder_radioOptions_not")
    @Override
    String filterBuilder_radioOptions_not();

    /**
     * Translated "and".
     * 
     * @return translated "and"
     */
    /* 0029 */
    @DefaultMessage("and")
    @Key("filterBuilder_rangeSeparator")
    @Override
    String filterBuilder_rangeSeparator();

    /**
     * Translated "Add Subclause".
     * 
     * @return translated "Add Subclause"
     */
    /* 0030 */
    @DefaultMessage("Add Subclause")
    @Key("filterBuilder_subClauseButtonPrompt")
    @Override
    String filterBuilder_subClauseButtonPrompt();

    /**
     * Translated "Add".
     * 
     * @return translated "Add"
     */
    /* 0031 */
    @DefaultMessage("Add")
    @Key("filterBuilder_addButtonPrompt")
    @Override
    String filterBuilder_addButtonPrompt();

    /**
     * Translated "Remove".
     * 
     * @return translated "Remove"
     */
    /* 0032 */
    @DefaultMessage("Remove")
    @Key("filterBuilder_removeButtonPrompt")
    @Override
    String filterBuilder_removeButtonPrompt();

    /**
     * Translated "[missing field definition]".
     * 
     * @return translated "[missing field definition]"
     */
    /* 0033 */
    @DefaultMessage("[missing field definition]")
    @Key("filterBuilder_missingFieldPrompt")
    @Override
    String filterBuilder_missingFieldPrompt();

    /**
     * Translated "Match All".
     * 
     * @return translated "Match All"
     */
    /* 0034 */
    @DefaultMessage("AND")
    @Key("filterBuilder_matchAllTitle")
    @Override
    String filterBuilder_matchAllTitle();

    /**
     * Translated "Match None".
     * 
     * @return translated "Match None"
     */
    /* 0035 */
    @DefaultMessage("AND")
    @Key("filterBuilder_matchNoneTitle")
    @Override
    String filterBuilder_matchNoneTitle();

    /**
     * Translated "Match Any".
     * 
     * @return translated "Match Any"
     */
    /* 0036 */
    @DefaultMessage("OR")
    @Key("filterBuilder_matchAnyTitle")
    @Override
    String filterBuilder_matchAnyTitle();

    /**
     * Translated "+()".
     * 
     * @return translated "+()"
     */
    /* 0037 */
    @DefaultMessage("+()")
    @Key("filterBuilder_subClauseButtonTitle")
    @Override
    String filterBuilder_subClauseButtonTitle();

    /**
     * Translated "equals".
     * 
     * @return translated "equals"
     */
    /* 0038 */
    @DefaultMessage("Equals")
    @Key("operators_equalsTitle")
    @Override
    String operators_equalsTitle();

    /**
     * Translated "not equal".
     * 
     * @return translated "not equal"
     */
    /* 0039 */
    @DefaultMessage("Not Equal")
    @Key("operators_notEqualTitle")
    @Override
    String operators_notEqualTitle();

    /**
     * Translated "equals (disregard case)".
     * 
     * @return translated "equals (disregard case)"
     */
    /* 0040 */
    @DefaultMessage("Equals")//"equals (disregard case)"
    @Key("operators_iEqualsTitle")
    @Override
    String operators_iEqualsTitle();

    /**
     * Translated "not equal (disregard case)".
     * 
     * @return translated "not equal (disregard case)"
     */
    /* 0041 */
    @DefaultMessage("not equal (disregard case)")
    @Key("operators_iNotEqualTitle")
    @Override
    String operators_iNotEqualTitle();

    /**
     * Translated "greater than".
     * 
     * @return translated "greater than"
     */
    /* 0042 */
    @DefaultMessage("Greater Than")
    @Key("operators_greaterThanTitle")
    @Override
    String operators_greaterThanTitle();

    /**
     * Translated "less than".
     * 
     * @return translated "less than"
     */
    /* 0043 */
    @DefaultMessage("Less Than")
    @Key("operators_lessThanTitle")
    @Override
    String operators_lessThanTitle();

    /**
     * Translated "greater than or equal to".
     * 
     * @return translated "greater than or equal to"
     */
    /* 0044 */
    @DefaultMessage("From")
    @Key("operators_greaterOrEqualTitle")
    @Override
    String operators_greaterOrEqualTitle();

    /**
     * Translated "less than or equal to".
     * 
     * @return translated "less than or equal to"
     */
    /* 0045 */
    @DefaultMessage("To")
    @Key("operators_lessOrEqualTitle")
    @Override
    String operators_lessOrEqualTitle();

    /**
     * Translated "between (match case)".
     * 
     * @return translated "between (match case)"
     */
    /* 0046 */
    @DefaultMessage("Between")
    @Key("operators_betweenTitle")
    @Override
    String operators_betweenTitle();

    /**
     * Translated "between (inclusive, match case)".
     * 
     * @return translated "between (inclusive, match case)"
     */
    /* 0047 */
    @DefaultMessage("between (inclusive, match case)")
    @Key("operators_betweenInclusiveTitle")
    @Override
    String operators_betweenInclusiveTitle();

    /**
     * Translated "between".
     * 
     * @return translated "between"
     */
    /* 0048 */
    @DefaultMessage("Between")
    @Key("operators_iBetweenTitle")
    @Override
    String operators_iBetweenTitle();

    /**
     * Translated "between (inclusive)".
     * 
     * @return translated "between (inclusive)"
     */
    /* 0049 */
    @DefaultMessage("between (inclusive)")
    @Key("operators_iBetweenInclusiveTitle")
    @Override
    String operators_iBetweenInclusiveTitle();

    /**
     * Translated "contains".
     * 
     * @return translated "contains"
     */
    /* 0050 */
    @DefaultMessage("contains")
    @Key("operators_iContainsTitle")
    @Override
    String operators_iContainsTitle();

    /**
     * Translated "starts with".
     * 
     * @return translated "starts with"
     */
    /* 0051 */
    @DefaultMessage("starts with")
    @Key("operators_iStartsWithTitle")
    @Override
    String operators_iStartsWithTitle();

    /**
     * Translated "ends with".
     * 
     * @return translated "ends with"
     */
    /* 0052 */
    @DefaultMessage("ends with")
    @Key("operators_iEndsWithTitle")
    @Override
    String operators_iEndsWithTitle();

    /**
     * Translated "contains (match case)".
     * 
     * @return translated "contains (match case)"
     */
    /* 0053 */
    @DefaultMessage("Contains")
    @Key("operators_containsTitle")
    @Override
    String operators_containsTitle();

    /**
     * Translated "starts with (match case)".
     * 
     * @return translated "starts with (match case)"
     */
    /* 0054 */
    @DefaultMessage("Starts With")
    @Key("operators_startsWithTitle")
    @Override
    String operators_startsWithTitle();

    /**
     * Translated "ends with (match case)".
     * 
     * @return translated "ends with (match case)"
     */
    /* 0055 */
    @DefaultMessage("Ends With")
    @Key("operators_endsWithTitle")
    @Override
    String operators_endsWithTitle();

    /**
     * Translated "does not contain".
     * 
     * @return translated "does not contain"
     */
    /* 0056 */
    @DefaultMessage("does not contain")
    @Key("operators_iNotContainsTitle")
    @Override
    String operators_iNotContainsTitle();

    /**
     * Translated "does not start with".
     * 
     * @return translated "does not start with"
     */
    //"does not start with"
   //The Operator(INOT_STARTS_WITH("iNotStartsWith")) is used for Custom Blank Operator
    /* 0057 */
    @DefaultMessage(" ")
    @Key("operators_iNotStartsWithTitle")
    @Override
    String operators_iNotStartsWithTitle();

    /**
     * Translated "does not end with".
     * 
     * @return translated "does not end with"
     */
    /* 0058 */
    @DefaultMessage("does not end with")
    @Key("operators_iNotEndsWithTitle")
    @Override
    String operators_iNotEndsWithTitle();

    /**
     * Translated "does not contain (match case)".
     * 
     * @return translated "does not contain (match case)"
     */
    /* 0059 */
    @DefaultMessage("Not Contains.")
    @Key("operators_notContainsTitle")
    @Override
    String operators_notContainsTitle();

    /**
     * Translated "does not start with (match case)".
     * 
     * @return translated "does not start with (match case)"
     */
    /* 0060 */
    @DefaultMessage("does not start with (match case)")
    @Key("operators_notStartsWithTitle")
    @Override
    String operators_notStartsWithTitle();

    /**
     * Translated "does not end with (match case)".
     * 
     * @return translated "does not end with (match case)"
     */
    /* 0061 */
    @DefaultMessage("does not end with (match case)")
    @Key("operators_notEndsWithTitle")
    @Override
    String operators_notEndsWithTitle();

    /**
     * Translated "is null".
     * 
     * @return translated "is null"
     */
    /* 0062 */
    @DefaultMessage("Null")
    @Key("operators_isNullTitle")
    @Override
    String operators_isNullTitle();

    /**
     * Translated "is not null".
     * 
     * @return translated "is not null"
     */
    /* 0063 */
    @DefaultMessage("Not Null")
    @Key("operators_notNullTitle")
    @Override
    String operators_notNullTitle();

    /**
     * Translated "matches expression (exact case)".
     * 
     * @return translated "matches expression (exact case)"
     */
    /* 0064 */
    @DefaultMessage("Included In Subnet")
    @Key("operators_regexpTitle")
    @Override
    String operators_regexpTitle();

    /**
     * Translated "matches expression".
     * 
     * @return translated "matches expression"
     */
    /* 0065 */
    @DefaultMessage("matches expression")
    @Key("operators_iregexpTitle")
    @Override
    String operators_iregexpTitle();

    /**
     * Translated "is one of".
     * 
     * @return translated "is one of"
     */
    /* 0066 */
    @DefaultMessage("is one of")
    @Key("operators_inSetTitle")
    @Override
    String operators_inSetTitle();

    /**
     * Translated "is not one of".
     * 
     * @return translated "is not one of"
     */
    /* 0067 */
    @DefaultMessage("is not one of")
    @Key("operators_notInSetTitle")
    @Override
    String operators_notInSetTitle();

    /**
     * Translated "matches other field".
     * 
     * @return translated "matches other field"
     */
    /* 0068 */
    @DefaultMessage("matches other field")
    @Key("operators_equalsFieldTitle")
    @Override
    String operators_equalsFieldTitle();

    /**
     * Translated "differs from field".
     * 
     * @return translated "differs from field"
     */
    /* 0069 */
    @DefaultMessage("differs from field")
    @Key("operators_notEqualFieldTitle")
    @Override
    String operators_notEqualFieldTitle();

    /**
     * Translated "greater than field".
     * 
     * @return translated "greater than field"
     */
    /* 0070 */
    @DefaultMessage("greater than field")
    @Key("operators_greaterThanFieldTitle")
    @Override
    String operators_greaterThanFieldTitle();

    /**
     * Translated "less than field".
     * 
     * @return translated "less than field"
     */
    /* 0071 */
    @DefaultMessage("less than field")
    @Key("operators_lessThanFieldTitle")
    @Override
    String operators_lessThanFieldTitle();

    /**
     * Translated "greater than or equal to field".
     * 
     * @return translated "greater than or equal to field"
     */
    /* 0072 */
    @DefaultMessage("greater than or equal to field")
    @Key("operators_greaterOrEqualFieldTitle")
    @Override
    String operators_greaterOrEqualFieldTitle();

    /**
     * Translated "less than or equal to field".
     * 
     * @return translated "less than or equal to field"
     */
    /* 0073 */
    @DefaultMessage("less than or equal to field")
    @Key("operators_lessOrEqualFieldTitle")
    @Override
    String operators_lessOrEqualFieldTitle();

    /**
     * Translated "contains (match case) another field value".
     * 
     * @return translated "contains (match case) another field value"
     */
    /* 0074 */
    @DefaultMessage("contains (match case) another field value")
    @Key("operators_containsFieldTitle")
    @Override
    String operators_containsFieldTitle();

    /**
     * Translated "starts with (match case) another field value".
     * 
     * @return translated "starts with (match case) another field value"
     */
    /* 0075 */
    @DefaultMessage("starts with (match case) another field value")
    @Key("operators_startsWithFieldTitle")
    @Override
    String operators_startsWithFieldTitle();

    /**
     * Translated "ends with (match case) another field value".
     * 
     * @return translated "ends with (match case) another field value"
     */
    /* 0076 */
    @DefaultMessage("ends with (match case) another field value")
    @Key("operators_endsWithFieldTitle")
    @Override
    String operators_endsWithFieldTitle();

    /**
     * Translated "Match All".
     * 
     * @return translated "Match All"
     */
    /* 0077 */
    @DefaultMessage("AND")
    @Key("operators_andTitle")
    @Override
    String operators_andTitle();

    /**
     * Translated "Match None".
     * 
     * @return translated "Match None"
     */
    /* 0078 */
    @DefaultMessage("AND")
    @Key("operators_notTitle")
    @Override
    String operators_notTitle();

    /**
     * Translated "Match Any".
     * 
     * @return translated "Match Any"
     */
    /* 0079 */
    @DefaultMessage("OR")
    @Key("operators_orTitle")
    @Override
    String operators_orTitle();

    /**
     * Translated "Field is required".
     * 
     * @return translated "Field is required"
     */
    /* 0080 */
    @DefaultMessage("Input is required.")
    @Key("validator_requiredField")
    @Override
    String validator_requiredField();

    /**
     * Translated "Must be a true/false value.".
     * 
     * @return translated "Must be a true/false value."
     */
    /* 0081 */
    @DefaultMessage("Must be a true/false value.")
    @Key("validator_notABoolean")
    @Override
    String validator_notABoolean();

    /**
     * Translated "Must be a String.".
     * 
     * @return translated "Must be a String."
     */
    /* 0082 */
    @DefaultMessage("Must be a String.")
    @Key("validator_notAString")
    @Override
    String validator_notAString();

    /**
     * Translated "Must be a whole number.".
     * 
     * @return translated "Must be a whole number."
     */
    /* 0083 */
    @DefaultMessage("Must be a whole number.")
    @Key("validator_notAnInteger")
    @Override
    String validator_notAnInteger();

    /**
     * Translated "Must be a valid decimal.".
     * 
     * @return translated "Must be a valid decimal."
     */
    /* 0084 */
    @DefaultMessage("Must be a valid decimal.")
    @Key("validator_notADecimal")
    @Override
    String validator_notADecimal();

    /**
     * Translated "Must be a date.".
     * 
     * @return translated "Must be a date."
     */
    /* 0085 */
    @DefaultMessage("Must be a date.")
    @Key("validator_notADate")
    @Override
    String validator_notADate();

    /**
     * Translated "Must be a time.".
     * 
     * @return translated "Must be a time."
     */
    /* 0086 */
    @DefaultMessage("Must be a time.")
    @Key("validator_notATime")
    @Override
    String validator_notATime();

    /**
     * Translated
     * "Identifiers must start with a letter, underscore or $ character, and may contain only letters, numbers, underscores or $ characters."
     * .
     * 
     * @return translated
     *         "Identifiers must start with a letter, underscore or $ character, and may contain only letters, numbers, underscores or $ characters."
     */
    /* 0087 */
    @DefaultMessage("Identifiers must start with a letter, underscore or $ character, and may contain only letters, numbers, underscores or $ characters.")
    @Key("validator_notAnIdentifier")
    @Override
    String validator_notAnIdentifier();

    /**
     * Translated "Must be a valid regular expression.".
     * 
     * @return translated "Must be a valid regular expression."
     */
    /* 0088 */
    @DefaultMessage("Must be a valid regular expression.")
    @Key("validator_notARegex")
    @Override
    String validator_notARegex();

    /**
     * Translated "Must be a CSS color identifier.".
     * 
     * @return translated "Must be a CSS color identifier."
     */
    /* 0089 */
    @DefaultMessage("Must be a CSS color identifier.")
    @Key("validator_notAColor")
    @Override
    String validator_notAColor();

    /**
     * Translated "Must be no more than".
     * 
     * @return translated "Must be no more than"
     */
    /* 0090 */
    @DefaultMessage("Must be no more than ")
    @Key("validator_mustBeLessThan")
    @Override
    String validator_mustBeLessThan();

    /**
     * Translated "Must be at least ".
     * 
     * @return translated "Must be at least "
     */
    /* 0091 */
    @DefaultMessage("Must be at least ")
    @Key("validator_mustBeGreaterThan")
    @Override
    String validator_mustBeGreaterThan();

    /**
     * Translated "Must be later than".
     * 
     * @return translated "Must be later than"
     */
    /* 0092 */
    @DefaultMessage("Must be later than")
    @Key("validator_mustBeLaterThan")
    @Override
    String validator_mustBeLaterThan();

    /**
     * Translated "Must be earlier than".
     * 
     * @return translated "Must be earlier than"
     */
    /* 0093 */
    @DefaultMessage("Must be earlier than")
    @Key("validator_mustBeEarlierThan")
    @Override
    String validator_mustBeEarlierThan();

    /**
     * Translated "Must be less than $max characters".
     * 
     * @return translated "Must be less than $max characters"
     */
    /* 0094 */
    @DefaultMessage("Must be no more than $max characters.")
    @Key("validator_mustBeShorterThan")
    @Override
    String validator_mustBeShorterThan();

    /**
     * Translated "Must be at least $min characters".
     * 
     * @return translated "Must be at least $min characters"
     */
    /* 0095 */
    @DefaultMessage("Must be at least $min characters.")
    @Key("validator_mustBeLongerThan")
    @Override
    String validator_mustBeLongerThan();

    /**
     * Translated "Must be exactly $max characters".
     * 
     * @return translated "Must be exactly $max characters"
     */
    /* 0096 */
    @DefaultMessage("Must be exactly $max characters")
    @Key("validator_mustBeExactLength")
    @Override
    String validator_mustBeExactLength();

    /**
     * Translated "Not a valid option".
     * 
     * @return translated "Not a valid option"
     */
    /* 0097 */
    @DefaultMessage("Not a valid option.")
    @Key("validator_notOneOf")
    @Override
    String validator_notOneOf();

    /**
     * Translated "Must be a function.".
     * 
     * @return translated "Must be a function."
     */
    /* 0098 */
    @DefaultMessage("Must be a function.")
    @Key("validator_notAFunction")
    @Override
    String validator_notAFunction();

    /**
     * Translated "Can&#39;t select that many records at once.<br>
     * <br>
     * Please try working in smaller batches.".
     * 
     * @return translated "Can&#39;t select that many records at once.<br>
     * <br>
     *         Please try working in smaller batches."
     */
    /* 0099 */
    @DefaultMessage("Can&#39;t select that many records at once.<br><br>Please try working in smaller batches.")
    @Key("selection_selectionRangeNotLoadedMessage")
    @Override
    String selection_selectionRangeNotLoadedMessage();

    /**
     * Translated "Show Date Chooser".
     * 
     * @return translated "Show Date Chooser"
     */
    /* 00100 */
    @DefaultMessage("Show Date Chooser")
    @Key("miniDateRangeItem_pickerIconPrompt")
    @Override
    String miniDateRangeItem_pickerIconPrompt();

    /**
     * Translated "Since".
     * 
     * @return translated "Since"
     */
    /* 00101 */
    @DefaultMessage("Since")
    @Key("miniDateRangeItem_fromDateOnlyPrefix")
    @Override
    String miniDateRangeItem_fromDateOnlyPrefix();

    /**
     * Translated "Before".
     * 
     * @return translated "Before"
     */
    /* 00102 */
    @DefaultMessage("Before")
    @Key("miniDateRangeItem_toDateOnlyPrefix")
    @Override
    String miniDateRangeItem_toDateOnlyPrefix();
    
    /**
     * Translated "Show Date Chooser".
     * 
     * @return translated "Show Date Chooser"
     */
    /* 00103 */
    @DefaultMessage("Show Date Chooser")
    @Key("relativeDateItem_pickerIconPrompt")
     @Override
    String relativeDateItem_pickerIconPrompt();
    
    /**
     * Translated "Today".
     * 
     * @return translated "Today"
     */
    /* 00104 */
    @DefaultMessage("Today")
    @Key("relativeDateItem_presetOptions_today")
     @Override
    String relativeDateItem_presetOptions_today();

    /**
     * Translated "Tomorrow".
     * 
     * @return translated "Tomorrow"
     */
    /* 00105 */
    @DefaultMessage("Tomorrow")
    @Key("relativeDateItem_presetOptions_tomorrow")
     @Override
    String relativeDateItem_presetOptions_tomorrow();
    
    /**
     * Translated "Yesterday".
     * 
     * @return translated "Yesterday"
     */
    /* 00106 */
    @DefaultMessage("Yesterday")
    @Key("relativeDateItem_presetOptions_yesterday")
     @Override
    String relativeDateItem_presetOptions_yesterday();
    
    /**
     * Translated "Today".
     * 
     * @return translated "Today"
     */
    /* 00107 */
    @DefaultMessage("Today")
    @Key("relativeDateItem_todayTitle")
    @Override
    String relativeDateItem_todayTitle();
    
    /**
     * Translated "OK".
     * 
     * @return translated "OK"
     */
    /* 00108 */
    @DefaultMessage("OK")
    @Key("dialog_OkButtonTitle")
    @Override
    String dialog_OkButtonTitle();
    
    /**
     * Translated "Yes".
     * 
     * @return translated "Yes"
     */
    /* 00109 */
    @DefaultMessage("Yes")
    @Key("dialog_YesButtonTitle")
    @Override
    String dialog_YesButtonTitle();
    
    /**
     * Translated "No".
     * 
     * @return translated "No"
     */
    /* 00110 */
    @DefaultMessage("No")
    @Key("dialog_NoButtonTitle")
    @Override
    String dialog_NoButtonTitle();

    /**
     * Translated "Cancel".
     * 
     * @return translated "Cancel"
     */
    /* 00111 */
    @DefaultMessage("Cancel")
    @Key("dialog_CancelButtonTitle")
    @Override
    String dialog_CancelButtonTitle();
    
    /**
     * Translated "Done".
     * 
     * @return translated "Done"
     */
    /* 00112 */
    @DefaultMessage("Done")
    @Key("dialog_DoneButtonTitle")
    @Override
    String dialog_DoneButtonTitle();
    

    /**
     * Translated "Confirm".
     * 
     * @return translated "Confirm"
     */
    /* 00113 */
    @DefaultMessage("Confirm")
    @Key("dialog_ConfirmTitle")
    @Override
    String dialog_ConfirmTitle();
    
    /**
     * Translated "Note".
     * 
     * @return translated "Note"
     */
    /* 00114 */
    @DefaultMessage("Note")
    @Key("dialog_SayTitle")
    @Override
    String dialog_SayTitle();
    
    /**
     * Translated "Warning".
     * 
     * @return translated "Warning"
     */
    /* 00115 */
    @DefaultMessage("Warning")
    @Key("dialog_WarnTitle")
    @Override
    String dialog_WarnTitle();
    
    /**
     * Translated "OK".
     * 
     * @return translated "OK"
     */
    /* 00116 */
    @DefaultMessage("OK")
    @Key("dateRangeDialog_okButtonTitle")
    @Override
    String dateRangeDialog_okButtonTitle();
    
    /**
     * Translated "Confirmation".
     * 
     * @return translated "Confirmation"
     */
    /* 00117 */
    @DefaultMessage("Confirmation")
    @Key("dialog_AskTitle")
    @Override
    String dialog_AskTitle();
    

    /**
        * Translated "Cancel".
        * 
        * @return translated "Cancel"
        */
       /* 00118 */
       @DefaultMessage("Cancel")
       @Key("dateRangeDialog_cancelButtonTitle")
        @Override
       String dateRangeDialog_cancelButtonTitle();
       
       /**
        * Translated "Today".
        * 
        * @return translated "Today"
        */
       /* 00119 */
       @DefaultMessage("Today")
       @Key("dateChooser_todayButtonTitle")
        @Override
       String dateChooser_todayButtonTitle();
       
       /**
        * Translated "Cancel".
        * 
        * @return translated "Cancel"
        */
       /* 00120 */
       @DefaultMessage("Cancel")
       @Key("dateChooser_cancelButtonTitle")
        @Override
       String dateChooser_cancelButtonTitle();
       
       /**
        * Translated "0".
        * 
        * @return translated "0"
        */
       /* 00121 */
       @DefaultMessage("0")
       @Key("dateChooser_firstDayOfWeek")
       @Override
       String dateChooser_firstDayOfWeek();
       
       /**
        * Translated "Year".
        * 
        * @return translated "Year"
        */
       /* 00122 */
       @DefaultMessage("Year")
       @Key("dateChooser_fiscalYearFieldTitle")
        @Override
       String dateChooser_fiscalYearFieldTitle();
       
       /**
        * Translated "Wk".
        * 
        * @return translated "Wk"
        */
       /* 00123 */
       @DefaultMessage("Wk")
       @Key("dateChooser_weekFieldTitle")
        @Override
       String dateChooser_weekFieldTitle();
       
       /**
        * Translated "Show Date Chooser".
        * 
        * @return translated "Show Date Chooser"
        */
       /* 00124 */
       @DefaultMessage("Show Date Chooser")
       @Key("dateItem_pickerIconPrompt")
        @Override
       String dateItem_pickerIconPrompt();
       
       /**
        * Translated "Auto Fit All Columns".
        * 
        * @return translated "Auto Fit All Columns"
        */
       @Override
	/* 00125 */
       @DefaultMessage("Auto Fit All Columns")
       @Key("listGrid_autoFitAllText")
       String listGrid_autoFitAllText();
       
       /**
        * Translated "Auto Fit".
        * 
        * @return translated "Auto Fit"
        */
       @Override
	/* 00126 */
       @DefaultMessage("Auto Fit")
       @Key("listGrid_autoFitFieldText")
       String listGrid_autoFitFieldText();
       
       /**
        * Translated "Clear Sort".
        * 
        * @return translated "Clear Sort"
        */
       @Override
	/* 00127 */
       @DefaultMessage("Clear Sort")
       @Key("listGrid_clearSortFieldText")
       String listGrid_clearSortFieldText();
       
       /**
        * Translated "Invalid value".
        * 
        * @return translated "Invalid value"
        */
       @Override
	/* 00128 */
       @DefaultMessage("Invalid value. ")
       @Key("dataBoundComponent_unknownErrorMessage")
       String dataBoundComponent_unknownErrorMessage();

       /* 00129 */
       /**
        * Translated "Columns may only be used once: &#39;$title&#39; is used multiple times.".
        * 
        * @return translated "Columns may only be used once: &#39;$title&#39; is used multiple times."
        */
       @Override
	@DefaultMessage("Columns may only be used once: &#39;$title&#39; is used multiple times.")
       @Key("multiSortDialog_invalidListPrompt")
       String multiSortDialog_invalidListPrompt();
   
}

