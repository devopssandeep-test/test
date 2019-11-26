{
  "common" : {
    "accessLog" : {
      "fromIpAddress" : null,
      "fromPage" : null,
      "fromService" : null,
      "fromUser" : null,
      "toService" : null
    },
    "agentCredential" : {
      "agentId" : null,
      "credentialKey" : null
    },
    "credential" : {
      "accountType" : null,
      "credentialKey" : null,
      "groupId" : null
    },
    "errorList" : [ ],
    "logInfoList" : [ ]
  },
  "count" : 100,
  "resultCount" : 1,
  "startIndex" : 1,
  "totalCount" : 1,
  "agentList" : [ {
    "agent" : {
      "agentId" : "1000",
      "groupList" : {
        "discoverSettings" : {
          "broadcast" : {
            "useFlag" : "false"
          },
          "ignoreIp" : {
            "useFlag" : "false"
          },
          "ipRange" : {
            "useFlag" : "false"
          },
          "specifiedIp" : {
            "ipList" : [ {
              "ipAddress" : {
                "type" : "ipv4",
                "value" : "172.29.240.40"
              }
            } ],
            "useFlag" : "true"
          }
        },
        "groupId" : "0"
      },
      "snmpCondition" : {
        "snmpV1" : {
          "conditionList" : [ {
            "condition" : {
              "community" : "public"
            }
          } ],
          "retry" : "5",
          "timeOut" : "5000",
          "useFlag" : "true"
        }
      }
    }
  } ]
}