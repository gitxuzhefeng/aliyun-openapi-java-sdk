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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackResponse;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackResponse.BuildpacksItem;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackResponse.BuildpacksItem.SupportedOsItem;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackResponse.BuildpacksItem.SupportedRegionsListItem;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackResponse.BuildpacksItem.SupportedRegionsListItem.Region;
import com.aliyuncs.sofa.model.v20190815.DescribeBuildpackResponse.BuildpacksItem.Techstack;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBuildpackResponseUnmarshaller {

	public static DescribeBuildpackResponse unmarshall(DescribeBuildpackResponse describeBuildpackResponse, UnmarshallerContext _ctx) {
		
		describeBuildpackResponse.setRequestId(_ctx.stringValue("DescribeBuildpackResponse.RequestId"));
		describeBuildpackResponse.setResultCode(_ctx.stringValue("DescribeBuildpackResponse.ResultCode"));
		describeBuildpackResponse.setResultMessage(_ctx.stringValue("DescribeBuildpackResponse.ResultMessage"));
		describeBuildpackResponse.setCurrentPage(_ctx.longValue("DescribeBuildpackResponse.CurrentPage"));
		describeBuildpackResponse.setPageSize(_ctx.longValue("DescribeBuildpackResponse.PageSize"));
		describeBuildpackResponse.setTotalCount(_ctx.longValue("DescribeBuildpackResponse.TotalCount"));

		List<BuildpacksItem> buildpacks = new ArrayList<BuildpacksItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBuildpackResponse.Buildpacks.Length"); i++) {
			BuildpacksItem buildpacksItem = new BuildpacksItem();
			buildpacksItem.setAppServiceCount(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].AppServiceCount"));
			buildpacksItem.setBuildCommand(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].BuildCommand"));
			buildpacksItem.setContactInfo(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].ContactInfo"));
			buildpacksItem.setCreatedFrom(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].CreatedFrom"));
			buildpacksItem.setCreationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].CreationTime"));
			buildpacksItem.setDebugMode(_ctx.booleanValue("DescribeBuildpackResponse.Buildpacks["+ i +"].DebugMode"));
			buildpacksItem.setDepracationNote(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].DepracationNote"));
			buildpacksItem.setDescription(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Description"));
			buildpacksItem.setExtraInfo(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].ExtraInfo"));
			buildpacksItem.setFullVersion(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].FullVersion"));
			buildpacksItem.setId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Id"));
			buildpacksItem.setIndustryLabel(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].IndustryLabel"));
			buildpacksItem.setMajorVersion(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].MajorVersion"));
			buildpacksItem.setMinorVersion(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].MinorVersion"));
			buildpacksItem.setModificationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].ModificationTime"));
			buildpacksItem.setOriginType(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].OriginType"));
			buildpacksItem.setPatchVersion(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].PatchVersion"));
			buildpacksItem.setPublicationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].PublicationTime"));
			buildpacksItem.setPublicationTimeDate(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].PublicationTimeDate"));
			buildpacksItem.setScope(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Scope"));
			buildpacksItem.setStatus(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Status"));
			buildpacksItem.setTechstackId(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].TechstackId"));
			buildpacksItem.setTenantId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].TenantId"));

			List<String> availableTenantNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackResponse.Buildpacks["+ i +"].AvailableTenantNames.Length"); j++) {
				availableTenantNames.add(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].AvailableTenantNames["+ j +"]"));
			}
			buildpacksItem.setAvailableTenantNames(availableTenantNames);

			List<String> creationChain = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackResponse.Buildpacks["+ i +"].CreationChain.Length"); j++) {
				creationChain.add(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].CreationChain["+ j +"]"));
			}
			buildpacksItem.setCreationChain(creationChain);

			List<String> supportedRegions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegions.Length"); j++) {
				supportedRegions.add(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegions["+ j +"]"));
			}
			buildpacksItem.setSupportedRegions(supportedRegions);

			Techstack techstack = new Techstack();
			techstack.setDescription(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Techstack.Description"));
			techstack.setExtraInfo(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Techstack.ExtraInfo"));
			techstack.setId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Techstack.Id"));
			techstack.setIdentity(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Techstack.Identity"));
			techstack.setName(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Techstack.Name"));
			techstack.setScope(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Techstack.Scope"));
			techstack.setStatus(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].Techstack.Status"));
			buildpacksItem.setTechstack(techstack);

			List<SupportedOsItem> supportedOs = new ArrayList<SupportedOsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs.Length"); j++) {
				SupportedOsItem supportedOsItem = new SupportedOsItem();
				supportedOsItem.setCreationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].CreationTime"));
				supportedOsItem.setDescription(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].Description"));
				supportedOsItem.setExtraInfo(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].ExtraInfo"));
				supportedOsItem.setFullName(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].FullName"));
				supportedOsItem.setId(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].Id"));
				supportedOsItem.setModificationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].ModificationTime"));
				supportedOsItem.setName(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].Name"));
				supportedOsItem.setOsBit(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].OsBit"));
				supportedOsItem.setOsBitNum(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].OsBitNum"));
				supportedOsItem.setVersion(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].Version"));

				List<String> supportedCloudDisplayNames = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].SupportedCloudDisplayNames.Length"); k++) {
					supportedCloudDisplayNames.add(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].SupportedCloudDisplayNames["+ k +"]"));
				}
				supportedOsItem.setSupportedCloudDisplayNames(supportedCloudDisplayNames);

				List<String> supportedCloudNames = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].SupportedCloudNames.Length"); k++) {
					supportedCloudNames.add(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedOs["+ j +"].SupportedCloudNames["+ k +"]"));
				}
				supportedOsItem.setSupportedCloudNames(supportedCloudNames);

				supportedOs.add(supportedOsItem);
			}
			buildpacksItem.setSupportedOs(supportedOs);

			List<SupportedRegionsListItem> supportedRegionsList = new ArrayList<SupportedRegionsListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList.Length"); j++) {
				SupportedRegionsListItem supportedRegionsListItem = new SupportedRegionsListItem();
				supportedRegionsListItem.setBuildpackId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].BuildpackId"));
				supportedRegionsListItem.setBuildpackTenantId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].BuildpackTenantId"));
				supportedRegionsListItem.setCreationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].CreationTime"));
				supportedRegionsListItem.setFileChecksum(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].FileChecksum"));
				supportedRegionsListItem.setFileLocation(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].FileLocation"));
				supportedRegionsListItem.setFileSize(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].FileSize"));
				supportedRegionsListItem.setFileStatus(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].FileStatus"));
				supportedRegionsListItem.setFromRegionId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].FromRegionId"));
				supportedRegionsListItem.setId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Id"));
				supportedRegionsListItem.setModificationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].ModificationTime"));
				supportedRegionsListItem.setObjectName(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].ObjectName"));
				supportedRegionsListItem.setOriginalFileName(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].OriginalFileName"));
				supportedRegionsListItem.setReadableFileSize(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].ReadableFileSize"));

				Region region = new Region();
				region.setBuildpackId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.BuildpackId"));
				region.setBuildpackTenantId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.BuildpackTenantId"));
				region.setCreationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.CreationTime"));
				region.setDescription(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.Description"));
				region.setFileChecksum(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.FileChecksum"));
				region.setFileLocation(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.FileLocation"));
				region.setFileSize(_ctx.longValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.FileSize"));
				region.setFileStatus(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.FileStatus"));
				region.setFromRegionId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.FromRegionId"));
				region.setIaasProviderId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.IaasProviderId"));
				region.setId(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.Id"));
				region.setIdentity(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.Identity"));
				region.setModificationTime(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.ModificationTime"));
				region.setName(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.Name"));
				region.setNetworkType(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.NetworkType"));
				region.setObjectName(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.ObjectName"));
				region.setOriginalFileName(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.OriginalFileName"));
				region.setReadableFileSize(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.ReadableFileSize"));
				region.setState(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.State"));
				region.setUtcCreate(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.UtcCreate"));
				region.setUtcModified(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.UtcModified"));
				region.setZoneDtos(_ctx.stringValue("DescribeBuildpackResponse.Buildpacks["+ i +"].SupportedRegionsList["+ j +"].Region.ZoneDtos"));
				supportedRegionsListItem.setRegion(region);

				supportedRegionsList.add(supportedRegionsListItem);
			}
			buildpacksItem.setSupportedRegionsList(supportedRegionsList);

			buildpacks.add(buildpacksItem);
		}
		describeBuildpackResponse.setBuildpacks(buildpacks);
	 
	 	return describeBuildpackResponse;
	}
}