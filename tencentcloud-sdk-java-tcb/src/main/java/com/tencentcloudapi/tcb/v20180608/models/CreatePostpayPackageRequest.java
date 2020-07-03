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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePostpayPackageRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 微信 AppId，微信必传
    */
    @SerializedName("WxAppId")
    @Expose
    private String WxAppId;

    /**
    * 付费来源
<li>miniapp</li>
<li>qcloud</li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
    */
    @SerializedName("FreeQuota")
    @Expose
    private String FreeQuota;

    /**
    * 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 环境创建来源，取值：
<li>miniapp</li>
<li>qcloud</li>
用法同CreateEnv接口的Source参数
和 Channel 参数同时传，或者同时不传；EnvId 为空时必传。
    */
    @SerializedName("EnvSource")
    @Expose
    private String EnvSource;

    /**
    * 如果envsource为miniapp, channel可以为ide或api;
如果envsource为qcloud, channel可以为qc_console,cocos, qq, cloudgame,dcloud
和 EnvSource 参数同时传，或者同时不传；EnvId 为空时必传。
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 微信 AppId，微信必传 
     * @return WxAppId 微信 AppId，微信必传
     */
    public String getWxAppId() {
        return this.WxAppId;
    }

    /**
     * Set 微信 AppId，微信必传
     * @param WxAppId 微信 AppId，微信必传
     */
    public void setWxAppId(String WxAppId) {
        this.WxAppId = WxAppId;
    }

    /**
     * Get 付费来源
<li>miniapp</li>
<li>qcloud</li> 
     * @return Source 付费来源
<li>miniapp</li>
<li>qcloud</li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 付费来源
<li>miniapp</li>
<li>qcloud</li>
     * @param Source 付费来源
<li>miniapp</li>
<li>qcloud</li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。 
     * @return FreeQuota 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     */
    public String getFreeQuota() {
        return this.FreeQuota;
    }

    /**
     * Set 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     * @param FreeQuota 用户享有的免费额度级别，目前只能为“basic”，不传该字段或该字段为空，标识不享受免费额度。
     */
    public void setFreeQuota(String FreeQuota) {
        this.FreeQuota = FreeQuota;
    }

    /**
     * Get 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符 
     * @return Alias 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     * @param Alias 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 环境创建来源，取值：
<li>miniapp</li>
<li>qcloud</li>
用法同CreateEnv接口的Source参数
和 Channel 参数同时传，或者同时不传；EnvId 为空时必传。 
     * @return EnvSource 环境创建来源，取值：
<li>miniapp</li>
<li>qcloud</li>
用法同CreateEnv接口的Source参数
和 Channel 参数同时传，或者同时不传；EnvId 为空时必传。
     */
    public String getEnvSource() {
        return this.EnvSource;
    }

    /**
     * Set 环境创建来源，取值：
<li>miniapp</li>
<li>qcloud</li>
用法同CreateEnv接口的Source参数
和 Channel 参数同时传，或者同时不传；EnvId 为空时必传。
     * @param EnvSource 环境创建来源，取值：
<li>miniapp</li>
<li>qcloud</li>
用法同CreateEnv接口的Source参数
和 Channel 参数同时传，或者同时不传；EnvId 为空时必传。
     */
    public void setEnvSource(String EnvSource) {
        this.EnvSource = EnvSource;
    }

    /**
     * Get 如果envsource为miniapp, channel可以为ide或api;
如果envsource为qcloud, channel可以为qc_console,cocos, qq, cloudgame,dcloud
和 EnvSource 参数同时传，或者同时不传；EnvId 为空时必传。 
     * @return Channel 如果envsource为miniapp, channel可以为ide或api;
如果envsource为qcloud, channel可以为qc_console,cocos, qq, cloudgame,dcloud
和 EnvSource 参数同时传，或者同时不传；EnvId 为空时必传。
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 如果envsource为miniapp, channel可以为ide或api;
如果envsource为qcloud, channel可以为qc_console,cocos, qq, cloudgame,dcloud
和 EnvSource 参数同时传，或者同时不传；EnvId 为空时必传。
     * @param Channel 如果envsource为miniapp, channel可以为ide或api;
如果envsource为qcloud, channel可以为qc_console,cocos, qq, cloudgame,dcloud
和 EnvSource 参数同时传，或者同时不传；EnvId 为空时必传。
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "WxAppId", this.WxAppId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "FreeQuota", this.FreeQuota);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "EnvSource", this.EnvSource);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

