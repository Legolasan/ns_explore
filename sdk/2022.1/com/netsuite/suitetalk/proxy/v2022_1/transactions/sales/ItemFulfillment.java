/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.Address;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.Country;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.ItemFulfillmentItemList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.ItemFulfillmentPackageFedExList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.ItemFulfillmentPackageList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.ItemFulfillmentPackageUpsList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.ItemFulfillmentPackageUspsList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentAccessibilityTypeFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentAncillaryEndorsementFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentB13AFilingOptionFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentExportTypeUps;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentHazmatTypeFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentHomeDeliveryTypeFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentLicenseExceptionUps;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentMethodOfTransportUps;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentShipStatus;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentTermsOfSaleFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentThirdPartyTypeFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentThirdPartyTypeUps;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemFulfillment
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef customForm;
    private RecordRef postingPeriod;
    private RecordRef entity;
    private RecordRef createdFrom;
    private RecordRef requestedBy;
    private Long createdFromShipGroup;
    private RecordRef partner;
    private Address shippingAddress;
    private Calendar pickedDate;
    private Calendar packedDate;
    private Calendar shippedDate;
    private Boolean shipIsResidential;
    private RecordRef shipAddressList;
    private ItemFulfillmentShipStatus shipStatus;
    private Boolean saturdayDeliveryUps;
    private Boolean sendShipNotifyEmailUps;
    private Boolean sendBackupEmailUps;
    private String shipNotifyEmailAddressUps;
    private String shipNotifyEmailAddress2Ups;
    private String backupEmailAddressUps;
    private String shipNotifyEmailMessageUps;
    private String thirdPartyAcctUps;
    private String thirdPartyZipcodeUps;
    private Country thirdPartyCountryUps;
    private ItemFulfillmentThirdPartyTypeUps thirdPartyTypeUps;
    private Boolean partiesToTransactionUps;
    private ItemFulfillmentExportTypeUps exportTypeUps;
    private ItemFulfillmentMethodOfTransportUps methodOfTransportUps;
    private String carrierIdUps;
    private String entryNumberUps;
    private String inbondCodeUps;
    private Boolean isRoutedExportTransactionUps;
    private String licenseNumberUps;
    private Calendar licenseDateUps;
    private ItemFulfillmentLicenseExceptionUps licenseExceptionUps;
    private String eccNumberUps;
    private String recipientTaxIdUps;
    private Calendar blanketStartDateUps;
    private Calendar blanketEndDateUps;
    private Double shipmentWeightUps;
    private Boolean saturdayDeliveryFedEx;
    private Boolean saturdayPickupFedex;
    private Boolean sendShipNotifyEmailFedEx;
    private Boolean sendBackupEmailFedEx;
    private Boolean signatureHomeDeliveryFedEx;
    private String shipNotifyEmailAddressFedEx;
    private String backupEmailAddressFedEx;
    private Calendar shipDateFedEx;
    private ItemFulfillmentHomeDeliveryTypeFedEx homeDeliveryTypeFedEx;
    private Calendar homeDeliveryDateFedEx;
    private String bookingConfirmationNumFedEx;
    private String intlExemptionNumFedEx;
    private ItemFulfillmentB13AFilingOptionFedEx b13AFilingOptionFedEx;
    private String b13AStatementDataFedEx;
    private String thirdPartyAcctFedEx;
    private Country thirdPartyCountryFedEx;
    private ItemFulfillmentThirdPartyTypeFedEx thirdPartyTypeFedEx;
    private Double shipmentWeightFedEx;
    private ItemFulfillmentTermsOfSaleFedEx termsOfSaleFedEx;
    private Double termsFreightChargeFedEx;
    private Double termsInsuranceChargeFedEx;
    private Boolean insideDeliveryFedEx;
    private Boolean insidePickupFedEx;
    private ItemFulfillmentAncillaryEndorsementFedEx ancillaryEndorsementFedEx;
    private Boolean holdAtLocationFedEx;
    private String halPhoneFedEx;
    private String halAddr1FedEx;
    private String halAddr2FedEx;
    private String halAddr3FedEx;
    private String halCityFedEx;
    private String halZipFedEx;
    private String halStateFedEx;
    private String halCountryFedEx;
    private ItemFulfillmentHazmatTypeFedEx hazmatTypeFedEx;
    private ItemFulfillmentAccessibilityTypeFedEx accessibilityTypeFedEx;
    private Boolean isCargoAircraftOnlyFedEx;
    private Calendar tranDate;
    private String tranId;
    private RecordRef shipMethod;
    private Boolean generateIntegratedShipperLabel;
    private Double shippingCost;
    private Double handlingCost;
    private String memo;
    private RecordRef transferLocation;
    private ItemFulfillmentPackageList packageList;
    private ItemFulfillmentPackageUpsList packageUpsList;
    private ItemFulfillmentPackageUspsList packageUspsList;
    private ItemFulfillmentPackageFedExList packageFedExList;
    private ItemFulfillmentItemList itemList;
    private AccountingBookDetailList accountingBookDetailList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillment.class, true);

    public ItemFulfillment() {
    }

    public ItemFulfillment(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef customForm, RecordRef postingPeriod, RecordRef entity, RecordRef createdFrom, RecordRef requestedBy, Long createdFromShipGroup, RecordRef partner, Address shippingAddress, Calendar pickedDate, Calendar packedDate, Calendar shippedDate, Boolean shipIsResidential, RecordRef shipAddressList, ItemFulfillmentShipStatus shipStatus, Boolean saturdayDeliveryUps, Boolean sendShipNotifyEmailUps, Boolean sendBackupEmailUps, String shipNotifyEmailAddressUps, String shipNotifyEmailAddress2Ups, String backupEmailAddressUps, String shipNotifyEmailMessageUps, String thirdPartyAcctUps, String thirdPartyZipcodeUps, Country thirdPartyCountryUps, ItemFulfillmentThirdPartyTypeUps thirdPartyTypeUps, Boolean partiesToTransactionUps, ItemFulfillmentExportTypeUps exportTypeUps, ItemFulfillmentMethodOfTransportUps methodOfTransportUps, String carrierIdUps, String entryNumberUps, String inbondCodeUps, Boolean isRoutedExportTransactionUps, String licenseNumberUps, Calendar licenseDateUps, ItemFulfillmentLicenseExceptionUps licenseExceptionUps, String eccNumberUps, String recipientTaxIdUps, Calendar blanketStartDateUps, Calendar blanketEndDateUps, Double shipmentWeightUps, Boolean saturdayDeliveryFedEx, Boolean saturdayPickupFedex, Boolean sendShipNotifyEmailFedEx, Boolean sendBackupEmailFedEx, Boolean signatureHomeDeliveryFedEx, String shipNotifyEmailAddressFedEx, String backupEmailAddressFedEx, Calendar shipDateFedEx, ItemFulfillmentHomeDeliveryTypeFedEx homeDeliveryTypeFedEx, Calendar homeDeliveryDateFedEx, String bookingConfirmationNumFedEx, String intlExemptionNumFedEx, ItemFulfillmentB13AFilingOptionFedEx b13AFilingOptionFedEx, String b13AStatementDataFedEx, String thirdPartyAcctFedEx, Country thirdPartyCountryFedEx, ItemFulfillmentThirdPartyTypeFedEx thirdPartyTypeFedEx, Double shipmentWeightFedEx, ItemFulfillmentTermsOfSaleFedEx termsOfSaleFedEx, Double termsFreightChargeFedEx, Double termsInsuranceChargeFedEx, Boolean insideDeliveryFedEx, Boolean insidePickupFedEx, ItemFulfillmentAncillaryEndorsementFedEx ancillaryEndorsementFedEx, Boolean holdAtLocationFedEx, String halPhoneFedEx, String halAddr1FedEx, String halAddr2FedEx, String halAddr3FedEx, String halCityFedEx, String halZipFedEx, String halStateFedEx, String halCountryFedEx, ItemFulfillmentHazmatTypeFedEx hazmatTypeFedEx, ItemFulfillmentAccessibilityTypeFedEx accessibilityTypeFedEx, Boolean isCargoAircraftOnlyFedEx, Calendar tranDate, String tranId, RecordRef shipMethod, Boolean generateIntegratedShipperLabel, Double shippingCost, Double handlingCost, String memo, RecordRef transferLocation, ItemFulfillmentPackageList packageList, ItemFulfillmentPackageUpsList packageUpsList, ItemFulfillmentPackageUspsList packageUspsList, ItemFulfillmentPackageFedExList packageFedExList, ItemFulfillmentItemList itemList, AccountingBookDetailList accountingBookDetailList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.postingPeriod = postingPeriod;
        this.entity = entity;
        this.createdFrom = createdFrom;
        this.requestedBy = requestedBy;
        this.createdFromShipGroup = createdFromShipGroup;
        this.partner = partner;
        this.shippingAddress = shippingAddress;
        this.pickedDate = pickedDate;
        this.packedDate = packedDate;
        this.shippedDate = shippedDate;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this.shipStatus = shipStatus;
        this.saturdayDeliveryUps = saturdayDeliveryUps;
        this.sendShipNotifyEmailUps = sendShipNotifyEmailUps;
        this.sendBackupEmailUps = sendBackupEmailUps;
        this.shipNotifyEmailAddressUps = shipNotifyEmailAddressUps;
        this.shipNotifyEmailAddress2Ups = shipNotifyEmailAddress2Ups;
        this.backupEmailAddressUps = backupEmailAddressUps;
        this.shipNotifyEmailMessageUps = shipNotifyEmailMessageUps;
        this.thirdPartyAcctUps = thirdPartyAcctUps;
        this.thirdPartyZipcodeUps = thirdPartyZipcodeUps;
        this.thirdPartyCountryUps = thirdPartyCountryUps;
        this.thirdPartyTypeUps = thirdPartyTypeUps;
        this.partiesToTransactionUps = partiesToTransactionUps;
        this.exportTypeUps = exportTypeUps;
        this.methodOfTransportUps = methodOfTransportUps;
        this.carrierIdUps = carrierIdUps;
        this.entryNumberUps = entryNumberUps;
        this.inbondCodeUps = inbondCodeUps;
        this.isRoutedExportTransactionUps = isRoutedExportTransactionUps;
        this.licenseNumberUps = licenseNumberUps;
        this.licenseDateUps = licenseDateUps;
        this.licenseExceptionUps = licenseExceptionUps;
        this.eccNumberUps = eccNumberUps;
        this.recipientTaxIdUps = recipientTaxIdUps;
        this.blanketStartDateUps = blanketStartDateUps;
        this.blanketEndDateUps = blanketEndDateUps;
        this.shipmentWeightUps = shipmentWeightUps;
        this.saturdayDeliveryFedEx = saturdayDeliveryFedEx;
        this.saturdayPickupFedex = saturdayPickupFedex;
        this.sendShipNotifyEmailFedEx = sendShipNotifyEmailFedEx;
        this.sendBackupEmailFedEx = sendBackupEmailFedEx;
        this.signatureHomeDeliveryFedEx = signatureHomeDeliveryFedEx;
        this.shipNotifyEmailAddressFedEx = shipNotifyEmailAddressFedEx;
        this.backupEmailAddressFedEx = backupEmailAddressFedEx;
        this.shipDateFedEx = shipDateFedEx;
        this.homeDeliveryTypeFedEx = homeDeliveryTypeFedEx;
        this.homeDeliveryDateFedEx = homeDeliveryDateFedEx;
        this.bookingConfirmationNumFedEx = bookingConfirmationNumFedEx;
        this.intlExemptionNumFedEx = intlExemptionNumFedEx;
        this.b13AFilingOptionFedEx = b13AFilingOptionFedEx;
        this.b13AStatementDataFedEx = b13AStatementDataFedEx;
        this.thirdPartyAcctFedEx = thirdPartyAcctFedEx;
        this.thirdPartyCountryFedEx = thirdPartyCountryFedEx;
        this.thirdPartyTypeFedEx = thirdPartyTypeFedEx;
        this.shipmentWeightFedEx = shipmentWeightFedEx;
        this.termsOfSaleFedEx = termsOfSaleFedEx;
        this.termsFreightChargeFedEx = termsFreightChargeFedEx;
        this.termsInsuranceChargeFedEx = termsInsuranceChargeFedEx;
        this.insideDeliveryFedEx = insideDeliveryFedEx;
        this.insidePickupFedEx = insidePickupFedEx;
        this.ancillaryEndorsementFedEx = ancillaryEndorsementFedEx;
        this.holdAtLocationFedEx = holdAtLocationFedEx;
        this.halPhoneFedEx = halPhoneFedEx;
        this.halAddr1FedEx = halAddr1FedEx;
        this.halAddr2FedEx = halAddr2FedEx;
        this.halAddr3FedEx = halAddr3FedEx;
        this.halCityFedEx = halCityFedEx;
        this.halZipFedEx = halZipFedEx;
        this.halStateFedEx = halStateFedEx;
        this.halCountryFedEx = halCountryFedEx;
        this.hazmatTypeFedEx = hazmatTypeFedEx;
        this.accessibilityTypeFedEx = accessibilityTypeFedEx;
        this.isCargoAircraftOnlyFedEx = isCargoAircraftOnlyFedEx;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.shipMethod = shipMethod;
        this.generateIntegratedShipperLabel = generateIntegratedShipperLabel;
        this.shippingCost = shippingCost;
        this.handlingCost = handlingCost;
        this.memo = memo;
        this.transferLocation = transferLocation;
        this.packageList = packageList;
        this.packageUpsList = packageUpsList;
        this.packageUspsList = packageUspsList;
        this.packageFedExList = packageFedExList;
        this.itemList = itemList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public RecordRef getRequestedBy() {
        return this.requestedBy;
    }

    public void setRequestedBy(RecordRef requestedBy) {
        this.requestedBy = requestedBy;
    }

    public Long getCreatedFromShipGroup() {
        return this.createdFromShipGroup;
    }

    public void setCreatedFromShipGroup(Long createdFromShipGroup) {
        this.createdFromShipGroup = createdFromShipGroup;
    }

    public RecordRef getPartner() {
        return this.partner;
    }

    public void setPartner(RecordRef partner) {
        this.partner = partner;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Calendar getPickedDate() {
        return this.pickedDate;
    }

    public void setPickedDate(Calendar pickedDate) {
        this.pickedDate = pickedDate;
    }

    public Calendar getPackedDate() {
        return this.packedDate;
    }

    public void setPackedDate(Calendar packedDate) {
        this.packedDate = packedDate;
    }

    public Calendar getShippedDate() {
        return this.shippedDate;
    }

    public void setShippedDate(Calendar shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Boolean getShipIsResidential() {
        return this.shipIsResidential;
    }

    public void setShipIsResidential(Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }

    public RecordRef getShipAddressList() {
        return this.shipAddressList;
    }

    public void setShipAddressList(RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }

    public ItemFulfillmentShipStatus getShipStatus() {
        return this.shipStatus;
    }

    public void setShipStatus(ItemFulfillmentShipStatus shipStatus) {
        this.shipStatus = shipStatus;
    }

    public Boolean getSaturdayDeliveryUps() {
        return this.saturdayDeliveryUps;
    }

    public void setSaturdayDeliveryUps(Boolean saturdayDeliveryUps) {
        this.saturdayDeliveryUps = saturdayDeliveryUps;
    }

    public Boolean getSendShipNotifyEmailUps() {
        return this.sendShipNotifyEmailUps;
    }

    public void setSendShipNotifyEmailUps(Boolean sendShipNotifyEmailUps) {
        this.sendShipNotifyEmailUps = sendShipNotifyEmailUps;
    }

    public Boolean getSendBackupEmailUps() {
        return this.sendBackupEmailUps;
    }

    public void setSendBackupEmailUps(Boolean sendBackupEmailUps) {
        this.sendBackupEmailUps = sendBackupEmailUps;
    }

    public String getShipNotifyEmailAddressUps() {
        return this.shipNotifyEmailAddressUps;
    }

    public void setShipNotifyEmailAddressUps(String shipNotifyEmailAddressUps) {
        this.shipNotifyEmailAddressUps = shipNotifyEmailAddressUps;
    }

    public String getShipNotifyEmailAddress2Ups() {
        return this.shipNotifyEmailAddress2Ups;
    }

    public void setShipNotifyEmailAddress2Ups(String shipNotifyEmailAddress2Ups) {
        this.shipNotifyEmailAddress2Ups = shipNotifyEmailAddress2Ups;
    }

    public String getBackupEmailAddressUps() {
        return this.backupEmailAddressUps;
    }

    public void setBackupEmailAddressUps(String backupEmailAddressUps) {
        this.backupEmailAddressUps = backupEmailAddressUps;
    }

    public String getShipNotifyEmailMessageUps() {
        return this.shipNotifyEmailMessageUps;
    }

    public void setShipNotifyEmailMessageUps(String shipNotifyEmailMessageUps) {
        this.shipNotifyEmailMessageUps = shipNotifyEmailMessageUps;
    }

    public String getThirdPartyAcctUps() {
        return this.thirdPartyAcctUps;
    }

    public void setThirdPartyAcctUps(String thirdPartyAcctUps) {
        this.thirdPartyAcctUps = thirdPartyAcctUps;
    }

    public String getThirdPartyZipcodeUps() {
        return this.thirdPartyZipcodeUps;
    }

    public void setThirdPartyZipcodeUps(String thirdPartyZipcodeUps) {
        this.thirdPartyZipcodeUps = thirdPartyZipcodeUps;
    }

    public Country getThirdPartyCountryUps() {
        return this.thirdPartyCountryUps;
    }

    public void setThirdPartyCountryUps(Country thirdPartyCountryUps) {
        this.thirdPartyCountryUps = thirdPartyCountryUps;
    }

    public ItemFulfillmentThirdPartyTypeUps getThirdPartyTypeUps() {
        return this.thirdPartyTypeUps;
    }

    public void setThirdPartyTypeUps(ItemFulfillmentThirdPartyTypeUps thirdPartyTypeUps) {
        this.thirdPartyTypeUps = thirdPartyTypeUps;
    }

    public Boolean getPartiesToTransactionUps() {
        return this.partiesToTransactionUps;
    }

    public void setPartiesToTransactionUps(Boolean partiesToTransactionUps) {
        this.partiesToTransactionUps = partiesToTransactionUps;
    }

    public ItemFulfillmentExportTypeUps getExportTypeUps() {
        return this.exportTypeUps;
    }

    public void setExportTypeUps(ItemFulfillmentExportTypeUps exportTypeUps) {
        this.exportTypeUps = exportTypeUps;
    }

    public ItemFulfillmentMethodOfTransportUps getMethodOfTransportUps() {
        return this.methodOfTransportUps;
    }

    public void setMethodOfTransportUps(ItemFulfillmentMethodOfTransportUps methodOfTransportUps) {
        this.methodOfTransportUps = methodOfTransportUps;
    }

    public String getCarrierIdUps() {
        return this.carrierIdUps;
    }

    public void setCarrierIdUps(String carrierIdUps) {
        this.carrierIdUps = carrierIdUps;
    }

    public String getEntryNumberUps() {
        return this.entryNumberUps;
    }

    public void setEntryNumberUps(String entryNumberUps) {
        this.entryNumberUps = entryNumberUps;
    }

    public String getInbondCodeUps() {
        return this.inbondCodeUps;
    }

    public void setInbondCodeUps(String inbondCodeUps) {
        this.inbondCodeUps = inbondCodeUps;
    }

    public Boolean getIsRoutedExportTransactionUps() {
        return this.isRoutedExportTransactionUps;
    }

    public void setIsRoutedExportTransactionUps(Boolean isRoutedExportTransactionUps) {
        this.isRoutedExportTransactionUps = isRoutedExportTransactionUps;
    }

    public String getLicenseNumberUps() {
        return this.licenseNumberUps;
    }

    public void setLicenseNumberUps(String licenseNumberUps) {
        this.licenseNumberUps = licenseNumberUps;
    }

    public Calendar getLicenseDateUps() {
        return this.licenseDateUps;
    }

    public void setLicenseDateUps(Calendar licenseDateUps) {
        this.licenseDateUps = licenseDateUps;
    }

    public ItemFulfillmentLicenseExceptionUps getLicenseExceptionUps() {
        return this.licenseExceptionUps;
    }

    public void setLicenseExceptionUps(ItemFulfillmentLicenseExceptionUps licenseExceptionUps) {
        this.licenseExceptionUps = licenseExceptionUps;
    }

    public String getEccNumberUps() {
        return this.eccNumberUps;
    }

    public void setEccNumberUps(String eccNumberUps) {
        this.eccNumberUps = eccNumberUps;
    }

    public String getRecipientTaxIdUps() {
        return this.recipientTaxIdUps;
    }

    public void setRecipientTaxIdUps(String recipientTaxIdUps) {
        this.recipientTaxIdUps = recipientTaxIdUps;
    }

    public Calendar getBlanketStartDateUps() {
        return this.blanketStartDateUps;
    }

    public void setBlanketStartDateUps(Calendar blanketStartDateUps) {
        this.blanketStartDateUps = blanketStartDateUps;
    }

    public Calendar getBlanketEndDateUps() {
        return this.blanketEndDateUps;
    }

    public void setBlanketEndDateUps(Calendar blanketEndDateUps) {
        this.blanketEndDateUps = blanketEndDateUps;
    }

    public Double getShipmentWeightUps() {
        return this.shipmentWeightUps;
    }

    public void setShipmentWeightUps(Double shipmentWeightUps) {
        this.shipmentWeightUps = shipmentWeightUps;
    }

    public Boolean getSaturdayDeliveryFedEx() {
        return this.saturdayDeliveryFedEx;
    }

    public void setSaturdayDeliveryFedEx(Boolean saturdayDeliveryFedEx) {
        this.saturdayDeliveryFedEx = saturdayDeliveryFedEx;
    }

    public Boolean getSaturdayPickupFedex() {
        return this.saturdayPickupFedex;
    }

    public void setSaturdayPickupFedex(Boolean saturdayPickupFedex) {
        this.saturdayPickupFedex = saturdayPickupFedex;
    }

    public Boolean getSendShipNotifyEmailFedEx() {
        return this.sendShipNotifyEmailFedEx;
    }

    public void setSendShipNotifyEmailFedEx(Boolean sendShipNotifyEmailFedEx) {
        this.sendShipNotifyEmailFedEx = sendShipNotifyEmailFedEx;
    }

    public Boolean getSendBackupEmailFedEx() {
        return this.sendBackupEmailFedEx;
    }

    public void setSendBackupEmailFedEx(Boolean sendBackupEmailFedEx) {
        this.sendBackupEmailFedEx = sendBackupEmailFedEx;
    }

    public Boolean getSignatureHomeDeliveryFedEx() {
        return this.signatureHomeDeliveryFedEx;
    }

    public void setSignatureHomeDeliveryFedEx(Boolean signatureHomeDeliveryFedEx) {
        this.signatureHomeDeliveryFedEx = signatureHomeDeliveryFedEx;
    }

    public String getShipNotifyEmailAddressFedEx() {
        return this.shipNotifyEmailAddressFedEx;
    }

    public void setShipNotifyEmailAddressFedEx(String shipNotifyEmailAddressFedEx) {
        this.shipNotifyEmailAddressFedEx = shipNotifyEmailAddressFedEx;
    }

    public String getBackupEmailAddressFedEx() {
        return this.backupEmailAddressFedEx;
    }

    public void setBackupEmailAddressFedEx(String backupEmailAddressFedEx) {
        this.backupEmailAddressFedEx = backupEmailAddressFedEx;
    }

    public Calendar getShipDateFedEx() {
        return this.shipDateFedEx;
    }

    public void setShipDateFedEx(Calendar shipDateFedEx) {
        this.shipDateFedEx = shipDateFedEx;
    }

    public ItemFulfillmentHomeDeliveryTypeFedEx getHomeDeliveryTypeFedEx() {
        return this.homeDeliveryTypeFedEx;
    }

    public void setHomeDeliveryTypeFedEx(ItemFulfillmentHomeDeliveryTypeFedEx homeDeliveryTypeFedEx) {
        this.homeDeliveryTypeFedEx = homeDeliveryTypeFedEx;
    }

    public Calendar getHomeDeliveryDateFedEx() {
        return this.homeDeliveryDateFedEx;
    }

    public void setHomeDeliveryDateFedEx(Calendar homeDeliveryDateFedEx) {
        this.homeDeliveryDateFedEx = homeDeliveryDateFedEx;
    }

    public String getBookingConfirmationNumFedEx() {
        return this.bookingConfirmationNumFedEx;
    }

    public void setBookingConfirmationNumFedEx(String bookingConfirmationNumFedEx) {
        this.bookingConfirmationNumFedEx = bookingConfirmationNumFedEx;
    }

    public String getIntlExemptionNumFedEx() {
        return this.intlExemptionNumFedEx;
    }

    public void setIntlExemptionNumFedEx(String intlExemptionNumFedEx) {
        this.intlExemptionNumFedEx = intlExemptionNumFedEx;
    }

    public ItemFulfillmentB13AFilingOptionFedEx getB13AFilingOptionFedEx() {
        return this.b13AFilingOptionFedEx;
    }

    public void setB13AFilingOptionFedEx(ItemFulfillmentB13AFilingOptionFedEx b13AFilingOptionFedEx) {
        this.b13AFilingOptionFedEx = b13AFilingOptionFedEx;
    }

    public String getB13AStatementDataFedEx() {
        return this.b13AStatementDataFedEx;
    }

    public void setB13AStatementDataFedEx(String b13AStatementDataFedEx) {
        this.b13AStatementDataFedEx = b13AStatementDataFedEx;
    }

    public String getThirdPartyAcctFedEx() {
        return this.thirdPartyAcctFedEx;
    }

    public void setThirdPartyAcctFedEx(String thirdPartyAcctFedEx) {
        this.thirdPartyAcctFedEx = thirdPartyAcctFedEx;
    }

    public Country getThirdPartyCountryFedEx() {
        return this.thirdPartyCountryFedEx;
    }

    public void setThirdPartyCountryFedEx(Country thirdPartyCountryFedEx) {
        this.thirdPartyCountryFedEx = thirdPartyCountryFedEx;
    }

    public ItemFulfillmentThirdPartyTypeFedEx getThirdPartyTypeFedEx() {
        return this.thirdPartyTypeFedEx;
    }

    public void setThirdPartyTypeFedEx(ItemFulfillmentThirdPartyTypeFedEx thirdPartyTypeFedEx) {
        this.thirdPartyTypeFedEx = thirdPartyTypeFedEx;
    }

    public Double getShipmentWeightFedEx() {
        return this.shipmentWeightFedEx;
    }

    public void setShipmentWeightFedEx(Double shipmentWeightFedEx) {
        this.shipmentWeightFedEx = shipmentWeightFedEx;
    }

    public ItemFulfillmentTermsOfSaleFedEx getTermsOfSaleFedEx() {
        return this.termsOfSaleFedEx;
    }

    public void setTermsOfSaleFedEx(ItemFulfillmentTermsOfSaleFedEx termsOfSaleFedEx) {
        this.termsOfSaleFedEx = termsOfSaleFedEx;
    }

    public Double getTermsFreightChargeFedEx() {
        return this.termsFreightChargeFedEx;
    }

    public void setTermsFreightChargeFedEx(Double termsFreightChargeFedEx) {
        this.termsFreightChargeFedEx = termsFreightChargeFedEx;
    }

    public Double getTermsInsuranceChargeFedEx() {
        return this.termsInsuranceChargeFedEx;
    }

    public void setTermsInsuranceChargeFedEx(Double termsInsuranceChargeFedEx) {
        this.termsInsuranceChargeFedEx = termsInsuranceChargeFedEx;
    }

    public Boolean getInsideDeliveryFedEx() {
        return this.insideDeliveryFedEx;
    }

    public void setInsideDeliveryFedEx(Boolean insideDeliveryFedEx) {
        this.insideDeliveryFedEx = insideDeliveryFedEx;
    }

    public Boolean getInsidePickupFedEx() {
        return this.insidePickupFedEx;
    }

    public void setInsidePickupFedEx(Boolean insidePickupFedEx) {
        this.insidePickupFedEx = insidePickupFedEx;
    }

    public ItemFulfillmentAncillaryEndorsementFedEx getAncillaryEndorsementFedEx() {
        return this.ancillaryEndorsementFedEx;
    }

    public void setAncillaryEndorsementFedEx(ItemFulfillmentAncillaryEndorsementFedEx ancillaryEndorsementFedEx) {
        this.ancillaryEndorsementFedEx = ancillaryEndorsementFedEx;
    }

    public Boolean getHoldAtLocationFedEx() {
        return this.holdAtLocationFedEx;
    }

    public void setHoldAtLocationFedEx(Boolean holdAtLocationFedEx) {
        this.holdAtLocationFedEx = holdAtLocationFedEx;
    }

    public String getHalPhoneFedEx() {
        return this.halPhoneFedEx;
    }

    public void setHalPhoneFedEx(String halPhoneFedEx) {
        this.halPhoneFedEx = halPhoneFedEx;
    }

    public String getHalAddr1FedEx() {
        return this.halAddr1FedEx;
    }

    public void setHalAddr1FedEx(String halAddr1FedEx) {
        this.halAddr1FedEx = halAddr1FedEx;
    }

    public String getHalAddr2FedEx() {
        return this.halAddr2FedEx;
    }

    public void setHalAddr2FedEx(String halAddr2FedEx) {
        this.halAddr2FedEx = halAddr2FedEx;
    }

    public String getHalAddr3FedEx() {
        return this.halAddr3FedEx;
    }

    public void setHalAddr3FedEx(String halAddr3FedEx) {
        this.halAddr3FedEx = halAddr3FedEx;
    }

    public String getHalCityFedEx() {
        return this.halCityFedEx;
    }

    public void setHalCityFedEx(String halCityFedEx) {
        this.halCityFedEx = halCityFedEx;
    }

    public String getHalZipFedEx() {
        return this.halZipFedEx;
    }

    public void setHalZipFedEx(String halZipFedEx) {
        this.halZipFedEx = halZipFedEx;
    }

    public String getHalStateFedEx() {
        return this.halStateFedEx;
    }

    public void setHalStateFedEx(String halStateFedEx) {
        this.halStateFedEx = halStateFedEx;
    }

    public String getHalCountryFedEx() {
        return this.halCountryFedEx;
    }

    public void setHalCountryFedEx(String halCountryFedEx) {
        this.halCountryFedEx = halCountryFedEx;
    }

    public ItemFulfillmentHazmatTypeFedEx getHazmatTypeFedEx() {
        return this.hazmatTypeFedEx;
    }

    public void setHazmatTypeFedEx(ItemFulfillmentHazmatTypeFedEx hazmatTypeFedEx) {
        this.hazmatTypeFedEx = hazmatTypeFedEx;
    }

    public ItemFulfillmentAccessibilityTypeFedEx getAccessibilityTypeFedEx() {
        return this.accessibilityTypeFedEx;
    }

    public void setAccessibilityTypeFedEx(ItemFulfillmentAccessibilityTypeFedEx accessibilityTypeFedEx) {
        this.accessibilityTypeFedEx = accessibilityTypeFedEx;
    }

    public Boolean getIsCargoAircraftOnlyFedEx() {
        return this.isCargoAircraftOnlyFedEx;
    }

    public void setIsCargoAircraftOnlyFedEx(Boolean isCargoAircraftOnlyFedEx) {
        this.isCargoAircraftOnlyFedEx = isCargoAircraftOnlyFedEx;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public RecordRef getShipMethod() {
        return this.shipMethod;
    }

    public void setShipMethod(RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }

    public Boolean getGenerateIntegratedShipperLabel() {
        return this.generateIntegratedShipperLabel;
    }

    public void setGenerateIntegratedShipperLabel(Boolean generateIntegratedShipperLabel) {
        this.generateIntegratedShipperLabel = generateIntegratedShipperLabel;
    }

    public Double getShippingCost() {
        return this.shippingCost;
    }

    public void setShippingCost(Double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Double getHandlingCost() {
        return this.handlingCost;
    }

    public void setHandlingCost(Double handlingCost) {
        this.handlingCost = handlingCost;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getTransferLocation() {
        return this.transferLocation;
    }

    public void setTransferLocation(RecordRef transferLocation) {
        this.transferLocation = transferLocation;
    }

    public ItemFulfillmentPackageList getPackageList() {
        return this.packageList;
    }

    public void setPackageList(ItemFulfillmentPackageList packageList) {
        this.packageList = packageList;
    }

    public ItemFulfillmentPackageUpsList getPackageUpsList() {
        return this.packageUpsList;
    }

    public void setPackageUpsList(ItemFulfillmentPackageUpsList packageUpsList) {
        this.packageUpsList = packageUpsList;
    }

    public ItemFulfillmentPackageUspsList getPackageUspsList() {
        return this.packageUspsList;
    }

    public void setPackageUspsList(ItemFulfillmentPackageUspsList packageUspsList) {
        this.packageUspsList = packageUspsList;
    }

    public ItemFulfillmentPackageFedExList getPackageFedExList() {
        return this.packageFedExList;
    }

    public void setPackageFedExList(ItemFulfillmentPackageFedExList packageFedExList) {
        this.packageFedExList = packageFedExList;
    }

    public ItemFulfillmentItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(ItemFulfillmentItemList itemList) {
        this.itemList = itemList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFulfillment)) {
            return false;
        }
        ItemFulfillment other = (ItemFulfillment)obj;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
        }
        this.__equalsCalc = obj;
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.requestedBy == null && other.getRequestedBy() == null || this.requestedBy != null && this.requestedBy.equals(other.getRequestedBy())) && (this.createdFromShipGroup == null && other.getCreatedFromShipGroup() == null || this.createdFromShipGroup != null && this.createdFromShipGroup.equals(other.getCreatedFromShipGroup())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.shippingAddress == null && other.getShippingAddress() == null || this.shippingAddress != null && this.shippingAddress.equals(other.getShippingAddress())) && (this.pickedDate == null && other.getPickedDate() == null || this.pickedDate != null && this.pickedDate.equals(other.getPickedDate())) && (this.packedDate == null && other.getPackedDate() == null || this.packedDate != null && this.packedDate.equals(other.getPackedDate())) && (this.shippedDate == null && other.getShippedDate() == null || this.shippedDate != null && this.shippedDate.equals(other.getShippedDate())) && (this.shipIsResidential == null && other.getShipIsResidential() == null || this.shipIsResidential != null && this.shipIsResidential.equals(other.getShipIsResidential())) && (this.shipAddressList == null && other.getShipAddressList() == null || this.shipAddressList != null && this.shipAddressList.equals(other.getShipAddressList())) && (this.shipStatus == null && other.getShipStatus() == null || this.shipStatus != null && this.shipStatus.equals(other.getShipStatus())) && (this.saturdayDeliveryUps == null && other.getSaturdayDeliveryUps() == null || this.saturdayDeliveryUps != null && this.saturdayDeliveryUps.equals(other.getSaturdayDeliveryUps())) && (this.sendShipNotifyEmailUps == null && other.getSendShipNotifyEmailUps() == null || this.sendShipNotifyEmailUps != null && this.sendShipNotifyEmailUps.equals(other.getSendShipNotifyEmailUps())) && (this.sendBackupEmailUps == null && other.getSendBackupEmailUps() == null || this.sendBackupEmailUps != null && this.sendBackupEmailUps.equals(other.getSendBackupEmailUps())) && (this.shipNotifyEmailAddressUps == null && other.getShipNotifyEmailAddressUps() == null || this.shipNotifyEmailAddressUps != null && this.shipNotifyEmailAddressUps.equals(other.getShipNotifyEmailAddressUps())) && (this.shipNotifyEmailAddress2Ups == null && other.getShipNotifyEmailAddress2Ups() == null || this.shipNotifyEmailAddress2Ups != null && this.shipNotifyEmailAddress2Ups.equals(other.getShipNotifyEmailAddress2Ups())) && (this.backupEmailAddressUps == null && other.getBackupEmailAddressUps() == null || this.backupEmailAddressUps != null && this.backupEmailAddressUps.equals(other.getBackupEmailAddressUps())) && (this.shipNotifyEmailMessageUps == null && other.getShipNotifyEmailMessageUps() == null || this.shipNotifyEmailMessageUps != null && this.shipNotifyEmailMessageUps.equals(other.getShipNotifyEmailMessageUps())) && (this.thirdPartyAcctUps == null && other.getThirdPartyAcctUps() == null || this.thirdPartyAcctUps != null && this.thirdPartyAcctUps.equals(other.getThirdPartyAcctUps())) && (this.thirdPartyZipcodeUps == null && other.getThirdPartyZipcodeUps() == null || this.thirdPartyZipcodeUps != null && this.thirdPartyZipcodeUps.equals(other.getThirdPartyZipcodeUps())) && (this.thirdPartyCountryUps == null && other.getThirdPartyCountryUps() == null || this.thirdPartyCountryUps != null && this.thirdPartyCountryUps.equals(other.getThirdPartyCountryUps())) && (this.thirdPartyTypeUps == null && other.getThirdPartyTypeUps() == null || this.thirdPartyTypeUps != null && this.thirdPartyTypeUps.equals(other.getThirdPartyTypeUps())) && (this.partiesToTransactionUps == null && other.getPartiesToTransactionUps() == null || this.partiesToTransactionUps != null && this.partiesToTransactionUps.equals(other.getPartiesToTransactionUps())) && (this.exportTypeUps == null && other.getExportTypeUps() == null || this.exportTypeUps != null && this.exportTypeUps.equals(other.getExportTypeUps())) && (this.methodOfTransportUps == null && other.getMethodOfTransportUps() == null || this.methodOfTransportUps != null && this.methodOfTransportUps.equals(other.getMethodOfTransportUps())) && (this.carrierIdUps == null && other.getCarrierIdUps() == null || this.carrierIdUps != null && this.carrierIdUps.equals(other.getCarrierIdUps())) && (this.entryNumberUps == null && other.getEntryNumberUps() == null || this.entryNumberUps != null && this.entryNumberUps.equals(other.getEntryNumberUps())) && (this.inbondCodeUps == null && other.getInbondCodeUps() == null || this.inbondCodeUps != null && this.inbondCodeUps.equals(other.getInbondCodeUps())) && (this.isRoutedExportTransactionUps == null && other.getIsRoutedExportTransactionUps() == null || this.isRoutedExportTransactionUps != null && this.isRoutedExportTransactionUps.equals(other.getIsRoutedExportTransactionUps())) && (this.licenseNumberUps == null && other.getLicenseNumberUps() == null || this.licenseNumberUps != null && this.licenseNumberUps.equals(other.getLicenseNumberUps())) && (this.licenseDateUps == null && other.getLicenseDateUps() == null || this.licenseDateUps != null && this.licenseDateUps.equals(other.getLicenseDateUps())) && (this.licenseExceptionUps == null && other.getLicenseExceptionUps() == null || this.licenseExceptionUps != null && this.licenseExceptionUps.equals(other.getLicenseExceptionUps())) && (this.eccNumberUps == null && other.getEccNumberUps() == null || this.eccNumberUps != null && this.eccNumberUps.equals(other.getEccNumberUps())) && (this.recipientTaxIdUps == null && other.getRecipientTaxIdUps() == null || this.recipientTaxIdUps != null && this.recipientTaxIdUps.equals(other.getRecipientTaxIdUps())) && (this.blanketStartDateUps == null && other.getBlanketStartDateUps() == null || this.blanketStartDateUps != null && this.blanketStartDateUps.equals(other.getBlanketStartDateUps())) && (this.blanketEndDateUps == null && other.getBlanketEndDateUps() == null || this.blanketEndDateUps != null && this.blanketEndDateUps.equals(other.getBlanketEndDateUps())) && (this.shipmentWeightUps == null && other.getShipmentWeightUps() == null || this.shipmentWeightUps != null && this.shipmentWeightUps.equals(other.getShipmentWeightUps())) && (this.saturdayDeliveryFedEx == null && other.getSaturdayDeliveryFedEx() == null || this.saturdayDeliveryFedEx != null && this.saturdayDeliveryFedEx.equals(other.getSaturdayDeliveryFedEx())) && (this.saturdayPickupFedex == null && other.getSaturdayPickupFedex() == null || this.saturdayPickupFedex != null && this.saturdayPickupFedex.equals(other.getSaturdayPickupFedex())) && (this.sendShipNotifyEmailFedEx == null && other.getSendShipNotifyEmailFedEx() == null || this.sendShipNotifyEmailFedEx != null && this.sendShipNotifyEmailFedEx.equals(other.getSendShipNotifyEmailFedEx())) && (this.sendBackupEmailFedEx == null && other.getSendBackupEmailFedEx() == null || this.sendBackupEmailFedEx != null && this.sendBackupEmailFedEx.equals(other.getSendBackupEmailFedEx())) && (this.signatureHomeDeliveryFedEx == null && other.getSignatureHomeDeliveryFedEx() == null || this.signatureHomeDeliveryFedEx != null && this.signatureHomeDeliveryFedEx.equals(other.getSignatureHomeDeliveryFedEx())) && (this.shipNotifyEmailAddressFedEx == null && other.getShipNotifyEmailAddressFedEx() == null || this.shipNotifyEmailAddressFedEx != null && this.shipNotifyEmailAddressFedEx.equals(other.getShipNotifyEmailAddressFedEx())) && (this.backupEmailAddressFedEx == null && other.getBackupEmailAddressFedEx() == null || this.backupEmailAddressFedEx != null && this.backupEmailAddressFedEx.equals(other.getBackupEmailAddressFedEx())) && (this.shipDateFedEx == null && other.getShipDateFedEx() == null || this.shipDateFedEx != null && this.shipDateFedEx.equals(other.getShipDateFedEx())) && (this.homeDeliveryTypeFedEx == null && other.getHomeDeliveryTypeFedEx() == null || this.homeDeliveryTypeFedEx != null && this.homeDeliveryTypeFedEx.equals(other.getHomeDeliveryTypeFedEx())) && (this.homeDeliveryDateFedEx == null && other.getHomeDeliveryDateFedEx() == null || this.homeDeliveryDateFedEx != null && this.homeDeliveryDateFedEx.equals(other.getHomeDeliveryDateFedEx())) && (this.bookingConfirmationNumFedEx == null && other.getBookingConfirmationNumFedEx() == null || this.bookingConfirmationNumFedEx != null && this.bookingConfirmationNumFedEx.equals(other.getBookingConfirmationNumFedEx())) && (this.intlExemptionNumFedEx == null && other.getIntlExemptionNumFedEx() == null || this.intlExemptionNumFedEx != null && this.intlExemptionNumFedEx.equals(other.getIntlExemptionNumFedEx())) && (this.b13AFilingOptionFedEx == null && other.getB13AFilingOptionFedEx() == null || this.b13AFilingOptionFedEx != null && this.b13AFilingOptionFedEx.equals(other.getB13AFilingOptionFedEx())) && (this.b13AStatementDataFedEx == null && other.getB13AStatementDataFedEx() == null || this.b13AStatementDataFedEx != null && this.b13AStatementDataFedEx.equals(other.getB13AStatementDataFedEx())) && (this.thirdPartyAcctFedEx == null && other.getThirdPartyAcctFedEx() == null || this.thirdPartyAcctFedEx != null && this.thirdPartyAcctFedEx.equals(other.getThirdPartyAcctFedEx())) && (this.thirdPartyCountryFedEx == null && other.getThirdPartyCountryFedEx() == null || this.thirdPartyCountryFedEx != null && this.thirdPartyCountryFedEx.equals(other.getThirdPartyCountryFedEx())) && (this.thirdPartyTypeFedEx == null && other.getThirdPartyTypeFedEx() == null || this.thirdPartyTypeFedEx != null && this.thirdPartyTypeFedEx.equals(other.getThirdPartyTypeFedEx())) && (this.shipmentWeightFedEx == null && other.getShipmentWeightFedEx() == null || this.shipmentWeightFedEx != null && this.shipmentWeightFedEx.equals(other.getShipmentWeightFedEx())) && (this.termsOfSaleFedEx == null && other.getTermsOfSaleFedEx() == null || this.termsOfSaleFedEx != null && this.termsOfSaleFedEx.equals(other.getTermsOfSaleFedEx())) && (this.termsFreightChargeFedEx == null && other.getTermsFreightChargeFedEx() == null || this.termsFreightChargeFedEx != null && this.termsFreightChargeFedEx.equals(other.getTermsFreightChargeFedEx())) && (this.termsInsuranceChargeFedEx == null && other.getTermsInsuranceChargeFedEx() == null || this.termsInsuranceChargeFedEx != null && this.termsInsuranceChargeFedEx.equals(other.getTermsInsuranceChargeFedEx())) && (this.insideDeliveryFedEx == null && other.getInsideDeliveryFedEx() == null || this.insideDeliveryFedEx != null && this.insideDeliveryFedEx.equals(other.getInsideDeliveryFedEx())) && (this.insidePickupFedEx == null && other.getInsidePickupFedEx() == null || this.insidePickupFedEx != null && this.insidePickupFedEx.equals(other.getInsidePickupFedEx())) && (this.ancillaryEndorsementFedEx == null && other.getAncillaryEndorsementFedEx() == null || this.ancillaryEndorsementFedEx != null && this.ancillaryEndorsementFedEx.equals(other.getAncillaryEndorsementFedEx())) && (this.holdAtLocationFedEx == null && other.getHoldAtLocationFedEx() == null || this.holdAtLocationFedEx != null && this.holdAtLocationFedEx.equals(other.getHoldAtLocationFedEx())) && (this.halPhoneFedEx == null && other.getHalPhoneFedEx() == null || this.halPhoneFedEx != null && this.halPhoneFedEx.equals(other.getHalPhoneFedEx())) && (this.halAddr1FedEx == null && other.getHalAddr1FedEx() == null || this.halAddr1FedEx != null && this.halAddr1FedEx.equals(other.getHalAddr1FedEx())) && (this.halAddr2FedEx == null && other.getHalAddr2FedEx() == null || this.halAddr2FedEx != null && this.halAddr2FedEx.equals(other.getHalAddr2FedEx())) && (this.halAddr3FedEx == null && other.getHalAddr3FedEx() == null || this.halAddr3FedEx != null && this.halAddr3FedEx.equals(other.getHalAddr3FedEx())) && (this.halCityFedEx == null && other.getHalCityFedEx() == null || this.halCityFedEx != null && this.halCityFedEx.equals(other.getHalCityFedEx())) && (this.halZipFedEx == null && other.getHalZipFedEx() == null || this.halZipFedEx != null && this.halZipFedEx.equals(other.getHalZipFedEx())) && (this.halStateFedEx == null && other.getHalStateFedEx() == null || this.halStateFedEx != null && this.halStateFedEx.equals(other.getHalStateFedEx())) && (this.halCountryFedEx == null && other.getHalCountryFedEx() == null || this.halCountryFedEx != null && this.halCountryFedEx.equals(other.getHalCountryFedEx())) && (this.hazmatTypeFedEx == null && other.getHazmatTypeFedEx() == null || this.hazmatTypeFedEx != null && this.hazmatTypeFedEx.equals(other.getHazmatTypeFedEx())) && (this.accessibilityTypeFedEx == null && other.getAccessibilityTypeFedEx() == null || this.accessibilityTypeFedEx != null && this.accessibilityTypeFedEx.equals(other.getAccessibilityTypeFedEx())) && (this.isCargoAircraftOnlyFedEx == null && other.getIsCargoAircraftOnlyFedEx() == null || this.isCargoAircraftOnlyFedEx != null && this.isCargoAircraftOnlyFedEx.equals(other.getIsCargoAircraftOnlyFedEx())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.generateIntegratedShipperLabel == null && other.getGenerateIntegratedShipperLabel() == null || this.generateIntegratedShipperLabel != null && this.generateIntegratedShipperLabel.equals(other.getGenerateIntegratedShipperLabel())) && (this.shippingCost == null && other.getShippingCost() == null || this.shippingCost != null && this.shippingCost.equals(other.getShippingCost())) && (this.handlingCost == null && other.getHandlingCost() == null || this.handlingCost != null && this.handlingCost.equals(other.getHandlingCost())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.transferLocation == null && other.getTransferLocation() == null || this.transferLocation != null && this.transferLocation.equals(other.getTransferLocation())) && (this.packageList == null && other.getPackageList() == null || this.packageList != null && this.packageList.equals(other.getPackageList())) && (this.packageUpsList == null && other.getPackageUpsList() == null || this.packageUpsList != null && this.packageUpsList.equals(other.getPackageUpsList())) && (this.packageUspsList == null && other.getPackageUspsList() == null || this.packageUspsList != null && this.packageUspsList.equals(other.getPackageUspsList())) && (this.packageFedExList == null && other.getPackageFedExList() == null || this.packageFedExList != null && this.packageFedExList.equals(other.getPackageFedExList())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getRequestedBy() != null) {
            _hashCode += this.getRequestedBy().hashCode();
        }
        if (this.getCreatedFromShipGroup() != null) {
            _hashCode += this.getCreatedFromShipGroup().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
        }
        if (this.getShippingAddress() != null) {
            _hashCode += this.getShippingAddress().hashCode();
        }
        if (this.getPickedDate() != null) {
            _hashCode += this.getPickedDate().hashCode();
        }
        if (this.getPackedDate() != null) {
            _hashCode += this.getPackedDate().hashCode();
        }
        if (this.getShippedDate() != null) {
            _hashCode += this.getShippedDate().hashCode();
        }
        if (this.getShipIsResidential() != null) {
            _hashCode += this.getShipIsResidential().hashCode();
        }
        if (this.getShipAddressList() != null) {
            _hashCode += this.getShipAddressList().hashCode();
        }
        if (this.getShipStatus() != null) {
            _hashCode += this.getShipStatus().hashCode();
        }
        if (this.getSaturdayDeliveryUps() != null) {
            _hashCode += this.getSaturdayDeliveryUps().hashCode();
        }
        if (this.getSendShipNotifyEmailUps() != null) {
            _hashCode += this.getSendShipNotifyEmailUps().hashCode();
        }
        if (this.getSendBackupEmailUps() != null) {
            _hashCode += this.getSendBackupEmailUps().hashCode();
        }
        if (this.getShipNotifyEmailAddressUps() != null) {
            _hashCode += this.getShipNotifyEmailAddressUps().hashCode();
        }
        if (this.getShipNotifyEmailAddress2Ups() != null) {
            _hashCode += this.getShipNotifyEmailAddress2Ups().hashCode();
        }
        if (this.getBackupEmailAddressUps() != null) {
            _hashCode += this.getBackupEmailAddressUps().hashCode();
        }
        if (this.getShipNotifyEmailMessageUps() != null) {
            _hashCode += this.getShipNotifyEmailMessageUps().hashCode();
        }
        if (this.getThirdPartyAcctUps() != null) {
            _hashCode += this.getThirdPartyAcctUps().hashCode();
        }
        if (this.getThirdPartyZipcodeUps() != null) {
            _hashCode += this.getThirdPartyZipcodeUps().hashCode();
        }
        if (this.getThirdPartyCountryUps() != null) {
            _hashCode += this.getThirdPartyCountryUps().hashCode();
        }
        if (this.getThirdPartyTypeUps() != null) {
            _hashCode += this.getThirdPartyTypeUps().hashCode();
        }
        if (this.getPartiesToTransactionUps() != null) {
            _hashCode += this.getPartiesToTransactionUps().hashCode();
        }
        if (this.getExportTypeUps() != null) {
            _hashCode += this.getExportTypeUps().hashCode();
        }
        if (this.getMethodOfTransportUps() != null) {
            _hashCode += this.getMethodOfTransportUps().hashCode();
        }
        if (this.getCarrierIdUps() != null) {
            _hashCode += this.getCarrierIdUps().hashCode();
        }
        if (this.getEntryNumberUps() != null) {
            _hashCode += this.getEntryNumberUps().hashCode();
        }
        if (this.getInbondCodeUps() != null) {
            _hashCode += this.getInbondCodeUps().hashCode();
        }
        if (this.getIsRoutedExportTransactionUps() != null) {
            _hashCode += this.getIsRoutedExportTransactionUps().hashCode();
        }
        if (this.getLicenseNumberUps() != null) {
            _hashCode += this.getLicenseNumberUps().hashCode();
        }
        if (this.getLicenseDateUps() != null) {
            _hashCode += this.getLicenseDateUps().hashCode();
        }
        if (this.getLicenseExceptionUps() != null) {
            _hashCode += this.getLicenseExceptionUps().hashCode();
        }
        if (this.getEccNumberUps() != null) {
            _hashCode += this.getEccNumberUps().hashCode();
        }
        if (this.getRecipientTaxIdUps() != null) {
            _hashCode += this.getRecipientTaxIdUps().hashCode();
        }
        if (this.getBlanketStartDateUps() != null) {
            _hashCode += this.getBlanketStartDateUps().hashCode();
        }
        if (this.getBlanketEndDateUps() != null) {
            _hashCode += this.getBlanketEndDateUps().hashCode();
        }
        if (this.getShipmentWeightUps() != null) {
            _hashCode += this.getShipmentWeightUps().hashCode();
        }
        if (this.getSaturdayDeliveryFedEx() != null) {
            _hashCode += this.getSaturdayDeliveryFedEx().hashCode();
        }
        if (this.getSaturdayPickupFedex() != null) {
            _hashCode += this.getSaturdayPickupFedex().hashCode();
        }
        if (this.getSendShipNotifyEmailFedEx() != null) {
            _hashCode += this.getSendShipNotifyEmailFedEx().hashCode();
        }
        if (this.getSendBackupEmailFedEx() != null) {
            _hashCode += this.getSendBackupEmailFedEx().hashCode();
        }
        if (this.getSignatureHomeDeliveryFedEx() != null) {
            _hashCode += this.getSignatureHomeDeliveryFedEx().hashCode();
        }
        if (this.getShipNotifyEmailAddressFedEx() != null) {
            _hashCode += this.getShipNotifyEmailAddressFedEx().hashCode();
        }
        if (this.getBackupEmailAddressFedEx() != null) {
            _hashCode += this.getBackupEmailAddressFedEx().hashCode();
        }
        if (this.getShipDateFedEx() != null) {
            _hashCode += this.getShipDateFedEx().hashCode();
        }
        if (this.getHomeDeliveryTypeFedEx() != null) {
            _hashCode += this.getHomeDeliveryTypeFedEx().hashCode();
        }
        if (this.getHomeDeliveryDateFedEx() != null) {
            _hashCode += this.getHomeDeliveryDateFedEx().hashCode();
        }
        if (this.getBookingConfirmationNumFedEx() != null) {
            _hashCode += this.getBookingConfirmationNumFedEx().hashCode();
        }
        if (this.getIntlExemptionNumFedEx() != null) {
            _hashCode += this.getIntlExemptionNumFedEx().hashCode();
        }
        if (this.getB13AFilingOptionFedEx() != null) {
            _hashCode += this.getB13AFilingOptionFedEx().hashCode();
        }
        if (this.getB13AStatementDataFedEx() != null) {
            _hashCode += this.getB13AStatementDataFedEx().hashCode();
        }
        if (this.getThirdPartyAcctFedEx() != null) {
            _hashCode += this.getThirdPartyAcctFedEx().hashCode();
        }
        if (this.getThirdPartyCountryFedEx() != null) {
            _hashCode += this.getThirdPartyCountryFedEx().hashCode();
        }
        if (this.getThirdPartyTypeFedEx() != null) {
            _hashCode += this.getThirdPartyTypeFedEx().hashCode();
        }
        if (this.getShipmentWeightFedEx() != null) {
            _hashCode += this.getShipmentWeightFedEx().hashCode();
        }
        if (this.getTermsOfSaleFedEx() != null) {
            _hashCode += this.getTermsOfSaleFedEx().hashCode();
        }
        if (this.getTermsFreightChargeFedEx() != null) {
            _hashCode += this.getTermsFreightChargeFedEx().hashCode();
        }
        if (this.getTermsInsuranceChargeFedEx() != null) {
            _hashCode += this.getTermsInsuranceChargeFedEx().hashCode();
        }
        if (this.getInsideDeliveryFedEx() != null) {
            _hashCode += this.getInsideDeliveryFedEx().hashCode();
        }
        if (this.getInsidePickupFedEx() != null) {
            _hashCode += this.getInsidePickupFedEx().hashCode();
        }
        if (this.getAncillaryEndorsementFedEx() != null) {
            _hashCode += this.getAncillaryEndorsementFedEx().hashCode();
        }
        if (this.getHoldAtLocationFedEx() != null) {
            _hashCode += this.getHoldAtLocationFedEx().hashCode();
        }
        if (this.getHalPhoneFedEx() != null) {
            _hashCode += this.getHalPhoneFedEx().hashCode();
        }
        if (this.getHalAddr1FedEx() != null) {
            _hashCode += this.getHalAddr1FedEx().hashCode();
        }
        if (this.getHalAddr2FedEx() != null) {
            _hashCode += this.getHalAddr2FedEx().hashCode();
        }
        if (this.getHalAddr3FedEx() != null) {
            _hashCode += this.getHalAddr3FedEx().hashCode();
        }
        if (this.getHalCityFedEx() != null) {
            _hashCode += this.getHalCityFedEx().hashCode();
        }
        if (this.getHalZipFedEx() != null) {
            _hashCode += this.getHalZipFedEx().hashCode();
        }
        if (this.getHalStateFedEx() != null) {
            _hashCode += this.getHalStateFedEx().hashCode();
        }
        if (this.getHalCountryFedEx() != null) {
            _hashCode += this.getHalCountryFedEx().hashCode();
        }
        if (this.getHazmatTypeFedEx() != null) {
            _hashCode += this.getHazmatTypeFedEx().hashCode();
        }
        if (this.getAccessibilityTypeFedEx() != null) {
            _hashCode += this.getAccessibilityTypeFedEx().hashCode();
        }
        if (this.getIsCargoAircraftOnlyFedEx() != null) {
            _hashCode += this.getIsCargoAircraftOnlyFedEx().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getShipMethod() != null) {
            _hashCode += this.getShipMethod().hashCode();
        }
        if (this.getGenerateIntegratedShipperLabel() != null) {
            _hashCode += this.getGenerateIntegratedShipperLabel().hashCode();
        }
        if (this.getShippingCost() != null) {
            _hashCode += this.getShippingCost().hashCode();
        }
        if (this.getHandlingCost() != null) {
            _hashCode += this.getHandlingCost().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getTransferLocation() != null) {
            _hashCode += this.getTransferLocation().hashCode();
        }
        if (this.getPackageList() != null) {
            _hashCode += this.getPackageList().hashCode();
        }
        if (this.getPackageUpsList() != null) {
            _hashCode += this.getPackageUpsList().hashCode();
        }
        if (this.getPackageUspsList() != null) {
            _hashCode += this.getPackageUspsList().hashCode();
        }
        if (this.getPackageFedExList() != null) {
            _hashCode += this.getPackageFedExList().hashCode();
        }
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        this.__hashCodeCalc = false;
        return _hashCode;
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new BeanSerializer(_javaType, _xmlType, typeDesc);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new BeanDeserializer(_javaType, _xmlType, typeDesc);
    }

    static {
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillment"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedBy");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "requestedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFromShipGroup");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdFromShipGroup"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pickedDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "pickedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packedDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippedDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipIsResidential");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipIsResidential"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipStatus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipStatus"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentShipStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saturdayDeliveryUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "saturdayDeliveryUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendShipNotifyEmailUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "sendShipNotifyEmailUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendBackupEmailUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "sendBackupEmailUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipNotifyEmailAddressUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipNotifyEmailAddressUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipNotifyEmailAddress2Ups");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipNotifyEmailAddress2Ups"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("backupEmailAddressUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "backupEmailAddressUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipNotifyEmailMessageUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipNotifyEmailMessageUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyAcctUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "thirdPartyAcctUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyZipcodeUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "thirdPartyZipcodeUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyCountryUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "thirdPartyCountryUps"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyTypeUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "thirdPartyTypeUps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partiesToTransactionUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "partiesToTransactionUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exportTypeUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "exportTypeUps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentExportTypeUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("methodOfTransportUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "methodOfTransportUps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentMethodOfTransportUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("carrierIdUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "carrierIdUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entryNumberUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "entryNumberUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inbondCodeUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "inbondCodeUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isRoutedExportTransactionUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isRoutedExportTransactionUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("licenseNumberUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "licenseNumberUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("licenseDateUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "licenseDateUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("licenseExceptionUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "licenseExceptionUps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentLicenseExceptionUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eccNumberUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "eccNumberUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipientTaxIdUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "recipientTaxIdUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("blanketStartDateUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "blanketStartDateUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("blanketEndDateUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "blanketEndDateUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipmentWeightUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipmentWeightUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saturdayDeliveryFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "saturdayDeliveryFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saturdayPickupFedex");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "saturdayPickupFedex"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendShipNotifyEmailFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "sendShipNotifyEmailFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendBackupEmailFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "sendBackupEmailFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("signatureHomeDeliveryFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "signatureHomeDeliveryFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipNotifyEmailAddressFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipNotifyEmailAddressFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("backupEmailAddressFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "backupEmailAddressFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipDateFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipDateFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("homeDeliveryTypeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "homeDeliveryTypeFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentHomeDeliveryTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("homeDeliveryDateFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "homeDeliveryDateFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bookingConfirmationNumFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "bookingConfirmationNumFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intlExemptionNumFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "intlExemptionNumFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("b13AFilingOptionFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "b13aFilingOptionFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentB13AFilingOptionFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("b13AStatementDataFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "b13aStatementDataFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyAcctFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "thirdPartyAcctFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyCountryFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "thirdPartyCountryFedEx"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyTypeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "thirdPartyTypeFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipmentWeightFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipmentWeightFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("termsOfSaleFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "termsOfSaleFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentTermsOfSaleFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("termsFreightChargeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "termsFreightChargeFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("termsInsuranceChargeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "termsInsuranceChargeFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("insideDeliveryFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "insideDeliveryFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("insidePickupFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "insidePickupFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ancillaryEndorsementFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ancillaryEndorsementFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentAncillaryEndorsementFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("holdAtLocationFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "holdAtLocationFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("halPhoneFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "halPhoneFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("halAddr1FedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "halAddr1FedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("halAddr2FedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "halAddr2FedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("halAddr3FedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "halAddr3FedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("halCityFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "halCityFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("halZipFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "halZipFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("halStateFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "halStateFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("halCountryFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "halCountryFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hazmatTypeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "hazmatTypeFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentHazmatTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accessibilityTypeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accessibilityTypeFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentAccessibilityTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isCargoAircraftOnlyFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isCargoAircraftOnlyFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("generateIntegratedShipperLabel");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "generateIntegratedShipperLabel"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageUpsList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageUpsList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageUspsList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageUspsList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageFedExList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageFedExList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

