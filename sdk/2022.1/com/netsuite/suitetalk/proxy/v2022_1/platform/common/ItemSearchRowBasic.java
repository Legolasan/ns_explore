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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowBasic;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] accBookRevRecForecastRule;
    private SearchColumnSelectField[] accountingBook;
    private SearchColumnSelectField[] accountingBookAmortization;
    private SearchColumnSelectField[] accountingBookCreatePlansOn;
    private SearchColumnSelectField[] accountingBookRevRecRule;
    private SearchColumnSelectField[] accountingBookRevRecSchedule;
    private SearchColumnSelectField[] allowedShippingMethod;
    private SearchColumnStringField[] alternateDemandSourceItem;
    private SearchColumnSelectField[] assetAccount;
    private SearchColumnDoubleField[] atpLeadTime;
    private SearchColumnEnumSelectField[] atpMethod;
    private SearchColumnBooleanField[] autoLeadTime;
    private SearchColumnBooleanField[] autoPreferredStockLevel;
    private SearchColumnBooleanField[] autoReorderPoint;
    private SearchColumnBooleanField[] availableToPartners;
    private SearchColumnDoubleField[] averageCost;
    private SearchColumnLongField[] backwardConsumptionDays;
    private SearchColumnDoubleField[] basePrice;
    private SearchColumnSelectField[] billExchRateVarianceAcct;
    private SearchColumnSelectField[] billPriceVarianceAcct;
    private SearchColumnSelectField[] billQtyVarianceAcct;
    private SearchColumnStringField[] binNumber;
    private SearchColumnDoubleField[] binOnHandAvail;
    private SearchColumnDoubleField[] binOnHandCount;
    private SearchColumnDoubleField[] bomQuantity;
    private SearchColumnBooleanField[] buildEntireAssembly;
    private SearchColumnDoubleField[] buildTime;
    private SearchColumnDoubleField[] buildTimeLotSize;
    private SearchColumnDoubleField[] buyItNowPrice;
    private SearchColumnStringField[] category;
    private SearchColumnStringField[] categoryPreferred;
    private SearchColumnSelectField[] _class;
    private SearchColumnDoubleField[] componentYield;
    private SearchColumnSelectField[] consumptionUnit;
    private SearchColumnBooleanField[] contingentRevenueHandling;
    private SearchColumnDoubleField[] conversionRate;
    private SearchColumnBooleanField[] copyDescription;
    private SearchColumnSelectField[] correlatedItem;
    private SearchColumnDoubleField[] correlatedItemCorrelation;
    private SearchColumnLongField[] correlatedItemCount;
    private SearchColumnDoubleField[] correlatedItemLift;
    private SearchColumnDoubleField[] correlatedItemPurchaseRate;
    private SearchColumnDoubleField[] cost;
    private SearchColumnEnumSelectField[] costAccountingStatus;
    private SearchColumnStringField[] costCategory;
    private SearchColumnDoubleField[] costEstimate;
    private SearchColumnEnumSelectField[] costEstimateType;
    private SearchColumnEnumSelectField[] costingMethod;
    private SearchColumnEnumSelectField[] countryOfManufacture;
    private SearchColumnDateField[] created;
    private SearchColumnBooleanField[] createJob;
    private SearchColumnSelectField[] createRevenuePlansOn;
    private SearchColumnSelectField[] custReturnVarianceAccount;
    private SearchColumnDateField[] dateViewed;
    private SearchColumnStringField[] daysBeforeExpiration;
    private SearchColumnDoubleField[] defaultReturnCost;
    private SearchColumnStringField[] defaultShippingMethod;
    private SearchColumnSelectField[] deferredExpenseAccount;
    private SearchColumnSelectField[] deferredRevenueAccount;
    private SearchColumnBooleanField[] deferRevRec;
    private SearchColumnDoubleField[] demandModifier;
    private SearchColumnEnumSelectField[] demandSource;
    private SearchColumnLongField[] demandTimeFence;
    private SearchColumnSelectField[] department;
    private SearchColumnSelectField[] departmentnohierarchy;
    private SearchColumnBooleanField[] directRevenuePosting;
    private SearchColumnBooleanField[] displayIneBayStore;
    private SearchColumnStringField[] displayName;
    private SearchColumnSelectField[] distributionCategory;
    private SearchColumnSelectField[] distributionNetwork;
    private SearchColumnBooleanField[] dontShowPrice;
    private SearchColumnStringField[] eBayItemDescription;
    private SearchColumnStringField[] eBayItemSubtitle;
    private SearchColumnStringField[] eBayItemTitle;
    private SearchColumnEnumSelectField[] ebayRelistingOption;
    private SearchColumnEnumSelectField[] effectiveBomControl;
    private SearchColumnDateField[] effectiveDate;
    private SearchColumnSelectField[] effectiveRevision;
    private SearchColumnBooleanField[] enableCatchWeight;
    private SearchColumnBooleanField[] endAuctionsWhenOutOfStock;
    private SearchColumnBooleanField[] excludeFromSitemap;
    private SearchColumnSelectField[] expenseAccount;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] featuredDescription;
    private SearchColumnStringField[] feedDescription;
    private SearchColumnStringField[] feedName;
    private SearchColumnDoubleField[] fixedBuildTime;
    private SearchColumnDoubleField[] fixedLotSize;
    private SearchColumnLongField[] forwardConsumptionDays;
    private SearchColumnEnumSelectField[] fraudRisk;
    private SearchColumnBooleanField[] froogleProductFeed;
    private SearchColumnLongField[] futureHorizon;
    private SearchColumnDoubleField[] fxCost;
    private SearchColumnSelectField[] gainLossAccount;
    private SearchColumnBooleanField[] generateAccruals;
    private SearchColumnStringField[] giftCertAuthCode;
    private SearchColumnStringField[] giftCertEmail;
    private SearchColumnStringField[] giftCertExpirationDate;
    private SearchColumnStringField[] giftCertFrom;
    private SearchColumnStringField[] giftCertMessage;
    private SearchColumnStringField[] giftCertOriginalAmount;
    private SearchColumnStringField[] giftCertRecipient;
    private SearchColumnStringField[] hierarchyNode;
    private SearchColumnStringField[] hierarchyVersion;
    private SearchColumnLongField[] hits;
    private SearchColumnStringField[] imageUrl;
    private SearchColumnBooleanField[] includeChildren;
    private SearchColumnSelectField[] incomeAccount;
    private SearchColumnSelectField[] intercoDefRevAccount;
    private SearchColumnSelectField[] intercoExpenseAccount;
    private SearchColumnSelectField[] intercoIncomeAccount;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] inventoryLocation;
    private SearchColumnEnumSelectField[] invtClassification;
    private SearchColumnLongField[] invtCountInterval;
    private SearchColumnBooleanField[] isAvailable;
    private SearchColumnBooleanField[] isDropShipItem;
    private SearchColumnBooleanField[] isFulfillable;
    private SearchColumnBooleanField[] isGcoCompliant;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isLotItem;
    private SearchColumnBooleanField[] isOnline;
    private SearchColumnBooleanField[] isSerialItem;
    private SearchColumnBooleanField[] isSpecialOrderItem;
    private SearchColumnBooleanField[] isSpecialWorkOrderItem;
    private SearchColumnBooleanField[] isStorePickupAllowed;
    private SearchColumnSelectField[] issueProduct;
    private SearchColumnBooleanField[] isTaxable;
    private SearchColumnBooleanField[] isVsoeBundle;
    private SearchColumnBooleanField[] isWip;
    private SearchColumnStringField[] itemId;
    private SearchColumnSelectField[] itemRevenueCategory;
    private SearchColumnStringField[] itemUrl;
    private SearchColumnDateField[] lastInvtCountDate;
    private SearchColumnDoubleField[] lastPurchasePrice;
    private SearchColumnDateField[] lastQuantityAvailableChange;
    private SearchColumnLongField[] leadTime;
    private SearchColumnSelectField[] liabilityAccount;
    private SearchColumnEnumSelectField[] listingDuration;
    private SearchColumnSelectField[] location;
    private SearchColumnBooleanField[] locationAllowStorePickup;
    private SearchColumnDoubleField[] locationAtpLeadTime;
    private SearchColumnDoubleField[] locationAverageCost;
    private SearchColumnStringField[] locationBinQuantityAvailable;
    private SearchColumnDoubleField[] locationBuildTime;
    private SearchColumnDoubleField[] locationCost;
    private SearchColumnEnumSelectField[] locationCostAccountingStatus;
    private SearchColumnDoubleField[] locationDefaultReturnCost;
    private SearchColumnEnumSelectField[] locationDemandSource;
    private SearchColumnLongField[] locationDemandTimeFence;
    private SearchColumnDoubleField[] locationFixedLotSize;
    private SearchColumnStringField[] locationInventoryCostTemplate;
    private SearchColumnEnumSelectField[] locationInvtClassification;
    private SearchColumnLongField[] locationInvtCountInterval;
    private SearchColumnDateField[] locationLastInvtCountDate;
    private SearchColumnLongField[] locationLeadTime;
    private SearchColumnDateField[] locationNextInvtCountDate;
    private SearchColumnLongField[] locationPeriodicLotSizeDays;
    private SearchColumnEnumSelectField[] locationPeriodicLotSizeType;
    private SearchColumnDoubleField[] locationPreferredStockLevel;
    private SearchColumnDoubleField[] locationQtyAvailForStorePickup;
    private SearchColumnDoubleField[] locationQuantityAvailable;
    private SearchColumnDoubleField[] locationQuantityBackOrdered;
    private SearchColumnDoubleField[] locationQuantityCommitted;
    private SearchColumnDoubleField[] locationQuantityInTransit;
    private SearchColumnDoubleField[] locationQuantityOnHand;
    private SearchColumnDoubleField[] locationQuantityOnOrder;
    private SearchColumnDoubleField[] locationReOrderPoint;
    private SearchColumnLongField[] locationRescheduleInDays;
    private SearchColumnLongField[] locationRescheduleOutDays;
    private SearchColumnDoubleField[] locationSafetyStockLevel;
    private SearchColumnDoubleField[] locationStorePickupBufferStock;
    private SearchColumnEnumSelectField[] locationSupplyLotSizingMethod;
    private SearchColumnLongField[] locationSupplyTimeFence;
    private SearchColumnEnumSelectField[] locationSupplyType;
    private SearchColumnDoubleField[] locationTotalValue;
    private SearchColumnLongField[] locBackwardConsumptionDays;
    private SearchColumnLongField[] locForwardConsumptionDays;
    private SearchColumnDoubleField[] lowerWarningLimit;
    private SearchColumnStringField[] manufacturer;
    private SearchColumnStringField[] manufacturerAddr1;
    private SearchColumnStringField[] manufacturerCity;
    private SearchColumnStringField[] manufacturerState;
    private SearchColumnStringField[] manufacturerTariff;
    private SearchColumnStringField[] manufacturerTaxId;
    private SearchColumnStringField[] manufacturerZip;
    private SearchColumnBooleanField[] manufacturingChargeItem;
    private SearchColumnBooleanField[] matchBillToReceipt;
    private SearchColumnStringField[] maximumQuantity;
    private SearchColumnSelectField[] memberItem;
    private SearchColumnDoubleField[] memberQuantity;
    private SearchColumnStringField[] metaTagHtml;
    private SearchColumnStringField[] minimumQuantity;
    private SearchColumnDateField[] modified;
    private SearchColumnBooleanField[] mossApplies;
    private SearchColumnStringField[] mpn;
    private SearchColumnBooleanField[] multManufactureAddr;
    private SearchColumnStringField[] nextagCategory;
    private SearchColumnBooleanField[] nextagProductFeed;
    private SearchColumnDateField[] nextInvtCountDate;
    private SearchColumnStringField[] noPriceMessage;
    private SearchColumnLongField[] numActiveListings;
    private SearchColumnStringField[] numberAllowedDownloads;
    private SearchColumnLongField[] numCurrentlyListed;
    private SearchColumnDateField[] obsoleteDate;
    private SearchColumnSelectField[] obsoleteRevision;
    private SearchColumnBooleanField[] offerSupport;
    private SearchColumnDoubleField[] onlineCustomerPrice;
    private SearchColumnDoubleField[] onlinePrice;
    private SearchColumnBooleanField[] onSpecial;
    private SearchColumnDoubleField[] otherPrices;
    private SearchColumnSelectField[] otherVendor;
    private SearchColumnStringField[] outOfStockBehavior;
    private SearchColumnStringField[] outOfStockMessage;
    private SearchColumnEnumSelectField[] overallQuantityPricingType;
    private SearchColumnEnumSelectField[] overheadType;
    private SearchColumnStringField[] pageTitle;
    private SearchColumnSelectField[] parent;
    private SearchColumnLongField[] periodicLotSizeDays;
    private SearchColumnEnumSelectField[] periodicLotSizeType;
    private SearchColumnSelectField[] planningItemCategory;
    private SearchColumnStringField[] preferenceCriterion;
    private SearchColumnBooleanField[] preferredBin;
    private SearchColumnSelectField[] preferredLocation;
    private SearchColumnDoubleField[] preferredStockLevel;
    private SearchColumnLongField[] preferredStockLevelDays;
    private SearchColumnBooleanField[] pricesIncludeTax;
    private SearchColumnSelectField[] pricingGroup;
    private SearchColumnStringField[] primaryCategory;
    private SearchColumnSelectField[] prodPriceVarianceAcct;
    private SearchColumnSelectField[] prodQtyVarianceAcct;
    private SearchColumnStringField[] purchaseDescription;
    private SearchColumnDoubleField[] purchaseOrderAmount;
    private SearchColumnDoubleField[] purchaseOrderQuantity;
    private SearchColumnDoubleField[] purchaseOrderQuantityDiff;
    private SearchColumnSelectField[] purchasePriceVarianceAcct;
    private SearchColumnSelectField[] purchaseUnit;
    private SearchColumnDoubleField[] quantityAvailable;
    private SearchColumnDoubleField[] quantityBackOrdered;
    private SearchColumnDoubleField[] quantityCommitted;
    private SearchColumnDoubleField[] quantityOnHand;
    private SearchColumnDoubleField[] quantityOnOrder;
    private SearchColumnSelectField[] quantityPricingSchedule;
    private SearchColumnDoubleField[] receiptAmount;
    private SearchColumnDoubleField[] receiptQuantity;
    private SearchColumnDoubleField[] receiptQuantityDiff;
    private SearchColumnLongField[] reorderMultiple;
    private SearchColumnDoubleField[] reOrderPoint;
    private SearchColumnLongField[] rescheduleInDays;
    private SearchColumnLongField[] rescheduleOutDays;
    private SearchColumnDoubleField[] reservePrice;
    private SearchColumnSelectField[] revenueAllocationGroup;
    private SearchColumnSelectField[] revenueRecognitionRule;
    private SearchColumnSelectField[] revRecForecastRule;
    private SearchColumnSelectField[] revReclassFXAccount;
    private SearchColumnSelectField[] revRecSchedule;
    private SearchColumnBooleanField[] roundUpAsComponent;
    private SearchColumnDoubleField[] safetyStockLevel;
    private SearchColumnLongField[] safetyStockLevelDays;
    private SearchColumnStringField[] salesDescription;
    private SearchColumnSelectField[] salesTaxCode;
    private SearchColumnSelectField[] saleUnit;
    private SearchColumnBooleanField[] sameAsPrimaryBookAmortization;
    private SearchColumnBooleanField[] sameAsPrimaryBookRevRec;
    private SearchColumnEnumSelectField[] scheduleBCode;
    private SearchColumnStringField[] scheduleBNumber;
    private SearchColumnStringField[] scheduleBQuantity;
    private SearchColumnSelectField[] scrapAcct;
    private SearchColumnStringField[] searchKeywords;
    private SearchColumnBooleanField[] seasonalDemand;
    private SearchColumnSelectField[] secondaryConsumptionUnit;
    private SearchColumnSelectField[] secondaryPurchaseUnit;
    private SearchColumnSelectField[] secondarySaleUnit;
    private SearchColumnSelectField[] secondaryStockUnit;
    private SearchColumnSelectField[] secondaryUnitsType;
    private SearchColumnBooleanField[] sellOnEBay;
    private SearchColumnStringField[] serialNumber;
    private SearchColumnStringField[] serialNumberLocation;
    private SearchColumnBooleanField[] shipIndividually;
    private SearchColumnSelectField[] shipPackage;
    private SearchColumnEnumSelectField[] shippingCarrier;
    private SearchColumnDoubleField[] shippingRate;
    private SearchColumnStringField[] shoppingDotComCategory;
    private SearchColumnBooleanField[] shoppingProductFeed;
    private SearchColumnLongField[] shopzillaCategoryId;
    private SearchColumnBooleanField[] shopzillaProductFeed;
    private SearchColumnEnumSelectField[] sitemapPriority;
    private SearchColumnSelectField[] softDescriptor;
    private SearchColumnDoubleField[] startingPrice;
    private SearchColumnStringField[] stockDescription;
    private SearchColumnSelectField[] stockUnit;
    private SearchColumnStringField[] storeDescription;
    private SearchColumnStringField[] storeDetailedDescription;
    private SearchColumnSelectField[] storeDisplayImage;
    private SearchColumnStringField[] storeDisplayName;
    private SearchColumnSelectField[] storeDisplayThumbnail;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnEnumSelectField[] subType;
    private SearchColumnEnumSelectField[] supplyLotSizingMethod;
    private SearchColumnEnumSelectField[] supplyReplenishmentMethod;
    private SearchColumnLongField[] supplyTimeFence;
    private SearchColumnEnumSelectField[] supplyType;
    private SearchColumnSelectField[] taxSchedule;
    private SearchColumnStringField[] thumbNailUrl;
    private SearchColumnDoubleField[] totalValue;
    private SearchColumnBooleanField[] trackLandedCost;
    private SearchColumnDoubleField[] transferPrice;
    private SearchColumnEnumSelectField[] type;
    private SearchColumnSelectField[] unbuildVarianceAccount;
    private SearchColumnSelectField[] unitsType;
    private SearchColumnStringField[] upcCode;
    private SearchColumnDoubleField[] upperWarningLimit;
    private SearchColumnStringField[] urlComponent;
    private SearchColumnBooleanField[] useBins;
    private SearchColumnBooleanField[] useComponentYield;
    private SearchColumnBooleanField[] useMarginalRates;
    private SearchColumnSelectField[] vendor;
    private SearchColumnStringField[] vendorCode;
    private SearchColumnDoubleField[] vendorCost;
    private SearchColumnDoubleField[] vendorCostEntered;
    private SearchColumnStringField[] vendorName;
    private SearchColumnStringField[] vendorPriceCurrency;
    private SearchColumnSelectField[] vendorSchedule;
    private SearchColumnSelectField[] vendReturnVarianceAccount;
    private SearchColumnEnumSelectField[] vsoeDeferral;
    private SearchColumnBooleanField[] vsoeDelivered;
    private SearchColumnEnumSelectField[] vsoePermitDiscount;
    private SearchColumnDoubleField[] vsoePrice;
    private SearchColumnEnumSelectField[] vsoeSopGroup;
    private SearchColumnSelectField[] webSite;
    private SearchColumnDoubleField[] weight;
    private SearchColumnEnumSelectField[] weightUnit;
    private SearchColumnSelectField[] wipAcct;
    private SearchColumnSelectField[] wipVarianceAcct;
    private SearchColumnBooleanField[] yahooProductFeed;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemSearchRowBasic.class, true);

    public SearchColumnSelectField[] getAccBookRevRecForecastRule() {
        return this.accBookRevRecForecastRule;
    }

    public void setAccBookRevRecForecastRule(SearchColumnSelectField[] accBookRevRecForecastRule) {
        this.accBookRevRecForecastRule = accBookRevRecForecastRule;
    }

    public SearchColumnSelectField getAccBookRevRecForecastRule(int i) {
        return this.accBookRevRecForecastRule[i];
    }

    public void setAccBookRevRecForecastRule(int i, SearchColumnSelectField _value) {
        this.accBookRevRecForecastRule[i] = _value;
    }

    public SearchColumnSelectField[] getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchColumnSelectField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchColumnSelectField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, SearchColumnSelectField _value) {
        this.accountingBook[i] = _value;
    }

    public SearchColumnSelectField[] getAccountingBookAmortization() {
        return this.accountingBookAmortization;
    }

    public void setAccountingBookAmortization(SearchColumnSelectField[] accountingBookAmortization) {
        this.accountingBookAmortization = accountingBookAmortization;
    }

    public SearchColumnSelectField getAccountingBookAmortization(int i) {
        return this.accountingBookAmortization[i];
    }

    public void setAccountingBookAmortization(int i, SearchColumnSelectField _value) {
        this.accountingBookAmortization[i] = _value;
    }

    public SearchColumnSelectField[] getAccountingBookCreatePlansOn() {
        return this.accountingBookCreatePlansOn;
    }

    public void setAccountingBookCreatePlansOn(SearchColumnSelectField[] accountingBookCreatePlansOn) {
        this.accountingBookCreatePlansOn = accountingBookCreatePlansOn;
    }

    public SearchColumnSelectField getAccountingBookCreatePlansOn(int i) {
        return this.accountingBookCreatePlansOn[i];
    }

    public void setAccountingBookCreatePlansOn(int i, SearchColumnSelectField _value) {
        this.accountingBookCreatePlansOn[i] = _value;
    }

    public SearchColumnSelectField[] getAccountingBookRevRecRule() {
        return this.accountingBookRevRecRule;
    }

    public void setAccountingBookRevRecRule(SearchColumnSelectField[] accountingBookRevRecRule) {
        this.accountingBookRevRecRule = accountingBookRevRecRule;
    }

    public SearchColumnSelectField getAccountingBookRevRecRule(int i) {
        return this.accountingBookRevRecRule[i];
    }

    public void setAccountingBookRevRecRule(int i, SearchColumnSelectField _value) {
        this.accountingBookRevRecRule[i] = _value;
    }

    public SearchColumnSelectField[] getAccountingBookRevRecSchedule() {
        return this.accountingBookRevRecSchedule;
    }

    public void setAccountingBookRevRecSchedule(SearchColumnSelectField[] accountingBookRevRecSchedule) {
        this.accountingBookRevRecSchedule = accountingBookRevRecSchedule;
    }

    public SearchColumnSelectField getAccountingBookRevRecSchedule(int i) {
        return this.accountingBookRevRecSchedule[i];
    }

    public void setAccountingBookRevRecSchedule(int i, SearchColumnSelectField _value) {
        this.accountingBookRevRecSchedule[i] = _value;
    }

    public SearchColumnSelectField[] getAllowedShippingMethod() {
        return this.allowedShippingMethod;
    }

    public void setAllowedShippingMethod(SearchColumnSelectField[] allowedShippingMethod) {
        this.allowedShippingMethod = allowedShippingMethod;
    }

    public SearchColumnSelectField getAllowedShippingMethod(int i) {
        return this.allowedShippingMethod[i];
    }

    public void setAllowedShippingMethod(int i, SearchColumnSelectField _value) {
        this.allowedShippingMethod[i] = _value;
    }

    public SearchColumnStringField[] getAlternateDemandSourceItem() {
        return this.alternateDemandSourceItem;
    }

    public void setAlternateDemandSourceItem(SearchColumnStringField[] alternateDemandSourceItem) {
        this.alternateDemandSourceItem = alternateDemandSourceItem;
    }

    public SearchColumnStringField getAlternateDemandSourceItem(int i) {
        return this.alternateDemandSourceItem[i];
    }

    public void setAlternateDemandSourceItem(int i, SearchColumnStringField _value) {
        this.alternateDemandSourceItem[i] = _value;
    }

    public SearchColumnSelectField[] getAssetAccount() {
        return this.assetAccount;
    }

    public void setAssetAccount(SearchColumnSelectField[] assetAccount) {
        this.assetAccount = assetAccount;
    }

    public SearchColumnSelectField getAssetAccount(int i) {
        return this.assetAccount[i];
    }

    public void setAssetAccount(int i, SearchColumnSelectField _value) {
        this.assetAccount[i] = _value;
    }

    public SearchColumnDoubleField[] getAtpLeadTime() {
        return this.atpLeadTime;
    }

    public void setAtpLeadTime(SearchColumnDoubleField[] atpLeadTime) {
        this.atpLeadTime = atpLeadTime;
    }

    public SearchColumnDoubleField getAtpLeadTime(int i) {
        return this.atpLeadTime[i];
    }

    public void setAtpLeadTime(int i, SearchColumnDoubleField _value) {
        this.atpLeadTime[i] = _value;
    }

    public SearchColumnEnumSelectField[] getAtpMethod() {
        return this.atpMethod;
    }

    public void setAtpMethod(SearchColumnEnumSelectField[] atpMethod) {
        this.atpMethod = atpMethod;
    }

    public SearchColumnEnumSelectField getAtpMethod(int i) {
        return this.atpMethod[i];
    }

    public void setAtpMethod(int i, SearchColumnEnumSelectField _value) {
        this.atpMethod[i] = _value;
    }

    public SearchColumnBooleanField[] getAutoLeadTime() {
        return this.autoLeadTime;
    }

    public void setAutoLeadTime(SearchColumnBooleanField[] autoLeadTime) {
        this.autoLeadTime = autoLeadTime;
    }

    public SearchColumnBooleanField getAutoLeadTime(int i) {
        return this.autoLeadTime[i];
    }

    public void setAutoLeadTime(int i, SearchColumnBooleanField _value) {
        this.autoLeadTime[i] = _value;
    }

    public SearchColumnBooleanField[] getAutoPreferredStockLevel() {
        return this.autoPreferredStockLevel;
    }

    public void setAutoPreferredStockLevel(SearchColumnBooleanField[] autoPreferredStockLevel) {
        this.autoPreferredStockLevel = autoPreferredStockLevel;
    }

    public SearchColumnBooleanField getAutoPreferredStockLevel(int i) {
        return this.autoPreferredStockLevel[i];
    }

    public void setAutoPreferredStockLevel(int i, SearchColumnBooleanField _value) {
        this.autoPreferredStockLevel[i] = _value;
    }

    public SearchColumnBooleanField[] getAutoReorderPoint() {
        return this.autoReorderPoint;
    }

    public void setAutoReorderPoint(SearchColumnBooleanField[] autoReorderPoint) {
        this.autoReorderPoint = autoReorderPoint;
    }

    public SearchColumnBooleanField getAutoReorderPoint(int i) {
        return this.autoReorderPoint[i];
    }

    public void setAutoReorderPoint(int i, SearchColumnBooleanField _value) {
        this.autoReorderPoint[i] = _value;
    }

    public SearchColumnBooleanField[] getAvailableToPartners() {
        return this.availableToPartners;
    }

    public void setAvailableToPartners(SearchColumnBooleanField[] availableToPartners) {
        this.availableToPartners = availableToPartners;
    }

    public SearchColumnBooleanField getAvailableToPartners(int i) {
        return this.availableToPartners[i];
    }

    public void setAvailableToPartners(int i, SearchColumnBooleanField _value) {
        this.availableToPartners[i] = _value;
    }

    public SearchColumnDoubleField[] getAverageCost() {
        return this.averageCost;
    }

    public void setAverageCost(SearchColumnDoubleField[] averageCost) {
        this.averageCost = averageCost;
    }

    public SearchColumnDoubleField getAverageCost(int i) {
        return this.averageCost[i];
    }

    public void setAverageCost(int i, SearchColumnDoubleField _value) {
        this.averageCost[i] = _value;
    }

    public SearchColumnLongField[] getBackwardConsumptionDays() {
        return this.backwardConsumptionDays;
    }

    public void setBackwardConsumptionDays(SearchColumnLongField[] backwardConsumptionDays) {
        this.backwardConsumptionDays = backwardConsumptionDays;
    }

    public SearchColumnLongField getBackwardConsumptionDays(int i) {
        return this.backwardConsumptionDays[i];
    }

    public void setBackwardConsumptionDays(int i, SearchColumnLongField _value) {
        this.backwardConsumptionDays[i] = _value;
    }

    public SearchColumnDoubleField[] getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(SearchColumnDoubleField[] basePrice) {
        this.basePrice = basePrice;
    }

    public SearchColumnDoubleField getBasePrice(int i) {
        return this.basePrice[i];
    }

    public void setBasePrice(int i, SearchColumnDoubleField _value) {
        this.basePrice[i] = _value;
    }

    public SearchColumnSelectField[] getBillExchRateVarianceAcct() {
        return this.billExchRateVarianceAcct;
    }

    public void setBillExchRateVarianceAcct(SearchColumnSelectField[] billExchRateVarianceAcct) {
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
    }

    public SearchColumnSelectField getBillExchRateVarianceAcct(int i) {
        return this.billExchRateVarianceAcct[i];
    }

    public void setBillExchRateVarianceAcct(int i, SearchColumnSelectField _value) {
        this.billExchRateVarianceAcct[i] = _value;
    }

    public SearchColumnSelectField[] getBillPriceVarianceAcct() {
        return this.billPriceVarianceAcct;
    }

    public void setBillPriceVarianceAcct(SearchColumnSelectField[] billPriceVarianceAcct) {
        this.billPriceVarianceAcct = billPriceVarianceAcct;
    }

    public SearchColumnSelectField getBillPriceVarianceAcct(int i) {
        return this.billPriceVarianceAcct[i];
    }

    public void setBillPriceVarianceAcct(int i, SearchColumnSelectField _value) {
        this.billPriceVarianceAcct[i] = _value;
    }

    public SearchColumnSelectField[] getBillQtyVarianceAcct() {
        return this.billQtyVarianceAcct;
    }

    public void setBillQtyVarianceAcct(SearchColumnSelectField[] billQtyVarianceAcct) {
        this.billQtyVarianceAcct = billQtyVarianceAcct;
    }

    public SearchColumnSelectField getBillQtyVarianceAcct(int i) {
        return this.billQtyVarianceAcct[i];
    }

    public void setBillQtyVarianceAcct(int i, SearchColumnSelectField _value) {
        this.billQtyVarianceAcct[i] = _value;
    }

    public SearchColumnStringField[] getBinNumber() {
        return this.binNumber;
    }

    public void setBinNumber(SearchColumnStringField[] binNumber) {
        this.binNumber = binNumber;
    }

    public SearchColumnStringField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, SearchColumnStringField _value) {
        this.binNumber[i] = _value;
    }

    public SearchColumnDoubleField[] getBinOnHandAvail() {
        return this.binOnHandAvail;
    }

    public void setBinOnHandAvail(SearchColumnDoubleField[] binOnHandAvail) {
        this.binOnHandAvail = binOnHandAvail;
    }

    public SearchColumnDoubleField getBinOnHandAvail(int i) {
        return this.binOnHandAvail[i];
    }

    public void setBinOnHandAvail(int i, SearchColumnDoubleField _value) {
        this.binOnHandAvail[i] = _value;
    }

    public SearchColumnDoubleField[] getBinOnHandCount() {
        return this.binOnHandCount;
    }

    public void setBinOnHandCount(SearchColumnDoubleField[] binOnHandCount) {
        this.binOnHandCount = binOnHandCount;
    }

    public SearchColumnDoubleField getBinOnHandCount(int i) {
        return this.binOnHandCount[i];
    }

    public void setBinOnHandCount(int i, SearchColumnDoubleField _value) {
        this.binOnHandCount[i] = _value;
    }

    public SearchColumnDoubleField[] getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(SearchColumnDoubleField[] bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public SearchColumnDoubleField getBomQuantity(int i) {
        return this.bomQuantity[i];
    }

    public void setBomQuantity(int i, SearchColumnDoubleField _value) {
        this.bomQuantity[i] = _value;
    }

    public SearchColumnBooleanField[] getBuildEntireAssembly() {
        return this.buildEntireAssembly;
    }

    public void setBuildEntireAssembly(SearchColumnBooleanField[] buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }

    public SearchColumnBooleanField getBuildEntireAssembly(int i) {
        return this.buildEntireAssembly[i];
    }

    public void setBuildEntireAssembly(int i, SearchColumnBooleanField _value) {
        this.buildEntireAssembly[i] = _value;
    }

    public SearchColumnDoubleField[] getBuildTime() {
        return this.buildTime;
    }

    public void setBuildTime(SearchColumnDoubleField[] buildTime) {
        this.buildTime = buildTime;
    }

    public SearchColumnDoubleField getBuildTime(int i) {
        return this.buildTime[i];
    }

    public void setBuildTime(int i, SearchColumnDoubleField _value) {
        this.buildTime[i] = _value;
    }

    public SearchColumnDoubleField[] getBuildTimeLotSize() {
        return this.buildTimeLotSize;
    }

    public void setBuildTimeLotSize(SearchColumnDoubleField[] buildTimeLotSize) {
        this.buildTimeLotSize = buildTimeLotSize;
    }

    public SearchColumnDoubleField getBuildTimeLotSize(int i) {
        return this.buildTimeLotSize[i];
    }

    public void setBuildTimeLotSize(int i, SearchColumnDoubleField _value) {
        this.buildTimeLotSize[i] = _value;
    }

    public SearchColumnDoubleField[] getBuyItNowPrice() {
        return this.buyItNowPrice;
    }

    public void setBuyItNowPrice(SearchColumnDoubleField[] buyItNowPrice) {
        this.buyItNowPrice = buyItNowPrice;
    }

    public SearchColumnDoubleField getBuyItNowPrice(int i) {
        return this.buyItNowPrice[i];
    }

    public void setBuyItNowPrice(int i, SearchColumnDoubleField _value) {
        this.buyItNowPrice[i] = _value;
    }

    public SearchColumnStringField[] getCategory() {
        return this.category;
    }

    public void setCategory(SearchColumnStringField[] category) {
        this.category = category;
    }

    public SearchColumnStringField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, SearchColumnStringField _value) {
        this.category[i] = _value;
    }

    public SearchColumnStringField[] getCategoryPreferred() {
        return this.categoryPreferred;
    }

    public void setCategoryPreferred(SearchColumnStringField[] categoryPreferred) {
        this.categoryPreferred = categoryPreferred;
    }

    public SearchColumnStringField getCategoryPreferred(int i) {
        return this.categoryPreferred[i];
    }

    public void setCategoryPreferred(int i, SearchColumnStringField _value) {
        this.categoryPreferred[i] = _value;
    }

    public SearchColumnSelectField[] get_class() {
        return this._class;
    }

    public void set_class(SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, SearchColumnSelectField _value) {
        this._class[i] = _value;
    }

    public SearchColumnDoubleField[] getComponentYield() {
        return this.componentYield;
    }

    public void setComponentYield(SearchColumnDoubleField[] componentYield) {
        this.componentYield = componentYield;
    }

    public SearchColumnDoubleField getComponentYield(int i) {
        return this.componentYield[i];
    }

    public void setComponentYield(int i, SearchColumnDoubleField _value) {
        this.componentYield[i] = _value;
    }

    public SearchColumnSelectField[] getConsumptionUnit() {
        return this.consumptionUnit;
    }

    public void setConsumptionUnit(SearchColumnSelectField[] consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }

    public SearchColumnSelectField getConsumptionUnit(int i) {
        return this.consumptionUnit[i];
    }

    public void setConsumptionUnit(int i, SearchColumnSelectField _value) {
        this.consumptionUnit[i] = _value;
    }

    public SearchColumnBooleanField[] getContingentRevenueHandling() {
        return this.contingentRevenueHandling;
    }

    public void setContingentRevenueHandling(SearchColumnBooleanField[] contingentRevenueHandling) {
        this.contingentRevenueHandling = contingentRevenueHandling;
    }

    public SearchColumnBooleanField getContingentRevenueHandling(int i) {
        return this.contingentRevenueHandling[i];
    }

    public void setContingentRevenueHandling(int i, SearchColumnBooleanField _value) {
        this.contingentRevenueHandling[i] = _value;
    }

    public SearchColumnDoubleField[] getConversionRate() {
        return this.conversionRate;
    }

    public void setConversionRate(SearchColumnDoubleField[] conversionRate) {
        this.conversionRate = conversionRate;
    }

    public SearchColumnDoubleField getConversionRate(int i) {
        return this.conversionRate[i];
    }

    public void setConversionRate(int i, SearchColumnDoubleField _value) {
        this.conversionRate[i] = _value;
    }

    public SearchColumnBooleanField[] getCopyDescription() {
        return this.copyDescription;
    }

    public void setCopyDescription(SearchColumnBooleanField[] copyDescription) {
        this.copyDescription = copyDescription;
    }

    public SearchColumnBooleanField getCopyDescription(int i) {
        return this.copyDescription[i];
    }

    public void setCopyDescription(int i, SearchColumnBooleanField _value) {
        this.copyDescription[i] = _value;
    }

    public SearchColumnSelectField[] getCorrelatedItem() {
        return this.correlatedItem;
    }

    public void setCorrelatedItem(SearchColumnSelectField[] correlatedItem) {
        this.correlatedItem = correlatedItem;
    }

    public SearchColumnSelectField getCorrelatedItem(int i) {
        return this.correlatedItem[i];
    }

    public void setCorrelatedItem(int i, SearchColumnSelectField _value) {
        this.correlatedItem[i] = _value;
    }

    public SearchColumnDoubleField[] getCorrelatedItemCorrelation() {
        return this.correlatedItemCorrelation;
    }

    public void setCorrelatedItemCorrelation(SearchColumnDoubleField[] correlatedItemCorrelation) {
        this.correlatedItemCorrelation = correlatedItemCorrelation;
    }

    public SearchColumnDoubleField getCorrelatedItemCorrelation(int i) {
        return this.correlatedItemCorrelation[i];
    }

    public void setCorrelatedItemCorrelation(int i, SearchColumnDoubleField _value) {
        this.correlatedItemCorrelation[i] = _value;
    }

    public SearchColumnLongField[] getCorrelatedItemCount() {
        return this.correlatedItemCount;
    }

    public void setCorrelatedItemCount(SearchColumnLongField[] correlatedItemCount) {
        this.correlatedItemCount = correlatedItemCount;
    }

    public SearchColumnLongField getCorrelatedItemCount(int i) {
        return this.correlatedItemCount[i];
    }

    public void setCorrelatedItemCount(int i, SearchColumnLongField _value) {
        this.correlatedItemCount[i] = _value;
    }

    public SearchColumnDoubleField[] getCorrelatedItemLift() {
        return this.correlatedItemLift;
    }

    public void setCorrelatedItemLift(SearchColumnDoubleField[] correlatedItemLift) {
        this.correlatedItemLift = correlatedItemLift;
    }

    public SearchColumnDoubleField getCorrelatedItemLift(int i) {
        return this.correlatedItemLift[i];
    }

    public void setCorrelatedItemLift(int i, SearchColumnDoubleField _value) {
        this.correlatedItemLift[i] = _value;
    }

    public SearchColumnDoubleField[] getCorrelatedItemPurchaseRate() {
        return this.correlatedItemPurchaseRate;
    }

    public void setCorrelatedItemPurchaseRate(SearchColumnDoubleField[] correlatedItemPurchaseRate) {
        this.correlatedItemPurchaseRate = correlatedItemPurchaseRate;
    }

    public SearchColumnDoubleField getCorrelatedItemPurchaseRate(int i) {
        return this.correlatedItemPurchaseRate[i];
    }

    public void setCorrelatedItemPurchaseRate(int i, SearchColumnDoubleField _value) {
        this.correlatedItemPurchaseRate[i] = _value;
    }

    public SearchColumnDoubleField[] getCost() {
        return this.cost;
    }

    public void setCost(SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCostAccountingStatus() {
        return this.costAccountingStatus;
    }

    public void setCostAccountingStatus(SearchColumnEnumSelectField[] costAccountingStatus) {
        this.costAccountingStatus = costAccountingStatus;
    }

    public SearchColumnEnumSelectField getCostAccountingStatus(int i) {
        return this.costAccountingStatus[i];
    }

    public void setCostAccountingStatus(int i, SearchColumnEnumSelectField _value) {
        this.costAccountingStatus[i] = _value;
    }

    public SearchColumnStringField[] getCostCategory() {
        return this.costCategory;
    }

    public void setCostCategory(SearchColumnStringField[] costCategory) {
        this.costCategory = costCategory;
    }

    public SearchColumnStringField getCostCategory(int i) {
        return this.costCategory[i];
    }

    public void setCostCategory(int i, SearchColumnStringField _value) {
        this.costCategory[i] = _value;
    }

    public SearchColumnDoubleField[] getCostEstimate() {
        return this.costEstimate;
    }

    public void setCostEstimate(SearchColumnDoubleField[] costEstimate) {
        this.costEstimate = costEstimate;
    }

    public SearchColumnDoubleField getCostEstimate(int i) {
        return this.costEstimate[i];
    }

    public void setCostEstimate(int i, SearchColumnDoubleField _value) {
        this.costEstimate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCostEstimateType() {
        return this.costEstimateType;
    }

    public void setCostEstimateType(SearchColumnEnumSelectField[] costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public SearchColumnEnumSelectField getCostEstimateType(int i) {
        return this.costEstimateType[i];
    }

    public void setCostEstimateType(int i, SearchColumnEnumSelectField _value) {
        this.costEstimateType[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCostingMethod() {
        return this.costingMethod;
    }

    public void setCostingMethod(SearchColumnEnumSelectField[] costingMethod) {
        this.costingMethod = costingMethod;
    }

    public SearchColumnEnumSelectField getCostingMethod(int i) {
        return this.costingMethod[i];
    }

    public void setCostingMethod(int i, SearchColumnEnumSelectField _value) {
        this.costingMethod[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCountryOfManufacture() {
        return this.countryOfManufacture;
    }

    public void setCountryOfManufacture(SearchColumnEnumSelectField[] countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public SearchColumnEnumSelectField getCountryOfManufacture(int i) {
        return this.countryOfManufacture[i];
    }

    public void setCountryOfManufacture(int i, SearchColumnEnumSelectField _value) {
        this.countryOfManufacture[i] = _value;
    }

    public SearchColumnDateField[] getCreated() {
        return this.created;
    }

    public void setCreated(SearchColumnDateField[] created) {
        this.created = created;
    }

    public SearchColumnDateField getCreated(int i) {
        return this.created[i];
    }

    public void setCreated(int i, SearchColumnDateField _value) {
        this.created[i] = _value;
    }

    public SearchColumnBooleanField[] getCreateJob() {
        return this.createJob;
    }

    public void setCreateJob(SearchColumnBooleanField[] createJob) {
        this.createJob = createJob;
    }

    public SearchColumnBooleanField getCreateJob(int i) {
        return this.createJob[i];
    }

    public void setCreateJob(int i, SearchColumnBooleanField _value) {
        this.createJob[i] = _value;
    }

    public SearchColumnSelectField[] getCreateRevenuePlansOn() {
        return this.createRevenuePlansOn;
    }

    public void setCreateRevenuePlansOn(SearchColumnSelectField[] createRevenuePlansOn) {
        this.createRevenuePlansOn = createRevenuePlansOn;
    }

    public SearchColumnSelectField getCreateRevenuePlansOn(int i) {
        return this.createRevenuePlansOn[i];
    }

    public void setCreateRevenuePlansOn(int i, SearchColumnSelectField _value) {
        this.createRevenuePlansOn[i] = _value;
    }

    public SearchColumnSelectField[] getCustReturnVarianceAccount() {
        return this.custReturnVarianceAccount;
    }

    public void setCustReturnVarianceAccount(SearchColumnSelectField[] custReturnVarianceAccount) {
        this.custReturnVarianceAccount = custReturnVarianceAccount;
    }

    public SearchColumnSelectField getCustReturnVarianceAccount(int i) {
        return this.custReturnVarianceAccount[i];
    }

    public void setCustReturnVarianceAccount(int i, SearchColumnSelectField _value) {
        this.custReturnVarianceAccount[i] = _value;
    }

    public SearchColumnDateField[] getDateViewed() {
        return this.dateViewed;
    }

    public void setDateViewed(SearchColumnDateField[] dateViewed) {
        this.dateViewed = dateViewed;
    }

    public SearchColumnDateField getDateViewed(int i) {
        return this.dateViewed[i];
    }

    public void setDateViewed(int i, SearchColumnDateField _value) {
        this.dateViewed[i] = _value;
    }

    public SearchColumnStringField[] getDaysBeforeExpiration() {
        return this.daysBeforeExpiration;
    }

    public void setDaysBeforeExpiration(SearchColumnStringField[] daysBeforeExpiration) {
        this.daysBeforeExpiration = daysBeforeExpiration;
    }

    public SearchColumnStringField getDaysBeforeExpiration(int i) {
        return this.daysBeforeExpiration[i];
    }

    public void setDaysBeforeExpiration(int i, SearchColumnStringField _value) {
        this.daysBeforeExpiration[i] = _value;
    }

    public SearchColumnDoubleField[] getDefaultReturnCost() {
        return this.defaultReturnCost;
    }

    public void setDefaultReturnCost(SearchColumnDoubleField[] defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }

    public SearchColumnDoubleField getDefaultReturnCost(int i) {
        return this.defaultReturnCost[i];
    }

    public void setDefaultReturnCost(int i, SearchColumnDoubleField _value) {
        this.defaultReturnCost[i] = _value;
    }

    public SearchColumnStringField[] getDefaultShippingMethod() {
        return this.defaultShippingMethod;
    }

    public void setDefaultShippingMethod(SearchColumnStringField[] defaultShippingMethod) {
        this.defaultShippingMethod = defaultShippingMethod;
    }

    public SearchColumnStringField getDefaultShippingMethod(int i) {
        return this.defaultShippingMethod[i];
    }

    public void setDefaultShippingMethod(int i, SearchColumnStringField _value) {
        this.defaultShippingMethod[i] = _value;
    }

    public SearchColumnSelectField[] getDeferredExpenseAccount() {
        return this.deferredExpenseAccount;
    }

    public void setDeferredExpenseAccount(SearchColumnSelectField[] deferredExpenseAccount) {
        this.deferredExpenseAccount = deferredExpenseAccount;
    }

    public SearchColumnSelectField getDeferredExpenseAccount(int i) {
        return this.deferredExpenseAccount[i];
    }

    public void setDeferredExpenseAccount(int i, SearchColumnSelectField _value) {
        this.deferredExpenseAccount[i] = _value;
    }

    public SearchColumnSelectField[] getDeferredRevenueAccount() {
        return this.deferredRevenueAccount;
    }

    public void setDeferredRevenueAccount(SearchColumnSelectField[] deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }

    public SearchColumnSelectField getDeferredRevenueAccount(int i) {
        return this.deferredRevenueAccount[i];
    }

    public void setDeferredRevenueAccount(int i, SearchColumnSelectField _value) {
        this.deferredRevenueAccount[i] = _value;
    }

    public SearchColumnBooleanField[] getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(SearchColumnBooleanField[] deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public SearchColumnBooleanField getDeferRevRec(int i) {
        return this.deferRevRec[i];
    }

    public void setDeferRevRec(int i, SearchColumnBooleanField _value) {
        this.deferRevRec[i] = _value;
    }

    public SearchColumnDoubleField[] getDemandModifier() {
        return this.demandModifier;
    }

    public void setDemandModifier(SearchColumnDoubleField[] demandModifier) {
        this.demandModifier = demandModifier;
    }

    public SearchColumnDoubleField getDemandModifier(int i) {
        return this.demandModifier[i];
    }

    public void setDemandModifier(int i, SearchColumnDoubleField _value) {
        this.demandModifier[i] = _value;
    }

    public SearchColumnEnumSelectField[] getDemandSource() {
        return this.demandSource;
    }

    public void setDemandSource(SearchColumnEnumSelectField[] demandSource) {
        this.demandSource = demandSource;
    }

    public SearchColumnEnumSelectField getDemandSource(int i) {
        return this.demandSource[i];
    }

    public void setDemandSource(int i, SearchColumnEnumSelectField _value) {
        this.demandSource[i] = _value;
    }

    public SearchColumnLongField[] getDemandTimeFence() {
        return this.demandTimeFence;
    }

    public void setDemandTimeFence(SearchColumnLongField[] demandTimeFence) {
        this.demandTimeFence = demandTimeFence;
    }

    public SearchColumnLongField getDemandTimeFence(int i) {
        return this.demandTimeFence[i];
    }

    public void setDemandTimeFence(int i, SearchColumnLongField _value) {
        this.demandTimeFence[i] = _value;
    }

    public SearchColumnSelectField[] getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchColumnSelectField[] department) {
        this.department = department;
    }

    public SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, SearchColumnSelectField _value) {
        this.department[i] = _value;
    }

    public SearchColumnSelectField[] getDepartmentnohierarchy() {
        return this.departmentnohierarchy;
    }

    public void setDepartmentnohierarchy(SearchColumnSelectField[] departmentnohierarchy) {
        this.departmentnohierarchy = departmentnohierarchy;
    }

    public SearchColumnSelectField getDepartmentnohierarchy(int i) {
        return this.departmentnohierarchy[i];
    }

    public void setDepartmentnohierarchy(int i, SearchColumnSelectField _value) {
        this.departmentnohierarchy[i] = _value;
    }

    public SearchColumnBooleanField[] getDirectRevenuePosting() {
        return this.directRevenuePosting;
    }

    public void setDirectRevenuePosting(SearchColumnBooleanField[] directRevenuePosting) {
        this.directRevenuePosting = directRevenuePosting;
    }

    public SearchColumnBooleanField getDirectRevenuePosting(int i) {
        return this.directRevenuePosting[i];
    }

    public void setDirectRevenuePosting(int i, SearchColumnBooleanField _value) {
        this.directRevenuePosting[i] = _value;
    }

    public SearchColumnBooleanField[] getDisplayIneBayStore() {
        return this.displayIneBayStore;
    }

    public void setDisplayIneBayStore(SearchColumnBooleanField[] displayIneBayStore) {
        this.displayIneBayStore = displayIneBayStore;
    }

    public SearchColumnBooleanField getDisplayIneBayStore(int i) {
        return this.displayIneBayStore[i];
    }

    public void setDisplayIneBayStore(int i, SearchColumnBooleanField _value) {
        this.displayIneBayStore[i] = _value;
    }

    public SearchColumnStringField[] getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(SearchColumnStringField[] displayName) {
        this.displayName = displayName;
    }

    public SearchColumnStringField getDisplayName(int i) {
        return this.displayName[i];
    }

    public void setDisplayName(int i, SearchColumnStringField _value) {
        this.displayName[i] = _value;
    }

    public SearchColumnSelectField[] getDistributionCategory() {
        return this.distributionCategory;
    }

    public void setDistributionCategory(SearchColumnSelectField[] distributionCategory) {
        this.distributionCategory = distributionCategory;
    }

    public SearchColumnSelectField getDistributionCategory(int i) {
        return this.distributionCategory[i];
    }

    public void setDistributionCategory(int i, SearchColumnSelectField _value) {
        this.distributionCategory[i] = _value;
    }

    public SearchColumnSelectField[] getDistributionNetwork() {
        return this.distributionNetwork;
    }

    public void setDistributionNetwork(SearchColumnSelectField[] distributionNetwork) {
        this.distributionNetwork = distributionNetwork;
    }

    public SearchColumnSelectField getDistributionNetwork(int i) {
        return this.distributionNetwork[i];
    }

    public void setDistributionNetwork(int i, SearchColumnSelectField _value) {
        this.distributionNetwork[i] = _value;
    }

    public SearchColumnBooleanField[] getDontShowPrice() {
        return this.dontShowPrice;
    }

    public void setDontShowPrice(SearchColumnBooleanField[] dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }

    public SearchColumnBooleanField getDontShowPrice(int i) {
        return this.dontShowPrice[i];
    }

    public void setDontShowPrice(int i, SearchColumnBooleanField _value) {
        this.dontShowPrice[i] = _value;
    }

    public SearchColumnStringField[] getEBayItemDescription() {
        return this.eBayItemDescription;
    }

    public void setEBayItemDescription(SearchColumnStringField[] eBayItemDescription) {
        this.eBayItemDescription = eBayItemDescription;
    }

    public SearchColumnStringField getEBayItemDescription(int i) {
        return this.eBayItemDescription[i];
    }

    public void setEBayItemDescription(int i, SearchColumnStringField _value) {
        this.eBayItemDescription[i] = _value;
    }

    public SearchColumnStringField[] getEBayItemSubtitle() {
        return this.eBayItemSubtitle;
    }

    public void setEBayItemSubtitle(SearchColumnStringField[] eBayItemSubtitle) {
        this.eBayItemSubtitle = eBayItemSubtitle;
    }

    public SearchColumnStringField getEBayItemSubtitle(int i) {
        return this.eBayItemSubtitle[i];
    }

    public void setEBayItemSubtitle(int i, SearchColumnStringField _value) {
        this.eBayItemSubtitle[i] = _value;
    }

    public SearchColumnStringField[] getEBayItemTitle() {
        return this.eBayItemTitle;
    }

    public void setEBayItemTitle(SearchColumnStringField[] eBayItemTitle) {
        this.eBayItemTitle = eBayItemTitle;
    }

    public SearchColumnStringField getEBayItemTitle(int i) {
        return this.eBayItemTitle[i];
    }

    public void setEBayItemTitle(int i, SearchColumnStringField _value) {
        this.eBayItemTitle[i] = _value;
    }

    public SearchColumnEnumSelectField[] getEbayRelistingOption() {
        return this.ebayRelistingOption;
    }

    public void setEbayRelistingOption(SearchColumnEnumSelectField[] ebayRelistingOption) {
        this.ebayRelistingOption = ebayRelistingOption;
    }

    public SearchColumnEnumSelectField getEbayRelistingOption(int i) {
        return this.ebayRelistingOption[i];
    }

    public void setEbayRelistingOption(int i, SearchColumnEnumSelectField _value) {
        this.ebayRelistingOption[i] = _value;
    }

    public SearchColumnEnumSelectField[] getEffectiveBomControl() {
        return this.effectiveBomControl;
    }

    public void setEffectiveBomControl(SearchColumnEnumSelectField[] effectiveBomControl) {
        this.effectiveBomControl = effectiveBomControl;
    }

    public SearchColumnEnumSelectField getEffectiveBomControl(int i) {
        return this.effectiveBomControl[i];
    }

    public void setEffectiveBomControl(int i, SearchColumnEnumSelectField _value) {
        this.effectiveBomControl[i] = _value;
    }

    public SearchColumnDateField[] getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(SearchColumnDateField[] effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public SearchColumnDateField getEffectiveDate(int i) {
        return this.effectiveDate[i];
    }

    public void setEffectiveDate(int i, SearchColumnDateField _value) {
        this.effectiveDate[i] = _value;
    }

    public SearchColumnSelectField[] getEffectiveRevision() {
        return this.effectiveRevision;
    }

    public void setEffectiveRevision(SearchColumnSelectField[] effectiveRevision) {
        this.effectiveRevision = effectiveRevision;
    }

    public SearchColumnSelectField getEffectiveRevision(int i) {
        return this.effectiveRevision[i];
    }

    public void setEffectiveRevision(int i, SearchColumnSelectField _value) {
        this.effectiveRevision[i] = _value;
    }

    public SearchColumnBooleanField[] getEnableCatchWeight() {
        return this.enableCatchWeight;
    }

    public void setEnableCatchWeight(SearchColumnBooleanField[] enableCatchWeight) {
        this.enableCatchWeight = enableCatchWeight;
    }

    public SearchColumnBooleanField getEnableCatchWeight(int i) {
        return this.enableCatchWeight[i];
    }

    public void setEnableCatchWeight(int i, SearchColumnBooleanField _value) {
        this.enableCatchWeight[i] = _value;
    }

    public SearchColumnBooleanField[] getEndAuctionsWhenOutOfStock() {
        return this.endAuctionsWhenOutOfStock;
    }

    public void setEndAuctionsWhenOutOfStock(SearchColumnBooleanField[] endAuctionsWhenOutOfStock) {
        this.endAuctionsWhenOutOfStock = endAuctionsWhenOutOfStock;
    }

    public SearchColumnBooleanField getEndAuctionsWhenOutOfStock(int i) {
        return this.endAuctionsWhenOutOfStock[i];
    }

    public void setEndAuctionsWhenOutOfStock(int i, SearchColumnBooleanField _value) {
        this.endAuctionsWhenOutOfStock[i] = _value;
    }

    public SearchColumnBooleanField[] getExcludeFromSitemap() {
        return this.excludeFromSitemap;
    }

    public void setExcludeFromSitemap(SearchColumnBooleanField[] excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }

    public SearchColumnBooleanField getExcludeFromSitemap(int i) {
        return this.excludeFromSitemap[i];
    }

    public void setExcludeFromSitemap(int i, SearchColumnBooleanField _value) {
        this.excludeFromSitemap[i] = _value;
    }

    public SearchColumnSelectField[] getExpenseAccount() {
        return this.expenseAccount;
    }

    public void setExpenseAccount(SearchColumnSelectField[] expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public SearchColumnSelectField getExpenseAccount(int i) {
        return this.expenseAccount[i];
    }

    public void setExpenseAccount(int i, SearchColumnSelectField _value) {
        this.expenseAccount[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnStringField[] getFeaturedDescription() {
        return this.featuredDescription;
    }

    public void setFeaturedDescription(SearchColumnStringField[] featuredDescription) {
        this.featuredDescription = featuredDescription;
    }

    public SearchColumnStringField getFeaturedDescription(int i) {
        return this.featuredDescription[i];
    }

    public void setFeaturedDescription(int i, SearchColumnStringField _value) {
        this.featuredDescription[i] = _value;
    }

    public SearchColumnStringField[] getFeedDescription() {
        return this.feedDescription;
    }

    public void setFeedDescription(SearchColumnStringField[] feedDescription) {
        this.feedDescription = feedDescription;
    }

    public SearchColumnStringField getFeedDescription(int i) {
        return this.feedDescription[i];
    }

    public void setFeedDescription(int i, SearchColumnStringField _value) {
        this.feedDescription[i] = _value;
    }

    public SearchColumnStringField[] getFeedName() {
        return this.feedName;
    }

    public void setFeedName(SearchColumnStringField[] feedName) {
        this.feedName = feedName;
    }

    public SearchColumnStringField getFeedName(int i) {
        return this.feedName[i];
    }

    public void setFeedName(int i, SearchColumnStringField _value) {
        this.feedName[i] = _value;
    }

    public SearchColumnDoubleField[] getFixedBuildTime() {
        return this.fixedBuildTime;
    }

    public void setFixedBuildTime(SearchColumnDoubleField[] fixedBuildTime) {
        this.fixedBuildTime = fixedBuildTime;
    }

    public SearchColumnDoubleField getFixedBuildTime(int i) {
        return this.fixedBuildTime[i];
    }

    public void setFixedBuildTime(int i, SearchColumnDoubleField _value) {
        this.fixedBuildTime[i] = _value;
    }

    public SearchColumnDoubleField[] getFixedLotSize() {
        return this.fixedLotSize;
    }

    public void setFixedLotSize(SearchColumnDoubleField[] fixedLotSize) {
        this.fixedLotSize = fixedLotSize;
    }

    public SearchColumnDoubleField getFixedLotSize(int i) {
        return this.fixedLotSize[i];
    }

    public void setFixedLotSize(int i, SearchColumnDoubleField _value) {
        this.fixedLotSize[i] = _value;
    }

    public SearchColumnLongField[] getForwardConsumptionDays() {
        return this.forwardConsumptionDays;
    }

    public void setForwardConsumptionDays(SearchColumnLongField[] forwardConsumptionDays) {
        this.forwardConsumptionDays = forwardConsumptionDays;
    }

    public SearchColumnLongField getForwardConsumptionDays(int i) {
        return this.forwardConsumptionDays[i];
    }

    public void setForwardConsumptionDays(int i, SearchColumnLongField _value) {
        this.forwardConsumptionDays[i] = _value;
    }

    public SearchColumnEnumSelectField[] getFraudRisk() {
        return this.fraudRisk;
    }

    public void setFraudRisk(SearchColumnEnumSelectField[] fraudRisk) {
        this.fraudRisk = fraudRisk;
    }

    public SearchColumnEnumSelectField getFraudRisk(int i) {
        return this.fraudRisk[i];
    }

    public void setFraudRisk(int i, SearchColumnEnumSelectField _value) {
        this.fraudRisk[i] = _value;
    }

    public SearchColumnBooleanField[] getFroogleProductFeed() {
        return this.froogleProductFeed;
    }

    public void setFroogleProductFeed(SearchColumnBooleanField[] froogleProductFeed) {
        this.froogleProductFeed = froogleProductFeed;
    }

    public SearchColumnBooleanField getFroogleProductFeed(int i) {
        return this.froogleProductFeed[i];
    }

    public void setFroogleProductFeed(int i, SearchColumnBooleanField _value) {
        this.froogleProductFeed[i] = _value;
    }

    public SearchColumnLongField[] getFutureHorizon() {
        return this.futureHorizon;
    }

    public void setFutureHorizon(SearchColumnLongField[] futureHorizon) {
        this.futureHorizon = futureHorizon;
    }

    public SearchColumnLongField getFutureHorizon(int i) {
        return this.futureHorizon[i];
    }

    public void setFutureHorizon(int i, SearchColumnLongField _value) {
        this.futureHorizon[i] = _value;
    }

    public SearchColumnDoubleField[] getFxCost() {
        return this.fxCost;
    }

    public void setFxCost(SearchColumnDoubleField[] fxCost) {
        this.fxCost = fxCost;
    }

    public SearchColumnDoubleField getFxCost(int i) {
        return this.fxCost[i];
    }

    public void setFxCost(int i, SearchColumnDoubleField _value) {
        this.fxCost[i] = _value;
    }

    public SearchColumnSelectField[] getGainLossAccount() {
        return this.gainLossAccount;
    }

    public void setGainLossAccount(SearchColumnSelectField[] gainLossAccount) {
        this.gainLossAccount = gainLossAccount;
    }

    public SearchColumnSelectField getGainLossAccount(int i) {
        return this.gainLossAccount[i];
    }

    public void setGainLossAccount(int i, SearchColumnSelectField _value) {
        this.gainLossAccount[i] = _value;
    }

    public SearchColumnBooleanField[] getGenerateAccruals() {
        return this.generateAccruals;
    }

    public void setGenerateAccruals(SearchColumnBooleanField[] generateAccruals) {
        this.generateAccruals = generateAccruals;
    }

    public SearchColumnBooleanField getGenerateAccruals(int i) {
        return this.generateAccruals[i];
    }

    public void setGenerateAccruals(int i, SearchColumnBooleanField _value) {
        this.generateAccruals[i] = _value;
    }

    public SearchColumnStringField[] getGiftCertAuthCode() {
        return this.giftCertAuthCode;
    }

    public void setGiftCertAuthCode(SearchColumnStringField[] giftCertAuthCode) {
        this.giftCertAuthCode = giftCertAuthCode;
    }

    public SearchColumnStringField getGiftCertAuthCode(int i) {
        return this.giftCertAuthCode[i];
    }

    public void setGiftCertAuthCode(int i, SearchColumnStringField _value) {
        this.giftCertAuthCode[i] = _value;
    }

    public SearchColumnStringField[] getGiftCertEmail() {
        return this.giftCertEmail;
    }

    public void setGiftCertEmail(SearchColumnStringField[] giftCertEmail) {
        this.giftCertEmail = giftCertEmail;
    }

    public SearchColumnStringField getGiftCertEmail(int i) {
        return this.giftCertEmail[i];
    }

    public void setGiftCertEmail(int i, SearchColumnStringField _value) {
        this.giftCertEmail[i] = _value;
    }

    public SearchColumnStringField[] getGiftCertExpirationDate() {
        return this.giftCertExpirationDate;
    }

    public void setGiftCertExpirationDate(SearchColumnStringField[] giftCertExpirationDate) {
        this.giftCertExpirationDate = giftCertExpirationDate;
    }

    public SearchColumnStringField getGiftCertExpirationDate(int i) {
        return this.giftCertExpirationDate[i];
    }

    public void setGiftCertExpirationDate(int i, SearchColumnStringField _value) {
        this.giftCertExpirationDate[i] = _value;
    }

    public SearchColumnStringField[] getGiftCertFrom() {
        return this.giftCertFrom;
    }

    public void setGiftCertFrom(SearchColumnStringField[] giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }

    public SearchColumnStringField getGiftCertFrom(int i) {
        return this.giftCertFrom[i];
    }

    public void setGiftCertFrom(int i, SearchColumnStringField _value) {
        this.giftCertFrom[i] = _value;
    }

    public SearchColumnStringField[] getGiftCertMessage() {
        return this.giftCertMessage;
    }

    public void setGiftCertMessage(SearchColumnStringField[] giftCertMessage) {
        this.giftCertMessage = giftCertMessage;
    }

    public SearchColumnStringField getGiftCertMessage(int i) {
        return this.giftCertMessage[i];
    }

    public void setGiftCertMessage(int i, SearchColumnStringField _value) {
        this.giftCertMessage[i] = _value;
    }

    public SearchColumnStringField[] getGiftCertOriginalAmount() {
        return this.giftCertOriginalAmount;
    }

    public void setGiftCertOriginalAmount(SearchColumnStringField[] giftCertOriginalAmount) {
        this.giftCertOriginalAmount = giftCertOriginalAmount;
    }

    public SearchColumnStringField getGiftCertOriginalAmount(int i) {
        return this.giftCertOriginalAmount[i];
    }

    public void setGiftCertOriginalAmount(int i, SearchColumnStringField _value) {
        this.giftCertOriginalAmount[i] = _value;
    }

    public SearchColumnStringField[] getGiftCertRecipient() {
        return this.giftCertRecipient;
    }

    public void setGiftCertRecipient(SearchColumnStringField[] giftCertRecipient) {
        this.giftCertRecipient = giftCertRecipient;
    }

    public SearchColumnStringField getGiftCertRecipient(int i) {
        return this.giftCertRecipient[i];
    }

    public void setGiftCertRecipient(int i, SearchColumnStringField _value) {
        this.giftCertRecipient[i] = _value;
    }

    public SearchColumnStringField[] getHierarchyNode() {
        return this.hierarchyNode;
    }

    public void setHierarchyNode(SearchColumnStringField[] hierarchyNode) {
        this.hierarchyNode = hierarchyNode;
    }

    public SearchColumnStringField getHierarchyNode(int i) {
        return this.hierarchyNode[i];
    }

    public void setHierarchyNode(int i, SearchColumnStringField _value) {
        this.hierarchyNode[i] = _value;
    }

    public SearchColumnStringField[] getHierarchyVersion() {
        return this.hierarchyVersion;
    }

    public void setHierarchyVersion(SearchColumnStringField[] hierarchyVersion) {
        this.hierarchyVersion = hierarchyVersion;
    }

    public SearchColumnStringField getHierarchyVersion(int i) {
        return this.hierarchyVersion[i];
    }

    public void setHierarchyVersion(int i, SearchColumnStringField _value) {
        this.hierarchyVersion[i] = _value;
    }

    public SearchColumnLongField[] getHits() {
        return this.hits;
    }

    public void setHits(SearchColumnLongField[] hits) {
        this.hits = hits;
    }

    public SearchColumnLongField getHits(int i) {
        return this.hits[i];
    }

    public void setHits(int i, SearchColumnLongField _value) {
        this.hits[i] = _value;
    }

    public SearchColumnStringField[] getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(SearchColumnStringField[] imageUrl) {
        this.imageUrl = imageUrl;
    }

    public SearchColumnStringField getImageUrl(int i) {
        return this.imageUrl[i];
    }

    public void setImageUrl(int i, SearchColumnStringField _value) {
        this.imageUrl[i] = _value;
    }

    public SearchColumnBooleanField[] getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(SearchColumnBooleanField[] includeChildren) {
        this.includeChildren = includeChildren;
    }

    public SearchColumnBooleanField getIncludeChildren(int i) {
        return this.includeChildren[i];
    }

    public void setIncludeChildren(int i, SearchColumnBooleanField _value) {
        this.includeChildren[i] = _value;
    }

    public SearchColumnSelectField[] getIncomeAccount() {
        return this.incomeAccount;
    }

    public void setIncomeAccount(SearchColumnSelectField[] incomeAccount) {
        this.incomeAccount = incomeAccount;
    }

    public SearchColumnSelectField getIncomeAccount(int i) {
        return this.incomeAccount[i];
    }

    public void setIncomeAccount(int i, SearchColumnSelectField _value) {
        this.incomeAccount[i] = _value;
    }

    public SearchColumnSelectField[] getIntercoDefRevAccount() {
        return this.intercoDefRevAccount;
    }

    public void setIntercoDefRevAccount(SearchColumnSelectField[] intercoDefRevAccount) {
        this.intercoDefRevAccount = intercoDefRevAccount;
    }

    public SearchColumnSelectField getIntercoDefRevAccount(int i) {
        return this.intercoDefRevAccount[i];
    }

    public void setIntercoDefRevAccount(int i, SearchColumnSelectField _value) {
        this.intercoDefRevAccount[i] = _value;
    }

    public SearchColumnSelectField[] getIntercoExpenseAccount() {
        return this.intercoExpenseAccount;
    }

    public void setIntercoExpenseAccount(SearchColumnSelectField[] intercoExpenseAccount) {
        this.intercoExpenseAccount = intercoExpenseAccount;
    }

    public SearchColumnSelectField getIntercoExpenseAccount(int i) {
        return this.intercoExpenseAccount[i];
    }

    public void setIntercoExpenseAccount(int i, SearchColumnSelectField _value) {
        this.intercoExpenseAccount[i] = _value;
    }

    public SearchColumnSelectField[] getIntercoIncomeAccount() {
        return this.intercoIncomeAccount;
    }

    public void setIntercoIncomeAccount(SearchColumnSelectField[] intercoIncomeAccount) {
        this.intercoIncomeAccount = intercoIncomeAccount;
    }

    public SearchColumnSelectField getIntercoIncomeAccount(int i) {
        return this.intercoIncomeAccount[i];
    }

    public void setIntercoIncomeAccount(int i, SearchColumnSelectField _value) {
        this.intercoIncomeAccount[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnSelectField[] getInventoryLocation() {
        return this.inventoryLocation;
    }

    public void setInventoryLocation(SearchColumnSelectField[] inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public SearchColumnSelectField getInventoryLocation(int i) {
        return this.inventoryLocation[i];
    }

    public void setInventoryLocation(int i, SearchColumnSelectField _value) {
        this.inventoryLocation[i] = _value;
    }

    public SearchColumnEnumSelectField[] getInvtClassification() {
        return this.invtClassification;
    }

    public void setInvtClassification(SearchColumnEnumSelectField[] invtClassification) {
        this.invtClassification = invtClassification;
    }

    public SearchColumnEnumSelectField getInvtClassification(int i) {
        return this.invtClassification[i];
    }

    public void setInvtClassification(int i, SearchColumnEnumSelectField _value) {
        this.invtClassification[i] = _value;
    }

    public SearchColumnLongField[] getInvtCountInterval() {
        return this.invtCountInterval;
    }

    public void setInvtCountInterval(SearchColumnLongField[] invtCountInterval) {
        this.invtCountInterval = invtCountInterval;
    }

    public SearchColumnLongField getInvtCountInterval(int i) {
        return this.invtCountInterval[i];
    }

    public void setInvtCountInterval(int i, SearchColumnLongField _value) {
        this.invtCountInterval[i] = _value;
    }

    public SearchColumnBooleanField[] getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(SearchColumnBooleanField[] isAvailable) {
        this.isAvailable = isAvailable;
    }

    public SearchColumnBooleanField getIsAvailable(int i) {
        return this.isAvailable[i];
    }

    public void setIsAvailable(int i, SearchColumnBooleanField _value) {
        this.isAvailable[i] = _value;
    }

    public SearchColumnBooleanField[] getIsDropShipItem() {
        return this.isDropShipItem;
    }

    public void setIsDropShipItem(SearchColumnBooleanField[] isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }

    public SearchColumnBooleanField getIsDropShipItem(int i) {
        return this.isDropShipItem[i];
    }

    public void setIsDropShipItem(int i, SearchColumnBooleanField _value) {
        this.isDropShipItem[i] = _value;
    }

    public SearchColumnBooleanField[] getIsFulfillable() {
        return this.isFulfillable;
    }

    public void setIsFulfillable(SearchColumnBooleanField[] isFulfillable) {
        this.isFulfillable = isFulfillable;
    }

    public SearchColumnBooleanField getIsFulfillable(int i) {
        return this.isFulfillable[i];
    }

    public void setIsFulfillable(int i, SearchColumnBooleanField _value) {
        this.isFulfillable[i] = _value;
    }

    public SearchColumnBooleanField[] getIsGcoCompliant() {
        return this.isGcoCompliant;
    }

    public void setIsGcoCompliant(SearchColumnBooleanField[] isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }

    public SearchColumnBooleanField getIsGcoCompliant(int i) {
        return this.isGcoCompliant[i];
    }

    public void setIsGcoCompliant(int i, SearchColumnBooleanField _value) {
        this.isGcoCompliant[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }

    public SearchColumnBooleanField[] getIsLotItem() {
        return this.isLotItem;
    }

    public void setIsLotItem(SearchColumnBooleanField[] isLotItem) {
        this.isLotItem = isLotItem;
    }

    public SearchColumnBooleanField getIsLotItem(int i) {
        return this.isLotItem[i];
    }

    public void setIsLotItem(int i, SearchColumnBooleanField _value) {
        this.isLotItem[i] = _value;
    }

    public SearchColumnBooleanField[] getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(SearchColumnBooleanField[] isOnline) {
        this.isOnline = isOnline;
    }

    public SearchColumnBooleanField getIsOnline(int i) {
        return this.isOnline[i];
    }

    public void setIsOnline(int i, SearchColumnBooleanField _value) {
        this.isOnline[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSerialItem() {
        return this.isSerialItem;
    }

    public void setIsSerialItem(SearchColumnBooleanField[] isSerialItem) {
        this.isSerialItem = isSerialItem;
    }

    public SearchColumnBooleanField getIsSerialItem(int i) {
        return this.isSerialItem[i];
    }

    public void setIsSerialItem(int i, SearchColumnBooleanField _value) {
        this.isSerialItem[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSpecialOrderItem() {
        return this.isSpecialOrderItem;
    }

    public void setIsSpecialOrderItem(SearchColumnBooleanField[] isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }

    public SearchColumnBooleanField getIsSpecialOrderItem(int i) {
        return this.isSpecialOrderItem[i];
    }

    public void setIsSpecialOrderItem(int i, SearchColumnBooleanField _value) {
        this.isSpecialOrderItem[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSpecialWorkOrderItem() {
        return this.isSpecialWorkOrderItem;
    }

    public void setIsSpecialWorkOrderItem(SearchColumnBooleanField[] isSpecialWorkOrderItem) {
        this.isSpecialWorkOrderItem = isSpecialWorkOrderItem;
    }

    public SearchColumnBooleanField getIsSpecialWorkOrderItem(int i) {
        return this.isSpecialWorkOrderItem[i];
    }

    public void setIsSpecialWorkOrderItem(int i, SearchColumnBooleanField _value) {
        this.isSpecialWorkOrderItem[i] = _value;
    }

    public SearchColumnBooleanField[] getIsStorePickupAllowed() {
        return this.isStorePickupAllowed;
    }

    public void setIsStorePickupAllowed(SearchColumnBooleanField[] isStorePickupAllowed) {
        this.isStorePickupAllowed = isStorePickupAllowed;
    }

    public SearchColumnBooleanField getIsStorePickupAllowed(int i) {
        return this.isStorePickupAllowed[i];
    }

    public void setIsStorePickupAllowed(int i, SearchColumnBooleanField _value) {
        this.isStorePickupAllowed[i] = _value;
    }

    public SearchColumnSelectField[] getIssueProduct() {
        return this.issueProduct;
    }

    public void setIssueProduct(SearchColumnSelectField[] issueProduct) {
        this.issueProduct = issueProduct;
    }

    public SearchColumnSelectField getIssueProduct(int i) {
        return this.issueProduct[i];
    }

    public void setIssueProduct(int i, SearchColumnSelectField _value) {
        this.issueProduct[i] = _value;
    }

    public SearchColumnBooleanField[] getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(SearchColumnBooleanField[] isTaxable) {
        this.isTaxable = isTaxable;
    }

    public SearchColumnBooleanField getIsTaxable(int i) {
        return this.isTaxable[i];
    }

    public void setIsTaxable(int i, SearchColumnBooleanField _value) {
        this.isTaxable[i] = _value;
    }

    public SearchColumnBooleanField[] getIsVsoeBundle() {
        return this.isVsoeBundle;
    }

    public void setIsVsoeBundle(SearchColumnBooleanField[] isVsoeBundle) {
        this.isVsoeBundle = isVsoeBundle;
    }

    public SearchColumnBooleanField getIsVsoeBundle(int i) {
        return this.isVsoeBundle[i];
    }

    public void setIsVsoeBundle(int i, SearchColumnBooleanField _value) {
        this.isVsoeBundle[i] = _value;
    }

    public SearchColumnBooleanField[] getIsWip() {
        return this.isWip;
    }

    public void setIsWip(SearchColumnBooleanField[] isWip) {
        this.isWip = isWip;
    }

    public SearchColumnBooleanField getIsWip(int i) {
        return this.isWip[i];
    }

    public void setIsWip(int i, SearchColumnBooleanField _value) {
        this.isWip[i] = _value;
    }

    public SearchColumnStringField[] getItemId() {
        return this.itemId;
    }

    public void setItemId(SearchColumnStringField[] itemId) {
        this.itemId = itemId;
    }

    public SearchColumnStringField getItemId(int i) {
        return this.itemId[i];
    }

    public void setItemId(int i, SearchColumnStringField _value) {
        this.itemId[i] = _value;
    }

    public SearchColumnSelectField[] getItemRevenueCategory() {
        return this.itemRevenueCategory;
    }

    public void setItemRevenueCategory(SearchColumnSelectField[] itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }

    public SearchColumnSelectField getItemRevenueCategory(int i) {
        return this.itemRevenueCategory[i];
    }

    public void setItemRevenueCategory(int i, SearchColumnSelectField _value) {
        this.itemRevenueCategory[i] = _value;
    }

    public SearchColumnStringField[] getItemUrl() {
        return this.itemUrl;
    }

    public void setItemUrl(SearchColumnStringField[] itemUrl) {
        this.itemUrl = itemUrl;
    }

    public SearchColumnStringField getItemUrl(int i) {
        return this.itemUrl[i];
    }

    public void setItemUrl(int i, SearchColumnStringField _value) {
        this.itemUrl[i] = _value;
    }

    public SearchColumnDateField[] getLastInvtCountDate() {
        return this.lastInvtCountDate;
    }

    public void setLastInvtCountDate(SearchColumnDateField[] lastInvtCountDate) {
        this.lastInvtCountDate = lastInvtCountDate;
    }

    public SearchColumnDateField getLastInvtCountDate(int i) {
        return this.lastInvtCountDate[i];
    }

    public void setLastInvtCountDate(int i, SearchColumnDateField _value) {
        this.lastInvtCountDate[i] = _value;
    }

    public SearchColumnDoubleField[] getLastPurchasePrice() {
        return this.lastPurchasePrice;
    }

    public void setLastPurchasePrice(SearchColumnDoubleField[] lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }

    public SearchColumnDoubleField getLastPurchasePrice(int i) {
        return this.lastPurchasePrice[i];
    }

    public void setLastPurchasePrice(int i, SearchColumnDoubleField _value) {
        this.lastPurchasePrice[i] = _value;
    }

    public SearchColumnDateField[] getLastQuantityAvailableChange() {
        return this.lastQuantityAvailableChange;
    }

    public void setLastQuantityAvailableChange(SearchColumnDateField[] lastQuantityAvailableChange) {
        this.lastQuantityAvailableChange = lastQuantityAvailableChange;
    }

    public SearchColumnDateField getLastQuantityAvailableChange(int i) {
        return this.lastQuantityAvailableChange[i];
    }

    public void setLastQuantityAvailableChange(int i, SearchColumnDateField _value) {
        this.lastQuantityAvailableChange[i] = _value;
    }

    public SearchColumnLongField[] getLeadTime() {
        return this.leadTime;
    }

    public void setLeadTime(SearchColumnLongField[] leadTime) {
        this.leadTime = leadTime;
    }

    public SearchColumnLongField getLeadTime(int i) {
        return this.leadTime[i];
    }

    public void setLeadTime(int i, SearchColumnLongField _value) {
        this.leadTime[i] = _value;
    }

    public SearchColumnSelectField[] getLiabilityAccount() {
        return this.liabilityAccount;
    }

    public void setLiabilityAccount(SearchColumnSelectField[] liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }

    public SearchColumnSelectField getLiabilityAccount(int i) {
        return this.liabilityAccount[i];
    }

    public void setLiabilityAccount(int i, SearchColumnSelectField _value) {
        this.liabilityAccount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getListingDuration() {
        return this.listingDuration;
    }

    public void setListingDuration(SearchColumnEnumSelectField[] listingDuration) {
        this.listingDuration = listingDuration;
    }

    public SearchColumnEnumSelectField getListingDuration(int i) {
        return this.listingDuration[i];
    }

    public void setListingDuration(int i, SearchColumnEnumSelectField _value) {
        this.listingDuration[i] = _value;
    }

    public SearchColumnSelectField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnSelectField[] location) {
        this.location = location;
    }

    public SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnSelectField _value) {
        this.location[i] = _value;
    }

    public SearchColumnBooleanField[] getLocationAllowStorePickup() {
        return this.locationAllowStorePickup;
    }

    public void setLocationAllowStorePickup(SearchColumnBooleanField[] locationAllowStorePickup) {
        this.locationAllowStorePickup = locationAllowStorePickup;
    }

    public SearchColumnBooleanField getLocationAllowStorePickup(int i) {
        return this.locationAllowStorePickup[i];
    }

    public void setLocationAllowStorePickup(int i, SearchColumnBooleanField _value) {
        this.locationAllowStorePickup[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationAtpLeadTime() {
        return this.locationAtpLeadTime;
    }

    public void setLocationAtpLeadTime(SearchColumnDoubleField[] locationAtpLeadTime) {
        this.locationAtpLeadTime = locationAtpLeadTime;
    }

    public SearchColumnDoubleField getLocationAtpLeadTime(int i) {
        return this.locationAtpLeadTime[i];
    }

    public void setLocationAtpLeadTime(int i, SearchColumnDoubleField _value) {
        this.locationAtpLeadTime[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationAverageCost() {
        return this.locationAverageCost;
    }

    public void setLocationAverageCost(SearchColumnDoubleField[] locationAverageCost) {
        this.locationAverageCost = locationAverageCost;
    }

    public SearchColumnDoubleField getLocationAverageCost(int i) {
        return this.locationAverageCost[i];
    }

    public void setLocationAverageCost(int i, SearchColumnDoubleField _value) {
        this.locationAverageCost[i] = _value;
    }

    public SearchColumnStringField[] getLocationBinQuantityAvailable() {
        return this.locationBinQuantityAvailable;
    }

    public void setLocationBinQuantityAvailable(SearchColumnStringField[] locationBinQuantityAvailable) {
        this.locationBinQuantityAvailable = locationBinQuantityAvailable;
    }

    public SearchColumnStringField getLocationBinQuantityAvailable(int i) {
        return this.locationBinQuantityAvailable[i];
    }

    public void setLocationBinQuantityAvailable(int i, SearchColumnStringField _value) {
        this.locationBinQuantityAvailable[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationBuildTime() {
        return this.locationBuildTime;
    }

    public void setLocationBuildTime(SearchColumnDoubleField[] locationBuildTime) {
        this.locationBuildTime = locationBuildTime;
    }

    public SearchColumnDoubleField getLocationBuildTime(int i) {
        return this.locationBuildTime[i];
    }

    public void setLocationBuildTime(int i, SearchColumnDoubleField _value) {
        this.locationBuildTime[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationCost() {
        return this.locationCost;
    }

    public void setLocationCost(SearchColumnDoubleField[] locationCost) {
        this.locationCost = locationCost;
    }

    public SearchColumnDoubleField getLocationCost(int i) {
        return this.locationCost[i];
    }

    public void setLocationCost(int i, SearchColumnDoubleField _value) {
        this.locationCost[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLocationCostAccountingStatus() {
        return this.locationCostAccountingStatus;
    }

    public void setLocationCostAccountingStatus(SearchColumnEnumSelectField[] locationCostAccountingStatus) {
        this.locationCostAccountingStatus = locationCostAccountingStatus;
    }

    public SearchColumnEnumSelectField getLocationCostAccountingStatus(int i) {
        return this.locationCostAccountingStatus[i];
    }

    public void setLocationCostAccountingStatus(int i, SearchColumnEnumSelectField _value) {
        this.locationCostAccountingStatus[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationDefaultReturnCost() {
        return this.locationDefaultReturnCost;
    }

    public void setLocationDefaultReturnCost(SearchColumnDoubleField[] locationDefaultReturnCost) {
        this.locationDefaultReturnCost = locationDefaultReturnCost;
    }

    public SearchColumnDoubleField getLocationDefaultReturnCost(int i) {
        return this.locationDefaultReturnCost[i];
    }

    public void setLocationDefaultReturnCost(int i, SearchColumnDoubleField _value) {
        this.locationDefaultReturnCost[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLocationDemandSource() {
        return this.locationDemandSource;
    }

    public void setLocationDemandSource(SearchColumnEnumSelectField[] locationDemandSource) {
        this.locationDemandSource = locationDemandSource;
    }

    public SearchColumnEnumSelectField getLocationDemandSource(int i) {
        return this.locationDemandSource[i];
    }

    public void setLocationDemandSource(int i, SearchColumnEnumSelectField _value) {
        this.locationDemandSource[i] = _value;
    }

    public SearchColumnLongField[] getLocationDemandTimeFence() {
        return this.locationDemandTimeFence;
    }

    public void setLocationDemandTimeFence(SearchColumnLongField[] locationDemandTimeFence) {
        this.locationDemandTimeFence = locationDemandTimeFence;
    }

    public SearchColumnLongField getLocationDemandTimeFence(int i) {
        return this.locationDemandTimeFence[i];
    }

    public void setLocationDemandTimeFence(int i, SearchColumnLongField _value) {
        this.locationDemandTimeFence[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationFixedLotSize() {
        return this.locationFixedLotSize;
    }

    public void setLocationFixedLotSize(SearchColumnDoubleField[] locationFixedLotSize) {
        this.locationFixedLotSize = locationFixedLotSize;
    }

    public SearchColumnDoubleField getLocationFixedLotSize(int i) {
        return this.locationFixedLotSize[i];
    }

    public void setLocationFixedLotSize(int i, SearchColumnDoubleField _value) {
        this.locationFixedLotSize[i] = _value;
    }

    public SearchColumnStringField[] getLocationInventoryCostTemplate() {
        return this.locationInventoryCostTemplate;
    }

    public void setLocationInventoryCostTemplate(SearchColumnStringField[] locationInventoryCostTemplate) {
        this.locationInventoryCostTemplate = locationInventoryCostTemplate;
    }

    public SearchColumnStringField getLocationInventoryCostTemplate(int i) {
        return this.locationInventoryCostTemplate[i];
    }

    public void setLocationInventoryCostTemplate(int i, SearchColumnStringField _value) {
        this.locationInventoryCostTemplate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLocationInvtClassification() {
        return this.locationInvtClassification;
    }

    public void setLocationInvtClassification(SearchColumnEnumSelectField[] locationInvtClassification) {
        this.locationInvtClassification = locationInvtClassification;
    }

    public SearchColumnEnumSelectField getLocationInvtClassification(int i) {
        return this.locationInvtClassification[i];
    }

    public void setLocationInvtClassification(int i, SearchColumnEnumSelectField _value) {
        this.locationInvtClassification[i] = _value;
    }

    public SearchColumnLongField[] getLocationInvtCountInterval() {
        return this.locationInvtCountInterval;
    }

    public void setLocationInvtCountInterval(SearchColumnLongField[] locationInvtCountInterval) {
        this.locationInvtCountInterval = locationInvtCountInterval;
    }

    public SearchColumnLongField getLocationInvtCountInterval(int i) {
        return this.locationInvtCountInterval[i];
    }

    public void setLocationInvtCountInterval(int i, SearchColumnLongField _value) {
        this.locationInvtCountInterval[i] = _value;
    }

    public SearchColumnDateField[] getLocationLastInvtCountDate() {
        return this.locationLastInvtCountDate;
    }

    public void setLocationLastInvtCountDate(SearchColumnDateField[] locationLastInvtCountDate) {
        this.locationLastInvtCountDate = locationLastInvtCountDate;
    }

    public SearchColumnDateField getLocationLastInvtCountDate(int i) {
        return this.locationLastInvtCountDate[i];
    }

    public void setLocationLastInvtCountDate(int i, SearchColumnDateField _value) {
        this.locationLastInvtCountDate[i] = _value;
    }

    public SearchColumnLongField[] getLocationLeadTime() {
        return this.locationLeadTime;
    }

    public void setLocationLeadTime(SearchColumnLongField[] locationLeadTime) {
        this.locationLeadTime = locationLeadTime;
    }

    public SearchColumnLongField getLocationLeadTime(int i) {
        return this.locationLeadTime[i];
    }

    public void setLocationLeadTime(int i, SearchColumnLongField _value) {
        this.locationLeadTime[i] = _value;
    }

    public SearchColumnDateField[] getLocationNextInvtCountDate() {
        return this.locationNextInvtCountDate;
    }

    public void setLocationNextInvtCountDate(SearchColumnDateField[] locationNextInvtCountDate) {
        this.locationNextInvtCountDate = locationNextInvtCountDate;
    }

    public SearchColumnDateField getLocationNextInvtCountDate(int i) {
        return this.locationNextInvtCountDate[i];
    }

    public void setLocationNextInvtCountDate(int i, SearchColumnDateField _value) {
        this.locationNextInvtCountDate[i] = _value;
    }

    public SearchColumnLongField[] getLocationPeriodicLotSizeDays() {
        return this.locationPeriodicLotSizeDays;
    }

    public void setLocationPeriodicLotSizeDays(SearchColumnLongField[] locationPeriodicLotSizeDays) {
        this.locationPeriodicLotSizeDays = locationPeriodicLotSizeDays;
    }

    public SearchColumnLongField getLocationPeriodicLotSizeDays(int i) {
        return this.locationPeriodicLotSizeDays[i];
    }

    public void setLocationPeriodicLotSizeDays(int i, SearchColumnLongField _value) {
        this.locationPeriodicLotSizeDays[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLocationPeriodicLotSizeType() {
        return this.locationPeriodicLotSizeType;
    }

    public void setLocationPeriodicLotSizeType(SearchColumnEnumSelectField[] locationPeriodicLotSizeType) {
        this.locationPeriodicLotSizeType = locationPeriodicLotSizeType;
    }

    public SearchColumnEnumSelectField getLocationPeriodicLotSizeType(int i) {
        return this.locationPeriodicLotSizeType[i];
    }

    public void setLocationPeriodicLotSizeType(int i, SearchColumnEnumSelectField _value) {
        this.locationPeriodicLotSizeType[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationPreferredStockLevel() {
        return this.locationPreferredStockLevel;
    }

    public void setLocationPreferredStockLevel(SearchColumnDoubleField[] locationPreferredStockLevel) {
        this.locationPreferredStockLevel = locationPreferredStockLevel;
    }

    public SearchColumnDoubleField getLocationPreferredStockLevel(int i) {
        return this.locationPreferredStockLevel[i];
    }

    public void setLocationPreferredStockLevel(int i, SearchColumnDoubleField _value) {
        this.locationPreferredStockLevel[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationQtyAvailForStorePickup() {
        return this.locationQtyAvailForStorePickup;
    }

    public void setLocationQtyAvailForStorePickup(SearchColumnDoubleField[] locationQtyAvailForStorePickup) {
        this.locationQtyAvailForStorePickup = locationQtyAvailForStorePickup;
    }

    public SearchColumnDoubleField getLocationQtyAvailForStorePickup(int i) {
        return this.locationQtyAvailForStorePickup[i];
    }

    public void setLocationQtyAvailForStorePickup(int i, SearchColumnDoubleField _value) {
        this.locationQtyAvailForStorePickup[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationQuantityAvailable() {
        return this.locationQuantityAvailable;
    }

    public void setLocationQuantityAvailable(SearchColumnDoubleField[] locationQuantityAvailable) {
        this.locationQuantityAvailable = locationQuantityAvailable;
    }

    public SearchColumnDoubleField getLocationQuantityAvailable(int i) {
        return this.locationQuantityAvailable[i];
    }

    public void setLocationQuantityAvailable(int i, SearchColumnDoubleField _value) {
        this.locationQuantityAvailable[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationQuantityBackOrdered() {
        return this.locationQuantityBackOrdered;
    }

    public void setLocationQuantityBackOrdered(SearchColumnDoubleField[] locationQuantityBackOrdered) {
        this.locationQuantityBackOrdered = locationQuantityBackOrdered;
    }

    public SearchColumnDoubleField getLocationQuantityBackOrdered(int i) {
        return this.locationQuantityBackOrdered[i];
    }

    public void setLocationQuantityBackOrdered(int i, SearchColumnDoubleField _value) {
        this.locationQuantityBackOrdered[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationQuantityCommitted() {
        return this.locationQuantityCommitted;
    }

    public void setLocationQuantityCommitted(SearchColumnDoubleField[] locationQuantityCommitted) {
        this.locationQuantityCommitted = locationQuantityCommitted;
    }

    public SearchColumnDoubleField getLocationQuantityCommitted(int i) {
        return this.locationQuantityCommitted[i];
    }

    public void setLocationQuantityCommitted(int i, SearchColumnDoubleField _value) {
        this.locationQuantityCommitted[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationQuantityInTransit() {
        return this.locationQuantityInTransit;
    }

    public void setLocationQuantityInTransit(SearchColumnDoubleField[] locationQuantityInTransit) {
        this.locationQuantityInTransit = locationQuantityInTransit;
    }

    public SearchColumnDoubleField getLocationQuantityInTransit(int i) {
        return this.locationQuantityInTransit[i];
    }

    public void setLocationQuantityInTransit(int i, SearchColumnDoubleField _value) {
        this.locationQuantityInTransit[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationQuantityOnHand() {
        return this.locationQuantityOnHand;
    }

    public void setLocationQuantityOnHand(SearchColumnDoubleField[] locationQuantityOnHand) {
        this.locationQuantityOnHand = locationQuantityOnHand;
    }

    public SearchColumnDoubleField getLocationQuantityOnHand(int i) {
        return this.locationQuantityOnHand[i];
    }

    public void setLocationQuantityOnHand(int i, SearchColumnDoubleField _value) {
        this.locationQuantityOnHand[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationQuantityOnOrder() {
        return this.locationQuantityOnOrder;
    }

    public void setLocationQuantityOnOrder(SearchColumnDoubleField[] locationQuantityOnOrder) {
        this.locationQuantityOnOrder = locationQuantityOnOrder;
    }

    public SearchColumnDoubleField getLocationQuantityOnOrder(int i) {
        return this.locationQuantityOnOrder[i];
    }

    public void setLocationQuantityOnOrder(int i, SearchColumnDoubleField _value) {
        this.locationQuantityOnOrder[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationReOrderPoint() {
        return this.locationReOrderPoint;
    }

    public void setLocationReOrderPoint(SearchColumnDoubleField[] locationReOrderPoint) {
        this.locationReOrderPoint = locationReOrderPoint;
    }

    public SearchColumnDoubleField getLocationReOrderPoint(int i) {
        return this.locationReOrderPoint[i];
    }

    public void setLocationReOrderPoint(int i, SearchColumnDoubleField _value) {
        this.locationReOrderPoint[i] = _value;
    }

    public SearchColumnLongField[] getLocationRescheduleInDays() {
        return this.locationRescheduleInDays;
    }

    public void setLocationRescheduleInDays(SearchColumnLongField[] locationRescheduleInDays) {
        this.locationRescheduleInDays = locationRescheduleInDays;
    }

    public SearchColumnLongField getLocationRescheduleInDays(int i) {
        return this.locationRescheduleInDays[i];
    }

    public void setLocationRescheduleInDays(int i, SearchColumnLongField _value) {
        this.locationRescheduleInDays[i] = _value;
    }

    public SearchColumnLongField[] getLocationRescheduleOutDays() {
        return this.locationRescheduleOutDays;
    }

    public void setLocationRescheduleOutDays(SearchColumnLongField[] locationRescheduleOutDays) {
        this.locationRescheduleOutDays = locationRescheduleOutDays;
    }

    public SearchColumnLongField getLocationRescheduleOutDays(int i) {
        return this.locationRescheduleOutDays[i];
    }

    public void setLocationRescheduleOutDays(int i, SearchColumnLongField _value) {
        this.locationRescheduleOutDays[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationSafetyStockLevel() {
        return this.locationSafetyStockLevel;
    }

    public void setLocationSafetyStockLevel(SearchColumnDoubleField[] locationSafetyStockLevel) {
        this.locationSafetyStockLevel = locationSafetyStockLevel;
    }

    public SearchColumnDoubleField getLocationSafetyStockLevel(int i) {
        return this.locationSafetyStockLevel[i];
    }

    public void setLocationSafetyStockLevel(int i, SearchColumnDoubleField _value) {
        this.locationSafetyStockLevel[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationStorePickupBufferStock() {
        return this.locationStorePickupBufferStock;
    }

    public void setLocationStorePickupBufferStock(SearchColumnDoubleField[] locationStorePickupBufferStock) {
        this.locationStorePickupBufferStock = locationStorePickupBufferStock;
    }

    public SearchColumnDoubleField getLocationStorePickupBufferStock(int i) {
        return this.locationStorePickupBufferStock[i];
    }

    public void setLocationStorePickupBufferStock(int i, SearchColumnDoubleField _value) {
        this.locationStorePickupBufferStock[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLocationSupplyLotSizingMethod() {
        return this.locationSupplyLotSizingMethod;
    }

    public void setLocationSupplyLotSizingMethod(SearchColumnEnumSelectField[] locationSupplyLotSizingMethod) {
        this.locationSupplyLotSizingMethod = locationSupplyLotSizingMethod;
    }

    public SearchColumnEnumSelectField getLocationSupplyLotSizingMethod(int i) {
        return this.locationSupplyLotSizingMethod[i];
    }

    public void setLocationSupplyLotSizingMethod(int i, SearchColumnEnumSelectField _value) {
        this.locationSupplyLotSizingMethod[i] = _value;
    }

    public SearchColumnLongField[] getLocationSupplyTimeFence() {
        return this.locationSupplyTimeFence;
    }

    public void setLocationSupplyTimeFence(SearchColumnLongField[] locationSupplyTimeFence) {
        this.locationSupplyTimeFence = locationSupplyTimeFence;
    }

    public SearchColumnLongField getLocationSupplyTimeFence(int i) {
        return this.locationSupplyTimeFence[i];
    }

    public void setLocationSupplyTimeFence(int i, SearchColumnLongField _value) {
        this.locationSupplyTimeFence[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLocationSupplyType() {
        return this.locationSupplyType;
    }

    public void setLocationSupplyType(SearchColumnEnumSelectField[] locationSupplyType) {
        this.locationSupplyType = locationSupplyType;
    }

    public SearchColumnEnumSelectField getLocationSupplyType(int i) {
        return this.locationSupplyType[i];
    }

    public void setLocationSupplyType(int i, SearchColumnEnumSelectField _value) {
        this.locationSupplyType[i] = _value;
    }

    public SearchColumnDoubleField[] getLocationTotalValue() {
        return this.locationTotalValue;
    }

    public void setLocationTotalValue(SearchColumnDoubleField[] locationTotalValue) {
        this.locationTotalValue = locationTotalValue;
    }

    public SearchColumnDoubleField getLocationTotalValue(int i) {
        return this.locationTotalValue[i];
    }

    public void setLocationTotalValue(int i, SearchColumnDoubleField _value) {
        this.locationTotalValue[i] = _value;
    }

    public SearchColumnLongField[] getLocBackwardConsumptionDays() {
        return this.locBackwardConsumptionDays;
    }

    public void setLocBackwardConsumptionDays(SearchColumnLongField[] locBackwardConsumptionDays) {
        this.locBackwardConsumptionDays = locBackwardConsumptionDays;
    }

    public SearchColumnLongField getLocBackwardConsumptionDays(int i) {
        return this.locBackwardConsumptionDays[i];
    }

    public void setLocBackwardConsumptionDays(int i, SearchColumnLongField _value) {
        this.locBackwardConsumptionDays[i] = _value;
    }

    public SearchColumnLongField[] getLocForwardConsumptionDays() {
        return this.locForwardConsumptionDays;
    }

    public void setLocForwardConsumptionDays(SearchColumnLongField[] locForwardConsumptionDays) {
        this.locForwardConsumptionDays = locForwardConsumptionDays;
    }

    public SearchColumnLongField getLocForwardConsumptionDays(int i) {
        return this.locForwardConsumptionDays[i];
    }

    public void setLocForwardConsumptionDays(int i, SearchColumnLongField _value) {
        this.locForwardConsumptionDays[i] = _value;
    }

    public SearchColumnDoubleField[] getLowerWarningLimit() {
        return this.lowerWarningLimit;
    }

    public void setLowerWarningLimit(SearchColumnDoubleField[] lowerWarningLimit) {
        this.lowerWarningLimit = lowerWarningLimit;
    }

    public SearchColumnDoubleField getLowerWarningLimit(int i) {
        return this.lowerWarningLimit[i];
    }

    public void setLowerWarningLimit(int i, SearchColumnDoubleField _value) {
        this.lowerWarningLimit[i] = _value;
    }

    public SearchColumnStringField[] getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(SearchColumnStringField[] manufacturer) {
        this.manufacturer = manufacturer;
    }

    public SearchColumnStringField getManufacturer(int i) {
        return this.manufacturer[i];
    }

    public void setManufacturer(int i, SearchColumnStringField _value) {
        this.manufacturer[i] = _value;
    }

    public SearchColumnStringField[] getManufacturerAddr1() {
        return this.manufacturerAddr1;
    }

    public void setManufacturerAddr1(SearchColumnStringField[] manufacturerAddr1) {
        this.manufacturerAddr1 = manufacturerAddr1;
    }

    public SearchColumnStringField getManufacturerAddr1(int i) {
        return this.manufacturerAddr1[i];
    }

    public void setManufacturerAddr1(int i, SearchColumnStringField _value) {
        this.manufacturerAddr1[i] = _value;
    }

    public SearchColumnStringField[] getManufacturerCity() {
        return this.manufacturerCity;
    }

    public void setManufacturerCity(SearchColumnStringField[] manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }

    public SearchColumnStringField getManufacturerCity(int i) {
        return this.manufacturerCity[i];
    }

    public void setManufacturerCity(int i, SearchColumnStringField _value) {
        this.manufacturerCity[i] = _value;
    }

    public SearchColumnStringField[] getManufacturerState() {
        return this.manufacturerState;
    }

    public void setManufacturerState(SearchColumnStringField[] manufacturerState) {
        this.manufacturerState = manufacturerState;
    }

    public SearchColumnStringField getManufacturerState(int i) {
        return this.manufacturerState[i];
    }

    public void setManufacturerState(int i, SearchColumnStringField _value) {
        this.manufacturerState[i] = _value;
    }

    public SearchColumnStringField[] getManufacturerTariff() {
        return this.manufacturerTariff;
    }

    public void setManufacturerTariff(SearchColumnStringField[] manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }

    public SearchColumnStringField getManufacturerTariff(int i) {
        return this.manufacturerTariff[i];
    }

    public void setManufacturerTariff(int i, SearchColumnStringField _value) {
        this.manufacturerTariff[i] = _value;
    }

    public SearchColumnStringField[] getManufacturerTaxId() {
        return this.manufacturerTaxId;
    }

    public void setManufacturerTaxId(SearchColumnStringField[] manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }

    public SearchColumnStringField getManufacturerTaxId(int i) {
        return this.manufacturerTaxId[i];
    }

    public void setManufacturerTaxId(int i, SearchColumnStringField _value) {
        this.manufacturerTaxId[i] = _value;
    }

    public SearchColumnStringField[] getManufacturerZip() {
        return this.manufacturerZip;
    }

    public void setManufacturerZip(SearchColumnStringField[] manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }

    public SearchColumnStringField getManufacturerZip(int i) {
        return this.manufacturerZip[i];
    }

    public void setManufacturerZip(int i, SearchColumnStringField _value) {
        this.manufacturerZip[i] = _value;
    }

    public SearchColumnBooleanField[] getManufacturingChargeItem() {
        return this.manufacturingChargeItem;
    }

    public void setManufacturingChargeItem(SearchColumnBooleanField[] manufacturingChargeItem) {
        this.manufacturingChargeItem = manufacturingChargeItem;
    }

    public SearchColumnBooleanField getManufacturingChargeItem(int i) {
        return this.manufacturingChargeItem[i];
    }

    public void setManufacturingChargeItem(int i, SearchColumnBooleanField _value) {
        this.manufacturingChargeItem[i] = _value;
    }

    public SearchColumnBooleanField[] getMatchBillToReceipt() {
        return this.matchBillToReceipt;
    }

    public void setMatchBillToReceipt(SearchColumnBooleanField[] matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public SearchColumnBooleanField getMatchBillToReceipt(int i) {
        return this.matchBillToReceipt[i];
    }

    public void setMatchBillToReceipt(int i, SearchColumnBooleanField _value) {
        this.matchBillToReceipt[i] = _value;
    }

    public SearchColumnStringField[] getMaximumQuantity() {
        return this.maximumQuantity;
    }

    public void setMaximumQuantity(SearchColumnStringField[] maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public SearchColumnStringField getMaximumQuantity(int i) {
        return this.maximumQuantity[i];
    }

    public void setMaximumQuantity(int i, SearchColumnStringField _value) {
        this.maximumQuantity[i] = _value;
    }

    public SearchColumnSelectField[] getMemberItem() {
        return this.memberItem;
    }

    public void setMemberItem(SearchColumnSelectField[] memberItem) {
        this.memberItem = memberItem;
    }

    public SearchColumnSelectField getMemberItem(int i) {
        return this.memberItem[i];
    }

    public void setMemberItem(int i, SearchColumnSelectField _value) {
        this.memberItem[i] = _value;
    }

    public SearchColumnDoubleField[] getMemberQuantity() {
        return this.memberQuantity;
    }

    public void setMemberQuantity(SearchColumnDoubleField[] memberQuantity) {
        this.memberQuantity = memberQuantity;
    }

    public SearchColumnDoubleField getMemberQuantity(int i) {
        return this.memberQuantity[i];
    }

    public void setMemberQuantity(int i, SearchColumnDoubleField _value) {
        this.memberQuantity[i] = _value;
    }

    public SearchColumnStringField[] getMetaTagHtml() {
        return this.metaTagHtml;
    }

    public void setMetaTagHtml(SearchColumnStringField[] metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }

    public SearchColumnStringField getMetaTagHtml(int i) {
        return this.metaTagHtml[i];
    }

    public void setMetaTagHtml(int i, SearchColumnStringField _value) {
        this.metaTagHtml[i] = _value;
    }

    public SearchColumnStringField[] getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public void setMinimumQuantity(SearchColumnStringField[] minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public SearchColumnStringField getMinimumQuantity(int i) {
        return this.minimumQuantity[i];
    }

    public void setMinimumQuantity(int i, SearchColumnStringField _value) {
        this.minimumQuantity[i] = _value;
    }

    public SearchColumnDateField[] getModified() {
        return this.modified;
    }

    public void setModified(SearchColumnDateField[] modified) {
        this.modified = modified;
    }

    public SearchColumnDateField getModified(int i) {
        return this.modified[i];
    }

    public void setModified(int i, SearchColumnDateField _value) {
        this.modified[i] = _value;
    }

    public SearchColumnBooleanField[] getMossApplies() {
        return this.mossApplies;
    }

    public void setMossApplies(SearchColumnBooleanField[] mossApplies) {
        this.mossApplies = mossApplies;
    }

    public SearchColumnBooleanField getMossApplies(int i) {
        return this.mossApplies[i];
    }

    public void setMossApplies(int i, SearchColumnBooleanField _value) {
        this.mossApplies[i] = _value;
    }

    public SearchColumnStringField[] getMpn() {
        return this.mpn;
    }

    public void setMpn(SearchColumnStringField[] mpn) {
        this.mpn = mpn;
    }

    public SearchColumnStringField getMpn(int i) {
        return this.mpn[i];
    }

    public void setMpn(int i, SearchColumnStringField _value) {
        this.mpn[i] = _value;
    }

    public SearchColumnBooleanField[] getMultManufactureAddr() {
        return this.multManufactureAddr;
    }

    public void setMultManufactureAddr(SearchColumnBooleanField[] multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }

    public SearchColumnBooleanField getMultManufactureAddr(int i) {
        return this.multManufactureAddr[i];
    }

    public void setMultManufactureAddr(int i, SearchColumnBooleanField _value) {
        this.multManufactureAddr[i] = _value;
    }

    public SearchColumnStringField[] getNextagCategory() {
        return this.nextagCategory;
    }

    public void setNextagCategory(SearchColumnStringField[] nextagCategory) {
        this.nextagCategory = nextagCategory;
    }

    public SearchColumnStringField getNextagCategory(int i) {
        return this.nextagCategory[i];
    }

    public void setNextagCategory(int i, SearchColumnStringField _value) {
        this.nextagCategory[i] = _value;
    }

    public SearchColumnBooleanField[] getNextagProductFeed() {
        return this.nextagProductFeed;
    }

    public void setNextagProductFeed(SearchColumnBooleanField[] nextagProductFeed) {
        this.nextagProductFeed = nextagProductFeed;
    }

    public SearchColumnBooleanField getNextagProductFeed(int i) {
        return this.nextagProductFeed[i];
    }

    public void setNextagProductFeed(int i, SearchColumnBooleanField _value) {
        this.nextagProductFeed[i] = _value;
    }

    public SearchColumnDateField[] getNextInvtCountDate() {
        return this.nextInvtCountDate;
    }

    public void setNextInvtCountDate(SearchColumnDateField[] nextInvtCountDate) {
        this.nextInvtCountDate = nextInvtCountDate;
    }

    public SearchColumnDateField getNextInvtCountDate(int i) {
        return this.nextInvtCountDate[i];
    }

    public void setNextInvtCountDate(int i, SearchColumnDateField _value) {
        this.nextInvtCountDate[i] = _value;
    }

    public SearchColumnStringField[] getNoPriceMessage() {
        return this.noPriceMessage;
    }

    public void setNoPriceMessage(SearchColumnStringField[] noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }

    public SearchColumnStringField getNoPriceMessage(int i) {
        return this.noPriceMessage[i];
    }

    public void setNoPriceMessage(int i, SearchColumnStringField _value) {
        this.noPriceMessage[i] = _value;
    }

    public SearchColumnLongField[] getNumActiveListings() {
        return this.numActiveListings;
    }

    public void setNumActiveListings(SearchColumnLongField[] numActiveListings) {
        this.numActiveListings = numActiveListings;
    }

    public SearchColumnLongField getNumActiveListings(int i) {
        return this.numActiveListings[i];
    }

    public void setNumActiveListings(int i, SearchColumnLongField _value) {
        this.numActiveListings[i] = _value;
    }

    public SearchColumnStringField[] getNumberAllowedDownloads() {
        return this.numberAllowedDownloads;
    }

    public void setNumberAllowedDownloads(SearchColumnStringField[] numberAllowedDownloads) {
        this.numberAllowedDownloads = numberAllowedDownloads;
    }

    public SearchColumnStringField getNumberAllowedDownloads(int i) {
        return this.numberAllowedDownloads[i];
    }

    public void setNumberAllowedDownloads(int i, SearchColumnStringField _value) {
        this.numberAllowedDownloads[i] = _value;
    }

    public SearchColumnLongField[] getNumCurrentlyListed() {
        return this.numCurrentlyListed;
    }

    public void setNumCurrentlyListed(SearchColumnLongField[] numCurrentlyListed) {
        this.numCurrentlyListed = numCurrentlyListed;
    }

    public SearchColumnLongField getNumCurrentlyListed(int i) {
        return this.numCurrentlyListed[i];
    }

    public void setNumCurrentlyListed(int i, SearchColumnLongField _value) {
        this.numCurrentlyListed[i] = _value;
    }

    public SearchColumnDateField[] getObsoleteDate() {
        return this.obsoleteDate;
    }

    public void setObsoleteDate(SearchColumnDateField[] obsoleteDate) {
        this.obsoleteDate = obsoleteDate;
    }

    public SearchColumnDateField getObsoleteDate(int i) {
        return this.obsoleteDate[i];
    }

    public void setObsoleteDate(int i, SearchColumnDateField _value) {
        this.obsoleteDate[i] = _value;
    }

    public SearchColumnSelectField[] getObsoleteRevision() {
        return this.obsoleteRevision;
    }

    public void setObsoleteRevision(SearchColumnSelectField[] obsoleteRevision) {
        this.obsoleteRevision = obsoleteRevision;
    }

    public SearchColumnSelectField getObsoleteRevision(int i) {
        return this.obsoleteRevision[i];
    }

    public void setObsoleteRevision(int i, SearchColumnSelectField _value) {
        this.obsoleteRevision[i] = _value;
    }

    public SearchColumnBooleanField[] getOfferSupport() {
        return this.offerSupport;
    }

    public void setOfferSupport(SearchColumnBooleanField[] offerSupport) {
        this.offerSupport = offerSupport;
    }

    public SearchColumnBooleanField getOfferSupport(int i) {
        return this.offerSupport[i];
    }

    public void setOfferSupport(int i, SearchColumnBooleanField _value) {
        this.offerSupport[i] = _value;
    }

    public SearchColumnDoubleField[] getOnlineCustomerPrice() {
        return this.onlineCustomerPrice;
    }

    public void setOnlineCustomerPrice(SearchColumnDoubleField[] onlineCustomerPrice) {
        this.onlineCustomerPrice = onlineCustomerPrice;
    }

    public SearchColumnDoubleField getOnlineCustomerPrice(int i) {
        return this.onlineCustomerPrice[i];
    }

    public void setOnlineCustomerPrice(int i, SearchColumnDoubleField _value) {
        this.onlineCustomerPrice[i] = _value;
    }

    public SearchColumnDoubleField[] getOnlinePrice() {
        return this.onlinePrice;
    }

    public void setOnlinePrice(SearchColumnDoubleField[] onlinePrice) {
        this.onlinePrice = onlinePrice;
    }

    public SearchColumnDoubleField getOnlinePrice(int i) {
        return this.onlinePrice[i];
    }

    public void setOnlinePrice(int i, SearchColumnDoubleField _value) {
        this.onlinePrice[i] = _value;
    }

    public SearchColumnBooleanField[] getOnSpecial() {
        return this.onSpecial;
    }

    public void setOnSpecial(SearchColumnBooleanField[] onSpecial) {
        this.onSpecial = onSpecial;
    }

    public SearchColumnBooleanField getOnSpecial(int i) {
        return this.onSpecial[i];
    }

    public void setOnSpecial(int i, SearchColumnBooleanField _value) {
        this.onSpecial[i] = _value;
    }

    public SearchColumnDoubleField[] getOtherPrices() {
        return this.otherPrices;
    }

    public void setOtherPrices(SearchColumnDoubleField[] otherPrices) {
        this.otherPrices = otherPrices;
    }

    public SearchColumnDoubleField getOtherPrices(int i) {
        return this.otherPrices[i];
    }

    public void setOtherPrices(int i, SearchColumnDoubleField _value) {
        this.otherPrices[i] = _value;
    }

    public SearchColumnSelectField[] getOtherVendor() {
        return this.otherVendor;
    }

    public void setOtherVendor(SearchColumnSelectField[] otherVendor) {
        this.otherVendor = otherVendor;
    }

    public SearchColumnSelectField getOtherVendor(int i) {
        return this.otherVendor[i];
    }

    public void setOtherVendor(int i, SearchColumnSelectField _value) {
        this.otherVendor[i] = _value;
    }

    public SearchColumnStringField[] getOutOfStockBehavior() {
        return this.outOfStockBehavior;
    }

    public void setOutOfStockBehavior(SearchColumnStringField[] outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }

    public SearchColumnStringField getOutOfStockBehavior(int i) {
        return this.outOfStockBehavior[i];
    }

    public void setOutOfStockBehavior(int i, SearchColumnStringField _value) {
        this.outOfStockBehavior[i] = _value;
    }

    public SearchColumnStringField[] getOutOfStockMessage() {
        return this.outOfStockMessage;
    }

    public void setOutOfStockMessage(SearchColumnStringField[] outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }

    public SearchColumnStringField getOutOfStockMessage(int i) {
        return this.outOfStockMessage[i];
    }

    public void setOutOfStockMessage(int i, SearchColumnStringField _value) {
        this.outOfStockMessage[i] = _value;
    }

    public SearchColumnEnumSelectField[] getOverallQuantityPricingType() {
        return this.overallQuantityPricingType;
    }

    public void setOverallQuantityPricingType(SearchColumnEnumSelectField[] overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }

    public SearchColumnEnumSelectField getOverallQuantityPricingType(int i) {
        return this.overallQuantityPricingType[i];
    }

    public void setOverallQuantityPricingType(int i, SearchColumnEnumSelectField _value) {
        this.overallQuantityPricingType[i] = _value;
    }

    public SearchColumnEnumSelectField[] getOverheadType() {
        return this.overheadType;
    }

    public void setOverheadType(SearchColumnEnumSelectField[] overheadType) {
        this.overheadType = overheadType;
    }

    public SearchColumnEnumSelectField getOverheadType(int i) {
        return this.overheadType[i];
    }

    public void setOverheadType(int i, SearchColumnEnumSelectField _value) {
        this.overheadType[i] = _value;
    }

    public SearchColumnStringField[] getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(SearchColumnStringField[] pageTitle) {
        this.pageTitle = pageTitle;
    }

    public SearchColumnStringField getPageTitle(int i) {
        return this.pageTitle[i];
    }

    public void setPageTitle(int i, SearchColumnStringField _value) {
        this.pageTitle[i] = _value;
    }

    public SearchColumnSelectField[] getParent() {
        return this.parent;
    }

    public void setParent(SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }

    public SearchColumnLongField[] getPeriodicLotSizeDays() {
        return this.periodicLotSizeDays;
    }

    public void setPeriodicLotSizeDays(SearchColumnLongField[] periodicLotSizeDays) {
        this.periodicLotSizeDays = periodicLotSizeDays;
    }

    public SearchColumnLongField getPeriodicLotSizeDays(int i) {
        return this.periodicLotSizeDays[i];
    }

    public void setPeriodicLotSizeDays(int i, SearchColumnLongField _value) {
        this.periodicLotSizeDays[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPeriodicLotSizeType() {
        return this.periodicLotSizeType;
    }

    public void setPeriodicLotSizeType(SearchColumnEnumSelectField[] periodicLotSizeType) {
        this.periodicLotSizeType = periodicLotSizeType;
    }

    public SearchColumnEnumSelectField getPeriodicLotSizeType(int i) {
        return this.periodicLotSizeType[i];
    }

    public void setPeriodicLotSizeType(int i, SearchColumnEnumSelectField _value) {
        this.periodicLotSizeType[i] = _value;
    }

    public SearchColumnSelectField[] getPlanningItemCategory() {
        return this.planningItemCategory;
    }

    public void setPlanningItemCategory(SearchColumnSelectField[] planningItemCategory) {
        this.planningItemCategory = planningItemCategory;
    }

    public SearchColumnSelectField getPlanningItemCategory(int i) {
        return this.planningItemCategory[i];
    }

    public void setPlanningItemCategory(int i, SearchColumnSelectField _value) {
        this.planningItemCategory[i] = _value;
    }

    public SearchColumnStringField[] getPreferenceCriterion() {
        return this.preferenceCriterion;
    }

    public void setPreferenceCriterion(SearchColumnStringField[] preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }

    public SearchColumnStringField getPreferenceCriterion(int i) {
        return this.preferenceCriterion[i];
    }

    public void setPreferenceCriterion(int i, SearchColumnStringField _value) {
        this.preferenceCriterion[i] = _value;
    }

    public SearchColumnBooleanField[] getPreferredBin() {
        return this.preferredBin;
    }

    public void setPreferredBin(SearchColumnBooleanField[] preferredBin) {
        this.preferredBin = preferredBin;
    }

    public SearchColumnBooleanField getPreferredBin(int i) {
        return this.preferredBin[i];
    }

    public void setPreferredBin(int i, SearchColumnBooleanField _value) {
        this.preferredBin[i] = _value;
    }

    public SearchColumnSelectField[] getPreferredLocation() {
        return this.preferredLocation;
    }

    public void setPreferredLocation(SearchColumnSelectField[] preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public SearchColumnSelectField getPreferredLocation(int i) {
        return this.preferredLocation[i];
    }

    public void setPreferredLocation(int i, SearchColumnSelectField _value) {
        this.preferredLocation[i] = _value;
    }

    public SearchColumnDoubleField[] getPreferredStockLevel() {
        return this.preferredStockLevel;
    }

    public void setPreferredStockLevel(SearchColumnDoubleField[] preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }

    public SearchColumnDoubleField getPreferredStockLevel(int i) {
        return this.preferredStockLevel[i];
    }

    public void setPreferredStockLevel(int i, SearchColumnDoubleField _value) {
        this.preferredStockLevel[i] = _value;
    }

    public SearchColumnLongField[] getPreferredStockLevelDays() {
        return this.preferredStockLevelDays;
    }

    public void setPreferredStockLevelDays(SearchColumnLongField[] preferredStockLevelDays) {
        this.preferredStockLevelDays = preferredStockLevelDays;
    }

    public SearchColumnLongField getPreferredStockLevelDays(int i) {
        return this.preferredStockLevelDays[i];
    }

    public void setPreferredStockLevelDays(int i, SearchColumnLongField _value) {
        this.preferredStockLevelDays[i] = _value;
    }

    public SearchColumnBooleanField[] getPricesIncludeTax() {
        return this.pricesIncludeTax;
    }

    public void setPricesIncludeTax(SearchColumnBooleanField[] pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }

    public SearchColumnBooleanField getPricesIncludeTax(int i) {
        return this.pricesIncludeTax[i];
    }

    public void setPricesIncludeTax(int i, SearchColumnBooleanField _value) {
        this.pricesIncludeTax[i] = _value;
    }

    public SearchColumnSelectField[] getPricingGroup() {
        return this.pricingGroup;
    }

    public void setPricingGroup(SearchColumnSelectField[] pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public SearchColumnSelectField getPricingGroup(int i) {
        return this.pricingGroup[i];
    }

    public void setPricingGroup(int i, SearchColumnSelectField _value) {
        this.pricingGroup[i] = _value;
    }

    public SearchColumnStringField[] getPrimaryCategory() {
        return this.primaryCategory;
    }

    public void setPrimaryCategory(SearchColumnStringField[] primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public SearchColumnStringField getPrimaryCategory(int i) {
        return this.primaryCategory[i];
    }

    public void setPrimaryCategory(int i, SearchColumnStringField _value) {
        this.primaryCategory[i] = _value;
    }

    public SearchColumnSelectField[] getProdPriceVarianceAcct() {
        return this.prodPriceVarianceAcct;
    }

    public void setProdPriceVarianceAcct(SearchColumnSelectField[] prodPriceVarianceAcct) {
        this.prodPriceVarianceAcct = prodPriceVarianceAcct;
    }

    public SearchColumnSelectField getProdPriceVarianceAcct(int i) {
        return this.prodPriceVarianceAcct[i];
    }

    public void setProdPriceVarianceAcct(int i, SearchColumnSelectField _value) {
        this.prodPriceVarianceAcct[i] = _value;
    }

    public SearchColumnSelectField[] getProdQtyVarianceAcct() {
        return this.prodQtyVarianceAcct;
    }

    public void setProdQtyVarianceAcct(SearchColumnSelectField[] prodQtyVarianceAcct) {
        this.prodQtyVarianceAcct = prodQtyVarianceAcct;
    }

    public SearchColumnSelectField getProdQtyVarianceAcct(int i) {
        return this.prodQtyVarianceAcct[i];
    }

    public void setProdQtyVarianceAcct(int i, SearchColumnSelectField _value) {
        this.prodQtyVarianceAcct[i] = _value;
    }

    public SearchColumnStringField[] getPurchaseDescription() {
        return this.purchaseDescription;
    }

    public void setPurchaseDescription(SearchColumnStringField[] purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }

    public SearchColumnStringField getPurchaseDescription(int i) {
        return this.purchaseDescription[i];
    }

    public void setPurchaseDescription(int i, SearchColumnStringField _value) {
        this.purchaseDescription[i] = _value;
    }

    public SearchColumnDoubleField[] getPurchaseOrderAmount() {
        return this.purchaseOrderAmount;
    }

    public void setPurchaseOrderAmount(SearchColumnDoubleField[] purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public SearchColumnDoubleField getPurchaseOrderAmount(int i) {
        return this.purchaseOrderAmount[i];
    }

    public void setPurchaseOrderAmount(int i, SearchColumnDoubleField _value) {
        this.purchaseOrderAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getPurchaseOrderQuantity() {
        return this.purchaseOrderQuantity;
    }

    public void setPurchaseOrderQuantity(SearchColumnDoubleField[] purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public SearchColumnDoubleField getPurchaseOrderQuantity(int i) {
        return this.purchaseOrderQuantity[i];
    }

    public void setPurchaseOrderQuantity(int i, SearchColumnDoubleField _value) {
        this.purchaseOrderQuantity[i] = _value;
    }

    public SearchColumnDoubleField[] getPurchaseOrderQuantityDiff() {
        return this.purchaseOrderQuantityDiff;
    }

    public void setPurchaseOrderQuantityDiff(SearchColumnDoubleField[] purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public SearchColumnDoubleField getPurchaseOrderQuantityDiff(int i) {
        return this.purchaseOrderQuantityDiff[i];
    }

    public void setPurchaseOrderQuantityDiff(int i, SearchColumnDoubleField _value) {
        this.purchaseOrderQuantityDiff[i] = _value;
    }

    public SearchColumnSelectField[] getPurchasePriceVarianceAcct() {
        return this.purchasePriceVarianceAcct;
    }

    public void setPurchasePriceVarianceAcct(SearchColumnSelectField[] purchasePriceVarianceAcct) {
        this.purchasePriceVarianceAcct = purchasePriceVarianceAcct;
    }

    public SearchColumnSelectField getPurchasePriceVarianceAcct(int i) {
        return this.purchasePriceVarianceAcct[i];
    }

    public void setPurchasePriceVarianceAcct(int i, SearchColumnSelectField _value) {
        this.purchasePriceVarianceAcct[i] = _value;
    }

    public SearchColumnSelectField[] getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public void setPurchaseUnit(SearchColumnSelectField[] purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public SearchColumnSelectField getPurchaseUnit(int i) {
        return this.purchaseUnit[i];
    }

    public void setPurchaseUnit(int i, SearchColumnSelectField _value) {
        this.purchaseUnit[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityAvailable() {
        return this.quantityAvailable;
    }

    public void setQuantityAvailable(SearchColumnDoubleField[] quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public SearchColumnDoubleField getQuantityAvailable(int i) {
        return this.quantityAvailable[i];
    }

    public void setQuantityAvailable(int i, SearchColumnDoubleField _value) {
        this.quantityAvailable[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityBackOrdered() {
        return this.quantityBackOrdered;
    }

    public void setQuantityBackOrdered(SearchColumnDoubleField[] quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }

    public SearchColumnDoubleField getQuantityBackOrdered(int i) {
        return this.quantityBackOrdered[i];
    }

    public void setQuantityBackOrdered(int i, SearchColumnDoubleField _value) {
        this.quantityBackOrdered[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityCommitted() {
        return this.quantityCommitted;
    }

    public void setQuantityCommitted(SearchColumnDoubleField[] quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public SearchColumnDoubleField getQuantityCommitted(int i) {
        return this.quantityCommitted[i];
    }

    public void setQuantityCommitted(int i, SearchColumnDoubleField _value) {
        this.quantityCommitted[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(SearchColumnDoubleField[] quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public SearchColumnDoubleField getQuantityOnHand(int i) {
        return this.quantityOnHand[i];
    }

    public void setQuantityOnHand(int i, SearchColumnDoubleField _value) {
        this.quantityOnHand[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityOnOrder() {
        return this.quantityOnOrder;
    }

    public void setQuantityOnOrder(SearchColumnDoubleField[] quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }

    public SearchColumnDoubleField getQuantityOnOrder(int i) {
        return this.quantityOnOrder[i];
    }

    public void setQuantityOnOrder(int i, SearchColumnDoubleField _value) {
        this.quantityOnOrder[i] = _value;
    }

    public SearchColumnSelectField[] getQuantityPricingSchedule() {
        return this.quantityPricingSchedule;
    }

    public void setQuantityPricingSchedule(SearchColumnSelectField[] quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }

    public SearchColumnSelectField getQuantityPricingSchedule(int i) {
        return this.quantityPricingSchedule[i];
    }

    public void setQuantityPricingSchedule(int i, SearchColumnSelectField _value) {
        this.quantityPricingSchedule[i] = _value;
    }

    public SearchColumnDoubleField[] getReceiptAmount() {
        return this.receiptAmount;
    }

    public void setReceiptAmount(SearchColumnDoubleField[] receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public SearchColumnDoubleField getReceiptAmount(int i) {
        return this.receiptAmount[i];
    }

    public void setReceiptAmount(int i, SearchColumnDoubleField _value) {
        this.receiptAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getReceiptQuantity() {
        return this.receiptQuantity;
    }

    public void setReceiptQuantity(SearchColumnDoubleField[] receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public SearchColumnDoubleField getReceiptQuantity(int i) {
        return this.receiptQuantity[i];
    }

    public void setReceiptQuantity(int i, SearchColumnDoubleField _value) {
        this.receiptQuantity[i] = _value;
    }

    public SearchColumnDoubleField[] getReceiptQuantityDiff() {
        return this.receiptQuantityDiff;
    }

    public void setReceiptQuantityDiff(SearchColumnDoubleField[] receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public SearchColumnDoubleField getReceiptQuantityDiff(int i) {
        return this.receiptQuantityDiff[i];
    }

    public void setReceiptQuantityDiff(int i, SearchColumnDoubleField _value) {
        this.receiptQuantityDiff[i] = _value;
    }

    public SearchColumnLongField[] getReorderMultiple() {
        return this.reorderMultiple;
    }

    public void setReorderMultiple(SearchColumnLongField[] reorderMultiple) {
        this.reorderMultiple = reorderMultiple;
    }

    public SearchColumnLongField getReorderMultiple(int i) {
        return this.reorderMultiple[i];
    }

    public void setReorderMultiple(int i, SearchColumnLongField _value) {
        this.reorderMultiple[i] = _value;
    }

    public SearchColumnDoubleField[] getReOrderPoint() {
        return this.reOrderPoint;
    }

    public void setReOrderPoint(SearchColumnDoubleField[] reOrderPoint) {
        this.reOrderPoint = reOrderPoint;
    }

    public SearchColumnDoubleField getReOrderPoint(int i) {
        return this.reOrderPoint[i];
    }

    public void setReOrderPoint(int i, SearchColumnDoubleField _value) {
        this.reOrderPoint[i] = _value;
    }

    public SearchColumnLongField[] getRescheduleInDays() {
        return this.rescheduleInDays;
    }

    public void setRescheduleInDays(SearchColumnLongField[] rescheduleInDays) {
        this.rescheduleInDays = rescheduleInDays;
    }

    public SearchColumnLongField getRescheduleInDays(int i) {
        return this.rescheduleInDays[i];
    }

    public void setRescheduleInDays(int i, SearchColumnLongField _value) {
        this.rescheduleInDays[i] = _value;
    }

    public SearchColumnLongField[] getRescheduleOutDays() {
        return this.rescheduleOutDays;
    }

    public void setRescheduleOutDays(SearchColumnLongField[] rescheduleOutDays) {
        this.rescheduleOutDays = rescheduleOutDays;
    }

    public SearchColumnLongField getRescheduleOutDays(int i) {
        return this.rescheduleOutDays[i];
    }

    public void setRescheduleOutDays(int i, SearchColumnLongField _value) {
        this.rescheduleOutDays[i] = _value;
    }

    public SearchColumnDoubleField[] getReservePrice() {
        return this.reservePrice;
    }

    public void setReservePrice(SearchColumnDoubleField[] reservePrice) {
        this.reservePrice = reservePrice;
    }

    public SearchColumnDoubleField getReservePrice(int i) {
        return this.reservePrice[i];
    }

    public void setReservePrice(int i, SearchColumnDoubleField _value) {
        this.reservePrice[i] = _value;
    }

    public SearchColumnSelectField[] getRevenueAllocationGroup() {
        return this.revenueAllocationGroup;
    }

    public void setRevenueAllocationGroup(SearchColumnSelectField[] revenueAllocationGroup) {
        this.revenueAllocationGroup = revenueAllocationGroup;
    }

    public SearchColumnSelectField getRevenueAllocationGroup(int i) {
        return this.revenueAllocationGroup[i];
    }

    public void setRevenueAllocationGroup(int i, SearchColumnSelectField _value) {
        this.revenueAllocationGroup[i] = _value;
    }

    public SearchColumnSelectField[] getRevenueRecognitionRule() {
        return this.revenueRecognitionRule;
    }

    public void setRevenueRecognitionRule(SearchColumnSelectField[] revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }

    public SearchColumnSelectField getRevenueRecognitionRule(int i) {
        return this.revenueRecognitionRule[i];
    }

    public void setRevenueRecognitionRule(int i, SearchColumnSelectField _value) {
        this.revenueRecognitionRule[i] = _value;
    }

    public SearchColumnSelectField[] getRevRecForecastRule() {
        return this.revRecForecastRule;
    }

    public void setRevRecForecastRule(SearchColumnSelectField[] revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }

    public SearchColumnSelectField getRevRecForecastRule(int i) {
        return this.revRecForecastRule[i];
    }

    public void setRevRecForecastRule(int i, SearchColumnSelectField _value) {
        this.revRecForecastRule[i] = _value;
    }

    public SearchColumnSelectField[] getRevReclassFXAccount() {
        return this.revReclassFXAccount;
    }

    public void setRevReclassFXAccount(SearchColumnSelectField[] revReclassFXAccount) {
        this.revReclassFXAccount = revReclassFXAccount;
    }

    public SearchColumnSelectField getRevReclassFXAccount(int i) {
        return this.revReclassFXAccount[i];
    }

    public void setRevReclassFXAccount(int i, SearchColumnSelectField _value) {
        this.revReclassFXAccount[i] = _value;
    }

    public SearchColumnSelectField[] getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(SearchColumnSelectField[] revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public SearchColumnSelectField getRevRecSchedule(int i) {
        return this.revRecSchedule[i];
    }

    public void setRevRecSchedule(int i, SearchColumnSelectField _value) {
        this.revRecSchedule[i] = _value;
    }

    public SearchColumnBooleanField[] getRoundUpAsComponent() {
        return this.roundUpAsComponent;
    }

    public void setRoundUpAsComponent(SearchColumnBooleanField[] roundUpAsComponent) {
        this.roundUpAsComponent = roundUpAsComponent;
    }

    public SearchColumnBooleanField getRoundUpAsComponent(int i) {
        return this.roundUpAsComponent[i];
    }

    public void setRoundUpAsComponent(int i, SearchColumnBooleanField _value) {
        this.roundUpAsComponent[i] = _value;
    }

    public SearchColumnDoubleField[] getSafetyStockLevel() {
        return this.safetyStockLevel;
    }

    public void setSafetyStockLevel(SearchColumnDoubleField[] safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public SearchColumnDoubleField getSafetyStockLevel(int i) {
        return this.safetyStockLevel[i];
    }

    public void setSafetyStockLevel(int i, SearchColumnDoubleField _value) {
        this.safetyStockLevel[i] = _value;
    }

    public SearchColumnLongField[] getSafetyStockLevelDays() {
        return this.safetyStockLevelDays;
    }

    public void setSafetyStockLevelDays(SearchColumnLongField[] safetyStockLevelDays) {
        this.safetyStockLevelDays = safetyStockLevelDays;
    }

    public SearchColumnLongField getSafetyStockLevelDays(int i) {
        return this.safetyStockLevelDays[i];
    }

    public void setSafetyStockLevelDays(int i, SearchColumnLongField _value) {
        this.safetyStockLevelDays[i] = _value;
    }

    public SearchColumnStringField[] getSalesDescription() {
        return this.salesDescription;
    }

    public void setSalesDescription(SearchColumnStringField[] salesDescription) {
        this.salesDescription = salesDescription;
    }

    public SearchColumnStringField getSalesDescription(int i) {
        return this.salesDescription[i];
    }

    public void setSalesDescription(int i, SearchColumnStringField _value) {
        this.salesDescription[i] = _value;
    }

    public SearchColumnSelectField[] getSalesTaxCode() {
        return this.salesTaxCode;
    }

    public void setSalesTaxCode(SearchColumnSelectField[] salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }

    public SearchColumnSelectField getSalesTaxCode(int i) {
        return this.salesTaxCode[i];
    }

    public void setSalesTaxCode(int i, SearchColumnSelectField _value) {
        this.salesTaxCode[i] = _value;
    }

    public SearchColumnSelectField[] getSaleUnit() {
        return this.saleUnit;
    }

    public void setSaleUnit(SearchColumnSelectField[] saleUnit) {
        this.saleUnit = saleUnit;
    }

    public SearchColumnSelectField getSaleUnit(int i) {
        return this.saleUnit[i];
    }

    public void setSaleUnit(int i, SearchColumnSelectField _value) {
        this.saleUnit[i] = _value;
    }

    public SearchColumnBooleanField[] getSameAsPrimaryBookAmortization() {
        return this.sameAsPrimaryBookAmortization;
    }

    public void setSameAsPrimaryBookAmortization(SearchColumnBooleanField[] sameAsPrimaryBookAmortization) {
        this.sameAsPrimaryBookAmortization = sameAsPrimaryBookAmortization;
    }

    public SearchColumnBooleanField getSameAsPrimaryBookAmortization(int i) {
        return this.sameAsPrimaryBookAmortization[i];
    }

    public void setSameAsPrimaryBookAmortization(int i, SearchColumnBooleanField _value) {
        this.sameAsPrimaryBookAmortization[i] = _value;
    }

    public SearchColumnBooleanField[] getSameAsPrimaryBookRevRec() {
        return this.sameAsPrimaryBookRevRec;
    }

    public void setSameAsPrimaryBookRevRec(SearchColumnBooleanField[] sameAsPrimaryBookRevRec) {
        this.sameAsPrimaryBookRevRec = sameAsPrimaryBookRevRec;
    }

    public SearchColumnBooleanField getSameAsPrimaryBookRevRec(int i) {
        return this.sameAsPrimaryBookRevRec[i];
    }

    public void setSameAsPrimaryBookRevRec(int i, SearchColumnBooleanField _value) {
        this.sameAsPrimaryBookRevRec[i] = _value;
    }

    public SearchColumnEnumSelectField[] getScheduleBCode() {
        return this.scheduleBCode;
    }

    public void setScheduleBCode(SearchColumnEnumSelectField[] scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }

    public SearchColumnEnumSelectField getScheduleBCode(int i) {
        return this.scheduleBCode[i];
    }

    public void setScheduleBCode(int i, SearchColumnEnumSelectField _value) {
        this.scheduleBCode[i] = _value;
    }

    public SearchColumnStringField[] getScheduleBNumber() {
        return this.scheduleBNumber;
    }

    public void setScheduleBNumber(SearchColumnStringField[] scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }

    public SearchColumnStringField getScheduleBNumber(int i) {
        return this.scheduleBNumber[i];
    }

    public void setScheduleBNumber(int i, SearchColumnStringField _value) {
        this.scheduleBNumber[i] = _value;
    }

    public SearchColumnStringField[] getScheduleBQuantity() {
        return this.scheduleBQuantity;
    }

    public void setScheduleBQuantity(SearchColumnStringField[] scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }

    public SearchColumnStringField getScheduleBQuantity(int i) {
        return this.scheduleBQuantity[i];
    }

    public void setScheduleBQuantity(int i, SearchColumnStringField _value) {
        this.scheduleBQuantity[i] = _value;
    }

    public SearchColumnSelectField[] getScrapAcct() {
        return this.scrapAcct;
    }

    public void setScrapAcct(SearchColumnSelectField[] scrapAcct) {
        this.scrapAcct = scrapAcct;
    }

    public SearchColumnSelectField getScrapAcct(int i) {
        return this.scrapAcct[i];
    }

    public void setScrapAcct(int i, SearchColumnSelectField _value) {
        this.scrapAcct[i] = _value;
    }

    public SearchColumnStringField[] getSearchKeywords() {
        return this.searchKeywords;
    }

    public void setSearchKeywords(SearchColumnStringField[] searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public SearchColumnStringField getSearchKeywords(int i) {
        return this.searchKeywords[i];
    }

    public void setSearchKeywords(int i, SearchColumnStringField _value) {
        this.searchKeywords[i] = _value;
    }

    public SearchColumnBooleanField[] getSeasonalDemand() {
        return this.seasonalDemand;
    }

    public void setSeasonalDemand(SearchColumnBooleanField[] seasonalDemand) {
        this.seasonalDemand = seasonalDemand;
    }

    public SearchColumnBooleanField getSeasonalDemand(int i) {
        return this.seasonalDemand[i];
    }

    public void setSeasonalDemand(int i, SearchColumnBooleanField _value) {
        this.seasonalDemand[i] = _value;
    }

    public SearchColumnSelectField[] getSecondaryConsumptionUnit() {
        return this.secondaryConsumptionUnit;
    }

    public void setSecondaryConsumptionUnit(SearchColumnSelectField[] secondaryConsumptionUnit) {
        this.secondaryConsumptionUnit = secondaryConsumptionUnit;
    }

    public SearchColumnSelectField getSecondaryConsumptionUnit(int i) {
        return this.secondaryConsumptionUnit[i];
    }

    public void setSecondaryConsumptionUnit(int i, SearchColumnSelectField _value) {
        this.secondaryConsumptionUnit[i] = _value;
    }

    public SearchColumnSelectField[] getSecondaryPurchaseUnit() {
        return this.secondaryPurchaseUnit;
    }

    public void setSecondaryPurchaseUnit(SearchColumnSelectField[] secondaryPurchaseUnit) {
        this.secondaryPurchaseUnit = secondaryPurchaseUnit;
    }

    public SearchColumnSelectField getSecondaryPurchaseUnit(int i) {
        return this.secondaryPurchaseUnit[i];
    }

    public void setSecondaryPurchaseUnit(int i, SearchColumnSelectField _value) {
        this.secondaryPurchaseUnit[i] = _value;
    }

    public SearchColumnSelectField[] getSecondarySaleUnit() {
        return this.secondarySaleUnit;
    }

    public void setSecondarySaleUnit(SearchColumnSelectField[] secondarySaleUnit) {
        this.secondarySaleUnit = secondarySaleUnit;
    }

    public SearchColumnSelectField getSecondarySaleUnit(int i) {
        return this.secondarySaleUnit[i];
    }

    public void setSecondarySaleUnit(int i, SearchColumnSelectField _value) {
        this.secondarySaleUnit[i] = _value;
    }

    public SearchColumnSelectField[] getSecondaryStockUnit() {
        return this.secondaryStockUnit;
    }

    public void setSecondaryStockUnit(SearchColumnSelectField[] secondaryStockUnit) {
        this.secondaryStockUnit = secondaryStockUnit;
    }

    public SearchColumnSelectField getSecondaryStockUnit(int i) {
        return this.secondaryStockUnit[i];
    }

    public void setSecondaryStockUnit(int i, SearchColumnSelectField _value) {
        this.secondaryStockUnit[i] = _value;
    }

    public SearchColumnSelectField[] getSecondaryUnitsType() {
        return this.secondaryUnitsType;
    }

    public void setSecondaryUnitsType(SearchColumnSelectField[] secondaryUnitsType) {
        this.secondaryUnitsType = secondaryUnitsType;
    }

    public SearchColumnSelectField getSecondaryUnitsType(int i) {
        return this.secondaryUnitsType[i];
    }

    public void setSecondaryUnitsType(int i, SearchColumnSelectField _value) {
        this.secondaryUnitsType[i] = _value;
    }

    public SearchColumnBooleanField[] getSellOnEBay() {
        return this.sellOnEBay;
    }

    public void setSellOnEBay(SearchColumnBooleanField[] sellOnEBay) {
        this.sellOnEBay = sellOnEBay;
    }

    public SearchColumnBooleanField getSellOnEBay(int i) {
        return this.sellOnEBay[i];
    }

    public void setSellOnEBay(int i, SearchColumnBooleanField _value) {
        this.sellOnEBay[i] = _value;
    }

    public SearchColumnStringField[] getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }

    public SearchColumnStringField[] getSerialNumberLocation() {
        return this.serialNumberLocation;
    }

    public void setSerialNumberLocation(SearchColumnStringField[] serialNumberLocation) {
        this.serialNumberLocation = serialNumberLocation;
    }

    public SearchColumnStringField getSerialNumberLocation(int i) {
        return this.serialNumberLocation[i];
    }

    public void setSerialNumberLocation(int i, SearchColumnStringField _value) {
        this.serialNumberLocation[i] = _value;
    }

    public SearchColumnBooleanField[] getShipIndividually() {
        return this.shipIndividually;
    }

    public void setShipIndividually(SearchColumnBooleanField[] shipIndividually) {
        this.shipIndividually = shipIndividually;
    }

    public SearchColumnBooleanField getShipIndividually(int i) {
        return this.shipIndividually[i];
    }

    public void setShipIndividually(int i, SearchColumnBooleanField _value) {
        this.shipIndividually[i] = _value;
    }

    public SearchColumnSelectField[] getShipPackage() {
        return this.shipPackage;
    }

    public void setShipPackage(SearchColumnSelectField[] shipPackage) {
        this.shipPackage = shipPackage;
    }

    public SearchColumnSelectField getShipPackage(int i) {
        return this.shipPackage[i];
    }

    public void setShipPackage(int i, SearchColumnSelectField _value) {
        this.shipPackage[i] = _value;
    }

    public SearchColumnEnumSelectField[] getShippingCarrier() {
        return this.shippingCarrier;
    }

    public void setShippingCarrier(SearchColumnEnumSelectField[] shippingCarrier) {
        this.shippingCarrier = shippingCarrier;
    }

    public SearchColumnEnumSelectField getShippingCarrier(int i) {
        return this.shippingCarrier[i];
    }

    public void setShippingCarrier(int i, SearchColumnEnumSelectField _value) {
        this.shippingCarrier[i] = _value;
    }

    public SearchColumnDoubleField[] getShippingRate() {
        return this.shippingRate;
    }

    public void setShippingRate(SearchColumnDoubleField[] shippingRate) {
        this.shippingRate = shippingRate;
    }

    public SearchColumnDoubleField getShippingRate(int i) {
        return this.shippingRate[i];
    }

    public void setShippingRate(int i, SearchColumnDoubleField _value) {
        this.shippingRate[i] = _value;
    }

    public SearchColumnStringField[] getShoppingDotComCategory() {
        return this.shoppingDotComCategory;
    }

    public void setShoppingDotComCategory(SearchColumnStringField[] shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }

    public SearchColumnStringField getShoppingDotComCategory(int i) {
        return this.shoppingDotComCategory[i];
    }

    public void setShoppingDotComCategory(int i, SearchColumnStringField _value) {
        this.shoppingDotComCategory[i] = _value;
    }

    public SearchColumnBooleanField[] getShoppingProductFeed() {
        return this.shoppingProductFeed;
    }

    public void setShoppingProductFeed(SearchColumnBooleanField[] shoppingProductFeed) {
        this.shoppingProductFeed = shoppingProductFeed;
    }

    public SearchColumnBooleanField getShoppingProductFeed(int i) {
        return this.shoppingProductFeed[i];
    }

    public void setShoppingProductFeed(int i, SearchColumnBooleanField _value) {
        this.shoppingProductFeed[i] = _value;
    }

    public SearchColumnLongField[] getShopzillaCategoryId() {
        return this.shopzillaCategoryId;
    }

    public void setShopzillaCategoryId(SearchColumnLongField[] shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }

    public SearchColumnLongField getShopzillaCategoryId(int i) {
        return this.shopzillaCategoryId[i];
    }

    public void setShopzillaCategoryId(int i, SearchColumnLongField _value) {
        this.shopzillaCategoryId[i] = _value;
    }

    public SearchColumnBooleanField[] getShopzillaProductFeed() {
        return this.shopzillaProductFeed;
    }

    public void setShopzillaProductFeed(SearchColumnBooleanField[] shopzillaProductFeed) {
        this.shopzillaProductFeed = shopzillaProductFeed;
    }

    public SearchColumnBooleanField getShopzillaProductFeed(int i) {
        return this.shopzillaProductFeed[i];
    }

    public void setShopzillaProductFeed(int i, SearchColumnBooleanField _value) {
        this.shopzillaProductFeed[i] = _value;
    }

    public SearchColumnEnumSelectField[] getSitemapPriority() {
        return this.sitemapPriority;
    }

    public void setSitemapPriority(SearchColumnEnumSelectField[] sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }

    public SearchColumnEnumSelectField getSitemapPriority(int i) {
        return this.sitemapPriority[i];
    }

    public void setSitemapPriority(int i, SearchColumnEnumSelectField _value) {
        this.sitemapPriority[i] = _value;
    }

    public SearchColumnSelectField[] getSoftDescriptor() {
        return this.softDescriptor;
    }

    public void setSoftDescriptor(SearchColumnSelectField[] softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public SearchColumnSelectField getSoftDescriptor(int i) {
        return this.softDescriptor[i];
    }

    public void setSoftDescriptor(int i, SearchColumnSelectField _value) {
        this.softDescriptor[i] = _value;
    }

    public SearchColumnDoubleField[] getStartingPrice() {
        return this.startingPrice;
    }

    public void setStartingPrice(SearchColumnDoubleField[] startingPrice) {
        this.startingPrice = startingPrice;
    }

    public SearchColumnDoubleField getStartingPrice(int i) {
        return this.startingPrice[i];
    }

    public void setStartingPrice(int i, SearchColumnDoubleField _value) {
        this.startingPrice[i] = _value;
    }

    public SearchColumnStringField[] getStockDescription() {
        return this.stockDescription;
    }

    public void setStockDescription(SearchColumnStringField[] stockDescription) {
        this.stockDescription = stockDescription;
    }

    public SearchColumnStringField getStockDescription(int i) {
        return this.stockDescription[i];
    }

    public void setStockDescription(int i, SearchColumnStringField _value) {
        this.stockDescription[i] = _value;
    }

    public SearchColumnSelectField[] getStockUnit() {
        return this.stockUnit;
    }

    public void setStockUnit(SearchColumnSelectField[] stockUnit) {
        this.stockUnit = stockUnit;
    }

    public SearchColumnSelectField getStockUnit(int i) {
        return this.stockUnit[i];
    }

    public void setStockUnit(int i, SearchColumnSelectField _value) {
        this.stockUnit[i] = _value;
    }

    public SearchColumnStringField[] getStoreDescription() {
        return this.storeDescription;
    }

    public void setStoreDescription(SearchColumnStringField[] storeDescription) {
        this.storeDescription = storeDescription;
    }

    public SearchColumnStringField getStoreDescription(int i) {
        return this.storeDescription[i];
    }

    public void setStoreDescription(int i, SearchColumnStringField _value) {
        this.storeDescription[i] = _value;
    }

    public SearchColumnStringField[] getStoreDetailedDescription() {
        return this.storeDetailedDescription;
    }

    public void setStoreDetailedDescription(SearchColumnStringField[] storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }

    public SearchColumnStringField getStoreDetailedDescription(int i) {
        return this.storeDetailedDescription[i];
    }

    public void setStoreDetailedDescription(int i, SearchColumnStringField _value) {
        this.storeDetailedDescription[i] = _value;
    }

    public SearchColumnSelectField[] getStoreDisplayImage() {
        return this.storeDisplayImage;
    }

    public void setStoreDisplayImage(SearchColumnSelectField[] storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }

    public SearchColumnSelectField getStoreDisplayImage(int i) {
        return this.storeDisplayImage[i];
    }

    public void setStoreDisplayImage(int i, SearchColumnSelectField _value) {
        this.storeDisplayImage[i] = _value;
    }

    public SearchColumnStringField[] getStoreDisplayName() {
        return this.storeDisplayName;
    }

    public void setStoreDisplayName(SearchColumnStringField[] storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }

    public SearchColumnStringField getStoreDisplayName(int i) {
        return this.storeDisplayName[i];
    }

    public void setStoreDisplayName(int i, SearchColumnStringField _value) {
        this.storeDisplayName[i] = _value;
    }

    public SearchColumnSelectField[] getStoreDisplayThumbnail() {
        return this.storeDisplayThumbnail;
    }

    public void setStoreDisplayThumbnail(SearchColumnSelectField[] storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }

    public SearchColumnSelectField getStoreDisplayThumbnail(int i) {
        return this.storeDisplayThumbnail[i];
    }

    public void setStoreDisplayThumbnail(int i, SearchColumnSelectField _value) {
        this.storeDisplayThumbnail[i] = _value;
    }

    public SearchColumnSelectField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnEnumSelectField[] getSubType() {
        return this.subType;
    }

    public void setSubType(SearchColumnEnumSelectField[] subType) {
        this.subType = subType;
    }

    public SearchColumnEnumSelectField getSubType(int i) {
        return this.subType[i];
    }

    public void setSubType(int i, SearchColumnEnumSelectField _value) {
        this.subType[i] = _value;
    }

    public SearchColumnEnumSelectField[] getSupplyLotSizingMethod() {
        return this.supplyLotSizingMethod;
    }

    public void setSupplyLotSizingMethod(SearchColumnEnumSelectField[] supplyLotSizingMethod) {
        this.supplyLotSizingMethod = supplyLotSizingMethod;
    }

    public SearchColumnEnumSelectField getSupplyLotSizingMethod(int i) {
        return this.supplyLotSizingMethod[i];
    }

    public void setSupplyLotSizingMethod(int i, SearchColumnEnumSelectField _value) {
        this.supplyLotSizingMethod[i] = _value;
    }

    public SearchColumnEnumSelectField[] getSupplyReplenishmentMethod() {
        return this.supplyReplenishmentMethod;
    }

    public void setSupplyReplenishmentMethod(SearchColumnEnumSelectField[] supplyReplenishmentMethod) {
        this.supplyReplenishmentMethod = supplyReplenishmentMethod;
    }

    public SearchColumnEnumSelectField getSupplyReplenishmentMethod(int i) {
        return this.supplyReplenishmentMethod[i];
    }

    public void setSupplyReplenishmentMethod(int i, SearchColumnEnumSelectField _value) {
        this.supplyReplenishmentMethod[i] = _value;
    }

    public SearchColumnLongField[] getSupplyTimeFence() {
        return this.supplyTimeFence;
    }

    public void setSupplyTimeFence(SearchColumnLongField[] supplyTimeFence) {
        this.supplyTimeFence = supplyTimeFence;
    }

    public SearchColumnLongField getSupplyTimeFence(int i) {
        return this.supplyTimeFence[i];
    }

    public void setSupplyTimeFence(int i, SearchColumnLongField _value) {
        this.supplyTimeFence[i] = _value;
    }

    public SearchColumnEnumSelectField[] getSupplyType() {
        return this.supplyType;
    }

    public void setSupplyType(SearchColumnEnumSelectField[] supplyType) {
        this.supplyType = supplyType;
    }

    public SearchColumnEnumSelectField getSupplyType(int i) {
        return this.supplyType[i];
    }

    public void setSupplyType(int i, SearchColumnEnumSelectField _value) {
        this.supplyType[i] = _value;
    }

    public SearchColumnSelectField[] getTaxSchedule() {
        return this.taxSchedule;
    }

    public void setTaxSchedule(SearchColumnSelectField[] taxSchedule) {
        this.taxSchedule = taxSchedule;
    }

    public SearchColumnSelectField getTaxSchedule(int i) {
        return this.taxSchedule[i];
    }

    public void setTaxSchedule(int i, SearchColumnSelectField _value) {
        this.taxSchedule[i] = _value;
    }

    public SearchColumnStringField[] getThumbNailUrl() {
        return this.thumbNailUrl;
    }

    public void setThumbNailUrl(SearchColumnStringField[] thumbNailUrl) {
        this.thumbNailUrl = thumbNailUrl;
    }

    public SearchColumnStringField getThumbNailUrl(int i) {
        return this.thumbNailUrl[i];
    }

    public void setThumbNailUrl(int i, SearchColumnStringField _value) {
        this.thumbNailUrl[i] = _value;
    }

    public SearchColumnDoubleField[] getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(SearchColumnDoubleField[] totalValue) {
        this.totalValue = totalValue;
    }

    public SearchColumnDoubleField getTotalValue(int i) {
        return this.totalValue[i];
    }

    public void setTotalValue(int i, SearchColumnDoubleField _value) {
        this.totalValue[i] = _value;
    }

    public SearchColumnBooleanField[] getTrackLandedCost() {
        return this.trackLandedCost;
    }

    public void setTrackLandedCost(SearchColumnBooleanField[] trackLandedCost) {
        this.trackLandedCost = trackLandedCost;
    }

    public SearchColumnBooleanField getTrackLandedCost(int i) {
        return this.trackLandedCost[i];
    }

    public void setTrackLandedCost(int i, SearchColumnBooleanField _value) {
        this.trackLandedCost[i] = _value;
    }

    public SearchColumnDoubleField[] getTransferPrice() {
        return this.transferPrice;
    }

    public void setTransferPrice(SearchColumnDoubleField[] transferPrice) {
        this.transferPrice = transferPrice;
    }

    public SearchColumnDoubleField getTransferPrice(int i) {
        return this.transferPrice[i];
    }

    public void setTransferPrice(int i, SearchColumnDoubleField _value) {
        this.transferPrice[i] = _value;
    }

    public SearchColumnEnumSelectField[] getType() {
        return this.type;
    }

    public void setType(SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }

    public SearchColumnSelectField[] getUnbuildVarianceAccount() {
        return this.unbuildVarianceAccount;
    }

    public void setUnbuildVarianceAccount(SearchColumnSelectField[] unbuildVarianceAccount) {
        this.unbuildVarianceAccount = unbuildVarianceAccount;
    }

    public SearchColumnSelectField getUnbuildVarianceAccount(int i) {
        return this.unbuildVarianceAccount[i];
    }

    public void setUnbuildVarianceAccount(int i, SearchColumnSelectField _value) {
        this.unbuildVarianceAccount[i] = _value;
    }

    public SearchColumnSelectField[] getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(SearchColumnSelectField[] unitsType) {
        this.unitsType = unitsType;
    }

    public SearchColumnSelectField getUnitsType(int i) {
        return this.unitsType[i];
    }

    public void setUnitsType(int i, SearchColumnSelectField _value) {
        this.unitsType[i] = _value;
    }

    public SearchColumnStringField[] getUpcCode() {
        return this.upcCode;
    }

    public void setUpcCode(SearchColumnStringField[] upcCode) {
        this.upcCode = upcCode;
    }

    public SearchColumnStringField getUpcCode(int i) {
        return this.upcCode[i];
    }

    public void setUpcCode(int i, SearchColumnStringField _value) {
        this.upcCode[i] = _value;
    }

    public SearchColumnDoubleField[] getUpperWarningLimit() {
        return this.upperWarningLimit;
    }

    public void setUpperWarningLimit(SearchColumnDoubleField[] upperWarningLimit) {
        this.upperWarningLimit = upperWarningLimit;
    }

    public SearchColumnDoubleField getUpperWarningLimit(int i) {
        return this.upperWarningLimit[i];
    }

    public void setUpperWarningLimit(int i, SearchColumnDoubleField _value) {
        this.upperWarningLimit[i] = _value;
    }

    public SearchColumnStringField[] getUrlComponent() {
        return this.urlComponent;
    }

    public void setUrlComponent(SearchColumnStringField[] urlComponent) {
        this.urlComponent = urlComponent;
    }

    public SearchColumnStringField getUrlComponent(int i) {
        return this.urlComponent[i];
    }

    public void setUrlComponent(int i, SearchColumnStringField _value) {
        this.urlComponent[i] = _value;
    }

    public SearchColumnBooleanField[] getUseBins() {
        return this.useBins;
    }

    public void setUseBins(SearchColumnBooleanField[] useBins) {
        this.useBins = useBins;
    }

    public SearchColumnBooleanField getUseBins(int i) {
        return this.useBins[i];
    }

    public void setUseBins(int i, SearchColumnBooleanField _value) {
        this.useBins[i] = _value;
    }

    public SearchColumnBooleanField[] getUseComponentYield() {
        return this.useComponentYield;
    }

    public void setUseComponentYield(SearchColumnBooleanField[] useComponentYield) {
        this.useComponentYield = useComponentYield;
    }

    public SearchColumnBooleanField getUseComponentYield(int i) {
        return this.useComponentYield[i];
    }

    public void setUseComponentYield(int i, SearchColumnBooleanField _value) {
        this.useComponentYield[i] = _value;
    }

    public SearchColumnBooleanField[] getUseMarginalRates() {
        return this.useMarginalRates;
    }

    public void setUseMarginalRates(SearchColumnBooleanField[] useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }

    public SearchColumnBooleanField getUseMarginalRates(int i) {
        return this.useMarginalRates[i];
    }

    public void setUseMarginalRates(int i, SearchColumnBooleanField _value) {
        this.useMarginalRates[i] = _value;
    }

    public SearchColumnSelectField[] getVendor() {
        return this.vendor;
    }

    public void setVendor(SearchColumnSelectField[] vendor) {
        this.vendor = vendor;
    }

    public SearchColumnSelectField getVendor(int i) {
        return this.vendor[i];
    }

    public void setVendor(int i, SearchColumnSelectField _value) {
        this.vendor[i] = _value;
    }

    public SearchColumnStringField[] getVendorCode() {
        return this.vendorCode;
    }

    public void setVendorCode(SearchColumnStringField[] vendorCode) {
        this.vendorCode = vendorCode;
    }

    public SearchColumnStringField getVendorCode(int i) {
        return this.vendorCode[i];
    }

    public void setVendorCode(int i, SearchColumnStringField _value) {
        this.vendorCode[i] = _value;
    }

    public SearchColumnDoubleField[] getVendorCost() {
        return this.vendorCost;
    }

    public void setVendorCost(SearchColumnDoubleField[] vendorCost) {
        this.vendorCost = vendorCost;
    }

    public SearchColumnDoubleField getVendorCost(int i) {
        return this.vendorCost[i];
    }

    public void setVendorCost(int i, SearchColumnDoubleField _value) {
        this.vendorCost[i] = _value;
    }

    public SearchColumnDoubleField[] getVendorCostEntered() {
        return this.vendorCostEntered;
    }

    public void setVendorCostEntered(SearchColumnDoubleField[] vendorCostEntered) {
        this.vendorCostEntered = vendorCostEntered;
    }

    public SearchColumnDoubleField getVendorCostEntered(int i) {
        return this.vendorCostEntered[i];
    }

    public void setVendorCostEntered(int i, SearchColumnDoubleField _value) {
        this.vendorCostEntered[i] = _value;
    }

    public SearchColumnStringField[] getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(SearchColumnStringField[] vendorName) {
        this.vendorName = vendorName;
    }

    public SearchColumnStringField getVendorName(int i) {
        return this.vendorName[i];
    }

    public void setVendorName(int i, SearchColumnStringField _value) {
        this.vendorName[i] = _value;
    }

    public SearchColumnStringField[] getVendorPriceCurrency() {
        return this.vendorPriceCurrency;
    }

    public void setVendorPriceCurrency(SearchColumnStringField[] vendorPriceCurrency) {
        this.vendorPriceCurrency = vendorPriceCurrency;
    }

    public SearchColumnStringField getVendorPriceCurrency(int i) {
        return this.vendorPriceCurrency[i];
    }

    public void setVendorPriceCurrency(int i, SearchColumnStringField _value) {
        this.vendorPriceCurrency[i] = _value;
    }

    public SearchColumnSelectField[] getVendorSchedule() {
        return this.vendorSchedule;
    }

    public void setVendorSchedule(SearchColumnSelectField[] vendorSchedule) {
        this.vendorSchedule = vendorSchedule;
    }

    public SearchColumnSelectField getVendorSchedule(int i) {
        return this.vendorSchedule[i];
    }

    public void setVendorSchedule(int i, SearchColumnSelectField _value) {
        this.vendorSchedule[i] = _value;
    }

    public SearchColumnSelectField[] getVendReturnVarianceAccount() {
        return this.vendReturnVarianceAccount;
    }

    public void setVendReturnVarianceAccount(SearchColumnSelectField[] vendReturnVarianceAccount) {
        this.vendReturnVarianceAccount = vendReturnVarianceAccount;
    }

    public SearchColumnSelectField getVendReturnVarianceAccount(int i) {
        return this.vendReturnVarianceAccount[i];
    }

    public void setVendReturnVarianceAccount(int i, SearchColumnSelectField _value) {
        this.vendReturnVarianceAccount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getVsoeDeferral() {
        return this.vsoeDeferral;
    }

    public void setVsoeDeferral(SearchColumnEnumSelectField[] vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public SearchColumnEnumSelectField getVsoeDeferral(int i) {
        return this.vsoeDeferral[i];
    }

    public void setVsoeDeferral(int i, SearchColumnEnumSelectField _value) {
        this.vsoeDeferral[i] = _value;
    }

    public SearchColumnBooleanField[] getVsoeDelivered() {
        return this.vsoeDelivered;
    }

    public void setVsoeDelivered(SearchColumnBooleanField[] vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public SearchColumnBooleanField getVsoeDelivered(int i) {
        return this.vsoeDelivered[i];
    }

    public void setVsoeDelivered(int i, SearchColumnBooleanField _value) {
        this.vsoeDelivered[i] = _value;
    }

    public SearchColumnEnumSelectField[] getVsoePermitDiscount() {
        return this.vsoePermitDiscount;
    }

    public void setVsoePermitDiscount(SearchColumnEnumSelectField[] vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public SearchColumnEnumSelectField getVsoePermitDiscount(int i) {
        return this.vsoePermitDiscount[i];
    }

    public void setVsoePermitDiscount(int i, SearchColumnEnumSelectField _value) {
        this.vsoePermitDiscount[i] = _value;
    }

    public SearchColumnDoubleField[] getVsoePrice() {
        return this.vsoePrice;
    }

    public void setVsoePrice(SearchColumnDoubleField[] vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public SearchColumnDoubleField getVsoePrice(int i) {
        return this.vsoePrice[i];
    }

    public void setVsoePrice(int i, SearchColumnDoubleField _value) {
        this.vsoePrice[i] = _value;
    }

    public SearchColumnEnumSelectField[] getVsoeSopGroup() {
        return this.vsoeSopGroup;
    }

    public void setVsoeSopGroup(SearchColumnEnumSelectField[] vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }

    public SearchColumnEnumSelectField getVsoeSopGroup(int i) {
        return this.vsoeSopGroup[i];
    }

    public void setVsoeSopGroup(int i, SearchColumnEnumSelectField _value) {
        this.vsoeSopGroup[i] = _value;
    }

    public SearchColumnSelectField[] getWebSite() {
        return this.webSite;
    }

    public void setWebSite(SearchColumnSelectField[] webSite) {
        this.webSite = webSite;
    }

    public SearchColumnSelectField getWebSite(int i) {
        return this.webSite[i];
    }

    public void setWebSite(int i, SearchColumnSelectField _value) {
        this.webSite[i] = _value;
    }

    public SearchColumnDoubleField[] getWeight() {
        return this.weight;
    }

    public void setWeight(SearchColumnDoubleField[] weight) {
        this.weight = weight;
    }

    public SearchColumnDoubleField getWeight(int i) {
        return this.weight[i];
    }

    public void setWeight(int i, SearchColumnDoubleField _value) {
        this.weight[i] = _value;
    }

    public SearchColumnEnumSelectField[] getWeightUnit() {
        return this.weightUnit;
    }

    public void setWeightUnit(SearchColumnEnumSelectField[] weightUnit) {
        this.weightUnit = weightUnit;
    }

    public SearchColumnEnumSelectField getWeightUnit(int i) {
        return this.weightUnit[i];
    }

    public void setWeightUnit(int i, SearchColumnEnumSelectField _value) {
        this.weightUnit[i] = _value;
    }

    public SearchColumnSelectField[] getWipAcct() {
        return this.wipAcct;
    }

    public void setWipAcct(SearchColumnSelectField[] wipAcct) {
        this.wipAcct = wipAcct;
    }

    public SearchColumnSelectField getWipAcct(int i) {
        return this.wipAcct[i];
    }

    public void setWipAcct(int i, SearchColumnSelectField _value) {
        this.wipAcct[i] = _value;
    }

    public SearchColumnSelectField[] getWipVarianceAcct() {
        return this.wipVarianceAcct;
    }

    public void setWipVarianceAcct(SearchColumnSelectField[] wipVarianceAcct) {
        this.wipVarianceAcct = wipVarianceAcct;
    }

    public SearchColumnSelectField getWipVarianceAcct(int i) {
        return this.wipVarianceAcct[i];
    }

    public void setWipVarianceAcct(int i, SearchColumnSelectField _value) {
        this.wipVarianceAcct[i] = _value;
    }

    public SearchColumnBooleanField[] getYahooProductFeed() {
        return this.yahooProductFeed;
    }

    public void setYahooProductFeed(SearchColumnBooleanField[] yahooProductFeed) {
        this.yahooProductFeed = yahooProductFeed;
    }

    public SearchColumnBooleanField getYahooProductFeed(int i) {
        return this.yahooProductFeed[i];
    }

    public void setYahooProductFeed(int i, SearchColumnBooleanField _value) {
        this.yahooProductFeed[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemSearchRowBasic)) {
            return false;
        }
        ItemSearchRowBasic other = (ItemSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accBookRevRecForecastRule == null && other.getAccBookRevRecForecastRule() == null || this.accBookRevRecForecastRule != null && Arrays.equals(this.accBookRevRecForecastRule, other.getAccBookRevRecForecastRule())) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && Arrays.equals(this.accountingBook, other.getAccountingBook())) && (this.accountingBookAmortization == null && other.getAccountingBookAmortization() == null || this.accountingBookAmortization != null && Arrays.equals(this.accountingBookAmortization, other.getAccountingBookAmortization())) && (this.accountingBookCreatePlansOn == null && other.getAccountingBookCreatePlansOn() == null || this.accountingBookCreatePlansOn != null && Arrays.equals(this.accountingBookCreatePlansOn, other.getAccountingBookCreatePlansOn())) && (this.accountingBookRevRecRule == null && other.getAccountingBookRevRecRule() == null || this.accountingBookRevRecRule != null && Arrays.equals(this.accountingBookRevRecRule, other.getAccountingBookRevRecRule())) && (this.accountingBookRevRecSchedule == null && other.getAccountingBookRevRecSchedule() == null || this.accountingBookRevRecSchedule != null && Arrays.equals(this.accountingBookRevRecSchedule, other.getAccountingBookRevRecSchedule())) && (this.allowedShippingMethod == null && other.getAllowedShippingMethod() == null || this.allowedShippingMethod != null && Arrays.equals(this.allowedShippingMethod, other.getAllowedShippingMethod())) && (this.alternateDemandSourceItem == null && other.getAlternateDemandSourceItem() == null || this.alternateDemandSourceItem != null && Arrays.equals(this.alternateDemandSourceItem, other.getAlternateDemandSourceItem())) && (this.assetAccount == null && other.getAssetAccount() == null || this.assetAccount != null && Arrays.equals(this.assetAccount, other.getAssetAccount())) && (this.atpLeadTime == null && other.getAtpLeadTime() == null || this.atpLeadTime != null && Arrays.equals(this.atpLeadTime, other.getAtpLeadTime())) && (this.atpMethod == null && other.getAtpMethod() == null || this.atpMethod != null && Arrays.equals(this.atpMethod, other.getAtpMethod())) && (this.autoLeadTime == null && other.getAutoLeadTime() == null || this.autoLeadTime != null && Arrays.equals(this.autoLeadTime, other.getAutoLeadTime())) && (this.autoPreferredStockLevel == null && other.getAutoPreferredStockLevel() == null || this.autoPreferredStockLevel != null && Arrays.equals(this.autoPreferredStockLevel, other.getAutoPreferredStockLevel())) && (this.autoReorderPoint == null && other.getAutoReorderPoint() == null || this.autoReorderPoint != null && Arrays.equals(this.autoReorderPoint, other.getAutoReorderPoint())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && Arrays.equals(this.availableToPartners, other.getAvailableToPartners())) && (this.averageCost == null && other.getAverageCost() == null || this.averageCost != null && Arrays.equals(this.averageCost, other.getAverageCost())) && (this.backwardConsumptionDays == null && other.getBackwardConsumptionDays() == null || this.backwardConsumptionDays != null && Arrays.equals(this.backwardConsumptionDays, other.getBackwardConsumptionDays())) && (this.basePrice == null && other.getBasePrice() == null || this.basePrice != null && Arrays.equals(this.basePrice, other.getBasePrice())) && (this.billExchRateVarianceAcct == null && other.getBillExchRateVarianceAcct() == null || this.billExchRateVarianceAcct != null && Arrays.equals(this.billExchRateVarianceAcct, other.getBillExchRateVarianceAcct())) && (this.billPriceVarianceAcct == null && other.getBillPriceVarianceAcct() == null || this.billPriceVarianceAcct != null && Arrays.equals(this.billPriceVarianceAcct, other.getBillPriceVarianceAcct())) && (this.billQtyVarianceAcct == null && other.getBillQtyVarianceAcct() == null || this.billQtyVarianceAcct != null && Arrays.equals(this.billQtyVarianceAcct, other.getBillQtyVarianceAcct())) && (this.binNumber == null && other.getBinNumber() == null || this.binNumber != null && Arrays.equals(this.binNumber, other.getBinNumber())) && (this.binOnHandAvail == null && other.getBinOnHandAvail() == null || this.binOnHandAvail != null && Arrays.equals(this.binOnHandAvail, other.getBinOnHandAvail())) && (this.binOnHandCount == null && other.getBinOnHandCount() == null || this.binOnHandCount != null && Arrays.equals(this.binOnHandCount, other.getBinOnHandCount())) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && Arrays.equals(this.bomQuantity, other.getBomQuantity())) && (this.buildEntireAssembly == null && other.getBuildEntireAssembly() == null || this.buildEntireAssembly != null && Arrays.equals(this.buildEntireAssembly, other.getBuildEntireAssembly())) && (this.buildTime == null && other.getBuildTime() == null || this.buildTime != null && Arrays.equals(this.buildTime, other.getBuildTime())) && (this.buildTimeLotSize == null && other.getBuildTimeLotSize() == null || this.buildTimeLotSize != null && Arrays.equals(this.buildTimeLotSize, other.getBuildTimeLotSize())) && (this.buyItNowPrice == null && other.getBuyItNowPrice() == null || this.buyItNowPrice != null && Arrays.equals(this.buyItNowPrice, other.getBuyItNowPrice())) && (this.category == null && other.getCategory() == null || this.category != null && Arrays.equals(this.category, other.getCategory())) && (this.categoryPreferred == null && other.getCategoryPreferred() == null || this.categoryPreferred != null && Arrays.equals(this.categoryPreferred, other.getCategoryPreferred())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.componentYield == null && other.getComponentYield() == null || this.componentYield != null && Arrays.equals(this.componentYield, other.getComponentYield())) && (this.consumptionUnit == null && other.getConsumptionUnit() == null || this.consumptionUnit != null && Arrays.equals(this.consumptionUnit, other.getConsumptionUnit())) && (this.contingentRevenueHandling == null && other.getContingentRevenueHandling() == null || this.contingentRevenueHandling != null && Arrays.equals(this.contingentRevenueHandling, other.getContingentRevenueHandling())) && (this.conversionRate == null && other.getConversionRate() == null || this.conversionRate != null && Arrays.equals(this.conversionRate, other.getConversionRate())) && (this.copyDescription == null && other.getCopyDescription() == null || this.copyDescription != null && Arrays.equals(this.copyDescription, other.getCopyDescription())) && (this.correlatedItem == null && other.getCorrelatedItem() == null || this.correlatedItem != null && Arrays.equals(this.correlatedItem, other.getCorrelatedItem())) && (this.correlatedItemCorrelation == null && other.getCorrelatedItemCorrelation() == null || this.correlatedItemCorrelation != null && Arrays.equals(this.correlatedItemCorrelation, other.getCorrelatedItemCorrelation())) && (this.correlatedItemCount == null && other.getCorrelatedItemCount() == null || this.correlatedItemCount != null && Arrays.equals(this.correlatedItemCount, other.getCorrelatedItemCount())) && (this.correlatedItemLift == null && other.getCorrelatedItemLift() == null || this.correlatedItemLift != null && Arrays.equals(this.correlatedItemLift, other.getCorrelatedItemLift())) && (this.correlatedItemPurchaseRate == null && other.getCorrelatedItemPurchaseRate() == null || this.correlatedItemPurchaseRate != null && Arrays.equals(this.correlatedItemPurchaseRate, other.getCorrelatedItemPurchaseRate())) && (this.cost == null && other.getCost() == null || this.cost != null && Arrays.equals(this.cost, other.getCost())) && (this.costAccountingStatus == null && other.getCostAccountingStatus() == null || this.costAccountingStatus != null && Arrays.equals(this.costAccountingStatus, other.getCostAccountingStatus())) && (this.costCategory == null && other.getCostCategory() == null || this.costCategory != null && Arrays.equals(this.costCategory, other.getCostCategory())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && Arrays.equals(this.costEstimate, other.getCostEstimate())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && Arrays.equals(this.costEstimateType, other.getCostEstimateType())) && (this.costingMethod == null && other.getCostingMethod() == null || this.costingMethod != null && Arrays.equals(this.costingMethod, other.getCostingMethod())) && (this.countryOfManufacture == null && other.getCountryOfManufacture() == null || this.countryOfManufacture != null && Arrays.equals(this.countryOfManufacture, other.getCountryOfManufacture())) && (this.created == null && other.getCreated() == null || this.created != null && Arrays.equals(this.created, other.getCreated())) && (this.createJob == null && other.getCreateJob() == null || this.createJob != null && Arrays.equals(this.createJob, other.getCreateJob())) && (this.createRevenuePlansOn == null && other.getCreateRevenuePlansOn() == null || this.createRevenuePlansOn != null && Arrays.equals(this.createRevenuePlansOn, other.getCreateRevenuePlansOn())) && (this.custReturnVarianceAccount == null && other.getCustReturnVarianceAccount() == null || this.custReturnVarianceAccount != null && Arrays.equals(this.custReturnVarianceAccount, other.getCustReturnVarianceAccount())) && (this.dateViewed == null && other.getDateViewed() == null || this.dateViewed != null && Arrays.equals(this.dateViewed, other.getDateViewed())) && (this.daysBeforeExpiration == null && other.getDaysBeforeExpiration() == null || this.daysBeforeExpiration != null && Arrays.equals(this.daysBeforeExpiration, other.getDaysBeforeExpiration())) && (this.defaultReturnCost == null && other.getDefaultReturnCost() == null || this.defaultReturnCost != null && Arrays.equals(this.defaultReturnCost, other.getDefaultReturnCost())) && (this.defaultShippingMethod == null && other.getDefaultShippingMethod() == null || this.defaultShippingMethod != null && Arrays.equals(this.defaultShippingMethod, other.getDefaultShippingMethod())) && (this.deferredExpenseAccount == null && other.getDeferredExpenseAccount() == null || this.deferredExpenseAccount != null && Arrays.equals(this.deferredExpenseAccount, other.getDeferredExpenseAccount())) && (this.deferredRevenueAccount == null && other.getDeferredRevenueAccount() == null || this.deferredRevenueAccount != null && Arrays.equals(this.deferredRevenueAccount, other.getDeferredRevenueAccount())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && Arrays.equals(this.deferRevRec, other.getDeferRevRec())) && (this.demandModifier == null && other.getDemandModifier() == null || this.demandModifier != null && Arrays.equals(this.demandModifier, other.getDemandModifier())) && (this.demandSource == null && other.getDemandSource() == null || this.demandSource != null && Arrays.equals(this.demandSource, other.getDemandSource())) && (this.demandTimeFence == null && other.getDemandTimeFence() == null || this.demandTimeFence != null && Arrays.equals(this.demandTimeFence, other.getDemandTimeFence())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.departmentnohierarchy == null && other.getDepartmentnohierarchy() == null || this.departmentnohierarchy != null && Arrays.equals(this.departmentnohierarchy, other.getDepartmentnohierarchy())) && (this.directRevenuePosting == null && other.getDirectRevenuePosting() == null || this.directRevenuePosting != null && Arrays.equals(this.directRevenuePosting, other.getDirectRevenuePosting())) && (this.displayIneBayStore == null && other.getDisplayIneBayStore() == null || this.displayIneBayStore != null && Arrays.equals(this.displayIneBayStore, other.getDisplayIneBayStore())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && Arrays.equals(this.displayName, other.getDisplayName())) && (this.distributionCategory == null && other.getDistributionCategory() == null || this.distributionCategory != null && Arrays.equals(this.distributionCategory, other.getDistributionCategory())) && (this.distributionNetwork == null && other.getDistributionNetwork() == null || this.distributionNetwork != null && Arrays.equals(this.distributionNetwork, other.getDistributionNetwork())) && (this.dontShowPrice == null && other.getDontShowPrice() == null || this.dontShowPrice != null && Arrays.equals(this.dontShowPrice, other.getDontShowPrice())) && (this.eBayItemDescription == null && other.getEBayItemDescription() == null || this.eBayItemDescription != null && Arrays.equals(this.eBayItemDescription, other.getEBayItemDescription())) && (this.eBayItemSubtitle == null && other.getEBayItemSubtitle() == null || this.eBayItemSubtitle != null && Arrays.equals(this.eBayItemSubtitle, other.getEBayItemSubtitle())) && (this.eBayItemTitle == null && other.getEBayItemTitle() == null || this.eBayItemTitle != null && Arrays.equals(this.eBayItemTitle, other.getEBayItemTitle())) && (this.ebayRelistingOption == null && other.getEbayRelistingOption() == null || this.ebayRelistingOption != null && Arrays.equals(this.ebayRelistingOption, other.getEbayRelistingOption())) && (this.effectiveBomControl == null && other.getEffectiveBomControl() == null || this.effectiveBomControl != null && Arrays.equals(this.effectiveBomControl, other.getEffectiveBomControl())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && Arrays.equals(this.effectiveDate, other.getEffectiveDate())) && (this.effectiveRevision == null && other.getEffectiveRevision() == null || this.effectiveRevision != null && Arrays.equals(this.effectiveRevision, other.getEffectiveRevision())) && (this.enableCatchWeight == null && other.getEnableCatchWeight() == null || this.enableCatchWeight != null && Arrays.equals(this.enableCatchWeight, other.getEnableCatchWeight())) && (this.endAuctionsWhenOutOfStock == null && other.getEndAuctionsWhenOutOfStock() == null || this.endAuctionsWhenOutOfStock != null && Arrays.equals(this.endAuctionsWhenOutOfStock, other.getEndAuctionsWhenOutOfStock())) && (this.excludeFromSitemap == null && other.getExcludeFromSitemap() == null || this.excludeFromSitemap != null && Arrays.equals(this.excludeFromSitemap, other.getExcludeFromSitemap())) && (this.expenseAccount == null && other.getExpenseAccount() == null || this.expenseAccount != null && Arrays.equals(this.expenseAccount, other.getExpenseAccount())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.featuredDescription == null && other.getFeaturedDescription() == null || this.featuredDescription != null && Arrays.equals(this.featuredDescription, other.getFeaturedDescription())) && (this.feedDescription == null && other.getFeedDescription() == null || this.feedDescription != null && Arrays.equals(this.feedDescription, other.getFeedDescription())) && (this.feedName == null && other.getFeedName() == null || this.feedName != null && Arrays.equals(this.feedName, other.getFeedName())) && (this.fixedBuildTime == null && other.getFixedBuildTime() == null || this.fixedBuildTime != null && Arrays.equals(this.fixedBuildTime, other.getFixedBuildTime())) && (this.fixedLotSize == null && other.getFixedLotSize() == null || this.fixedLotSize != null && Arrays.equals(this.fixedLotSize, other.getFixedLotSize())) && (this.forwardConsumptionDays == null && other.getForwardConsumptionDays() == null || this.forwardConsumptionDays != null && Arrays.equals(this.forwardConsumptionDays, other.getForwardConsumptionDays())) && (this.fraudRisk == null && other.getFraudRisk() == null || this.fraudRisk != null && Arrays.equals(this.fraudRisk, other.getFraudRisk())) && (this.froogleProductFeed == null && other.getFroogleProductFeed() == null || this.froogleProductFeed != null && Arrays.equals(this.froogleProductFeed, other.getFroogleProductFeed())) && (this.futureHorizon == null && other.getFutureHorizon() == null || this.futureHorizon != null && Arrays.equals(this.futureHorizon, other.getFutureHorizon())) && (this.fxCost == null && other.getFxCost() == null || this.fxCost != null && Arrays.equals(this.fxCost, other.getFxCost())) && (this.gainLossAccount == null && other.getGainLossAccount() == null || this.gainLossAccount != null && Arrays.equals(this.gainLossAccount, other.getGainLossAccount())) && (this.generateAccruals == null && other.getGenerateAccruals() == null || this.generateAccruals != null && Arrays.equals(this.generateAccruals, other.getGenerateAccruals())) && (this.giftCertAuthCode == null && other.getGiftCertAuthCode() == null || this.giftCertAuthCode != null && Arrays.equals(this.giftCertAuthCode, other.getGiftCertAuthCode())) && (this.giftCertEmail == null && other.getGiftCertEmail() == null || this.giftCertEmail != null && Arrays.equals(this.giftCertEmail, other.getGiftCertEmail())) && (this.giftCertExpirationDate == null && other.getGiftCertExpirationDate() == null || this.giftCertExpirationDate != null && Arrays.equals(this.giftCertExpirationDate, other.getGiftCertExpirationDate())) && (this.giftCertFrom == null && other.getGiftCertFrom() == null || this.giftCertFrom != null && Arrays.equals(this.giftCertFrom, other.getGiftCertFrom())) && (this.giftCertMessage == null && other.getGiftCertMessage() == null || this.giftCertMessage != null && Arrays.equals(this.giftCertMessage, other.getGiftCertMessage())) && (this.giftCertOriginalAmount == null && other.getGiftCertOriginalAmount() == null || this.giftCertOriginalAmount != null && Arrays.equals(this.giftCertOriginalAmount, other.getGiftCertOriginalAmount())) && (this.giftCertRecipient == null && other.getGiftCertRecipient() == null || this.giftCertRecipient != null && Arrays.equals(this.giftCertRecipient, other.getGiftCertRecipient())) && (this.hierarchyNode == null && other.getHierarchyNode() == null || this.hierarchyNode != null && Arrays.equals(this.hierarchyNode, other.getHierarchyNode())) && (this.hierarchyVersion == null && other.getHierarchyVersion() == null || this.hierarchyVersion != null && Arrays.equals(this.hierarchyVersion, other.getHierarchyVersion())) && (this.hits == null && other.getHits() == null || this.hits != null && Arrays.equals(this.hits, other.getHits())) && (this.imageUrl == null && other.getImageUrl() == null || this.imageUrl != null && Arrays.equals(this.imageUrl, other.getImageUrl())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && Arrays.equals(this.includeChildren, other.getIncludeChildren())) && (this.incomeAccount == null && other.getIncomeAccount() == null || this.incomeAccount != null && Arrays.equals(this.incomeAccount, other.getIncomeAccount())) && (this.intercoDefRevAccount == null && other.getIntercoDefRevAccount() == null || this.intercoDefRevAccount != null && Arrays.equals(this.intercoDefRevAccount, other.getIntercoDefRevAccount())) && (this.intercoExpenseAccount == null && other.getIntercoExpenseAccount() == null || this.intercoExpenseAccount != null && Arrays.equals(this.intercoExpenseAccount, other.getIntercoExpenseAccount())) && (this.intercoIncomeAccount == null && other.getIntercoIncomeAccount() == null || this.intercoIncomeAccount != null && Arrays.equals(this.intercoIncomeAccount, other.getIntercoIncomeAccount())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.inventoryLocation == null && other.getInventoryLocation() == null || this.inventoryLocation != null && Arrays.equals(this.inventoryLocation, other.getInventoryLocation())) && (this.invtClassification == null && other.getInvtClassification() == null || this.invtClassification != null && Arrays.equals(this.invtClassification, other.getInvtClassification())) && (this.invtCountInterval == null && other.getInvtCountInterval() == null || this.invtCountInterval != null && Arrays.equals(this.invtCountInterval, other.getInvtCountInterval())) && (this.isAvailable == null && other.getIsAvailable() == null || this.isAvailable != null && Arrays.equals(this.isAvailable, other.getIsAvailable())) && (this.isDropShipItem == null && other.getIsDropShipItem() == null || this.isDropShipItem != null && Arrays.equals(this.isDropShipItem, other.getIsDropShipItem())) && (this.isFulfillable == null && other.getIsFulfillable() == null || this.isFulfillable != null && Arrays.equals(this.isFulfillable, other.getIsFulfillable())) && (this.isGcoCompliant == null && other.getIsGcoCompliant() == null || this.isGcoCompliant != null && Arrays.equals(this.isGcoCompliant, other.getIsGcoCompliant())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isLotItem == null && other.getIsLotItem() == null || this.isLotItem != null && Arrays.equals(this.isLotItem, other.getIsLotItem())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && Arrays.equals(this.isOnline, other.getIsOnline())) && (this.isSerialItem == null && other.getIsSerialItem() == null || this.isSerialItem != null && Arrays.equals(this.isSerialItem, other.getIsSerialItem())) && (this.isSpecialOrderItem == null && other.getIsSpecialOrderItem() == null || this.isSpecialOrderItem != null && Arrays.equals(this.isSpecialOrderItem, other.getIsSpecialOrderItem())) && (this.isSpecialWorkOrderItem == null && other.getIsSpecialWorkOrderItem() == null || this.isSpecialWorkOrderItem != null && Arrays.equals(this.isSpecialWorkOrderItem, other.getIsSpecialWorkOrderItem())) && (this.isStorePickupAllowed == null && other.getIsStorePickupAllowed() == null || this.isStorePickupAllowed != null && Arrays.equals(this.isStorePickupAllowed, other.getIsStorePickupAllowed())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && Arrays.equals(this.issueProduct, other.getIssueProduct())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && Arrays.equals(this.isTaxable, other.getIsTaxable())) && (this.isVsoeBundle == null && other.getIsVsoeBundle() == null || this.isVsoeBundle != null && Arrays.equals(this.isVsoeBundle, other.getIsVsoeBundle())) && (this.isWip == null && other.getIsWip() == null || this.isWip != null && Arrays.equals(this.isWip, other.getIsWip())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && Arrays.equals(this.itemId, other.getItemId())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && Arrays.equals(this.itemRevenueCategory, other.getItemRevenueCategory())) && (this.itemUrl == null && other.getItemUrl() == null || this.itemUrl != null && Arrays.equals(this.itemUrl, other.getItemUrl())) && (this.lastInvtCountDate == null && other.getLastInvtCountDate() == null || this.lastInvtCountDate != null && Arrays.equals(this.lastInvtCountDate, other.getLastInvtCountDate())) && (this.lastPurchasePrice == null && other.getLastPurchasePrice() == null || this.lastPurchasePrice != null && Arrays.equals(this.lastPurchasePrice, other.getLastPurchasePrice())) && (this.lastQuantityAvailableChange == null && other.getLastQuantityAvailableChange() == null || this.lastQuantityAvailableChange != null && Arrays.equals(this.lastQuantityAvailableChange, other.getLastQuantityAvailableChange())) && (this.leadTime == null && other.getLeadTime() == null || this.leadTime != null && Arrays.equals(this.leadTime, other.getLeadTime())) && (this.liabilityAccount == null && other.getLiabilityAccount() == null || this.liabilityAccount != null && Arrays.equals(this.liabilityAccount, other.getLiabilityAccount())) && (this.listingDuration == null && other.getListingDuration() == null || this.listingDuration != null && Arrays.equals(this.listingDuration, other.getListingDuration())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.locationAllowStorePickup == null && other.getLocationAllowStorePickup() == null || this.locationAllowStorePickup != null && Arrays.equals(this.locationAllowStorePickup, other.getLocationAllowStorePickup())) && (this.locationAtpLeadTime == null && other.getLocationAtpLeadTime() == null || this.locationAtpLeadTime != null && Arrays.equals(this.locationAtpLeadTime, other.getLocationAtpLeadTime())) && (this.locationAverageCost == null && other.getLocationAverageCost() == null || this.locationAverageCost != null && Arrays.equals(this.locationAverageCost, other.getLocationAverageCost())) && (this.locationBinQuantityAvailable == null && other.getLocationBinQuantityAvailable() == null || this.locationBinQuantityAvailable != null && Arrays.equals(this.locationBinQuantityAvailable, other.getLocationBinQuantityAvailable())) && (this.locationBuildTime == null && other.getLocationBuildTime() == null || this.locationBuildTime != null && Arrays.equals(this.locationBuildTime, other.getLocationBuildTime())) && (this.locationCost == null && other.getLocationCost() == null || this.locationCost != null && Arrays.equals(this.locationCost, other.getLocationCost())) && (this.locationCostAccountingStatus == null && other.getLocationCostAccountingStatus() == null || this.locationCostAccountingStatus != null && Arrays.equals(this.locationCostAccountingStatus, other.getLocationCostAccountingStatus())) && (this.locationDefaultReturnCost == null && other.getLocationDefaultReturnCost() == null || this.locationDefaultReturnCost != null && Arrays.equals(this.locationDefaultReturnCost, other.getLocationDefaultReturnCost())) && (this.locationDemandSource == null && other.getLocationDemandSource() == null || this.locationDemandSource != null && Arrays.equals(this.locationDemandSource, other.getLocationDemandSource())) && (this.locationDemandTimeFence == null && other.getLocationDemandTimeFence() == null || this.locationDemandTimeFence != null && Arrays.equals(this.locationDemandTimeFence, other.getLocationDemandTimeFence())) && (this.locationFixedLotSize == null && other.getLocationFixedLotSize() == null || this.locationFixedLotSize != null && Arrays.equals(this.locationFixedLotSize, other.getLocationFixedLotSize())) && (this.locationInventoryCostTemplate == null && other.getLocationInventoryCostTemplate() == null || this.locationInventoryCostTemplate != null && Arrays.equals(this.locationInventoryCostTemplate, other.getLocationInventoryCostTemplate())) && (this.locationInvtClassification == null && other.getLocationInvtClassification() == null || this.locationInvtClassification != null && Arrays.equals(this.locationInvtClassification, other.getLocationInvtClassification())) && (this.locationInvtCountInterval == null && other.getLocationInvtCountInterval() == null || this.locationInvtCountInterval != null && Arrays.equals(this.locationInvtCountInterval, other.getLocationInvtCountInterval())) && (this.locationLastInvtCountDate == null && other.getLocationLastInvtCountDate() == null || this.locationLastInvtCountDate != null && Arrays.equals(this.locationLastInvtCountDate, other.getLocationLastInvtCountDate())) && (this.locationLeadTime == null && other.getLocationLeadTime() == null || this.locationLeadTime != null && Arrays.equals(this.locationLeadTime, other.getLocationLeadTime())) && (this.locationNextInvtCountDate == null && other.getLocationNextInvtCountDate() == null || this.locationNextInvtCountDate != null && Arrays.equals(this.locationNextInvtCountDate, other.getLocationNextInvtCountDate())) && (this.locationPeriodicLotSizeDays == null && other.getLocationPeriodicLotSizeDays() == null || this.locationPeriodicLotSizeDays != null && Arrays.equals(this.locationPeriodicLotSizeDays, other.getLocationPeriodicLotSizeDays())) && (this.locationPeriodicLotSizeType == null && other.getLocationPeriodicLotSizeType() == null || this.locationPeriodicLotSizeType != null && Arrays.equals(this.locationPeriodicLotSizeType, other.getLocationPeriodicLotSizeType())) && (this.locationPreferredStockLevel == null && other.getLocationPreferredStockLevel() == null || this.locationPreferredStockLevel != null && Arrays.equals(this.locationPreferredStockLevel, other.getLocationPreferredStockLevel())) && (this.locationQtyAvailForStorePickup == null && other.getLocationQtyAvailForStorePickup() == null || this.locationQtyAvailForStorePickup != null && Arrays.equals(this.locationQtyAvailForStorePickup, other.getLocationQtyAvailForStorePickup())) && (this.locationQuantityAvailable == null && other.getLocationQuantityAvailable() == null || this.locationQuantityAvailable != null && Arrays.equals(this.locationQuantityAvailable, other.getLocationQuantityAvailable())) && (this.locationQuantityBackOrdered == null && other.getLocationQuantityBackOrdered() == null || this.locationQuantityBackOrdered != null && Arrays.equals(this.locationQuantityBackOrdered, other.getLocationQuantityBackOrdered())) && (this.locationQuantityCommitted == null && other.getLocationQuantityCommitted() == null || this.locationQuantityCommitted != null && Arrays.equals(this.locationQuantityCommitted, other.getLocationQuantityCommitted())) && (this.locationQuantityInTransit == null && other.getLocationQuantityInTransit() == null || this.locationQuantityInTransit != null && Arrays.equals(this.locationQuantityInTransit, other.getLocationQuantityInTransit())) && (this.locationQuantityOnHand == null && other.getLocationQuantityOnHand() == null || this.locationQuantityOnHand != null && Arrays.equals(this.locationQuantityOnHand, other.getLocationQuantityOnHand())) && (this.locationQuantityOnOrder == null && other.getLocationQuantityOnOrder() == null || this.locationQuantityOnOrder != null && Arrays.equals(this.locationQuantityOnOrder, other.getLocationQuantityOnOrder())) && (this.locationReOrderPoint == null && other.getLocationReOrderPoint() == null || this.locationReOrderPoint != null && Arrays.equals(this.locationReOrderPoint, other.getLocationReOrderPoint())) && (this.locationRescheduleInDays == null && other.getLocationRescheduleInDays() == null || this.locationRescheduleInDays != null && Arrays.equals(this.locationRescheduleInDays, other.getLocationRescheduleInDays())) && (this.locationRescheduleOutDays == null && other.getLocationRescheduleOutDays() == null || this.locationRescheduleOutDays != null && Arrays.equals(this.locationRescheduleOutDays, other.getLocationRescheduleOutDays())) && (this.locationSafetyStockLevel == null && other.getLocationSafetyStockLevel() == null || this.locationSafetyStockLevel != null && Arrays.equals(this.locationSafetyStockLevel, other.getLocationSafetyStockLevel())) && (this.locationStorePickupBufferStock == null && other.getLocationStorePickupBufferStock() == null || this.locationStorePickupBufferStock != null && Arrays.equals(this.locationStorePickupBufferStock, other.getLocationStorePickupBufferStock())) && (this.locationSupplyLotSizingMethod == null && other.getLocationSupplyLotSizingMethod() == null || this.locationSupplyLotSizingMethod != null && Arrays.equals(this.locationSupplyLotSizingMethod, other.getLocationSupplyLotSizingMethod())) && (this.locationSupplyTimeFence == null && other.getLocationSupplyTimeFence() == null || this.locationSupplyTimeFence != null && Arrays.equals(this.locationSupplyTimeFence, other.getLocationSupplyTimeFence())) && (this.locationSupplyType == null && other.getLocationSupplyType() == null || this.locationSupplyType != null && Arrays.equals(this.locationSupplyType, other.getLocationSupplyType())) && (this.locationTotalValue == null && other.getLocationTotalValue() == null || this.locationTotalValue != null && Arrays.equals(this.locationTotalValue, other.getLocationTotalValue())) && (this.locBackwardConsumptionDays == null && other.getLocBackwardConsumptionDays() == null || this.locBackwardConsumptionDays != null && Arrays.equals(this.locBackwardConsumptionDays, other.getLocBackwardConsumptionDays())) && (this.locForwardConsumptionDays == null && other.getLocForwardConsumptionDays() == null || this.locForwardConsumptionDays != null && Arrays.equals(this.locForwardConsumptionDays, other.getLocForwardConsumptionDays())) && (this.lowerWarningLimit == null && other.getLowerWarningLimit() == null || this.lowerWarningLimit != null && Arrays.equals(this.lowerWarningLimit, other.getLowerWarningLimit())) && (this.manufacturer == null && other.getManufacturer() == null || this.manufacturer != null && Arrays.equals(this.manufacturer, other.getManufacturer())) && (this.manufacturerAddr1 == null && other.getManufacturerAddr1() == null || this.manufacturerAddr1 != null && Arrays.equals(this.manufacturerAddr1, other.getManufacturerAddr1())) && (this.manufacturerCity == null && other.getManufacturerCity() == null || this.manufacturerCity != null && Arrays.equals(this.manufacturerCity, other.getManufacturerCity())) && (this.manufacturerState == null && other.getManufacturerState() == null || this.manufacturerState != null && Arrays.equals(this.manufacturerState, other.getManufacturerState())) && (this.manufacturerTariff == null && other.getManufacturerTariff() == null || this.manufacturerTariff != null && Arrays.equals(this.manufacturerTariff, other.getManufacturerTariff())) && (this.manufacturerTaxId == null && other.getManufacturerTaxId() == null || this.manufacturerTaxId != null && Arrays.equals(this.manufacturerTaxId, other.getManufacturerTaxId())) && (this.manufacturerZip == null && other.getManufacturerZip() == null || this.manufacturerZip != null && Arrays.equals(this.manufacturerZip, other.getManufacturerZip())) && (this.manufacturingChargeItem == null && other.getManufacturingChargeItem() == null || this.manufacturingChargeItem != null && Arrays.equals(this.manufacturingChargeItem, other.getManufacturingChargeItem())) && (this.matchBillToReceipt == null && other.getMatchBillToReceipt() == null || this.matchBillToReceipt != null && Arrays.equals(this.matchBillToReceipt, other.getMatchBillToReceipt())) && (this.maximumQuantity == null && other.getMaximumQuantity() == null || this.maximumQuantity != null && Arrays.equals(this.maximumQuantity, other.getMaximumQuantity())) && (this.memberItem == null && other.getMemberItem() == null || this.memberItem != null && Arrays.equals(this.memberItem, other.getMemberItem())) && (this.memberQuantity == null && other.getMemberQuantity() == null || this.memberQuantity != null && Arrays.equals(this.memberQuantity, other.getMemberQuantity())) && (this.metaTagHtml == null && other.getMetaTagHtml() == null || this.metaTagHtml != null && Arrays.equals(this.metaTagHtml, other.getMetaTagHtml())) && (this.minimumQuantity == null && other.getMinimumQuantity() == null || this.minimumQuantity != null && Arrays.equals(this.minimumQuantity, other.getMinimumQuantity())) && (this.modified == null && other.getModified() == null || this.modified != null && Arrays.equals(this.modified, other.getModified())) && (this.mossApplies == null && other.getMossApplies() == null || this.mossApplies != null && Arrays.equals(this.mossApplies, other.getMossApplies())) && (this.mpn == null && other.getMpn() == null || this.mpn != null && Arrays.equals(this.mpn, other.getMpn())) && (this.multManufactureAddr == null && other.getMultManufactureAddr() == null || this.multManufactureAddr != null && Arrays.equals(this.multManufactureAddr, other.getMultManufactureAddr())) && (this.nextagCategory == null && other.getNextagCategory() == null || this.nextagCategory != null && Arrays.equals(this.nextagCategory, other.getNextagCategory())) && (this.nextagProductFeed == null && other.getNextagProductFeed() == null || this.nextagProductFeed != null && Arrays.equals(this.nextagProductFeed, other.getNextagProductFeed())) && (this.nextInvtCountDate == null && other.getNextInvtCountDate() == null || this.nextInvtCountDate != null && Arrays.equals(this.nextInvtCountDate, other.getNextInvtCountDate())) && (this.noPriceMessage == null && other.getNoPriceMessage() == null || this.noPriceMessage != null && Arrays.equals(this.noPriceMessage, other.getNoPriceMessage())) && (this.numActiveListings == null && other.getNumActiveListings() == null || this.numActiveListings != null && Arrays.equals(this.numActiveListings, other.getNumActiveListings())) && (this.numberAllowedDownloads == null && other.getNumberAllowedDownloads() == null || this.numberAllowedDownloads != null && Arrays.equals(this.numberAllowedDownloads, other.getNumberAllowedDownloads())) && (this.numCurrentlyListed == null && other.getNumCurrentlyListed() == null || this.numCurrentlyListed != null && Arrays.equals(this.numCurrentlyListed, other.getNumCurrentlyListed())) && (this.obsoleteDate == null && other.getObsoleteDate() == null || this.obsoleteDate != null && Arrays.equals(this.obsoleteDate, other.getObsoleteDate())) && (this.obsoleteRevision == null && other.getObsoleteRevision() == null || this.obsoleteRevision != null && Arrays.equals(this.obsoleteRevision, other.getObsoleteRevision())) && (this.offerSupport == null && other.getOfferSupport() == null || this.offerSupport != null && Arrays.equals(this.offerSupport, other.getOfferSupport())) && (this.onlineCustomerPrice == null && other.getOnlineCustomerPrice() == null || this.onlineCustomerPrice != null && Arrays.equals(this.onlineCustomerPrice, other.getOnlineCustomerPrice())) && (this.onlinePrice == null && other.getOnlinePrice() == null || this.onlinePrice != null && Arrays.equals(this.onlinePrice, other.getOnlinePrice())) && (this.onSpecial == null && other.getOnSpecial() == null || this.onSpecial != null && Arrays.equals(this.onSpecial, other.getOnSpecial())) && (this.otherPrices == null && other.getOtherPrices() == null || this.otherPrices != null && Arrays.equals(this.otherPrices, other.getOtherPrices())) && (this.otherVendor == null && other.getOtherVendor() == null || this.otherVendor != null && Arrays.equals(this.otherVendor, other.getOtherVendor())) && (this.outOfStockBehavior == null && other.getOutOfStockBehavior() == null || this.outOfStockBehavior != null && Arrays.equals(this.outOfStockBehavior, other.getOutOfStockBehavior())) && (this.outOfStockMessage == null && other.getOutOfStockMessage() == null || this.outOfStockMessage != null && Arrays.equals(this.outOfStockMessage, other.getOutOfStockMessage())) && (this.overallQuantityPricingType == null && other.getOverallQuantityPricingType() == null || this.overallQuantityPricingType != null && Arrays.equals(this.overallQuantityPricingType, other.getOverallQuantityPricingType())) && (this.overheadType == null && other.getOverheadType() == null || this.overheadType != null && Arrays.equals(this.overheadType, other.getOverheadType())) && (this.pageTitle == null && other.getPageTitle() == null || this.pageTitle != null && Arrays.equals(this.pageTitle, other.getPageTitle())) && (this.parent == null && other.getParent() == null || this.parent != null && Arrays.equals(this.parent, other.getParent())) && (this.periodicLotSizeDays == null && other.getPeriodicLotSizeDays() == null || this.periodicLotSizeDays != null && Arrays.equals(this.periodicLotSizeDays, other.getPeriodicLotSizeDays())) && (this.periodicLotSizeType == null && other.getPeriodicLotSizeType() == null || this.periodicLotSizeType != null && Arrays.equals(this.periodicLotSizeType, other.getPeriodicLotSizeType())) && (this.planningItemCategory == null && other.getPlanningItemCategory() == null || this.planningItemCategory != null && Arrays.equals(this.planningItemCategory, other.getPlanningItemCategory())) && (this.preferenceCriterion == null && other.getPreferenceCriterion() == null || this.preferenceCriterion != null && Arrays.equals(this.preferenceCriterion, other.getPreferenceCriterion())) && (this.preferredBin == null && other.getPreferredBin() == null || this.preferredBin != null && Arrays.equals(this.preferredBin, other.getPreferredBin())) && (this.preferredLocation == null && other.getPreferredLocation() == null || this.preferredLocation != null && Arrays.equals(this.preferredLocation, other.getPreferredLocation())) && (this.preferredStockLevel == null && other.getPreferredStockLevel() == null || this.preferredStockLevel != null && Arrays.equals(this.preferredStockLevel, other.getPreferredStockLevel())) && (this.preferredStockLevelDays == null && other.getPreferredStockLevelDays() == null || this.preferredStockLevelDays != null && Arrays.equals(this.preferredStockLevelDays, other.getPreferredStockLevelDays())) && (this.pricesIncludeTax == null && other.getPricesIncludeTax() == null || this.pricesIncludeTax != null && Arrays.equals(this.pricesIncludeTax, other.getPricesIncludeTax())) && (this.pricingGroup == null && other.getPricingGroup() == null || this.pricingGroup != null && Arrays.equals(this.pricingGroup, other.getPricingGroup())) && (this.primaryCategory == null && other.getPrimaryCategory() == null || this.primaryCategory != null && Arrays.equals(this.primaryCategory, other.getPrimaryCategory())) && (this.prodPriceVarianceAcct == null && other.getProdPriceVarianceAcct() == null || this.prodPriceVarianceAcct != null && Arrays.equals(this.prodPriceVarianceAcct, other.getProdPriceVarianceAcct())) && (this.prodQtyVarianceAcct == null && other.getProdQtyVarianceAcct() == null || this.prodQtyVarianceAcct != null && Arrays.equals(this.prodQtyVarianceAcct, other.getProdQtyVarianceAcct())) && (this.purchaseDescription == null && other.getPurchaseDescription() == null || this.purchaseDescription != null && Arrays.equals(this.purchaseDescription, other.getPurchaseDescription())) && (this.purchaseOrderAmount == null && other.getPurchaseOrderAmount() == null || this.purchaseOrderAmount != null && Arrays.equals(this.purchaseOrderAmount, other.getPurchaseOrderAmount())) && (this.purchaseOrderQuantity == null && other.getPurchaseOrderQuantity() == null || this.purchaseOrderQuantity != null && Arrays.equals(this.purchaseOrderQuantity, other.getPurchaseOrderQuantity())) && (this.purchaseOrderQuantityDiff == null && other.getPurchaseOrderQuantityDiff() == null || this.purchaseOrderQuantityDiff != null && Arrays.equals(this.purchaseOrderQuantityDiff, other.getPurchaseOrderQuantityDiff())) && (this.purchasePriceVarianceAcct == null && other.getPurchasePriceVarianceAcct() == null || this.purchasePriceVarianceAcct != null && Arrays.equals(this.purchasePriceVarianceAcct, other.getPurchasePriceVarianceAcct())) && (this.purchaseUnit == null && other.getPurchaseUnit() == null || this.purchaseUnit != null && Arrays.equals(this.purchaseUnit, other.getPurchaseUnit())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && Arrays.equals(this.quantityAvailable, other.getQuantityAvailable())) && (this.quantityBackOrdered == null && other.getQuantityBackOrdered() == null || this.quantityBackOrdered != null && Arrays.equals(this.quantityBackOrdered, other.getQuantityBackOrdered())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && Arrays.equals(this.quantityCommitted, other.getQuantityCommitted())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && Arrays.equals(this.quantityOnHand, other.getQuantityOnHand())) && (this.quantityOnOrder == null && other.getQuantityOnOrder() == null || this.quantityOnOrder != null && Arrays.equals(this.quantityOnOrder, other.getQuantityOnOrder())) && (this.quantityPricingSchedule == null && other.getQuantityPricingSchedule() == null || this.quantityPricingSchedule != null && Arrays.equals(this.quantityPricingSchedule, other.getQuantityPricingSchedule())) && (this.receiptAmount == null && other.getReceiptAmount() == null || this.receiptAmount != null && Arrays.equals(this.receiptAmount, other.getReceiptAmount())) && (this.receiptQuantity == null && other.getReceiptQuantity() == null || this.receiptQuantity != null && Arrays.equals(this.receiptQuantity, other.getReceiptQuantity())) && (this.receiptQuantityDiff == null && other.getReceiptQuantityDiff() == null || this.receiptQuantityDiff != null && Arrays.equals(this.receiptQuantityDiff, other.getReceiptQuantityDiff())) && (this.reorderMultiple == null && other.getReorderMultiple() == null || this.reorderMultiple != null && Arrays.equals(this.reorderMultiple, other.getReorderMultiple())) && (this.reOrderPoint == null && other.getReOrderPoint() == null || this.reOrderPoint != null && Arrays.equals(this.reOrderPoint, other.getReOrderPoint())) && (this.rescheduleInDays == null && other.getRescheduleInDays() == null || this.rescheduleInDays != null && Arrays.equals(this.rescheduleInDays, other.getRescheduleInDays())) && (this.rescheduleOutDays == null && other.getRescheduleOutDays() == null || this.rescheduleOutDays != null && Arrays.equals(this.rescheduleOutDays, other.getRescheduleOutDays())) && (this.reservePrice == null && other.getReservePrice() == null || this.reservePrice != null && Arrays.equals(this.reservePrice, other.getReservePrice())) && (this.revenueAllocationGroup == null && other.getRevenueAllocationGroup() == null || this.revenueAllocationGroup != null && Arrays.equals(this.revenueAllocationGroup, other.getRevenueAllocationGroup())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && Arrays.equals(this.revenueRecognitionRule, other.getRevenueRecognitionRule())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && Arrays.equals(this.revRecForecastRule, other.getRevRecForecastRule())) && (this.revReclassFXAccount == null && other.getRevReclassFXAccount() == null || this.revReclassFXAccount != null && Arrays.equals(this.revReclassFXAccount, other.getRevReclassFXAccount())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && Arrays.equals(this.revRecSchedule, other.getRevRecSchedule())) && (this.roundUpAsComponent == null && other.getRoundUpAsComponent() == null || this.roundUpAsComponent != null && Arrays.equals(this.roundUpAsComponent, other.getRoundUpAsComponent())) && (this.safetyStockLevel == null && other.getSafetyStockLevel() == null || this.safetyStockLevel != null && Arrays.equals(this.safetyStockLevel, other.getSafetyStockLevel())) && (this.safetyStockLevelDays == null && other.getSafetyStockLevelDays() == null || this.safetyStockLevelDays != null && Arrays.equals(this.safetyStockLevelDays, other.getSafetyStockLevelDays())) && (this.salesDescription == null && other.getSalesDescription() == null || this.salesDescription != null && Arrays.equals(this.salesDescription, other.getSalesDescription())) && (this.salesTaxCode == null && other.getSalesTaxCode() == null || this.salesTaxCode != null && Arrays.equals(this.salesTaxCode, other.getSalesTaxCode())) && (this.saleUnit == null && other.getSaleUnit() == null || this.saleUnit != null && Arrays.equals(this.saleUnit, other.getSaleUnit())) && (this.sameAsPrimaryBookAmortization == null && other.getSameAsPrimaryBookAmortization() == null || this.sameAsPrimaryBookAmortization != null && Arrays.equals(this.sameAsPrimaryBookAmortization, other.getSameAsPrimaryBookAmortization())) && (this.sameAsPrimaryBookRevRec == null && other.getSameAsPrimaryBookRevRec() == null || this.sameAsPrimaryBookRevRec != null && Arrays.equals(this.sameAsPrimaryBookRevRec, other.getSameAsPrimaryBookRevRec())) && (this.scheduleBCode == null && other.getScheduleBCode() == null || this.scheduleBCode != null && Arrays.equals(this.scheduleBCode, other.getScheduleBCode())) && (this.scheduleBNumber == null && other.getScheduleBNumber() == null || this.scheduleBNumber != null && Arrays.equals(this.scheduleBNumber, other.getScheduleBNumber())) && (this.scheduleBQuantity == null && other.getScheduleBQuantity() == null || this.scheduleBQuantity != null && Arrays.equals(this.scheduleBQuantity, other.getScheduleBQuantity())) && (this.scrapAcct == null && other.getScrapAcct() == null || this.scrapAcct != null && Arrays.equals(this.scrapAcct, other.getScrapAcct())) && (this.searchKeywords == null && other.getSearchKeywords() == null || this.searchKeywords != null && Arrays.equals(this.searchKeywords, other.getSearchKeywords())) && (this.seasonalDemand == null && other.getSeasonalDemand() == null || this.seasonalDemand != null && Arrays.equals(this.seasonalDemand, other.getSeasonalDemand())) && (this.secondaryConsumptionUnit == null && other.getSecondaryConsumptionUnit() == null || this.secondaryConsumptionUnit != null && Arrays.equals(this.secondaryConsumptionUnit, other.getSecondaryConsumptionUnit())) && (this.secondaryPurchaseUnit == null && other.getSecondaryPurchaseUnit() == null || this.secondaryPurchaseUnit != null && Arrays.equals(this.secondaryPurchaseUnit, other.getSecondaryPurchaseUnit())) && (this.secondarySaleUnit == null && other.getSecondarySaleUnit() == null || this.secondarySaleUnit != null && Arrays.equals(this.secondarySaleUnit, other.getSecondarySaleUnit())) && (this.secondaryStockUnit == null && other.getSecondaryStockUnit() == null || this.secondaryStockUnit != null && Arrays.equals(this.secondaryStockUnit, other.getSecondaryStockUnit())) && (this.secondaryUnitsType == null && other.getSecondaryUnitsType() == null || this.secondaryUnitsType != null && Arrays.equals(this.secondaryUnitsType, other.getSecondaryUnitsType())) && (this.sellOnEBay == null && other.getSellOnEBay() == null || this.sellOnEBay != null && Arrays.equals(this.sellOnEBay, other.getSellOnEBay())) && (this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && Arrays.equals(this.serialNumber, other.getSerialNumber())) && (this.serialNumberLocation == null && other.getSerialNumberLocation() == null || this.serialNumberLocation != null && Arrays.equals(this.serialNumberLocation, other.getSerialNumberLocation())) && (this.shipIndividually == null && other.getShipIndividually() == null || this.shipIndividually != null && Arrays.equals(this.shipIndividually, other.getShipIndividually())) && (this.shipPackage == null && other.getShipPackage() == null || this.shipPackage != null && Arrays.equals(this.shipPackage, other.getShipPackage())) && (this.shippingCarrier == null && other.getShippingCarrier() == null || this.shippingCarrier != null && Arrays.equals(this.shippingCarrier, other.getShippingCarrier())) && (this.shippingRate == null && other.getShippingRate() == null || this.shippingRate != null && Arrays.equals(this.shippingRate, other.getShippingRate())) && (this.shoppingDotComCategory == null && other.getShoppingDotComCategory() == null || this.shoppingDotComCategory != null && Arrays.equals(this.shoppingDotComCategory, other.getShoppingDotComCategory())) && (this.shoppingProductFeed == null && other.getShoppingProductFeed() == null || this.shoppingProductFeed != null && Arrays.equals(this.shoppingProductFeed, other.getShoppingProductFeed())) && (this.shopzillaCategoryId == null && other.getShopzillaCategoryId() == null || this.shopzillaCategoryId != null && Arrays.equals(this.shopzillaCategoryId, other.getShopzillaCategoryId())) && (this.shopzillaProductFeed == null && other.getShopzillaProductFeed() == null || this.shopzillaProductFeed != null && Arrays.equals(this.shopzillaProductFeed, other.getShopzillaProductFeed())) && (this.sitemapPriority == null && other.getSitemapPriority() == null || this.sitemapPriority != null && Arrays.equals(this.sitemapPriority, other.getSitemapPriority())) && (this.softDescriptor == null && other.getSoftDescriptor() == null || this.softDescriptor != null && Arrays.equals(this.softDescriptor, other.getSoftDescriptor())) && (this.startingPrice == null && other.getStartingPrice() == null || this.startingPrice != null && Arrays.equals(this.startingPrice, other.getStartingPrice())) && (this.stockDescription == null && other.getStockDescription() == null || this.stockDescription != null && Arrays.equals(this.stockDescription, other.getStockDescription())) && (this.stockUnit == null && other.getStockUnit() == null || this.stockUnit != null && Arrays.equals(this.stockUnit, other.getStockUnit())) && (this.storeDescription == null && other.getStoreDescription() == null || this.storeDescription != null && Arrays.equals(this.storeDescription, other.getStoreDescription())) && (this.storeDetailedDescription == null && other.getStoreDetailedDescription() == null || this.storeDetailedDescription != null && Arrays.equals(this.storeDetailedDescription, other.getStoreDetailedDescription())) && (this.storeDisplayImage == null && other.getStoreDisplayImage() == null || this.storeDisplayImage != null && Arrays.equals(this.storeDisplayImage, other.getStoreDisplayImage())) && (this.storeDisplayName == null && other.getStoreDisplayName() == null || this.storeDisplayName != null && Arrays.equals(this.storeDisplayName, other.getStoreDisplayName())) && (this.storeDisplayThumbnail == null && other.getStoreDisplayThumbnail() == null || this.storeDisplayThumbnail != null && Arrays.equals(this.storeDisplayThumbnail, other.getStoreDisplayThumbnail())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.subType == null && other.getSubType() == null || this.subType != null && Arrays.equals(this.subType, other.getSubType())) && (this.supplyLotSizingMethod == null && other.getSupplyLotSizingMethod() == null || this.supplyLotSizingMethod != null && Arrays.equals(this.supplyLotSizingMethod, other.getSupplyLotSizingMethod())) && (this.supplyReplenishmentMethod == null && other.getSupplyReplenishmentMethod() == null || this.supplyReplenishmentMethod != null && Arrays.equals(this.supplyReplenishmentMethod, other.getSupplyReplenishmentMethod())) && (this.supplyTimeFence == null && other.getSupplyTimeFence() == null || this.supplyTimeFence != null && Arrays.equals(this.supplyTimeFence, other.getSupplyTimeFence())) && (this.supplyType == null && other.getSupplyType() == null || this.supplyType != null && Arrays.equals(this.supplyType, other.getSupplyType())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && Arrays.equals(this.taxSchedule, other.getTaxSchedule())) && (this.thumbNailUrl == null && other.getThumbNailUrl() == null || this.thumbNailUrl != null && Arrays.equals(this.thumbNailUrl, other.getThumbNailUrl())) && (this.totalValue == null && other.getTotalValue() == null || this.totalValue != null && Arrays.equals(this.totalValue, other.getTotalValue())) && (this.trackLandedCost == null && other.getTrackLandedCost() == null || this.trackLandedCost != null && Arrays.equals(this.trackLandedCost, other.getTrackLandedCost())) && (this.transferPrice == null && other.getTransferPrice() == null || this.transferPrice != null && Arrays.equals(this.transferPrice, other.getTransferPrice())) && (this.type == null && other.getType() == null || this.type != null && Arrays.equals(this.type, other.getType())) && (this.unbuildVarianceAccount == null && other.getUnbuildVarianceAccount() == null || this.unbuildVarianceAccount != null && Arrays.equals(this.unbuildVarianceAccount, other.getUnbuildVarianceAccount())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && Arrays.equals(this.unitsType, other.getUnitsType())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && Arrays.equals(this.upcCode, other.getUpcCode())) && (this.upperWarningLimit == null && other.getUpperWarningLimit() == null || this.upperWarningLimit != null && Arrays.equals(this.upperWarningLimit, other.getUpperWarningLimit())) && (this.urlComponent == null && other.getUrlComponent() == null || this.urlComponent != null && Arrays.equals(this.urlComponent, other.getUrlComponent())) && (this.useBins == null && other.getUseBins() == null || this.useBins != null && Arrays.equals(this.useBins, other.getUseBins())) && (this.useComponentYield == null && other.getUseComponentYield() == null || this.useComponentYield != null && Arrays.equals(this.useComponentYield, other.getUseComponentYield())) && (this.useMarginalRates == null && other.getUseMarginalRates() == null || this.useMarginalRates != null && Arrays.equals(this.useMarginalRates, other.getUseMarginalRates())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && Arrays.equals(this.vendor, other.getVendor())) && (this.vendorCode == null && other.getVendorCode() == null || this.vendorCode != null && Arrays.equals(this.vendorCode, other.getVendorCode())) && (this.vendorCost == null && other.getVendorCost() == null || this.vendorCost != null && Arrays.equals(this.vendorCost, other.getVendorCost())) && (this.vendorCostEntered == null && other.getVendorCostEntered() == null || this.vendorCostEntered != null && Arrays.equals(this.vendorCostEntered, other.getVendorCostEntered())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && Arrays.equals(this.vendorName, other.getVendorName())) && (this.vendorPriceCurrency == null && other.getVendorPriceCurrency() == null || this.vendorPriceCurrency != null && Arrays.equals(this.vendorPriceCurrency, other.getVendorPriceCurrency())) && (this.vendorSchedule == null && other.getVendorSchedule() == null || this.vendorSchedule != null && Arrays.equals(this.vendorSchedule, other.getVendorSchedule())) && (this.vendReturnVarianceAccount == null && other.getVendReturnVarianceAccount() == null || this.vendReturnVarianceAccount != null && Arrays.equals(this.vendReturnVarianceAccount, other.getVendReturnVarianceAccount())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && Arrays.equals(this.vsoeDeferral, other.getVsoeDeferral())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && Arrays.equals(this.vsoeDelivered, other.getVsoeDelivered())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && Arrays.equals(this.vsoePermitDiscount, other.getVsoePermitDiscount())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && Arrays.equals(this.vsoePrice, other.getVsoePrice())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && Arrays.equals(this.vsoeSopGroup, other.getVsoeSopGroup())) && (this.webSite == null && other.getWebSite() == null || this.webSite != null && Arrays.equals(this.webSite, other.getWebSite())) && (this.weight == null && other.getWeight() == null || this.weight != null && Arrays.equals(this.weight, other.getWeight())) && (this.weightUnit == null && other.getWeightUnit() == null || this.weightUnit != null && Arrays.equals(this.weightUnit, other.getWeightUnit())) && (this.wipAcct == null && other.getWipAcct() == null || this.wipAcct != null && Arrays.equals(this.wipAcct, other.getWipAcct())) && (this.wipVarianceAcct == null && other.getWipVarianceAcct() == null || this.wipVarianceAcct != null && Arrays.equals(this.wipVarianceAcct, other.getWipVarianceAcct())) && (this.yahooProductFeed == null && other.getYahooProductFeed() == null || this.yahooProductFeed != null && Arrays.equals(this.yahooProductFeed, other.getYahooProductFeed())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        Object obj;
        int i;
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getAccBookRevRecForecastRule() != null) {
            for (i = 0; i < Array.getLength(this.getAccBookRevRecForecastRule()); ++i) {
                obj = Array.get(this.getAccBookRevRecForecastRule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountingBook() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBook()); ++i) {
                obj = Array.get(this.getAccountingBook(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountingBookAmortization() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBookAmortization()); ++i) {
                obj = Array.get(this.getAccountingBookAmortization(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountingBookCreatePlansOn() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBookCreatePlansOn()); ++i) {
                obj = Array.get(this.getAccountingBookCreatePlansOn(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountingBookRevRecRule() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBookRevRecRule()); ++i) {
                obj = Array.get(this.getAccountingBookRevRecRule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountingBookRevRecSchedule() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBookRevRecSchedule()); ++i) {
                obj = Array.get(this.getAccountingBookRevRecSchedule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAllowedShippingMethod() != null) {
            for (i = 0; i < Array.getLength(this.getAllowedShippingMethod()); ++i) {
                obj = Array.get(this.getAllowedShippingMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAlternateDemandSourceItem() != null) {
            for (i = 0; i < Array.getLength(this.getAlternateDemandSourceItem()); ++i) {
                obj = Array.get(this.getAlternateDemandSourceItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAssetAccount() != null) {
            for (i = 0; i < Array.getLength(this.getAssetAccount()); ++i) {
                obj = Array.get(this.getAssetAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAtpLeadTime() != null) {
            for (i = 0; i < Array.getLength(this.getAtpLeadTime()); ++i) {
                obj = Array.get(this.getAtpLeadTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAtpMethod() != null) {
            for (i = 0; i < Array.getLength(this.getAtpMethod()); ++i) {
                obj = Array.get(this.getAtpMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAutoLeadTime() != null) {
            for (i = 0; i < Array.getLength(this.getAutoLeadTime()); ++i) {
                obj = Array.get(this.getAutoLeadTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAutoPreferredStockLevel() != null) {
            for (i = 0; i < Array.getLength(this.getAutoPreferredStockLevel()); ++i) {
                obj = Array.get(this.getAutoPreferredStockLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAutoReorderPoint() != null) {
            for (i = 0; i < Array.getLength(this.getAutoReorderPoint()); ++i) {
                obj = Array.get(this.getAutoReorderPoint(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAvailableToPartners() != null) {
            for (i = 0; i < Array.getLength(this.getAvailableToPartners()); ++i) {
                obj = Array.get(this.getAvailableToPartners(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAverageCost() != null) {
            for (i = 0; i < Array.getLength(this.getAverageCost()); ++i) {
                obj = Array.get(this.getAverageCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBackwardConsumptionDays() != null) {
            for (i = 0; i < Array.getLength(this.getBackwardConsumptionDays()); ++i) {
                obj = Array.get(this.getBackwardConsumptionDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBasePrice() != null) {
            for (i = 0; i < Array.getLength(this.getBasePrice()); ++i) {
                obj = Array.get(this.getBasePrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillExchRateVarianceAcct() != null) {
            for (i = 0; i < Array.getLength(this.getBillExchRateVarianceAcct()); ++i) {
                obj = Array.get(this.getBillExchRateVarianceAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillPriceVarianceAcct() != null) {
            for (i = 0; i < Array.getLength(this.getBillPriceVarianceAcct()); ++i) {
                obj = Array.get(this.getBillPriceVarianceAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillQtyVarianceAcct() != null) {
            for (i = 0; i < Array.getLength(this.getBillQtyVarianceAcct()); ++i) {
                obj = Array.get(this.getBillQtyVarianceAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBinNumber() != null) {
            for (i = 0; i < Array.getLength(this.getBinNumber()); ++i) {
                obj = Array.get(this.getBinNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBinOnHandAvail() != null) {
            for (i = 0; i < Array.getLength(this.getBinOnHandAvail()); ++i) {
                obj = Array.get(this.getBinOnHandAvail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBinOnHandCount() != null) {
            for (i = 0; i < Array.getLength(this.getBinOnHandCount()); ++i) {
                obj = Array.get(this.getBinOnHandCount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBomQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getBomQuantity()); ++i) {
                obj = Array.get(this.getBomQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuildEntireAssembly() != null) {
            for (i = 0; i < Array.getLength(this.getBuildEntireAssembly()); ++i) {
                obj = Array.get(this.getBuildEntireAssembly(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuildTime() != null) {
            for (i = 0; i < Array.getLength(this.getBuildTime()); ++i) {
                obj = Array.get(this.getBuildTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuildTimeLotSize() != null) {
            for (i = 0; i < Array.getLength(this.getBuildTimeLotSize()); ++i) {
                obj = Array.get(this.getBuildTimeLotSize(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuyItNowPrice() != null) {
            for (i = 0; i < Array.getLength(this.getBuyItNowPrice()); ++i) {
                obj = Array.get(this.getBuyItNowPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCategory() != null) {
            for (i = 0; i < Array.getLength(this.getCategory()); ++i) {
                obj = Array.get(this.getCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCategoryPreferred() != null) {
            for (i = 0; i < Array.getLength(this.getCategoryPreferred()); ++i) {
                obj = Array.get(this.getCategoryPreferred(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.get_class() != null) {
            for (i = 0; i < Array.getLength(this.get_class()); ++i) {
                obj = Array.get(this.get_class(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getComponentYield() != null) {
            for (i = 0; i < Array.getLength(this.getComponentYield()); ++i) {
                obj = Array.get(this.getComponentYield(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConsumptionUnit() != null) {
            for (i = 0; i < Array.getLength(this.getConsumptionUnit()); ++i) {
                obj = Array.get(this.getConsumptionUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContingentRevenueHandling() != null) {
            for (i = 0; i < Array.getLength(this.getContingentRevenueHandling()); ++i) {
                obj = Array.get(this.getContingentRevenueHandling(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConversionRate() != null) {
            for (i = 0; i < Array.getLength(this.getConversionRate()); ++i) {
                obj = Array.get(this.getConversionRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCopyDescription() != null) {
            for (i = 0; i < Array.getLength(this.getCopyDescription()); ++i) {
                obj = Array.get(this.getCopyDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCorrelatedItem() != null) {
            for (i = 0; i < Array.getLength(this.getCorrelatedItem()); ++i) {
                obj = Array.get(this.getCorrelatedItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCorrelatedItemCorrelation() != null) {
            for (i = 0; i < Array.getLength(this.getCorrelatedItemCorrelation()); ++i) {
                obj = Array.get(this.getCorrelatedItemCorrelation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCorrelatedItemCount() != null) {
            for (i = 0; i < Array.getLength(this.getCorrelatedItemCount()); ++i) {
                obj = Array.get(this.getCorrelatedItemCount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCorrelatedItemLift() != null) {
            for (i = 0; i < Array.getLength(this.getCorrelatedItemLift()); ++i) {
                obj = Array.get(this.getCorrelatedItemLift(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCorrelatedItemPurchaseRate() != null) {
            for (i = 0; i < Array.getLength(this.getCorrelatedItemPurchaseRate()); ++i) {
                obj = Array.get(this.getCorrelatedItemPurchaseRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCost() != null) {
            for (i = 0; i < Array.getLength(this.getCost()); ++i) {
                obj = Array.get(this.getCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostAccountingStatus() != null) {
            for (i = 0; i < Array.getLength(this.getCostAccountingStatus()); ++i) {
                obj = Array.get(this.getCostAccountingStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostCategory() != null) {
            for (i = 0; i < Array.getLength(this.getCostCategory()); ++i) {
                obj = Array.get(this.getCostCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostEstimate() != null) {
            for (i = 0; i < Array.getLength(this.getCostEstimate()); ++i) {
                obj = Array.get(this.getCostEstimate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostEstimateType() != null) {
            for (i = 0; i < Array.getLength(this.getCostEstimateType()); ++i) {
                obj = Array.get(this.getCostEstimateType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostingMethod() != null) {
            for (i = 0; i < Array.getLength(this.getCostingMethod()); ++i) {
                obj = Array.get(this.getCostingMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCountryOfManufacture() != null) {
            for (i = 0; i < Array.getLength(this.getCountryOfManufacture()); ++i) {
                obj = Array.get(this.getCountryOfManufacture(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreated() != null) {
            for (i = 0; i < Array.getLength(this.getCreated()); ++i) {
                obj = Array.get(this.getCreated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreateJob() != null) {
            for (i = 0; i < Array.getLength(this.getCreateJob()); ++i) {
                obj = Array.get(this.getCreateJob(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreateRevenuePlansOn() != null) {
            for (i = 0; i < Array.getLength(this.getCreateRevenuePlansOn()); ++i) {
                obj = Array.get(this.getCreateRevenuePlansOn(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustReturnVarianceAccount() != null) {
            for (i = 0; i < Array.getLength(this.getCustReturnVarianceAccount()); ++i) {
                obj = Array.get(this.getCustReturnVarianceAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateViewed() != null) {
            for (i = 0; i < Array.getLength(this.getDateViewed()); ++i) {
                obj = Array.get(this.getDateViewed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDaysBeforeExpiration() != null) {
            for (i = 0; i < Array.getLength(this.getDaysBeforeExpiration()); ++i) {
                obj = Array.get(this.getDaysBeforeExpiration(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDefaultReturnCost() != null) {
            for (i = 0; i < Array.getLength(this.getDefaultReturnCost()); ++i) {
                obj = Array.get(this.getDefaultReturnCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDefaultShippingMethod() != null) {
            for (i = 0; i < Array.getLength(this.getDefaultShippingMethod()); ++i) {
                obj = Array.get(this.getDefaultShippingMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDeferredExpenseAccount() != null) {
            for (i = 0; i < Array.getLength(this.getDeferredExpenseAccount()); ++i) {
                obj = Array.get(this.getDeferredExpenseAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDeferredRevenueAccount() != null) {
            for (i = 0; i < Array.getLength(this.getDeferredRevenueAccount()); ++i) {
                obj = Array.get(this.getDeferredRevenueAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDeferRevRec() != null) {
            for (i = 0; i < Array.getLength(this.getDeferRevRec()); ++i) {
                obj = Array.get(this.getDeferRevRec(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDemandModifier() != null) {
            for (i = 0; i < Array.getLength(this.getDemandModifier()); ++i) {
                obj = Array.get(this.getDemandModifier(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDemandSource() != null) {
            for (i = 0; i < Array.getLength(this.getDemandSource()); ++i) {
                obj = Array.get(this.getDemandSource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDemandTimeFence() != null) {
            for (i = 0; i < Array.getLength(this.getDemandTimeFence()); ++i) {
                obj = Array.get(this.getDemandTimeFence(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepartment() != null) {
            for (i = 0; i < Array.getLength(this.getDepartment()); ++i) {
                obj = Array.get(this.getDepartment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepartmentnohierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getDepartmentnohierarchy()); ++i) {
                obj = Array.get(this.getDepartmentnohierarchy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDirectRevenuePosting() != null) {
            for (i = 0; i < Array.getLength(this.getDirectRevenuePosting()); ++i) {
                obj = Array.get(this.getDirectRevenuePosting(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDisplayIneBayStore() != null) {
            for (i = 0; i < Array.getLength(this.getDisplayIneBayStore()); ++i) {
                obj = Array.get(this.getDisplayIneBayStore(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDisplayName() != null) {
            for (i = 0; i < Array.getLength(this.getDisplayName()); ++i) {
                obj = Array.get(this.getDisplayName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDistributionCategory() != null) {
            for (i = 0; i < Array.getLength(this.getDistributionCategory()); ++i) {
                obj = Array.get(this.getDistributionCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDistributionNetwork() != null) {
            for (i = 0; i < Array.getLength(this.getDistributionNetwork()); ++i) {
                obj = Array.get(this.getDistributionNetwork(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDontShowPrice() != null) {
            for (i = 0; i < Array.getLength(this.getDontShowPrice()); ++i) {
                obj = Array.get(this.getDontShowPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEBayItemDescription() != null) {
            for (i = 0; i < Array.getLength(this.getEBayItemDescription()); ++i) {
                obj = Array.get(this.getEBayItemDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEBayItemSubtitle() != null) {
            for (i = 0; i < Array.getLength(this.getEBayItemSubtitle()); ++i) {
                obj = Array.get(this.getEBayItemSubtitle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEBayItemTitle() != null) {
            for (i = 0; i < Array.getLength(this.getEBayItemTitle()); ++i) {
                obj = Array.get(this.getEBayItemTitle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEbayRelistingOption() != null) {
            for (i = 0; i < Array.getLength(this.getEbayRelistingOption()); ++i) {
                obj = Array.get(this.getEbayRelistingOption(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEffectiveBomControl() != null) {
            for (i = 0; i < Array.getLength(this.getEffectiveBomControl()); ++i) {
                obj = Array.get(this.getEffectiveBomControl(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEffectiveDate() != null) {
            for (i = 0; i < Array.getLength(this.getEffectiveDate()); ++i) {
                obj = Array.get(this.getEffectiveDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEffectiveRevision() != null) {
            for (i = 0; i < Array.getLength(this.getEffectiveRevision()); ++i) {
                obj = Array.get(this.getEffectiveRevision(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEnableCatchWeight() != null) {
            for (i = 0; i < Array.getLength(this.getEnableCatchWeight()); ++i) {
                obj = Array.get(this.getEnableCatchWeight(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEndAuctionsWhenOutOfStock() != null) {
            for (i = 0; i < Array.getLength(this.getEndAuctionsWhenOutOfStock()); ++i) {
                obj = Array.get(this.getEndAuctionsWhenOutOfStock(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExcludeFromSitemap() != null) {
            for (i = 0; i < Array.getLength(this.getExcludeFromSitemap()); ++i) {
                obj = Array.get(this.getExcludeFromSitemap(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpenseAccount() != null) {
            for (i = 0; i < Array.getLength(this.getExpenseAccount()); ++i) {
                obj = Array.get(this.getExpenseAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFeaturedDescription() != null) {
            for (i = 0; i < Array.getLength(this.getFeaturedDescription()); ++i) {
                obj = Array.get(this.getFeaturedDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFeedDescription() != null) {
            for (i = 0; i < Array.getLength(this.getFeedDescription()); ++i) {
                obj = Array.get(this.getFeedDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFeedName() != null) {
            for (i = 0; i < Array.getLength(this.getFeedName()); ++i) {
                obj = Array.get(this.getFeedName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFixedBuildTime() != null) {
            for (i = 0; i < Array.getLength(this.getFixedBuildTime()); ++i) {
                obj = Array.get(this.getFixedBuildTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFixedLotSize() != null) {
            for (i = 0; i < Array.getLength(this.getFixedLotSize()); ++i) {
                obj = Array.get(this.getFixedLotSize(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getForwardConsumptionDays() != null) {
            for (i = 0; i < Array.getLength(this.getForwardConsumptionDays()); ++i) {
                obj = Array.get(this.getForwardConsumptionDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFraudRisk() != null) {
            for (i = 0; i < Array.getLength(this.getFraudRisk()); ++i) {
                obj = Array.get(this.getFraudRisk(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFroogleProductFeed() != null) {
            for (i = 0; i < Array.getLength(this.getFroogleProductFeed()); ++i) {
                obj = Array.get(this.getFroogleProductFeed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFutureHorizon() != null) {
            for (i = 0; i < Array.getLength(this.getFutureHorizon()); ++i) {
                obj = Array.get(this.getFutureHorizon(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxCost() != null) {
            for (i = 0; i < Array.getLength(this.getFxCost()); ++i) {
                obj = Array.get(this.getFxCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGainLossAccount() != null) {
            for (i = 0; i < Array.getLength(this.getGainLossAccount()); ++i) {
                obj = Array.get(this.getGainLossAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGenerateAccruals() != null) {
            for (i = 0; i < Array.getLength(this.getGenerateAccruals()); ++i) {
                obj = Array.get(this.getGenerateAccruals(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCertAuthCode() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCertAuthCode()); ++i) {
                obj = Array.get(this.getGiftCertAuthCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCertEmail() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCertEmail()); ++i) {
                obj = Array.get(this.getGiftCertEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCertExpirationDate() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCertExpirationDate()); ++i) {
                obj = Array.get(this.getGiftCertExpirationDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCertFrom() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCertFrom()); ++i) {
                obj = Array.get(this.getGiftCertFrom(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCertMessage() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCertMessage()); ++i) {
                obj = Array.get(this.getGiftCertMessage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCertOriginalAmount() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCertOriginalAmount()); ++i) {
                obj = Array.get(this.getGiftCertOriginalAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCertRecipient() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCertRecipient()); ++i) {
                obj = Array.get(this.getGiftCertRecipient(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHierarchyNode() != null) {
            for (i = 0; i < Array.getLength(this.getHierarchyNode()); ++i) {
                obj = Array.get(this.getHierarchyNode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHierarchyVersion() != null) {
            for (i = 0; i < Array.getLength(this.getHierarchyVersion()); ++i) {
                obj = Array.get(this.getHierarchyVersion(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHits() != null) {
            for (i = 0; i < Array.getLength(this.getHits()); ++i) {
                obj = Array.get(this.getHits(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getImageUrl() != null) {
            for (i = 0; i < Array.getLength(this.getImageUrl()); ++i) {
                obj = Array.get(this.getImageUrl(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIncludeChildren() != null) {
            for (i = 0; i < Array.getLength(this.getIncludeChildren()); ++i) {
                obj = Array.get(this.getIncludeChildren(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIncomeAccount() != null) {
            for (i = 0; i < Array.getLength(this.getIncomeAccount()); ++i) {
                obj = Array.get(this.getIncomeAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIntercoDefRevAccount() != null) {
            for (i = 0; i < Array.getLength(this.getIntercoDefRevAccount()); ++i) {
                obj = Array.get(this.getIntercoDefRevAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIntercoExpenseAccount() != null) {
            for (i = 0; i < Array.getLength(this.getIntercoExpenseAccount()); ++i) {
                obj = Array.get(this.getIntercoExpenseAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIntercoIncomeAccount() != null) {
            for (i = 0; i < Array.getLength(this.getIntercoIncomeAccount()); ++i) {
                obj = Array.get(this.getIntercoIncomeAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInventoryLocation() != null) {
            for (i = 0; i < Array.getLength(this.getInventoryLocation()); ++i) {
                obj = Array.get(this.getInventoryLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInvtClassification() != null) {
            for (i = 0; i < Array.getLength(this.getInvtClassification()); ++i) {
                obj = Array.get(this.getInvtClassification(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInvtCountInterval() != null) {
            for (i = 0; i < Array.getLength(this.getInvtCountInterval()); ++i) {
                obj = Array.get(this.getInvtCountInterval(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsAvailable() != null) {
            for (i = 0; i < Array.getLength(this.getIsAvailable()); ++i) {
                obj = Array.get(this.getIsAvailable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsDropShipItem() != null) {
            for (i = 0; i < Array.getLength(this.getIsDropShipItem()); ++i) {
                obj = Array.get(this.getIsDropShipItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsFulfillable() != null) {
            for (i = 0; i < Array.getLength(this.getIsFulfillable()); ++i) {
                obj = Array.get(this.getIsFulfillable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsGcoCompliant() != null) {
            for (i = 0; i < Array.getLength(this.getIsGcoCompliant()); ++i) {
                obj = Array.get(this.getIsGcoCompliant(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsLotItem() != null) {
            for (i = 0; i < Array.getLength(this.getIsLotItem()); ++i) {
                obj = Array.get(this.getIsLotItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsOnline() != null) {
            for (i = 0; i < Array.getLength(this.getIsOnline()); ++i) {
                obj = Array.get(this.getIsOnline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSerialItem() != null) {
            for (i = 0; i < Array.getLength(this.getIsSerialItem()); ++i) {
                obj = Array.get(this.getIsSerialItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSpecialOrderItem() != null) {
            for (i = 0; i < Array.getLength(this.getIsSpecialOrderItem()); ++i) {
                obj = Array.get(this.getIsSpecialOrderItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSpecialWorkOrderItem() != null) {
            for (i = 0; i < Array.getLength(this.getIsSpecialWorkOrderItem()); ++i) {
                obj = Array.get(this.getIsSpecialWorkOrderItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsStorePickupAllowed() != null) {
            for (i = 0; i < Array.getLength(this.getIsStorePickupAllowed()); ++i) {
                obj = Array.get(this.getIsStorePickupAllowed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIssueProduct() != null) {
            for (i = 0; i < Array.getLength(this.getIssueProduct()); ++i) {
                obj = Array.get(this.getIssueProduct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsTaxable() != null) {
            for (i = 0; i < Array.getLength(this.getIsTaxable()); ++i) {
                obj = Array.get(this.getIsTaxable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsVsoeBundle() != null) {
            for (i = 0; i < Array.getLength(this.getIsVsoeBundle()); ++i) {
                obj = Array.get(this.getIsVsoeBundle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsWip() != null) {
            for (i = 0; i < Array.getLength(this.getIsWip()); ++i) {
                obj = Array.get(this.getIsWip(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemId() != null) {
            for (i = 0; i < Array.getLength(this.getItemId()); ++i) {
                obj = Array.get(this.getItemId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemRevenueCategory() != null) {
            for (i = 0; i < Array.getLength(this.getItemRevenueCategory()); ++i) {
                obj = Array.get(this.getItemRevenueCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemUrl() != null) {
            for (i = 0; i < Array.getLength(this.getItemUrl()); ++i) {
                obj = Array.get(this.getItemUrl(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastInvtCountDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastInvtCountDate()); ++i) {
                obj = Array.get(this.getLastInvtCountDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastPurchasePrice() != null) {
            for (i = 0; i < Array.getLength(this.getLastPurchasePrice()); ++i) {
                obj = Array.get(this.getLastPurchasePrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastQuantityAvailableChange() != null) {
            for (i = 0; i < Array.getLength(this.getLastQuantityAvailableChange()); ++i) {
                obj = Array.get(this.getLastQuantityAvailableChange(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLeadTime() != null) {
            for (i = 0; i < Array.getLength(this.getLeadTime()); ++i) {
                obj = Array.get(this.getLeadTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLiabilityAccount() != null) {
            for (i = 0; i < Array.getLength(this.getLiabilityAccount()); ++i) {
                obj = Array.get(this.getLiabilityAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getListingDuration() != null) {
            for (i = 0; i < Array.getLength(this.getListingDuration()); ++i) {
                obj = Array.get(this.getListingDuration(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationAllowStorePickup() != null) {
            for (i = 0; i < Array.getLength(this.getLocationAllowStorePickup()); ++i) {
                obj = Array.get(this.getLocationAllowStorePickup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationAtpLeadTime() != null) {
            for (i = 0; i < Array.getLength(this.getLocationAtpLeadTime()); ++i) {
                obj = Array.get(this.getLocationAtpLeadTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationAverageCost() != null) {
            for (i = 0; i < Array.getLength(this.getLocationAverageCost()); ++i) {
                obj = Array.get(this.getLocationAverageCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationBinQuantityAvailable() != null) {
            for (i = 0; i < Array.getLength(this.getLocationBinQuantityAvailable()); ++i) {
                obj = Array.get(this.getLocationBinQuantityAvailable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationBuildTime() != null) {
            for (i = 0; i < Array.getLength(this.getLocationBuildTime()); ++i) {
                obj = Array.get(this.getLocationBuildTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationCost() != null) {
            for (i = 0; i < Array.getLength(this.getLocationCost()); ++i) {
                obj = Array.get(this.getLocationCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationCostAccountingStatus() != null) {
            for (i = 0; i < Array.getLength(this.getLocationCostAccountingStatus()); ++i) {
                obj = Array.get(this.getLocationCostAccountingStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationDefaultReturnCost() != null) {
            for (i = 0; i < Array.getLength(this.getLocationDefaultReturnCost()); ++i) {
                obj = Array.get(this.getLocationDefaultReturnCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationDemandSource() != null) {
            for (i = 0; i < Array.getLength(this.getLocationDemandSource()); ++i) {
                obj = Array.get(this.getLocationDemandSource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationDemandTimeFence() != null) {
            for (i = 0; i < Array.getLength(this.getLocationDemandTimeFence()); ++i) {
                obj = Array.get(this.getLocationDemandTimeFence(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationFixedLotSize() != null) {
            for (i = 0; i < Array.getLength(this.getLocationFixedLotSize()); ++i) {
                obj = Array.get(this.getLocationFixedLotSize(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationInventoryCostTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getLocationInventoryCostTemplate()); ++i) {
                obj = Array.get(this.getLocationInventoryCostTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationInvtClassification() != null) {
            for (i = 0; i < Array.getLength(this.getLocationInvtClassification()); ++i) {
                obj = Array.get(this.getLocationInvtClassification(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationInvtCountInterval() != null) {
            for (i = 0; i < Array.getLength(this.getLocationInvtCountInterval()); ++i) {
                obj = Array.get(this.getLocationInvtCountInterval(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationLastInvtCountDate() != null) {
            for (i = 0; i < Array.getLength(this.getLocationLastInvtCountDate()); ++i) {
                obj = Array.get(this.getLocationLastInvtCountDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationLeadTime() != null) {
            for (i = 0; i < Array.getLength(this.getLocationLeadTime()); ++i) {
                obj = Array.get(this.getLocationLeadTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationNextInvtCountDate() != null) {
            for (i = 0; i < Array.getLength(this.getLocationNextInvtCountDate()); ++i) {
                obj = Array.get(this.getLocationNextInvtCountDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationPeriodicLotSizeDays() != null) {
            for (i = 0; i < Array.getLength(this.getLocationPeriodicLotSizeDays()); ++i) {
                obj = Array.get(this.getLocationPeriodicLotSizeDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationPeriodicLotSizeType() != null) {
            for (i = 0; i < Array.getLength(this.getLocationPeriodicLotSizeType()); ++i) {
                obj = Array.get(this.getLocationPeriodicLotSizeType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationPreferredStockLevel() != null) {
            for (i = 0; i < Array.getLength(this.getLocationPreferredStockLevel()); ++i) {
                obj = Array.get(this.getLocationPreferredStockLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationQtyAvailForStorePickup() != null) {
            for (i = 0; i < Array.getLength(this.getLocationQtyAvailForStorePickup()); ++i) {
                obj = Array.get(this.getLocationQtyAvailForStorePickup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationQuantityAvailable() != null) {
            for (i = 0; i < Array.getLength(this.getLocationQuantityAvailable()); ++i) {
                obj = Array.get(this.getLocationQuantityAvailable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationQuantityBackOrdered() != null) {
            for (i = 0; i < Array.getLength(this.getLocationQuantityBackOrdered()); ++i) {
                obj = Array.get(this.getLocationQuantityBackOrdered(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationQuantityCommitted() != null) {
            for (i = 0; i < Array.getLength(this.getLocationQuantityCommitted()); ++i) {
                obj = Array.get(this.getLocationQuantityCommitted(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationQuantityInTransit() != null) {
            for (i = 0; i < Array.getLength(this.getLocationQuantityInTransit()); ++i) {
                obj = Array.get(this.getLocationQuantityInTransit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationQuantityOnHand() != null) {
            for (i = 0; i < Array.getLength(this.getLocationQuantityOnHand()); ++i) {
                obj = Array.get(this.getLocationQuantityOnHand(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationQuantityOnOrder() != null) {
            for (i = 0; i < Array.getLength(this.getLocationQuantityOnOrder()); ++i) {
                obj = Array.get(this.getLocationQuantityOnOrder(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationReOrderPoint() != null) {
            for (i = 0; i < Array.getLength(this.getLocationReOrderPoint()); ++i) {
                obj = Array.get(this.getLocationReOrderPoint(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationRescheduleInDays() != null) {
            for (i = 0; i < Array.getLength(this.getLocationRescheduleInDays()); ++i) {
                obj = Array.get(this.getLocationRescheduleInDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationRescheduleOutDays() != null) {
            for (i = 0; i < Array.getLength(this.getLocationRescheduleOutDays()); ++i) {
                obj = Array.get(this.getLocationRescheduleOutDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationSafetyStockLevel() != null) {
            for (i = 0; i < Array.getLength(this.getLocationSafetyStockLevel()); ++i) {
                obj = Array.get(this.getLocationSafetyStockLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationStorePickupBufferStock() != null) {
            for (i = 0; i < Array.getLength(this.getLocationStorePickupBufferStock()); ++i) {
                obj = Array.get(this.getLocationStorePickupBufferStock(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationSupplyLotSizingMethod() != null) {
            for (i = 0; i < Array.getLength(this.getLocationSupplyLotSizingMethod()); ++i) {
                obj = Array.get(this.getLocationSupplyLotSizingMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationSupplyTimeFence() != null) {
            for (i = 0; i < Array.getLength(this.getLocationSupplyTimeFence()); ++i) {
                obj = Array.get(this.getLocationSupplyTimeFence(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationSupplyType() != null) {
            for (i = 0; i < Array.getLength(this.getLocationSupplyType()); ++i) {
                obj = Array.get(this.getLocationSupplyType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationTotalValue() != null) {
            for (i = 0; i < Array.getLength(this.getLocationTotalValue()); ++i) {
                obj = Array.get(this.getLocationTotalValue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocBackwardConsumptionDays() != null) {
            for (i = 0; i < Array.getLength(this.getLocBackwardConsumptionDays()); ++i) {
                obj = Array.get(this.getLocBackwardConsumptionDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocForwardConsumptionDays() != null) {
            for (i = 0; i < Array.getLength(this.getLocForwardConsumptionDays()); ++i) {
                obj = Array.get(this.getLocForwardConsumptionDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLowerWarningLimit() != null) {
            for (i = 0; i < Array.getLength(this.getLowerWarningLimit()); ++i) {
                obj = Array.get(this.getLowerWarningLimit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturer() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturer()); ++i) {
                obj = Array.get(this.getManufacturer(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturerAddr1() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturerAddr1()); ++i) {
                obj = Array.get(this.getManufacturerAddr1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturerCity() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturerCity()); ++i) {
                obj = Array.get(this.getManufacturerCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturerState() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturerState()); ++i) {
                obj = Array.get(this.getManufacturerState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturerTariff() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturerTariff()); ++i) {
                obj = Array.get(this.getManufacturerTariff(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturerTaxId() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturerTaxId()); ++i) {
                obj = Array.get(this.getManufacturerTaxId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturerZip() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturerZip()); ++i) {
                obj = Array.get(this.getManufacturerZip(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturingChargeItem() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturingChargeItem()); ++i) {
                obj = Array.get(this.getManufacturingChargeItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMatchBillToReceipt() != null) {
            for (i = 0; i < Array.getLength(this.getMatchBillToReceipt()); ++i) {
                obj = Array.get(this.getMatchBillToReceipt(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMaximumQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getMaximumQuantity()); ++i) {
                obj = Array.get(this.getMaximumQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMemberItem() != null) {
            for (i = 0; i < Array.getLength(this.getMemberItem()); ++i) {
                obj = Array.get(this.getMemberItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMemberQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getMemberQuantity()); ++i) {
                obj = Array.get(this.getMemberQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMetaTagHtml() != null) {
            for (i = 0; i < Array.getLength(this.getMetaTagHtml()); ++i) {
                obj = Array.get(this.getMetaTagHtml(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMinimumQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getMinimumQuantity()); ++i) {
                obj = Array.get(this.getMinimumQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getModified() != null) {
            for (i = 0; i < Array.getLength(this.getModified()); ++i) {
                obj = Array.get(this.getModified(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMossApplies() != null) {
            for (i = 0; i < Array.getLength(this.getMossApplies()); ++i) {
                obj = Array.get(this.getMossApplies(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMpn() != null) {
            for (i = 0; i < Array.getLength(this.getMpn()); ++i) {
                obj = Array.get(this.getMpn(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMultManufactureAddr() != null) {
            for (i = 0; i < Array.getLength(this.getMultManufactureAddr()); ++i) {
                obj = Array.get(this.getMultManufactureAddr(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNextagCategory() != null) {
            for (i = 0; i < Array.getLength(this.getNextagCategory()); ++i) {
                obj = Array.get(this.getNextagCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNextagProductFeed() != null) {
            for (i = 0; i < Array.getLength(this.getNextagProductFeed()); ++i) {
                obj = Array.get(this.getNextagProductFeed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNextInvtCountDate() != null) {
            for (i = 0; i < Array.getLength(this.getNextInvtCountDate()); ++i) {
                obj = Array.get(this.getNextInvtCountDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNoPriceMessage() != null) {
            for (i = 0; i < Array.getLength(this.getNoPriceMessage()); ++i) {
                obj = Array.get(this.getNoPriceMessage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNumActiveListings() != null) {
            for (i = 0; i < Array.getLength(this.getNumActiveListings()); ++i) {
                obj = Array.get(this.getNumActiveListings(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNumberAllowedDownloads() != null) {
            for (i = 0; i < Array.getLength(this.getNumberAllowedDownloads()); ++i) {
                obj = Array.get(this.getNumberAllowedDownloads(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNumCurrentlyListed() != null) {
            for (i = 0; i < Array.getLength(this.getNumCurrentlyListed()); ++i) {
                obj = Array.get(this.getNumCurrentlyListed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getObsoleteDate() != null) {
            for (i = 0; i < Array.getLength(this.getObsoleteDate()); ++i) {
                obj = Array.get(this.getObsoleteDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getObsoleteRevision() != null) {
            for (i = 0; i < Array.getLength(this.getObsoleteRevision()); ++i) {
                obj = Array.get(this.getObsoleteRevision(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOfferSupport() != null) {
            for (i = 0; i < Array.getLength(this.getOfferSupport()); ++i) {
                obj = Array.get(this.getOfferSupport(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOnlineCustomerPrice() != null) {
            for (i = 0; i < Array.getLength(this.getOnlineCustomerPrice()); ++i) {
                obj = Array.get(this.getOnlineCustomerPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOnlinePrice() != null) {
            for (i = 0; i < Array.getLength(this.getOnlinePrice()); ++i) {
                obj = Array.get(this.getOnlinePrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOnSpecial() != null) {
            for (i = 0; i < Array.getLength(this.getOnSpecial()); ++i) {
                obj = Array.get(this.getOnSpecial(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOtherPrices() != null) {
            for (i = 0; i < Array.getLength(this.getOtherPrices()); ++i) {
                obj = Array.get(this.getOtherPrices(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOtherVendor() != null) {
            for (i = 0; i < Array.getLength(this.getOtherVendor()); ++i) {
                obj = Array.get(this.getOtherVendor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOutOfStockBehavior() != null) {
            for (i = 0; i < Array.getLength(this.getOutOfStockBehavior()); ++i) {
                obj = Array.get(this.getOutOfStockBehavior(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOutOfStockMessage() != null) {
            for (i = 0; i < Array.getLength(this.getOutOfStockMessage()); ++i) {
                obj = Array.get(this.getOutOfStockMessage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOverallQuantityPricingType() != null) {
            for (i = 0; i < Array.getLength(this.getOverallQuantityPricingType()); ++i) {
                obj = Array.get(this.getOverallQuantityPricingType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOverheadType() != null) {
            for (i = 0; i < Array.getLength(this.getOverheadType()); ++i) {
                obj = Array.get(this.getOverheadType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPageTitle() != null) {
            for (i = 0; i < Array.getLength(this.getPageTitle()); ++i) {
                obj = Array.get(this.getPageTitle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getParent() != null) {
            for (i = 0; i < Array.getLength(this.getParent()); ++i) {
                obj = Array.get(this.getParent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPeriodicLotSizeDays() != null) {
            for (i = 0; i < Array.getLength(this.getPeriodicLotSizeDays()); ++i) {
                obj = Array.get(this.getPeriodicLotSizeDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPeriodicLotSizeType() != null) {
            for (i = 0; i < Array.getLength(this.getPeriodicLotSizeType()); ++i) {
                obj = Array.get(this.getPeriodicLotSizeType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPlanningItemCategory() != null) {
            for (i = 0; i < Array.getLength(this.getPlanningItemCategory()); ++i) {
                obj = Array.get(this.getPlanningItemCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPreferenceCriterion() != null) {
            for (i = 0; i < Array.getLength(this.getPreferenceCriterion()); ++i) {
                obj = Array.get(this.getPreferenceCriterion(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPreferredBin() != null) {
            for (i = 0; i < Array.getLength(this.getPreferredBin()); ++i) {
                obj = Array.get(this.getPreferredBin(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPreferredLocation() != null) {
            for (i = 0; i < Array.getLength(this.getPreferredLocation()); ++i) {
                obj = Array.get(this.getPreferredLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPreferredStockLevel() != null) {
            for (i = 0; i < Array.getLength(this.getPreferredStockLevel()); ++i) {
                obj = Array.get(this.getPreferredStockLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPreferredStockLevelDays() != null) {
            for (i = 0; i < Array.getLength(this.getPreferredStockLevelDays()); ++i) {
                obj = Array.get(this.getPreferredStockLevelDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPricesIncludeTax() != null) {
            for (i = 0; i < Array.getLength(this.getPricesIncludeTax()); ++i) {
                obj = Array.get(this.getPricesIncludeTax(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPricingGroup() != null) {
            for (i = 0; i < Array.getLength(this.getPricingGroup()); ++i) {
                obj = Array.get(this.getPricingGroup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrimaryCategory() != null) {
            for (i = 0; i < Array.getLength(this.getPrimaryCategory()); ++i) {
                obj = Array.get(this.getPrimaryCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProdPriceVarianceAcct() != null) {
            for (i = 0; i < Array.getLength(this.getProdPriceVarianceAcct()); ++i) {
                obj = Array.get(this.getProdPriceVarianceAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProdQtyVarianceAcct() != null) {
            for (i = 0; i < Array.getLength(this.getProdQtyVarianceAcct()); ++i) {
                obj = Array.get(this.getProdQtyVarianceAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseDescription() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseDescription()); ++i) {
                obj = Array.get(this.getPurchaseDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseOrderAmount() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderAmount()); ++i) {
                obj = Array.get(this.getPurchaseOrderAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseOrderQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderQuantity()); ++i) {
                obj = Array.get(this.getPurchaseOrderQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseOrderQuantityDiff() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderQuantityDiff()); ++i) {
                obj = Array.get(this.getPurchaseOrderQuantityDiff(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchasePriceVarianceAcct() != null) {
            for (i = 0; i < Array.getLength(this.getPurchasePriceVarianceAcct()); ++i) {
                obj = Array.get(this.getPurchasePriceVarianceAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseUnit() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseUnit()); ++i) {
                obj = Array.get(this.getPurchaseUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityAvailable() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityAvailable()); ++i) {
                obj = Array.get(this.getQuantityAvailable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityBackOrdered() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityBackOrdered()); ++i) {
                obj = Array.get(this.getQuantityBackOrdered(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityCommitted() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityCommitted()); ++i) {
                obj = Array.get(this.getQuantityCommitted(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityOnHand() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityOnHand()); ++i) {
                obj = Array.get(this.getQuantityOnHand(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityOnOrder() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityOnOrder()); ++i) {
                obj = Array.get(this.getQuantityOnOrder(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityPricingSchedule() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityPricingSchedule()); ++i) {
                obj = Array.get(this.getQuantityPricingSchedule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceiptAmount() != null) {
            for (i = 0; i < Array.getLength(this.getReceiptAmount()); ++i) {
                obj = Array.get(this.getReceiptAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceiptQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getReceiptQuantity()); ++i) {
                obj = Array.get(this.getReceiptQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceiptQuantityDiff() != null) {
            for (i = 0; i < Array.getLength(this.getReceiptQuantityDiff()); ++i) {
                obj = Array.get(this.getReceiptQuantityDiff(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReorderMultiple() != null) {
            for (i = 0; i < Array.getLength(this.getReorderMultiple()); ++i) {
                obj = Array.get(this.getReorderMultiple(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReOrderPoint() != null) {
            for (i = 0; i < Array.getLength(this.getReOrderPoint()); ++i) {
                obj = Array.get(this.getReOrderPoint(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRescheduleInDays() != null) {
            for (i = 0; i < Array.getLength(this.getRescheduleInDays()); ++i) {
                obj = Array.get(this.getRescheduleInDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRescheduleOutDays() != null) {
            for (i = 0; i < Array.getLength(this.getRescheduleOutDays()); ++i) {
                obj = Array.get(this.getRescheduleOutDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReservePrice() != null) {
            for (i = 0; i < Array.getLength(this.getReservePrice()); ++i) {
                obj = Array.get(this.getReservePrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevenueAllocationGroup() != null) {
            for (i = 0; i < Array.getLength(this.getRevenueAllocationGroup()); ++i) {
                obj = Array.get(this.getRevenueAllocationGroup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevenueRecognitionRule() != null) {
            for (i = 0; i < Array.getLength(this.getRevenueRecognitionRule()); ++i) {
                obj = Array.get(this.getRevenueRecognitionRule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecForecastRule() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecForecastRule()); ++i) {
                obj = Array.get(this.getRevRecForecastRule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevReclassFXAccount() != null) {
            for (i = 0; i < Array.getLength(this.getRevReclassFXAccount()); ++i) {
                obj = Array.get(this.getRevReclassFXAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecSchedule() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecSchedule()); ++i) {
                obj = Array.get(this.getRevRecSchedule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRoundUpAsComponent() != null) {
            for (i = 0; i < Array.getLength(this.getRoundUpAsComponent()); ++i) {
                obj = Array.get(this.getRoundUpAsComponent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSafetyStockLevel() != null) {
            for (i = 0; i < Array.getLength(this.getSafetyStockLevel()); ++i) {
                obj = Array.get(this.getSafetyStockLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSafetyStockLevelDays() != null) {
            for (i = 0; i < Array.getLength(this.getSafetyStockLevelDays()); ++i) {
                obj = Array.get(this.getSafetyStockLevelDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesDescription() != null) {
            for (i = 0; i < Array.getLength(this.getSalesDescription()); ++i) {
                obj = Array.get(this.getSalesDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesTaxCode() != null) {
            for (i = 0; i < Array.getLength(this.getSalesTaxCode()); ++i) {
                obj = Array.get(this.getSalesTaxCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSaleUnit() != null) {
            for (i = 0; i < Array.getLength(this.getSaleUnit()); ++i) {
                obj = Array.get(this.getSaleUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSameAsPrimaryBookAmortization() != null) {
            for (i = 0; i < Array.getLength(this.getSameAsPrimaryBookAmortization()); ++i) {
                obj = Array.get(this.getSameAsPrimaryBookAmortization(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSameAsPrimaryBookRevRec() != null) {
            for (i = 0; i < Array.getLength(this.getSameAsPrimaryBookRevRec()); ++i) {
                obj = Array.get(this.getSameAsPrimaryBookRevRec(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getScheduleBCode() != null) {
            for (i = 0; i < Array.getLength(this.getScheduleBCode()); ++i) {
                obj = Array.get(this.getScheduleBCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getScheduleBNumber() != null) {
            for (i = 0; i < Array.getLength(this.getScheduleBNumber()); ++i) {
                obj = Array.get(this.getScheduleBNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getScheduleBQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getScheduleBQuantity()); ++i) {
                obj = Array.get(this.getScheduleBQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getScrapAcct() != null) {
            for (i = 0; i < Array.getLength(this.getScrapAcct()); ++i) {
                obj = Array.get(this.getScrapAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSearchKeywords() != null) {
            for (i = 0; i < Array.getLength(this.getSearchKeywords()); ++i) {
                obj = Array.get(this.getSearchKeywords(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSeasonalDemand() != null) {
            for (i = 0; i < Array.getLength(this.getSeasonalDemand()); ++i) {
                obj = Array.get(this.getSeasonalDemand(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSecondaryConsumptionUnit() != null) {
            for (i = 0; i < Array.getLength(this.getSecondaryConsumptionUnit()); ++i) {
                obj = Array.get(this.getSecondaryConsumptionUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSecondaryPurchaseUnit() != null) {
            for (i = 0; i < Array.getLength(this.getSecondaryPurchaseUnit()); ++i) {
                obj = Array.get(this.getSecondaryPurchaseUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSecondarySaleUnit() != null) {
            for (i = 0; i < Array.getLength(this.getSecondarySaleUnit()); ++i) {
                obj = Array.get(this.getSecondarySaleUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSecondaryStockUnit() != null) {
            for (i = 0; i < Array.getLength(this.getSecondaryStockUnit()); ++i) {
                obj = Array.get(this.getSecondaryStockUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSecondaryUnitsType() != null) {
            for (i = 0; i < Array.getLength(this.getSecondaryUnitsType()); ++i) {
                obj = Array.get(this.getSecondaryUnitsType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSellOnEBay() != null) {
            for (i = 0; i < Array.getLength(this.getSellOnEBay()); ++i) {
                obj = Array.get(this.getSellOnEBay(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSerialNumber() != null) {
            for (i = 0; i < Array.getLength(this.getSerialNumber()); ++i) {
                obj = Array.get(this.getSerialNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSerialNumberLocation() != null) {
            for (i = 0; i < Array.getLength(this.getSerialNumberLocation()); ++i) {
                obj = Array.get(this.getSerialNumberLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipIndividually() != null) {
            for (i = 0; i < Array.getLength(this.getShipIndividually()); ++i) {
                obj = Array.get(this.getShipIndividually(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipPackage() != null) {
            for (i = 0; i < Array.getLength(this.getShipPackage()); ++i) {
                obj = Array.get(this.getShipPackage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShippingCarrier() != null) {
            for (i = 0; i < Array.getLength(this.getShippingCarrier()); ++i) {
                obj = Array.get(this.getShippingCarrier(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShippingRate() != null) {
            for (i = 0; i < Array.getLength(this.getShippingRate()); ++i) {
                obj = Array.get(this.getShippingRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShoppingDotComCategory() != null) {
            for (i = 0; i < Array.getLength(this.getShoppingDotComCategory()); ++i) {
                obj = Array.get(this.getShoppingDotComCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShoppingProductFeed() != null) {
            for (i = 0; i < Array.getLength(this.getShoppingProductFeed()); ++i) {
                obj = Array.get(this.getShoppingProductFeed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShopzillaCategoryId() != null) {
            for (i = 0; i < Array.getLength(this.getShopzillaCategoryId()); ++i) {
                obj = Array.get(this.getShopzillaCategoryId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShopzillaProductFeed() != null) {
            for (i = 0; i < Array.getLength(this.getShopzillaProductFeed()); ++i) {
                obj = Array.get(this.getShopzillaProductFeed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSitemapPriority() != null) {
            for (i = 0; i < Array.getLength(this.getSitemapPriority()); ++i) {
                obj = Array.get(this.getSitemapPriority(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSoftDescriptor() != null) {
            for (i = 0; i < Array.getLength(this.getSoftDescriptor()); ++i) {
                obj = Array.get(this.getSoftDescriptor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartingPrice() != null) {
            for (i = 0; i < Array.getLength(this.getStartingPrice()); ++i) {
                obj = Array.get(this.getStartingPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStockDescription() != null) {
            for (i = 0; i < Array.getLength(this.getStockDescription()); ++i) {
                obj = Array.get(this.getStockDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStockUnit() != null) {
            for (i = 0; i < Array.getLength(this.getStockUnit()); ++i) {
                obj = Array.get(this.getStockUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStoreDescription() != null) {
            for (i = 0; i < Array.getLength(this.getStoreDescription()); ++i) {
                obj = Array.get(this.getStoreDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStoreDetailedDescription() != null) {
            for (i = 0; i < Array.getLength(this.getStoreDetailedDescription()); ++i) {
                obj = Array.get(this.getStoreDetailedDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStoreDisplayImage() != null) {
            for (i = 0; i < Array.getLength(this.getStoreDisplayImage()); ++i) {
                obj = Array.get(this.getStoreDisplayImage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStoreDisplayName() != null) {
            for (i = 0; i < Array.getLength(this.getStoreDisplayName()); ++i) {
                obj = Array.get(this.getStoreDisplayName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStoreDisplayThumbnail() != null) {
            for (i = 0; i < Array.getLength(this.getStoreDisplayThumbnail()); ++i) {
                obj = Array.get(this.getStoreDisplayThumbnail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiary()); ++i) {
                obj = Array.get(this.getSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubType() != null) {
            for (i = 0; i < Array.getLength(this.getSubType()); ++i) {
                obj = Array.get(this.getSubType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSupplyLotSizingMethod() != null) {
            for (i = 0; i < Array.getLength(this.getSupplyLotSizingMethod()); ++i) {
                obj = Array.get(this.getSupplyLotSizingMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSupplyReplenishmentMethod() != null) {
            for (i = 0; i < Array.getLength(this.getSupplyReplenishmentMethod()); ++i) {
                obj = Array.get(this.getSupplyReplenishmentMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSupplyTimeFence() != null) {
            for (i = 0; i < Array.getLength(this.getSupplyTimeFence()); ++i) {
                obj = Array.get(this.getSupplyTimeFence(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSupplyType() != null) {
            for (i = 0; i < Array.getLength(this.getSupplyType()); ++i) {
                obj = Array.get(this.getSupplyType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxSchedule() != null) {
            for (i = 0; i < Array.getLength(this.getTaxSchedule()); ++i) {
                obj = Array.get(this.getTaxSchedule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getThumbNailUrl() != null) {
            for (i = 0; i < Array.getLength(this.getThumbNailUrl()); ++i) {
                obj = Array.get(this.getThumbNailUrl(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTotalValue() != null) {
            for (i = 0; i < Array.getLength(this.getTotalValue()); ++i) {
                obj = Array.get(this.getTotalValue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTrackLandedCost() != null) {
            for (i = 0; i < Array.getLength(this.getTrackLandedCost()); ++i) {
                obj = Array.get(this.getTrackLandedCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransferPrice() != null) {
            for (i = 0; i < Array.getLength(this.getTransferPrice()); ++i) {
                obj = Array.get(this.getTransferPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getType() != null) {
            for (i = 0; i < Array.getLength(this.getType()); ++i) {
                obj = Array.get(this.getType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnbuildVarianceAccount() != null) {
            for (i = 0; i < Array.getLength(this.getUnbuildVarianceAccount()); ++i) {
                obj = Array.get(this.getUnbuildVarianceAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitsType() != null) {
            for (i = 0; i < Array.getLength(this.getUnitsType()); ++i) {
                obj = Array.get(this.getUnitsType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUpcCode() != null) {
            for (i = 0; i < Array.getLength(this.getUpcCode()); ++i) {
                obj = Array.get(this.getUpcCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUpperWarningLimit() != null) {
            for (i = 0; i < Array.getLength(this.getUpperWarningLimit()); ++i) {
                obj = Array.get(this.getUpperWarningLimit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUrlComponent() != null) {
            for (i = 0; i < Array.getLength(this.getUrlComponent()); ++i) {
                obj = Array.get(this.getUrlComponent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUseBins() != null) {
            for (i = 0; i < Array.getLength(this.getUseBins()); ++i) {
                obj = Array.get(this.getUseBins(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUseComponentYield() != null) {
            for (i = 0; i < Array.getLength(this.getUseComponentYield()); ++i) {
                obj = Array.get(this.getUseComponentYield(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUseMarginalRates() != null) {
            for (i = 0; i < Array.getLength(this.getUseMarginalRates()); ++i) {
                obj = Array.get(this.getUseMarginalRates(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendor() != null) {
            for (i = 0; i < Array.getLength(this.getVendor()); ++i) {
                obj = Array.get(this.getVendor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendorCode() != null) {
            for (i = 0; i < Array.getLength(this.getVendorCode()); ++i) {
                obj = Array.get(this.getVendorCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendorCost() != null) {
            for (i = 0; i < Array.getLength(this.getVendorCost()); ++i) {
                obj = Array.get(this.getVendorCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendorCostEntered() != null) {
            for (i = 0; i < Array.getLength(this.getVendorCostEntered()); ++i) {
                obj = Array.get(this.getVendorCostEntered(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendorName() != null) {
            for (i = 0; i < Array.getLength(this.getVendorName()); ++i) {
                obj = Array.get(this.getVendorName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendorPriceCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getVendorPriceCurrency()); ++i) {
                obj = Array.get(this.getVendorPriceCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendorSchedule() != null) {
            for (i = 0; i < Array.getLength(this.getVendorSchedule()); ++i) {
                obj = Array.get(this.getVendorSchedule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendReturnVarianceAccount() != null) {
            for (i = 0; i < Array.getLength(this.getVendReturnVarianceAccount()); ++i) {
                obj = Array.get(this.getVendReturnVarianceAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoeDeferral() != null) {
            for (i = 0; i < Array.getLength(this.getVsoeDeferral()); ++i) {
                obj = Array.get(this.getVsoeDeferral(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoeDelivered() != null) {
            for (i = 0; i < Array.getLength(this.getVsoeDelivered()); ++i) {
                obj = Array.get(this.getVsoeDelivered(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoePermitDiscount() != null) {
            for (i = 0; i < Array.getLength(this.getVsoePermitDiscount()); ++i) {
                obj = Array.get(this.getVsoePermitDiscount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoePrice() != null) {
            for (i = 0; i < Array.getLength(this.getVsoePrice()); ++i) {
                obj = Array.get(this.getVsoePrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoeSopGroup() != null) {
            for (i = 0; i < Array.getLength(this.getVsoeSopGroup()); ++i) {
                obj = Array.get(this.getVsoeSopGroup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWebSite() != null) {
            for (i = 0; i < Array.getLength(this.getWebSite()); ++i) {
                obj = Array.get(this.getWebSite(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWeight() != null) {
            for (i = 0; i < Array.getLength(this.getWeight()); ++i) {
                obj = Array.get(this.getWeight(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWeightUnit() != null) {
            for (i = 0; i < Array.getLength(this.getWeightUnit()); ++i) {
                obj = Array.get(this.getWeightUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWipAcct() != null) {
            for (i = 0; i < Array.getLength(this.getWipAcct()); ++i) {
                obj = Array.get(this.getWipAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWipVarianceAcct() != null) {
            for (i = 0; i < Array.getLength(this.getWipVarianceAcct()); ++i) {
                obj = Array.get(this.getWipVarianceAcct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getYahooProductFeed() != null) {
            for (i = 0; i < Array.getLength(this.getYahooProductFeed()); ++i) {
                obj = Array.get(this.getYahooProductFeed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accBookRevRecForecastRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accBookRevRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookAmortization");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookAmortization"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookCreatePlansOn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookCreatePlansOn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookRevRecRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookRevRecRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookRevRecSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookRevRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowedShippingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowedShippingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("alternateDemandSourceItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "alternateDemandSourceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assetAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assetAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("atpLeadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "atpLeadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("atpMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "atpMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoLeadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoLeadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoPreferredStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoPreferredStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoReorderPoint");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoReorderPoint"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("backwardConsumptionDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "backwardConsumptionDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("basePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "basePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billExchRateVarianceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billExchRateVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPriceVarianceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billPriceVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billQtyVarianceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billQtyVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binOnHandAvail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binOnHandAvail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binOnHandCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binOnHandCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTimeLotSize");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildTimeLotSize"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyItNowPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyItNowPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("categoryPreferred");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "categoryPreferred"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consumptionUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consumptionUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contingentRevenueHandling");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contingentRevenueHandling"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemCorrelation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItemCorrelation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItemCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemLift");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItemLift"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemPurchaseRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "correlatedItemPurchaseRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costAccountingStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costAccountingStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createJob");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createJob"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createRevenuePlansOn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createRevenuePlansOn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("custReturnVarianceAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "custReturnVarianceAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysBeforeExpiration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysBeforeExpiration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultShippingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultShippingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredExpenseAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferredExpenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferredRevenueAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandModifier");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "demandModifier"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "demandSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandTimeFence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "demandTimeFence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("departmentnohierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "departmentnohierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("directRevenuePosting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "directRevenuePosting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayIneBayStore");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "displayIneBayStore"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("distributionCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "distributionCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("distributionNetwork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "distributionNetwork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("EBayItemDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eBayItemDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("EBayItemSubtitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eBayItemSubtitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("EBayItemTitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eBayItemTitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ebayRelistingOption");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ebayRelistingOption"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveBomControl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveBomControl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveRevision");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("enableCatchWeight");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "enableCatchWeight"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endAuctionsWhenOutOfStock");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endAuctionsWhenOutOfStock"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("feedDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "feedDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("feedName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "feedName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedBuildTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fixedBuildTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedLotSize");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fixedLotSize"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("forwardConsumptionDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "forwardConsumptionDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fraudRisk");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fraudRisk"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("froogleProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "froogleProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("futureHorizon");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "futureHorizon"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gainLossAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gainLossAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("generateAccruals");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "generateAccruals"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertAuthCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertAuthCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertExpirationDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertExpirationDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertMessage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertMessage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertOriginalAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertOriginalAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertRecipient");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertRecipient"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyNode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hierarchyNode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyVersion");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hierarchyVersion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "imageUrl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoDefRevAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "intercoDefRevAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoExpenseAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "intercoExpenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoIncomeAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "intercoIncomeAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invtClassification");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "invtClassification"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invtCountInterval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "invtCountInterval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isLotItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isLotItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSerialItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSerialItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSpecialWorkOrderItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSpecialWorkOrderItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isStorePickupAllowed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isStorePickupAllowed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isVsoeBundle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isVsoeBundle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemUrl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemUrl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastInvtCountDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastInvtCountDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastQuantityAvailableChange");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastQuantityAvailableChange"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("listingDuration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "listingDuration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationAllowStorePickup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationAllowStorePickup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationAtpLeadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationAtpLeadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationAverageCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationAverageCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationBinQuantityAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationBinQuantityAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationBuildTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationBuildTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationCostAccountingStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationCostAccountingStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationDefaultReturnCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationDefaultReturnCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationDemandSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationDemandSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationDemandTimeFence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationDemandTimeFence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationFixedLotSize");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationFixedLotSize"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationInventoryCostTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationInventoryCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationInvtClassification");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationInvtClassification"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationInvtCountInterval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationInvtCountInterval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationLastInvtCountDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationLastInvtCountDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationLeadTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationLeadTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationNextInvtCountDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationNextInvtCountDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationPeriodicLotSizeDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationPeriodicLotSizeDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationPeriodicLotSizeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationPeriodicLotSizeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationPreferredStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationPreferredStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQtyAvailForStorePickup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQtyAvailForStorePickup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityBackOrdered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityBackOrdered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityInTransit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityInTransit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityOnHand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityOnHand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQuantityOnOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationQuantityOnOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationReOrderPoint");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationReOrderPoint"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationRescheduleInDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationRescheduleInDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationRescheduleOutDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationRescheduleOutDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationSafetyStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationSafetyStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationStorePickupBufferStock");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationStorePickupBufferStock"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationSupplyLotSizingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationSupplyLotSizingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationSupplyTimeFence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationSupplyTimeFence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationSupplyType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationSupplyType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationTotalValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationTotalValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locBackwardConsumptionDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locBackwardConsumptionDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locForwardConsumptionDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locForwardConsumptionDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowerWarningLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lowerWarningLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerAddr1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerAddr1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingChargeItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingChargeItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memberItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memberItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memberQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memberQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "modified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mossApplies");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mossApplies"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextagCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextagCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextagProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextagProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextInvtCountDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextInvtCountDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noPriceMessage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "noPriceMessage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numActiveListings");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "numActiveListings"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberAllowedDownloads");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "numberAllowedDownloads"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numCurrentlyListed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "numCurrentlyListed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("obsoleteDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "obsoleteDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("obsoleteRevision");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "obsoleteRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onlineCustomerPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "onlineCustomerPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onlinePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "onlinePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherPrices");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "otherPrices"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherVendor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "otherVendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "outOfStockMessage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overheadType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overheadType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodicLotSizeDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodicLotSizeDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodicLotSizeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodicLotSizeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("planningItemCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "planningItemCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferredLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredStockLevelDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferredStockLevelDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricesIncludeTax");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pricesIncludeTax"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("prodPriceVarianceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "prodPriceVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("prodQtyVarianceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "prodQtyVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchasePriceVarianceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchasePriceVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reorderMultiple");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reorderMultiple"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reOrderPoint");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reOrderPoint"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rescheduleInDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rescheduleInDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rescheduleOutDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rescheduleOutDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reservePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reservePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueAllocationGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenueAllocationGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revReclassFXAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revReclassFXAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roundUpAsComponent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "roundUpAsComponent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("safetyStockLevelDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "safetyStockLevelDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameAsPrimaryBookAmortization");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sameAsPrimaryBookAmortization"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameAsPrimaryBookRevRec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sameAsPrimaryBookRevRec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scrapAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scrapAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("seasonalDemand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "seasonalDemand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryConsumptionUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondaryConsumptionUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryPurchaseUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondaryPurchaseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondarySaleUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondarySaleUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryStockUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondaryStockUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryUnitsType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "secondaryUnitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sellOnEBay");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sellOnEBay"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumberLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumberLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingCarrier");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shippingCarrier"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shoppingProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shoppingProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shopzillaProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shopzillaProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startingPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startingPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stockUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stockUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDisplayName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "storeDisplayName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyLotSizingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supplyLotSizingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyReplenishmentMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supplyReplenishmentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyTimeFence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supplyTimeFence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supplyType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thumbNailUrl");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "thumbNailUrl"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "totalValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("trackLandedCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "trackLandedCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbuildVarianceAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unbuildVarianceAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upperWarningLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "upperWarningLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCostEntered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorCostEntered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorPriceCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorPriceCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendorSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendReturnVarianceAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendReturnVarianceAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "weightUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("wipAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "wipAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("wipVarianceAcct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "wipVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yahooProductFeed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "yahooProductFeed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

