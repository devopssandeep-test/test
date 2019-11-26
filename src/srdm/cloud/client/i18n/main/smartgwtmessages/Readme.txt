Steps to override smartGWT messages :

	1)	Extract smartGWTpro.jar
	
	2)	Find appropriate key and value pair in SmartGwtMessages.properties (com\smartgwt\client\i18n)
		Note : we can find more then values SmartGwtMessages.properties.
		
	3)	find the method ( search with key )in SmartGwtMessages.java to override.
	
	4)	override that method SmartGWTWebUIConstants.java with same format(ID).
	
	5)	 Add same string in GlobalDictionary_WebUI.xls.
	
	6)	Add same string in 8 properties files with key and value combination value must be in its language format
	  
	7)	Generate xls sheet using i18builder tool (how to use i18 builder you can find in its readme.text file )
