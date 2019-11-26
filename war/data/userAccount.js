{
	"common": {
		"accessLog": {
			"fromIpAddress": null,
			"fromPage": null,
			"fromService": null,
			"fromUser": null,
			"toService": null
		},
		"agentCredential": {
			"agentId": null,
			"credentialKey": null
		},
		"credential": {
			"accountType": null,
			"credentialKey": null,
			"groupId": null
		},
		"errorList": [],
		"logInfoList": []
	},
	"count": 100,
	"resultCount": 1,
	"startIndex": 1,
	"totalCount": 1,
	"resultData":[
		{"organizationInfo":{"timeZone":"Etc/UTC","accountList":[{"account":{"accountType":"10","enableFlag":"true","password":"root","permissionSet":{"agentSettings":"true","deviceSettings":"true","groupSettings":"true","filterSettings":"true","serviceSettings":"true"}}},{"account":{"accountType":"30","enableFlag":"true","password":"root","permissionSet":{"agentSettings":"false","deviceSettings":"false","groupSettings":"false","filterSettings":"false","serviceSettings":"false"}}}],"statusCondition":{"conditionSet":{"noResponse":{"dispErrorLevel":"error","priority":"0"},"printerError":{"dispErrorLevel":"error","priority":"1"},"accountLimit":{"dispErrorLevel":"error","priority":"2"},"overduePreventMaintenance":{"dispErrorLevel":"error","priority":"3"},"paperJam":{"dispErrorLevel":"error","priority":"4"},"markerSupplyMissing":{"dispErrorLevel":"error","priority":"5"},"tonerEmpty":{"dispErrorLevel":"error","priority":"6"},"coverOpen":{"dispErrorLevel":"error","priority":"7"},"paperEmpty":{"dispErrorLevel":"error","priority":"8"},"specifiedInputTrayEmpty":{"dispErrorLevel":"error","priority":"9"},"specifiedInputTrayMissing":{"dispErrorLevel":"error","priority":"10"},"specifiedOutputTrayMissing":{"dispErrorLevel":"error","priority":"11"},"allOutputTrayFull":{"dispErrorLevel":"error","priority":"12"},"stackerNotInstalled":{"dispErrorLevel":"error","priority":"13"},"offline":{"dispErrorLevel":"error","priority":"14"},"inputTrayMissing":{"dispErrorLevel":"warning","priority":"15"},"printerWarning":{"dispErrorLevel":"warning","priority":"16"},"tonerLow":{"dispErrorLevel":"warning","priority":"17"},"paperLow":{"dispErrorLevel":"warning","priority":"18"},"outputTrayFull":{"dispErrorLevel":"warning","priority":"19"},"outputTrayNearFull":{"dispErrorLevel":"warning","priority":"20"},"outputTrayMissing":{"dispErrorLevel":"warning","priority":"21"},"nearOverduePreventMaintenance":{"dispErrorLevel":"warning","priority":"22"},"standby":{"dispErrorLevel":"normal","priority":"23"},"warmUp":{"dispErrorLevel":"normal","priority":"24"},"printing":{"dispErrorLevel":"normal","priority":"25"},"online":{"dispErrorLevel":"normal","priority":"26"}},"remainingAmountSet":{"paper":{"level1":"0","level2":"25","level3":"50","level4":"75","level5":"100"},"toner":{"level1":"0","level2":"25","level3":"50","level4":"75","level5":"100"}}},"filterList":[{"filter":{"filterId":"GN/0/0","filterType":"system","filterName":"ErrorDevice","blockOperation":"and","blockConditionList":[{"blockCondition":{"detailOperation":"or","detailConditionList":[{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/printerError"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/accountLimit"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/overduePreventMaintenance"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/paperJam"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/markerSupplyMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/tonerEmpty"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/coverOpen"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/paperEmpty"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/specifiedInputTrayEmpty"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/specifiedInputTrayMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/specifiedOutputTrayMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/allOutputTrayFull"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/stackerNotInstalled"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/offline"}}]}}]}},{"filter":{"filterId":"GN/0/1","filterType":"system","filterName":"WarningDevice","blockOperation":"and","blockConditionList":[{"blockCondition":{"detailOperation":"or","detailConditionList":[{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/inputTrayMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/printerWarning"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/tonerLow"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/paperLow"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/outputTrayFull"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/outputTrayNearFull"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/outputTrayMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/nearOverduePreventMaintenance"}}]}}]}}],"groupDeviceMax":"99"}}
	]
}