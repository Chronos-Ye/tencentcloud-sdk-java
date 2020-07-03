/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditConfigResponse extends AbstractModel{

    /**
    * 审计日志保存时长。目前支持的值包括：[0，30，180，365，1095，1825]。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogExpireDay")
    @Expose
    private Long LogExpireDay;

    /**
    * 审计日志存储类型。目前支持的值包括："storage" - 存储型。
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 审计日志保存时长。目前支持的值包括：[0，30，180，365，1095，1825]。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogExpireDay 审计日志保存时长。目前支持的值包括：[0，30，180，365，1095，1825]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogExpireDay() {
        return this.LogExpireDay;
    }

    /**
     * Set 审计日志保存时长。目前支持的值包括：[0，30，180，365，1095，1825]。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogExpireDay 审计日志保存时长。目前支持的值包括：[0，30，180，365，1095，1825]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogExpireDay(Long LogExpireDay) {
        this.LogExpireDay = LogExpireDay;
    }

    /**
     * Get 审计日志存储类型。目前支持的值包括："storage" - 存储型。 
     * @return LogType 审计日志存储类型。目前支持的值包括："storage" - 存储型。
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 审计日志存储类型。目前支持的值包括："storage" - 存储型。
     * @param LogType 审计日志存储类型。目前支持的值包括："storage" - 存储型。
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogExpireDay", this.LogExpireDay);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

