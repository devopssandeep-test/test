	var ws = null;
	function registerForNotifications(request) {
		console.log("Registering...");
		
		if (ws == null) {
			ws = new WebSocket(wsUri);
			console.log("Registered");
			ws.onopen = function() {
				console.log("ws connection opened!")
				 ws.send(request);
				 console.log("First request sent..!")
			} 

			ws.onmessage = function(msg) {
				console.log("received message:");
				console.log(msg.data);
				window.getData(JSON.parse(msg.data));
			}
		}
		
		if(ws != null) {
		var readyState = ws.readyState;
		console.log("ws readyState..." + readyState);
		if(readyState == 1) {
			  console.log("ws session is alive...");
		      ws.send(request);
		      console.log("Start notifications request sent..");
			  console.log(request);
			}
		}
	}
	function stopNotifications(request){
		if(ws != null) {
			console.log("Stop notifications request on Group Tab close.." +request );
			ws.send(request);
		}
	}
	
	function unregisterForNotifications(request) {
		console.log("unregistering.." + request);
		if (ws != null) {
			ws.close();
			ws = null;
			console.log("Unregistered.");
		}
	}