package srdm.cloud.client.i18n.main.webuimessages;

import com.google.gwt.i18n.client.ConstantsWithLookup;

public interface WebUIConstants extends ConstantsWithLookup {

  // //////////////////// Header ////////////////////

  /* 0001 */@DefaultStringValue("Home Page")
  String homePage();

  // //////////////////// Device Information ////////////////////
  /* 0003 */@DefaultStringValue("Device ID")
  String deviceId();

  /* 0004 */@DefaultStringValue("Device Status")
  String status();

  /* 0005 */@DefaultStringValue("MAC Address")
  String macAddress();

  /* 0006 */@DefaultStringValue("Toggle Display")
  String toggleDisplay();

  /* 0007 */@DefaultStringValue("Status Update")
  String statusupdate();

  /* 0008 */@DefaultStringValue("Device Web Page")
  String deviceWebPage();


  /* 0009 */@DefaultStringValue("Model Name")
  String modelName();

  /* 0010 */@DefaultStringValue("Name")
  String deviceName();

  /* 0011 */@DefaultStringValue("IP Address")
  String ipAddress();

  /* 0012 */@DefaultStringValue("Subnet Mask")
  String subNetMask();

  /* 0013 */@DefaultStringValue("Gateway")
  String gateway();

  /* 0014 */@DefaultStringValue("Location")
  String location();

  /* 0016 */@DefaultStringValue("Description")
  String description();

  /* 0017 */@DefaultStringValue("Impression Count")
  String impressionCount();

  /* 0019 */@DefaultStringValue("Serial Number")
  String serialNumber();

  /* 0020 */@DefaultStringValue("Firmware Version")
  String firmwareVersion();

  /* 0021 */@DefaultStringValue("Discovery Time")
  String discoveryTime();

  /* 0023 */@DefaultStringValue("Tray Name")
  String trayName();

  /* 0024 */@DefaultStringValue("Media Name")
  String paperName();

  /* 0025 */@DefaultStringValue("Media Size")
  String paperSize();

  /* 0026 */@DefaultStringValue("Status")
  String trayStatus();

  /* 0027 */@DefaultStringValue("Capacity")
  String trayCapacity();

  /* 0028 */@DefaultStringValue("Toner Information")
  String tonerInformation();

  /* 0029 */@DefaultStringValue("Toner Type")
  String tonerType();

  /* 0030 */@DefaultStringValue("Status")
  String tonerStatus();

  /* 0031 */@DefaultStringValue("Drum Information")
  String drumInformation();

  /* 0032 */@DefaultStringValue("Drum Type")
  String drumType();

  /* 0033 */@DefaultStringValue("Status")
  String drumStatus();

  /* 0035 */@DefaultStringValue("Developer Information")
  String developerInformation();

  /* 0038 */@DefaultStringValue("Developer Type")
  String developerType();

  /* 0039 */@DefaultStringValue("Status")
  String developerStatus();

  /* 0043 */@DefaultStringValue("Output Tray")
  String outputTray();

  /* 0044 */@DefaultStringValue("Device Usage (Output)")
  String printingNoOfSheetsOfDevice();

  /* 0045 */@DefaultStringValue("Device Usage (Send)")
  String transmittingNoSheetsOfDevice();

  /* 0046 */@DefaultStringValue("Device Operation")
  String deviceOperation();

  /* 0048 */@DefaultStringValue("Total")
  String sumTotal();

  /* 0049 */@DefaultStringValue("Black-White")
  String blackWhite();

  /* 0050 */@DefaultStringValue("Color")
  String color();

  /* 0051 */@DefaultStringValue("Full Color")
  String fullColor();

  /* 0052 */@DefaultStringValue("Single Color")
  String singleColor();

  // //////////////////// Group Operations ////////////////////

  /* 0056 */@DefaultStringValue("Create Group") 
  String creategroup(); // This keyword used for operation log event.

  /* 0057 */@DefaultStringValue("Edit Group")
  String editgroup();// This keyword used for operation log event.

  /* 0058 */@DefaultStringValue("Delete")
  String deleteGroup();

  /* 0060 */@DefaultStringValue("Filter List")
  String filterList();
  
  /* 0061 */@DefaultStringValue("E-Mail Notification")
  String emailAddressList();

  /* 0062 */@DefaultStringValue("Status Settings")
  String statusSettings();

  // //////////////////// Group tab ////////////////////
  /* 0065 */@DefaultStringValue("Last Device Discovery")
  String lastDeviceDiscovery();

  /* 0066 */@DefaultStringValue("Last Status Update")
  String lastStatusUpdate();

  /* 0067 */@DefaultStringValue("Device Information Update Date  ")
  String lastGetUsage();

  /* 0068 */@DefaultStringValue("Device Discovery")
  String discovery();

  /* 0069 */@DefaultStringValue("Device Discovery")
  String discoverySettings();

  /* 0070 */@DefaultStringValue("Discovery In Progress...")
  String progressDiscovery();

  /* 0072 */@DefaultStringValue("SRDM (Special Features)")
  String securityDashboard();

  /* 0073 */@DefaultStringValue("Registered Devices")
  String registeredDevices();

  /* 0074 */@DefaultStringValue("Device Log")
  String deviceLog();

  /* 0075 */@DefaultStringValue("Sub Group List")
  String subGroup();

  // //////////////////// Main window view ////////////////////
  /* 0077 */@DefaultStringValue("Settings")
  String settings();

  /* 0078 */@DefaultStringValue("Help")
  String help();

  /* 0079 */@DefaultStringValue("Logout")
  String logout();

  /* 0082 */@DefaultStringValue("Operation Log")
  String operationLog();

  /* 0083 */@DefaultStringValue("System Logs")
  String systemLog();

  // //////////////////// Status update settings ////////////////////
  /* 0085 */@DefaultStringValue("Trap Mixture Polling")
  String trapMixturePolling();

  /* 0087 */@DefaultStringValue("The interval which polls a device with a Trap function")
  String intervalToPollWithTrap();

  /* 0089 */@DefaultStringValue("The interval which polls a device without a Trap function")
  String intervalToPollWithoutTrap();

  /* 0090 */@DefaultStringValue("The interval which polls all the Devices")
  String intervalToPollAllDevices();

  // //////////////////// Filter Operations ////////////////////
  /* 0092 */@DefaultStringValue("Edit")
  String edit();

  /* 0093 */@DefaultStringValue("Add Filter")
  String addFilter();

  /* 0094 */@DefaultStringValue("Delete Filter")
  String deleteFilter();

  /* 0095 */@DefaultStringValue("Filter Name")
  String filterName();

  /* 0097 */@DefaultStringValue("Total Filter(s)")
  String totalNumOfFilters();

  /* 0098 */@DefaultStringValue("Selected Filter(s)")
  String selectedNumOfFilters();

  /* 0099 */@DefaultStringValue("Create Filter")
  String createFilterTitle();

  /* 0100 */@DefaultStringValue("New Creation")
  String newCreation();

  /* 0101 */@DefaultStringValue("Edit Filter")
  String editFilterTitle();

  /* 0102 */@DefaultStringValue("Filter Identification")
  String filterIdentification();

  /* 0103 */@DefaultStringValue("Filter Condition Settings")
  String filterConditionSettings();

  // //////////////////// Status Settings ////////////////////
  /* 0104 */@DefaultStringValue("Status Settings")
  String statusSettingsTitle();

  /* 0107 */@DefaultStringValue("Residual Settings")
  String residualQtySettings();

  /* 0108 */@DefaultStringValue("Paper Residual Settings")
  String paperResidualQtySettings();

  /* 0109 */@DefaultStringValue("Toner Residual Settings")
  String tonerResidualQtySettings();

  /* 0111 */@DefaultStringValue("Use Default Setting")
  String useDefaultSettings();

  /* 0113 */@DefaultStringValue("Status Description")
  String statusDescriptionTitle();

  /* 0114 */@DefaultStringValue("Alert Level")
  String statusAlertLevel();

  /* 0115 */@DefaultStringValue("Paper Residual Quantity")
  String paperResidualQuantity();

  /* 0116 */@DefaultStringValue("Toner Residual Quantity")
  String tonerResidualQuantity();

  // //////////////////// Group Operations ////////////////////

  /* 0119 */@DefaultStringValue("Password")
  String password();

  /* 0120 */@DefaultStringValue("Confirm Password")
  String confirmPassword();

  /* 0123 */@DefaultStringValue("Group ID")
  String groupID();

  /* 0124 */@DefaultStringValue("Group Name")
  String groupName();
  

  /* 0126 */@DefaultStringValue("Group Name")
  String groupNameReport();

  /* 0127 */@DefaultStringValue("Time Zone")
  String timezone();
  
  /* 0128 */@DefaultStringValue("Model Name")
  String modelNameReport();
  
  /* 0129 */@DefaultStringValue("IP Address")
  String ipAddressReport();
    
  
  /* 0019 */@DefaultStringValue("Serial Number")
  String serialNumberReport();
  
  /* 0050 */@DefaultStringValue("Color")
  String colorReport();
  
  /* 0048 */@DefaultStringValue("Total")
  String totalReport();

  // //////////////////// Application Settings ////////////////////
  /* 0130 */@DefaultStringArrayValue({
      "Enterprise", "Enterprise Blue", "Enterprise Red", "Enterprise Green", "Graphite","Tahoe"})
  String[] themeList();

  /* 0131 */@DefaultStringValue("Themes")
  // Application Settings
  String applicationSettingsTitle();

  /* 0132 */@DefaultStringValue("Display Settings")
  String applnDisplaySettings();

  /* 0133 */@DefaultStringValue("Display Color Pattern")
  String dispColorPattern();

  // //////////////////// Operation and System Logs ////////////////////

  /* 0134 */@DefaultStringValue("Undo Operation Logs")
  String undoOperationLog();

  /* 0137 */@DefaultStringValue("Delete all Operation Logs")
  String deleteAllOperationLogs();

  /* 0138 */@DefaultStringValue("Type")
  String type();

  /* 0140 */@DefaultStringValue("Date")
  String date();

  /* 0141 */@DefaultStringValue("Account Name")
  String accountname();

  /* 0142 */@DefaultStringValue("Operation")
  String operation();

  /* 0145 */@DefaultStringValue("Result")
  String result();

  /* 0146 */@DefaultStringValue("Total Count")
  String totalCount();

  /* 0147 */@DefaultStringValue("Selected Group(s)")
  String selectedGroups();

  /* 0148 */@DefaultStringValue("System Log")
  String sytemLog();
  
  /* 0149 */@DefaultStringValue("MAC Address")
  String macAddressReport();
  
  /* 0150 */@DefaultStringValue("Location")
  String locationReport();

  /* 0151 */@DefaultStringValue("Discovery Time")
  String discoveryTimeReport();
  
  /* 0152 */@DefaultStringValue("Download Server Log")
  String downloadServerLog();
  
  /* 0153 */@DefaultStringValue("No items to show.")
  String noItemsToShowReport();

  // //////////////////// Printer Driver Settings ////////////////////
  /* 0167 */@DefaultStringValue("Language")
  String language();

  /* 0170 */@DefaultStringValue("Version")
  String version();

  // //////////////////// Device Log Tab ////////////////////
  /* 0186 */@DefaultStringValue("Date and Time")
  String dateAndTime();

  // //////////////////// Power Save Mode History ////////////////////

  /* 0187 */@DefaultStringValue("Counter Graph")
  String counterHistory();

  /* 0188 */@DefaultStringValue("Copy")
  String copy();

  /* 0189 */@DefaultStringValue("Internet Fax")
  String internetFax();

  /* 0190 */@DefaultStringValue("Fax Receive")
  String faxReception();

  /* 0191 */@DefaultStringValue("Print")
  String print();

  /* 0192 */@DefaultStringValue("Document Filing")
  String documentfiling();

  /* 0193 */@DefaultStringValue("Other")
  String other();

  // //////////////////// Power Save Mode History ////////////////////

  /* 0196 */@DefaultStringValue("Device Status Transition")
  String deviceStatusTransition();

  /* 0198 */@DefaultStringValue("Reference Date Form")
  String referenceDateForm();

  /* 0199 */@DefaultStringValue("Period")
  String period();

  /* 0200 */@DefaultStringValue("All")
  String all();

  // ///// Chart Data.

  /* 0204 */@DefaultStringValue("Communication Error")
  String noResponse();

  /* 0205 */@DefaultStringValue("Non-Active")
  String nonActive();

  /* 0206 */@DefaultStringValue("Active")
  String active();

  // //////////////////// Sub Group ////////////////////
  /* 0210 */@DefaultStringValue("Group ID")
  String groupId();

  /* 0211 */@DefaultStringValue("Parent ID")
  String parentId();

  // //////////////////// Agent List ////////////////////
  /* 0212 */@DefaultStringValue("Agent ID")
  String agentId();

  /* 0213 */@DefaultStringValue("Agent Name")
  String agentName();

  /* 0214 */@DefaultStringValue("Registered Date and Time")
  String registeredDateAndTime();

  /* 0217 */@DefaultStringValue("Agent Details")
  String agentDetails();

  /* 0218 */@DefaultStringValue("Download")
  String downloadAgent();

  /* 0219 */@DefaultStringValue("File Name")
  String downloadFileName();

  /* 0220 */@DefaultStringValue("File Size")
  String downloadFileSize();

  /* 0221 */@DefaultStringValue("Registration Date")
  String agentRegDate();

  /* 0222 */@DefaultStringValue("Version")
  String agentVersion();

  /* 0223 */@DefaultStringValue("Connection Timeout")
  String connectionTimeout();

  /* 0225 */@DefaultStringValue("Get Data Timeout")
  String getDataTimeout();

  // //////////////////// Device Details ////////////////////
  /* 0229 */@DefaultStringValue("Input Tray Information")
  String inputTrayInformation();

  /* 0230 */@DefaultStringValue("Status History")
  String statusHistory();

  /* 0231 */@DefaultStringValue("Device Properties")
  String deviceProperties();

  /* 0233 */@DefaultStringValue("SNMP Settings")
  String snmpSettings();

  /* 0234 */@DefaultStringValue("Device Discovery Settings")
  String deviceDiscoverySettings();

  /* 0237 */@DefaultStringValue("Print Setting Information")
  String printSettings();

  /* 0238 */@DefaultStringValue("Value")
  String printValue();

  /* 0239 */@DefaultStringValue("SNMP Access Settings")
  String defaultSNMPSettings();

  /* 0240 */@DefaultStringValue("SNMPv1")
  String snmpv1();

  /* 0241 */@DefaultStringValue("SNMPv3")
  String snmpv3();

  /* 0242 */@DefaultStringValue("Get Community")
  String getCommunity();

  /* 0244 */@DefaultStringValue("User Name")
  String userName();

  /* 0245 */@DefaultStringValue("Authentication Algorithm")
  String authenticationAlgorithm();

  /* 0246 */@DefaultStringValue("Authentication Key")
  String authenticationKey();

  /* 0247 */@DefaultStringValue("Privacy Algorithm")
  String privacyAlgorithm();

  /* 0248 */@DefaultStringValue("Privacy Key")
  String privacyKey();

  /* 0249 */@DefaultStringValue("Default Input Tray")
  String defaultInputtray();

  /* 0250 */@DefaultStringValue("Default Output Tray")
  String defaultOutputtray();

  /* 0251 */@DefaultStringValue("Default Print Orientation")
  String defaultPrintOrientation();

  /* 0252 */@DefaultStringValue("Default Simplex/Duplex Setting")
  String defaultMediaPath();

  // //////////////////// Media Path Values
  /* 0253 */@DefaultStringValue("Simplex")
  String simplex();

  /* 0254 */@DefaultStringValue("Long Edge Binding Duplex")
  String longEdgeDuplex();

  /* 0255 */@DefaultStringValue("Short Edge Binding Duplex")
  String shortEdgeDuplex();

  // //////////////////// Buttons ////////////////////
  /* 0256 */@DefaultStringValue("Save")
  String save();

  /* 0257 */@DefaultStringValue("Restore")
  String restore();

  /* 0258 */@DefaultStringValue("Delete")
  String delete();

  /* 0259 */@DefaultStringValue("OK")
  String ok();

  /* 0260 */@DefaultStringValue("Reset")
  String reset();

  /* 0261 */@DefaultStringValue("Close")
  String close();

  /* 0262 */@DefaultStringValue("Cancel")
  String cancel();

  /* 0264 */@DefaultStringValue("Discovery (Includes Sub Groups)")
  String startDeviceDiscovery();

  /* 0268 */@DefaultStringValue("Minute(s)")
  String minutes();

  /* 0269 */@DefaultStringValue("Hour(s)")
  String hours();

  /* 0270 */@DefaultStringValue("Day(s)")
  String days();

  /* 0272 */@DefaultStringValue("Months")
  String months();

  /* 0273 */@DefaultStringValue("Specific IP Address Search")
  String specificIPSearch();

  /* 0274 */@DefaultStringValue("IP Range Search")
  String ipRangeSearch();

  /* 0275 */@DefaultStringValue("Local Broadcast Search")
  String localBroadcastSearch();

  /* 0277 */@DefaultStringValue("Broadcast Address")
  String broadcastAddress();

  /* 0278 */@DefaultStringValue("Broadcast Search")
  String BroadcastSearch();

  /* 0283 */@DefaultStringValue("Stop Discovery...")
  String stopDiscovery();

  /* 0284 */@DefaultStringValue("Stop Status Update ...")
  String stopStatusUpdate();

  /* 0286 */
  @DefaultStringArrayValue({
  /* 1 */"Printer Error",
  /* 2 */"Printer Error [Account Limit]",
  /* 3 */"Overdue Service Maintenance",
  /* 4 */"Paper Jam",
  /* 5 */"Marker Supply Missing",
  /* 6 */"Toner Empty",
  /* 7 */"Cover Open",
  /* 8 */"Paper Empty",
  /* 9 */"Specified Input Tray Empty",
  /* 10 */"Specified Input Tray  Missing",
  /* 11 */"Specified Output Tray Full",
  /* 12 */"Specified Output Tray Missing",
  /* 13 */"Offline",
  /* 14 */"Printer Warning",
  /* 15 */"Toner Low",
  /* 16 */"Paper Low",
  /* 17 */"Input Tray Missing",
  /* 18 */"Output Tray Full",
  /* 19 */"Output Tray Near Full",
  /* 20 */"Output Tray Missing",
  /* 21 */"Printer Warning [Output Tray Missing]",
  /* 22 */"Near Overdue Service Maintenance   ",
  /* 23 */"Online [Auto Power Shut-Off]",
  /* 24 */"Warm-Up",
  /* 25 */"Online",
  /* 26 */"Unknown"})
  String[] deviceStatus();

  /* 0288 */@DefaultStringValue("IP Address already exist.")
  String DuplicateIP();

  /* 0291 */@DefaultStringValue("Delete all")
  String deleteAll();

  /* 0292 */@DefaultStringValue("Exit")
  String exit();

  /* 0295 */@DefaultStringValue("Start IP Address")
  String startIPAddress();

  /* 0296 */@DefaultStringValue("Start IP Must be smaller.")
  String startIPMustBeSmaller();

  /* 0297 */@DefaultStringValue("End IP Must be bigger. ")
  String endIPMustBeBigger();

  /* 0298 */@DefaultStringValue("End IP Address")
  String endIPAddress();

  /* 0303 */@DefaultStringValue("Timeout")
  String timeOut();

  /* 0304 */@DefaultStringValue("Milliseconds(1000-30000)")
  String TimeOutTestItemHint();

  /* 0305 */@DefaultStringValue("Retry")
  String retry();

  /* 0306 */@DefaultStringValue("SNMPv3 Settings")
  String snmpv3Settings();

  /* 0308 */@DefaultStringValue("SNMPv3 Information Settings")
  String snmpv3InformationSettings();

  /* 0309 */@DefaultStringValue("Context Name")
  String contextName();

  /* 0311 */@DefaultStringValue("Delete Record")
  String deleteRecord();

  /* 0312 */@DefaultStringValue("Group")
  String group();

  /* 0313 */@DefaultStringValue("Loading Groups...")
  String loadingGroups();

  /* 0315 */@DefaultStringValue("Loading Devices...")
  String loadingDevices();

  // Notifications

  /* 0325 */@DefaultStringValue("Undo Delete")
  String undoDelete();

  /* 0327 */@DefaultStringValue("Update Log")
  String updateDeviceLog();

  /* 0329 */@DefaultStringValue("Delete all Device Logs")
  String deleteDeviceLogs();

  /* 0330 */@DefaultStringValue("Update")
  String update();

  /* 0331 */@DefaultStringValue("Group Trash Can")
  String groupTrashCan();

  /* 0333 */@DefaultStringValue("Add Agent")
  String addAgent();

  /* 0335 */@DefaultStringValue("Download Agent Software")
  String agentDownload();

  /* 0339 */@DefaultStringValue("Device Trash Can")
  String deviceTrashCan();

  /* 0340 */@DefaultStringValue("Update Status ")
  String updateStatus();

  /* 0341 */@DefaultStringValue("All Devices")
  String updateStatusForAllDevices();

  /* 0342 */@DefaultStringValue("Selected Device")
  String updateStatusForSelectedDevice();

  /* 0343 */@DefaultStringValue("Please Select Device to Status Update.")
  String pleaseSelectDeviceTOStatusUpdate();

  /* 0344 */@DefaultStringValue("Delete Device")
  String deleteDevice();

  /* 0345 */@DefaultStringValue("Delete from List")
  String deleteFromList();

  /* 0346 */@DefaultStringValue("Delete from Search Condition")
  String deleteFromSearchCondition();

  /* 0348 */@DefaultStringValue("Device Discovery")
  String discoveredDevices();

  /* 0350 */@DefaultStringValue("Please Select")
  String selectItemList();

  /* 0352 */@DefaultStringValue("Login")
  String login();

  /* 0353 */@DefaultStringValue("Login ID")
  String loginId();

  /* 0354 */@DefaultStringValue("Invalid Login")
  String invalidLogin();

  /* 0355 */@DefaultStringValue("Login Type")
  String loginType();

  /* 0356 */@DefaultStringValue("Group User")
  String groupUser();

  /* 0357 */@DefaultStringValue("Group Administrator")
  String groupAdministrator();

  /* 0359 */@DefaultStringValue("Selected Device(s)")
  String selectedDevices();

  /* 0360 */@DefaultStringValue("Name")
  String name();

  /* 0361 */@DefaultStringValue("Register")
  String register();

  /* 0366 */@DefaultStringValue("SNMPv1 Settings")
  String snmpv1Settings();

  /* 0367 */@DefaultStringValue("Black Developer")
  String blackdeveloper();

  /* 0368 */@DefaultStringValue("Simple Filter")
  String simpleFilter();

  /* 0369 */@DefaultStringValue("Reset Filter")
  String resetFilter();

  /* 0371 */@DefaultStringValue("Total Device(s)")
  String totalDevices();

  /* 0372 */@DefaultStringValue("Filtered Device(s)")
  String filteredDevices();

  /* 0373 */@DefaultStringValue("Error(s)")
  String errors();

  /* 0374 */@DefaultStringValue("Warning(s)")
  String warnings();

  /* 0377 */@DefaultStringValue("Filter")
  String filter();

  /* 0378 */@DefaultStringValue("Add Filter")
  String addfilter();

  /* 0379 */@DefaultStringValue("Total Group(s)")
  String totalGroups();

  // For Ldap Settings
  /* 0384 */@DefaultStringValue("LDAP Property Settings")
  String ldapSettingTitle();

  /* 0385 */@DefaultStringValue("LDAP Setting")
  String ldapSetting();

  /* 0386 */@DefaultStringValue("Security Authentication Type")
  String securityAuthenticationType();

  /* 0387 */@DefaultStringValue("Initial Context Factory")
  String initialContextFactory();

  /* 0388 */@DefaultStringValue("DN SUFFIX")
  String dnSuffix();

  /* 0389 */@DefaultStringValue("DN PREFIX")
  String dnPrefix();

  /* 0390 */@DefaultStringValue("LDAP Port")
  String ldapPort();

  /* 0391 */@DefaultStringValue("LDAP Host")
  String ldapHost();

  /* 0393 */@DefaultStringValue("Succeeded")
  String succeeded();

  /* 0394 */@DefaultStringValue("Fault")
  String fault();

  /* 0395 */@DefaultStringValue("Classification")
  String classification();

  /* 0396 */@DefaultStringArrayValue({"none", "simple"})
  String[] secAutTypeList();

  /* 0397 */@DefaultStringValue("Switch to Window")
  String switchToWindow();

  /* 0398 */@DefaultStringValue("Sort by")
  String sortBy();

  /* 0399 */@DefaultStringValue("All Devices")
  String allDevices();

  /* 0400 */@DefaultStringValue("Error")
  String errorDevice();

  /* 0401 */@DefaultStringValue("Warning")
  String warningDevice();

  /* 0403 */@DefaultStringValue("Edit/Delete Filters")
  String editDeleteDeviceFilter();

  /* 0404 */@DefaultStringValue("Data Saved Successfully")
  String DataSavedSuccessFully();

  /* 0405 */@DefaultStringValue("Time(s)(0-5)")
  String retryTestItemHint();

  /* 0406 */@DefaultStringValue("Error")
  String error();

  /* 0407 */@DefaultStringValue("Warning")
  String warning();

  /* 0408 */@DefaultStringValue("Normal")
  String normal();

  /* 0410 */@DefaultStringValue("The status settings(for group management account)")
  String generalGroupManagementSetting();

  /* 0411 */@DefaultStringValue("Information")
  String information();

  /* 0412 */@DefaultStringValue("Switch to Tab")
  String switchToTab();

  /* 0413 */@DefaultStringValue("System Settings")
  String systemSettings();

  /* 0414 */@DefaultStringValue("RSP Server IP Address")
  String rspServerIPAddress();

  /* 0415 */@DefaultStringValue("RSP Server Port")
  String rspServerPort();

  /* 0416 */@DefaultStringValue("RSP Related Settings")
  String rspRelatedSettings();

  /* 0419 */@DefaultStringValue("Device Image")
  String deviceImageURL();

  /* 0420 */@DefaultStringValue("Device Image Width")
  String deviceImageWidth();

  /* 0421 */@DefaultStringValue("Device Image Height")
  String deviceImageHeight();

  // TRAY AND TONER

  /* 0431 */@DefaultStringValue("Duplicate Filter Name")
  String duplicateFilterName();

  /* 0432 */@DefaultStringValue("System Filter Not Allowed To Modify. Please Click Cancel Button.")
  String systemFilterNotAllowedToModify();

  /* 0433 */@DefaultStringValue("Filter condition is not set.")
  String criteriaValidationError();

  /* 0434 */@DefaultStringValue("Display Item Change")
  String displayItemChange();

  // Tray And Toner Status
  /* 0435 */@DefaultStringValue("Empty")
  String empty();

  /* 0436 */@DefaultStringValue("Unknown")
  String unknown();

  /* 0437 */@DefaultStringValue("Not Empty")
  String notEmpty();

  /* 0438 */@DefaultStringValue("Low")
  String low();

  /* 0439 */@DefaultStringValue("Near Full")
  String nearFull();

  /* 0440 */@DefaultStringValue("Unequipped")
  String Unequipped();

  /* 0441 */@DefaultStringValue("Failure")
  String failure();

  /* 0442 */@DefaultStringValue("Full")
  String full();

  /* 0443 */@DefaultStringValue("Not Full")
  String notFull();

  // TRAY TYPES
  /* 0444 */@DefaultStringValue("Tray 1")
  String tray1();

  /* 0445 */@DefaultStringValue("Tray 2")
  String tray2();

  /* 0446 */@DefaultStringValue("Tray 3")
  String tray3();

  /* 0447 */@DefaultStringValue("Tray 4")
  String tray4();

  /* 0448 */@DefaultStringValue("Bypass Tray")
  String bypassTray();

  /* 0449 */@DefaultStringValue("Center Tray")
  String centerTray();

  /* 0450 */@DefaultStringValue("Offset Tray")
  String offsetTray();

  /* 0451 */@DefaultStringValue("Auto Select")
  String autoSelect();

  // Units
  /* 0452 */@DefaultStringValue("Sheets")
  String capacityUnits();

  /* 0453 */@DefaultStringValue("Micrometers")
  String paperSizeUnit1();

  /* 0454 */@DefaultStringValue("Inches")
  String paperSizeUnit2();

  // TONER TYPES
  /* 0456 */@DefaultStringValue("Black Toner")
  String blacktoner();

  /* 0457 */@DefaultStringValue("Cyan Toner")
  String cyantoner();

  /* 0458 */@DefaultStringValue("Magenta Toner")
  String magentatoner();

  /* 0459 */@DefaultStringValue("Yellow Toner")
  String yellowtoner();

  // DRUM TYPES
  /* 0460 */@DefaultStringValue("Cyan Photoconductive Drum")
  String cyanopc();

  /* 0461 */@DefaultStringValue("Magenta Photoconductive Drum")
  String magentaopc();

  /* 0462 */@DefaultStringValue("Yellow Photoconductive Drum")
  String yellowopc();

  /* 0463 */@DefaultStringValue("Black Photoconductive Drum")
  String blackopc();

  // artf9214 :SSDI 1320: When "Name" is blank, column in SecDB is blank but in WebUI it is N/A
  // As per above artifact UI is displayed blank instead of "n/a".
  /* 0464 */@DefaultStringValue("")
  String nBya();

  /* 0465 */@DefaultStringValue("Start Discovery")
  String startdiscovery();

  // PRINT SETTIGS STRING LOCALIZATION
  /* 0466 */@DefaultStringValue("Portrait")
  String portrait();

  /* 0467 */@DefaultStringValue("Landscape")
  String landscape();

  // Media Size Name Information

  /* 0469 */@DefaultStringValue("Ledger-R")
  String ledger_r();

  /* 0470 */@DefaultStringValue("Foolscap")
  String foolscap();

  @DefaultStringValue("Letter-R")
  String letter_r();

  // Developer Information

  /* 0471 */@DefaultStringValue("Cyan Developer")
  String cyandeveloper();

  /* 0472 */@DefaultStringValue("Magenta Developer")
  String magentadeveloper();

  /* 0473 */@DefaultStringValue("Yellow Developer")
  String yellowdeveloper();

  /* 0474 */@DefaultStringValue("All Opened Tabs will be closed. Editing Data will be lost. Do you want to continue?")
  String homePageReloadMessage();

  /* 0475 */@DefaultStringValue("Do you want to Remove the Device from list ?")
  String deviceRemoveMessage();

  /* 0476 */@DefaultStringValue("Do you want to Delete the Device(s) from list ?")
  String deleteDevicesWarnMessange();

  /* 0477 */@DefaultStringValue("No Devices are Selected to Delete.")
  String noDevicesSelectToDeleteMsg();

  /* 0478 */@DefaultStringValue("Do you want to register the device(s)?")
  String confirmDeviceRegisterMsg();

  /* 0479 */@DefaultStringValue("No Devices are Selected to  Register.")
  String noDevicesSelectToRegisterMsg();

  /* 0480 */@DefaultStringValue("No Devices are Selected to  Restore.")
  String noDevicesSelectToRestoreMsg();

  /* 0481 */@DefaultStringValue("Do you want to Restore the Device(s)?")
  String restoreDeletedDevicesMsg();

  /* 0482 */@DefaultStringValue("Do you want to Delete the Device(s) Permanently?")
  String deviceDeleteMsg();

  /* 0488 */@DefaultStringValue("Do you want to Delete All Operation Logs?")
  String deleteOperationLogWarn();

  /* 0489 */@DefaultStringValue("Do you want to Delete Selected Group(s)?")
  String deleteSelectdGroupsWarn();

  /* 0490 */@DefaultStringValue("Do you want to Restore Selected Group(s)?")
  String restoreSelectdGroupsWarn();

  /* 0491 */@DefaultStringValue("Do you want to Delete the Group(s) Permanently?")
  String groupDeleteMessage();

  /* 0492 */@DefaultStringValue("Please select a group.")
  String selectMinGroupsWarn();

  /* 0496 */@DefaultStringValue("Please select one group.")
  String noGroupsSelectMessage();

  /* 0502 */@DefaultStringValue("Do you want to Delete this Group?")
  String groupDeleteWarn();

  /* 0504 */@DefaultStringValue("Error sort interpretation")
  String sortError();

  /* 0505 */@DefaultStringValue("Do you want to Delete Selected Filter(s)?")
  String filterDeleteWarn();

  /* 0506 */@DefaultStringValue("No Filters are Selected to Delete.")
  String noFilterSelected();

  /* 0507 */@DefaultStringValue("Password and Confirm Password are not same.")
  String passwordDoNotMatch();

  /* 0514 */@DefaultStringValue("Please enter the value between Lower Limit of Current Level and Lower Limit Of the above level.")
  String overLapLevelMessage();

  /* 0515 */@DefaultStringValue("Invalid Value.")
  String invalidValue();

  /* 0516 */@DefaultStringValue("Ledger")
  String ledger();

  /* 0517 */@DefaultStringValue("Legal")
  String legal();

  /* 0518 */@DefaultStringValue("Legal-R")
  String legalR();

  /* 0519 */@DefaultStringValue("Letter")
  String letter();

  /* 0520 */@DefaultStringValue("Invoice")
  String invoice();

  /* 0521 */@DefaultStringValue("Invoice-R")
  String invoiceR();

  /* 0522 */@DefaultStringValue("A3")
  String a3();

  /* 0523 */@DefaultStringValue("A3R")
  String a3R();

  /* 0524 */@DefaultStringValue("A4")
  String a4();

  /* 0525 */@DefaultStringValue("A4R")
  String a4R();

  /* 0526 */@DefaultStringValue("A5")
  String a5();

  /* 0527 */@DefaultStringValue("A5R")
  String a5R();

  /* 0528 */@DefaultStringValue("A6")
  String a6();

  /* 0529 */@DefaultStringValue("A6R")
  String a6R();

  /* 0530 */@DefaultStringValue("B4")
  String b4();

  /* 0531 */@DefaultStringValue("B4R")
  String b4R();

  /* 0532 */@DefaultStringValue("B5")
  String b5();

  /* 0533 */@DefaultStringValue("B5R")
  String b5R();

  /* 0534 */@DefaultStringValue("B6")
  String b6();

  /* 0535 */@DefaultStringValue("B6R")
  String b6R();

  /* 0536 */@DefaultStringValue("8K")
  String _8K();

  /* 0537 */@DefaultStringValue("8KR")
  String _8KR();

  /* 0538 */@DefaultStringValue("16K")
  String _16K();

  /* 0539 */@DefaultStringValue("16KR")
  String _16KR();

  /* 0540 */@DefaultStringValue("W Post Card")
  String wPostCard();

  /* 0541 */@DefaultStringValue("W Post Card-R")
  String wPostCardR();

  /* 0542 */@DefaultStringValue("Postcard")
  String postcard();

  /* 0543 */@DefaultStringValue("Postcard-R")
  String postcardR();

  /* 0544 */@DefaultStringValue("Chokei3/You 3")
  String chokei3();

  /* 0545 */@DefaultStringValue("Chokei3-R")
  String chokei3R();

  /* 0546 */@DefaultStringValue("Chokei4")
  String chokei4();

  /* 0547 */@DefaultStringValue("Chokei4-R")
  String chokei4R();

  /* 0548 */@DefaultStringValue("Chokei5")
  String chokei5();

  /* 0549 */@DefaultStringValue("kaku-2")
  String kaku_2();

  /* 0550 */@DefaultStringValue("kaku-3")
  String kaku_3();

  /* 0551 */@DefaultStringValue("kaku-8")
  String kaku_8();

  /* 0552 */@DefaultStringValue("YOKEI-1")
  String yOKEI_1();

  /* 0553 */@DefaultStringValue("YOKEI-2")
  String yOKEI_2();

  /* 0554 */@DefaultStringValue("YOKEI-2-R")
  String yOKEI2R();

  /* 0555 */@DefaultStringValue("YOKEI-3")
  String yOKEI_3();

  /* 0556 */@DefaultStringValue("YOKEI-4")
  String yOKEI_4();

  /* 0557 */@DefaultStringValue("YOKEI-4-R")
  String yOKEI_4R();

  /* 0558 */@DefaultStringValue("YOKEI-5")
  String yOKEI_5();

  /* 0559 */@DefaultStringValue("YOKEI-6")
  String yOKEI_6();

  /* 0560 */@DefaultStringValue("YOKEI-7")
  String yOKEI_7();

  /* 0561 */@DefaultStringValue("Monarch")
  String monarch();

  /* 0562 */@DefaultStringValue("Monarch-R")
  String monarchR();

  /* 0563 */@DefaultStringValue("DL")
  String dL();

  /* 0564 */@DefaultStringValue("DL-R")
  String dLR();

  /* 0565 */@DefaultStringValue("C5")
  String c5();

  /* 0566 */@DefaultStringValue("C5R")
  String c5R();

  /* 0567 */@DefaultStringValue("C6")
  String c6();

  /* 0568 */@DefaultStringValue("C6R")
  String c6R();

  /* 0569 */@DefaultStringValue("C65")
  String c65();

  /* 0570 */@DefaultStringValue("C65R")
  String c65R();

  /* 0571 */@DefaultStringValue("ISO B5")
  String iSO_B5();

  /* 0572 */@DefaultStringValue("ISO B5R")
  String iSO_B5R();

  /* 0573 */@DefaultStringValue("COM-10")
  String cOM_10();

  /* 0574 */@DefaultStringValue("COM-10R")
  String cOM_10R();

  /* 0575 */@DefaultStringValue("Folio")
  String folio();

  /* 0576 */@DefaultStringValue("Folio-R")
  String folioR();

  /* 0577 */@DefaultStringValue("Foolscap-R")
  String foolscapR();

  /* 0578 */@DefaultStringValue("Executive")
  String executive();

  /* 0579 */@DefaultStringValue("Executive-R")
  String executiveR();

  /* 0580 */@DefaultStringValue("A3 Wide")
  String a3_Wide();

  /* 0581 */@DefaultStringValue("A3W")
  String a3W();

  /* 0582 */@DefaultStringValue("8.5x13.5")
  String _8pt5into13pt5();

  /* 0583 */@DefaultStringValue("8.5x13.4")
  String _8pt5into13pt4();

  /* 0584 */@DefaultStringValue("Communication Error(s)")
  String noResponses();

  /* 0585 */@DefaultStringValue("Operation Guide")
  String operationManual();

  /* 0586 */@DefaultStringValue("Agent Setup Manual")
  String agentSetupManual();

  /* 0587 */@DefaultStringValue("Communication Status")
  String communicationStatus();

  /* 0588 */@DefaultStringValue("Communicate")
  String communicate();

  /* 0589 */@DefaultStringValue("Not Communicate")
  String notCommunicate();

  // TONER COLORS
  /* 0590 */@DefaultStringValue("Black")
  String black();

  /* 0591 */@DefaultStringValue("Cyan")
  String cyan();

  /* 0592 */@DefaultStringValue("Magenta")
  String magenta();

  /* 0593 */@DefaultStringValue("Yellow")
  String yellow();

  /* 0594 */@DefaultStringValue("Access Date")
  String accessDate();

  /* 0603 */@DefaultStringValue("% (or less)")
  String percentageOrLess();

  /* 0610 */@DefaultStringValue("Device search")
  String startDiscoveryOperationLog();

  /* 0623 */@DefaultStringValue("Maximum of 4 Sub clause is Allowed per Block Operation.")
  String maxBlockConditionError();

  /* 0624 */@DefaultStringValue("Maximum of 4 Block Operation is Allowed per Filter.")
  String maxBlockOperationError();

  /* 0625 */@DefaultStringValue("Add Block Operation")
  String addBlockOperation();

  // at end of "Near Overdue Service Maintenance" | is added to see complete message in drop down combo
  /* 0626 */
  @DefaultStringArrayValue({
      "Printer Error", "Printer Error [Account Limit]", "Overdue Service Maintenance", "Paper Jam",
      "Marker Supply Missing", "Toner Empty", "Cover Open", "Paper Empty", "Specified Input Tray Empty",
      "Specified Input Tray  Missing", "Specified Output Tray Full", "Specified Output Tray Missing", "Offline",
      "Printer Warning", "Toner Low", "Paper Low", "Input Tray Missing", "Output Tray Full", "Output Tray Near Full",
      "Output Tray Missing", "Printer Warning [Output Tray Missing]   .", "Near Overdue Service Maintenance   ",
      "Online [Auto Power Shut-Off]", "Warm-Up", "Online", "Unknown"})
  String[] filterDeviceStatus();

  /* 0627 */@DefaultStringValue("Unable to communicate with server.")
  String unableToCommunicateWithServer();

  /* 0628 */@DefaultStringValue("IP Address format is not correct.")
  String invalidIPAddValidationError();

  /* 0629 */@DefaultStringValue("Network Address Length is not in (0-32) Range.")
  String invalidNetworkAddressLengthValidationError();

  /* 0631 */@DefaultStringValue("select only one Group.")
  String MultipleGroupSelectWarn();

  /* 0632 */@DefaultStringValue("#N/A")
  String NA();

  /* 0633 */@DefaultStringValue("No Devices Are selected To Add.")
  String deviceAddWarn();

  /* 0635 */@DefaultStringValue("Error and Warning")
  String errorAndWarning();

  /* 0636 */@DefaultStringValue("No Data")
  String noData();

  /* 0637 */@DefaultStringValue("mm")
  String millimeter();

  /* 0638 */@DefaultStringValue("MM")
  // Millimeter Display String for English
  String millimeterAsMM();

  /* 0639 */@DefaultStringValue("inches")
  String inches();

  /* 0640 */@DefaultStringValue("Disposal Toner Level")
  String wastetoner();// Should be in lower case since we are explicitly making it as lower case in code irrespective of
                      // server response.

  /* 0643 */@DefaultStringValue("Do you want to remove those device(s) from list and discovery condition?")
  String deleteDevicesWarnMessangeFromDiscoveryCondition();

  /* 0644 */@DefaultStringValue("Trial Discovery Result")
  String trialSearchResults();

  /* 0646 */@DefaultStringValue("Trial Discovery")
  String trialDiscovery();

  /* 0647 */@DefaultStringValue("No items to show.")
  String noItemsToShow();

  /* 0648 */@DefaultStringValue("Loading data...")
  String loadingData();

  /* 0649 */@DefaultStringValue("Total Device Log(s)")
  String totalDeviceLogs();

  /* 0650 */@DefaultStringValue("Maintenance Code")
  String maintenanceCode();

  /* 0651 */@DefaultStringValue("Error Code")
  String errorCodes();

  /* 0652 */@DefaultStringValue("Code")
  String code();

  /* 0653 */@DefaultStringValue("This is not supported in this model")
  String codeNotSupportMgs();

  /* 0654 */@DefaultStringValue("Remote Operation")
  String remoteOperation();

  /* 0655 */@DefaultStringValue("RSP")
  String rsp();

  /* 0656 */@DefaultStringValue("ROP")
  String rop();

  /* 0657 */@DefaultStringValue("Save as XML")
  String saveAsXML();

  /* 0657 */@DefaultStringValue("Device Status")
  String devStatus();

  /* 0658 */@DefaultStringValue("custom")
  String custom();

  /* 0654 */@DefaultStringValue("Group Type")
  String groupType();

  /* 0655 */@DefaultStringValue("Group Distinction")
  String groupDistinction();

  /* 0656 */@DefaultStringValue("Group")
  String generalGroup();

  /* 0657 */@DefaultStringValue("View Only Account")
  String browserGroup();

  /* 0658 */@DefaultStringValue("Remote SRDM Link")
  String externalGroup();

  /* 0659 */@DefaultStringValue("Login availability")
  String logInAvailability();

  /* 0660 */@DefaultStringValue("Login possible")
  String logInPossible();

  /* 0661 */@DefaultStringValue("Login impossible")
  String logInIMPossible();

  /* 0662 */@DefaultStringValue("Language settings")
  String languageSettings();

  /* 0663 */@DefaultStringValue("Date and time format")
  String dateandtimeforamt();

  /* 0664 */@DefaultStringValue("English(English)")
  String English();

  /* 0665 */@DefaultStringValue("Japanese(日本語)")
  String japanese();

  /* 0667 */@DefaultStringValue("Permission List")
  String PermissionList();

  /* 0670 */@DefaultStringValue("Service Features")
  String servicePermission();

  /* 0671 */@DefaultStringValue("Group Management")
  String groupManagementPermission();

  /* 0672 */@DefaultStringValue("Referring URL")
  String referringURL();

  /* 0673 */@DefaultStringValue("Referring port number")
  String referringportnumber();

  /* 0674 */@DefaultStringValue("Referring User Name")
  String referringUserName();

  /* 0675 */@DefaultStringValue("Password Change")
  String passwordChange();

  /* 0676 */@DefaultStringValue("New password")
  String newPassword();

  /* 0677 */@DefaultStringValue("New password confirmation")
  String newPasswordConfirmation();

  /* 0678 */@DefaultStringValue("Device Discovery Condition Name")
  String deviceDiscoveryConditionName();

  /* 0679 */@DefaultStringValue("Device Discovery Condition")
  String deviceDiscoveryCondition();

  /* 0680 */@DefaultStringValue("Blocked IP Address List")
  String blockedIPAddressList();

  /* 0681 */@DefaultStringValue("Specify Blocked IP Address")
  String specifyBlockedIPAddress();

  /* 0682 */@DefaultStringValue("Create New")
  String createNew();

  /* 0683 */@DefaultStringValue("Edit/Delete")
  String editOrDelete();

  /* 0684 */@DefaultStringValue("Device Discovery Condition List")
  String deviceDiscoveryConditionList();

  /* 0685 */@DefaultStringValue("Create Device Discovery Condition")
  String createDeviceDiscoveryCondition();

  /* 0686 */@DefaultStringValue("Delete Device Discovery Condition")
  String deleteDeviceDiscoveryCondition();

  /* 0687 */@DefaultStringValue("IP Address Setting")
  String ipAddressSetting();

  /* 0688 */@DefaultStringValue("Group Information")
  String groupInformation();

  /* 0689 */@DefaultStringValue("Group Path")
  String groupPath();

  /* 0690 */@DefaultStringValue("Schedule Condition")
  String scheduleCondition();

  /* 0691 */@DefaultStringValue("Agent")
  String agentGroup();

  /* 0692 */@DefaultStringValue("Scheduled Action")
  String scheduleSettings();

  /* 0693 */@DefaultStringValue("Schedule Name")
  String scheduleName();

  /* 0694 */@DefaultStringValue("Execute Start Date")
  String executeStartDate();

  /* 0695 */@DefaultStringValue("Recurrence")
  String recurrence();

  /* 0697 */@DefaultStringValue("Execute Time")
  String executeTime();

  /* 0699 */@DefaultStringValue("Schedule Detail Settings")
  String ScheduleDetailSettings();

  /* 0700 */@DefaultStringValue("Every Month(range)")
  String everyMonthRange();

  /* 0701 */@DefaultStringValue("Monday")
  String monday();

  /* 0702 */@DefaultStringValue("Tuesday")
  String tuesday();

  /* 0703 */@DefaultStringValue("Wednesday")
  String wednesday();

  /* 0704 */@DefaultStringValue("Thursday")
  String thursday();

  /* 0705 */@DefaultStringValue("Friday")
  String friday();

  /* 0706 */@DefaultStringValue("Saturday")
  String saturday();

  /* 0707 */@DefaultStringValue("Sunday")
  String sunday();

  /* 0708 */@DefaultStringValue("Time")
  String timer();

  /* 0709 */@DefaultStringValue("Time Range")
  String timeRange();

  /* 0710 */@DefaultStringValue("Hour")
  String hour();

  /* 0711 */@DefaultStringValue("Minute")
  String minute();

  /* 0712 */@DefaultStringValue("Specify")
  String specify();

  /* 0713 */@DefaultStringValue("Cycle")
  String cycle();

  /* 0714 */@DefaultStringValue("Day")
  String day();

  /* 0715 */@DefaultStringValue("Collective Setting")
  String collectiveSetting();

  /* 0716 */@DefaultStringValue("Every Day")
  String everyDay();

  /* 0717 */@DefaultStringValue("Every Week")
  String everyWeek();

  /* 0718 */@DefaultStringValue("Every Month")
  String everyMonth();

  /* 0719 */@DefaultStringValue("Target Device")
  String targetDevice();

  /* 0722 */@DefaultStringValue("Undo Group Movement")
  String undoGroupMovement();

  /* 0722 */@DefaultStringValue("Total Operation Log(s)")
  String totalOperationLogs();

  /* 0723 */@DefaultStringValue("Login Group ID")
  String loginGroupId();

  /* 0724 */@DefaultStringValue("Additional Information")
  String additionalInforamtion();

  /* 0725 */@DefaultStringValue("Item Name")
  String itemName();

  /* 0726 */@DefaultStringValue("Value")
  String value();

  /* 0727 */@DefaultStringValue("Ex:http://127.0.0.1:8085/?d=xyz")
  String referringURLHint();

  /* 0728 */@DefaultStringValue("Referring User Password")
  String referringUserpassword();

  /* 0729 */@DefaultStringValue("Device(s)")
  String devices();

  /* 0730 */@DefaultStringValue("Counter")
  String counter();

  /* 0731 */@DefaultStringValue("Total Impression Count")
  String totalImpressionCount();

  /* 0732 */@DefaultStringValue("B/W Impression Count")
  String nImpressionCountBW();

  /* 0733 */@DefaultStringValue("Color Impression Count")
  String nImpressionCountSingleColor();

  /* 0734 */@DefaultStringValue("Device Status")
  String deviceStatusContent();

  /* 0735 */@DefaultStringValue("Service Code")
  String serviceCode();

  /* 0736 */@DefaultStringValue("TA")
  String nMaintenanceCounterTotal();

  /* 0737 */@DefaultStringValue("CA")
  String nMaintenanceCounterColor();

  /* 0738 */@DefaultStringValue("AA")
  String nMaintenanceCounterBothTotalColor();

  /* 0739 */@DefaultStringValue("TK1")
  String nPrimaryTransferCounterPrinting();

  /* 0740 */@DefaultStringValue("TK2")
  String nSecondTransferCounterPrinting();

  /* 0741 */@DefaultStringValue("FK1")
  String nFixingBeltCounterPrinting();

  /* 0742 */@DefaultStringValue("FK2")
  String nPressureRollerCounterPrinting();

  /* 0743 */@DefaultStringValue("FK3")
  String nFixingWebCounterPrinting();

  /* 0744 */@DefaultStringValue("Number of Error Code")
  String nTroubleCode();

  /* 0745 */@DefaultStringValue("Communication Error Devices")
  String nNoResponse();

  /* 0746 */@DefaultStringValue("Number of Printer Error Devices")
  String nPrinterError();

  /* 0747 */@DefaultStringValue("Number of Printer Error [Account Limit] Devices")
  String nPrinterErrorAccountLimit();

  /* 0748 */@DefaultStringValue("Number of Maintenance Time Exceeded Devices")
  String nOverduePreventMaintenance();

  /* 0749 */@DefaultStringValue("Number of Paper Jam Devices")
  String nPaperJam();

  /* 0750 */@DefaultStringValue("Number of Toner Not Mounted Devices")
  String nMarkerSupplyMissing();

  /* 0751 */@DefaultStringValue("Number of Toner Empty Devices")
  String nTonerEmpty();

  /* 0752 */@DefaultStringValue("Number of Paper Empty Devices")
  String nPaperEmpty();

  /* 0753 */@DefaultStringValue("Number of Offline Status Devices")
  String nOffline();

  /* 0754 */@DefaultStringValue("Number of Printer Warning Devices")
  String nPrinterWarning();

  /* 0755 */@DefaultStringValue("Number of Toner Low Devices")
  String nTonerLow();

  /* 0756 */@DefaultStringValue("Number of  Paper Low Devices")
  String nPaperLow();

  /* 0757 */@DefaultStringValue("Number of \"Near to overdue service maintenance\" warning  Devices")
  String nNearOverduePreventMaintenance();

  /* 0758 */@DefaultStringValue("Number of Offline [Auto Power Shut-Off] Devices")
  String nStandby();

  /* 0759 */@DefaultStringValue("Number of Warm Up Devices")
  String nWarmUp();

  /* 0760 */@DefaultStringValue("Number of Online status Devices")
  String nOnline();

  /* 0761 */@DefaultStringValue("Create SNMPv1 Setting")
  String createSNMPv1Setting();

  /* 0762 */@DefaultStringValue("Delete SNMPv1 Setting")
  String deleteSNMPv1Setting();

  /* 0763 */@DefaultStringValue("Setting Name")
  String settingName();

  /* 0764 */@DefaultStringValue("SNMPv1 Setting Recognition")
  String SNMPv1SettingRecognition();

  /* 0765 */@DefaultStringValue("SNMPv1 Information Settings")
  String SNMPv1InformationSettings();

  /* 0766 */@DefaultStringValue("GET Community")
  String getCommunityName();

  /* 0767 */@DefaultStringValue("SNMPv1 Setting List")
  String SNMPv1SettingList();

  /* 0768 */@DefaultStringValue("SNMP Information Acquisition Settings")
  String SNMPInformationAcquisitionSettings();

  /* 0769 */@DefaultStringValue("Change")
  String change();

  /* 0770 */@DefaultStringValue("SNMP Setting List")
  String snmpSettingList();

  /* 0771 */@DefaultStringValue("Refresh Group Information")
  String refreshGroupInfo();

  /* 0772 */@DefaultStringValue("Get Summary information")
  String getSummaryInformation();

  /* 0773 */@DefaultStringValue("Device number which is registered to Group")
  String nDeviceRegisteredInGroup();

  /* 0774 */@DefaultStringValue("The Number of Sharp Devices by Model")
  String nSharpDevicesInGroupByModel();

  /* 0775 */@DefaultStringValue("The Total Number by Firmware Version")
  String nTotalFirmwareVersion();

  /* 0776 */@DefaultStringValue("Agent Information")
  String agentInformation();

  /* 0778 */@DefaultStringValue("SNMPv3 Setting List")
  String SNMPv3SettingList();

  /* 0779 */@DefaultStringValue("SNMPv3 Setting Recognition")
  String SNMPv3SettingRecognition();

  /* 0780 */@DefaultStringValue("SNMPv3 Information Settings")
  String SNMPv3InformationSettings();

  /* 0781 */@DefaultStringValue("Algorithm")
  String algorithm();

  /* 0782 */@DefaultStringValue("MD5")
  String MD5();

  /* 0783 */@DefaultStringValue("DES")
  String DES();

  /* 0784 */@DefaultStringValue("Blocked IP Address Settings")
  String blockedIPAddressSettings();

  /* 0785 */@DefaultStringValue("IP Address (Start Address)")
  String IPAddress_StartAddress();

  /* 0786 */@DefaultStringValue("Specify Specific Address Settings")
  String specifySpecificAddressSettings();

  /* 0787 */@DefaultStringValue("Broadcast Address Settings")
  String broadcastAddressSettings();

  /* 0788 */@DefaultStringValue("Specify Specific IP Address")
  String specifySpecificIPAddress();

  /* 0789 */@DefaultStringValue("Specify Broadcast Address")
  String specifyBroadcastAddress();

  /* 0790 */@DefaultStringValue("IP Address Range Settings")
  String iPAddressRangeSettings();

  /* 0791 */@DefaultStringValue("Specify IP Address Range")
  String specifyIPAddressRange();

  /* 0792 */@DefaultStringValue("Undo")
  String undo();

  /* 0793 */@DefaultStringValue("Do you want to move the group ?")
  String groupDragWarn();

  /* 0795 */@DefaultStringValue("None")
  String none();

  /* 0796 */@DefaultStringValue("Yes")
  String serviceCodeYes();

  /* 0797 */@DefaultStringValue("No")
  String serviceCodeNo();

  /* 0798 */@DefaultStringValue("SRDM (FSS Connected Devices)")
  String fss();

  /* 0799 */@DefaultStringValue("Start Date")
  String startDate();

  /* 0800 */@DefaultStringValue("Specific")
  String specific();

  /* 0801 */@DefaultStringValue("Period")
  String range();

  /* 0802 */@DefaultStringValue("End Date")
  String endDate();

  /* 0803 */@DefaultStringValue("Graph Time Span")
  String graphTimeSpan();

  /* 0804 */@DefaultStringValue("Week")
  String week();

  /* 0805 */@DefaultStringValue("Month")
  String month();

  /* 0806 */@DefaultStringValue("Per 1 Hour")
  String perOneHour();

  /* 0807 */@DefaultStringValue("Per 1 Day")
  String perOneDay();

  /* 0808 */@DefaultStringValue("Per 1 Week")
  String perOneWeek();

  /* 0809 */@DefaultStringValue("Per 1 Month")
  String perOneMonth();

  /* 0810 */@DefaultStringValue("Per")
  String per();

  /* 0811 */@DefaultStringValue("Interval")
  String interval();

  /* 0812 */@DefaultStringValue("Faces")
  String faces();

  /* 0813 */@DefaultStringValue("Sheets")
  String sheets();

  /* 0814 */@DefaultStringValue("Meters")
  String metres();

  /* 0815 */@DefaultStringValue("Micro Meters")
  String microMeters();

  /* 0816 */@DefaultStringValue("Tenths of Grams")
  String tenthsOfGrams();

  /* 0817 */@DefaultStringValue("Ten Thousandths of Inches")
  String tenThousandOnInches();

  /* 0818 */@DefaultStringValue("Ten Thousandths of Ounces")
  String tenThousandsOfOunces();

  /* 0819 */@DefaultStringValue("Feets")
  String feets();

  /* 0820 */@DefaultStringValue("Items")
  String items();

  /* 0821 */@DefaultStringValue("%")
  String percentage();

  /* 0822 */@DefaultStringValue("Mail Host (SMTP)")
  String mailHost();

  /* 0823 */@DefaultStringValue("Port No")
  String portNo();

  /* 0824 */@DefaultStringValue("E-Mail (SMTP)")
  String mailSMTP();

  /* 0825 */@DefaultStringValue("SMTP Settings")
  // E-Mail (SMTP) Settings
  String mailSMTPSettings();

  /* 0826 */@DefaultStringValue("E-Mail Authentication")
  String emailAuthentication();

  /* 0827 */@DefaultStringValue("The status settings")
  String statusSetting();

  /* 0828 */@DefaultStringValue("E-Mail Alerts")
  String eMailAlerts();

  /* 0829 */@DefaultStringValue("E-Mail Address")
  String emailAddress();

  /* 0830 */@DefaultStringValue("Add")
  String add();

  /* 0831 */@DefaultStringValue("Please enter some values.")
  String pleaseEnter();

  /* 0832 */@DefaultStringValue("Invalid E-mail Address")
  String invalidEmail();

  /* 0833 */@DefaultStringValue("All error and warning status")
  String allErrorWarn();

  /* 834 */@DefaultStringValue("Printer Error")
  String printerError();

  /* 835 */@DefaultStringValue("Printer Error [Account Limit]")
  String accountLimit();

  /* 836 */@DefaultStringValue("Overdue Service Maintenance")
  String overduePreventMaintenance();

  /* 837 */@DefaultStringValue("Paper Jam")
  String paperJam();

  /* 838 */@DefaultStringValue("Marker Supply Missing")
  String markerSupplyMissing();

  /* 839 */@DefaultStringValue("Toner Empty")
  String tonerEmpty();

  /* 840 */@DefaultStringValue("Cover Open")
  String coverOpen();

  /* 841 */@DefaultStringValue("Paper Empty")
  String paperEmpty();

  /* 842 */@DefaultStringValue("Specified Input Tray Empty")
  String specifiedInputTrayEmpty();

  /* 843 */@DefaultStringValue("Specified Input Tray Missing")
  String specifiedInputTrayMissing();

  /* 844 */@DefaultStringValue("Specified Output Tray Full")
  String allOutputTrayFull();

  /* 845 */@DefaultStringValue("Specified Output Tray Missing")
  String specifiedOutputTrayMissing();

  /* 846 */@DefaultStringValue("Offline")
  String offline();

  /* 847 */@DefaultStringValue("Printer Warning")
  String printerWarning();

  /* 848 */@DefaultStringValue("Toner Low")
  String tonerLow();

  /* 849 */@DefaultStringValue("Paper Low")
  String paperLow();

  /* 850 */@DefaultStringValue("Input Tray Missing")
  String inputTrayMissing();

  /* 851 */@DefaultStringValue("Output Tray Full")
  String outputTrayFull();

  /* 852 */@DefaultStringValue("Output Tray Near Full")
  String outputTrayNearFull();

  /* 853 */@DefaultStringValue("Output Tray Missing")
  String outputTrayMissing();

  /* 854 */@DefaultStringValue("Printer Warning [Output Tray Missing]")
  String stackerNotInstalled();

  /* 855 */@DefaultStringValue("Near Overdue Service Maintenance")
  String nearOverduePreventMaintenance();

  /* 856 */@DefaultStringValue("Online [Auto Power Shut-Off]")
  String standby();

  /* 857 */@DefaultStringValue("Warm-Up")
  String warmUp();

  /* 858 */@DefaultStringValue("Online")
  String online();

  /* 0859 */@DefaultStringValue("Check Mail Host")
  String validateSMTP();

  /* 0861 */@DefaultStringValue("Authentication failed.<br> Please make sure your settings of \"User Name\" and \"Password\" are correct.")
  String authenticationFailed();

  /* 00864 */@DefaultStringValue("3 Color")
  String threeColor();

  /* 00865 */@DefaultStringValue("2 Color")
  String twocolor();

  /* 00867 */@DefaultStringValue("A3 and above count")
  String a3AndAboveCount();

  /* 00868 */@DefaultStringValue("Postcard count ")
  String postcardCount();

  /* 00870 */@DefaultStringArrayValue({"UC0"})
  String[] utilCountNameForOther();

  /* 0872 */@DefaultStringValue("Menu")
  String menu();

  /* 0873 */@DefaultStringValue("Default")
  String defaultSettings();

  /* 0874 */@DefaultStringValue("Export Data")
  String xmlFileOutput();

  /* 0879 */@DefaultStringValue("Prints")
  String prints();

  /* 0881 */@DefaultStringValue("Please wait... ")
  String agentDownloadWaitMessage();

  // Operation Log String keys should be in lower case which we are making in to lower case in code.

  /* 0882 */@DefaultStringValue("Created Group ID")
  String creategroupid();

  /* 0883 */@DefaultStringValue("Source Group ID")
  String srcgroupid();

  /* 0884 */@DefaultStringValue("Delete Group ID")
  String deletegroupid();

  /* 0885 */@DefaultStringValue("Undo Group ID")
  String undogroupid();

  /* 0886 */@DefaultStringValue("Destination Group ID")
  String distgroupid();

  /* 0887 */@DefaultStringValue("Group Remove(to trash can)")
  String removegrouptotrash();

  /* 0888 */@DefaultStringValue("Group Remove(from trash can)")
  String removegroupfromtrash();

  /* 0887 */@DefaultStringValue("Undo Of Group Move")
  String undomovegroup();

  /* 0887 */@DefaultStringValue("Undo Of Group Remove")
  String undoremovegroup();

  /* 0887 */@DefaultStringValue("Add to Blocked IP")
  String addblockingipaddress();

  /* 0888 */@DefaultStringValue("Device Edit (SNMP Bulk Settings)")
  String editdevicesnmpcollectivesettings();

  /* 0888 */@DefaultStringValue("Edit Device (SNMP settings)")
  String editdevicesnmpsettings();

  /* 0889 */@DefaultStringValue("Device Remove (to trash)")
  String removedevicetotrash();

  /* 0890 */@DefaultStringValue("Device Remove")
  String removedevicefromtrash();

  /* 0891 */@DefaultStringValue("Cancel Information Update")
  String cancelstatusupdate();

  /* 0892 */@DefaultStringValue("Cancel Device Discovery")
  String canceldiscovery();

  /* 0893 */@DefaultStringValue("Edit Device Discovery Condition")
  String editdiscoverysettings();

  /* 0894 */@DefaultStringValue("Move Group")
  String movegroup();

  /* 0895 */@DefaultStringValue("Please select a device discovery condition.")
  String discoveryConditionRequiredMessage();

  /* 0896 */@DefaultStringValue("Do you want to delete selected discovery condition?")
  String selectedDiscoveryConditionConfirmMessage();

  /* 0896 */@DefaultStringValue("Do you want to delete discovery condition?")
  String selectedDiscoveryConditionDeleteWarnMessage();

  /* 0897 */@DefaultStringValue("Do you want to delete selected SNMPv1 setting?")
  String selectedSNMPV1ConditionConfirmMessage();

  /* 0898 */@DefaultStringValue("Device Discovery")
  String discoveryForScheduleList();

  /* 0899 */@DefaultStringValue("Device Information Update")
  String deviceInfoForScheduleList();

  /* 0900 */@DefaultStringValue("Device Status Update")
  String deviceStatusForScheduleList();

  /* 0901 */@DefaultStringValue("Summery information")
  String summaryInfoForScheduleList();

  /* 0902 */@DefaultStringValue("Export Failed")
  String exportLogFailed();

  /* 0903 */@DefaultStringValue("From Address")
  String fromAddress();

  /* 0904 */@DefaultStringValue("Valid mail server.")
  String validSMTPServer();

  /* 0905 */@DefaultStringValue("End Date is older than Start Date.")
  String scheduleMonthRangeValidator();

  /* 0906 */@DefaultStringValue("End time should be greater than start time.")
  String scheduleTimeRangeValidator();

  /* 0907 */@DefaultStringValue("All error status")
  String allErrorStatus();

  /* 0908 */@DefaultStringValue("All warning status")
  String allWarningStatus();

  /* 0909 */@DefaultStringValue("Group with Account")
  String generalGroupWithLogin();

  /* 0910 */@DefaultStringValue("User Preference")
  String userPreference();

  /* 0911 */@DefaultStringValue("Remote SRDM Settings")
  String remoteSRDMSettings();

  /* 0912 */@DefaultStringValue("Access Test")
  String accessTest();

  /* 0913 */@DefaultStringValue("SSL")
  String ssl();

  /* 0914 */@DefaultStringValue("Update Device Status")
  String StartUpdateStatus();

  /* 0915 */@DefaultStringValue("SNMP Authentication Setting Copy")
  String copyOfSNMPParameterSet();

  /* 0916 */@DefaultStringValue("Authentication Setting ")
  String copyCredentialFrom();

  /* 0917 */@DefaultStringValue("Please select authentication setting for copy.")
  String copyCredentialSelectionWarningMessage();

  /* 0918 */@DefaultStringValue("Please select a target device.")
  String targetDeviceSelectionWarningMessage();

  /* 0919 */@DefaultStringValue("Reflect")
  String reflect();

  /* 0921 */@DefaultStringValue("Getting Summery Information")
  String gettingsummeryinformation();

  /* 0922 */@DefaultStringValue("External referring information")
  String externalreferringinformation();

  /* 0924 */@DefaultStringValue("Every")
  String every();

  /* 0925 */@DefaultStringValue("UC0")
  String UC0();

  /* 0926 */@DefaultStringValue("UC1")
  String UC1();

  /* 0927 */@DefaultStringValue("UC2")
  String UC2();

  /* 0928 */@DefaultStringValue("UC3")
  String UC3();

  /* 0929 */@DefaultStringValue("Internet Fax Receive")
  String internetFaxReception();

  /* 0930 */@DefaultStringValue("Fax Receive")
  String faxReceive();

  /* 0931 */@DefaultStringValue("Fax Receive 1")
  String faxReception1();

  /* 0932 */@DefaultStringValue("Fax Receive 2")
  String faxReception2();

  /* 0933 */@DefaultStringValue("Fax Receive 3")
  String faxReception3();

  /* 0934 */@DefaultStringValue("Scan Send")
  String scanningTransmission();

  /* 0935 */@DefaultStringValue("Internet Fax Send")
  String internetFaxTransmission();

  /* 0936 */@DefaultStringValue("Fax Send")
  String faxTransmission();

  /* 0937 */@DefaultStringValue("Fax Send 1")
  String faxTransmission1();

  /* 0938 */@DefaultStringValue("Fax Send 2")
  String faxTransmission2();

  /* 0939 */@DefaultStringValue("Fax Send 3")
  String faxTransmission3();

  /* 0940 */@DefaultStringValue("Scan to HDD")
  String scansToHDD();

  /* 0941 */@DefaultStringValue("Do you want to delete all the device Logs?")
  String deleteAllDeviceLogsWarn();

  /* 0942 */@DefaultStringValue("Undo of device(s) Delete")
  String undoremovedevice();

  /* 0943 */@DefaultStringValue("Origin group ID (destination during group move)")
  String backfromgroupid();

  /* 0944 */@DefaultStringValue("Destination group ID (origin during group move)")
  String backtogroupid();

  /* 0945 */@DefaultStringValue("Cycle should be smaller value than specified range dates.")
  String monthRangeCycleErrorMessage();

  /* 0946 */@DefaultStringValue("Interval should be smaller than specified time range.")
  String timeRangeCycleErrorMessage();

  /* 0947 */@DefaultStringValue("IP Address which is added to Blocked IP")
  String addipaddress();

  /* 0948 */@DefaultStringValue("Failed To Create The Group.")
  String failedToCreate_a_Group();

  /* 0949 */@DefaultStringValue("Export Device Counter")
  String counterDataDownload();

  /* 0950 */@DefaultStringValue("Switch to Tile")
  String switchToTile();

  /* 0951 */@DefaultStringValue("Do you want to delete the selected device(s)?")
  String deviceDeleteFromNewDeviceMsg();

  /* 0952 */@DefaultStringValue("Selected Theme Is Saved. To Apply The Selected Theme, This Page Will Be Reloaded. All Opened Tabs & Messages will be closed, Unsaved changes will be lost. Do you want to continue?")
  String themeReloadMessage();

  /* 0953 */@DefaultStringValue("Please select SNMPv1 setting to delete.")
  String DeleteSNMPV1Warn();

  /* 0954 */@DefaultStringValue("Please select discovery condition to delete.")
  String DeleteDiscoveryConditionWarn();

  /* 0956 */@DefaultStringValue("Download Log")
  // System Log Download
  String systemLogDownload();

  /* 0957 */@DefaultStringValue("SRDM 1")
  // Server
  String systemLogServer();

  /* 0958 */@DefaultStringValue("SRDM 4")
  // SRDM:MIB
  String systemLogMIB();

  /* 0961 */@DefaultStringValue("SRDM 2")
  // SRDM:Common
  String systemLogCommon();

  /* 0962 */@DefaultStringValue("SRDM 3")
  // E-Mail Alert
  String systemLogEmailAlert();

  /* 0963 */@DefaultStringValue("Log Type")
  String systemLogType();

  /* 0964 */@DefaultStringValue("Must be at least 0")
  String validatorMustBeGreaterThan();

  /* 00966 */@DefaultStringValue("Color Total")
  String colorTotal();

  /* 0968 */@DefaultStringValue("German(Deutsch)")
  String German();

  /* 0969 */@DefaultStringValue("French(FranÃ§ais)")
  String French();

  /* 0970 */@DefaultStringValue("Dutch(Nederlands)")
  String Dutch();

  /* 0971 */@DefaultStringValue("Swedish(Svenska)")
  String Swedish();

  /* 0972 */@DefaultStringValue("Italian(Italiano)")
  String Italian();

  /* 0973 */@DefaultStringValue("Spanish(EspaÃ±ol)")
  String Spanish();

  /* 0974 */@DefaultStringValue("SRDM")
  String SRDM();

  /* 0975 */@DefaultStringValue("Access to Color Mode Counter")
  String counterColorAuthority();

  /* 0976 */@DefaultStringValue("Access to Utility Counter")
  String utilityCounterAuthority();

  /* 0977 */@DefaultStringValue("Access to Post Card/ A3 or Above Counter")
  String postcardandA3CounterAuthority();

  /* 0978 */@DefaultStringValue("Please Enter Valid Date.")
  String invalidDateValidationError();

  /* 0979 */@DefaultStringValue("Please enter the valid number.")
  String invalidNumberValidationError();

  /* 0980 */@DefaultStringValue("To Date is older than From Date. ")
  String invalidToDateValidationError();

  /* 0981 */@DefaultStringValue("Start IP must be lesser than end IP. ")
  String invalidToIPValidationError();

  /* 0982 */@DefaultStringValue("System Management")
  String systemManagementPermission();

  /* 0983 */@DefaultStringValue("Periodical Log Delete Settings")
  String ScheduledLogDelete();

  /* 0984 */@DefaultStringValue("FSS Basic")
  String fieldSupportSystemPermission();

  /* 0985 */@DefaultStringValue("FSS Firmware Update")
  String firmwareUpdatePermission();

  /* 0986 */@DefaultStringValue("Execute Schedule Log Delete")
  String executeLogPeriodicalDelete();

  /* 0987 */@DefaultStringValue("Log available")
  String periodicalLogavailable();

  /* 0989 */@DefaultStringValue("New group is created successfully.")
  String createdGroupMessage();

  /* 0991 */@DefaultStringValue("By Device")
  String deviceCounterData();

  /* 0992 */@DefaultStringValue("Sum of all Devices")
  String allDeviceCounterData();

  /* 0993 */@DefaultStringValue("End Date Should Be Greater Than Start Date.")
  String validatorStartDateError();

  /* 0994 */@DefaultStringValue("Start Date Should Be Lesser Than End Date.")
  String validatorEndDateError();

  /* 0996 */@DefaultStringValue("Too much data to display the graph. Please shorten the period (start date / end date), or extend the interval.")
  String validatorTooManyGraphData();

  /* 0997 */@DefaultStringValue("Account Management")
  String accountManagement();

  /* 0998 */@DefaultStringValue("Extended Account List")
  String expandedAccountList();

  /* 0999 */@DefaultStringValue("Edit Extended Account")
  String editExpandedAccount();

  /* 1000 */@DefaultStringValue("Create Extended Account")
  String createExpandedAccount();

  /* 1001 */@DefaultStringValue("User Name Already Existst.")
  String duplicateUserName();

  /* 1002 */@DefaultStringValue("Import Device Information")
  String importdeviceinfo();

  /* 1003 */@DefaultStringValue("Export Device Information")
  String exportdeviceinfo();

  /* 1004 */@DefaultStringValue("Export")
  String export();

  /* 1005 */@DefaultStringValue("Include in device log / counter log")
  String includeTheDeviceLog_CounterLog();

  /* 1006 */@DefaultStringValue("Failed to export device information.")
  String failedToExportDeviceInfo();

  /* 1007 */@DefaultStringValue("Export target data device does not exist.")
  String missingExportDevice();

  /* 1008 */@DefaultStringValue("Login Account Password Confirmation")
  String comfirmedLoginUserPassword();

  /* 1009 */@DefaultStringValue("Incorrect Password.")
  String incorrectLoginUserPassword();

  /* 1010 */@DefaultStringValue("Do you want to delete the account?")
  String accountDeleteMessage();

  /* 1011 */@DefaultStringValue("RSP Server Name")
  String rspServerName();

  /* 1012 */@DefaultStringValue("When same device exists ")
  String sameDevice();

  /* 1013 */@DefaultStringValue("Remove Registered Devices Before Import")
  String removeDeviceBeforeImport();

  /* 1014 */@DefaultStringValue("Import")
  String deviceImport();

  /* 1015 */@DefaultStringValue("Keep the original device information ")
  String leaveTheOriginalDevice();

  /* 1016 */@DefaultStringValue("Overwrite With Imported Device Information")
  String overwriteTheImportDevice();

  /* 1017 */@DefaultStringValue("Select")
  String importFileSelect();

  /* 1018 */@DefaultStringValue("File")
  String importFile();

  /* 1019 */@DefaultStringValue("Device Information Import Result")
  String deviceInfoImportResults();

  /* 1020 */@DefaultStringValue("Import succeeded device(s)")
  String importsuccesscount();

  /* 1021 */@DefaultStringValue("Device(s) Failed to Import")
  String importFailedCount();

  /* 1022 */@DefaultStringValue("Duplicate Device(s) ")
  String duplicateDeviceCount();

  /* 1023 */@DefaultStringValue("Import Error Device(s)")
  String importErrorDevice();

  /* 1024 */@DefaultStringValue("Import Result")
  String importResults();

  /* 1025 */@DefaultStringValue("Import Data File Does Not Exist.")
  String missingImportDataFile();

  /* 1023 */@DefaultStringValue("Failed to import device information.")
  String failedToImportDeviceInfo();

  /* 1024 */@DefaultStringValue("Imported data version is different.")
  String invalidDataVersion();

  /* 1025 */@DefaultStringValue("Default Account")
  String defaultAccount();

  /* 1027 */@DefaultStringValue("Too less data available. Please long the period(start date / end date), or shorten the interval.")
  String validatorTooLessGraphData();

  /* 1028 */@DefaultStringValue("Must be a date.")
  String validator_notADate();

  /* 1029 */@DefaultStringValue("Field is required.")
  String validator_requiredField();

  /* 1030 */@DefaultStringValue("Duplicate")
  String duplicatedevice();

  /* 1031 */@DefaultStringValue("Are you sure you want to delete this record?")
  String areYouSureToDeleteThisRecord();

  /* 1032 */@DefaultStringValue("Filtered Device Log(s)")
  String filteredDeviceLogs();

  /* 1033 */@DefaultStringValue("Must be at least 1024")
  String validator_mustBeGreaterThan();

  /* 1034 */@DefaultStringValue("Must be no more than 65535")
  String validator_mustBeLessThan();

  /* 1035 */@DefaultStringValue("bytes")
  String bytes();

  /* 1036 */@DefaultStringValue("Readme")
  String readme();

  /* 1037 */@DefaultStringValue("Failed to create the account.")
  String failedToCreateTheExpandedAccount();

  /* 1037 */@DefaultStringValue("Discovery Condition-0")
  String defaultDiscoveryConditionName();

  /* 1038 */@DefaultStringValue("Discovery Condition ID-0")
  String defaultDiscoveryConditionExplanation();

  /* 1039 */@DefaultStringValue("snmpv1Credential-0")
  String defaultsnmpv1CredentialName();

  /* 1040 */@DefaultStringValue("snmpv1Credential ID-0")
  String defaultsnmpv1CredentialExplanation();

  /* 1041 */@DefaultStringValue("Tray 5")
  String tray5();

  /* 1042 */@DefaultStringValue("Large Capacity Cassette")
  String largeCapacityCassette();

  /* 1043 */@DefaultStringValue("Large Capacity Lower Tray")
  String largeCapacityLowerTray();

  /* 1044 */@DefaultStringValue("2nd Large Capacity Upper Tray")
  String secondLargeCapacityUpperTray();

  /* 1045 */@DefaultStringValue("2nd Large Capacity Lower Tray")
  String secondLargeCapacityLowerTray();

  /* 1046 */@DefaultStringValue("2nd Stacker Stack Tray")
  String secondStackerStackTray();

  /* 1047 */@DefaultStringValue("Inserter Upper Tray")
  String inserterUpperTray();

  /* 1048 */@DefaultStringValue("Inserter Lower Tray")
  String inserterLowerTray();

  /* 1049 */@DefaultStringValue("Large Capacity Upper Tray")
  String largeCapacityUpperTray();

  /* 1050 */@DefaultStringValue("Large Capacity Tray")
  String largeCapacityTray();

  /* 1051 */@DefaultStringValue("Large Capacity Middle Tray")
  String largeCapacityMiddleTray();

  /* 1052 */@DefaultStringValue("Folding Unit Tray")
  String foldingUnitTray();

  /* 1053 */@DefaultStringValue("Upper Tray")
  String upperTray();

  /* 1054 */@DefaultStringValue("Top Tray")
  String topTray();

  /* 1055 */@DefaultStringValue("Right Tray")
  String rightTray();

  /* 1056 */@DefaultStringValue("Left Tray")
  String leftTray();

  /* 1057 */@DefaultStringValue("Left Side Tray")
  String leftSideTray();

  /* 1058 */@DefaultStringValue("Escape Tray")
  String escapeTray();

  /* 1059 */@DefaultStringValue("Exit Tray")
  String exitTray();

  /* 1060 */@DefaultStringValue("Finisher Sub Tray")
  String finisherSubTray();

  /* 1061 */@DefaultStringValue("2nd Stacker Top Tray")
  String secondStackerTopTray();

  /* 1062 */@DefaultStringValue("Stacker Stack Tray")
  String stackerStackTray();

  /* 1063 */@DefaultStringValue("Stacker Top Tray")
  String stackerTopTray();

  /* 1064 */@DefaultStringValue("Finisher Tray")
  String finisherTray();

  /* 1065 */@DefaultStringValue("Saddle Stitch Tray")
  String saddleStitchTray();

  /* 1066 */@DefaultStringValue("Finisher Upper Tray")
  String finisherUpperTray();

  /* 1067 */@DefaultStringValue("Finisher Top Tray")
  String finisherTopTray();

  /* 1068 */@DefaultStringValue("Finisher Offset Tray")
  String finisherOffsetTray();

  /* 1069 */@DefaultStringValue("Finisher Middle Tray")
  String finisherMiddleTray();

  /* 1070 */@DefaultStringValue("Finisher Lower Tray")
  String finisherLowerTray();

  /* 1071 */@DefaultStringValue("Bypass Manual")
  String bypassManual();

  /* 1071 */@DefaultStringValue("Add Account")
  String addaccount();

  /* 1072 */@DefaultStringValue("Edit Account With Password Change")
  String editaccountwithpasswordchange();

  /* 1073 */@DefaultStringValue("Delete Account")
  String deleteaccount();

  /* 1074 */@DefaultStringValue("Edit Account")
  String editaccount();

  /* 1075 */@DefaultStringValue("Password Must Be Minimum 8 Characters Or Maximum 128 Characters.")
  String PasswordLengthValidateMess();

  /* 1076 */@DefaultStringValue("Password Can Not Be Same As User Name or Group Name or Group ID.")
  String PasswordAndUserNameValidateMessage();

  /* 1077 */@DefaultStringValue("Specified password can't be used.<br>Password must meet following requirements:<br>*It should be single byte Alphanumeric Characters between 8 and 128 characters<br>*It should not be same as Group Name<br>*It should not be same as User Name.")
  String PasswordSameAsGroupNameAndUserName();

  /* 1078 */@DefaultStringValue("Do You Want Continue? ")
  String doYouWantContinue();

  /* 1079 */@DefaultStringValue("has already configured with some of the below E-Mail alert(s).")
  String DuplicateEmailConfigureMessage();

  /* 1080 */@DefaultStringValue("Schedule Log Delete Settings")
  String ScheduledLogDeleteSettings();

  /* 1081 */@DefaultStringValue("Schedule Log Delete")
  String Schedulelogdelete();

  /* 1082 */@DefaultStringValue("Change Time Zone")
  String changeTimeZone();

  /* 1083 */@DefaultStringValue("Updated Date and Time")
  String updatedDateAndTime();

  /* 1084 */@DefaultStringValue("Login Group Name")
  String loginGroupName();

  /* 1085 */@DefaultStringValue("Login Account Name")
  String loginAccountUserName();

  /* 1086 */@DefaultStringValue("SRDM (File Distribution)")
  String fd();

  /* 1087 */@DefaultStringValue("snmpv3Credential-0")
  String defaultsnmpv3CredentialName();

  /* 1088 */@DefaultStringValue("snmpv3Credential ID-0")
  String defaultsnmpv3CredentialExplanation();

  /* 1089 */@DefaultStringValue("Order")
  String order();

  /* 1090 */@DefaultStringValue("Status")
  String discoveryStatus();

  /* 1091 */@DefaultStringValue("Device Discovery is executed with the order of the list.<br>The order can be changed by drag and drop.")
  String discoveryConditionExplanation();

  /* 1092 */@DefaultStringValue("Enable Discovery Condition")
  String enableDiscoveryCondition();

  /* 1093 */@DefaultStringValue("Disable Discovery Condition")
  String disableDiscoveryCondition();

  /* 1094 */@DefaultStringValue("Enabled")
  String discoveryConditionIsEnabled();

  /* 1095 */@DefaultStringValue("Disabled")
  String discoveryConditionIsDisabled();

  /* 1096 */@DefaultStringValue("Default Discovery Condition is included in the selected condition.")
  String defaultDiscoveryConditionDeleteWarnMessage();

  /* 1097 */@DefaultStringValue("SHA-1")
  String SHA_1();

  /* 1098 */@DefaultStringValue("Default SNMPv1 Condition is included in the selected condition.")
  String defaultSNMPV1ConditionDeleteWarnMessage();

  /* 1099 */@DefaultStringValue("Do you want to delete selected SNMPv3 setting?")
  String selectedSNMPV3ConditionConfirmMessage();

  /* 1100 */@DefaultStringValue("Default SNMPv3 Condition is included in the selected condition.")
  String defaultSNMPV3ConditionDeleteWarnMessage();

  /* 1101 */@DefaultStringValue("Please select SNMPv3 setting to delete.")
  String DeleteSNMPV3Warn();

  /* 1102 */@DefaultStringValue("Change Authentication Key")
  String changeAuthenticationKey();

  /* 1103 */@DefaultStringValue("Change Privacy Key")
  String changePrivacyKey();

  /* 1104 */@DefaultStringValue("Counter History")
  String groupCounterHistory();

  /* 1105 */@DefaultStringValue("Past 1 Day")
  String pastOneDay();

  /* 1106 */@DefaultStringValue("Past 1 Month")
  String pastOneMonth();

  /* 1107 */@DefaultStringValue("Past 1 Year")
  String pastOneYear();

  /* 1108 */@DefaultStringValue("SNMPv3 target to be deleted is currently used.")
  String targetedSNMPV3InUse();

  /* 1109 */@DefaultStringValue("SNMPv1 target to be deleted is currently used.")
  String targetedSNMPV1InUse();

  /* 1110 */@DefaultStringValue("Create SNMPv3 Setting")
  String createSNMPv3Setting();

  /* 1111 */@DefaultStringValue("Delete SNMPv3 Setting")
  String deleteSNMPv3Setting();

  /* 1112 */@DefaultStringValue("Unable to delete group. This group is logged-in in another session.")
  String unableToDeleteLoggedinGroupMessage();

  /* 1114 */@DefaultStringValue("Do you want to delete SNMPv3 setting?")
  String SNMPV3ConditionConfirmMessage();

  /* 1115 */@DefaultStringValue("Do you want to delete SNMPv1 setting?")
  String SNMPV1ConditionConfirmMessage();

  /* 1117 */@DefaultStringValue("Import Error Count")
  String importerrorcount();

  /* 1118 */@DefaultStringValue("Unable to delete account. This account is logged-in in another session.")
  String failedToDeleteLoggedinUserAccountMessage();

  /* 1119 */@DefaultStringValue("Operation Log Delete")
  String deleteoperationlog();

  /* 1120 */@DefaultStringValue("Account is already deleted.")
  String accountIsAlreadyDeletedMessage();

  /* 1121 */@DefaultStringValue("Unable to delete account.")
  String unableToDeleteAccount();

  /* 1122 */@DefaultStringValue("Unable to delete group.")
  String unableToDeleteAGroup();

  /* 1123 */@DefaultStringValue("There is a group in which search/disovery is failed. Please confirm the Agent status.")
  String enableDiscoverySettingMessage();

  /* 1125 */@DefaultStringValue("Unable to perform discovery operation. Please check the availability of device group.")
  String noAgentInformation();

  /* 1126 */@DefaultStringValue("Unable to perform discovery operation.")
  String devicediscoveryFailed();

  /* 1127 */@DefaultStringValue("Unable to perform discovery operation. Please check the status of agents.")
  String unableToCommunicateWithAgent();

  /* 1128 */@DefaultStringValue("Invalid reference group Id.")
  String invalidReferenceGroupId();

  /* 1129 */@DefaultStringValue("Must be a whole number.")
  String validator_notAnInteger();

  /* 1130 */@DefaultStringValue("Selected Language is saved. To apply the changes, this page will be reloaded. All opened tabs & messages will be closed. Unsaved changes will be lost. Do you want to continue? ")
  String languageReloadMessage();

  /* 1131 */@DefaultStringValue("About")
  String about();

  /* 1132 */@DefaultStringValue("About SRDM")
  String SRDMabout();

  /* 1134 */@DefaultStringValue("Remote SRDM is Accessible.")
  String remoteSRDMAccessible();

  /* 1135 */@DefaultStringValue("Remote SRDM is not Accessible.")
  String remoteSRDMNotAccessible();

  /* 1136 */@DefaultStringValue("Connection error with Remote SRDM.")
  String connectionError();

  /* 1136 */@DefaultStringValue("Setting for Cloud")
  String cloudSettingPermission();

  /* 1137 */@DefaultStringValue("Not Accessible")
  String notAccessible();

  /* 1138 */@DefaultStringValue("Accessible")
  String accessible();

  /* 1139 */@DefaultStringValue("Counter History")
  String deviceCounterHistory();

  /* 1140 */@DefaultStringValue("Email Notification")
  String emailNotification();

  /* 1141 */@DefaultStringValue("To")
  String toAddress();

  /* 1142 */@DefaultStringValue("Cc")
  String carbonCopy();

  /* 1143 */@DefaultStringValue("Bcc")
  String blindCarbonCopy();

  /* 1144 */@DefaultStringValue("Subject")
  String emailSubject();

  /* 1145 */@DefaultStringValue("Body")
  String emailBody();

  /* 1146 */@DefaultStringValue("Contact")
  String contact();

  /* 1147 */@DefaultStringValue("Device Cloning")
  String deviceCloningPermission();

  /* 1148 */@DefaultStringValue("File Distribution")
  String fileDistributionPermission();

  /* 1149 */@DefaultStringValue("Refresh")
  String refresh();

  /* 1150 */@DefaultStringValue("Must be Less Than Or Equal To 1000 Characters.")
  String validator_LessThanOrEqual1000();

  /* 1151 */@DefaultStringValue("[SRDM] Account Information")
  String srdmAccountInformation();

  /* 1152 */@DefaultStringValue("Error")
  String errorCode();

  /* 1153 */@DefaultStringValue("Failed to send account information notification E-Mail. Please contact the server's administrator.")
  String failedToSendAccountInformation();

  /* 1154 */@DefaultStringValue("Failed")
  String failedToAccess();

  /* 1155 */@DefaultStringValue("There is a new version. New version")
  String newVersionOfAgentMessage();

  /* 1158 */@DefaultStringValue("Online")
  String printing();

  /* 1159 */@DefaultStringValue("Invalid mail server.")
  String invalidMailServer();

  /* 1160 */@DefaultStringValue("Unable to communicate to the specified mail server.<br> Please make sure your settings of \"Mail Host(SMTP)\" and \"Port No\" are correct.")
  String unableToCommunicateMailServer();

  /* 1161 */@DefaultStringValue("Agent download is failed.")
  String agentDownloadFailed();

  /* 1162 */@DefaultStringValue("Bypass Tray (Manual)")
  String bypassTrayManual();

  // #1794 [WebUI]: Localization issue in Operation log page
  /* 1163 */@DefaultStringValue("Agent Version")
  String setagentversion();

  /* 1164 */@DefaultStringValue("Must be at least 1.")
  String moreThanZero();

  /* 1165 */@DefaultStringValue("N/A")
  String notApplicableCode();

  /* 1166 */@DefaultStringValue("Toner")
  String toner();

  /* 1167 */@DefaultStringValue("Developer")
  String developer();

  /* 1168 */@DefaultStringValue("Booklet Maker Tray")
  String bookletMakerTray();

  /* 1169 */@DefaultStringValue("Inserter Tray")
  String inserterTray();

  /* 1170 */@DefaultStringValue("Photoconductive Drum")
  String opc();

  /* 1171 */@DefaultStringValue("Move Device(s)")
  String moveDevices();

  /* 1172 */@DefaultStringValue("Paste Device(s)")
  String pasteDevices();

  /* 1173 */@DefaultStringValue("Copy Device(s)")
  String copyDevices();

  /* 1174 */@DefaultStringValue("Device Group")
  String deviceGroupCaption();

  /* 1177 */@DefaultStringValue("Please select the device(s) to copy/move.")
  String noDevicesSelectedToCopyOrMoveMsg();

  /* 1178 */@DefaultStringValue("Device copy/move can be done between groups which are having same agent.")
  String canNotCopyOrMoveDevicesMessage();

  /* 1179 */@DefaultStringValue("Successfully deleted.")
  String successfullyDeleted();

  /* 1180 */@DefaultStringValue("Failed to delete.")
  String failedToDelete();

  /* 1182 */@DefaultStringValue("Failed to move.")
  String failedToMove();

  /* 1183 */@DefaultStringValue("Copy or Move Device(s)")
  String copyOrMoveDevices();

  /* 1184 */@DefaultStringValue("Copy or Move Result")
  String copyOrMoveResult();

  /* 1185 */@DefaultStringValue("Success Count")
  String successCount();

  /* 1186 */@DefaultStringValue("Failure Count")
  String failureCount();

  /* 1187 */@DefaultStringValue("Device(s) are registered.")
  String registrationMessage();

  /* 1188 */@DefaultStringValue("Device(s) are restored.")
  String devicesRestoreMessage();

  /* 1189 */@DefaultStringValue("Remote Operation Panel")
  String remoteOperationPanel();

  /* 1190 */@DefaultStringValue("With Account")
  String withAccount();

  /* 1191 */@DefaultStringValue("Please enter the mandatory fields to continue.")
  String fillAccountInfoMessage();

  /* 1192 */@DefaultStringValue("Device(s) copy/move operation completed.")
  String copyOrMoveOperationDone();

  /* 1193 */@DefaultStringValue("Cannot copy or move to same device group.")
  String canNotCopyOrMoveToSameAgentGroup();

  /* 1194 */@DefaultStringValue("No devices are availabel to copy/move.")
  String devicesDoesNotExist();

  /* 1195 */@DefaultStringValue("Failed to copy/move device(s).")
  String failedToCopyOrMoveDevies();

  /* 1196 */@DefaultStringValue("Firewall Transparent Mode")
  String firewallTransparentMode();

  /* 1197 */@DefaultStringValue("Connected")
  String connected();

  /* 1198 */@DefaultStringValue("Not Installed")
  String notinstalled();

  /* 1199 */@DefaultStringValue("No Response")
  String noresponse();

  /* 1200 */@DefaultStringValue("Enable")
  String enable();

  /* 1201 */@DefaultStringValue("Failed to register.")
  String failedToRegister();

  /* 1202 */@DefaultStringValue("Failed to restore.")
  String failedToRestore();

  /* 1203 */@DefaultStringValue("Group(s) are restored.")
  String groupsRestoreMessage();

  // Operation Log String keys should be in lower case which we are making in to lower case in code.

  /* 1204 */@DefaultStringValue("Copy Device(s)")
  String copydevice();

  /* 1205 */@DefaultStringValue("Move Device(s)")
  String movedevice();

  /* 1206 */@DefaultStringValue("Created Device Group ID")
  String createagentgroupid();

  /* 1207 */@DefaultStringValue("Source Device Group ID for Duplicate")
  String srcduplicateagentgroupid();

  /* 1208 */@DefaultStringValue("Destination Device Group ID for Duplicate")
  String dstduplicateagentgroupid();

  /* 1209 */@DefaultStringValue("Source Group ID")
  String srccopydeviceagentgroupid();

  /* 1210 */@DefaultStringValue("Destination Group ID")
  String dstcopydeviceagentgroupid();

  /* 1211 */@DefaultStringValue("Source Group ID")
  String srcmovedeviceagentgroupid();

  /* 1212 */@DefaultStringValue("Destination Group ID")
  String dstmovedeviceagentgroupid();

  /* 1213 */@DefaultStringValue("Agent is already installed for this group.")
  String agentAlreadyExists();

  /* 1214 */@DefaultStringValue("Network Settings")
  String networkSettings();

  /* 1215 */@DefaultStringValue("Public Host Address")
  String publicHostAddress();

  /* 1216 */@DefaultStringValue("Public Http Port Number")
  String publicHttpPort();

  /* 1217 */@DefaultStringValue("Public Https Port Number")
  String publicHttpsPort();

  /* 1218 */@DefaultStringValue("Public Tunnel Port Number")
  String publicTunnelPort();

  /* 1219 */@DefaultStringValue("Agent is already installed. Do you want to continue?")
  String agentAlreadyExistsWarning();

  /* 1220 */@DefaultStringValue("Initial processing")
  String initialProcessing();

  /* 1220 */@DefaultStringValue("End processing")
  String endProcessing();

  /* 1221 */@DefaultStringValue("Firewall Transparent Mode Settings")
  String firewallTransparentModeSetting();

  /* 1222 */@DefaultStringValue("Apply")
  String apply();

  /* 1223 */@DefaultStringValue("Create Device Group")
  String createagentgroup();

  /* 1223 */@DefaultStringValue("Failed to set enable/disable of Firewall transparent mode.")
  String failedToSetFirwallSettings();

  /* 1224 */@DefaultStringValue("Download Agent and Install")
  String downloadNewAgentAndInstall();

  /* 1225 */@DefaultStringValue("Select from Existing Agent List")
  String selectFromExistingAgentList();

  /* 1226 */@DefaultStringValue("Selected Agent")
  String selectedAgent();

  /* 1227 */@DefaultStringValue("**Agent should be downloaded and installed.")
  String agentdownloadAndInstallInfo();

  /* 1228 */@DefaultStringValue("Group Name(s)")
  String deviceGroupsName();

  /* 1229 */@DefaultStringValue("Please select atleast one IP address setting.")
  String selectIPAddressSetting();

  /* 1230 */@DefaultStringValue("Power Management")
  String powerManagementPermission();

  /* 1231 */@DefaultStringValue("Service Basic")
  String serviceBasicPermission();

  /* 1232 */@DefaultStringValue("Access to Additional Agent")
  String agentInstallPermission();

  /* 1233 */@DefaultStringValue("FSS Features")
  String fssPermissions();

  /* 1235 */@DefaultStringValue("Admin Features")
  String adminPermissions();

  /* 1236 */@DefaultStringValue("Authority Group")
  String authorityGroup();

  /* 1237 */@DefaultStringValue("Advanced Features")
  String advancedFeaturesPermission();

  /* 1238 */@DefaultStringValue("Security Dashboard")
  String advancedFeaturesBasic();

  /* 1239 */@DefaultStringValue("Selected time is already available in the list.")
  String timeAlreadyExists();

  /* 1240 */@DefaultStringValue("Please add at least one schedule time to the list.")
  String noTimeInTimerList();

  /* 1241 */@DefaultStringValue("Hosting Features")
  String hostingFeatures();

  /* 1242 */@DefaultStringValue("Details")
  String rspDetails();

  /* 1243 */@DefaultStringValue("Agent Running Status")
  String runningStatus();

  /* 1244 */@DefaultStringValue("Agent Started Time")
  String agentStartedTime();

  /* 1245 */@DefaultStringValue("Stopped")
  String stopped();

  /* 1246 */@DefaultStringValue("Running")
  String running();

  /* 1247 */@DefaultStringValue("Agent Status")
  String statusofagent();

  /* 1248 */@DefaultStringValue("Unregistered")
  String unregistered();

  /* 1249 */@DefaultStringValue("Register Device")
  String registered();

  /* 1250 */@DefaultStringValue("Started")
  String started();

  /* 1251 */@DefaultStringValue("Minimum interval is 1 minute.")
  String excecuteTimeRangeErrorMessage();
  
  /* 1252 */@DefaultStringValue("Data doesn't exist.")
  String dataNotAvailable();  
  
  /* 1253 */@DefaultStringValue("Invalid request pattern.")
  String accountTypeInvalidPattern(); 
  
  /* 1254 */@DefaultStringValue("Group(s) does not exists.")
  String groupDoesNotExists();
  
  /* 1255 */@DefaultStringValue("Out of group management permission.")
  String outoffSpecifiedGroupManagment();
  
  /* 1256 */@DefaultStringValue("File format error.")
  String fileFormatError();  
  
  /* 1257 */@DefaultStringValue("Default account cannot be modified.")
  String defaultAccountNameNotAllowedToChange(); 
  
  /* 1258 */@DefaultStringValue("Request failed.")
  String requestFailed();  
  
  /* 1259 */@DefaultStringValue("File is not available.")
  String missingExportDataFile();  
  
  /* 1260 */@DefaultStringValue("Required permission not set.")
  String permissionNotAvailable();
  
  /* 1262 */@DefaultStringValue("Notification from Agent.")
  String notificationfromagent();
  
  
  /* 1263 */@DefaultStringValue("Invalid Filter ID format.")
  String invalidFilterIDFormat();
  
  /* 1264 */@DefaultStringValue("Invalid Device ID format.")
  String invalidDeviceIDformat();  
  
  /* 1265 */@DefaultStringValue("Specified attribute is incorrect.")
  String specifiedAttributeIsIncorrect(); 
  
  /* 1266 */@DefaultStringValue("Invalid schedule ID format.")
  String invalidScheduleIDormat();  
  
  /* 1267 */@DefaultStringValue("Invalid \"execDateType/startDay/execTimeType/timeZoneId\" value.")
  String invalidExeValue();  
  
  /* 1268 */@DefaultStringValue("Incorrect sort condition.")
  String incorrecSortCodition();

  /* 1269 */@DefaultStringValue("Incorrect sort condition/device ID.")
  String incorrectSortOrdeviceID();
 
  /* 1270 */@DefaultStringValue("Credential Set")
  String credentialSet();
    
  /* 1271 */@DefaultStringValue("SNMP Version")
  String snmpVersion();
  
  /* 1272 */@DefaultStringValue("Please select some status.")
 String pleaseSelectSomeStatus();
  
  /* 1273 */@DefaultStringValue("Deleted")
 String deleted();
  
  /* 1274 */@DefaultStringValue("Create Authority Group")
 String createAuthorityGroup();
  
  /* 1275 */@DefaultStringValue("Create Remote SRDM Link")
 String createRemoteSRDMLinkGroup();
  
  /* 1276 */@DefaultStringValue("Login Page URL")
  String loginPageURL();
  
  /* 1277 */@DefaultStringValue("Please select \"Group Management\" before selecting \"Access to Create Account Group\".")
  String groupManagementRequired();
  
  /* 1278 */@DefaultStringValue("\"Access To Create Account Group\" is also unselected.")
  String groupManagementUnselected();
  
  /* 1279 */@DefaultStringValue("Access to Create Account Group")
  String createAccountGroupPermission();
  
  /* 1279 */@DefaultStringValue("Success")
  String successTitle();
  
  /* 1280 */@DefaultStringValue("To login, use the URL")
  String useLoginURL();
  

  /* 0061 */@DefaultStringValue("Send Group Info via E-mail")
  String sendGroupInfoviaEmail();
  
  /* 1282 */@DefaultStringValue("Failed to start the service.")
  String failedToStartTheService();  
  
  /* 1283 */@DefaultStringValue("Under heavy workloads. Please retry after a while.")
  String heavyWorkLoad();
  
  /*1284*/@DefaultStringValue("Must be atleast ")
  String customvalidator_mustBeLessThan();
  
  /*1285*/@DefaultStringValue("Must be no more than ")
  String customvalidator_mustBeGreaterThan();
 
  /* 1286 */@DefaultStringValue("Please select Every Week value.")
  String selectEveryweekValues();
  
  /* 1287 */@DefaultStringValue("Latest one log")
  String latestOneLog();
  
  /* 1287 */@DefaultStringValue("Note: Operation log is retained for the period of Available Data setting<br>(Minimum 1 month).")
  String minOneMonthData(); 
  
  /* 1288 */@DefaultStringValue("Schedule Log Delete")
  String scheduleddeletelog();
    
  /* 1287 */@DefaultStringValue("IP address can be entered as comma separated.Example: 192.168.1.1,192.168.1.11, 192.168.1.34")
  String enterIPAddressSeperatedByComma();
  
  /* 1288 */@DefaultStringValue("Discovery Condition")
  String discoveryCondition();
  
  /* 1289 */@DefaultStringValue("Discover")
  String discoverAndRegister();
  
  /* 1290 */@DefaultStringValue("Discovered and Registered Devices ")
  String discoveredAndRegistered();
  
  /* 1291 */@DefaultStringValue("Register Device")
  String registerDevice();
  
  /* 1292 */@DefaultStringValue("Auto")
  String auto();
  
  /* 1293 */@DefaultStringValue("Manual")
  String manual();
  
  /* 1294 */@DefaultStringValue("Execute after SRDM Service Restart")
  String executeAfterRestartSRDMServer();
  
  /* 1295 */@DefaultStringValue("Register Device(s) Automatically")
  String registerDeviceAutomatically();
  
  /* 1295 */@DefaultStringValue("Discovered Devices")
  String discoveredDevicesString();
  
  /* 1295 */@DefaultStringValue("Please set SNMP settings")
  String pleasesetsnmpsettings();
  
  /* 1295 */@DefaultStringValue("Create/Edit/Delete")
  String createeditdelete();  
  
  /* 1296 */@DefaultStringValue("Target device(s) does not exist.")
  String targetDeviceDoesntExist(); 
  
  /* 1297 */@DefaultStringValue("Schedule is already registered.")
  String scheduleAlreadyRegistered();
  
  /* 1298 */@DefaultStringValue("Specified discovery condition does not exist.")
  String specifiedDisCondDoesNotExist();
  
  /* 1298 */@DefaultStringValue("Unable to perform status update operation. Please check the availability of device group.")
  String unableToPerformStatusUpdate();
  
  /* 1298 */@DefaultStringValue("Number of Devices")
  String numberofdevices();
  
  /* 1299 */@DefaultStringValue("Create")
  String create();
  
  /* 1300 */@DefaultStringValue("Properties")
  String properties();
  
  /* 1301 */@DefaultStringValue("Create SNMPv1 Setting")
  String createNewV1();

  /* 1302 */@DefaultStringValue("Edit/Delete SNMPv1 Setting")
  String editOrDeleteV1();
  
  /* 1303 */@DefaultStringValue("Create SNMPv3 Setting")
  String createNewV3();
  
  /* 1304 */@DefaultStringValue("Edit/Delete SNMPv3 Setting")
  String editOrDeleteV3();
  
  /* 1305 */@DefaultStringValue("Execute Schedule Maintenance")
  String excuteScheduleMaintenance();
  
  /* 1306 */@DefaultStringValue("Send Maintenance Result by Email")
  String sendMaintenanceResultbyEmail();
  
  /* 1307 */@DefaultStringValue("Schedule Maintenance")
  String scheduleMaintenance();
  
  /* 1308 */@DefaultStringValue("Schedule Maintenance Settings")
  String scheduleMaintenanceSettings();
  
  /* 1309 */@DefaultStringValue("SRDM will be back soon")
  String maintenanceString1();
  
  /* 1310 */@DefaultStringValue("SRDM is currently down for planned maintainance to improve the service.we will return shortly.")
  String maintenanceString2();
  
  /* 1311 */@DefaultStringValue("We apologize for the inconvenience and appreciate your patience.Thank you for using SRDM.")
  String maintenanceString3();
  
  /* 1312 */@DefaultStringValue("We will send an E-Mail once maintainance is completed.Please refresh or re-open SRDM to access successfully.")
  String maintenanceString4();
  
  /* 1313 */@DefaultStringValue("Schedule Maintenance Result")
  String srdmMaintenanceResult();
  
  /* 1314 */@DefaultStringValue("Thank you for your patience. <br> SRDM schedule maintenance is completed.")
  String scheduleMaintCompleted();
  
  /* 1315 */@DefaultStringValue("Schedule maintenance execution result")
  String scheduleMaintenanceExecResult();

  /* 1316 */ @DefaultStringValue("Warning: SRDM server is running with low disk space. Please contact administrator or refer Server Setup Guide.")
  String lowDiskSpaceWarning();

  /* 1317 */@DefaultStringValue("Target Role")
  String targetRole();  

  /* 1318 */@DefaultStringValue("Specify Time Zone")
  String specifyTimeZone();
  
  /* 1319 */@DefaultStringValue("Domain ID")
  String domainId();
  
  /* 1320 */@DefaultStringValue("Maintenance date and time should be greater than current date and time.")
  String maintenaceTimeShouldBeGreaterThanCurrentTime();  

  /* 1321 */@DefaultStringValue("Login Account Password Confirmation")
  String comfirmLoginAccountPassword();
  
  /* 1322 */@DefaultStringValue("Login Account Password not Matched")
  String loginAccountPasswordnotMatched();
  
  /* 1323 */@DefaultStringValue("Session Timeout Or Disk Full")
  String sessionTimeoutOrDiskFull();
  
  /* 1324 */@DefaultStringValue("Invalid SessionId")
  String invalidSessionId();
  
  /* 1325 */@DefaultStringValue("Specified Account Does not Exist")
  String specifiedAccountDoesnotExist();  
  
  /* 1326 */@DefaultStringValue("Device Information")
  String deviceMeter();
  
  /* 1327 */@DefaultStringValue("Are you sure you want to delete all the records?")
  String deleteIpaddress();
  
  /* 1328 */@DefaultStringValue("Note: Logged-in account's password is required to change password.")
  String loginAccountPasswordTextNote();
  
	/* 1329 */@DefaultStringValue("Result Code")
	String resultCode();
	
	/* 1330 */@DefaultStringValue("Total System Log(s)")
	String totalsystemLogs();
	
	/* 1331 */@DefaultStringValue("No data to show.")
	String noSystemLogToDisplay();
	
	/* 1332 */@DefaultStringValue("Loading System Logs")
	String loadingSystemLogs();
	
	/* 1333 */@DefaultStringValue("Update Logs")
	String updatelogs();
	
	/* 1334 */@DefaultStringValue("Delete All System Log(s)")
	String deleteAllSystemLogs();
	
	/* 1335 */@DefaultStringValue("Do you want to delete all system logs?")
	String deleteSystemLogWarn();
	
	/* 1336 */@DefaultStringValue("Schedule Log Delete")
	String schedulelogdelete();
	
	/* 1337 */@DefaultStringValue("Domain Name")
	String domainName();
	
	/* 1338 */@DefaultStringValue("Invalid Value")
	String invalidInputParam();
	
	/* 1339 */@DefaultStringValue("Optimization succeeded with error code:")
	String optimizationSucceededWithErr();	

	/* 1340 */@DefaultStringValue("Optimziation failed with error code:")
	String optimizationFailedWithErr();	

	/* 1341 */@DefaultStringValue("Optimization Succeeded")
	String optimizationSucceeded();
  
  /* 0279 */@DefaultStringValue("Status Update")
  String statusUpdateCap();

  /* 0279 */@DefaultStringValue("Status Update")
  String simpleupdate();
  
  /* 0279 */@DefaultStringValue("Information Update")
  String fullupdate();
  
  /* 0279 */@DefaultStringValue("Set E-Mail Alerts")
  String setmailalertlist();
   
	/* 1342 */@DefaultStringValue("JSON Parser Error")
	String jsonParserError();

	/* 1343 */@DefaultStringValue("DB Optimization Execution")
	String dbOptimize();

	/* 1344 */@DefaultStringValue("DB Optimization Setting")
	String dbOptSetting();

	/* 1345 */@DefaultStringValue("Service Start")
	String serviceStart();

	/* 1346 */@DefaultStringValue("Service Stop")
	String serviceStop();

	/* 1347 */@DefaultStringValue("SMTP Setting")
	String smtpSetting();

	/* 1348 */@DefaultStringValue("Network Setting")
	String networkSetting();

	/* 1349 */@DefaultStringValue("Firewall Transparent Mode Setting")
	String rspjSetting();

	/* 1350 */@DefaultStringValue("Export Log")
	String exportLog();

	/* 1351 */@DefaultStringValue("Start Time")
	String startTimestamp();

	/* 1352 */@DefaultStringValue("End Time")
	String endTimestamp();

	/* 1353 */@DefaultStringValue("DB Size Before Optimization")
	String beforeSize();

	/* 1354 */@DefaultStringValue("DB Size After Optimization")
	String afterSize();

	/* 1355 */@DefaultStringValue("HDD Free Space Before Optimization")
	String beforeDiskSize();

	/* 1356 */@DefaultStringValue("HDD Free Space After Optimization")
	String afterDiskSize();

	/* 1357 */@DefaultStringValue("Setting State")
	String optimizeSettingState();

	/* 1358 */@DefaultStringValue("HDD Free Space")
	String diskSize();

	/* 1359 */@DefaultStringValue("SMTP Setting State")
	String smtpSettingState();

	/* 1360 */@DefaultStringValue("Enabled")
	String enabled();

	/* 1361 */@DefaultStringValue("Disabled")
	String disable();

	/* 1362 */@DefaultStringValue("Public IP")
	String publicIpState();

	/* 1363 */@DefaultStringValue("Public Http Port")
	String publicHttpPortState();

	/* 1364 */@DefaultStringValue("Public Https Port")
	String publicHttpsPortState();

	/* 1365 */@DefaultStringValue("Public Tunnel Port")
	String publicTunnelPortState();

	/* 1366 */@DefaultStringValue("Status")
	String rspjState();

	/* 1367 */@DefaultStringValue("System Log")
	String systemLogs();

	/* 1368 */@DefaultStringValue("Note: System log is retained for the period of Available Data setting<br>(Minimum 1 month).")
	String minOneMonthSystemLogData();
	
	/* 1369 */@DefaultStringValue("Import failed. Imported data is not matching with current SRDM version.")
	String importedDataIsNotMatching();
	
	/* 1370 */@DefaultStringValue("Quick Status Update")
	String quickStatusUpdate();
	
	/* 1371 */@DefaultStringValue("Special Counter Settings")
	String specialCounterSetting();
	
	/* 1372 */@DefaultStringValue("Utility Counter")
	String utilityCounter();
	
	/* 1373 */@DefaultStringValue("Color Mode Counter")
	String colorModeCounter();
	
	/* 1374 */@DefaultStringValue("Post Card / A3 or above Counter")
	String postCardA3counter();
	
	/* 1375 */@DefaultStringValue("Specified target group in the account is no longer be set as managed group. Please contact administrator.")
	String loginIssueWithAccountGroup();
	
	/* 1376 */@DefaultStringValue("Basic Information Update")
	String basicUpdateForScheduleList();
	
	/* 1377 */@DefaultStringValue("Supplies Update")
	String suppliesUpdateForScheduleList();
	
	/* 1378 */@DefaultStringValue("Counter Update")
	String counterUpdateForScheduleList();

	
	//Driver distribution
	/* 1378 */@DefaultStringValue("Printer Driver Management")
	String printerDriverManagement();
	
	/* 1378 */@DefaultStringValue("Printer Driver File List")
	String printerDriverFileList();
	
	/* 1378 */@DefaultStringValue("File Upload")
	String printerDriverFileUpload();
	
	/* 1378 */@DefaultStringValue("Driver Configuration Settings")
	String printerDriverSettings();
	
	/* 1378 */@DefaultStringValue("Do you want to delete selected driver file(s)?")
	String printerDriverDeleteConfirm();
	
	/* 1378 */@DefaultStringValue("Please select atleast one file to delete.")
	String printerDriverDeleteWarn();
	
	/* 1378 */@DefaultStringValue("Driver Identifier Name")
	String printerDriverName();
	
	/* 1378 */@DefaultStringValue("Size[MB]")
	String printerDriverFileSize();
	
	/* 1378 */@DefaultStringValue("E-Mail")
	String printerDriverMail();
	
	/* 1378 */@DefaultStringValue("Do you want to delete the driver file?")
	String printerDriverDelConfirm();
	
	/* 1378 */@DefaultStringValue("Driver ID")
	String printerDriverId();
	
    /* 1378 */@DefaultStringValue("Uploaded")
    String printerDriverFileUploaded();
    
	/*1378 */@DefaultStringValue("of")
    String of();
	
	/* 1378 */@DefaultStringValue("File")
	String file();
	
	/* 1378 */@DefaultStringValue("Upload")
	String upload();
	
    /*1379*/@DefaultStringValue("Upload is in progress...")
	 String printerDriverUploadInProgress();
    
	/* 1379 */@DefaultStringValue("Invalid E-mail Address")
	String invalidEmailAddr();	
    
	/* 1379 */@DefaultStringValue("[SRDM] Printer Driver Information.")
	String printerDriverEmailsubject();
	
	/* 1379 */@DefaultStringValue("The following SHARP Printer has drivers available for download.")
	String printerDriverEmailBody1();
	
	/* 1379 */@DefaultStringValue("Click on the link provided to download and install a printer driver.")
	String printerDriverEmailBody2();	
	
	/* 1381 */@DefaultStringValue("Report Format")
	String reportformat();
	
	/* 1382 */@DefaultStringValue("PDF")
	String pdf();
	
	/* 1383 */@DefaultStringValue("HTML")
	String html();
	
	/* 1384 */@DefaultStringValue("CSV")
	String csv();
	
	/* 1385 */@DefaultStringValue("Report List")
	String reportList();
	
	/* 1386 */@DefaultStringValue("E-mail Settings")
	String emailSettings();
	
	/* 1387 */@DefaultStringValue("Action at the time of report")
	String actionTimeOfReport();
	
	/* 1388 */@DefaultStringValue("Send E-mail")
	String saveSendEmail();
	
	/* 1389 */@DefaultStringValue("Report Settings")
	String reportSettings();
	
	/* 1390 */@DefaultStringValue("Weekly Report")
	String weeklyreport();
	
	/* 1391 */@DefaultStringValue("Monthly Report")
	String monthlyreport();
	
	/* 1392 */@DefaultStringValue("Closing Date")
	String closingDate();
	
	/* 1393 */@DefaultStringValue("Select Period")
	String selectperiod();
	
	/* 1394 */@DefaultStringValue("Reporting Period")
	String reportingPeriod();
	
	
	
	/* 1395 */@DefaultStringValue("Latest Report")
	String latestReport();
	
	/* 1418 */@DefaultStringValue("Closing Day")
	String closingday();
	
	/* 1418 */@DefaultStringValue("Sort Settings")
	String sortsettings();
	
	/* 1419 */@DefaultStringValue("Type of Report")
	String typeOfReport();
	
	/* 1420 */@DefaultStringValue("Created Date")
	String creationDate();
	
	/* 1421 */@DefaultStringValue("Total Report(s)")
	String totalreportLists();

	/* 1379 */@DefaultStringValue("Failed to send driver information.")
	String failedToSendDriverInformation();

	/* 1423 */@DefaultStringValue("Vendor")
	String maker();

	/* 1424 */@DefaultStringValue("Report Type")
	String reportType();

	/* 1379 */@DefaultStringValue("** Select the target device(s) to which driver information is to be sent.")
	String peinterDriverEmailNote();
	
	/* 1379 */@DefaultStringValue("Emulation")
	String driverPropEmulation();
	
	/* 1379 */@DefaultStringValue("Silent Installation")
	String driverPropSilentInstall();

	/* 1379 */@DefaultStringValue("TCP/IP Port settings")
	String driverPropTcpIPPortSettings();

	/* 1379 */@DefaultStringValue("Port Number")
	String driverPropPortNum();

	/* 1379 */@DefaultStringValue("Queue name")
	String driverPropQueName();

	/* 1379 */@DefaultStringValue("Default Settings")
	String driverDefaultSettings();

	/* 1379 */@DefaultStringValue("Color Mode")
	String driverPropColorMode();

	/* 1379 */@DefaultStringValue("Duplex Print")
	String driverPropDuplexPrint();

	/* 1379 */@DefaultStringValue("Staple")
	String staple();

	/* 1379 */@DefaultStringValue("Printing Policy")
	String limitationsOfPrinterFeature();

	/* 1379 */@DefaultStringValue("Document Filing")
	String documentFiling();

	/* 1379 */@DefaultStringValue("User Authentication")
	String userAuth();

	/* 1379 */@DefaultStringValue("Use Windows Login Name as 'Login Name'")
	String UseWindowsLogin();

	/* 1379 */@DefaultStringValue("Black and White Print specific driver(Color print not available)")
	String blackAndWhitePrinterDriver();

	/* 1379 */@DefaultStringValue("Driver supporting coexistence with product version")
	String driverSupportProductVersion();

	/* 1379 */@DefaultStringValue("Suffix to be added")
	String suffixTobeAdded();

	/* 1379 */@DefaultStringValue("User Authority Installation")
	String useAuthInstallation();
	
	/* 1379 */@DefaultStringValue("RAW")
	String raw();

	/* 1379 */@DefaultStringValue("LPR")
	String lpr();
	
	/* 1379 */@DefaultStringValue("Back")
	String back();

	/* 1379 */@DefaultStringValue("Next")
	String next();
	
	/* 1379 */@DefaultStringValue("Total Driver File(s)")
	String totalDriverFiles();
	
	/* 1379 */@DefaultStringValue("Supported Device List")
	String supportedDeviceList();
	
	/* 1379 */@DefaultStringValue("Multiple driver files can't be configured together. Please select only one driver file.")
	String pleaseSelectOnlyOneDriverFile();
	
	/* 1379 */@DefaultStringValue("Please select a file to configure.")
	String pleaseSelectAtleastOneDriverFile();

	/* 1425 */@DefaultStringValue("Usage Status Report")
	String usageStatusReport();
	
	/* 1426 */@DefaultStringValue("Report")
	String report();
	
	/* 1427 */@DefaultStringValue("Show")
	String viewSample();
	
	/* 1429 */@DefaultStringValue("Others")
	String others();
	
	/* 1430 */@DefaultStringValue("Period")
	String periodGMT();
	
	/* 1431 */@DefaultStringValue("[SRDM]Report")
	String srdmReportSubject();
	
	/* 1432 */@DefaultStringValue("E-mail")
	String emailWindow();
	
	/* 1434 */@DefaultStringValue("Device Report")
	String deviceReport();
	
	/* 1435 */@DefaultStringValue("Discovery and Update")
	String discoveryandupdate();
	
	/* 1436 */@DefaultStringValue("Reporting")
	String reporting();
	
	/* 1437 */@DefaultStringValue("Execute at Startup")
	String executeatstartup();
	
	/* 1438 */@DefaultStringValue("Schedule Type")
	String scheduletype();
	
	/* 1439 */@DefaultStringValue("Disable")
	String excuteStartUpdisable();
	
	/*1440*/@DefaultStringValue("File upload is failed due to invalid file format.")
	String mibInvalidFileFormat();
	
	/* 1441 */@DefaultStringValue("Ascending")
	String ascending();
	
	/* 1442 */@DefaultStringValue("Descending")
	String descending();
	
	/* 1442 */@DefaultStringValue("Download")
	String download();
	
	/* 1443 */@DefaultStringValue("Usage Status Report Settings")
	String usageStatusReportSettings();
	
	/* 1444 */@DefaultStringValue("Device Report Settings")
	String deviceReportSettings();
	
	/* 1445 */@DefaultStringValue("Account Status")
	String accountStatus();

	/* 1446 */@DefaultStringValue("View")
	String view();
	
	/* 1447 */@DefaultStringValue("Send E-mail")
	String sendMail();
	
   /* 1448 */@DefaultStringValue("Do you want to delete the selected report(s)?")
	String doYouWantToDeleteSelectedReport();
	  
   /* 1449 */@DefaultStringValue("No report(s) are selected to delete.")
	String selectMinReportWarn();
   
   /* 1449 */@DefaultStringValue("PCL6")
	String pcl6Emulation();
   
   /* 1449 */@DefaultStringValue("PS")
	String psEmulation();
   
   /* 1449 */@DefaultStringValue("Long Edge")
	String longEdgeDuplexSet();
   
   /* 1449 */@DefaultStringValue("Short Edge")
	String shortEdgeDuplexSet();
   
   /* 1449 */@DefaultStringValue("Gray scale")
	String grayScaleColorMode();
   
   /* 1449 */@DefaultStringValue("1 Staple")
	String oneStaple();
   
   /* 1449 */@DefaultStringValue("2 Staples")
	String twoStaple();
   
   /* 1449 */@DefaultStringValue("Please select atleast one device to configure the driver.")
 	String DeviceDriverConfigWarning();
   
   /* 1450 */@DefaultStringValue("Must be at least 1")
   String validator_mustBeGreaterThanOne();
   
   /* 1451 */@DefaultStringValue("Driver name already exist.")
   String duplicateDriverName();
   
   /* 1452 */@DefaultStringValue("Sufficiant disk space not available in the target system.")
   String lowDiskSpace();
   
   /* 1453 */@DefaultStringValue("File is too large or oversized.")
   String largeFileUploaded();
   
   /* 1454 */@DefaultStringValue("File upload is failed.")
   String uploadFailed();
   
   /* 1455 */@DefaultStringValue("Specified driver file doesn't exist.")
   String specifiedDriverFileDoesnotExist();
   
   /* 1456 */@DefaultStringValue("Unable to delete selected driver file.")
   String unableToDeleteSelectedDriverFile();
   
	/* 1457 */@DefaultStringValue("Success")
	String success();

	/* 1458 */@DefaultStringValue("Selected driver file(s) deleted.")
	String selectedDriverFileDeleted();
	
	/* 1459 */@DefaultStringValue("Selected driver file download is failed.")
	String driverDownloadFailed();
	
	/* 1460 */@DefaultStringValue("Please specify source to upload from.")
	String pleaseSpecifyUploadFilePath();
	
	/* 1461 */@DefaultStringValue("Edit Driver File")
	String editDriver();

	/* 1462 */@DefaultStringValue("Tray & Supply")
	String trayAndSupply();
	
	/* 1463 */@DefaultStringValue("Output Tray Information")
	String outputTrayInformation();
	
	/* 1464 */@DefaultStringValue("Tray & Supply Update")
	String trayAndSupplyUpdate();
	
	/* 1465 */@DefaultStringValue("Past")
    String past();
	    
	/* 1466 */@DefaultStringValue("Weeks")
    String weeks();
	
	/* 1467 */@DefaultStringValue("Custom Settings")
	String customSettings();
	 
	/* 1468 */@DefaultStringValue(" Functions ")
    String functions();

	/* 1469 */@DefaultStringValue("PDL")
	  String pdl();
   
	/* 1470 */@DefaultStringValue("Last Functions Update")
	  String functionsUpdate();
	
	/* 1471 */@DefaultStringValue("Device Report Save")
      String devicereportsave();
	 
	/* 1472 */@DefaultStringValue("Usage Status Report Save")
      String usagereportsave();
	
	/* 1473 */@DefaultStringValue("Device Report E-mail")
      String devicereportemail();
   
	/* 1474 */@DefaultStringValue("Usage Status Report E-mail")
      String usagereportemail();
   
	/* 1475 */@DefaultStringValue("Device Report Edit")
      String devicereportedit();
	
	/* 1476 */@DefaultStringValue("Usage Status Report Edit")
      String usagereportedit();
	
	/* 1477 */@DefaultStringValue("Device Report Delete")
      String devicereportdelete();
	
	/* 1478 */@DefaultStringValue("Usage Status Report Delete")
      String usagereportdelete();
	
	/* 1479 */@DefaultStringValue("Report Duration")
	  String reportduration();
	
	/* 1480 */@DefaultStringValue("Report Action")
	  String reportaction();
	
	/* 1481 */@DefaultStringValue("Sort Order")
	  String sortorder();
	
	/* 1482 */@DefaultStringValue("View Report")
	  String viewReport();
	
	/* 1483 */@DefaultStringValue("Maker")
	  String makerComboItem();

	/* 1484 */@DefaultStringValue("File Information")
	  String fileInformation();

	/* 1485 */@DefaultStringValue("Edit Schedule")
	  String editSchedule();
	
	/* 1486 */@DefaultStringValue("Last Basic Update")
	  String lastBasicUpdate();
	
	/* 1487 */@DefaultStringValue("Last Tray & Supply Update")
	  String lastSuppliesUpdate();
	
	/* 1488 */@DefaultStringValue("Last Counter Update")
	  String lastCounterUpdate();
	
	/* 1489 */@DefaultStringValue("Paper Not Available")
	 String paperNotAvailable();

	/* 1490 */@DefaultStringValue("Toner Not Available")
	 String tonerNotAvailable();
	
	/* 1491 */@DefaultStringValue("Create Driver Group")
	String createDriverGroup();

	/* 1492 */@DefaultStringValue("Delete Driver Group")
	String deleteDriverGroup();

	/* 1493 */@DefaultStringValue("Upload Driver File")
	String uploadDriverFile();

	/* 1494 */@DefaultStringValue("Edit Driver File Information")
	String editDriverFileInfo();

	/* 1495 */@DefaultStringValue("Delete Driver File")
	String deleteDriverFile();

	/* 1496 */@DefaultStringValue("Driver Settings")
	String setDriverConfig();

	/* 1497 */@DefaultStringValue("Download Driver File")
	String downloadDriverFile();

	/* 1498 */@DefaultStringValue("Driver ID")
	String driverId();

	/* 1499 */@DefaultStringValue("Driver Identifier Name")
	String driverIdName();

	/* 1500 */@DefaultStringValue("Download with URL")
	String downloadWithURL();

	/* 1501 */@DefaultStringValue("Cc")
	String ccAddress();

	/* 1502 */@DefaultStringValue("Bcc")
	String bccAddress();
	
	/* 1503 */@DefaultStringValue("Please select a file which extension has \".zip\" or \".exe\".")
	String pleaseSelectZipOrExeFile();

	/* 1504 */@DefaultStringValue("Printer Name")
	String printerName();

	/* 1504 */@DefaultStringValue("Report is failed to send through E-mail. Please check E-mail settings or contact administrator.")
	  String reportMailFailed();
	
	/* 1505 */@DefaultStringValue("Report is E-mailed successfully.")
	  String reportMailed();
	
	/* 1506 */@DefaultStringValue("Report generation is failed.")
	  String reportCreateFailed();
		
	/* 1507 */@DefaultStringValue("Report is saved successfully.")
	  String reportSaved();
	
	/* 1508 */@DefaultStringValue("Report is saved but failed to send E-mail. Please check E-mail settings or contact administrator.")
	  String reportSavedMailFailed();
	
	/* 1509 */@DefaultStringValue("Report is saved and E-mailed successfully.")
	  String reportSavedMailed();
	
	/* 1510 */@DefaultStringValue("Counter Update")
	  String counterupdate();
	
	/* 1511 */@DefaultStringValue("Tray & Supply Update")
	  String supplyupdate();
	
	/* 1512 */@DefaultStringValue("Device Information Update")
	  String deviceinfoupdate();
	
	/* 1513 */@DefaultStringValue("Counter Update")
	  String counterupdatescheduled();
	
	/* 1514 */@DefaultStringValue("Status Update")
	  String statusupdatescheduled();
	
	/* 1515 */@DefaultStringValue("Supplies Update")
	  String suppliesupdatescheduled();
	
	/* 1516 */@DefaultStringValue("Basic Information Update")
	  String basicupdatescheduled();
	
	/* 1517 */@DefaultStringValue("Basic Information Update")
	  String basicupdate();
	
	/* 1518 */@DefaultStringValue("I-Fax")
	  String ifax();
	
	/* 1519 */@DefaultStringValue("Fax")
	  String fax();
	
	/* 1520 */@DefaultStringValue("Filing")
	  String filing();
	
	 /* 1521 */@DefaultStringValue("Others (Color)")
	  String othersColor();
	 
	 /* 1522 */@DefaultStringValue("Copy")
	  String copyReport();
	 
	 /* 1523 */@DefaultStringValue("Print")
	  String printReport();
	 
	 /* 1524 */@DefaultStringValue("Others (Job)")
	  String othersJob();
	 
	 /* 1525 */@DefaultStringValue("Please select atleast one device to send driver info via E-mail.")
	 String DeviceDriverEmailConfigWarning();
	
	 /* 1526 */@DefaultStringValue("Report download is failed")
	  String reportDownloadFailed();

	/* 1527 */@DefaultStringValue("Uploaded Date and Time")
	String fileUploadDateTime();
	
	 /* 1528 */@DefaultStringValue("Black-White")
	  String blackWhiteReport();
	 
	  /* 1529 */@DefaultStringValue("No devices are available for Report.")
	  String devicesDoesNotExistForReport();
	  
	  /* 1530 */@DefaultStringValue("Quick Status Update Mode")
	  String quickStatusUpdateMode();
	  
	  /* 1531 */@DefaultStringValue("Monitoring Interval Settings")
	  String monitoringIntervalSetting();
	  
	  /* 1532 */@DefaultStringValue("Monitoring Interval")
	  String monitoringInterval();
	  
	  /* 1533 */@DefaultStringValue("seconds")
	  String seconds();
	  
	  /* 1534 */@DefaultStringValue("Must be no more than 59.")
	  String lessThanSixty();

	  /* 1535 */@DefaultStringValue("Driver Name / Driver Id")
	  String driverNameAndId();
	  
	  /* 1536 */@DefaultStringValue("Note: SNMPv1 communication is required for each device.")
	  String snmpv1CommunicationNote();
	  
	  /* 1537 */@DefaultStringValue("Status")
	  String deviceStatusTab();
	  
	  /* 1538 */@DefaultStringValue("Status Update")
	  String quickstatusupdatescheduled();
	  
	  /* 1539 */@DefaultStringValue("Automatic Tray Selection")
	   String automaticTraySelection();  

	  /* 1540 */@DefaultStringValue("Auto Locked")
	  String locked();
	  
	  /* 1541 */@DefaultStringValue("Manually Locked")
	  String manualLocked();
	  
	  /* 1542 */@DefaultStringValue("Folding Unit")
	  String foldingUnit();
	  
	  /* 1543 */@DefaultStringValue("Bind to driver file")
	  String addbindingtodriver();
	  
	  /* 1543 */@DefaultStringValue("Unbind driver file")
	  String deletebindingtodriver();
	  
	  /* 1544 */@DefaultStringValue("Note:")
	  String driverInstallNote();
	  
	  /* 1545 */@DefaultStringValue("Please save the downloaded file to any folder in the root directory")
	  String driverInstallationNote();
	  
	  /* 1546 */@DefaultStringValue("(e.g: \"C:\\Drivers\") and execute it.")
	  String driverInstallDirExample();
	  
	  /* 1547 */@DefaultStringValue("The number of data is too huge to execute sorting.")
	  String ramSizeExceeded();
	  
	  /* 1548 */@DefaultStringValue("Waste Toner")
	  String disposalTonerTrouble();
	  
	  /* 1549 */@DefaultStringValue("AES")
	  String usmAesCfb128Protocol();
	  
	  /* 1550 */@DefaultStringValue("Driver information E-mailed successfully.")
	  String driverMailSuccess();
	  
	  /* 1551 */@DefaultStringValue("Unknown Devices")
	  String unknownDevices();
	  
	  /* 1552 */@DefaultStringValue("Discovery will be executed with large range of devices. Do you want to continue?")
	  String ipRangeCountMax();
	  
	  //output tray status
	  /* 1553 */@DefaultStringValue("Empty")
	  String trayStatusEmpty();
	  
	  /* 1554 */@DefaultStringValue("Not Empty")
	  String trayStatusNotEmpty();
	  
	  /* 1555 */@DefaultStringValue("4-Postcard Printed Sheet")
	  String quadPost();

	  /* 1556 */@DefaultStringValue("4-Postcard Printed Sheet")
	  String quadPostR();

	  /* 1557 */@DefaultStringValue("Chou40")
	  String chokei40();

	  /* 1558 */@DefaultStringValue("Chou40")
	  String chokei40R();
	  
	  /* 1559 */@DefaultStringValue("Can't select that many records at once.<br><br>Please try working in smaller batches.")
	  String selectionErrorMessage();
	  
	  /* 1560 */@DefaultStringValue("Closing Date")
	  String reportClosingDate();
	  
	  /* 1561 */@DefaultStringValue("Start Date")
	  String reportStartDate();
	  
	  /* 1562 */@DefaultStringValue("Note: Counter data is always retained for 14 months.<br>Operation log is retained for the period of Available Data setting (Minimum 1 month).<br>Report data is always retained for 12 months." )
	  String counterAndOperationlogData();
	  
	  /* 1563 */@DefaultStringValue("Other Supply Status")
	  String lifeInformation();
	  
	  /* 1564 */@DefaultStringValue("Supply Information")
	  String processItems();
	  
	  /* 1565 */@DefaultStringValue("Remaining Life")
	  String remainingLife();
	  
	  /* 1566 */@DefaultStringValue("UTC-12:00")
	  String utcMinus1200();
	  
	  /* 1567 */@DefaultStringValue("UTC-11:00")
	  String utcMinus1100();
	  
	  /* 1568 */@DefaultStringValue("UTC-10:00")
	  String utcMinus1000();
	  
	  /* 1569 */@DefaultStringValue("UTC-09:30")
	  String utcMinus0930();
	  
	  /* 1570 */@DefaultStringValue("UTC-09:00")
	  String utcMinus0900();
	  
	  /* 1571 */@DefaultStringValue("UTC-08:00")
	  String utcMinus0800();
	  
	  /* 1572 */@DefaultStringValue("UTC-07:00")
	  String utcMinus0700();
	  
	  /* 1573 */@DefaultStringValue("UTC-06:00")
	  String utcMinus0600();
	  
	  /* 1574 */@DefaultStringValue("UTC-05:00")
	  String utcMinus0500();
	  
	  /* 1575 */@DefaultStringValue("UTC-04:30")
	  String utcMinus0430();
	  
	  /* 1576 */@DefaultStringValue("UTC-04:00")
	  String utcMinus0400();
	  
	  /* 1577 */@DefaultStringValue("UTC-03:00")
	  String utcMinus0300();
	  
	  /* 1578 */@DefaultStringValue("UTC-02:00")
	  String utcMinus0200();
	  
	  /* 1579 */@DefaultStringValue("UTC-01:00")
	  String utcMinus0100();
	  
	  /* 1580 */@DefaultStringValue("UTC+00:00")
	  String utcPlus0000();
	  
	  /* 1581 */@DefaultStringValue("UTC+01:00")
	  String utcPlus0100();
	  
	  /* 1582 */@DefaultStringValue("UTC+02:00")
	  String utcPlus0200();
	  
	  /* 1583 */@DefaultStringValue("UTC+03:00")
	  String utcPlus0300();
	  
	  /* 1584 */@DefaultStringValue("UTC+04:00")
	  String utcPlus0400();
	  
	  /* 1585 */@DefaultStringValue("UTC+04:30")
	  String utcPlus0430();
	  
	  /* 1586 */@DefaultStringValue("UTC+05:00")
	  String utcPlus0500();
	  
	  /* 1587 */@DefaultStringValue("UTC+05:30")
	  String utcPlus0530();
	  
	  /* 1588 */@DefaultStringValue("UTC+06:00")
	  String utcPlus0600();
	  
	  /* 1589 */@DefaultStringValue("UTC+06:30")
	  String utcPlus0630();

	  /* 1590 */@DefaultStringValue("UTC+07:00")
	  String utcPlus0700();
	  
	  /* 1591 */@DefaultStringValue("UTC+08:00")
	  String utcPlus0800();

	  /* 1592 */@DefaultStringValue("UTC+09:00")
	  String utcPlus0900();

	  /* 1593 */@DefaultStringValue("UTC+09:30")
	  String utcPlus0930();

	  /* 1594 */@DefaultStringValue("UTC+10:00")
	  String utcPlus1000();

	  /* 1595 */@DefaultStringValue("UTC+11:00")
	  String utcPlus1100();

	  /* 1596 */@DefaultStringValue("UTC+11:30")
	  String utcPlus1130();

	  /* 1597 */@DefaultStringValue("UTC+12:00")
	  String utcPlus1200();
	  
	  /* 1598 */@DefaultStringValue("UTC+13:00")
	  String utcPlus1300();
	  
	  /* 1599 */@DefaultStringValue("UTC+14:00")
	  String utcPlus1400();
	  
	  /* 1600 */@DefaultStringValue("UTC")
	  String timezoneType();
	  
	  /* 1601 */@DefaultStringValue("Execute Date and Time")
	  String executeDateTime();
	  
	  /* 1602 */@DefaultStringValue("Expire")
	  String expire();
	  
	  /* 1603 */@DefaultStringValue("Operation Request")
	  String operationRequest();
	  
	 /* 1604 */@DefaultStringValue("Discovery is already in progress.")
	  String discoveryInprogress();

	 /* 1605 */@DefaultStringValue("Device Information Update is already in progress.")
	  String statusUpdateInprogress();
	 
	 /* 1606 */@DefaultStringValue("Discovery for")
	  String discoveryFor();
	 
	 /* 1607 */@DefaultStringValue("Year must be later than 2000.")
	  String dateMinValue();
	 
	 /* 1608 */@DefaultStringValue("Expiry time should be greater than Execute start time.")
	  String scheduleDateAndTimeRangeValidator();
	 
	 /* 1609 
	  * Don't Add to Message Files
	  * */@DefaultStringValue("Vendor")
		String report_Vendor();
	 
	 /* 1610 
	  * Don't Add to Message Files
	  * */@DefaultStringValue("End Date")
		String reportEndDate();
	  
	  /* 1611 */@DefaultStringValue("Set Policy Agent")
	  String setpolicy();
	  
	  
	  /* 1612 */@DefaultStringValue("Initial Setting Agent")
	  String initialsettingagent();
	  
	  
	  /* 1613 */@DefaultStringValue("Edit Schedule")
	  String changeschedule();
	  
	  
	  /* 1614 */@DefaultStringValue("Edit Schedule")
	  String effectiveschedule();
	  
	  /* 1615 */@DefaultStringValue("Change Device Discovery Condition")
	  String changesearchcondition();
	  
	  /* 1616 */@DefaultStringValue("Change Device Discovery Settings")
	  String itemchangesearchcondition();
	  
	  /* 1617 */@DefaultStringValue("Register Device")
	  String regsterdevice();
	  
	  /* 1618 */@DefaultStringValue("Schedule Name")
	  String schedulename();
	  
	  /* 1619 */@DefaultStringValue("Discovery Condition")
	  String searchconditionname();
	  
	  
	  /* 1620 */@DefaultStringValue("Device Discovery Settings")
	  String discoversettings();
	  
	  /* 1621 */@DefaultStringValue("Device Discovery Condition")
	  String discovercondition();
	  
	  /* 1622 */@DefaultStringValue("Device Status Update")
	  String devicestatus();
	  
	  /* 1623 */@DefaultStringValue("Device Information Update")
	  String deviceinfo();
	  
	  /* 1624 */@DefaultStringValue("Tray & Supply Update")
	  String suppliesupdate();
	  
	  /* 1625 */@DefaultStringValue("SNMPv3 Credential")
	  String snmpv3credential();
	  
	  /* 1626 */@DefaultStringValue("Quick Status Update")
	  String quickstatusupdate();
		
	  /* 1627 */@DefaultStringValue("SNMPv1 Credential")
	  String snmpv1credential();
	  
	  /* 1628 */@DefaultStringValue("Update Settings")
      String updateSettings();
	  
	  /* 1629 */@DefaultStringValue("Type:Device Discovery")
      String type_DeviceDiscovery();
	  
	  /* 1630 */@DefaultStringValue("Type:Status")
      String type_Status();
	  
	  /* 1631 */@DefaultStringValue("Type:Device Information")
      String type_DeviceInformation();
	  
	  /* 1632 */@DefaultStringValue("Type:Basic Information")
      String type_BasicInformation();
	  
	  /* 1633 */@DefaultStringValue("Type:Tray & Supply")
      String type_TrayAndSupply();
	  
	  /* 1634 */@DefaultStringValue("Type:Counter")
      String type_Counter();
	  
	  /* 1635 */@DefaultStringValue("Basic Information")
      String filterBasicInformation();
	  
	  /* 1636 */ @DefaultStringValue("Schedule")
	  String schedule();
	   	  
	  /* 1637 */ @DefaultStringValue("Date Range Usage Report")
	   String dataRangeUsageStatusReport();
	 
	  /* 1638 */ @DefaultStringValue("Date Range Usage Report Settings")
	  String dataRangeUsageStatusReportSetting();
	
	  /* 1639 */@DefaultStringValue("Execute")
	  String execute();
	
	  /* 1640 */@DefaultStringValue("Changed Schedule Name")
	  String changeScheduleName();
	 
	  /* 1641 */@DefaultStringValue("Enabled Schedule Name")
	  String enabledScheduleName();
	  
	  /* 1642 */@DefaultStringValue("Month")
	  String monthForReporting();
	  
	  /* 1643 */@DefaultStringValue("Report Mail Settings Update")
	  String reportmailsetting();
	  
	  /* 1644 */@DefaultStringValue("Start date should be less than one year(Maximum 366 days) from today.")
      String startDateOneYear();
	  
	  /* 1645 */@DefaultStringValue("Device Report")
		String devicereport();

		/* 1646 */@DefaultStringValue("Usage Status Report")
		String deviceusagereport();

		/* 1647 */@DefaultStringValue("Date Range Usage Report Save")
		String daterangeusagereportsave();

		/* 1648 */@DefaultStringValue("Date Range Usage Report E-mail")
		String daterangeusagereportemail();

		/* 1649 */@DefaultStringValue("Date Range Usage Report Delete")
		String daterangeusagereportdelete();

	  
}
