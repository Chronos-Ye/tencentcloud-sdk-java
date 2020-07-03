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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGameServerSessionQueuesRequest extends AbstractModel{

    /**
    * 游戏服务器会话队列数组
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
    * 要返回的最大结果数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 游戏服务器会话队列数组 
     * @return Names 游戏服务器会话队列数组
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 游戏服务器会话队列数组
     * @param Names 游戏服务器会话队列数组
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    /**
     * Get 要返回的最大结果数 
     * @return Limit 要返回的最大结果数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 要返回的最大结果数
     * @param Limit 要返回的最大结果数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移 
     * @return Offset 偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移
     * @param Offset 偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Names.", this.Names);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

