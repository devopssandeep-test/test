<!DOCTYPE html>
<!-- The DOCTYPE declaration above will set the    -->
<!-- browser's rendering engine into               -->
<!-- "Standards Mode". Replacing this declaration  -->
<!-- with a "Quirks Mode" doctype may lead to some -->
<!-- differences in layout.                        -->
<%@page import="srdm.cloud.client.common.SVNRevision"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="srdm.cloud.client.common.WebUICookiesConfig"%>
<%@page import="java.util.Properties"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.File"%>
<%@page import="srdm.cloud.client.common.RegularExpression"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="srdm.cloud.client.common.WebUICookies"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="java.util.regex.Matcher"%>
<%@page import="java.nio.file.Path" %>
<%@page import="java.nio.file.Paths"%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=11,IE=10,IE=9,IE=8">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="java.util.Locale,java.text.DateFormat,java.util.Date,java.text.SimpleDateFormat,java.util.ArrayList,java.util.List,srdm.cloud.client.dataclass.group.Pair,srdm.cloud.client.view.language.LanguageInfo"%>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="format-detection" content="telephone=no">

 <%
   String realPath = getServletContext().getRealPath("/");
   File contextDir = new File(realPath);
   File webappsDir = contextDir.getParentFile();
   File confDir = new File(webappsDir.getParentFile(), "srdmConf");
   String websocketPort = null;
   InputStream inputStream;
   Properties properties;
	try {
		inputStream = new FileInputStream(confDir + File.separator + "srdmCustom.properties");
		properties = new Properties();
		properties.load(inputStream);
		String protocol = request.getScheme();
		websocketPort = (String) properties.get("webserver.http.privatePort");
		if (protocol.equalsIgnoreCase("https")) {
			websocketPort = (String) properties.get("webserver.https.privatePort");
		}
		request.setAttribute("protocol", protocol);
		request.setAttribute("websocketPort", websocketPort);
	} catch (IOException e) {
	  	
	}
%>
<!--                                                               -->
<!-- Consider inlining CSS to reduce the number of requested files -->
<!--                                                               -->
<link type="text/css" rel="stylesheet" href="<%=SVNRevision.SRDM_VERSION%>/WebUI.css">
<link rel="icon" href="<%=SVNRevision.SRDM_VERSION%>/images/common/favicon.ico">

<!--                                           -->
<!-- Any title is fine                         -->
<!--                                           -->
<title>SRDM</title>
<script>
	var isomorphicDir = "webui/sc/";
	function readCookie(name) {
		var nameEQ = name + "=";
		var ca = document.cookie.split(';');
		for ( var i = 0; i < ca.length; i++) {
			var c = ca[i];
			while (c.charAt(0) == ' ')
				c = c.substring(1, c.length);
			if (c.indexOf(nameEQ) == 0)
				return c.substring(nameEQ.length, c.length);
		}
		return null;
	}

	// Determine what skin file to load
	var privatePort = '<%= getServletConfig().getServletContext().getAttribute("privatePort") %>';
    var currentSkin = readCookie('skin_name_' + privatePort);

	if (currentSkin == null || currentSkin.length==0) {
		//Default theme has bean changed to "Graphite" in SRDM-2.3.3.
		currentSkin = "Graphite";
	}
	<!-- This webbscoket Url will be used in liveupdate.js file-->
	var protocolType = "ws://";
	var requestProtocol = '<%=(String) request.getAttribute("protocol") %>';
	if(requestProtocol === 'https') {
	   protocolType = "wss://"; 
	}
	var port = window.location.port;
	var wsUri = protocolType + "<%= getServletConfig().getServletContext().getAttribute("ipAddress") %>:<%=(String) request.getAttribute("websocketPort")%>/agentManager/liveMonitor";	
	</script>

<script type='text/javascript' data-cfasync='false'>
var meta = document.createElement('meta');
meta.setAttribute('name', 'gwt:property');
var cookieName = '<%=WebUICookies.locale.getCookieName()%>';
var cont = "locale="+ readCookie(cookieName);
meta.setAttribute('content', cont);

document.getElementsByTagName('head')[0].appendChild(meta);
</script>

<script type="text/javascript" src="liveupdate.js?version=<%=SVNRevision.SRDM_VERSION%>"></script>  
<!--                                           -->
<!-- This script loads your compiled module.   -->
<!-- If you add any GWT meta tags, they must   -->
<!-- be added before this line.                -->
<!--                                           -->
<!--<script>var isomorphicDir = "webui/sc/";</script>
	-->
<!--include the SC Core API-->
<script src='webui/sc/modules/ISC_Core.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>

<!--include SmartClient -->
<script src='webui/sc/modules/ISC_Foundation.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>
<script src='webui/sc/modules/ISC_Containers.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>
<script src='webui/sc/modules/ISC_Grids.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>
<script src='webui/sc/modules/ISC_Forms.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>
<script src='webui/sc/modules/ISC_RichTextEditor.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>
<script src='webui/sc/modules/ISC_Calendar.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>
<script src='webui/sc/modules/ISC_DataBinding.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>
<script src='webui/sc/modules/ISC_Drawing.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>
<script src='webui/sc/modules/ISC_Charts.js?version=<%=SVNRevision.SRDM_VERSION%>'></script>

<script type="text/javascript">
	document
			.write("<" + "script src=webui/sc/skins/"
			+ currentSkin + "/load_skin.js?version=<%=SVNRevision.SRDM_VERSION%>><"+"/script>");
</script>
<script type="text/javascript" language="javascript"
	src="webui/webui.nocache.js?version=<%=SVNRevision.SRDM_VERSION%>"></script>
<!--
    
 <script language=javascript>
		document.onkeydown = function() {

		if (window.event && window.event.keyCode == 116) { // Capture and remap F5
			alert("To refresh this window, click on header!!");
			window.event.keyCode = 505;
		}

		if (window.event && window.event.keyCode == 505) { // New action for F5
			return false;
			// Must return false or the browser will refresh anyway
		}
	}
</script> 
  -->
</head>

<!--                                           -->
<!-- The body can have arbitrary html, or      -->
<!-- you can leave the body empty if you want  -->
<!-- to create a completely dynamic UI.        -->
<!--                                           -->
<body>
	<%!public Map<String, String> propertiesMap;
		// Read the srdmCustom.properties file only once.
		public void jspInit() {
		String realPath = getServletContext().getRealPath("/");
		File contextDir = new File(realPath);
		File webappsDir = contextDir.getParentFile();
		File confDir = new File(webappsDir.getParentFile(), "srdmConf");
	    File[] files = confDir.listFiles();
	    String privatePort = null;
	    InputStream inputStream;
	    Properties properties;
	    for (File currentFile : files) {
		  if ("srdmCustom.properties".equals(currentFile.getName())) {
		    try {
		        inputStream = new FileInputStream(currentFile);
		        properties = new Properties(); 
			    properties.load(inputStream);
		    	privatePort = (String) properties.get("webserver.http.privatePort");
			    if (null == privatePort || privatePort.isEmpty()) {
			    	privatePort = (String) properties.get("webserver.https.privatePort");
			    }
                  ServletContext servletContext = getServletConfig().getServletContext();
                  servletContext.setAttribute("privatePort", privatePort);
		    } catch (IOException e) {
		    }
			WebUICookiesConfig.setPortNumber(privatePort);			    
		  } else if ("groupInfo.properties".equals(currentFile.getName())){
			try {
			    inputStream = new FileInputStream(currentFile);
			    properties = new Properties();
				properties.load(inputStream);
				propertiesMap = (Map)properties;
			} catch (IOException e) {
			}
		} 

	 }
	   //Read the Server IP from the controlpanel Properties and it will be used for Web Socket connection.
		try {
			//webappsDir=../SRDM/Svr/tomcat/webapps
			Path svrPath = Paths.get(webappsDir.getPath()).getParent().getParent();
			////svrPath=../SRDM/Svr
			File settingsPropfile = new File(
					svrPath.toString() + "/ControlPanel/_settings/ControlPanel-Settings.properties");
			inputStream = new FileInputStream(settingsPropfile);
			properties = new Properties();
			properties.load(inputStream);
			String serverip = (String) properties.get("settings.service.ipaddress");
			ServletContext servletContext = getServletConfig().getServletContext();
			servletContext.setAttribute("ipAddress", serverip);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}%>
	<%
 		out.append("<script type=\"text/javascript\">");
	    out.append("var privatePort =" + WebUICookiesConfig.getPortNumber() + ";");
	    out.append("</script>");
		if (request.getParameter(WebUICookies.sessionId.getOnlyCookieName()) != null) {
			addTOCookie(request,response, WebUICookies.sessionId.getCookieName(),
					request.getParameter(WebUICookies.sessionId.getOnlyCookieName()));
		}
		
		String domainIdParam = request.getParameter(WebUICookies.groupId.getOnlyCookieName());
		Pattern DOMAIN_ID_PATTERN=Pattern.compile(RegularExpression.DOMAIN_ID);
		if (domainIdParam != null && !domainIdParam.isEmpty()&&DOMAIN_ID_PATTERN.matcher(domainIdParam).find()){
		  addTOCookie(request,response, WebUICookies.groupId.getCookieName(), domainIdParam);
		}else if(domainIdParam != null){
			domainIdParam= Long.toString(System.currentTimeMillis());
			Long domainIdParamLong = Long.valueOf(domainIdParam);
			domainIdParam = domainIdParamLong.toString(); 
		  	addTOCookie(request,response, WebUICookies.groupId.getCookieName(), domainIdParam);
		}
		
		if (request.getParameter(WebUICookies.userName.getOnlyCookieName()) != null) {
	    addTOCookie(request, response, WebUICookies.userName.getCookieName(), request
	        .getParameter(WebUICookies.userName.getOnlyCookieName()));
	  }
		
		/* String groupIdParam = request.getParameter(WebUICookies.groupId.getOnlyCookieName());
		if (groupIdParam != null && !groupIdParam.isEmpty() &&
		      groupIdParam.matches(RegularExpression.GROUPID_STRPATTERN)) {
		  
		  Map<String, String> groupInfoMap = propertiesMap;
         groupIdParam = groupInfoMap.get(groupIdParam);
		 if(null==groupIdParam) 
			 groupIdParam= Long.toString(System.currentTimeMillis());
		  	Long groupIdParamLong = Long.valueOf(groupIdParam);
		  	groupIdParam = groupIdParamLong.toString(); 
		  	addTOCookie(request,response, WebUICookies.groupId.getCookieName(), groupIdParam);
		}
		else if (groupIdParam != null && !groupIdParam.isEmpty()&& groupIdParam.matches(RegularExpression.INTEGER_REGEX)){
			
			Long groupIdParamLong = Long.valueOf(groupIdParam);
		  	groupIdParam = groupIdParamLong.toString(); 
		  	addTOCookie(request,response, WebUICookies.groupId.getCookieName(), groupIdParam);
		}
		// Case:groupIdParam as  alpha numerics()
		else if (groupIdParam != null && !groupIdParam.isEmpty()&& !groupIdParam.matches(RegularExpression.INTEGER_REGEX)&&!groupIdParam.matches(RegularExpression.GROUPID_STRPATTERN)){
			groupIdParam= Long.toString(System.currentTimeMillis());
			Long groupIdParamLong = Long.valueOf(groupIdParam);
		  	groupIdParam = groupIdParamLong.toString(); 
		  	addTOCookie(request,response, WebUICookies.groupId.getCookieName(), groupIdParam);
		}
		// Case:groupIdParam as Special characters (groupIdParam will be "")
		else if(groupIdParam != null) {
			groupIdParam= Long.toString(System.currentTimeMillis());
			Long groupIdParamLong = Long.valueOf(groupIdParam);
		  	groupIdParam = groupIdParamLong.toString(); 
		  	addTOCookie(request,response, WebUICookies.groupId.getCookieName(), groupIdParam);
		}
		
		

		if (request.getParameter(WebUICookies.userName.getOnlyCookieName()) != null) {
			addTOCookie(request,response, WebUICookies.userName.getCookieName(),
					request.getParameter(WebUICookies.userName.getOnlyCookieName()));
		}
		addDatePattern(response, request);

		Locale cuurentLocale2 = request.getLocale(); */

		// this cookies are not using 
		// the list will updated in SRDM2.1 with number of contries   
	/* 	Set<String> countryList = new HashSet<String>();
		countryList.add("US");

		if (cuurentLocale2.getLanguage().equalsIgnoreCase("en")) {
			// For en, en-US, unit is inches
			for (String localCountry : countryList) {
				addCookieForUnitMeasurement(response, "Millimeter");
				if (cuurentLocale2.getCountry().equalsIgnoreCase(
						localCountry)
						|| cuurentLocale2.getCountry().isEmpty()) {

					addCookieForUnitMeasurement(response, "inches");
					return;

				}
			}
		} else {
			addCookieForUnitMeasurement(response, "Millimeter");
		} */
	%>

	<%!public void addDatePattern(HttpServletResponse response,
			HttpServletRequest request) {
		List<Pair<Locale, String>> localeList = new ArrayList<Pair<Locale, String>>();
		localeList.add(new Pair<Locale, String>(Locale.US, "MM/dd/yyyy"));
		localeList.add(new Pair<Locale, String>(Locale.JAPAN, "yyyy/MM/dd"));
		localeList.add(new Pair<Locale, String>(Locale.GERMAN, "dd/MM/yyyy"));
		localeList.add(new Pair<Locale, String>(Locale.FRENCH, "dd/MM/yyyy"));
		localeList.add(new Pair<Locale, String>(Locale.ITALY, "dd/MM/yyyy"));

		Locale cuurentLocale = request.getLocale();
		Pair<Locale, String> currentLocalePair = null;
		// this cookies are not using 
		/* for (Pair<Locale, String> locale : localeList) {
			if (locale.getFirst().getLanguage()
					.equals(cuurentLocale.getLanguage())) {
				currentLocalePair = locale;
				addCookie(response, locale.getSecond());
				return;
			}
		} */

		//getLanguage
		//sv Swedish 
		//es  Spanish 
		//nl  Dutch 

	/* 	if ("sv".equalsIgnoreCase(cuurentLocale.getLanguage())
				|| "es".equalsIgnoreCase(cuurentLocale.getLanguage())) {
			addCookie(response, "yyyy/MM/dd");
			return;
		} else if ("nl".equalsIgnoreCase(cuurentLocale.getLanguage())) {
			addCookie(response, "dd/MM/yyyy");
			return;
		}

		addCookie(response, "MM/dd/yyyy"); */
	}

	public void addTOCookie(HttpServletRequest request,HttpServletResponse response, String name,
			String value) {
		Cookie UnitMeasurementCookie = new Cookie(name, value);
		StringBuffer sb=new StringBuffer();
		
		if(request.getRequestURL().toString().contains("http://")){
			UnitMeasurementCookie.setSecure(false);
		}
		else {
			UnitMeasurementCookie.setSecure(true);
		}
	
		
		response.addCookie(UnitMeasurementCookie);

	}
	
	// this cookies are not using 
/* 	public void addCookie(HttpServletResponse response, String pattern) {
		Cookie patternCookie = new Cookie("pattern", pattern);
		response.addCookie(patternCookie);
	}

	public void addCookieForUnitMeasurement(HttpServletResponse response,
			String UnitMeasurement) {
		Cookie UnitMeasurementCookie = new Cookie("UnitMeasurement",
				UnitMeasurement);
		

		response.addCookie(UnitMeasurementCookie);

	} */
	%>
	<!-- OPTIONAL: include this if you want history support -->
	<iframe src="javascript:''" id="__gwt_historyFrame" tabIndex='-1'
		style="position: absolute; width: 0; height: 0; border: 0"></iframe>

	<!-- RECOMMENDED if your web app will not function without JavaScript enabled -->
	<noscript>
		<div
			style="width: 22em; position: absolute; left: 50%; margin-left: -11em; color: red; background-color: white; border: 1px solid red; padding: 4px; font-family: sans-serif">
			Your web browser must have JavaScript enabled in order for this
			application to display correctly.</div>
	</noscript>
</body>
</html>
