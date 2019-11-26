package srdm.cloud.client;

import srdm.cloud.client.common.LocalizedStringKey;
import srdm.cloud.client.common.ResourceString;
import srdm.cloud.client.common.WebUICookiesConfig;
import srdm.cloud.client.i18n.main.smartgwtmessages.SmartGWTWebUIMessages;
import srdm.cloud.client.i18n.main.webuimessages.WebUIConstants;
import srdm.cloud.client.sso.WebUISession;
import srdm.cloud.client.view.MainWindowView;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.smartgwt.client.data.DSRequest;
import com.smartgwt.client.data.DSResponse;
import com.smartgwt.client.rpc.HandleErrorCallback;
import com.smartgwt.client.rpc.HandleTransportErrorCallback;
import com.smartgwt.client.rpc.RPCManager;
import com.smartgwt.client.util.I18nUtil;
import com.smartgwt.client.util.SC;


public class WebUI implements EntryPoint {
	

    @Override
	public void onModuleLoad() {
    //MainWindowView.deviceCountUpdate();	
    String privatePort = getJsStringFromJsp("privatePort");
    WebUICookiesConfig.setPortNumber(privatePort);

    SmartGWTWebUIMessages customizedMessages = GWT
    			.create(SmartGWTWebUIMessages.class);
    I18nUtil.initMessages(customizedMessages);
    
    WebUIConstants constants = GWT.create(WebUIConstants.class);
    ResourceString.getInstance();
	ResourceString.setConstantsWithLookup(constants);
	//artf6469 following will handle the transport error message popup
	RPCManager.setHandleTransportErrorCallback(new HandleTransportErrorCallback() {
		
		@Override
		public void handleTransportError(int transactionNum, int status, int httpResponseCode, String httpResponseText) {
			
			
		}
	});
	
		RPCManager.setHandleErrorCallback(new HandleErrorCallback() {

			@Override
			public void handleError(DSResponse response, DSRequest request) {
			  //Issue : Bug#1772 [WebUI]: Agent installer download error is not displayed
			  //Fix : If Http status code is not 200 then "Unable to communicate with server." message will be displayed.
			  if(response.getHttpResponseCode()!=200)
			  {
			    com.smartgwt.client.util.SC.clearPrompt();
			    SC.warn(ResourceString.getInstance().getLocalizedString(LocalizedStringKey.getInstance().getUnableToCommunicateWithServer()));
			    WebUISession.showLoginPage();
			  }		  
			 
				
				
//				srdm.cloud.client.WebUI webui = new srdm.cloud.client.WebUI(); 
//
//				// artf8165 : [SSDI#450] Discovery goes endless, If server is not reachable
//				// 
//				// c.	Proposal: UI can check the response of 'checkProgress' and if server is not reachable, UI can reload the page and 
//				// "Unable to Reach Server" or some other error page can be shown to the end user. 
//				if (!webui.isLogout()) {
////					SC.warn(ResourceString.getConstants()
////							.unableToCommunicateWithServer(),
////							new BooleanCallback() {
////								@Override
////								public void execute(Boolean value) {
//					
//					//TODO: 
//					//webui.logout();
////								}
////							});
//				} else {
//					WebUISession.showLoginPage();
//				}
			}// End of Handle Error

		});
	WebUISession checkLoginSession = new WebUISession();
	checkLoginSession.checkSession();
    }
    
    public static native String getJsStringFromJsp(String jsString) /*-{
	    return $wnd[jsString];
	  }-*/;
  
}