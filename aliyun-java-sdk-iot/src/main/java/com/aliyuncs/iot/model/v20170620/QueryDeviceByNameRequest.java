/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.iot.model.v20170620;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceByNameRequest extends RoaAcsRequest<QueryDeviceByNameResponse> {
	
	public QueryDeviceByNameRequest() {
		super("Iot", "2017-06-20", "QueryDeviceByName");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/queryDeviceByName/[DeviceName]/[ProductKey]");
		setMethod(MethodType.GET);
	}

	private String deviceName;

	private String productKey;

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		putPathParameter("DeviceName", deviceName);
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		putPathParameter("ProductKey", productKey);
	}

	@Override
	public Class<QueryDeviceByNameResponse> getResponseClass() {
		return QueryDeviceByNameResponse.class;
	}

}
