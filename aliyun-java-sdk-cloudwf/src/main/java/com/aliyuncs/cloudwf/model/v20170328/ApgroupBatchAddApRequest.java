/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ApgroupBatchAddApRequest extends RpcAcsRequest<ApgroupBatchAddApResponse> {
	
	public ApgroupBatchAddApRequest() {
		super("cloudwf", "2017-03-28", "ApgroupBatchAddAp", "cloudwf");
	}

	private String apAssetIds;

	private Long apgroupId;

	public String getApAssetIds() {
		return this.apAssetIds;
	}

	public void setApAssetIds(String apAssetIds) {
		this.apAssetIds = apAssetIds;
		if(apAssetIds != null){
			putQueryParameter("ApAssetIds", apAssetIds);
		}
	}

	public Long getApgroupId() {
		return this.apgroupId;
	}

	public void setApgroupId(Long apgroupId) {
		this.apgroupId = apgroupId;
		if(apgroupId != null){
			putQueryParameter("ApgroupId", apgroupId.toString());
		}
	}

	@Override
	public Class<ApgroupBatchAddApResponse> getResponseClass() {
		return ApgroupBatchAddApResponse.class;
	}

}
