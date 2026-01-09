/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField accBookRevRecForecastRule;
    private SearchMultiSelectField account;
    private SearchMultiSelectField accountingBook;
    private SearchMultiSelectField accountingBookAmortization;
    private SearchMultiSelectField accountingBookCreatePlansOn;
    private SearchMultiSelectField accountingBookRevRecRule;
    private SearchMultiSelectField accountingBookRevRecSchedule;
    private SearchMultiSelectField allowedShippingMethod;
    private SearchMultiSelectField alternateDemandSourceItem;
    private SearchDoubleField atpLeadTime;
    private SearchEnumMultiSelectField atpMethod;
    private SearchBooleanField autoLeadTime;
    private SearchBooleanField autoPreferredStockLevel;
    private SearchBooleanField autoReorderPoint;
    private SearchBooleanField availableToPartners;
    private SearchDoubleField averageCost;
    private SearchLongField backwardConsumptionDays;
    private SearchStringField binNumber;
    private SearchDoubleField binOnHandAvail;
    private SearchDoubleField binOnHandCount;
    private SearchDoubleField bomQuantity;
    private SearchBooleanField buildEntireAssembly;
    private SearchDoubleField buildTime;
    private SearchDoubleField buildTimeLotSize;
    private SearchDoubleField buyItNowPrice;
    private SearchStringField caption;
    private SearchMultiSelectField category;
    private SearchMultiSelectField _class;
    private SearchMultiSelectField component;
    private SearchMultiSelectField componentOf;
    private SearchDoubleField componentYield;
    private SearchMultiSelectField consumptionUnit;
    private SearchBooleanField contingentRevenueHandling;
    private SearchDoubleField conversionRate;
    private SearchBooleanField copyDescription;
    private SearchMultiSelectField correlatedItem;
    private SearchDoubleField correlatedItemCorrelation;
    private SearchLongField correlatedItemCount;
    private SearchDoubleField correlatedItemLift;
    private SearchDoubleField correlatedItemPurchaseRate;
    private SearchDoubleField cost;
    private SearchEnumMultiSelectField costAccountingStatus;
    private SearchMultiSelectField costCategory;
    private SearchDoubleField costEstimate;
    private SearchEnumMultiSelectField costEstimateType;
    private SearchEnumMultiSelectField costingMethod;
    private SearchEnumMultiSelectField countryOfManufacture;
    private SearchDateField created;
    private SearchBooleanField createJob;
    private SearchMultiSelectField createRevenuePlansOn;
    private SearchDateField dateViewed;
    private SearchDoubleField daysBeforeExpiration;
    private SearchDoubleField defaultReturnCost;
    private SearchMultiSelectField defaultShippingMethod;
    private SearchBooleanField deferRevRec;
    private SearchDoubleField demandModifier;
    private SearchEnumMultiSelectField demandSource;
    private SearchLongField demandTimeFence;
    private SearchMultiSelectField department;
    private SearchBooleanField directRevenuePosting;
    private SearchBooleanField displayIneBayStore;
    private SearchStringField displayName;
    private SearchMultiSelectField distributionCategory;
    private SearchMultiSelectField distributionNetwork;
    private SearchBooleanField dontShowPrice;
    private SearchStringField eBayItemDescription;
    private SearchStringField eBayItemSubtitle;
    private SearchStringField eBayItemTitle;
    private SearchEnumMultiSelectField ebayRelistingOption;
    private SearchEnumMultiSelectField effectiveBomControl;
    private SearchDateField effectiveDate;
    private SearchMultiSelectField effectiveRevision;
    private SearchBooleanField enableCatchWeight;
    private SearchBooleanField endAuctionsWhenOutOfStock;
    private SearchBooleanField excludeFromSitemap;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchStringField featuredDescription;
    private SearchStringField feedDescription;
    private SearchStringField feedName;
    private SearchDoubleField fixedBuildTime;
    private SearchDoubleField fixedLotSize;
    private SearchLongField forwardConsumptionDays;
    private SearchEnumMultiSelectField fraudRisk;
    private SearchBooleanField froogleProductFeed;
    private SearchLongField futureHorizon;
    private SearchDoubleField fxCost;
    private SearchBooleanField generateAccruals;
    private SearchStringField giftCertAuthCode;
    private SearchStringField giftCertEmail;
    private SearchDateField giftCertExpDate;
    private SearchStringField giftCertFrom;
    private SearchStringField giftCertMsg;
    private SearchStringField giftCertOrigAmt;
    private SearchStringField giftCertRecipient;
    private SearchMultiSelectField hierarchyNode;
    private SearchMultiSelectField hierarchyVersion;
    private SearchStringField imageUrl;
    private SearchBooleanField includeChildren;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchMultiSelectField inventoryLocation;
    private SearchEnumMultiSelectField invtClassification;
    private SearchLongField invtCountInterval;
    private SearchBooleanField isAvailable;
    private SearchBooleanField isDropShipItem;
    private SearchBooleanField isFulfillable;
    private SearchBooleanField isGcoCompliant;
    private SearchBooleanField isInactive;
    private SearchBooleanField isLotItem;
    private SearchBooleanField isOnline;
    private SearchBooleanField isPreferredVendor;
    private SearchBooleanField isSerialItem;
    private SearchBooleanField isSpecialOrderItem;
    private SearchBooleanField isSpecialWorkOrderItem;
    private SearchBooleanField isStorePickupAllowed;
    private SearchMultiSelectField issueProduct;
    private SearchBooleanField isTaxable;
    private SearchBooleanField isVsoeBundle;
    private SearchBooleanField isWip;
    private SearchStringField itemId;
    private SearchMultiSelectField itemRevenueCategory;
    private SearchStringField itemUrl;
    private SearchDateField lastInvtCountDate;
    private SearchDateField lastModifiedDate;
    private SearchDoubleField lastPurchasePrice;
    private SearchDateField lastQuantityAvailableChange;
    private SearchLongField leadTime;
    private SearchEnumMultiSelectField listingDuration;
    private SearchMultiSelectField location;
    private SearchBooleanField locationAllowStorePickup;
    private SearchDoubleField locationAtpLeadTime;
    private SearchDoubleField locationAverageCost;
    private SearchDoubleField locationBuildTime;
    private SearchDoubleField locationCost;
    private SearchEnumMultiSelectField locationCostAccountingStatus;
    private SearchDoubleField locationDefaultReturnCost;
    private SearchEnumMultiSelectField locationDemandSource;
    private SearchLongField locationDemandTimeFence;
    private SearchDoubleField locationFixedLotSize;
    private SearchMultiSelectField locationInventoryCostTemplate;
    private SearchEnumMultiSelectField locationInvtClassification;
    private SearchLongField locationInvtCountInterval;
    private SearchDateField locationLastInvtCountDate;
    private SearchLongField locationLeadTime;
    private SearchDateField locationNextInvtCountDate;
    private SearchLongField locationPeriodicLotSizeDays;
    private SearchEnumMultiSelectField locationPeriodicLotSizeType;
    private SearchDoubleField locationPreferredStockLevel;
    private SearchDoubleField locationQtyAvailForStorePickup;
    private SearchDoubleField locationQuantityAvailable;
    private SearchDoubleField locationQuantityBackOrdered;
    private SearchDoubleField locationQuantityCommitted;
    private SearchDoubleField locationQuantityInTransit;
    private SearchDoubleField locationQuantityOnHand;
    private SearchDoubleField locationQuantityOnOrder;
    private SearchDoubleField locationReorderPoint;
    private SearchLongField locationRescheduleInDays;
    private SearchLongField locationRescheduleOutDays;
    private SearchDoubleField locationSafetyStockLevel;
    private SearchDoubleField locationStorePickupBufferStock;
    private SearchEnumMultiSelectField locationSupplyLotSizingMethod;
    private SearchLongField locationSupplyTimeFence;
    private SearchEnumMultiSelectField locationSupplyType;
    private SearchDoubleField locationTotalValue;
    private SearchLongField locBackwardConsumptionDays;
    private SearchLongField locForwardConsumptionDays;
    private SearchDoubleField lowerWarningLimit;
    private SearchStringField manufacturer;
    private SearchStringField manufactureraddr1;
    private SearchStringField manufacturerCity;
    private SearchStringField manufacturerState;
    private SearchStringField manufacturerTariff;
    private SearchStringField manufacturerTaxId;
    private SearchStringField manufacturerZip;
    private SearchBooleanField manufacturingChargeItem;
    private SearchBooleanField matchBillToReceipt;
    private SearchBooleanField matrix;
    private SearchBooleanField matrixChild;
    private SearchLongField maximumQuantity;
    private SearchStringField metaTagHtml;
    private SearchLongField minimumQuantity;
    private SearchBooleanField mossApplies;
    private SearchStringField mpn;
    private SearchBooleanField multManufactureAddr;
    private SearchStringField nexTagCategory;
    private SearchBooleanField nexTagProductFeed;
    private SearchDateField nextInvtCountDate;
    private SearchLongField numActiveListings;
    private SearchDoubleField numberAllowedDownloads;
    private SearchLongField numCurrentlyListed;
    private SearchDateField obsoleteDate;
    private SearchMultiSelectField obsoleteRevision;
    private SearchBooleanField offerSupport;
    private SearchDoubleField onlineCustomerPrice;
    private SearchBooleanField onSpecial;
    private SearchMultiSelectField otherVendor;
    private SearchMultiSelectField outOfStockBehavior;
    private SearchEnumMultiSelectField overallQuantityPricingType;
    private SearchEnumMultiSelectField overheadType;
    private SearchStringField pageTitle;
    private SearchMultiSelectField parent;
    private SearchLongField periodicLotSizeDays;
    private SearchEnumMultiSelectField periodicLotSizeType;
    private SearchMultiSelectField planningItemCategory;
    private SearchStringField preferenceCriterion;
    private SearchBooleanField preferredBin;
    private SearchMultiSelectField preferredLocation;
    private SearchDoubleField preferredStockLevel;
    private SearchLongField preferredStockLevelDays;
    private SearchDoubleField price;
    private SearchBooleanField pricesIncludeTax;
    private SearchMultiSelectField pricingGroup;
    private SearchLongField primaryCategory;
    private SearchDoubleField purchaseOrderAmount;
    private SearchDoubleField purchaseOrderQuantity;
    private SearchDoubleField purchaseOrderQuantityDiff;
    private SearchMultiSelectField purchaseUnit;
    private SearchDoubleField quantityAvailable;
    private SearchDoubleField quantityBackOrdered;
    private SearchDoubleField quantityCommitted;
    private SearchDoubleField quantityOnHand;
    private SearchDoubleField quantityOnOrder;
    private SearchMultiSelectField quantityPricingSchedule;
    private SearchDoubleField receiptAmount;
    private SearchDoubleField receiptQuantity;
    private SearchDoubleField receiptQuantityDiff;
    private SearchLongField reorderMultiple;
    private SearchDoubleField reorderPoint;
    private SearchLongField rescheduleInDays;
    private SearchLongField rescheduleOutDays;
    private SearchDoubleField reservePrice;
    private SearchMultiSelectField revenueAllocationGroup;
    private SearchMultiSelectField revenueRecognitionRule;
    private SearchMultiSelectField revRecForecastRule;
    private SearchMultiSelectField revRecSchedule;
    private SearchBooleanField roundUpAsComponent;
    private SearchDoubleField safetyStockLevel;
    private SearchLongField safetyStockLevelDays;
    private SearchStringField salesDescription;
    private SearchMultiSelectField saleUnit;
    private SearchBooleanField sameAsPrimaryBookAmortization;
    private SearchBooleanField sameAsPrimaryBookRevRec;
    private SearchEnumMultiSelectField scheduleBCode;
    private SearchStringField scheduleBNumber;
    private SearchStringField scheduleBQuantity;
    private SearchStringField searchKeywords;
    private SearchBooleanField seasonalDemand;
    private SearchMultiSelectField secondaryConsumptionUnit;
    private SearchMultiSelectField secondaryPurchaseUnit;
    private SearchMultiSelectField secondarySaleUnit;
    private SearchMultiSelectField secondaryStockUnit;
    private SearchMultiSelectField secondaryUnitsType;
    private SearchBooleanField sellOnEBay;
    private SearchStringField serialNumber;
    private SearchMultiSelectField serialNumberLocation;
    private SearchBooleanField shipIndividually;
    private SearchMultiSelectField shipPackage;
    private SearchEnumMultiSelectField shippingCarrier;
    private SearchDoubleField shippingRate;
    private SearchStringField shoppingDotComCategory;
    private SearchBooleanField shoppingProductFeed;
    private SearchLongField shopzillaCategoryId;
    private SearchBooleanField shopzillaProductFeed;
    private SearchEnumMultiSelectField sitemapPriority;
    private SearchMultiSelectField softDescriptor;
    private SearchDoubleField startingPrice;
    private SearchStringField stockDescription;
    private SearchMultiSelectField stockUnit;
    private SearchStringField storeDescription;
    private SearchMultiSelectField subsidiary;
    private SearchEnumMultiSelectField subType;
    private SearchEnumMultiSelectField supplyLotSizingMethod;
    private SearchEnumMultiSelectField supplyReplenishmentMethod;
    private SearchLongField supplyTimeFence;
    private SearchEnumMultiSelectField supplyType;
    private SearchMultiSelectField taxCode;
    private SearchMultiSelectField taxSchedule;
    private SearchStringField thumbnailUrl;
    private SearchDoubleField totalValue;
    private SearchBooleanField trackLandedCost;
    private SearchDoubleField transferPrice;
    private SearchEnumMultiSelectField type;
    private SearchMultiSelectField unitsType;
    private SearchStringField upcCode;
    private SearchDoubleField upperWarningLimit;
    private SearchStringField urlComponent;
    private SearchBooleanField useBins;
    private SearchBooleanField useComponentYield;
    private SearchBooleanField useMarginalRates;
    private SearchMultiSelectField vendor;
    private SearchStringField vendorCode;
    private SearchDoubleField vendorCost;
    private SearchDoubleField vendorCostEntered;
    private SearchStringField vendorName;
    private SearchMultiSelectField vendorPriceCurrency;
    private SearchEnumMultiSelectField vsoeDeferral;
    private SearchBooleanField vsoeDelivered;
    private SearchEnumMultiSelectField vsoePermitDiscount;
    private SearchDoubleField vsoePrice;
    private SearchEnumMultiSelectField vsoeSopGroup;
    private SearchMultiSelectField webSite;
    private SearchDoubleField weight;
    private SearchBooleanField yahooProductFeed;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemSearchBasic.class, true);

    public SearchMultiSelectField getAccBookRevRecForecastRule() {
        return this.accBookRevRecForecastRule;
    }

    public void setAccBookRevRecForecastRule(SearchMultiSelectField accBookRevRecForecastRule) {
        this.accBookRevRecForecastRule = accBookRevRecForecastRule;
    }

    public SearchMultiSelectField getAccount() {
        return this.account;
    }

    public void setAccount(SearchMultiSelectField account) {
        this.account = account;
    }

    public SearchMultiSelectField getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchMultiSelectField getAccountingBookAmortization() {
        return this.accountingBookAmortization;
    }

    public void setAccountingBookAmortization(SearchMultiSelectField accountingBookAmortization) {
        this.accountingBookAmortization = accountingBookAmortization;
    }

    public SearchMultiSelectField getAccountingBookCreatePlansOn() {
        return this.accountingBookCreatePlansOn;
    }

    public void setAccountingBookCreatePlansOn(SearchMultiSelectField accountingBookCreatePlansOn) {
        this.accountingBookCreatePlansOn = accountingBookCreatePlansOn;
    }

    public SearchMultiSelectField getAccountingBookRevRecRule() {
        return this.accountingBookRevRecRule;
    }

    public void setAccountingBookRevRecRule(SearchMultiSelectField accountingBookRevRecRule) {
        this.accountingBookRevRecRule = accountingBookRevRecRule;
    }

    public SearchMultiSelectField getAccountingBookRevRecSchedule() {
        return this.accountingBookRevRecSchedule;
    }

    public void setAccountingBookRevRecSchedule(SearchMultiSelectField accountingBookRevRecSchedule) {
        this.accountingBookRevRecSchedule = accountingBookRevRecSchedule;
    }

    public SearchMultiSelectField getAllowedShippingMethod() {
        return this.allowedShippingMethod;
    }

    public void setAllowedShippingMethod(SearchMultiSelectField allowedShippingMethod) {
        this.allowedShippingMethod = allowedShippingMethod;
    }

    public SearchMultiSelectField getAlternateDemandSourceItem() {
        return this.alternateDemandSourceItem;
    }

    public void setAlternateDemandSourceItem(SearchMultiSelectField alternateDemandSourceItem) {
        this.alternateDemandSourceItem = alternateDemandSourceItem;
    }

    public SearchDoubleField getAtpLeadTime() {
        return this.atpLeadTime;
    }

    public void setAtpLeadTime(SearchDoubleField atpLeadTime) {
        this.atpLeadTime = atpLeadTime;
    }

    public SearchEnumMultiSelectField getAtpMethod() {
        return this.atpMethod;
    }

    public void setAtpMethod(SearchEnumMultiSelectField atpMethod) {
        this.atpMethod = atpMethod;
    }

    public SearchBooleanField getAutoLeadTime() {
        return this.autoLeadTime;
    }

    public void setAutoLeadTime(SearchBooleanField autoLeadTime) {
        this.autoLeadTime = autoLeadTime;
    }

    public SearchBooleanField getAutoPreferredStockLevel() {
        return this.autoPreferredStockLevel;
    }

    public void setAutoPreferredStockLevel(SearchBooleanField autoPreferredStockLevel) {
        this.autoPreferredStockLevel = autoPreferredStockLevel;
    }

    public SearchBooleanField getAutoReorderPoint() {
        return this.autoReorderPoint;
    }

    public void setAutoReorderPoint(SearchBooleanField autoReorderPoint) {
        this.autoReorderPoint = autoReorderPoint;
    }

    public SearchBooleanField getAvailableToPartners() {
        return this.availableToPartners;
    }

    public void setAvailableToPartners(SearchBooleanField availableToPartners) {
        this.availableToPartners = availableToPartners;
    }

    public SearchDoubleField getAverageCost() {
        return this.averageCost;
    }

    public void setAverageCost(SearchDoubleField averageCost) {
        this.averageCost = averageCost;
    }

    public SearchLongField getBackwardConsumptionDays() {
        return this.backwardConsumptionDays;
    }

    public void setBackwardConsumptionDays(SearchLongField backwardConsumptionDays) {
        this.backwardConsumptionDays = backwardConsumptionDays;
    }

    public SearchStringField getBinNumber() {
        return this.binNumber;
    }

    public void setBinNumber(SearchStringField binNumber) {
        this.binNumber = binNumber;
    }

    public SearchDoubleField getBinOnHandAvail() {
        return this.binOnHandAvail;
    }

    public void setBinOnHandAvail(SearchDoubleField binOnHandAvail) {
        this.binOnHandAvail = binOnHandAvail;
    }

    public SearchDoubleField getBinOnHandCount() {
        return this.binOnHandCount;
    }

    public void setBinOnHandCount(SearchDoubleField binOnHandCount) {
        this.binOnHandCount = binOnHandCount;
    }

    public SearchDoubleField getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(SearchDoubleField bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public SearchBooleanField getBuildEntireAssembly() {
        return this.buildEntireAssembly;
    }

    public void setBuildEntireAssembly(SearchBooleanField buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }

    public SearchDoubleField getBuildTime() {
        return this.buildTime;
    }

    public void setBuildTime(SearchDoubleField buildTime) {
        this.buildTime = buildTime;
    }

    public SearchDoubleField getBuildTimeLotSize() {
        return this.buildTimeLotSize;
    }

    public void setBuildTimeLotSize(SearchDoubleField buildTimeLotSize) {
        this.buildTimeLotSize = buildTimeLotSize;
    }

    public SearchDoubleField getBuyItNowPrice() {
        return this.buyItNowPrice;
    }

    public void setBuyItNowPrice(SearchDoubleField buyItNowPrice) {
        this.buyItNowPrice = buyItNowPrice;
    }

    public SearchStringField getCaption() {
        return this.caption;
    }

    public void setCaption(SearchStringField caption) {
        this.caption = caption;
    }

    public SearchMultiSelectField getCategory() {
        return this.category;
    }

    public void setCategory(SearchMultiSelectField category) {
        this.category = category;
    }

    public SearchMultiSelectField get_class() {
        return this._class;
    }

    public void set_class(SearchMultiSelectField _class) {
        this._class = _class;
    }

    public SearchMultiSelectField getComponent() {
        return this.component;
    }

    public void setComponent(SearchMultiSelectField component) {
        this.component = component;
    }

    public SearchMultiSelectField getComponentOf() {
        return this.componentOf;
    }

    public void setComponentOf(SearchMultiSelectField componentOf) {
        this.componentOf = componentOf;
    }

    public SearchDoubleField getComponentYield() {
        return this.componentYield;
    }

    public void setComponentYield(SearchDoubleField componentYield) {
        this.componentYield = componentYield;
    }

    public SearchMultiSelectField getConsumptionUnit() {
        return this.consumptionUnit;
    }

    public void setConsumptionUnit(SearchMultiSelectField consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }

    public SearchBooleanField getContingentRevenueHandling() {
        return this.contingentRevenueHandling;
    }

    public void setContingentRevenueHandling(SearchBooleanField contingentRevenueHandling) {
        this.contingentRevenueHandling = contingentRevenueHandling;
    }

    public SearchDoubleField getConversionRate() {
        return this.conversionRate;
    }

    public void setConversionRate(SearchDoubleField conversionRate) {
        this.conversionRate = conversionRate;
    }

    public SearchBooleanField getCopyDescription() {
        return this.copyDescription;
    }

    public void setCopyDescription(SearchBooleanField copyDescription) {
        this.copyDescription = copyDescription;
    }

    public SearchMultiSelectField getCorrelatedItem() {
        return this.correlatedItem;
    }

    public void setCorrelatedItem(SearchMultiSelectField correlatedItem) {
        this.correlatedItem = correlatedItem;
    }

    public SearchDoubleField getCorrelatedItemCorrelation() {
        return this.correlatedItemCorrelation;
    }

    public void setCorrelatedItemCorrelation(SearchDoubleField correlatedItemCorrelation) {
        this.correlatedItemCorrelation = correlatedItemCorrelation;
    }

    public SearchLongField getCorrelatedItemCount() {
        return this.correlatedItemCount;
    }

    public void setCorrelatedItemCount(SearchLongField correlatedItemCount) {
        this.correlatedItemCount = correlatedItemCount;
    }

    public SearchDoubleField getCorrelatedItemLift() {
        return this.correlatedItemLift;
    }

    public void setCorrelatedItemLift(SearchDoubleField correlatedItemLift) {
        this.correlatedItemLift = correlatedItemLift;
    }

    public SearchDoubleField getCorrelatedItemPurchaseRate() {
        return this.correlatedItemPurchaseRate;
    }

    public void setCorrelatedItemPurchaseRate(SearchDoubleField correlatedItemPurchaseRate) {
        this.correlatedItemPurchaseRate = correlatedItemPurchaseRate;
    }

    public SearchDoubleField getCost() {
        return this.cost;
    }

    public void setCost(SearchDoubleField cost) {
        this.cost = cost;
    }

    public SearchEnumMultiSelectField getCostAccountingStatus() {
        return this.costAccountingStatus;
    }

    public void setCostAccountingStatus(SearchEnumMultiSelectField costAccountingStatus) {
        this.costAccountingStatus = costAccountingStatus;
    }

    public SearchMultiSelectField getCostCategory() {
        return this.costCategory;
    }

    public void setCostCategory(SearchMultiSelectField costCategory) {
        this.costCategory = costCategory;
    }

    public SearchDoubleField getCostEstimate() {
        return this.costEstimate;
    }

    public void setCostEstimate(SearchDoubleField costEstimate) {
        this.costEstimate = costEstimate;
    }

    public SearchEnumMultiSelectField getCostEstimateType() {
        return this.costEstimateType;
    }

    public void setCostEstimateType(SearchEnumMultiSelectField costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public SearchEnumMultiSelectField getCostingMethod() {
        return this.costingMethod;
    }

    public void setCostingMethod(SearchEnumMultiSelectField costingMethod) {
        this.costingMethod = costingMethod;
    }

    public SearchEnumMultiSelectField getCountryOfManufacture() {
        return this.countryOfManufacture;
    }

    public void setCountryOfManufacture(SearchEnumMultiSelectField countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public SearchDateField getCreated() {
        return this.created;
    }

    public void setCreated(SearchDateField created) {
        this.created = created;
    }

    public SearchBooleanField getCreateJob() {
        return this.createJob;
    }

    public void setCreateJob(SearchBooleanField createJob) {
        this.createJob = createJob;
    }

    public SearchMultiSelectField getCreateRevenuePlansOn() {
        return this.createRevenuePlansOn;
    }

    public void setCreateRevenuePlansOn(SearchMultiSelectField createRevenuePlansOn) {
        this.createRevenuePlansOn = createRevenuePlansOn;
    }

    public SearchDateField getDateViewed() {
        return this.dateViewed;
    }

    public void setDateViewed(SearchDateField dateViewed) {
        this.dateViewed = dateViewed;
    }

    public SearchDoubleField getDaysBeforeExpiration() {
        return this.daysBeforeExpiration;
    }

    public void setDaysBeforeExpiration(SearchDoubleField daysBeforeExpiration) {
        this.daysBeforeExpiration = daysBeforeExpiration;
    }

    public SearchDoubleField getDefaultReturnCost() {
        return this.defaultReturnCost;
    }

    public void setDefaultReturnCost(SearchDoubleField defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }

    public SearchMultiSelectField getDefaultShippingMethod() {
        return this.defaultShippingMethod;
    }

    public void setDefaultShippingMethod(SearchMultiSelectField defaultShippingMethod) {
        this.defaultShippingMethod = defaultShippingMethod;
    }

    public SearchBooleanField getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(SearchBooleanField deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public SearchDoubleField getDemandModifier() {
        return this.demandModifier;
    }

    public void setDemandModifier(SearchDoubleField demandModifier) {
        this.demandModifier = demandModifier;
    }

    public SearchEnumMultiSelectField getDemandSource() {
        return this.demandSource;
    }

    public void setDemandSource(SearchEnumMultiSelectField demandSource) {
        this.demandSource = demandSource;
    }

    public SearchLongField getDemandTimeFence() {
        return this.demandTimeFence;
    }

    public void setDemandTimeFence(SearchLongField demandTimeFence) {
        this.demandTimeFence = demandTimeFence;
    }

    public SearchMultiSelectField getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchMultiSelectField department) {
        this.department = department;
    }

    public SearchBooleanField getDirectRevenuePosting() {
        return this.directRevenuePosting;
    }

    public void setDirectRevenuePosting(SearchBooleanField directRevenuePosting) {
        this.directRevenuePosting = directRevenuePosting;
    }

    public SearchBooleanField getDisplayIneBayStore() {
        return this.displayIneBayStore;
    }

    public void setDisplayIneBayStore(SearchBooleanField displayIneBayStore) {
        this.displayIneBayStore = displayIneBayStore;
    }

    public SearchStringField getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(SearchStringField displayName) {
        this.displayName = displayName;
    }

    public SearchMultiSelectField getDistributionCategory() {
        return this.distributionCategory;
    }

    public void setDistributionCategory(SearchMultiSelectField distributionCategory) {
        this.distributionCategory = distributionCategory;
    }

    public SearchMultiSelectField getDistributionNetwork() {
        return this.distributionNetwork;
    }

    public void setDistributionNetwork(SearchMultiSelectField distributionNetwork) {
        this.distributionNetwork = distributionNetwork;
    }

    public SearchBooleanField getDontShowPrice() {
        return this.dontShowPrice;
    }

    public void setDontShowPrice(SearchBooleanField dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }

    public SearchStringField getEBayItemDescription() {
        return this.eBayItemDescription;
    }

    public void setEBayItemDescription(SearchStringField eBayItemDescription) {
        this.eBayItemDescription = eBayItemDescription;
    }

    public SearchStringField getEBayItemSubtitle() {
        return this.eBayItemSubtitle;
    }

    public void setEBayItemSubtitle(SearchStringField eBayItemSubtitle) {
        this.eBayItemSubtitle = eBayItemSubtitle;
    }

    public SearchStringField getEBayItemTitle() {
        return this.eBayItemTitle;
    }

    public void setEBayItemTitle(SearchStringField eBayItemTitle) {
        this.eBayItemTitle = eBayItemTitle;
    }

    public SearchEnumMultiSelectField getEbayRelistingOption() {
        return this.ebayRelistingOption;
    }

    public void setEbayRelistingOption(SearchEnumMultiSelectField ebayRelistingOption) {
        this.ebayRelistingOption = ebayRelistingOption;
    }

    public SearchEnumMultiSelectField getEffectiveBomControl() {
        return this.effectiveBomControl;
    }

    public void setEffectiveBomControl(SearchEnumMultiSelectField effectiveBomControl) {
        this.effectiveBomControl = effectiveBomControl;
    }

    public SearchDateField getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(SearchDateField effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public SearchMultiSelectField getEffectiveRevision() {
        return this.effectiveRevision;
    }

    public void setEffectiveRevision(SearchMultiSelectField effectiveRevision) {
        this.effectiveRevision = effectiveRevision;
    }

    public SearchBooleanField getEnableCatchWeight() {
        return this.enableCatchWeight;
    }

    public void setEnableCatchWeight(SearchBooleanField enableCatchWeight) {
        this.enableCatchWeight = enableCatchWeight;
    }

    public SearchBooleanField getEndAuctionsWhenOutOfStock() {
        return this.endAuctionsWhenOutOfStock;
    }

    public void setEndAuctionsWhenOutOfStock(SearchBooleanField endAuctionsWhenOutOfStock) {
        this.endAuctionsWhenOutOfStock = endAuctionsWhenOutOfStock;
    }

    public SearchBooleanField getExcludeFromSitemap() {
        return this.excludeFromSitemap;
    }

    public void setExcludeFromSitemap(SearchBooleanField excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchStringField getFeaturedDescription() {
        return this.featuredDescription;
    }

    public void setFeaturedDescription(SearchStringField featuredDescription) {
        this.featuredDescription = featuredDescription;
    }

    public SearchStringField getFeedDescription() {
        return this.feedDescription;
    }

    public void setFeedDescription(SearchStringField feedDescription) {
        this.feedDescription = feedDescription;
    }

    public SearchStringField getFeedName() {
        return this.feedName;
    }

    public void setFeedName(SearchStringField feedName) {
        this.feedName = feedName;
    }

    public SearchDoubleField getFixedBuildTime() {
        return this.fixedBuildTime;
    }

    public void setFixedBuildTime(SearchDoubleField fixedBuildTime) {
        this.fixedBuildTime = fixedBuildTime;
    }

    public SearchDoubleField getFixedLotSize() {
        return this.fixedLotSize;
    }

    public void setFixedLotSize(SearchDoubleField fixedLotSize) {
        this.fixedLotSize = fixedLotSize;
    }

    public SearchLongField getForwardConsumptionDays() {
        return this.forwardConsumptionDays;
    }

    public void setForwardConsumptionDays(SearchLongField forwardConsumptionDays) {
        this.forwardConsumptionDays = forwardConsumptionDays;
    }

    public SearchEnumMultiSelectField getFraudRisk() {
        return this.fraudRisk;
    }

    public void setFraudRisk(SearchEnumMultiSelectField fraudRisk) {
        this.fraudRisk = fraudRisk;
    }

    public SearchBooleanField getFroogleProductFeed() {
        return this.froogleProductFeed;
    }

    public void setFroogleProductFeed(SearchBooleanField froogleProductFeed) {
        this.froogleProductFeed = froogleProductFeed;
    }

    public SearchLongField getFutureHorizon() {
        return this.futureHorizon;
    }

    public void setFutureHorizon(SearchLongField futureHorizon) {
        this.futureHorizon = futureHorizon;
    }

    public SearchDoubleField getFxCost() {
        return this.fxCost;
    }

    public void setFxCost(SearchDoubleField fxCost) {
        this.fxCost = fxCost;
    }

    public SearchBooleanField getGenerateAccruals() {
        return this.generateAccruals;
    }

    public void setGenerateAccruals(SearchBooleanField generateAccruals) {
        this.generateAccruals = generateAccruals;
    }

    public SearchStringField getGiftCertAuthCode() {
        return this.giftCertAuthCode;
    }

    public void setGiftCertAuthCode(SearchStringField giftCertAuthCode) {
        this.giftCertAuthCode = giftCertAuthCode;
    }

    public SearchStringField getGiftCertEmail() {
        return this.giftCertEmail;
    }

    public void setGiftCertEmail(SearchStringField giftCertEmail) {
        this.giftCertEmail = giftCertEmail;
    }

    public SearchDateField getGiftCertExpDate() {
        return this.giftCertExpDate;
    }

    public void setGiftCertExpDate(SearchDateField giftCertExpDate) {
        this.giftCertExpDate = giftCertExpDate;
    }

    public SearchStringField getGiftCertFrom() {
        return this.giftCertFrom;
    }

    public void setGiftCertFrom(SearchStringField giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }

    public SearchStringField getGiftCertMsg() {
        return this.giftCertMsg;
    }

    public void setGiftCertMsg(SearchStringField giftCertMsg) {
        this.giftCertMsg = giftCertMsg;
    }

    public SearchStringField getGiftCertOrigAmt() {
        return this.giftCertOrigAmt;
    }

    public void setGiftCertOrigAmt(SearchStringField giftCertOrigAmt) {
        this.giftCertOrigAmt = giftCertOrigAmt;
    }

    public SearchStringField getGiftCertRecipient() {
        return this.giftCertRecipient;
    }

    public void setGiftCertRecipient(SearchStringField giftCertRecipient) {
        this.giftCertRecipient = giftCertRecipient;
    }

    public SearchMultiSelectField getHierarchyNode() {
        return this.hierarchyNode;
    }

    public void setHierarchyNode(SearchMultiSelectField hierarchyNode) {
        this.hierarchyNode = hierarchyNode;
    }

    public SearchMultiSelectField getHierarchyVersion() {
        return this.hierarchyVersion;
    }

    public void setHierarchyVersion(SearchMultiSelectField hierarchyVersion) {
        this.hierarchyVersion = hierarchyVersion;
    }

    public SearchStringField getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(SearchStringField imageUrl) {
        this.imageUrl = imageUrl;
    }

    public SearchBooleanField getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(SearchBooleanField includeChildren) {
        this.includeChildren = includeChildren;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchMultiSelectField getInventoryLocation() {
        return this.inventoryLocation;
    }

    public void setInventoryLocation(SearchMultiSelectField inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public SearchEnumMultiSelectField getInvtClassification() {
        return this.invtClassification;
    }

    public void setInvtClassification(SearchEnumMultiSelectField invtClassification) {
        this.invtClassification = invtClassification;
    }

    public SearchLongField getInvtCountInterval() {
        return this.invtCountInterval;
    }

    public void setInvtCountInterval(SearchLongField invtCountInterval) {
        this.invtCountInterval = invtCountInterval;
    }

    public SearchBooleanField getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(SearchBooleanField isAvailable) {
        this.isAvailable = isAvailable;
    }

    public SearchBooleanField getIsDropShipItem() {
        return this.isDropShipItem;
    }

    public void setIsDropShipItem(SearchBooleanField isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }

    public SearchBooleanField getIsFulfillable() {
        return this.isFulfillable;
    }

    public void setIsFulfillable(SearchBooleanField isFulfillable) {
        this.isFulfillable = isFulfillable;
    }

    public SearchBooleanField getIsGcoCompliant() {
        return this.isGcoCompliant;
    }

    public void setIsGcoCompliant(SearchBooleanField isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsLotItem() {
        return this.isLotItem;
    }

    public void setIsLotItem(SearchBooleanField isLotItem) {
        this.isLotItem = isLotItem;
    }

    public SearchBooleanField getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(SearchBooleanField isOnline) {
        this.isOnline = isOnline;
    }

    public SearchBooleanField getIsPreferredVendor() {
        return this.isPreferredVendor;
    }

    public void setIsPreferredVendor(SearchBooleanField isPreferredVendor) {
        this.isPreferredVendor = isPreferredVendor;
    }

    public SearchBooleanField getIsSerialItem() {
        return this.isSerialItem;
    }

    public void setIsSerialItem(SearchBooleanField isSerialItem) {
        this.isSerialItem = isSerialItem;
    }

    public SearchBooleanField getIsSpecialOrderItem() {
        return this.isSpecialOrderItem;
    }

    public void setIsSpecialOrderItem(SearchBooleanField isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }

    public SearchBooleanField getIsSpecialWorkOrderItem() {
        return this.isSpecialWorkOrderItem;
    }

    public void setIsSpecialWorkOrderItem(SearchBooleanField isSpecialWorkOrderItem) {
        this.isSpecialWorkOrderItem = isSpecialWorkOrderItem;
    }

    public SearchBooleanField getIsStorePickupAllowed() {
        return this.isStorePickupAllowed;
    }

    public void setIsStorePickupAllowed(SearchBooleanField isStorePickupAllowed) {
        this.isStorePickupAllowed = isStorePickupAllowed;
    }

    public SearchMultiSelectField getIssueProduct() {
        return this.issueProduct;
    }

    public void setIssueProduct(SearchMultiSelectField issueProduct) {
        this.issueProduct = issueProduct;
    }

    public SearchBooleanField getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(SearchBooleanField isTaxable) {
        this.isTaxable = isTaxable;
    }

    public SearchBooleanField getIsVsoeBundle() {
        return this.isVsoeBundle;
    }

    public void setIsVsoeBundle(SearchBooleanField isVsoeBundle) {
        this.isVsoeBundle = isVsoeBundle;
    }

    public SearchBooleanField getIsWip() {
        return this.isWip;
    }

    public void setIsWip(SearchBooleanField isWip) {
        this.isWip = isWip;
    }

    public SearchStringField getItemId() {
        return this.itemId;
    }

    public void setItemId(SearchStringField itemId) {
        this.itemId = itemId;
    }

    public SearchMultiSelectField getItemRevenueCategory() {
        return this.itemRevenueCategory;
    }

    public void setItemRevenueCategory(SearchMultiSelectField itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }

    public SearchStringField getItemUrl() {
        return this.itemUrl;
    }

    public void setItemUrl(SearchStringField itemUrl) {
        this.itemUrl = itemUrl;
    }

    public SearchDateField getLastInvtCountDate() {
        return this.lastInvtCountDate;
    }

    public void setLastInvtCountDate(SearchDateField lastInvtCountDate) {
        this.lastInvtCountDate = lastInvtCountDate;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchDoubleField getLastPurchasePrice() {
        return this.lastPurchasePrice;
    }

    public void setLastPurchasePrice(SearchDoubleField lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }

    public SearchDateField getLastQuantityAvailableChange() {
        return this.lastQuantityAvailableChange;
    }

    public void setLastQuantityAvailableChange(SearchDateField lastQuantityAvailableChange) {
        this.lastQuantityAvailableChange = lastQuantityAvailableChange;
    }

    public SearchLongField getLeadTime() {
        return this.leadTime;
    }

    public void setLeadTime(SearchLongField leadTime) {
        this.leadTime = leadTime;
    }

    public SearchEnumMultiSelectField getListingDuration() {
        return this.listingDuration;
    }

    public void setListingDuration(SearchEnumMultiSelectField listingDuration) {
        this.listingDuration = listingDuration;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchBooleanField getLocationAllowStorePickup() {
        return this.locationAllowStorePickup;
    }

    public void setLocationAllowStorePickup(SearchBooleanField locationAllowStorePickup) {
        this.locationAllowStorePickup = locationAllowStorePickup;
    }

    public SearchDoubleField getLocationAtpLeadTime() {
        return this.locationAtpLeadTime;
    }

    public void setLocationAtpLeadTime(SearchDoubleField locationAtpLeadTime) {
        this.locationAtpLeadTime = locationAtpLeadTime;
    }

    public SearchDoubleField getLocationAverageCost() {
        return this.locationAverageCost;
    }

    public void setLocationAverageCost(SearchDoubleField locationAverageCost) {
        this.locationAverageCost = locationAverageCost;
    }

    public SearchDoubleField getLocationBuildTime() {
        return this.locationBuildTime;
    }

    public void setLocationBuildTime(SearchDoubleField locationBuildTime) {
        this.locationBuildTime = locationBuildTime;
    }

    public SearchDoubleField getLocationCost() {
        return this.locationCost;
    }

    public void setLocationCost(SearchDoubleField locationCost) {
        this.locationCost = locationCost;
    }

    public SearchEnumMultiSelectField getLocationCostAccountingStatus() {
        return this.locationCostAccountingStatus;
    }

    public void setLocationCostAccountingStatus(SearchEnumMultiSelectField locationCostAccountingStatus) {
        this.locationCostAccountingStatus = locationCostAccountingStatus;
    }

    public SearchDoubleField getLocationDefaultReturnCost() {
        return this.locationDefaultReturnCost;
    }

    public void setLocationDefaultReturnCost(SearchDoubleField locationDefaultReturnCost) {
        this.locationDefaultReturnCost = locationDefaultReturnCost;
    }

    public SearchEnumMultiSelectField getLocationDemandSource() {
        return this.locationDemandSource;
    }

    public void setLocationDemandSource(SearchEnumMultiSelectField locationDemandSource) {
        this.locationDemandSource = locationDemandSource;
    }

    public SearchLongField getLocationDemandTimeFence() {
        return this.locationDemandTimeFence;
    }

    public void setLocationDemandTimeFence(SearchLongField locationDemandTimeFence) {
        this.locationDemandTimeFence = locationDemandTimeFence;
    }

    public SearchDoubleField getLocationFixedLotSize() {
        return this.locationFixedLotSize;
    }

    public void setLocationFixedLotSize(SearchDoubleField locationFixedLotSize) {
        this.locationFixedLotSize = locationFixedLotSize;
    }

    public SearchMultiSelectField getLocationInventoryCostTemplate() {
        return this.locationInventoryCostTemplate;
    }

    public void setLocationInventoryCostTemplate(SearchMultiSelectField locationInventoryCostTemplate) {
        this.locationInventoryCostTemplate = locationInventoryCostTemplate;
    }

    public SearchEnumMultiSelectField getLocationInvtClassification() {
        return this.locationInvtClassification;
    }

    public void setLocationInvtClassification(SearchEnumMultiSelectField locationInvtClassification) {
        this.locationInvtClassification = locationInvtClassification;
    }

    public SearchLongField getLocationInvtCountInterval() {
        return this.locationInvtCountInterval;
    }

    public void setLocationInvtCountInterval(SearchLongField locationInvtCountInterval) {
        this.locationInvtCountInterval = locationInvtCountInterval;
    }

    public SearchDateField getLocationLastInvtCountDate() {
        return this.locationLastInvtCountDate;
    }

    public void setLocationLastInvtCountDate(SearchDateField locationLastInvtCountDate) {
        this.locationLastInvtCountDate = locationLastInvtCountDate;
    }

    public SearchLongField getLocationLeadTime() {
        return this.locationLeadTime;
    }

    public void setLocationLeadTime(SearchLongField locationLeadTime) {
        this.locationLeadTime = locationLeadTime;
    }

    public SearchDateField getLocationNextInvtCountDate() {
        return this.locationNextInvtCountDate;
    }

    public void setLocationNextInvtCountDate(SearchDateField locationNextInvtCountDate) {
        this.locationNextInvtCountDate = locationNextInvtCountDate;
    }

    public SearchLongField getLocationPeriodicLotSizeDays() {
        return this.locationPeriodicLotSizeDays;
    }

    public void setLocationPeriodicLotSizeDays(SearchLongField locationPeriodicLotSizeDays) {
        this.locationPeriodicLotSizeDays = locationPeriodicLotSizeDays;
    }

    public SearchEnumMultiSelectField getLocationPeriodicLotSizeType() {
        return this.locationPeriodicLotSizeType;
    }

    public void setLocationPeriodicLotSizeType(SearchEnumMultiSelectField locationPeriodicLotSizeType) {
        this.locationPeriodicLotSizeType = locationPeriodicLotSizeType;
    }

    public SearchDoubleField getLocationPreferredStockLevel() {
        return this.locationPreferredStockLevel;
    }

    public void setLocationPreferredStockLevel(SearchDoubleField locationPreferredStockLevel) {
        this.locationPreferredStockLevel = locationPreferredStockLevel;
    }

    public SearchDoubleField getLocationQtyAvailForStorePickup() {
        return this.locationQtyAvailForStorePickup;
    }

    public void setLocationQtyAvailForStorePickup(SearchDoubleField locationQtyAvailForStorePickup) {
        this.locationQtyAvailForStorePickup = locationQtyAvailForStorePickup;
    }

    public SearchDoubleField getLocationQuantityAvailable() {
        return this.locationQuantityAvailable;
    }

    public void setLocationQuantityAvailable(SearchDoubleField locationQuantityAvailable) {
        this.locationQuantityAvailable = locationQuantityAvailable;
    }

    public SearchDoubleField getLocationQuantityBackOrdered() {
        return this.locationQuantityBackOrdered;
    }

    public void setLocationQuantityBackOrdered(SearchDoubleField locationQuantityBackOrdered) {
        this.locationQuantityBackOrdered = locationQuantityBackOrdered;
    }

    public SearchDoubleField getLocationQuantityCommitted() {
        return this.locationQuantityCommitted;
    }

    public void setLocationQuantityCommitted(SearchDoubleField locationQuantityCommitted) {
        this.locationQuantityCommitted = locationQuantityCommitted;
    }

    public SearchDoubleField getLocationQuantityInTransit() {
        return this.locationQuantityInTransit;
    }

    public void setLocationQuantityInTransit(SearchDoubleField locationQuantityInTransit) {
        this.locationQuantityInTransit = locationQuantityInTransit;
    }

    public SearchDoubleField getLocationQuantityOnHand() {
        return this.locationQuantityOnHand;
    }

    public void setLocationQuantityOnHand(SearchDoubleField locationQuantityOnHand) {
        this.locationQuantityOnHand = locationQuantityOnHand;
    }

    public SearchDoubleField getLocationQuantityOnOrder() {
        return this.locationQuantityOnOrder;
    }

    public void setLocationQuantityOnOrder(SearchDoubleField locationQuantityOnOrder) {
        this.locationQuantityOnOrder = locationQuantityOnOrder;
    }

    public SearchDoubleField getLocationReorderPoint() {
        return this.locationReorderPoint;
    }

    public void setLocationReorderPoint(SearchDoubleField locationReorderPoint) {
        this.locationReorderPoint = locationReorderPoint;
    }

    public SearchLongField getLocationRescheduleInDays() {
        return this.locationRescheduleInDays;
    }

    public void setLocationRescheduleInDays(SearchLongField locationRescheduleInDays) {
        this.locationRescheduleInDays = locationRescheduleInDays;
    }

    public SearchLongField getLocationRescheduleOutDays() {
        return this.locationRescheduleOutDays;
    }

    public void setLocationRescheduleOutDays(SearchLongField locationRescheduleOutDays) {
        this.locationRescheduleOutDays = locationRescheduleOutDays;
    }

    public SearchDoubleField getLocationSafetyStockLevel() {
        return this.locationSafetyStockLevel;
    }

    public void setLocationSafetyStockLevel(SearchDoubleField locationSafetyStockLevel) {
        this.locationSafetyStockLevel = locationSafetyStockLevel;
    }

    public SearchDoubleField getLocationStorePickupBufferStock() {
        return this.locationStorePickupBufferStock;
    }

    public void setLocationStorePickupBufferStock(SearchDoubleField locationStorePickupBufferStock) {
        this.locationStorePickupBufferStock = locationStorePickupBufferStock;
    }

    public SearchEnumMultiSelectField getLocationSupplyLotSizingMethod() {
        return this.locationSupplyLotSizingMethod;
    }

    public void setLocationSupplyLotSizingMethod(SearchEnumMultiSelectField locationSupplyLotSizingMethod) {
        this.locationSupplyLotSizingMethod = locationSupplyLotSizingMethod;
    }

    public SearchLongField getLocationSupplyTimeFence() {
        return this.locationSupplyTimeFence;
    }

    public void setLocationSupplyTimeFence(SearchLongField locationSupplyTimeFence) {
        this.locationSupplyTimeFence = locationSupplyTimeFence;
    }

    public SearchEnumMultiSelectField getLocationSupplyType() {
        return this.locationSupplyType;
    }

    public void setLocationSupplyType(SearchEnumMultiSelectField locationSupplyType) {
        this.locationSupplyType = locationSupplyType;
    }

    public SearchDoubleField getLocationTotalValue() {
        return this.locationTotalValue;
    }

    public void setLocationTotalValue(SearchDoubleField locationTotalValue) {
        this.locationTotalValue = locationTotalValue;
    }

    public SearchLongField getLocBackwardConsumptionDays() {
        return this.locBackwardConsumptionDays;
    }

    public void setLocBackwardConsumptionDays(SearchLongField locBackwardConsumptionDays) {
        this.locBackwardConsumptionDays = locBackwardConsumptionDays;
    }

    public SearchLongField getLocForwardConsumptionDays() {
        return this.locForwardConsumptionDays;
    }

    public void setLocForwardConsumptionDays(SearchLongField locForwardConsumptionDays) {
        this.locForwardConsumptionDays = locForwardConsumptionDays;
    }

    public SearchDoubleField getLowerWarningLimit() {
        return this.lowerWarningLimit;
    }

    public void setLowerWarningLimit(SearchDoubleField lowerWarningLimit) {
        this.lowerWarningLimit = lowerWarningLimit;
    }

    public SearchStringField getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(SearchStringField manufacturer) {
        this.manufacturer = manufacturer;
    }

    public SearchStringField getManufactureraddr1() {
        return this.manufactureraddr1;
    }

    public void setManufactureraddr1(SearchStringField manufactureraddr1) {
        this.manufactureraddr1 = manufactureraddr1;
    }

    public SearchStringField getManufacturerCity() {
        return this.manufacturerCity;
    }

    public void setManufacturerCity(SearchStringField manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }

    public SearchStringField getManufacturerState() {
        return this.manufacturerState;
    }

    public void setManufacturerState(SearchStringField manufacturerState) {
        this.manufacturerState = manufacturerState;
    }

    public SearchStringField getManufacturerTariff() {
        return this.manufacturerTariff;
    }

    public void setManufacturerTariff(SearchStringField manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }

    public SearchStringField getManufacturerTaxId() {
        return this.manufacturerTaxId;
    }

    public void setManufacturerTaxId(SearchStringField manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }

    public SearchStringField getManufacturerZip() {
        return this.manufacturerZip;
    }

    public void setManufacturerZip(SearchStringField manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }

    public SearchBooleanField getManufacturingChargeItem() {
        return this.manufacturingChargeItem;
    }

    public void setManufacturingChargeItem(SearchBooleanField manufacturingChargeItem) {
        this.manufacturingChargeItem = manufacturingChargeItem;
    }

    public SearchBooleanField getMatchBillToReceipt() {
        return this.matchBillToReceipt;
    }

    public void setMatchBillToReceipt(SearchBooleanField matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public SearchBooleanField getMatrix() {
        return this.matrix;
    }

    public void setMatrix(SearchBooleanField matrix) {
        this.matrix = matrix;
    }

    public SearchBooleanField getMatrixChild() {
        return this.matrixChild;
    }

    public void setMatrixChild(SearchBooleanField matrixChild) {
        this.matrixChild = matrixChild;
    }

    public SearchLongField getMaximumQuantity() {
        return this.maximumQuantity;
    }

    public void setMaximumQuantity(SearchLongField maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public SearchStringField getMetaTagHtml() {
        return this.metaTagHtml;
    }

    public void setMetaTagHtml(SearchStringField metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }

    public SearchLongField getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public void setMinimumQuantity(SearchLongField minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public SearchBooleanField getMossApplies() {
        return this.mossApplies;
    }

    public void setMossApplies(SearchBooleanField mossApplies) {
        this.mossApplies = mossApplies;
    }

    public SearchStringField getMpn() {
        return this.mpn;
    }

    public void setMpn(SearchStringField mpn) {
        this.mpn = mpn;
    }

    public SearchBooleanField getMultManufactureAddr() {
        return this.multManufactureAddr;
    }

    public void setMultManufactureAddr(SearchBooleanField multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }

    public SearchStringField getNexTagCategory() {
        return this.nexTagCategory;
    }

    public void setNexTagCategory(SearchStringField nexTagCategory) {
        this.nexTagCategory = nexTagCategory;
    }

    public SearchBooleanField getNexTagProductFeed() {
        return this.nexTagProductFeed;
    }

    public void setNexTagProductFeed(SearchBooleanField nexTagProductFeed) {
        this.nexTagProductFeed = nexTagProductFeed;
    }

    public SearchDateField getNextInvtCountDate() {
        return this.nextInvtCountDate;
    }

    public void setNextInvtCountDate(SearchDateField nextInvtCountDate) {
        this.nextInvtCountDate = nextInvtCountDate;
    }

    public SearchLongField getNumActiveListings() {
        return this.numActiveListings;
    }

    public void setNumActiveListings(SearchLongField numActiveListings) {
        this.numActiveListings = numActiveListings;
    }

    public SearchDoubleField getNumberAllowedDownloads() {
        return this.numberAllowedDownloads;
    }

    public void setNumberAllowedDownloads(SearchDoubleField numberAllowedDownloads) {
        this.numberAllowedDownloads = numberAllowedDownloads;
    }

    public SearchLongField getNumCurrentlyListed() {
        return this.numCurrentlyListed;
    }

    public void setNumCurrentlyListed(SearchLongField numCurrentlyListed) {
        this.numCurrentlyListed = numCurrentlyListed;
    }

    public SearchDateField getObsoleteDate() {
        return this.obsoleteDate;
    }

    public void setObsoleteDate(SearchDateField obsoleteDate) {
        this.obsoleteDate = obsoleteDate;
    }

    public SearchMultiSelectField getObsoleteRevision() {
        return this.obsoleteRevision;
    }

    public void setObsoleteRevision(SearchMultiSelectField obsoleteRevision) {
        this.obsoleteRevision = obsoleteRevision;
    }

    public SearchBooleanField getOfferSupport() {
        return this.offerSupport;
    }

    public void setOfferSupport(SearchBooleanField offerSupport) {
        this.offerSupport = offerSupport;
    }

    public SearchDoubleField getOnlineCustomerPrice() {
        return this.onlineCustomerPrice;
    }

    public void setOnlineCustomerPrice(SearchDoubleField onlineCustomerPrice) {
        this.onlineCustomerPrice = onlineCustomerPrice;
    }

    public SearchBooleanField getOnSpecial() {
        return this.onSpecial;
    }

    public void setOnSpecial(SearchBooleanField onSpecial) {
        this.onSpecial = onSpecial;
    }

    public SearchMultiSelectField getOtherVendor() {
        return this.otherVendor;
    }

    public void setOtherVendor(SearchMultiSelectField otherVendor) {
        this.otherVendor = otherVendor;
    }

    public SearchMultiSelectField getOutOfStockBehavior() {
        return this.outOfStockBehavior;
    }

    public void setOutOfStockBehavior(SearchMultiSelectField outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }

    public SearchEnumMultiSelectField getOverallQuantityPricingType() {
        return this.overallQuantityPricingType;
    }

    public void setOverallQuantityPricingType(SearchEnumMultiSelectField overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }

    public SearchEnumMultiSelectField getOverheadType() {
        return this.overheadType;
    }

    public void setOverheadType(SearchEnumMultiSelectField overheadType) {
        this.overheadType = overheadType;
    }

    public SearchStringField getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(SearchStringField pageTitle) {
        this.pageTitle = pageTitle;
    }

    public SearchMultiSelectField getParent() {
        return this.parent;
    }

    public void setParent(SearchMultiSelectField parent) {
        this.parent = parent;
    }

    public SearchLongField getPeriodicLotSizeDays() {
        return this.periodicLotSizeDays;
    }

    public void setPeriodicLotSizeDays(SearchLongField periodicLotSizeDays) {
        this.periodicLotSizeDays = periodicLotSizeDays;
    }

    public SearchEnumMultiSelectField getPeriodicLotSizeType() {
        return this.periodicLotSizeType;
    }

    public void setPeriodicLotSizeType(SearchEnumMultiSelectField periodicLotSizeType) {
        this.periodicLotSizeType = periodicLotSizeType;
    }

    public SearchMultiSelectField getPlanningItemCategory() {
        return this.planningItemCategory;
    }

    public void setPlanningItemCategory(SearchMultiSelectField planningItemCategory) {
        this.planningItemCategory = planningItemCategory;
    }

    public SearchStringField getPreferenceCriterion() {
        return this.preferenceCriterion;
    }

    public void setPreferenceCriterion(SearchStringField preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }

    public SearchBooleanField getPreferredBin() {
        return this.preferredBin;
    }

    public void setPreferredBin(SearchBooleanField preferredBin) {
        this.preferredBin = preferredBin;
    }

    public SearchMultiSelectField getPreferredLocation() {
        return this.preferredLocation;
    }

    public void setPreferredLocation(SearchMultiSelectField preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public SearchDoubleField getPreferredStockLevel() {
        return this.preferredStockLevel;
    }

    public void setPreferredStockLevel(SearchDoubleField preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }

    public SearchLongField getPreferredStockLevelDays() {
        return this.preferredStockLevelDays;
    }

    public void setPreferredStockLevelDays(SearchLongField preferredStockLevelDays) {
        this.preferredStockLevelDays = preferredStockLevelDays;
    }

    public SearchDoubleField getPrice() {
        return this.price;
    }

    public void setPrice(SearchDoubleField price) {
        this.price = price;
    }

    public SearchBooleanField getPricesIncludeTax() {
        return this.pricesIncludeTax;
    }

    public void setPricesIncludeTax(SearchBooleanField pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }

    public SearchMultiSelectField getPricingGroup() {
        return this.pricingGroup;
    }

    public void setPricingGroup(SearchMultiSelectField pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public SearchLongField getPrimaryCategory() {
        return this.primaryCategory;
    }

    public void setPrimaryCategory(SearchLongField primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public SearchDoubleField getPurchaseOrderAmount() {
        return this.purchaseOrderAmount;
    }

    public void setPurchaseOrderAmount(SearchDoubleField purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public SearchDoubleField getPurchaseOrderQuantity() {
        return this.purchaseOrderQuantity;
    }

    public void setPurchaseOrderQuantity(SearchDoubleField purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public SearchDoubleField getPurchaseOrderQuantityDiff() {
        return this.purchaseOrderQuantityDiff;
    }

    public void setPurchaseOrderQuantityDiff(SearchDoubleField purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public SearchMultiSelectField getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public void setPurchaseUnit(SearchMultiSelectField purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public SearchDoubleField getQuantityAvailable() {
        return this.quantityAvailable;
    }

    public void setQuantityAvailable(SearchDoubleField quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public SearchDoubleField getQuantityBackOrdered() {
        return this.quantityBackOrdered;
    }

    public void setQuantityBackOrdered(SearchDoubleField quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }

    public SearchDoubleField getQuantityCommitted() {
        return this.quantityCommitted;
    }

    public void setQuantityCommitted(SearchDoubleField quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public SearchDoubleField getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(SearchDoubleField quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public SearchDoubleField getQuantityOnOrder() {
        return this.quantityOnOrder;
    }

    public void setQuantityOnOrder(SearchDoubleField quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }

    public SearchMultiSelectField getQuantityPricingSchedule() {
        return this.quantityPricingSchedule;
    }

    public void setQuantityPricingSchedule(SearchMultiSelectField quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }

    public SearchDoubleField getReceiptAmount() {
        return this.receiptAmount;
    }

    public void setReceiptAmount(SearchDoubleField receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public SearchDoubleField getReceiptQuantity() {
        return this.receiptQuantity;
    }

    public void setReceiptQuantity(SearchDoubleField receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public SearchDoubleField getReceiptQuantityDiff() {
        return this.receiptQuantityDiff;
    }

    public void setReceiptQuantityDiff(SearchDoubleField receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public SearchLongField getReorderMultiple() {
        return this.reorderMultiple;
    }

    public void setReorderMultiple(SearchLongField reorderMultiple) {
        this.reorderMultiple = reorderMultiple;
    }

    public SearchDoubleField getReorderPoint() {
        return this.reorderPoint;
    }

    public void setReorderPoint(SearchDoubleField reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public SearchLongField getRescheduleInDays() {
        return this.rescheduleInDays;
    }

    public void setRescheduleInDays(SearchLongField rescheduleInDays) {
        this.rescheduleInDays = rescheduleInDays;
    }

    public SearchLongField getRescheduleOutDays() {
        return this.rescheduleOutDays;
    }

    public void setRescheduleOutDays(SearchLongField rescheduleOutDays) {
        this.rescheduleOutDays = rescheduleOutDays;
    }

    public SearchDoubleField getReservePrice() {
        return this.reservePrice;
    }

    public void setReservePrice(SearchDoubleField reservePrice) {
        this.reservePrice = reservePrice;
    }

    public SearchMultiSelectField getRevenueAllocationGroup() {
        return this.revenueAllocationGroup;
    }

    public void setRevenueAllocationGroup(SearchMultiSelectField revenueAllocationGroup) {
        this.revenueAllocationGroup = revenueAllocationGroup;
    }

    public SearchMultiSelectField getRevenueRecognitionRule() {
        return this.revenueRecognitionRule;
    }

    public void setRevenueRecognitionRule(SearchMultiSelectField revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }

    public SearchMultiSelectField getRevRecForecastRule() {
        return this.revRecForecastRule;
    }

    public void setRevRecForecastRule(SearchMultiSelectField revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }

    public SearchMultiSelectField getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(SearchMultiSelectField revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public SearchBooleanField getRoundUpAsComponent() {
        return this.roundUpAsComponent;
    }

    public void setRoundUpAsComponent(SearchBooleanField roundUpAsComponent) {
        this.roundUpAsComponent = roundUpAsComponent;
    }

    public SearchDoubleField getSafetyStockLevel() {
        return this.safetyStockLevel;
    }

    public void setSafetyStockLevel(SearchDoubleField safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public SearchLongField getSafetyStockLevelDays() {
        return this.safetyStockLevelDays;
    }

    public void setSafetyStockLevelDays(SearchLongField safetyStockLevelDays) {
        this.safetyStockLevelDays = safetyStockLevelDays;
    }

    public SearchStringField getSalesDescription() {
        return this.salesDescription;
    }

    public void setSalesDescription(SearchStringField salesDescription) {
        this.salesDescription = salesDescription;
    }

    public SearchMultiSelectField getSaleUnit() {
        return this.saleUnit;
    }

    public void setSaleUnit(SearchMultiSelectField saleUnit) {
        this.saleUnit = saleUnit;
    }

    public SearchBooleanField getSameAsPrimaryBookAmortization() {
        return this.sameAsPrimaryBookAmortization;
    }

    public void setSameAsPrimaryBookAmortization(SearchBooleanField sameAsPrimaryBookAmortization) {
        this.sameAsPrimaryBookAmortization = sameAsPrimaryBookAmortization;
    }

    public SearchBooleanField getSameAsPrimaryBookRevRec() {
        return this.sameAsPrimaryBookRevRec;
    }

    public void setSameAsPrimaryBookRevRec(SearchBooleanField sameAsPrimaryBookRevRec) {
        this.sameAsPrimaryBookRevRec = sameAsPrimaryBookRevRec;
    }

    public SearchEnumMultiSelectField getScheduleBCode() {
        return this.scheduleBCode;
    }

    public void setScheduleBCode(SearchEnumMultiSelectField scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }

    public SearchStringField getScheduleBNumber() {
        return this.scheduleBNumber;
    }

    public void setScheduleBNumber(SearchStringField scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }

    public SearchStringField getScheduleBQuantity() {
        return this.scheduleBQuantity;
    }

    public void setScheduleBQuantity(SearchStringField scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }

    public SearchStringField getSearchKeywords() {
        return this.searchKeywords;
    }

    public void setSearchKeywords(SearchStringField searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public SearchBooleanField getSeasonalDemand() {
        return this.seasonalDemand;
    }

    public void setSeasonalDemand(SearchBooleanField seasonalDemand) {
        this.seasonalDemand = seasonalDemand;
    }

    public SearchMultiSelectField getSecondaryConsumptionUnit() {
        return this.secondaryConsumptionUnit;
    }

    public void setSecondaryConsumptionUnit(SearchMultiSelectField secondaryConsumptionUnit) {
        this.secondaryConsumptionUnit = secondaryConsumptionUnit;
    }

    public SearchMultiSelectField getSecondaryPurchaseUnit() {
        return this.secondaryPurchaseUnit;
    }

    public void setSecondaryPurchaseUnit(SearchMultiSelectField secondaryPurchaseUnit) {
        this.secondaryPurchaseUnit = secondaryPurchaseUnit;
    }

    public SearchMultiSelectField getSecondarySaleUnit() {
        return this.secondarySaleUnit;
    }

    public void setSecondarySaleUnit(SearchMultiSelectField secondarySaleUnit) {
        this.secondarySaleUnit = secondarySaleUnit;
    }

    public SearchMultiSelectField getSecondaryStockUnit() {
        return this.secondaryStockUnit;
    }

    public void setSecondaryStockUnit(SearchMultiSelectField secondaryStockUnit) {
        this.secondaryStockUnit = secondaryStockUnit;
    }

    public SearchMultiSelectField getSecondaryUnitsType() {
        return this.secondaryUnitsType;
    }

    public void setSecondaryUnitsType(SearchMultiSelectField secondaryUnitsType) {
        this.secondaryUnitsType = secondaryUnitsType;
    }

    public SearchBooleanField getSellOnEBay() {
        return this.sellOnEBay;
    }

    public void setSellOnEBay(SearchBooleanField sellOnEBay) {
        this.sellOnEBay = sellOnEBay;
    }

    public SearchStringField getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }

    public SearchMultiSelectField getSerialNumberLocation() {
        return this.serialNumberLocation;
    }

    public void setSerialNumberLocation(SearchMultiSelectField serialNumberLocation) {
        this.serialNumberLocation = serialNumberLocation;
    }

    public SearchBooleanField getShipIndividually() {
        return this.shipIndividually;
    }

    public void setShipIndividually(SearchBooleanField shipIndividually) {
        this.shipIndividually = shipIndividually;
    }

    public SearchMultiSelectField getShipPackage() {
        return this.shipPackage;
    }

    public void setShipPackage(SearchMultiSelectField shipPackage) {
        this.shipPackage = shipPackage;
    }

    public SearchEnumMultiSelectField getShippingCarrier() {
        return this.shippingCarrier;
    }

    public void setShippingCarrier(SearchEnumMultiSelectField shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
    }

    public SearchDoubleField getShippingRate() {
        return this.shippingRate;
    }

    public void setShippingRate(SearchDoubleField shippingRate) {
        this.shippingRate = shippingRate;
    }

    public SearchStringField getShoppingDotComCategory() {
        return this.shoppingDotComCategory;
    }

    public void setShoppingDotComCategory(SearchStringField shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }

    public SearchBooleanField getShoppingProductFeed() {
        return this.shoppingProductFeed;
    }

    public void setShoppingProductFeed(SearchBooleanField shoppingProductFeed) {
        this.shoppingProductFeed = shoppingProductFeed;
    }

    public SearchLongField getShopzillaCategoryId() {
        return this.shopzillaCategoryId;
    }

    public void setShopzillaCategoryId(SearchLongField shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }

    public SearchBooleanField getShopzillaProductFeed() {
        return this.shopzillaProductFeed;
    }

    public void setShopzillaProductFeed(SearchBooleanField shopzillaProductFeed) {
        this.shopzillaProductFeed = shopzillaProductFeed;
    }

    public SearchEnumMultiSelectField getSitemapPriority() {
        return this.sitemapPriority;
    }

    public void setSitemapPriority(SearchEnumMultiSelectField sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }

    public SearchMultiSelectField getSoftDescriptor() {
        return this.softDescriptor;
    }

    public void setSoftDescriptor(SearchMultiSelectField softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public SearchDoubleField getStartingPrice() {
        return this.startingPrice;
    }

    public void setStartingPrice(SearchDoubleField startingPrice) {
        this.startingPrice = startingPrice;
    }

    public SearchStringField getStockDescription() {
        return this.stockDescription;
    }

    public void setStockDescription(SearchStringField stockDescription) {
        this.stockDescription = stockDescription;
    }

    public SearchMultiSelectField getStockUnit() {
        return this.stockUnit;
    }

    public void setStockUnit(SearchMultiSelectField stockUnit) {
        this.stockUnit = stockUnit;
    }

    public SearchStringField getStoreDescription() {
        return this.storeDescription;
    }

    public void setStoreDescription(SearchStringField storeDescription) {
        this.storeDescription = storeDescription;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchEnumMultiSelectField getSubType() {
        return this.subType;
    }

    public void setSubType(SearchEnumMultiSelectField subType) {
        this.subType = subType;
    }

    public SearchEnumMultiSelectField getSupplyLotSizingMethod() {
        return this.supplyLotSizingMethod;
    }

    public void setSupplyLotSizingMethod(SearchEnumMultiSelectField supplyLotSizingMethod) {
        this.supplyLotSizingMethod = supplyLotSizingMethod;
    }

    public SearchEnumMultiSelectField getSupplyReplenishmentMethod() {
        return this.supplyReplenishmentMethod;
    }

    public void setSupplyReplenishmentMethod(SearchEnumMultiSelectField supplyReplenishmentMethod) {
        this.supplyReplenishmentMethod = supplyReplenishmentMethod;
    }

    public SearchLongField getSupplyTimeFence() {
        return this.supplyTimeFence;
    }

    public void setSupplyTimeFence(SearchLongField supplyTimeFence) {
        this.supplyTimeFence = supplyTimeFence;
    }

    public SearchEnumMultiSelectField getSupplyType() {
        return this.supplyType;
    }

    public void setSupplyType(SearchEnumMultiSelectField supplyType) {
        this.supplyType = supplyType;
    }

    public SearchMultiSelectField getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(SearchMultiSelectField taxCode) {
        this.taxCode = taxCode;
    }

    public SearchMultiSelectField getTaxSchedule() {
        return this.taxSchedule;
    }

    public void setTaxSchedule(SearchMultiSelectField taxSchedule) {
        this.taxSchedule = taxSchedule;
    }

    public SearchStringField getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public void setThumbnailUrl(SearchStringField thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public SearchDoubleField getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(SearchDoubleField totalValue) {
        this.totalValue = totalValue;
    }

    public SearchBooleanField getTrackLandedCost() {
        return this.trackLandedCost;
    }

    public void setTrackLandedCost(SearchBooleanField trackLandedCost) {
        this.trackLandedCost = trackLandedCost;
    }

    public SearchDoubleField getTransferPrice() {
        return this.transferPrice;
    }

    public void setTransferPrice(SearchDoubleField transferPrice) {
        this.transferPrice = transferPrice;
    }

    public SearchEnumMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchEnumMultiSelectField type) {
        this.type = type;
    }

    public SearchMultiSelectField getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(SearchMultiSelectField unitsType) {
        this.unitsType = unitsType;
    }

    public SearchStringField getUpcCode() {
        return this.upcCode;
    }

    public void setUpcCode(SearchStringField upcCode) {
        this.upcCode = upcCode;
    }

    public SearchDoubleField getUpperWarningLimit() {
        return this.upperWarningLimit;
    }

    public void setUpperWarningLimit(SearchDoubleField upperWarningLimit) {
        this.upperWarningLimit = upperWarningLimit;
    }

    public SearchStringField getUrlComponent() {
        return this.urlComponent;
    }

    public void setUrlComponent(SearchStringField urlComponent) {
        this.urlComponent = urlComponent;
    }

    public SearchBooleanField getUseBins() {
        return this.useBins;
    }

    public void setUseBins(SearchBooleanField useBins) {
        this.useBins = useBins;
    }

    public SearchBooleanField getUseComponentYield() {
        return this.useComponentYield;
    }

    public void setUseComponentYield(SearchBooleanField useComponentYield) {
        this.useComponentYield = useComponentYield;
    }

    public SearchBooleanField getUseMarginalRates() {
        return this.useMarginalRates;
    }

    public void setUseMarginalRates(SearchBooleanField useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }

    public SearchMultiSelectField getVendor() {
        return this.vendor;
    }

    public void setVendor(SearchMultiSelectField vendor) {
        this.vendor = vendor;
    }

    public SearchStringField getVendorCode() {
        return this.vendorCode;
    }

    public void setVendorCode(SearchStringField vendorCode) {
        this.vendorCode = vendorCode;
    }

    public SearchDoubleField getVendorCost() {
        return this.vendorCost;
    }

    public void setVendorCost(SearchDoubleField vendorCost) {
        this.vendorCost = vendorCost;
    }

    public SearchDoubleField getVendorCostEntered() {
        return this.vendorCostEntered;
    }

    public void setVendorCostEntered(SearchDoubleField vendorCostEntered) {
        this.vendorCostEntered = vendorCostEntered;
    }

    public SearchStringField getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(SearchStringField vendorName) {
        this.vendorName = vendorName;
    }

    public SearchMultiSelectField getVendorPriceCurrency() {
        return this.vendorPriceCurrency;
    }

    public void setVendorPriceCurrency(SearchMultiSelectField vendorPriceCurrency) {
        this.vendorPriceCurrency = vendorPriceCurrency;
    }

    public SearchEnumMultiSelectField getVsoeDeferral() {
        return this.vsoeDeferral;
    }

    public void setVsoeDeferral(SearchEnumMultiSelectField vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public SearchBooleanField getVsoeDelivered() {
        return this.vsoeDelivered;
    }

    public void setVsoeDelivered(SearchBooleanField vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public SearchEnumMultiSelectField getVsoePermitDiscount() {
        return this.vsoePermitDiscount;
    }

    public void setVsoePermitDiscount(SearchEnumMultiSelectField vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public SearchDoubleField getVsoePrice() {
        return this.vsoePrice;
    }

    public void setVsoePrice(SearchDoubleField vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public SearchEnumMultiSelectField getVsoeSopGroup() {
        return this.vsoeSopGroup;
    }

    public void setVsoeSopGroup(SearchEnumMultiSelectField vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }

    public SearchMultiSelectField getWebSite() {
        return this.webSite;
    }

    public void setWebSite(SearchMultiSelectField webSite) {
        this.webSite = webSite;
    }

    public SearchDoubleField getWeight() {
        return this.weight;
    }

    public void setWeight(SearchDoubleField weight) {
        this.weight = weight;
    }

    public SearchBooleanField getYahooProductFeed() {
        return this.yahooProductFeed;
    }

    public void setYahooProductFeed(SearchBooleanField yahooProductFeed) {
        this.yahooProductFeed = yahooProductFeed;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemSearchBasic)) {
            return false;
        }
        ItemSearchBasic other = (ItemSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accBookRevRecForecastRule == null && other.getAccBookRevRecForecastRule() == null || this.accBookRevRecForecastRule != null && this.accBookRevRecForecastRule.equals(other.getAccBookRevRecForecastRule())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.accountingBookAmortization == null && other.getAccountingBookAmortization() == null || this.accountingBookAmortization != null && this.accountingBookAmortization.equals(other.getAccountingBookAmortization())) && (this.accountingBookCreatePlansOn == null && other.getAccountingBookCreatePlansOn() == null || this.accountingBookCreatePlansOn != null && this.accountingBookCreatePlansOn.equals(other.getAccountingBookCreatePlansOn())) && (this.accountingBookRevRecRule == null && other.getAccountingBookRevRecRule() == null || this.accountingBookRevRecRule != null && this.accountingBookRevRecRule.equals(other.getAccountingBookRevRecRule())) && (this.accountingBookRevRecSchedule == null && other.getAccountingBookRevRecSchedule() == null || this.accountingBookRevRecSchedule != null && this.accountingBookRevRecSchedule.equals(other.getAccountingBookRevRecSchedule())) && (this.allowedShippingMethod == null && other.getAllowedShippingMethod() == null || this.allowedShippingMethod != null && this.allowedShippingMethod.equals(other.getAllowedShippingMethod())) && (this.alternateDemandSourceItem == null && other.getAlternateDemandSourceItem() == null || this.alternateDemandSourceItem != null && this.alternateDemandSourceItem.equals(other.getAlternateDemandSourceItem())) && (this.atpLeadTime == null && other.getAtpLeadTime() == null || this.atpLeadTime != null && this.atpLeadTime.equals(other.getAtpLeadTime())) && (this.atpMethod == null && other.getAtpMethod() == null || this.atpMethod != null && this.atpMethod.equals(other.getAtpMethod())) && (this.autoLeadTime == null && other.getAutoLeadTime() == null || this.autoLeadTime != null && this.autoLeadTime.equals(other.getAutoLeadTime())) && (this.autoPreferredStockLevel == null && other.getAutoPreferredStockLevel() == null || this.autoPreferredStockLevel != null && this.autoPreferredStockLevel.equals(other.getAutoPreferredStockLevel())) && (this.autoReorderPoint == null && other.getAutoReorderPoint() == null || this.autoReorderPoint != null && this.autoReorderPoint.equals(other.getAutoReorderPoint())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.averageCost == null && other.getAverageCost() == null || this.averageCost != null && this.averageCost.equals(other.getAverageCost())) && (this.backwardConsumptionDays == null && other.getBackwardConsumptionDays() == null || this.backwardConsumptionDays != null && this.backwardConsumptionDays.equals(other.getBackwardConsumptionDays())) && (this.binNumber == null && other.getBinNumber() == null || this.binNumber != null && this.binNumber.equals(other.getBinNumber())) && (this.binOnHandAvail == null && other.getBinOnHandAvail() == null || this.binOnHandAvail != null && this.binOnHandAvail.equals(other.getBinOnHandAvail())) && (this.binOnHandCount == null && other.getBinOnHandCount() == null || this.binOnHandCount != null && this.binOnHandCount.equals(other.getBinOnHandCount())) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && this.bomQuantity.equals(other.getBomQuantity())) && (this.buildEntireAssembly == null && other.getBuildEntireAssembly() == null || this.buildEntireAssembly != null && this.buildEntireAssembly.equals(other.getBuildEntireAssembly())) && (this.buildTime == null && other.getBuildTime() == null || this.buildTime != null && this.buildTime.equals(other.getBuildTime())) && (this.buildTimeLotSize == null && other.getBuildTimeLotSize() == null || this.buildTimeLotSize != null && this.buildTimeLotSize.equals(other.getBuildTimeLotSize())) && (this.buyItNowPrice == null && other.getBuyItNowPrice() == null || this.buyItNowPrice != null && this.buyItNowPrice.equals(other.getBuyItNowPrice())) && (this.caption == null && other.getCaption() == null || this.caption != null && this.caption.equals(other.getCaption())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.component == null && other.getComponent() == null || this.component != null && this.component.equals(other.getComponent())) && (this.componentOf == null && other.getComponentOf() == null || this.componentOf != null && this.componentOf.equals(other.getComponentOf())) && (this.componentYield == null && other.getComponentYield() == null || this.componentYield != null && this.componentYield.equals(other.getComponentYield())) && (this.consumptionUnit == null && other.getConsumptionUnit() == null || this.consumptionUnit != null && this.consumptionUnit.equals(other.getConsumptionUnit())) && (this.contingentRevenueHandling == null && other.getContingentRevenueHandling() == null || this.contingentRevenueHandling != null && this.contingentRevenueHandling.equals(other.getContingentRevenueHandling())) && (this.conversionRate == null && other.getConversionRate() == null || this.conversionRate != null && this.conversionRate.equals(other.getConversionRate())) && (this.copyDescription == null && other.getCopyDescription() == null || this.copyDescription != null && this.copyDescription.equals(other.getCopyDescription())) && (this.correlatedItem == null && other.getCorrelatedItem() == null || this.correlatedItem != null && this.correlatedItem.equals(other.getCorrelatedItem())) && (this.correlatedItemCorrelation == null && other.getCorrelatedItemCorrelation() == null || this.correlatedItemCorrelation != null && this.correlatedItemCorrelation.equals(other.getCorrelatedItemCorrelation())) && (this.correlatedItemCount == null && other.getCorrelatedItemCount() == null || this.correlatedItemCount != null && this.correlatedItemCount.equals(other.getCorrelatedItemCount())) && (this.correlatedItemLift == null && other.getCorrelatedItemLift() == null || this.correlatedItemLift != null && this.correlatedItemLift.equals(other.getCorrelatedItemLift())) && (this.correlatedItemPurchaseRate == null && other.getCorrelatedItemPurchaseRate() == null || this.correlatedItemPurchaseRate != null && this.correlatedItemPurchaseRate.equals(other.getCorrelatedItemPurchaseRate())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.costAccountingStatus == null && other.getCostAccountingStatus() == null || this.costAccountingStatus != null && this.costAccountingStatus.equals(other.getCostAccountingStatus())) && (this.costCategory == null && other.getCostCategory() == null || this.costCategory != null && this.costCategory.equals(other.getCostCategory())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.costingMethod == null && other.getCostingMethod() == null || this.costingMethod != null && this.costingMethod.equals(other.getCostingMethod())) && (this.countryOfManufacture == null && other.getCountryOfManufacture() == null || this.countryOfManufacture != null && this.countryOfManufacture.equals(other.getCountryOfManufacture())) && (this.created == null && other.getCreated() == null || this.created != null && this.created.equals(other.getCreated())) && (this.createJob == null && other.getCreateJob() == null || this.createJob != null && this.createJob.equals(other.getCreateJob())) && (this.createRevenuePlansOn == null && other.getCreateRevenuePlansOn() == null || this.createRevenuePlansOn != null && this.createRevenuePlansOn.equals(other.getCreateRevenuePlansOn())) && (this.dateViewed == null && other.getDateViewed() == null || this.dateViewed != null && this.dateViewed.equals(other.getDateViewed())) && (this.daysBeforeExpiration == null && other.getDaysBeforeExpiration() == null || this.daysBeforeExpiration != null && this.daysBeforeExpiration.equals(other.getDaysBeforeExpiration())) && (this.defaultReturnCost == null && other.getDefaultReturnCost() == null || this.defaultReturnCost != null && this.defaultReturnCost.equals(other.getDefaultReturnCost())) && (this.defaultShippingMethod == null && other.getDefaultShippingMethod() == null || this.defaultShippingMethod != null && this.defaultShippingMethod.equals(other.getDefaultShippingMethod())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.demandModifier == null && other.getDemandModifier() == null || this.demandModifier != null && this.demandModifier.equals(other.getDemandModifier())) && (this.demandSource == null && other.getDemandSource() == null || this.demandSource != null && this.demandSource.equals(other.getDemandSource())) && (this.demandTimeFence == null && other.getDemandTimeFence() == null || this.demandTimeFence != null && this.demandTimeFence.equals(other.getDemandTimeFence())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.directRevenuePosting == null && other.getDirectRevenuePosting() == null || this.directRevenuePosting != null && this.directRevenuePosting.equals(other.getDirectRevenuePosting())) && (this.displayIneBayStore == null && other.getDisplayIneBayStore() == null || this.displayIneBayStore != null && this.displayIneBayStore.equals(other.getDisplayIneBayStore())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.distributionCategory == null && other.getDistributionCategory() == null || this.distributionCategory != null && this.distributionCategory.equals(other.getDistributionCategory())) && (this.distributionNetwork == null && other.getDistributionNetwork() == null || this.distributionNetwork != null && this.distributionNetwork.equals(other.getDistributionNetwork())) && (this.dontShowPrice == null && other.getDontShowPrice() == null || this.dontShowPrice != null && this.dontShowPrice.equals(other.getDontShowPrice())) && (this.eBayItemDescription == null && other.getEBayItemDescription() == null || this.eBayItemDescription != null && this.eBayItemDescription.equals(other.getEBayItemDescription())) && (this.eBayItemSubtitle == null && other.getEBayItemSubtitle() == null || this.eBayItemSubtitle != null && this.eBayItemSubtitle.equals(other.getEBayItemSubtitle())) && (this.eBayItemTitle == null && other.getEBayItemTitle() == null || this.eBayItemTitle != null && this.eBayItemTitle.equals(other.getEBayItemTitle())) && (this.ebayRelistingOption == null && other.getEbayRelistingOption() == null || this.ebayRelistingOption != null && this.ebayRelistingOption.equals(other.getEbayRelistingOption())) && (this.effectiveBomControl == null && other.getEffectiveBomControl() == null || this.effectiveBomControl != null && this.effectiveBomControl.equals(other.getEffectiveBomControl())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.effectiveRevision == null && other.getEffectiveRevision() == null || this.effectiveRevision != null && this.effectiveRevision.equals(other.getEffectiveRevision())) && (this.enableCatchWeight == null && other.getEnableCatchWeight() == null || this.enableCatchWeight != null && this.enableCatchWeight.equals(other.getEnableCatchWeight())) && (this.endAuctionsWhenOutOfStock == null && other.getEndAuctionsWhenOutOfStock() == null || this.endAuctionsWhenOutOfStock != null && this.endAuctionsWhenOutOfStock.equals(other.getEndAuctionsWhenOutOfStock())) && (this.excludeFromSitemap == null && other.getExcludeFromSitemap() == null || this.excludeFromSitemap != null && this.excludeFromSitemap.equals(other.getExcludeFromSitemap())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.featuredDescription == null && other.getFeaturedDescription() == null || this.featuredDescription != null && this.featuredDescription.equals(other.getFeaturedDescription())) && (this.feedDescription == null && other.getFeedDescription() == null || this.feedDescription != null && this.feedDescription.equals(other.getFeedDescription())) && (this.feedName == null && other.getFeedName() == null || this.feedName != null && this.feedName.equals(other.getFeedName())) && (this.fixedBuildTime == null && other.getFixedBuildTime() == null || this.fixedBuildTime != null && this.fixedBuildTime.equals(other.getFixedBuildTime())) && (this.fixedLotSize == null && other.getFixedLotSize() == null || this.fixedLotSize != null && this.fixedLotSize.equals(other.getFixedLotSize())) && (this.forwardConsumptionDays == null && other.getForwardConsumptionDays() == null || this.forwardConsumptionDays != null && this.forwardConsumptionDays.equals(other.getForwardConsumptionDays())) && (this.fraudRisk == null && other.getFraudRisk() == null || this.fraudRisk != null && this.fraudRisk.equals(other.getFraudRisk())) && (this.froogleProductFeed == null && other.getFroogleProductFeed() == null || this.froogleProductFeed != null && this.froogleProductFeed.equals(other.getFroogleProductFeed())) && (this.futureHorizon == null && other.getFutureHorizon() == null || this.futureHorizon != null && this.futureHorizon.equals(other.getFutureHorizon())) && (this.fxCost == null && other.getFxCost() == null || this.fxCost != null && this.fxCost.equals(other.getFxCost())) && (this.generateAccruals == null && other.getGenerateAccruals() == null || this.generateAccruals != null && this.generateAccruals.equals(other.getGenerateAccruals())) && (this.giftCertAuthCode == null && other.getGiftCertAuthCode() == null || this.giftCertAuthCode != null && this.giftCertAuthCode.equals(other.getGiftCertAuthCode())) && (this.giftCertEmail == null && other.getGiftCertEmail() == null || this.giftCertEmail != null && this.giftCertEmail.equals(other.getGiftCertEmail())) && (this.giftCertExpDate == null && other.getGiftCertExpDate() == null || this.giftCertExpDate != null && this.giftCertExpDate.equals(other.getGiftCertExpDate())) && (this.giftCertFrom == null && other.getGiftCertFrom() == null || this.giftCertFrom != null && this.giftCertFrom.equals(other.getGiftCertFrom())) && (this.giftCertMsg == null && other.getGiftCertMsg() == null || this.giftCertMsg != null && this.giftCertMsg.equals(other.getGiftCertMsg())) && (this.giftCertOrigAmt == null && other.getGiftCertOrigAmt() == null || this.giftCertOrigAmt != null && this.giftCertOrigAmt.equals(other.getGiftCertOrigAmt())) && (this.giftCertRecipient == null && other.getGiftCertRecipient() == null || this.giftCertRecipient != null && this.giftCertRecipient.equals(other.getGiftCertRecipient())) && (this.hierarchyNode == null && other.getHierarchyNode() == null || this.hierarchyNode != null && this.hierarchyNode.equals(other.getHierarchyNode())) && (this.hierarchyVersion == null && other.getHierarchyVersion() == null || this.hierarchyVersion != null && this.hierarchyVersion.equals(other.getHierarchyVersion())) && (this.imageUrl == null && other.getImageUrl() == null || this.imageUrl != null && this.imageUrl.equals(other.getImageUrl())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.inventoryLocation == null && other.getInventoryLocation() == null || this.inventoryLocation != null && this.inventoryLocation.equals(other.getInventoryLocation())) && (this.invtClassification == null && other.getInvtClassification() == null || this.invtClassification != null && this.invtClassification.equals(other.getInvtClassification())) && (this.invtCountInterval == null && other.getInvtCountInterval() == null || this.invtCountInterval != null && this.invtCountInterval.equals(other.getInvtCountInterval())) && (this.isAvailable == null && other.getIsAvailable() == null || this.isAvailable != null && this.isAvailable.equals(other.getIsAvailable())) && (this.isDropShipItem == null && other.getIsDropShipItem() == null || this.isDropShipItem != null && this.isDropShipItem.equals(other.getIsDropShipItem())) && (this.isFulfillable == null && other.getIsFulfillable() == null || this.isFulfillable != null && this.isFulfillable.equals(other.getIsFulfillable())) && (this.isGcoCompliant == null && other.getIsGcoCompliant() == null || this.isGcoCompliant != null && this.isGcoCompliant.equals(other.getIsGcoCompliant())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isLotItem == null && other.getIsLotItem() == null || this.isLotItem != null && this.isLotItem.equals(other.getIsLotItem())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && this.isOnline.equals(other.getIsOnline())) && (this.isPreferredVendor == null && other.getIsPreferredVendor() == null || this.isPreferredVendor != null && this.isPreferredVendor.equals(other.getIsPreferredVendor())) && (this.isSerialItem == null && other.getIsSerialItem() == null || this.isSerialItem != null && this.isSerialItem.equals(other.getIsSerialItem())) && (this.isSpecialOrderItem == null && other.getIsSpecialOrderItem() == null || this.isSpecialOrderItem != null && this.isSpecialOrderItem.equals(other.getIsSpecialOrderItem())) && (this.isSpecialWorkOrderItem == null && other.getIsSpecialWorkOrderItem() == null || this.isSpecialWorkOrderItem != null && this.isSpecialWorkOrderItem.equals(other.getIsSpecialWorkOrderItem())) && (this.isStorePickupAllowed == null && other.getIsStorePickupAllowed() == null || this.isStorePickupAllowed != null && this.isStorePickupAllowed.equals(other.getIsStorePickupAllowed())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.isVsoeBundle == null && other.getIsVsoeBundle() == null || this.isVsoeBundle != null && this.isVsoeBundle.equals(other.getIsVsoeBundle())) && (this.isWip == null && other.getIsWip() == null || this.isWip != null && this.isWip.equals(other.getIsWip())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && this.itemRevenueCategory.equals(other.getItemRevenueCategory())) && (this.itemUrl == null && other.getItemUrl() == null || this.itemUrl != null && this.itemUrl.equals(other.getItemUrl())) && (this.lastInvtCountDate == null && other.getLastInvtCountDate() == null || this.lastInvtCountDate != null && this.lastInvtCountDate.equals(other.getLastInvtCountDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.lastPurchasePrice == null && other.getLastPurchasePrice() == null || this.lastPurchasePrice != null && this.lastPurchasePrice.equals(other.getLastPurchasePrice())) && (this.lastQuantityAvailableChange == null && other.getLastQuantityAvailableChange() == null || this.lastQuantityAvailableChange != null && this.lastQuantityAvailableChange.equals(other.getLastQuantityAvailableChange())) && (this.leadTime == null && other.getLeadTime() == null || this.leadTime != null && this.leadTime.equals(other.getLeadTime())) && (this.listingDuration == null && other.getListingDuration() == null || this.listingDuration != null && this.listingDuration.equals(other.getListingDuration())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.locationAllowStorePickup == null && other.getLocationAllowStorePickup() == null || this.locationAllowStorePickup != null && this.locationAllowStorePickup.equals(other.getLocationAllowStorePickup())) && (this.locationAtpLeadTime == null && other.getLocationAtpLeadTime() == null || this.locationAtpLeadTime != null && this.locationAtpLeadTime.equals(other.getLocationAtpLeadTime())) && (this.locationAverageCost == null && other.getLocationAverageCost() == null || this.locationAverageCost != null && this.locationAverageCost.equals(other.getLocationAverageCost())) && (this.locationBuildTime == null && other.getLocationBuildTime() == null || this.locationBuildTime != null && this.locationBuildTime.equals(other.getLocationBuildTime())) && (this.locationCost == null && other.getLocationCost() == null || this.locationCost != null && this.locationCost.equals(other.getLocationCost())) && (this.locationCostAccountingStatus == null && other.getLocationCostAccountingStatus() == null || this.locationCostAccountingStatus != null && this.locationCostAccountingStatus.equals(other.getLocationCostAccountingStatus())) && (this.locationDefaultReturnCost == null && other.getLocationDefaultReturnCost() == null || this.locationDefaultReturnCost != null && this.locationDefaultReturnCost.equals(other.getLocationDefaultReturnCost())) && (this.locationDemandSource == null && other.getLocationDemandSource() == null || this.locationDemandSource != null && this.locationDemandSource.equals(other.getLocationDemandSource())) && (this.locationDemandTimeFence == null && other.getLocationDemandTimeFence() == null || this.locationDemandTimeFence != null && this.locationDemandTimeFence.equals(other.getLocationDemandTimeFence())) && (this.locationFixedLotSize == null && other.getLocationFixedLotSize() == null || this.locationFixedLotSize != null && this.locationFixedLotSize.equals(other.getLocationFixedLotSize())) && (this.locationInventoryCostTemplate == null && other.getLocationInventoryCostTemplate() == null || this.locationInventoryCostTemplate != null && this.locationInventoryCostTemplate.equals(other.getLocationInventoryCostTemplate())) && (this.locationInvtClassification == null && other.getLocationInvtClassification() == null || this.locationInvtClassification != null && this.locationInvtClassification.equals(other.getLocationInvtClassification())) && (this.locationInvtCountInterval == null && other.getLocationInvtCountInterval() == null || this.locationInvtCountInterval != null && this.locationInvtCountInterval.equals(other.getLocationInvtCountInterval())) && (this.locationLastInvtCountDate == null && other.getLocationLastInvtCountDate() == null || this.locationLastInvtCountDate != null && this.locationLastInvtCountDate.equals(other.getLocationLastInvtCountDate())) && (this.locationLeadTime == null && other.getLocationLeadTime() == null || this.locationLeadTime != null && this.locationLeadTime.equals(other.getLocationLeadTime())) && (this.locationNextInvtCountDate == null && other.getLocationNextInvtCountDate() == null || this.locationNextInvtCountDate != null && this.locationNextInvtCountDate.equals(other.getLocationNextInvtCountDate())) && (this.locationPeriodicLotSizeDays == null && other.getLocationPeriodicLotSizeDays() == null || this.locationPeriodicLotSizeDays != null && this.locationPeriodicLotSizeDays.equals(other.getLocationPeriodicLotSizeDays())) && (this.locationPeriodicLotSizeType == null && other.getLocationPeriodicLotSizeType() == null || this.locationPeriodicLotSizeType != null && this.locationPeriodicLotSizeType.equals(other.getLocationPeriodicLotSizeType())) && (this.locationPreferredStockLevel == null && other.getLocationPreferredStockLevel() == null || this.locationPreferredStockLevel != null && this.locationPreferredStockLevel.equals(other.getLocationPreferredStockLevel())) && (this.locationQtyAvailForStorePickup == null && other.getLocationQtyAvailForStorePickup() == null || this.locationQtyAvailForStorePickup != null && this.locationQtyAvailForStorePickup.equals(other.getLocationQtyAvailForStorePickup())) && (this.locationQuantityAvailable == null && other.getLocationQuantityAvailable() == null || this.locationQuantityAvailable != null && this.locationQuantityAvailable.equals(other.getLocationQuantityAvailable())) && (this.locationQuantityBackOrdered == null && other.getLocationQuantityBackOrdered() == null || this.locationQuantityBackOrdered != null && this.locationQuantityBackOrdered.equals(other.getLocationQuantityBackOrdered())) && (this.locationQuantityCommitted == null && other.getLocationQuantityCommitted() == null || this.locationQuantityCommitted != null && this.locationQuantityCommitted.equals(other.getLocationQuantityCommitted())) && (this.locationQuantityInTransit == null && other.getLocationQuantityInTransit() == null || this.locationQuantityInTransit != null && this.locationQuantityInTransit.equals(other.getLocationQuantityInTransit())) && (this.locationQuantityOnHand == null && other.getLocationQuantityOnHand() == null || this.locationQuantityOnHand != null && this.locationQuantityOnHand.equals(other.getLocationQuantityOnHand())) && (this.locationQuantityOnOrder == null && other.getLocationQuantityOnOrder() == null || this.locationQuantityOnOrder != null && this.locationQuantityOnOrder.equals(other.getLocationQuantityOnOrder())) && (this.locationReorderPoint == null && other.getLocationReorderPoint() == null || this.locationReorderPoint != null && this.locationReorderPoint.equals(other.getLocationReorderPoint())) && (this.locationRescheduleInDays == null && other.getLocationRescheduleInDays() == null || this.locationRescheduleInDays != null && this.locationRescheduleInDays.equals(other.getLocationRescheduleInDays())) && (this.locationRescheduleOutDays == null && other.getLocationRescheduleOutDays() == null || this.locationRescheduleOutDays != null && this.locationRescheduleOutDays.equals(other.getLocationRescheduleOutDays())) && (this.locationSafetyStockLevel == null && other.getLocationSafetyStockLevel() == null || this.locationSafetyStockLevel != null && this.locationSafetyStockLevel.equals(other.getLocationSafetyStockLevel())) && (this.locationStorePickupBufferStock == null && other.getLocationStorePickupBufferStock() == null || this.locationStorePickupBufferStock != null && this.locationStorePickupBufferStock.equals(other.getLocationStorePickupBufferStock())) && (this.locationSupplyLotSizingMethod == null && other.getLocationSupplyLotSizingMethod() == null || this.locationSupplyLotSizingMethod != null && this.locationSupplyLotSizingMethod.equals(other.getLocationSupplyLotSizingMethod())) && (this.locationSupplyTimeFence == null && other.getLocationSupplyTimeFence() == null || this.locationSupplyTimeFence != null && this.locationSupplyTimeFence.equals(other.getLocationSupplyTimeFence())) && (this.locationSupplyType == null && other.getLocationSupplyType() == null || this.locationSupplyType != null && this.locationSupplyType.equals(other.getLocationSupplyType())) && (this.locationTotalValue == null && other.getLocationTotalValue() == null || this.locationTotalValue != null && this.locationTotalValue.equals(other.getLocationTotalValue())) && (this.locBackwardConsumptionDays == null && other.getLocBackwardConsumptionDays() == null || this.locBackwardConsumptionDays != null && this.locBackwardConsumptionDays.equals(other.getLocBackwardConsumptionDays())) && (this.locForwardConsumptionDays == null && other.getLocForwardConsumptionDays() == null || this.locForwardConsumptionDays != null && this.locForwardConsumptionDays.equals(other.getLocForwardConsumptionDays())) && (this.lowerWarningLimit == null && other.getLowerWarningLimit() == null || this.lowerWarningLimit != null && this.lowerWarningLimit.equals(other.getLowerWarningLimit())) && (this.manufacturer == null && other.getManufacturer() == null || this.manufacturer != null && this.manufacturer.equals(other.getManufacturer())) && (this.manufactureraddr1 == null && other.getManufactureraddr1() == null || this.manufactureraddr1 != null && this.manufactureraddr1.equals(other.getManufactureraddr1())) && (this.manufacturerCity == null && other.getManufacturerCity() == null || this.manufacturerCity != null && this.manufacturerCity.equals(other.getManufacturerCity())) && (this.manufacturerState == null && other.getManufacturerState() == null || this.manufacturerState != null && this.manufacturerState.equals(other.getManufacturerState())) && (this.manufacturerTariff == null && other.getManufacturerTariff() == null || this.manufacturerTariff != null && this.manufacturerTariff.equals(other.getManufacturerTariff())) && (this.manufacturerTaxId == null && other.getManufacturerTaxId() == null || this.manufacturerTaxId != null && this.manufacturerTaxId.equals(other.getManufacturerTaxId())) && (this.manufacturerZip == null && other.getManufacturerZip() == null || this.manufacturerZip != null && this.manufacturerZip.equals(other.getManufacturerZip())) && (this.manufacturingChargeItem == null && other.getManufacturingChargeItem() == null || this.manufacturingChargeItem != null && this.manufacturingChargeItem.equals(other.getManufacturingChargeItem())) && (this.matchBillToReceipt == null && other.getMatchBillToReceipt() == null || this.matchBillToReceipt != null && this.matchBillToReceipt.equals(other.getMatchBillToReceipt())) && (this.matrix == null && other.getMatrix() == null || this.matrix != null && this.matrix.equals(other.getMatrix())) && (this.matrixChild == null && other.getMatrixChild() == null || this.matrixChild != null && this.matrixChild.equals(other.getMatrixChild())) && (this.maximumQuantity == null && other.getMaximumQuantity() == null || this.maximumQuantity != null && this.maximumQuantity.equals(other.getMaximumQuantity())) && (this.metaTagHtml == null && other.getMetaTagHtml() == null || this.metaTagHtml != null && this.metaTagHtml.equals(other.getMetaTagHtml())) && (this.minimumQuantity == null && other.getMinimumQuantity() == null || this.minimumQuantity != null && this.minimumQuantity.equals(other.getMinimumQuantity())) && (this.mossApplies == null && other.getMossApplies() == null || this.mossApplies != null && this.mossApplies.equals(other.getMossApplies())) && (this.mpn == null && other.getMpn() == null || this.mpn != null && this.mpn.equals(other.getMpn())) && (this.multManufactureAddr == null && other.getMultManufactureAddr() == null || this.multManufactureAddr != null && this.multManufactureAddr.equals(other.getMultManufactureAddr())) && (this.nexTagCategory == null && other.getNexTagCategory() == null || this.nexTagCategory != null && this.nexTagCategory.equals(other.getNexTagCategory())) && (this.nexTagProductFeed == null && other.getNexTagProductFeed() == null || this.nexTagProductFeed != null && this.nexTagProductFeed.equals(other.getNexTagProductFeed())) && (this.nextInvtCountDate == null && other.getNextInvtCountDate() == null || this.nextInvtCountDate != null && this.nextInvtCountDate.equals(other.getNextInvtCountDate())) && (this.numActiveListings == null && other.getNumActiveListings() == null || this.numActiveListings != null && this.numActiveListings.equals(other.getNumActiveListings())) && (this.numberAllowedDownloads == null && other.getNumberAllowedDownloads() == null || this.numberAllowedDownloads != null && this.numberAllowedDownloads.equals(other.getNumberAllowedDownloads())) && (this.numCurrentlyListed == null && other.getNumCurrentlyListed() == null || this.numCurrentlyListed != null && this.numCurrentlyListed.equals(other.getNumCurrentlyListed())) && (this.obsoleteDate == null && other.getObsoleteDate() == null || this.obsoleteDate != null && this.obsoleteDate.equals(other.getObsoleteDate())) && (this.obsoleteRevision == null && other.getObsoleteRevision() == null || this.obsoleteRevision != null && this.obsoleteRevision.equals(other.getObsoleteRevision())) && (this.offerSupport == null && other.getOfferSupport() == null || this.offerSupport != null && this.offerSupport.equals(other.getOfferSupport())) && (this.onlineCustomerPrice == null && other.getOnlineCustomerPrice() == null || this.onlineCustomerPrice != null && this.onlineCustomerPrice.equals(other.getOnlineCustomerPrice())) && (this.onSpecial == null && other.getOnSpecial() == null || this.onSpecial != null && this.onSpecial.equals(other.getOnSpecial())) && (this.otherVendor == null && other.getOtherVendor() == null || this.otherVendor != null && this.otherVendor.equals(other.getOtherVendor())) && (this.outOfStockBehavior == null && other.getOutOfStockBehavior() == null || this.outOfStockBehavior != null && this.outOfStockBehavior.equals(other.getOutOfStockBehavior())) && (this.overallQuantityPricingType == null && other.getOverallQuantityPricingType() == null || this.overallQuantityPricingType != null && this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType())) && (this.overheadType == null && other.getOverheadType() == null || this.overheadType != null && this.overheadType.equals(other.getOverheadType())) && (this.pageTitle == null && other.getPageTitle() == null || this.pageTitle != null && this.pageTitle.equals(other.getPageTitle())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.periodicLotSizeDays == null && other.getPeriodicLotSizeDays() == null || this.periodicLotSizeDays != null && this.periodicLotSizeDays.equals(other.getPeriodicLotSizeDays())) && (this.periodicLotSizeType == null && other.getPeriodicLotSizeType() == null || this.periodicLotSizeType != null && this.periodicLotSizeType.equals(other.getPeriodicLotSizeType())) && (this.planningItemCategory == null && other.getPlanningItemCategory() == null || this.planningItemCategory != null && this.planningItemCategory.equals(other.getPlanningItemCategory())) && (this.preferenceCriterion == null && other.getPreferenceCriterion() == null || this.preferenceCriterion != null && this.preferenceCriterion.equals(other.getPreferenceCriterion())) && (this.preferredBin == null && other.getPreferredBin() == null || this.preferredBin != null && this.preferredBin.equals(other.getPreferredBin())) && (this.preferredLocation == null && other.getPreferredLocation() == null || this.preferredLocation != null && this.preferredLocation.equals(other.getPreferredLocation())) && (this.preferredStockLevel == null && other.getPreferredStockLevel() == null || this.preferredStockLevel != null && this.preferredStockLevel.equals(other.getPreferredStockLevel())) && (this.preferredStockLevelDays == null && other.getPreferredStockLevelDays() == null || this.preferredStockLevelDays != null && this.preferredStockLevelDays.equals(other.getPreferredStockLevelDays())) && (this.price == null && other.getPrice() == null || this.price != null && this.price.equals(other.getPrice())) && (this.pricesIncludeTax == null && other.getPricesIncludeTax() == null || this.pricesIncludeTax != null && this.pricesIncludeTax.equals(other.getPricesIncludeTax())) && (this.pricingGroup == null && other.getPricingGroup() == null || this.pricingGroup != null && this.pricingGroup.equals(other.getPricingGroup())) && (this.primaryCategory == null && other.getPrimaryCategory() == null || this.primaryCategory != null && this.primaryCategory.equals(other.getPrimaryCategory())) && (this.purchaseOrderAmount == null && other.getPurchaseOrderAmount() == null || this.purchaseOrderAmount != null && this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount())) && (this.purchaseOrderQuantity == null && other.getPurchaseOrderQuantity() == null || this.purchaseOrderQuantity != null && this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity())) && (this.purchaseOrderQuantityDiff == null && other.getPurchaseOrderQuantityDiff() == null || this.purchaseOrderQuantityDiff != null && this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff())) && (this.purchaseUnit == null && other.getPurchaseUnit() == null || this.purchaseUnit != null && this.purchaseUnit.equals(other.getPurchaseUnit())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.quantityBackOrdered == null && other.getQuantityBackOrdered() == null || this.quantityBackOrdered != null && this.quantityBackOrdered.equals(other.getQuantityBackOrdered())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && this.quantityCommitted.equals(other.getQuantityCommitted())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.quantityOnOrder == null && other.getQuantityOnOrder() == null || this.quantityOnOrder != null && this.quantityOnOrder.equals(other.getQuantityOnOrder())) && (this.quantityPricingSchedule == null && other.getQuantityPricingSchedule() == null || this.quantityPricingSchedule != null && this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule())) && (this.receiptAmount == null && other.getReceiptAmount() == null || this.receiptAmount != null && this.receiptAmount.equals(other.getReceiptAmount())) && (this.receiptQuantity == null && other.getReceiptQuantity() == null || this.receiptQuantity != null && this.receiptQuantity.equals(other.getReceiptQuantity())) && (this.receiptQuantityDiff == null && other.getReceiptQuantityDiff() == null || this.receiptQuantityDiff != null && this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff())) && (this.reorderMultiple == null && other.getReorderMultiple() == null || this.reorderMultiple != null && this.reorderMultiple.equals(other.getReorderMultiple())) && (this.reorderPoint == null && other.getReorderPoint() == null || this.reorderPoint != null && this.reorderPoint.equals(other.getReorderPoint())) && (this.rescheduleInDays == null && other.getRescheduleInDays() == null || this.rescheduleInDays != null && this.rescheduleInDays.equals(other.getRescheduleInDays())) && (this.rescheduleOutDays == null && other.getRescheduleOutDays() == null || this.rescheduleOutDays != null && this.rescheduleOutDays.equals(other.getRescheduleOutDays())) && (this.reservePrice == null && other.getReservePrice() == null || this.reservePrice != null && this.reservePrice.equals(other.getReservePrice())) && (this.revenueAllocationGroup == null && other.getRevenueAllocationGroup() == null || this.revenueAllocationGroup != null && this.revenueAllocationGroup.equals(other.getRevenueAllocationGroup())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && this.revRecForecastRule.equals(other.getRevRecForecastRule())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.roundUpAsComponent == null && other.getRoundUpAsComponent() == null || this.roundUpAsComponent != null && this.roundUpAsComponent.equals(other.getRoundUpAsComponent())) && (this.safetyStockLevel == null && other.getSafetyStockLevel() == null || this.safetyStockLevel != null && this.safetyStockLevel.equals(other.getSafetyStockLevel())) && (this.safetyStockLevelDays == null && other.getSafetyStockLevelDays() == null || this.safetyStockLevelDays != null && this.safetyStockLevelDays.equals(other.getSafetyStockLevelDays())) && (this.salesDescription == null && other.getSalesDescription() == null || this.salesDescription != null && this.salesDescription.equals(other.getSalesDescription())) && (this.saleUnit == null && other.getSaleUnit() == null || this.saleUnit != null && this.saleUnit.equals(other.getSaleUnit())) && (this.sameAsPrimaryBookAmortization == null && other.getSameAsPrimaryBookAmortization() == null || this.sameAsPrimaryBookAmortization != null && this.sameAsPrimaryBookAmortization.equals(other.getSameAsPrimaryBookAmortization())) && (this.sameAsPrimaryBookRevRec == null && other.getSameAsPrimaryBookRevRec() == null || this.sameAsPrimaryBookRevRec != null && this.sameAsPrimaryBookRevRec.equals(other.getSameAsPrimaryBookRevRec())) && (this.scheduleBCode == null && other.getScheduleBCode() == null || this.scheduleBCode != null && this.scheduleBCode.equals(other.getScheduleBCode())) && (this.scheduleBNumber == null && other.getScheduleBNumber() == null || this.scheduleBNumber != null && this.scheduleBNumber.equals(other.getScheduleBNumber())) && (this.scheduleBQuantity == null && other.getScheduleBQuantity() == null || this.scheduleBQuantity != null && this.scheduleBQuantity.equals(other.getScheduleBQuantity())) && (this.searchKeywords == null && other.getSearchKeywords() == null || this.searchKeywords != null && this.searchKeywords.equals(other.getSearchKeywords())) && (this.seasonalDemand == null && other.getSeasonalDemand() == null || this.seasonalDemand != null && this.seasonalDemand.equals(other.getSeasonalDemand())) && (this.secondaryConsumptionUnit == null && other.getSecondaryConsumptionUnit() == null || this.secondaryConsumptionUnit != null && this.secondaryConsumptionUnit.equals(other.getSecondaryConsumptionUnit())) && (this.secondaryPurchaseUnit == null && other.getSecondaryPurchaseUnit() == null || this.secondaryPurchaseUnit != null && this.secondaryPurchaseUnit.equals(other.getSecondaryPurchaseUnit())) && (this.secondarySaleUnit == null && other.getSecondarySaleUnit() == null || this.secondarySaleUnit != null && this.secondarySaleUnit.equals(other.getSecondarySaleUnit())) && (this.secondaryStockUnit == null && other.getSecondaryStockUnit() == null || this.secondaryStockUnit != null && this.secondaryStockUnit.equals(other.getSecondaryStockUnit())) && (this.secondaryUnitsType == null && other.getSecondaryUnitsType() == null || this.secondaryUnitsType != null && this.secondaryUnitsType.equals(other.getSecondaryUnitsType())) && (this.sellOnEBay == null && other.getSellOnEBay() == null || this.sellOnEBay != null && this.sellOnEBay.equals(other.getSellOnEBay())) && (this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && this.serialNumber.equals(other.getSerialNumber())) && (this.serialNumberLocation == null && other.getSerialNumberLocation() == null || this.serialNumberLocation != null && this.serialNumberLocation.equals(other.getSerialNumberLocation())) && (this.shipIndividually == null && other.getShipIndividually() == null || this.shipIndividually != null && this.shipIndividually.equals(other.getShipIndividually())) && (this.shipPackage == null && other.getShipPackage() == null || this.shipPackage != null && this.shipPackage.equals(other.getShipPackage())) && (this.shippingCarrier == null && other.getShippingCarrier() == null || this.shippingCarrier != null && this.shippingCarrier.equals(other.getShippingCarrier())) && (this.shippingRate == null && other.getShippingRate() == null || this.shippingRate != null && this.shippingRate.equals(other.getShippingRate())) && (this.shoppingDotComCategory == null && other.getShoppingDotComCategory() == null || this.shoppingDotComCategory != null && this.shoppingDotComCategory.equals(other.getShoppingDotComCategory())) && (this.shoppingProductFeed == null && other.getShoppingProductFeed() == null || this.shoppingProductFeed != null && this.shoppingProductFeed.equals(other.getShoppingProductFeed())) && (this.shopzillaCategoryId == null && other.getShopzillaCategoryId() == null || this.shopzillaCategoryId != null && this.shopzillaCategoryId.equals(other.getShopzillaCategoryId())) && (this.shopzillaProductFeed == null && other.getShopzillaProductFeed() == null || this.shopzillaProductFeed != null && this.shopzillaProductFeed.equals(other.getShopzillaProductFeed())) && (this.sitemapPriority == null && other.getSitemapPriority() == null || this.sitemapPriority != null && this.sitemapPriority.equals(other.getSitemapPriority())) && (this.softDescriptor == null && other.getSoftDescriptor() == null || this.softDescriptor != null && this.softDescriptor.equals(other.getSoftDescriptor())) && (this.startingPrice == null && other.getStartingPrice() == null || this.startingPrice != null && this.startingPrice.equals(other.getStartingPrice())) && (this.stockDescription == null && other.getStockDescription() == null || this.stockDescription != null && this.stockDescription.equals(other.getStockDescription())) && (this.stockUnit == null && other.getStockUnit() == null || this.stockUnit != null && this.stockUnit.equals(other.getStockUnit())) && (this.storeDescription == null && other.getStoreDescription() == null || this.storeDescription != null && this.storeDescription.equals(other.getStoreDescription())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.subType == null && other.getSubType() == null || this.subType != null && this.subType.equals(other.getSubType())) && (this.supplyLotSizingMethod == null && other.getSupplyLotSizingMethod() == null || this.supplyLotSizingMethod != null && this.supplyLotSizingMethod.equals(other.getSupplyLotSizingMethod())) && (this.supplyReplenishmentMethod == null && other.getSupplyReplenishmentMethod() == null || this.supplyReplenishmentMethod != null && this.supplyReplenishmentMethod.equals(other.getSupplyReplenishmentMethod())) && (this.supplyTimeFence == null && other.getSupplyTimeFence() == null || this.supplyTimeFence != null && this.supplyTimeFence.equals(other.getSupplyTimeFence())) && (this.supplyType == null && other.getSupplyType() == null || this.supplyType != null && this.supplyType.equals(other.getSupplyType())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && this.taxSchedule.equals(other.getTaxSchedule())) && (this.thumbnailUrl == null && other.getThumbnailUrl() == null || this.thumbnailUrl != null && this.thumbnailUrl.equals(other.getThumbnailUrl())) && (this.totalValue == null && other.getTotalValue() == null || this.totalValue != null && this.totalValue.equals(other.getTotalValue())) && (this.trackLandedCost == null && other.getTrackLandedCost() == null || this.trackLandedCost != null && this.trackLandedCost.equals(other.getTrackLandedCost())) && (this.transferPrice == null && other.getTransferPrice() == null || this.transferPrice != null && this.transferPrice.equals(other.getTransferPrice())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && this.unitsType.equals(other.getUnitsType())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && this.upcCode.equals(other.getUpcCode())) && (this.upperWarningLimit == null && other.getUpperWarningLimit() == null || this.upperWarningLimit != null && this.upperWarningLimit.equals(other.getUpperWarningLimit())) && (this.urlComponent == null && other.getUrlComponent() == null || this.urlComponent != null && this.urlComponent.equals(other.getUrlComponent())) && (this.useBins == null && other.getUseBins() == null || this.useBins != null && this.useBins.equals(other.getUseBins())) && (this.useComponentYield == null && other.getUseComponentYield() == null || this.useComponentYield != null && this.useComponentYield.equals(other.getUseComponentYield())) && (this.useMarginalRates == null && other.getUseMarginalRates() == null || this.useMarginalRates != null && this.useMarginalRates.equals(other.getUseMarginalRates())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && this.vendor.equals(other.getVendor())) && (this.vendorCode == null && other.getVendorCode() == null || this.vendorCode != null && this.vendorCode.equals(other.getVendorCode())) && (this.vendorCost == null && other.getVendorCost() == null || this.vendorCost != null && this.vendorCost.equals(other.getVendorCost())) && (this.vendorCostEntered == null && other.getVendorCostEntered() == null || this.vendorCostEntered != null && this.vendorCostEntered.equals(other.getVendorCostEntered())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.vendorPriceCurrency == null && other.getVendorPriceCurrency() == null || this.vendorPriceCurrency != null && this.vendorPriceCurrency.equals(other.getVendorPriceCurrency())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && this.vsoeSopGroup.equals(other.getVsoeSopGroup())) && (this.webSite == null && other.getWebSite() == null || this.webSite != null && this.webSite.equals(other.getWebSite())) && (this.weight == null && other.getWeight() == null || this.weight != null && this.weight.equals(other.getWeight())) && (this.yahooProductFeed == null && other.getYahooProductFeed() == null || this.yahooProductFeed != null && this.yahooProductFeed.equals(other.getYahooProductFeed())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccBookRevRecForecastRule() != null) {
            _hashCode += this.getAccBookRevRecForecastRule().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
        }
        if (this.getAccountingBookAmortization() != null) {
            _hashCode += this.getAccountingBookAmortization().hashCode();
        }
        if (this.getAccountingBookCreatePlansOn() != null) {
            _hashCode += this.getAccountingBookCreatePlansOn().hashCode();
        }
        if (this.getAccountingBookRevRecRule() != null) {
            _hashCode += this.getAccountingBookRevRecRule().hashCode();
        }
        if (this.getAccountingBookRevRecSchedule() != null) {
            _hashCode += this.getAccountingBookRevRecSchedule().hashCode();
        }
        if (this.getAllowedShippingMethod() != null) {
            _hashCode += this.getAllowedShippingMethod().hashCode();
        }
        if (this.getAlternateDemandSourceItem() != null) {
            _hashCode += this.getAlternateDemandSourceItem().hashCode();
        }
        if (this.getAtpLeadTime() != null) {
            _hashCode += this.getAtpLeadTime().hashCode();
        }
        if (this.getAtpMethod() != null) {
            _hashCode += this.getAtpMethod().hashCode();
        }
        if (this.getAutoLeadTime() != null) {
            _hashCode += this.getAutoLeadTime().hashCode();
        }
        if (this.getAutoPreferredStockLevel() != null) {
            _hashCode += this.getAutoPreferredStockLevel().hashCode();
        }
        if (this.getAutoReorderPoint() != null) {
            _hashCode += this.getAutoReorderPoint().hashCode();
        }
        if (this.getAvailableToPartners() != null) {
            _hashCode += this.getAvailableToPartners().hashCode();
        }
        if (this.getAverageCost() != null) {
            _hashCode += this.getAverageCost().hashCode();
        }
        if (this.getBackwardConsumptionDays() != null) {
            _hashCode += this.getBackwardConsumptionDays().hashCode();
        }
        if (this.getBinNumber() != null) {
            _hashCode += this.getBinNumber().hashCode();
        }
        if (this.getBinOnHandAvail() != null) {
            _hashCode += this.getBinOnHandAvail().hashCode();
        }
        if (this.getBinOnHandCount() != null) {
            _hashCode += this.getBinOnHandCount().hashCode();
        }
        if (this.getBomQuantity() != null) {
            _hashCode += this.getBomQuantity().hashCode();
        }
        if (this.getBuildEntireAssembly() != null) {
            _hashCode += this.getBuildEntireAssembly().hashCode();
        }
        if (this.getBuildTime() != null) {
            _hashCode += this.getBuildTime().hashCode();
        }
        if (this.getBuildTimeLotSize() != null) {
            _hashCode += this.getBuildTimeLotSize().hashCode();
        }
        if (this.getBuyItNowPrice() != null) {
            _hashCode += this.getBuyItNowPrice().hashCode();
        }
        if (this.getCaption() != null) {
            _hashCode += this.getCaption().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getComponent() != null) {
            _hashCode += this.getComponent().hashCode();
        }
        if (this.getComponentOf() != null) {
            _hashCode += this.getComponentOf().hashCode();
        }
        if (this.getComponentYield() != null) {
            _hashCode += this.getComponentYield().hashCode();
        }
        if (this.getConsumptionUnit() != null) {
            _hashCode += this.getConsumptionUnit().hashCode();
        }
        if (this.getContingentRevenueHandling() != null) {
            _hashCode += this.getContingentRevenueHandling().hashCode();
        }
        if (this.getConversionRate() != null) {
            _hashCode += this.getConversionRate().hashCode();
        }
        if (this.getCopyDescription() != null) {
            _hashCode += this.getCopyDescription().hashCode();
        }
        if (this.getCorrelatedItem() != null) {
            _hashCode += this.getCorrelatedItem().hashCode();
        }
        if (this.getCorrelatedItemCorrelation() != null) {
            _hashCode += this.getCorrelatedItemCorrelation().hashCode();
        }
        if (this.getCorrelatedItemCount() != null) {
            _hashCode += this.getCorrelatedItemCount().hashCode();
        }
        if (this.getCorrelatedItemLift() != null) {
            _hashCode += this.getCorrelatedItemLift().hashCode();
        }
        if (this.getCorrelatedItemPurchaseRate() != null) {
            _hashCode += this.getCorrelatedItemPurchaseRate().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getCostAccountingStatus() != null) {
            _hashCode += this.getCostAccountingStatus().hashCode();
        }
        if (this.getCostCategory() != null) {
            _hashCode += this.getCostCategory().hashCode();
        }
        if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
        }
        if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
        }
        if (this.getCostingMethod() != null) {
            _hashCode += this.getCostingMethod().hashCode();
        }
        if (this.getCountryOfManufacture() != null) {
            _hashCode += this.getCountryOfManufacture().hashCode();
        }
        if (this.getCreated() != null) {
            _hashCode += this.getCreated().hashCode();
        }
        if (this.getCreateJob() != null) {
            _hashCode += this.getCreateJob().hashCode();
        }
        if (this.getCreateRevenuePlansOn() != null) {
            _hashCode += this.getCreateRevenuePlansOn().hashCode();
        }
        if (this.getDateViewed() != null) {
            _hashCode += this.getDateViewed().hashCode();
        }
        if (this.getDaysBeforeExpiration() != null) {
            _hashCode += this.getDaysBeforeExpiration().hashCode();
        }
        if (this.getDefaultReturnCost() != null) {
            _hashCode += this.getDefaultReturnCost().hashCode();
        }
        if (this.getDefaultShippingMethod() != null) {
            _hashCode += this.getDefaultShippingMethod().hashCode();
        }
        if (this.getDeferRevRec() != null) {
            _hashCode += this.getDeferRevRec().hashCode();
        }
        if (this.getDemandModifier() != null) {
            _hashCode += this.getDemandModifier().hashCode();
        }
        if (this.getDemandSource() != null) {
            _hashCode += this.getDemandSource().hashCode();
        }
        if (this.getDemandTimeFence() != null) {
            _hashCode += this.getDemandTimeFence().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getDirectRevenuePosting() != null) {
            _hashCode += this.getDirectRevenuePosting().hashCode();
        }
        if (this.getDisplayIneBayStore() != null) {
            _hashCode += this.getDisplayIneBayStore().hashCode();
        }
        if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
        }
        if (this.getDistributionCategory() != null) {
            _hashCode += this.getDistributionCategory().hashCode();
        }
        if (this.getDistributionNetwork() != null) {
            _hashCode += this.getDistributionNetwork().hashCode();
        }
        if (this.getDontShowPrice() != null) {
            _hashCode += this.getDontShowPrice().hashCode();
        }
        if (this.getEBayItemDescription() != null) {
            _hashCode += this.getEBayItemDescription().hashCode();
        }
        if (this.getEBayItemSubtitle() != null) {
            _hashCode += this.getEBayItemSubtitle().hashCode();
        }
        if (this.getEBayItemTitle() != null) {
            _hashCode += this.getEBayItemTitle().hashCode();
        }
        if (this.getEbayRelistingOption() != null) {
            _hashCode += this.getEbayRelistingOption().hashCode();
        }
        if (this.getEffectiveBomControl() != null) {
            _hashCode += this.getEffectiveBomControl().hashCode();
        }
        if (this.getEffectiveDate() != null) {
            _hashCode += this.getEffectiveDate().hashCode();
        }
        if (this.getEffectiveRevision() != null) {
            _hashCode += this.getEffectiveRevision().hashCode();
        }
        if (this.getEnableCatchWeight() != null) {
            _hashCode += this.getEnableCatchWeight().hashCode();
        }
        if (this.getEndAuctionsWhenOutOfStock() != null) {
            _hashCode += this.getEndAuctionsWhenOutOfStock().hashCode();
        }
        if (this.getExcludeFromSitemap() != null) {
            _hashCode += this.getExcludeFromSitemap().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFeaturedDescription() != null) {
            _hashCode += this.getFeaturedDescription().hashCode();
        }
        if (this.getFeedDescription() != null) {
            _hashCode += this.getFeedDescription().hashCode();
        }
        if (this.getFeedName() != null) {
            _hashCode += this.getFeedName().hashCode();
        }
        if (this.getFixedBuildTime() != null) {
            _hashCode += this.getFixedBuildTime().hashCode();
        }
        if (this.getFixedLotSize() != null) {
            _hashCode += this.getFixedLotSize().hashCode();
        }
        if (this.getForwardConsumptionDays() != null) {
            _hashCode += this.getForwardConsumptionDays().hashCode();
        }
        if (this.getFraudRisk() != null) {
            _hashCode += this.getFraudRisk().hashCode();
        }
        if (this.getFroogleProductFeed() != null) {
            _hashCode += this.getFroogleProductFeed().hashCode();
        }
        if (this.getFutureHorizon() != null) {
            _hashCode += this.getFutureHorizon().hashCode();
        }
        if (this.getFxCost() != null) {
            _hashCode += this.getFxCost().hashCode();
        }
        if (this.getGenerateAccruals() != null) {
            _hashCode += this.getGenerateAccruals().hashCode();
        }
        if (this.getGiftCertAuthCode() != null) {
            _hashCode += this.getGiftCertAuthCode().hashCode();
        }
        if (this.getGiftCertEmail() != null) {
            _hashCode += this.getGiftCertEmail().hashCode();
        }
        if (this.getGiftCertExpDate() != null) {
            _hashCode += this.getGiftCertExpDate().hashCode();
        }
        if (this.getGiftCertFrom() != null) {
            _hashCode += this.getGiftCertFrom().hashCode();
        }
        if (this.getGiftCertMsg() != null) {
            _hashCode += this.getGiftCertMsg().hashCode();
        }
        if (this.getGiftCertOrigAmt() != null) {
            _hashCode += this.getGiftCertOrigAmt().hashCode();
        }
        if (this.getGiftCertRecipient() != null) {
            _hashCode += this.getGiftCertRecipient().hashCode();
        }
        if (this.getHierarchyNode() != null) {
            _hashCode += this.getHierarchyNode().hashCode();
        }
        if (this.getHierarchyVersion() != null) {
            _hashCode += this.getHierarchyVersion().hashCode();
        }
        if (this.getImageUrl() != null) {
            _hashCode += this.getImageUrl().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getInventoryLocation() != null) {
            _hashCode += this.getInventoryLocation().hashCode();
        }
        if (this.getInvtClassification() != null) {
            _hashCode += this.getInvtClassification().hashCode();
        }
        if (this.getInvtCountInterval() != null) {
            _hashCode += this.getInvtCountInterval().hashCode();
        }
        if (this.getIsAvailable() != null) {
            _hashCode += this.getIsAvailable().hashCode();
        }
        if (this.getIsDropShipItem() != null) {
            _hashCode += this.getIsDropShipItem().hashCode();
        }
        if (this.getIsFulfillable() != null) {
            _hashCode += this.getIsFulfillable().hashCode();
        }
        if (this.getIsGcoCompliant() != null) {
            _hashCode += this.getIsGcoCompliant().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsLotItem() != null) {
            _hashCode += this.getIsLotItem().hashCode();
        }
        if (this.getIsOnline() != null) {
            _hashCode += this.getIsOnline().hashCode();
        }
        if (this.getIsPreferredVendor() != null) {
            _hashCode += this.getIsPreferredVendor().hashCode();
        }
        if (this.getIsSerialItem() != null) {
            _hashCode += this.getIsSerialItem().hashCode();
        }
        if (this.getIsSpecialOrderItem() != null) {
            _hashCode += this.getIsSpecialOrderItem().hashCode();
        }
        if (this.getIsSpecialWorkOrderItem() != null) {
            _hashCode += this.getIsSpecialWorkOrderItem().hashCode();
        }
        if (this.getIsStorePickupAllowed() != null) {
            _hashCode += this.getIsStorePickupAllowed().hashCode();
        }
        if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getIsVsoeBundle() != null) {
            _hashCode += this.getIsVsoeBundle().hashCode();
        }
        if (this.getIsWip() != null) {
            _hashCode += this.getIsWip().hashCode();
        }
        if (this.getItemId() != null) {
            _hashCode += this.getItemId().hashCode();
        }
        if (this.getItemRevenueCategory() != null) {
            _hashCode += this.getItemRevenueCategory().hashCode();
        }
        if (this.getItemUrl() != null) {
            _hashCode += this.getItemUrl().hashCode();
        }
        if (this.getLastInvtCountDate() != null) {
            _hashCode += this.getLastInvtCountDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLastPurchasePrice() != null) {
            _hashCode += this.getLastPurchasePrice().hashCode();
        }
        if (this.getLastQuantityAvailableChange() != null) {
            _hashCode += this.getLastQuantityAvailableChange().hashCode();
        }
        if (this.getLeadTime() != null) {
            _hashCode += this.getLeadTime().hashCode();
        }
        if (this.getListingDuration() != null) {
            _hashCode += this.getListingDuration().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getLocationAllowStorePickup() != null) {
            _hashCode += this.getLocationAllowStorePickup().hashCode();
        }
        if (this.getLocationAtpLeadTime() != null) {
            _hashCode += this.getLocationAtpLeadTime().hashCode();
        }
        if (this.getLocationAverageCost() != null) {
            _hashCode += this.getLocationAverageCost().hashCode();
        }
        if (this.getLocationBuildTime() != null) {
            _hashCode += this.getLocationBuildTime().hashCode();
        }
        if (this.getLocationCost() != null) {
            _hashCode += this.getLocationCost().hashCode();
        }
        if (this.getLocationCostAccountingStatus() != null) {
            _hashCode += this.getLocationCostAccountingStatus().hashCode();
        }
        if (this.getLocationDefaultReturnCost() != null) {
            _hashCode += this.getLocationDefaultReturnCost().hashCode();
        }
        if (this.getLocationDemandSource() != null) {
            _hashCode += this.getLocationDemandSource().hashCode();
        }
        if (this.getLocationDemandTimeFence() != null) {
            _hashCode += this.getLocationDemandTimeFence().hashCode();
        }
        if (this.getLocationFixedLotSize() != null) {
            _hashCode += this.getLocationFixedLotSize().hashCode();
        }
        if (this.getLocationInventoryCostTemplate() != null) {
            _hashCode += this.getLocationInventoryCostTemplate().hashCode();
        }
        if (this.getLocationInvtClassification() != null) {
            _hashCode += this.getLocationInvtClassification().hashCode();
        }
        if (this.getLocationInvtCountInterval() != null) {
            _hashCode += this.getLocationInvtCountInterval().hashCode();
        }
        if (this.getLocationLastInvtCountDate() != null) {
            _hashCode += this.getLocationLastInvtCountDate().hashCode();
        }
        if (this.getLocationLeadTime() != null) {
            _hashCode += this.getLocationLeadTime().hashCode();
        }
        if (this.getLocationNextInvtCountDate() != null) {
            _hashCode += this.getLocationNextInvtCountDate().hashCode();
        }
        if (this.getLocationPeriodicLotSizeDays() != null) {
            _hashCode += this.getLocationPeriodicLotSizeDays().hashCode();
        }
        if (this.getLocationPeriodicLotSizeType() != null) {
            _hashCode += this.getLocationPeriodicLotSizeType().hashCode();
        }
        if (this.getLocationPreferredStockLevel() != null) {
            _hashCode += this.getLocationPreferredStockLevel().hashCode();
        }
        if (this.getLocationQtyAvailForStorePickup() != null) {
            _hashCode += this.getLocationQtyAvailForStorePickup().hashCode();
        }
        if (this.getLocationQuantityAvailable() != null) {
            _hashCode += this.getLocationQuantityAvailable().hashCode();
        }
        if (this.getLocationQuantityBackOrdered() != null) {
            _hashCode += this.getLocationQuantityBackOrdered().hashCode();
        }
        if (this.getLocationQuantityCommitted() != null) {
            _hashCode += this.getLocationQuantityCommitted().hashCode();
        }
        if (this.getLocationQuantityInTransit() != null) {
            _hashCode += this.getLocationQuantityInTransit().hashCode();
        }
        if (this.getLocationQuantityOnHand() != null) {
            _hashCode += this.getLocationQuantityOnHand().hashCode();
        }
        if (this.getLocationQuantityOnOrder() != null) {
            _hashCode += this.getLocationQuantityOnOrder().hashCode();
        }
        if (this.getLocationReorderPoint() != null) {
            _hashCode += this.getLocationReorderPoint().hashCode();
        }
        if (this.getLocationRescheduleInDays() != null) {
            _hashCode += this.getLocationRescheduleInDays().hashCode();
        }
        if (this.getLocationRescheduleOutDays() != null) {
            _hashCode += this.getLocationRescheduleOutDays().hashCode();
        }
        if (this.getLocationSafetyStockLevel() != null) {
            _hashCode += this.getLocationSafetyStockLevel().hashCode();
        }
        if (this.getLocationStorePickupBufferStock() != null) {
            _hashCode += this.getLocationStorePickupBufferStock().hashCode();
        }
        if (this.getLocationSupplyLotSizingMethod() != null) {
            _hashCode += this.getLocationSupplyLotSizingMethod().hashCode();
        }
        if (this.getLocationSupplyTimeFence() != null) {
            _hashCode += this.getLocationSupplyTimeFence().hashCode();
        }
        if (this.getLocationSupplyType() != null) {
            _hashCode += this.getLocationSupplyType().hashCode();
        }
        if (this.getLocationTotalValue() != null) {
            _hashCode += this.getLocationTotalValue().hashCode();
        }
        if (this.getLocBackwardConsumptionDays() != null) {
            _hashCode += this.getLocBackwardConsumptionDays().hashCode();
        }
        if (this.getLocForwardConsumptionDays() != null) {
            _hashCode += this.getLocForwardConsumptionDays().hashCode();
        }
        if (this.getLowerWarningLimit() != null) {
            _hashCode += this.getLowerWarningLimit().hashCode();
        }
        if (this.getManufacturer() != null) {
            _hashCode += this.getManufacturer().hashCode();
        }
        if (this.getManufactureraddr1() != null) {
            _hashCode += this.getManufactureraddr1().hashCode();
        }
        if (this.getManufacturerCity() != null) {
            _hashCode += this.getManufacturerCity().hashCode();
        }
        if (this.getManufacturerState() != null) {
            _hashCode += this.getManufacturerState().hashCode();
        }
        if (this.getManufacturerTariff() != null) {
            _hashCode += this.getManufacturerTariff().hashCode();
        }
        if (this.getManufacturerTaxId() != null) {
            _hashCode += this.getManufacturerTaxId().hashCode();
        }
        if (this.getManufacturerZip() != null) {
            _hashCode += this.getManufacturerZip().hashCode();
        }
        if (this.getManufacturingChargeItem() != null) {
            _hashCode += this.getManufacturingChargeItem().hashCode();
        }
        if (this.getMatchBillToReceipt() != null) {
            _hashCode += this.getMatchBillToReceipt().hashCode();
        }
        if (this.getMatrix() != null) {
            _hashCode += this.getMatrix().hashCode();
        }
        if (this.getMatrixChild() != null) {
            _hashCode += this.getMatrixChild().hashCode();
        }
        if (this.getMaximumQuantity() != null) {
            _hashCode += this.getMaximumQuantity().hashCode();
        }
        if (this.getMetaTagHtml() != null) {
            _hashCode += this.getMetaTagHtml().hashCode();
        }
        if (this.getMinimumQuantity() != null) {
            _hashCode += this.getMinimumQuantity().hashCode();
        }
        if (this.getMossApplies() != null) {
            _hashCode += this.getMossApplies().hashCode();
        }
        if (this.getMpn() != null) {
            _hashCode += this.getMpn().hashCode();
        }
        if (this.getMultManufactureAddr() != null) {
            _hashCode += this.getMultManufactureAddr().hashCode();
        }
        if (this.getNexTagCategory() != null) {
            _hashCode += this.getNexTagCategory().hashCode();
        }
        if (this.getNexTagProductFeed() != null) {
            _hashCode += this.getNexTagProductFeed().hashCode();
        }
        if (this.getNextInvtCountDate() != null) {
            _hashCode += this.getNextInvtCountDate().hashCode();
        }
        if (this.getNumActiveListings() != null) {
            _hashCode += this.getNumActiveListings().hashCode();
        }
        if (this.getNumberAllowedDownloads() != null) {
            _hashCode += this.getNumberAllowedDownloads().hashCode();
        }
        if (this.getNumCurrentlyListed() != null) {
            _hashCode += this.getNumCurrentlyListed().hashCode();
        }
        if (this.getObsoleteDate() != null) {
            _hashCode += this.getObsoleteDate().hashCode();
        }
        if (this.getObsoleteRevision() != null) {
            _hashCode += this.getObsoleteRevision().hashCode();
        }
        if (this.getOfferSupport() != null) {
            _hashCode += this.getOfferSupport().hashCode();
        }
        if (this.getOnlineCustomerPrice() != null) {
            _hashCode += this.getOnlineCustomerPrice().hashCode();
        }
        if (this.getOnSpecial() != null) {
            _hashCode += this.getOnSpecial().hashCode();
        }
        if (this.getOtherVendor() != null) {
            _hashCode += this.getOtherVendor().hashCode();
        }
        if (this.getOutOfStockBehavior() != null) {
            _hashCode += this.getOutOfStockBehavior().hashCode();
        }
        if (this.getOverallQuantityPricingType() != null) {
            _hashCode += this.getOverallQuantityPricingType().hashCode();
        }
        if (this.getOverheadType() != null) {
            _hashCode += this.getOverheadType().hashCode();
        }
        if (this.getPageTitle() != null) {
            _hashCode += this.getPageTitle().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPeriodicLotSizeDays() != null) {
            _hashCode += this.getPeriodicLotSizeDays().hashCode();
        }
        if (this.getPeriodicLotSizeType() != null) {
            _hashCode += this.getPeriodicLotSizeType().hashCode();
        }
        if (this.getPlanningItemCategory() != null) {
            _hashCode += this.getPlanningItemCategory().hashCode();
        }
        if (this.getPreferenceCriterion() != null) {
            _hashCode += this.getPreferenceCriterion().hashCode();
        }
        if (this.getPreferredBin() != null) {
            _hashCode += this.getPreferredBin().hashCode();
        }
        if (this.getPreferredLocation() != null) {
            _hashCode += this.getPreferredLocation().hashCode();
        }
        if (this.getPreferredStockLevel() != null) {
            _hashCode += this.getPreferredStockLevel().hashCode();
        }
        if (this.getPreferredStockLevelDays() != null) {
            _hashCode += this.getPreferredStockLevelDays().hashCode();
        }
        if (this.getPrice() != null) {
            _hashCode += this.getPrice().hashCode();
        }
        if (this.getPricesIncludeTax() != null) {
            _hashCode += this.getPricesIncludeTax().hashCode();
        }
        if (this.getPricingGroup() != null) {
            _hashCode += this.getPricingGroup().hashCode();
        }
        if (this.getPrimaryCategory() != null) {
            _hashCode += this.getPrimaryCategory().hashCode();
        }
        if (this.getPurchaseOrderAmount() != null) {
            _hashCode += this.getPurchaseOrderAmount().hashCode();
        }
        if (this.getPurchaseOrderQuantity() != null) {
            _hashCode += this.getPurchaseOrderQuantity().hashCode();
        }
        if (this.getPurchaseOrderQuantityDiff() != null) {
            _hashCode += this.getPurchaseOrderQuantityDiff().hashCode();
        }
        if (this.getPurchaseUnit() != null) {
            _hashCode += this.getPurchaseUnit().hashCode();
        }
        if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
        }
        if (this.getQuantityBackOrdered() != null) {
            _hashCode += this.getQuantityBackOrdered().hashCode();
        }
        if (this.getQuantityCommitted() != null) {
            _hashCode += this.getQuantityCommitted().hashCode();
        }
        if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
        }
        if (this.getQuantityOnOrder() != null) {
            _hashCode += this.getQuantityOnOrder().hashCode();
        }
        if (this.getQuantityPricingSchedule() != null) {
            _hashCode += this.getQuantityPricingSchedule().hashCode();
        }
        if (this.getReceiptAmount() != null) {
            _hashCode += this.getReceiptAmount().hashCode();
        }
        if (this.getReceiptQuantity() != null) {
            _hashCode += this.getReceiptQuantity().hashCode();
        }
        if (this.getReceiptQuantityDiff() != null) {
            _hashCode += this.getReceiptQuantityDiff().hashCode();
        }
        if (this.getReorderMultiple() != null) {
            _hashCode += this.getReorderMultiple().hashCode();
        }
        if (this.getReorderPoint() != null) {
            _hashCode += this.getReorderPoint().hashCode();
        }
        if (this.getRescheduleInDays() != null) {
            _hashCode += this.getRescheduleInDays().hashCode();
        }
        if (this.getRescheduleOutDays() != null) {
            _hashCode += this.getRescheduleOutDays().hashCode();
        }
        if (this.getReservePrice() != null) {
            _hashCode += this.getReservePrice().hashCode();
        }
        if (this.getRevenueAllocationGroup() != null) {
            _hashCode += this.getRevenueAllocationGroup().hashCode();
        }
        if (this.getRevenueRecognitionRule() != null) {
            _hashCode += this.getRevenueRecognitionRule().hashCode();
        }
        if (this.getRevRecForecastRule() != null) {
            _hashCode += this.getRevRecForecastRule().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getRoundUpAsComponent() != null) {
            _hashCode += this.getRoundUpAsComponent().hashCode();
        }
        if (this.getSafetyStockLevel() != null) {
            _hashCode += this.getSafetyStockLevel().hashCode();
        }
        if (this.getSafetyStockLevelDays() != null) {
            _hashCode += this.getSafetyStockLevelDays().hashCode();
        }
        if (this.getSalesDescription() != null) {
            _hashCode += this.getSalesDescription().hashCode();
        }
        if (this.getSaleUnit() != null) {
            _hashCode += this.getSaleUnit().hashCode();
        }
        if (this.getSameAsPrimaryBookAmortization() != null) {
            _hashCode += this.getSameAsPrimaryBookAmortization().hashCode();
        }
        if (this.getSameAsPrimaryBookRevRec() != null) {
            _hashCode += this.getSameAsPrimaryBookRevRec().hashCode();
        }
        if (this.getScheduleBCode() != null) {
            _hashCode += this.getScheduleBCode().hashCode();
        }
        if (this.getScheduleBNumber() != null) {
            _hashCode += this.getScheduleBNumber().hashCode();
        }
        if (this.getScheduleBQuantity() != null) {
            _hashCode += this.getScheduleBQuantity().hashCode();
        }
        if (this.getSearchKeywords() != null) {
            _hashCode += this.getSearchKeywords().hashCode();
        }
        if (this.getSeasonalDemand() != null) {
            _hashCode += this.getSeasonalDemand().hashCode();
        }
        if (this.getSecondaryConsumptionUnit() != null) {
            _hashCode += this.getSecondaryConsumptionUnit().hashCode();
        }
        if (this.getSecondaryPurchaseUnit() != null) {
            _hashCode += this.getSecondaryPurchaseUnit().hashCode();
        }
        if (this.getSecondarySaleUnit() != null) {
            _hashCode += this.getSecondarySaleUnit().hashCode();
        }
        if (this.getSecondaryStockUnit() != null) {
            _hashCode += this.getSecondaryStockUnit().hashCode();
        }
        if (this.getSecondaryUnitsType() != null) {
            _hashCode += this.getSecondaryUnitsType().hashCode();
        }
        if (this.getSellOnEBay() != null) {
            _hashCode += this.getSellOnEBay().hashCode();
        }
        if (this.getSerialNumber() != null) {
            _hashCode += this.getSerialNumber().hashCode();
        }
        if (this.getSerialNumberLocation() != null) {
            _hashCode += this.getSerialNumberLocation().hashCode();
        }
        if (this.getShipIndividually() != null) {
            _hashCode += this.getShipIndividually().hashCode();
        }
        if (this.getShipPackage() != null) {
            _hashCode += this.getShipPackage().hashCode();
        }
        if (this.getShippingCarrier() != null) {
            _hashCode += this.getShippingCarrier().hashCode();
        }
        if (this.getShippingRate() != null) {
            _hashCode += this.getShippingRate().hashCode();
        }
        if (this.getShoppingDotComCategory() != null) {
            _hashCode += this.getShoppingDotComCategory().hashCode();
        }
        if (this.getShoppingProductFeed() != null) {
            _hashCode += this.getShoppingProductFeed().hashCode();
        }
        if (this.getShopzillaCategoryId() != null) {
            _hashCode += this.getShopzillaCategoryId().hashCode();
        }
        if (this.getShopzillaProductFeed() != null) {
            _hashCode += this.getShopzillaProductFeed().hashCode();
        }
        if (this.getSitemapPriority() != null) {
            _hashCode += this.getSitemapPriority().hashCode();
        }
        if (this.getSoftDescriptor() != null) {
            _hashCode += this.getSoftDescriptor().hashCode();
        }
        if (this.getStartingPrice() != null) {
            _hashCode += this.getStartingPrice().hashCode();
        }
        if (this.getStockDescription() != null) {
            _hashCode += this.getStockDescription().hashCode();
        }
        if (this.getStockUnit() != null) {
            _hashCode += this.getStockUnit().hashCode();
        }
        if (this.getStoreDescription() != null) {
            _hashCode += this.getStoreDescription().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getSubType() != null) {
            _hashCode += this.getSubType().hashCode();
        }
        if (this.getSupplyLotSizingMethod() != null) {
            _hashCode += this.getSupplyLotSizingMethod().hashCode();
        }
        if (this.getSupplyReplenishmentMethod() != null) {
            _hashCode += this.getSupplyReplenishmentMethod().hashCode();
        }
        if (this.getSupplyTimeFence() != null) {
            _hashCode += this.getSupplyTimeFence().hashCode();
        }
        if (this.getSupplyType() != null) {
            _hashCode += this.getSupplyType().hashCode();
        }
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getTaxSchedule() != null) {
            _hashCode += this.getTaxSchedule().hashCode();
        }
        if (this.getThumbnailUrl() != null) {
            _hashCode += this.getThumbnailUrl().hashCode();
        }
        if (this.getTotalValue() != null) {
            _hashCode += this.getTotalValue().hashCode();
        }
        if (this.getTrackLandedCost() != null) {
            _hashCode += this.getTrackLandedCost().hashCode();
        }
        if (this.getTransferPrice() != null) {
            _hashCode += this.getTransferPrice().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getUnitsType() != null) {
            _hashCode += this.getUnitsType().hashCode();
        }
        if (this.getUpcCode() != null) {
            _hashCode += this.getUpcCode().hashCode();
        }
        if (this.getUpperWarningLimit() != null) {
            _hashCode += this.getUpperWarningLimit().hashCode();
        }
        if (this.getUrlComponent() != null) {
            _hashCode += this.getUrlComponent().hashCode();
        }
        if (this.getUseBins() != null) {
            _hashCode += this.getUseBins().hashCode();
        }
        if (this.getUseComponentYield() != null) {
            _hashCode += this.getUseComponentYield().hashCode();
        }
        if (this.getUseMarginalRates() != null) {
            _hashCode += this.getUseMarginalRates().hashCode();
        }
        if (this.getVendor() != null) {
            _hashCode += this.getVendor().hashCode();
        }
        if (this.getVendorCode() != null) {
            _hashCode += this.getVendorCode().hashCode();
        }
        if (this.getVendorCost() != null) {
            _hashCode += this.getVendorCost().hashCode();
        }
        if (this.getVendorCostEntered() != null) {
            _hashCode += this.getVendorCostEntered().hashCode();
        }
        if (this.getVendorName() != null) {
            _hashCode += this.getVendorName().hashCode();
        }
        if (this.getVendorPriceCurrency() != null) {
            _hashCode += this.getVendorPriceCurrency().hashCode();
        }
        if (this.getVsoeDeferral() != null) {
            _hashCode += this.getVsoeDeferral().hashCode();
        }
        if (this.getVsoeDelivered() != null) {
            _hashCode += this.getVsoeDelivered().hashCode();
        }
        if (this.getVsoePermitDiscount() != null) {
            _hashCode += this.getVsoePermitDiscount().hashCode();
        }
        if (this.getVsoePrice() != null) {
            _hashCode += this.getVsoePrice().hashCode();
        }
        if (this.getVsoeSopGroup() != null) {
            _hashCode += this.getVsoeSopGroup().hashCode();
        }
        if (this.getWebSite() != null) {
            _hashCode += this.getWebSite().hashCode();
        }
        if (this.getWeight() != null) {
            _hashCode += this.getWeight().hashCode();
        }
        if (this.getYahooProductFeed() != null) {
            _hashCode += this.getYahooProductFeed().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accBookRevRecForecastRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accBookRevRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookAmortization");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookAmortization"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookCreatePlansOn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookCreatePlansOn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookRevRecRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookRevRecRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookRevRecSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookRevRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowedShippingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowedShippingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("alternateDemandSourceItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "alternateDemandSourceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("atpLeadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "atpLeadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("atpMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "atpMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoLeadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoLeadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoPreferredStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoPreferredStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoReorderPoint");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoReorderPoint"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("backwardConsumptionDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "backwardConsumptionDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binOnHandAvail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binOnHandAvail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binOnHandCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binOnHandCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTimeLotSize");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildTimeLotSize"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyItNowPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyItNowPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caption"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "component"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentOf");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "componentOf"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consumptionUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consumptionUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contingentRevenueHandling");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contingentRevenueHandling"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemCorrelation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItemCorrelation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItemCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemLift");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItemLift"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemPurchaseRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItemPurchaseRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costAccountingStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costAccountingStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createJob");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createJob"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createRevenuePlansOn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createRevenuePlansOn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysBeforeExpiration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysBeforeExpiration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultShippingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultShippingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandModifier");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "demandModifier"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "demandSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandTimeFence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "demandTimeFence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("directRevenuePosting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "directRevenuePosting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayIneBayStore");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "displayIneBayStore"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("distributionCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "distributionCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("distributionNetwork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "distributionNetwork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("EBayItemDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eBayItemDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("EBayItemSubtitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eBayItemSubtitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("EBayItemTitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eBayItemTitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ebayRelistingOption");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ebayRelistingOption"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveBomControl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveBomControl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveRevision");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("enableCatchWeight");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "enableCatchWeight"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endAuctionsWhenOutOfStock");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endAuctionsWhenOutOfStock"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("feedDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "feedDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("feedName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "feedName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedBuildTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fixedBuildTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedLotSize");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fixedLotSize"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("forwardConsumptionDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "forwardConsumptionDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fraudRisk");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fraudRisk"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("froogleProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "froogleProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("futureHorizon");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "futureHorizon"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("generateAccruals");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "generateAccruals"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertAuthCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertAuthCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertMsg");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertMsg"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertOrigAmt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertOrigAmt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertRecipient");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertRecipient"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyNode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hierarchyNode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyVersion");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hierarchyVersion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "imageUrl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invtClassification");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "invtClassification"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invtCountInterval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "invtCountInterval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isLotItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isLotItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPreferredVendor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPreferredVendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSerialItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSerialItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSpecialWorkOrderItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSpecialWorkOrderItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isStorePickupAllowed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isStorePickupAllowed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isVsoeBundle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isVsoeBundle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemUrl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemUrl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastInvtCountDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastInvtCountDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastQuantityAvailableChange");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastQuantityAvailableChange"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("listingDuration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "listingDuration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationAllowStorePickup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationAllowStorePickup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationAtpLeadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationAtpLeadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationAverageCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationAverageCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationBuildTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationBuildTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationCostAccountingStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationCostAccountingStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationDefaultReturnCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationDefaultReturnCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationDemandSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationDemandSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationDemandTimeFence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationDemandTimeFence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationFixedLotSize");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationFixedLotSize"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationInventoryCostTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationInventoryCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationInvtClassification");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationInvtClassification"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationInvtCountInterval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationInvtCountInterval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationLastInvtCountDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationLastInvtCountDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationLeadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationLeadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationNextInvtCountDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationNextInvtCountDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationPeriodicLotSizeDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationPeriodicLotSizeDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationPeriodicLotSizeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationPeriodicLotSizeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationPreferredStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationPreferredStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQtyAvailForStorePickup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQtyAvailForStorePickup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityBackOrdered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityBackOrdered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityInTransit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityInTransit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityOnHand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityOnHand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityOnOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityOnOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationReorderPoint");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationReorderPoint"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationRescheduleInDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationRescheduleInDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationRescheduleOutDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationRescheduleOutDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationSafetyStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationSafetyStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationStorePickupBufferStock");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationStorePickupBufferStock"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationSupplyLotSizingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationSupplyLotSizingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationSupplyTimeFence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationSupplyTimeFence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationSupplyType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationSupplyType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationTotalValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationTotalValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locBackwardConsumptionDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locBackwardConsumptionDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locForwardConsumptionDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locForwardConsumptionDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowerWarningLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lowerWarningLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufactureraddr1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufactureraddr1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingChargeItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingChargeItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matrix");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "matrix"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matrixChild");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "matrixChild"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mossApplies");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mossApplies"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexTagCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexTagCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexTagProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexTagProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextInvtCountDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextInvtCountDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numActiveListings");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "numActiveListings"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberAllowedDownloads");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "numberAllowedDownloads"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numCurrentlyListed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "numCurrentlyListed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("obsoleteDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "obsoleteDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("obsoleteRevision");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "obsoleteRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onlineCustomerPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "onlineCustomerPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherVendor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "otherVendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overheadType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overheadType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodicLotSizeDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodicLotSizeDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodicLotSizeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodicLotSizeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("planningItemCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "planningItemCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferredLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredStockLevelDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferredStockLevelDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricesIncludeTax");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pricesIncludeTax"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reorderMultiple");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reorderMultiple"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reorderPoint");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reorderPoint"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rescheduleInDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rescheduleInDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rescheduleOutDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rescheduleOutDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reservePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reservePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueAllocationGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenueAllocationGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roundUpAsComponent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "roundUpAsComponent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("safetyStockLevelDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "safetyStockLevelDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameAsPrimaryBookAmortization");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sameAsPrimaryBookAmortization"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameAsPrimaryBookRevRec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sameAsPrimaryBookRevRec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("seasonalDemand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "seasonalDemand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryConsumptionUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondaryConsumptionUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryPurchaseUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondaryPurchaseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondarySaleUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondarySaleUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryStockUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondaryStockUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryUnitsType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondaryUnitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sellOnEBay");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sellOnEBay"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumberLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumberLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingCarrier");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shippingCarrier"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shoppingProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shoppingProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shopzillaProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shopzillaProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startingPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startingPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stockUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stockUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyLotSizingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supplyLotSizingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyReplenishmentMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supplyReplenishmentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyTimeFence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supplyTimeFence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supplyType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thumbnailUrl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "thumbnailUrl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "totalValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("trackLandedCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "trackLandedCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upperWarningLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "upperWarningLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCostEntered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorCostEntered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorPriceCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorPriceCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yahooProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "yahooProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

