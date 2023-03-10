package com.example.demoapi

import com.google.gson.annotations.SerializedName

data class Brief (
    @SerializedName("id"                      ) var id                      : String? = null,
    @SerializedName("procedureId"             ) var procedureId             : Int?    = null,
    @SerializedName("title"                   ) var title                   : String? = null,
    @SerializedName("code"                    ) var code                    : String? = null,
    @SerializedName("senderName"              ) var senderName              : String? = null,
    @SerializedName("senderCode"              ) var senderCode              : String? = null,
    @SerializedName("senderCodeType"          ) var senderCodeType          : Int?    = null,
    @SerializedName("senderAddress"           ) var senderAddress           : String? = null,
    @SerializedName("senderEmail"             ) var senderEmail             : String? = null,
    @SerializedName("senderTel"               ) var senderTel               : String? = null,
    @SerializedName("senderIsOwner"           ) var senderIsOwner           : Int?    = null,
    @SerializedName("senderProvinceId"        ) var senderProvinceId        : String? = null,
    @SerializedName("senderProvinceName"      ) var senderProvinceName      : String? = null,
    @SerializedName("senderDistrictId"        ) var senderDistrictId        : String? = null,
    @SerializedName("senderDistrictName"      ) var senderDistrictName      : String? = null,
    @SerializedName("senderCommuneId"         ) var senderCommuneId         : String? = null,
    @SerializedName("senderCommuneName"       ) var senderCommuneName       : String? = null,
    @SerializedName("ownerType"               ) var ownerType               : Int?    = null,
    @SerializedName("ownerName"               ) var ownerName               : String? = null,
    @SerializedName("ownerAddress"            ) var ownerAddress            : String? = null,
    @SerializedName("ownerEmail"              ) var ownerEmail              : String? = null,
    @SerializedName("ownerTel"                ) var ownerTel                : String? = null,
    @SerializedName("ownerProvinceId"         ) var ownerProvinceId         : String? = null,
    @SerializedName("ownerProvinceName"       ) var ownerProvinceName       : String? = null,
    @SerializedName("ownerDistrictId"         ) var ownerDistrictId         : String? = null,
    @SerializedName("ownerDistrictName"       ) var ownerDistrictName       : String? = null,
    @SerializedName("ownerCommuneId"          ) var ownerCommuneId          : String? = null,
    @SerializedName("ownerCommuneName"        ) var ownerCommuneName        : String? = null,
    @SerializedName("procedureCode"           ) var procedureCode           : String? = null,
    @SerializedName("note"                    ) var note                    : String? = null,
    @SerializedName("statusId"                ) var statusId                : String? = null,
    @SerializedName("statusName"              ) var statusName              : String? = null,
    @SerializedName("sendTime"                ) var sendTime                : Double?    = null,
    @SerializedName("receiptTime"             ) var receiptTime             : Double?    = null,
    @SerializedName("promiseTime"             ) var promiseTime             : Double?    = null,
    @SerializedName("receiveType"             ) var receiveType             : Double?    = null,
    @SerializedName("deadlineDay"             ) var deadlineDay             : Int?    = null,
    @SerializedName("receiveServiceId"        ) var receiveServiceId        : String? = null,
    @SerializedName("receiveServiceName"      ) var receiveServiceName      : String? = null,
    @SerializedName("receiveAddress"          ) var receiveAddress          : String? = null,
    @SerializedName("receiveTel"              ) var receiveTel              : String? = null,
    @SerializedName("receivePostId"           ) var receivePostId           : String? = null,
    @SerializedName("receivePostName"         ) var receivePostName         : String? = null,
    @SerializedName("isActive"                ) var isActive                : Int?    = null,
    @SerializedName("isDelete"                ) var isDelete                : Int?    = null,
    @SerializedName("createTime"              ) var createTime              : Double?    = null,
    @SerializedName("userCreateId"            ) var userCreateId            : Int?    = null,
    @SerializedName("updateTime"              ) var updateTime              : Double?    = null,
    @SerializedName("userUpdateId"            ) var userUpdateId            : Int?    = null,
    @SerializedName("extendTime"              ) var extendTime              : Double? = null,
    @SerializedName("releaseTime"             ) var releaseTime             : Double? = null,
    @SerializedName("finishTime"              ) var finishTime              : Double? = null,
    @SerializedName("subStatusId"             ) var subStatusId             : String? = null,
    @SerializedName("subStatusName"           ) var subStatusName           : String? = null,
    @SerializedName("bookNumber"              ) var bookNumber              : String? = null,
    @SerializedName("ownerCode"               ) var ownerCode               : String? = null,
    @SerializedName("deptId"                  ) var deptId                  : Int?    = null,
    @SerializedName("deptName"                ) var deptName                : String? = null,
    @SerializedName("barCodeAttachmentId"     ) var barCodeAttachmentId     : String? = null,
    @SerializedName("qrCodeAttachmentId"      ) var qrCodeAttachmentId      : String? = null,
    @SerializedName("stepToStepId"            ) var stepToStepId            : String? = null,
    @SerializedName("flowId"                  ) var flowId                  : String? = null,
    @SerializedName("objectType"              ) var objectType              : String? = null,
    @SerializedName("sendType"                ) var sendType                : Int?    = null,
    @SerializedName("processSenderId"         ) var processSenderId         : Int?    = null,
    @SerializedName("processSenderName"       ) var processSenderName       : String? = null,
    @SerializedName("processSenderRoleId"     ) var processSenderRoleId     : Int?    = null,
    @SerializedName("processSenderRoleName"   ) var processSenderRoleName   : String? = null,
    @SerializedName("processSenderDeptId"     ) var processSenderDeptId     : Int?    = null,
    @SerializedName("processSenderDeptName"   ) var processSenderDeptName   : String? = null,
    @SerializedName("processReceiverId"       ) var processReceiverId       : Int?    = null,
    @SerializedName("processReceiverName"     ) var processReceiverName     : String? = null,
    @SerializedName("processReceiverRoleId"   ) var processReceiverRoleId   : Int?    = null,
    @SerializedName("processReceiverRoleName" ) var processReceiverRoleName : String? = null,
    @SerializedName("processReceiverDeptId"   ) var processReceiverDeptId   : Int?    = null,
    @SerializedName("processReceiverDeptName" ) var processReceiverDeptName : String? = null,
    @SerializedName("processSendTime"         ) var processSendTime         : Double?    = null,
    @SerializedName("isRead"                  ) var isRead                  : Int?    = null,
    @SerializedName("readTime"                ) var readTime                : Double?    = null,
    @SerializedName("totalMinuteDone"         ) var totalMinuteDone         : String? = null,
    @SerializedName("isComplete"              ) var isComplete              : Int?    = null,
    @SerializedName("completeTime"            ) var completeTime            : String? = null,
    @SerializedName("processTransactionId"    ) var processTransactionId    : String? = null,
    @SerializedName("deadline"                ) var deadline                : Double?    = null,
    @SerializedName("processStatusName"       ) var processStatusName       : String? = null,
    @SerializedName("processSubStatusName"    ) var processSubStatusName    : String? = null,
    @SerializedName("processStatusId"         ) var processStatusId         : String? = null,
    @SerializedName("processSubStatusId"      ) var processSubStatusId      : String? = null,
    @SerializedName("areaId"                  ) var areaId                  : String? = null,
    @SerializedName("areaName"                ) var areaName                : String? = null,
    @SerializedName("flagCitizen"             ) var flagCitizen             : Int?    = null,
    @SerializedName("processType"             ) var processType             : String? = null,
    @SerializedName("esbCapSoStatus"          ) var esbCapSoStatus          : String? = null,
    @SerializedName("esbCapSoNumber"          ) var esbCapSoNumber          : String? = null,
    @SerializedName("esbReasonTuChoiCapSo"    ) var esbReasonTuChoiCapSo    : String? = null

)