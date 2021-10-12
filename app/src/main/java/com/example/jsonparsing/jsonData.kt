package com.example.jsonparsing

import com.google.gson.annotations.SerializedName

data class JSONData (
    val id:String?,
    val projectId:String?,
    val equipmentId:String?,
    val status:String?,
    val requestedBy:String?,
    val acceptedBy:String?,
    val author:String?,
    val category:String?,
    val locations:Locations,
    val filters:List<Filters>,
    val type:String?,
    val organization:String?,
    val address:String?,
    val startDate:String?,
    val endDate:String?,
    val description:String?,
    val prolongDates:List<Any>, // how can I avoid using Any here?
    val releaseDates:List<Any>,
    val isDummy:Boolean?,
    val hasDriver:Boolean?,
    val overwriteDate:String?,
    val metaInfo:String?,
    val warehouseId:String?,
    val rentalDescription:String?,
    val internalTransportations:InternalTransportations,
    val startDateMilliseconds:Long?,
    val endDateMilliseconds:Long?,
    val equipment:Equipment?
    )
data class Locations(
    val type:String?,
    val coordinates:List<Double>
)
data class Filters(
    val name:String?,
    val value: Value
)
data class Value(
    val max:Int,
    val min:Int
)
data class InternalTransportations(
    val id:String?,
    val projectRequestId:String?,
    val pickUpDate:String?,
    val deliveryDate:String?,
    val description:String?,
    val status:String?,
    val startDateOption:String?,
    val endDateOption:String?,
    val pickUpLocation:Locations,
    val deliveryLocation:Locations,
    val provider:String?,
    val pickUpLocationAddress:String?,
    val deliveryLocationAddress:String?,
    val pGroup:String?,
    val isOrganizedWithoutSam:Boolean?,
    val templatePGroup:String?,
    val pickUpDateMilliseconds:Long,
    val deliveryDateMilliseconds:Long,
    val startDateOptionMilliseconds:String?,
    val endDateOptionMilliseconds:String?

    )
data class Equipment(
    val id:String?,
    val title:String?,
    val invNumber:String?,
    val categoryId:String?,
    val modelId:String?,
    val brandId:String?,
    val year:Int?,
    val specifications:List<Pair<ValueAsString?, ValueAsObject?>>,
    val weight:Int,
    val additional_specifications:String?,
    val structureId:String?,
    val organizationId:String?,
    val beaconType:String?,
    val beaconId:String?,
    val beaconVendor:String?,
    val RFID:String?,
    val dailyPrice:String?,
    val inactive:String?,
    val tag:Tag?,
    val telematicBox:String?,
    val createdAt:String?,
    @SerializedName("special_number")
    val specialNumber:String?,
    @SerializedName("last_check")
    val lastCheck:String?,
    @SerializedName("next_check")
    val nextCheck:String?,
    @SerializedName("responsible_person")
    val responsiblePerson:String?,
    @SerializedName("test_type")
    val testType:String?,
    @SerializedName("unique_equipment_id")
    val uniqueEquipmentId:String?,
    @SerializedName("bgl_number")
    val bglNumber:String?,
    @SerializedName("serial_number")
    val serialNumber:String?,
    val inventory:String?,
    val warehouseId:String?,
    val trackingTag:String?,
    val workingHours:String?,
    @SerializedName("navaris_criteria")
    val navarisCriteria:String?,
    @SerializedName("dont_send_to_as400")
    val dontSendToAs400:Boolean?,
    val model:Model,
    val brand:Brand,
    val category:Category,
    val structure:Structure,
    val wareHouse:String?,
    val equipmentMedia:List<EquipmentMediaObject>,
    val telematics:List<Triple<TelematicsObject?, String?, Boolean?>>,
    val isMoving:Boolean


)
data class ValueAsString(
    val key:String?,
    val value:String?
)
data class ValueAsObject(
    val key:String?,
    val value:ValueObject?
)
data class ValueObject(
    val H:String?,
    val L:String?,
    val W:String?,
)
data class Tag(
    val date:String?,
    val authorName:String?,
    val media:List<Any?>
)
data class Model(
    val id:String?,
    val name:String?,
    val createdAt:String?,
    val brand:Brand
)

data class Brand(
    val id:String?,
    val name:String?,
    val createdAt:String?
)
data class Category(
    val id:String?,
    val name:String?,
    val name_de:String?,
    val createdAt:String?,
    val model:List<Any>
)

data class Structure(
    val id:String?,
    val name:String?,
    val type:String?,
    val color:String?
)

data class EquipmentMediaObject(
    val id:String?,
    val name:String?,
    val files:List<FilesObject>,
    val type:String?,
    val modelId:String?,
    val main: Boolean?,
    val modelType:String?,
    val createdAt:String?
)
data class FilesObject(
    val size:String?,
    val path:String?
)

data class TelematicsObject(
    val timestamp:Long?,
    val eventType:String?,
    val projectId:String?,
    val equipmentId: Boolean?,
    val locationName:String?,
    val location:LocationObject?,
    val costCenter:String?,
    val lastLatitude:Double,
    val lastLongitude:Double,
    val lastLatLonPrecise:Boolean,
    val lastAddressByLatLon:String?
)

data class LocationObject(
    val type:String?,
    val coordinates:List<List<List<List<Double?>>>>

)