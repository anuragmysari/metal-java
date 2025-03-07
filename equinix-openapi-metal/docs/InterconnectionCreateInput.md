

# InterconnectionCreateInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactEmail** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**metro** | **String** | A Metro ID or code. For interconnections with Dedicated Ports, this will be the location of the issued Dedicated Ports. When creating Fabric VCs (Metal Billed), this is where interconnection will be originating from, as we pre-authorize the use of one of our shared ports as the origin of the interconnection using A-Side service tokens. We only allow local connections for Fabric VCs (Metal Billed), so the destination location must be the same as the origin. For Fabric VCs (Fabric Billed), or shared connections, this will be the destination of the interconnection. We allow remote connections for Fabric VCs (Fabric Billed), so the origin of the interconnection can be a different metro set here. |  |
|**mode** | [**ModeEnum**](#ModeEnum) | The mode of the interconnection (only relevant to Dedicated Ports). Fabric VCs won&#39;t have this field. Can be either &#39;standard&#39; or &#39;tunnel&#39;.   The default mode of an interconnection on a Dedicated Port is &#39;standard&#39;. The mode can only be changed when there are no associated virtual circuits on the interconnection.   In tunnel mode, an 802.1q tunnel is added to a port to send/receive double tagged packets from server instances. |  [optional] |
|**name** | **String** |  |  |
|**project** | **String** |  |  [optional] |
|**redundancy** | **String** | Either &#39;primary&#39; or &#39;redundant&#39;. |  |
|**serviceTokenType** | [**ServiceTokenTypeEnum**](#ServiceTokenTypeEnum) | Either &#39;a_side&#39; or &#39;z_side&#39;. Setting this field to &#39;a_side&#39; will create an interconnection with Fabric VCs (Metal Billed). Setting this field to &#39;z_side&#39; will create an interconnection with Fabric VCs (Fabric Billed). This is required when the &#39;type&#39; is &#39;shared&#39;, but this is not applicable when the &#39;type&#39; is &#39;dedicated&#39;. This parameter is included in the specification as a developer preview and is generally unavailable. Please contact our Support team for more details. |  [optional] |
|**speed** | **Integer** | A interconnection speed, in bps, mbps, or gbps. For Dedicated Ports, this can be 10Gbps or 100Gbps. For Fabric VCs, this represents the maximum speed of the interconnection. For Fabric VCs (Metal Billed), this can only be one of the following:  &#39;&#39;50mbps&#39;&#39;, &#39;&#39;200mbps&#39;&#39;, &#39;&#39;500mbps&#39;&#39;, &#39;&#39;1gbps&#39;&#39;, &#39;&#39;2gbps&#39;&#39;, &#39;&#39;5gbps&#39;&#39; or &#39;&#39;10gbps&#39;&#39;, and is required for creation. For Fabric VCs (Fabric Billed), this field will always default to &#39;&#39;10gbps&#39;&#39; even if it is not provided. For example, &#39;&#39;500000000&#39;&#39;, &#39;&#39;50m&#39;&#39;, or&#39; &#39;&#39;500mbps&#39;&#39; will all work as valid inputs. |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |
|**type** | **String** | Either &#39;shared&#39; or &#39;dedicated&#39;. The &#39;shared&#39; type represents shared interconnections, or also known as Fabric VCs. The &#39;dedicated&#39; type represents dedicated interconnections, or also known as Dedicated Ports. |  |
|**vlans** | **List&lt;Integer&gt;** | A list of one or two metro-based VLANs that will be set on the virtual circuits of primary and/or secondary (if redundant) interconnections respectively when creating Fabric VCs. VLANs can also be set after the interconnection is created, but are required to fully activate the interconnection. This parameter is included in the specification as a developer preview and is generally unavailable. Please contact our Support team for more details. |  [optional] |
|**vrfs** | **List&lt;UUID&gt;** | Can only be set when creating Fabric VCs in VRF(s). This field holds a list of VRF UUIDs that will be set automatically on the virtual circuits on creation, and can hold up to two UUIDs. Two UUIDs are required when requesting redundant Fabric VCs. The first UUID will be set on the primary virtual circuit, while the second UUID will be set on the secondary. The two UUIDs can be the same if both the primary and secondary virtual circuits will be in the same VRF. This parameter is included in the specification as a developer preview and is generally unavailable. Please contact our Support team for more details. |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| STANDARD | &quot;standard&quot; |
| TUNNEL | &quot;tunnel&quot; |



## Enum: ServiceTokenTypeEnum

| Name | Value |
|---- | -----|
| A_SIDE | &quot;a_side&quot; |
| Z_SIDE | &quot;z_side&quot; |



