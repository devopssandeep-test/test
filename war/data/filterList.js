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
	"resultCount": 2,
	"startIndex": 1,
	"totalCount": 2,
	"filterList":[
		{"filter":{"filterId":"GN/0/0","filterType":"system","filterName":"ErrorDevice","blockOperation":"and","blockConditionList":[{"blockCondition":{"detailOperation":"or","detailConditionList":[{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/printerError"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/accountLimit"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/overduePreventMaintenance"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/paperJam"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/markerSupplyMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/tonerEmpty"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/coverOpen"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/paperEmpty"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/specifiedInputTrayEmpty"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/specifiedInputTrayMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/specifiedOutputTrayMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/allOutputTrayFull"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/stackerNotInstalled"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/offline"}}]}}]}},
		{"filter":{"filterId":"GN/0/1","filterType":"system","filterName":"WarningDevice","blockOperation":"and","blockConditionList":[{"blockCondition":{"detailOperation":"or","detailConditionList":[{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/inputTrayMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/printerWarning"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/tonerLow"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/paperLow"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/outputTrayFull"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/outputTrayNearFull"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/outputTrayMissing"}},{"detailCondition":{"column":"status","operationId":"equal","valueString":"device/statusSet/nearOverduePreventMaintenance"}}]}}]}}
	]
}