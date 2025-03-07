

# CreateInterconnectionPortVirtualCircuit201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bill** | **Boolean** | True if the Virtual Circuit is being billed. Currently, only Virtual Circuits of Fabric VCs (Metal Billed) will be billed. Usage will start the first time the Virtual Circuit becomes active, and will not stop until it is deleted from Metal. |  |
|**description** | **String** |  |  |
|**id** | **UUID** |  |  |
|**name** | **String** |  |  |
|**nniVlan** | **Integer** |  |  |
|**port** | [**Href**](Href.md) |  |  |
|**project** | [**Href**](Href.md) |  |  |
|**speed** | **Integer** | integer representing bps speed |  [optional] |
|**status** | **String** |  |  |
|**tags** | **List&lt;String&gt;** |  |  |
|**virtualNetwork** | [**Href**](Href.md) |  |  |
|**vnid** | **Integer** |  |  |
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**updatedAt** | **OffsetDateTime** |  |  [optional] |
|**customerIp** | **String** | An IP address from the subnet that will be used on the Customer side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Metal IP. By default, the last usable IP address in the subnet will be used. |  [optional] |
|**md5** | **String** | The MD5 password for the BGP peering in plaintext (not a checksum). |  [optional] |
|**metalIp** | **String** | An IP address from the subnet that will be used on the Metal side. This parameter is optional, but if supplied, we will use the other usable IP address in the subnet as the Customer IP. By default, the first usable IP address in the subnet will be used. |  [optional] |
|**peerAsn** | **Integer** | The peer ASN that will be used with the VRF on the Virtual Circuit. |  [optional] |
|**subnet** | **String** | The /30 or /31 subnet of one of the VRF IP Blocks that will be used with the VRF for the Virtual Circuit. This subnet does not have to be an existing VRF IP reservation, as we will create the VRF IP reservation on creation if it does not exist. The Metal IP and Customer IP must be IPs from this subnet. For /30 subnets, the network and broadcast IPs cannot be used as the Metal or Customer IP. |  [optional] |
|**vrf** | [**Vrf**](Vrf.md) |  |  [optional] |



