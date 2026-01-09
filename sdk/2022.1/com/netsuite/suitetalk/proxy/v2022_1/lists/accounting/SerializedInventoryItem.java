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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.InventoryItemBinNumberList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemAccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemOptionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemVendorList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.MatrixOptionList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.PresentationItemList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.PricingMatrix;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ProductFeedList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.SerializedInventoryItemHierarchyVersionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.SerializedInventoryItemLocationsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.SerializedInventoryItemNumbersList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.SiteCategoryList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.TranslationList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.HazmatPackingGroup;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemCostingMethod;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemInvtClassification;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemMatrixType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemOutOfStockBehavior;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemOverallQuantityPricingType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemPreferenceCriterion;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemWeightUnit;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.PeriodicLotSizeType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ScheduleBCode;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.Country;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.ItemCostEstimateType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.ShippingCarrier;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.SitemapPriority;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoeDeferral;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoePermitDiscount;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoeSopGroup;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
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

public class SerializedInventoryItem
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef customForm;
    private String itemId;
    private String upcCode;
    private String displayName;
    private ItemMatrixType matrixType;
    private Boolean includeChildren;
    private String vendorName;
    private RecordRef parent;
    private Boolean isOnline;
    private Boolean isHazmatItem;
    private String hazmatId;
    private String hazmatShippingName;
    private String hazmatHazardClass;
    private HazmatPackingGroup hazmatPackingGroup;
    private String hazmatItemUnits;
    private Double hazmatItemUnitsQty;
    private Boolean isGcoCompliant;
    private Boolean offerSupport;
    private Boolean isInactive;
    private Boolean availableToPartners;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private ItemCostingMethod costingMethod;
    private RecordRefList subsidiaryList;
    private String purchaseDescription;
    private Boolean copyDescription;
    private RecordRef issueProduct;
    private String currency;
    private RecordRef cogsAccount;
    private RecordRef intercoCogsAccount;
    private RecordRef vendor;
    private String salesDescription;
    private Calendar lastInvtCountDate;
    private Calendar nextInvtCountDate;
    private Long invtCountInterval;
    private ItemInvtClassification invtClassification;
    private RecordRef incomeAccount;
    private RecordRef intercoIncomeAccount;
    private Boolean isTaxable;
    private RecordRef taxSchedule;
    private RecordRef dropshipExpenseAccount;
    private RecordRef revenueRecognitionRule;
    private RecordRef revRecForecastRule;
    private RecordRef revenueAllocationGroup;
    private RecordRef createRevenuePlansOn;
    private Boolean directRevenuePosting;
    private RecordRef assetAccount;
    private Boolean matchBillToReceipt;
    private RecordRef billQtyVarianceAcct;
    private RecordRef billPriceVarianceAcct;
    private RecordRef billExchRateVarianceAcct;
    private RecordRef gainLossAccount;
    private Double shippingCost;
    private Double handlingCost;
    private Double weight;
    private String costingMethodDisplay;
    private String shippingCostUnits;
    private String handlingCostUnits;
    private RecordRef unitsType;
    private RecordRef stockUnit;
    private RecordRef purchaseUnit;
    private RecordRef saleUnit;
    private String minimumQuantityUnits;
    private String safetyStockLevelUnits;
    private RecordRef billingSchedule;
    private Boolean trackLandedCost;
    private String matrixItemNameTemplate;
    private Boolean isDropShipItem;
    private Boolean isSpecialOrderItem;
    private String stockDescription;
    private RecordRef deferredRevenueAccount;
    private Boolean producer;
    private String manufacturer;
    private RecordRef revRecSchedule;
    private String mpn;
    private Boolean multManufactureAddr;
    private String manufacturerAddr1;
    private String manufacturerCity;
    private String manufacturerState;
    private String manufacturerZip;
    private Country countryOfManufacture;
    private RecordRef defaultItemShipMethod;
    private ShippingCarrier itemCarrier;
    private Boolean roundUpAsComponent;
    private Double purchaseOrderQuantity;
    private Double purchaseOrderAmount;
    private Double purchaseOrderQuantityDiff;
    private Double receiptQuantity;
    private Double receiptAmount;
    private Double receiptQuantityDiff;
    private RecordRefList itemShipMethodList;
    private String manufacturerTaxId;
    private String scheduleBNumber;
    private Long scheduleBQuantity;
    private ScheduleBCode scheduleBCode;
    private String manufacturerTariff;
    private ItemPreferenceCriterion preferenceCriterion;
    private Long minimumQuantity;
    private Boolean enforceMinQtyInternally;
    private Long maximumQuantity;
    private RecordRef shipPackage;
    private Boolean shipIndividually;
    private RecordRef softDescriptor;
    private RecordRef costCategory;
    private Boolean pricesIncludeTax;
    private RecordRef quantityPricingSchedule;
    private Boolean useMarginalRates;
    private ItemCostEstimateType costEstimateType;
    private Double costEstimate;
    private Double transferPrice;
    private ItemOverallQuantityPricingType overallQuantityPricingType;
    private RecordRef pricingGroup;
    private RecordRef preferredLocation;
    private Boolean isStorePickupAllowed;
    private Double vsoePrice;
    private VsoeSopGroup vsoeSopGroup;
    private VsoeDeferral vsoeDeferral;
    private VsoePermitDiscount vsoePermitDiscount;
    private Boolean vsoeDelivered;
    private RecordRef itemRevenueCategory;
    private Double cost;
    private String costUnits;
    private String quantityReorderUnits;
    private Long reorderMultiple;
    private Double totalValue;
    private Boolean useBins;
    private Long leadTime;
    private Boolean autoLeadTime;
    private Boolean autoReorderPoint;
    private Boolean autoPreferredStockLevel;
    private Double preferredStockLevelDays;
    private Double averageCost;
    private Double safetyStockLevel;
    private Double lastPurchasePrice;
    private Long safetyStockLevelDays;
    private Long backwardConsumptionDays;
    private Boolean seasonalDemand;
    private Double demandModifier;
    private String storeDisplayName;
    private RecordRef storeDisplayThumbnail;
    private ItemWeightUnit weightUnit;
    private String weightUnits;
    private RecordRef storeDisplayImage;
    private String storeDescription;
    private String storeDetailedDescription;
    private RecordRef storeItemTemplate;
    private String pageTitle;
    private String metaTagHtml;
    private Boolean excludeFromSitemap;
    private SitemapPriority sitemapPriority;
    private String searchKeywords;
    private Boolean isDonationItem;
    private Boolean showDefaultDonationAmount;
    private Double maxDonationAmount;
    private String shoppingDotComCategory;
    private Long shopzillaCategoryId;
    private String nexTagCategory;
    private Double quantityOnHand;
    private String quantityOnHandUnits;
    private Double onHandValueMli;
    private String serialNumbers;
    private Double reorderPoint;
    private Double preferredStockLevel;
    private String reorderPointUnits;
    private Double defaultReturnCost;
    private RecordRef supplyReplenishmentMethod;
    private RecordRef alternateDemandSourceItem;
    private Double fixedLotSize;
    private PeriodicLotSizeType periodicLotSizeType;
    private RecordRef supplyType;
    private Long demandTimeFence;
    private Long supplyTimeFence;
    private Long rescheduleInDays;
    private Long rescheduleOutDays;
    private Long periodicLotSizeDays;
    private RecordRef supplyLotSizingMethod;
    private Long forwardConsumptionDays;
    private RecordRef demandSource;
    private Double quantityOnOrder;
    private String preferredStockLevelUnits;
    private Double quantityCommitted;
    private Double quantityAvailable;
    private Double quantityBackOrdered;
    private RecordRef purchaseTaxCode;
    private RecordRef purchasePriceVarianceAcct;
    private Double rate;
    private RecordRef salesTaxCode;
    private Boolean onSpecial;
    private Boolean dontShowPrice;
    private String noPriceMessage;
    private String outOfStockMessage;
    private String specialsDescription;
    private ItemOutOfStockBehavior outOfStockBehavior;
    private String relatedItemsDescription;
    private String featuredDescription;
    private ProductFeedList productFeedList;
    private String urlComponent;
    private ItemOptionsList itemOptionsList;
    private MatrixOptionList matrixOptionList;
    private ItemVendorList itemVendorList;
    private PricingMatrix pricingMatrix;
    private SerializedInventoryItemHierarchyVersionsList hierarchyVersionsList;
    private ItemAccountingBookDetailList accountingBookDetailList;
    private RecordRefList itemNumberOptionsList;
    private SerializedInventoryItemNumbersList numbersList;
    private InventoryItemBinNumberList binNumberList;
    private SiteCategoryList siteCategoryList;
    private SerializedInventoryItemLocationsList locationsList;
    private TranslationList translationsList;
    private PresentationItemList presentationItemList;
    private Long futureHorizon;
    private RecordRef consumptionUnit;
    private Boolean enableCatchWeight;
    private RecordRef secondaryUnitsType;
    private RecordRef secondaryBaseUnit;
    private Double conversionRate;
    private RecordRef secondaryStockUnit;
    private RecordRef secondarySaleUnit;
    private RecordRef secondaryPurchaseUnit;
    private RecordRef secondaryConsumptionUnit;
    private Double lowerWarningLimit;
    private Double upperWarningLimit;
    private RecordRef planningItemCategory;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SerializedInventoryItem.class, true);

    public SerializedInventoryItem() {
    }

    public SerializedInventoryItem(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef customForm, String itemId, String upcCode, String displayName, ItemMatrixType matrixType, Boolean includeChildren, String vendorName, RecordRef parent, Boolean isOnline, Boolean isHazmatItem, String hazmatId, String hazmatShippingName, String hazmatHazardClass, HazmatPackingGroup hazmatPackingGroup, String hazmatItemUnits, Double hazmatItemUnitsQty, Boolean isGcoCompliant, Boolean offerSupport, Boolean isInactive, Boolean availableToPartners, RecordRef department, RecordRef _class, RecordRef location, ItemCostingMethod costingMethod, RecordRefList subsidiaryList, String purchaseDescription, Boolean copyDescription, RecordRef issueProduct, String currency, RecordRef cogsAccount, RecordRef intercoCogsAccount, RecordRef vendor, String salesDescription, Calendar lastInvtCountDate, Calendar nextInvtCountDate, Long invtCountInterval, ItemInvtClassification invtClassification, RecordRef incomeAccount, RecordRef intercoIncomeAccount, Boolean isTaxable, RecordRef taxSchedule, RecordRef dropshipExpenseAccount, RecordRef revenueRecognitionRule, RecordRef revRecForecastRule, RecordRef revenueAllocationGroup, RecordRef createRevenuePlansOn, Boolean directRevenuePosting, RecordRef assetAccount, Boolean matchBillToReceipt, RecordRef billQtyVarianceAcct, RecordRef billPriceVarianceAcct, RecordRef billExchRateVarianceAcct, RecordRef gainLossAccount, Double shippingCost, Double handlingCost, Double weight, String costingMethodDisplay, String shippingCostUnits, String handlingCostUnits, RecordRef unitsType, RecordRef stockUnit, RecordRef purchaseUnit, RecordRef saleUnit, String minimumQuantityUnits, String safetyStockLevelUnits, RecordRef billingSchedule, Boolean trackLandedCost, String matrixItemNameTemplate, Boolean isDropShipItem, Boolean isSpecialOrderItem, String stockDescription, RecordRef deferredRevenueAccount, Boolean producer, String manufacturer, RecordRef revRecSchedule, String mpn, Boolean multManufactureAddr, String manufacturerAddr1, String manufacturerCity, String manufacturerState, String manufacturerZip, Country countryOfManufacture, RecordRef defaultItemShipMethod, ShippingCarrier itemCarrier, Boolean roundUpAsComponent, Double purchaseOrderQuantity, Double purchaseOrderAmount, Double purchaseOrderQuantityDiff, Double receiptQuantity, Double receiptAmount, Double receiptQuantityDiff, RecordRefList itemShipMethodList, String manufacturerTaxId, String scheduleBNumber, Long scheduleBQuantity, ScheduleBCode scheduleBCode, String manufacturerTariff, ItemPreferenceCriterion preferenceCriterion, Long minimumQuantity, Boolean enforceMinQtyInternally, Long maximumQuantity, RecordRef shipPackage, Boolean shipIndividually, RecordRef softDescriptor, RecordRef costCategory, Boolean pricesIncludeTax, RecordRef quantityPricingSchedule, Boolean useMarginalRates, ItemCostEstimateType costEstimateType, Double costEstimate, Double transferPrice, ItemOverallQuantityPricingType overallQuantityPricingType, RecordRef pricingGroup, RecordRef preferredLocation, Boolean isStorePickupAllowed, Double vsoePrice, VsoeSopGroup vsoeSopGroup, VsoeDeferral vsoeDeferral, VsoePermitDiscount vsoePermitDiscount, Boolean vsoeDelivered, RecordRef itemRevenueCategory, Double cost, String costUnits, String quantityReorderUnits, Long reorderMultiple, Double totalValue, Boolean useBins, Long leadTime, Boolean autoLeadTime, Boolean autoReorderPoint, Boolean autoPreferredStockLevel, Double preferredStockLevelDays, Double averageCost, Double safetyStockLevel, Double lastPurchasePrice, Long safetyStockLevelDays, Long backwardConsumptionDays, Boolean seasonalDemand, Double demandModifier, String storeDisplayName, RecordRef storeDisplayThumbnail, ItemWeightUnit weightUnit, String weightUnits, RecordRef storeDisplayImage, String storeDescription, String storeDetailedDescription, RecordRef storeItemTemplate, String pageTitle, String metaTagHtml, Boolean excludeFromSitemap, SitemapPriority sitemapPriority, String searchKeywords, Boolean isDonationItem, Boolean showDefaultDonationAmount, Double maxDonationAmount, String shoppingDotComCategory, Long shopzillaCategoryId, String nexTagCategory, Double quantityOnHand, String quantityOnHandUnits, Double onHandValueMli, String serialNumbers, Double reorderPoint, Double preferredStockLevel, String reorderPointUnits, Double defaultReturnCost, RecordRef supplyReplenishmentMethod, RecordRef alternateDemandSourceItem, Double fixedLotSize, PeriodicLotSizeType periodicLotSizeType, RecordRef supplyType, Long demandTimeFence, Long supplyTimeFence, Long rescheduleInDays, Long rescheduleOutDays, Long periodicLotSizeDays, RecordRef supplyLotSizingMethod, Long forwardConsumptionDays, RecordRef demandSource, Double quantityOnOrder, String preferredStockLevelUnits, Double quantityCommitted, Double quantityAvailable, Double quantityBackOrdered, RecordRef purchaseTaxCode, RecordRef purchasePriceVarianceAcct, Double rate, RecordRef salesTaxCode, Boolean onSpecial, Boolean dontShowPrice, String noPriceMessage, String outOfStockMessage, String specialsDescription, ItemOutOfStockBehavior outOfStockBehavior, String relatedItemsDescription, String featuredDescription, ProductFeedList productFeedList, String urlComponent, ItemOptionsList itemOptionsList, MatrixOptionList matrixOptionList, ItemVendorList itemVendorList, PricingMatrix pricingMatrix, SerializedInventoryItemHierarchyVersionsList hierarchyVersionsList, ItemAccountingBookDetailList accountingBookDetailList, RecordRefList itemNumberOptionsList, SerializedInventoryItemNumbersList numbersList, InventoryItemBinNumberList binNumberList, SiteCategoryList siteCategoryList, SerializedInventoryItemLocationsList locationsList, TranslationList translationsList, PresentationItemList presentationItemList, Long futureHorizon, RecordRef consumptionUnit, Boolean enableCatchWeight, RecordRef secondaryUnitsType, RecordRef secondaryBaseUnit, Double conversionRate, RecordRef secondaryStockUnit, RecordRef secondarySaleUnit, RecordRef secondaryPurchaseUnit, RecordRef secondaryConsumptionUnit, Double lowerWarningLimit, Double upperWarningLimit, RecordRef planningItemCategory, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.matrixType = matrixType;
        this.includeChildren = includeChildren;
        this.vendorName = vendorName;
        this.parent = parent;
        this.isOnline = isOnline;
        this.isHazmatItem = isHazmatItem;
        this.hazmatId = hazmatId;
        this.hazmatShippingName = hazmatShippingName;
        this.hazmatHazardClass = hazmatHazardClass;
        this.hazmatPackingGroup = hazmatPackingGroup;
        this.hazmatItemUnits = hazmatItemUnits;
        this.hazmatItemUnitsQty = hazmatItemUnitsQty;
        this.isGcoCompliant = isGcoCompliant;
        this.offerSupport = offerSupport;
        this.isInactive = isInactive;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.costingMethod = costingMethod;
        this.subsidiaryList = subsidiaryList;
        this.purchaseDescription = purchaseDescription;
        this.copyDescription = copyDescription;
        this.issueProduct = issueProduct;
        this.currency = currency;
        this.cogsAccount = cogsAccount;
        this.intercoCogsAccount = intercoCogsAccount;
        this.vendor = vendor;
        this.salesDescription = salesDescription;
        this.lastInvtCountDate = lastInvtCountDate;
        this.nextInvtCountDate = nextInvtCountDate;
        this.invtCountInterval = invtCountInterval;
        this.invtClassification = invtClassification;
        this.incomeAccount = incomeAccount;
        this.intercoIncomeAccount = intercoIncomeAccount;
        this.isTaxable = isTaxable;
        this.taxSchedule = taxSchedule;
        this.dropshipExpenseAccount = dropshipExpenseAccount;
        this.revenueRecognitionRule = revenueRecognitionRule;
        this.revRecForecastRule = revRecForecastRule;
        this.revenueAllocationGroup = revenueAllocationGroup;
        this.createRevenuePlansOn = createRevenuePlansOn;
        this.directRevenuePosting = directRevenuePosting;
        this.assetAccount = assetAccount;
        this.matchBillToReceipt = matchBillToReceipt;
        this.billQtyVarianceAcct = billQtyVarianceAcct;
        this.billPriceVarianceAcct = billPriceVarianceAcct;
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
        this.gainLossAccount = gainLossAccount;
        this.shippingCost = shippingCost;
        this.handlingCost = handlingCost;
        this.weight = weight;
        this.costingMethodDisplay = costingMethodDisplay;
        this.shippingCostUnits = shippingCostUnits;
        this.handlingCostUnits = handlingCostUnits;
        this.unitsType = unitsType;
        this.stockUnit = stockUnit;
        this.purchaseUnit = purchaseUnit;
        this.saleUnit = saleUnit;
        this.minimumQuantityUnits = minimumQuantityUnits;
        this.safetyStockLevelUnits = safetyStockLevelUnits;
        this.billingSchedule = billingSchedule;
        this.trackLandedCost = trackLandedCost;
        this.matrixItemNameTemplate = matrixItemNameTemplate;
        this.isDropShipItem = isDropShipItem;
        this.isSpecialOrderItem = isSpecialOrderItem;
        this.stockDescription = stockDescription;
        this.deferredRevenueAccount = deferredRevenueAccount;
        this.producer = producer;
        this.manufacturer = manufacturer;
        this.revRecSchedule = revRecSchedule;
        this.mpn = mpn;
        this.multManufactureAddr = multManufactureAddr;
        this.manufacturerAddr1 = manufacturerAddr1;
        this.manufacturerCity = manufacturerCity;
        this.manufacturerState = manufacturerState;
        this.manufacturerZip = manufacturerZip;
        this.countryOfManufacture = countryOfManufacture;
        this.defaultItemShipMethod = defaultItemShipMethod;
        this.itemCarrier = itemCarrier;
        this.roundUpAsComponent = roundUpAsComponent;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptQuantity = receiptQuantity;
        this.receiptAmount = receiptAmount;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.itemShipMethodList = itemShipMethodList;
        this.manufacturerTaxId = manufacturerTaxId;
        this.scheduleBNumber = scheduleBNumber;
        this.scheduleBQuantity = scheduleBQuantity;
        this.scheduleBCode = scheduleBCode;
        this.manufacturerTariff = manufacturerTariff;
        this.preferenceCriterion = preferenceCriterion;
        this.minimumQuantity = minimumQuantity;
        this.enforceMinQtyInternally = enforceMinQtyInternally;
        this.maximumQuantity = maximumQuantity;
        this.shipPackage = shipPackage;
        this.shipIndividually = shipIndividually;
        this.softDescriptor = softDescriptor;
        this.costCategory = costCategory;
        this.pricesIncludeTax = pricesIncludeTax;
        this.quantityPricingSchedule = quantityPricingSchedule;
        this.useMarginalRates = useMarginalRates;
        this.costEstimateType = costEstimateType;
        this.costEstimate = costEstimate;
        this.transferPrice = transferPrice;
        this.overallQuantityPricingType = overallQuantityPricingType;
        this.pricingGroup = pricingGroup;
        this.preferredLocation = preferredLocation;
        this.isStorePickupAllowed = isStorePickupAllowed;
        this.vsoePrice = vsoePrice;
        this.vsoeSopGroup = vsoeSopGroup;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.itemRevenueCategory = itemRevenueCategory;
        this.cost = cost;
        this.costUnits = costUnits;
        this.quantityReorderUnits = quantityReorderUnits;
        this.reorderMultiple = reorderMultiple;
        this.totalValue = totalValue;
        this.useBins = useBins;
        this.leadTime = leadTime;
        this.autoLeadTime = autoLeadTime;
        this.autoReorderPoint = autoReorderPoint;
        this.autoPreferredStockLevel = autoPreferredStockLevel;
        this.preferredStockLevelDays = preferredStockLevelDays;
        this.averageCost = averageCost;
        this.safetyStockLevel = safetyStockLevel;
        this.lastPurchasePrice = lastPurchasePrice;
        this.safetyStockLevelDays = safetyStockLevelDays;
        this.backwardConsumptionDays = backwardConsumptionDays;
        this.seasonalDemand = seasonalDemand;
        this.demandModifier = demandModifier;
        this.storeDisplayName = storeDisplayName;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.weightUnit = weightUnit;
        this.weightUnits = weightUnits;
        this.storeDisplayImage = storeDisplayImage;
        this.storeDescription = storeDescription;
        this.storeDetailedDescription = storeDetailedDescription;
        this.storeItemTemplate = storeItemTemplate;
        this.pageTitle = pageTitle;
        this.metaTagHtml = metaTagHtml;
        this.excludeFromSitemap = excludeFromSitemap;
        this.sitemapPriority = sitemapPriority;
        this.searchKeywords = searchKeywords;
        this.isDonationItem = isDonationItem;
        this.showDefaultDonationAmount = showDefaultDonationAmount;
        this.maxDonationAmount = maxDonationAmount;
        this.shoppingDotComCategory = shoppingDotComCategory;
        this.shopzillaCategoryId = shopzillaCategoryId;
        this.nexTagCategory = nexTagCategory;
        this.quantityOnHand = quantityOnHand;
        this.quantityOnHandUnits = quantityOnHandUnits;
        this.onHandValueMli = onHandValueMli;
        this.serialNumbers = serialNumbers;
        this.reorderPoint = reorderPoint;
        this.preferredStockLevel = preferredStockLevel;
        this.reorderPointUnits = reorderPointUnits;
        this.defaultReturnCost = defaultReturnCost;
        this.supplyReplenishmentMethod = supplyReplenishmentMethod;
        this.alternateDemandSourceItem = alternateDemandSourceItem;
        this.fixedLotSize = fixedLotSize;
        this.periodicLotSizeType = periodicLotSizeType;
        this.supplyType = supplyType;
        this.demandTimeFence = demandTimeFence;
        this.supplyTimeFence = supplyTimeFence;
        this.rescheduleInDays = rescheduleInDays;
        this.rescheduleOutDays = rescheduleOutDays;
        this.periodicLotSizeDays = periodicLotSizeDays;
        this.supplyLotSizingMethod = supplyLotSizingMethod;
        this.forwardConsumptionDays = forwardConsumptionDays;
        this.demandSource = demandSource;
        this.quantityOnOrder = quantityOnOrder;
        this.preferredStockLevelUnits = preferredStockLevelUnits;
        this.quantityCommitted = quantityCommitted;
        this.quantityAvailable = quantityAvailable;
        this.quantityBackOrdered = quantityBackOrdered;
        this.purchaseTaxCode = purchaseTaxCode;
        this.purchasePriceVarianceAcct = purchasePriceVarianceAcct;
        this.rate = rate;
        this.salesTaxCode = salesTaxCode;
        this.onSpecial = onSpecial;
        this.dontShowPrice = dontShowPrice;
        this.noPriceMessage = noPriceMessage;
        this.outOfStockMessage = outOfStockMessage;
        this.specialsDescription = specialsDescription;
        this.outOfStockBehavior = outOfStockBehavior;
        this.relatedItemsDescription = relatedItemsDescription;
        this.featuredDescription = featuredDescription;
        this.productFeedList = productFeedList;
        this.urlComponent = urlComponent;
        this.itemOptionsList = itemOptionsList;
        this.matrixOptionList = matrixOptionList;
        this.itemVendorList = itemVendorList;
        this.pricingMatrix = pricingMatrix;
        this.hierarchyVersionsList = hierarchyVersionsList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.itemNumberOptionsList = itemNumberOptionsList;
        this.numbersList = numbersList;
        this.binNumberList = binNumberList;
        this.siteCategoryList = siteCategoryList;
        this.locationsList = locationsList;
        this.translationsList = translationsList;
        this.presentationItemList = presentationItemList;
        this.futureHorizon = futureHorizon;
        this.consumptionUnit = consumptionUnit;
        this.enableCatchWeight = enableCatchWeight;
        this.secondaryUnitsType = secondaryUnitsType;
        this.secondaryBaseUnit = secondaryBaseUnit;
        this.conversionRate = conversionRate;
        this.secondaryStockUnit = secondaryStockUnit;
        this.secondarySaleUnit = secondarySaleUnit;
        this.secondaryPurchaseUnit = secondaryPurchaseUnit;
        this.secondaryConsumptionUnit = secondaryConsumptionUnit;
        this.lowerWarningLimit = lowerWarningLimit;
        this.upperWarningLimit = upperWarningLimit;
        this.planningItemCategory = planningItemCategory;
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

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUpcCode() {
        return this.upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ItemMatrixType getMatrixType() {
        return this.matrixType;
    }

    public void setMatrixType(ItemMatrixType matrixType) {
        this.matrixType = matrixType;
    }

    public Boolean getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public Boolean getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Boolean getIsHazmatItem() {
        return this.isHazmatItem;
    }

    public void setIsHazmatItem(Boolean isHazmatItem) {
        this.isHazmatItem = isHazmatItem;
    }

    public String getHazmatId() {
        return this.hazmatId;
    }

    public void setHazmatId(String hazmatId) {
        this.hazmatId = hazmatId;
    }

    public String getHazmatShippingName() {
        return this.hazmatShippingName;
    }

    public void setHazmatShippingName(String hazmatShippingName) {
        this.hazmatShippingName = hazmatShippingName;
    }

    public String getHazmatHazardClass() {
        return this.hazmatHazardClass;
    }

    public void setHazmatHazardClass(String hazmatHazardClass) {
        this.hazmatHazardClass = hazmatHazardClass;
    }

    public HazmatPackingGroup getHazmatPackingGroup() {
        return this.hazmatPackingGroup;
    }

    public void setHazmatPackingGroup(HazmatPackingGroup hazmatPackingGroup) {
        this.hazmatPackingGroup = hazmatPackingGroup;
    }

    public String getHazmatItemUnits() {
        return this.hazmatItemUnits;
    }

    public void setHazmatItemUnits(String hazmatItemUnits) {
        this.hazmatItemUnits = hazmatItemUnits;
    }

    public Double getHazmatItemUnitsQty() {
        return this.hazmatItemUnitsQty;
    }

    public void setHazmatItemUnitsQty(Double hazmatItemUnitsQty) {
        this.hazmatItemUnitsQty = hazmatItemUnitsQty;
    }

    public Boolean getIsGcoCompliant() {
        return this.isGcoCompliant;
    }

    public void setIsGcoCompliant(Boolean isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }

    public Boolean getOfferSupport() {
        return this.offerSupport;
    }

    public void setOfferSupport(Boolean offerSupport) {
        this.offerSupport = offerSupport;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getAvailableToPartners() {
        return this.availableToPartners;
    }

    public void setAvailableToPartners(Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public ItemCostingMethod getCostingMethod() {
        return this.costingMethod;
    }

    public void setCostingMethod(ItemCostingMethod costingMethod) {
        this.costingMethod = costingMethod;
    }

    public RecordRefList getSubsidiaryList() {
        return this.subsidiaryList;
    }

    public void setSubsidiaryList(RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public String getPurchaseDescription() {
        return this.purchaseDescription;
    }

    public void setPurchaseDescription(String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }

    public Boolean getCopyDescription() {
        return this.copyDescription;
    }

    public void setCopyDescription(Boolean copyDescription) {
        this.copyDescription = copyDescription;
    }

    public RecordRef getIssueProduct() {
        return this.issueProduct;
    }

    public void setIssueProduct(RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public RecordRef getCogsAccount() {
        return this.cogsAccount;
    }

    public void setCogsAccount(RecordRef cogsAccount) {
        this.cogsAccount = cogsAccount;
    }

    public RecordRef getIntercoCogsAccount() {
        return this.intercoCogsAccount;
    }

    public void setIntercoCogsAccount(RecordRef intercoCogsAccount) {
        this.intercoCogsAccount = intercoCogsAccount;
    }

    public RecordRef getVendor() {
        return this.vendor;
    }

    public void setVendor(RecordRef vendor) {
        this.vendor = vendor;
    }

    public String getSalesDescription() {
        return this.salesDescription;
    }

    public void setSalesDescription(String salesDescription) {
        this.salesDescription = salesDescription;
    }

    public Calendar getLastInvtCountDate() {
        return this.lastInvtCountDate;
    }

    public void setLastInvtCountDate(Calendar lastInvtCountDate) {
        this.lastInvtCountDate = lastInvtCountDate;
    }

    public Calendar getNextInvtCountDate() {
        return this.nextInvtCountDate;
    }

    public void setNextInvtCountDate(Calendar nextInvtCountDate) {
        this.nextInvtCountDate = nextInvtCountDate;
    }

    public Long getInvtCountInterval() {
        return this.invtCountInterval;
    }

    public void setInvtCountInterval(Long invtCountInterval) {
        this.invtCountInterval = invtCountInterval;
    }

    public ItemInvtClassification getInvtClassification() {
        return this.invtClassification;
    }

    public void setInvtClassification(ItemInvtClassification invtClassification) {
        this.invtClassification = invtClassification;
    }

    public RecordRef getIncomeAccount() {
        return this.incomeAccount;
    }

    public void setIncomeAccount(RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }

    public RecordRef getIntercoIncomeAccount() {
        return this.intercoIncomeAccount;
    }

    public void setIntercoIncomeAccount(RecordRef intercoIncomeAccount) {
        this.intercoIncomeAccount = intercoIncomeAccount;
    }

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public RecordRef getTaxSchedule() {
        return this.taxSchedule;
    }

    public void setTaxSchedule(RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }

    public RecordRef getDropshipExpenseAccount() {
        return this.dropshipExpenseAccount;
    }

    public void setDropshipExpenseAccount(RecordRef dropshipExpenseAccount) {
        this.dropshipExpenseAccount = dropshipExpenseAccount;
    }

    public RecordRef getRevenueRecognitionRule() {
        return this.revenueRecognitionRule;
    }

    public void setRevenueRecognitionRule(RecordRef revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }

    public RecordRef getRevRecForecastRule() {
        return this.revRecForecastRule;
    }

    public void setRevRecForecastRule(RecordRef revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }

    public RecordRef getRevenueAllocationGroup() {
        return this.revenueAllocationGroup;
    }

    public void setRevenueAllocationGroup(RecordRef revenueAllocationGroup) {
        this.revenueAllocationGroup = revenueAllocationGroup;
    }

    public RecordRef getCreateRevenuePlansOn() {
        return this.createRevenuePlansOn;
    }

    public void setCreateRevenuePlansOn(RecordRef createRevenuePlansOn) {
        this.createRevenuePlansOn = createRevenuePlansOn;
    }

    public Boolean getDirectRevenuePosting() {
        return this.directRevenuePosting;
    }

    public void setDirectRevenuePosting(Boolean directRevenuePosting) {
        this.directRevenuePosting = directRevenuePosting;
    }

    public RecordRef getAssetAccount() {
        return this.assetAccount;
    }

    public void setAssetAccount(RecordRef assetAccount) {
        this.assetAccount = assetAccount;
    }

    public Boolean getMatchBillToReceipt() {
        return this.matchBillToReceipt;
    }

    public void setMatchBillToReceipt(Boolean matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public RecordRef getBillQtyVarianceAcct() {
        return this.billQtyVarianceAcct;
    }

    public void setBillQtyVarianceAcct(RecordRef billQtyVarianceAcct) {
        this.billQtyVarianceAcct = billQtyVarianceAcct;
    }

    public RecordRef getBillPriceVarianceAcct() {
        return this.billPriceVarianceAcct;
    }

    public void setBillPriceVarianceAcct(RecordRef billPriceVarianceAcct) {
        this.billPriceVarianceAcct = billPriceVarianceAcct;
    }

    public RecordRef getBillExchRateVarianceAcct() {
        return this.billExchRateVarianceAcct;
    }

    public void setBillExchRateVarianceAcct(RecordRef billExchRateVarianceAcct) {
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
    }

    public RecordRef getGainLossAccount() {
        return this.gainLossAccount;
    }

    public void setGainLossAccount(RecordRef gainLossAccount) {
        this.gainLossAccount = gainLossAccount;
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

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getCostingMethodDisplay() {
        return this.costingMethodDisplay;
    }

    public void setCostingMethodDisplay(String costingMethodDisplay) {
        this.costingMethodDisplay = costingMethodDisplay;
    }

    public String getShippingCostUnits() {
        return this.shippingCostUnits;
    }

    public void setShippingCostUnits(String shippingCostUnits) {
        this.shippingCostUnits = shippingCostUnits;
    }

    public String getHandlingCostUnits() {
        return this.handlingCostUnits;
    }

    public void setHandlingCostUnits(String handlingCostUnits) {
        this.handlingCostUnits = handlingCostUnits;
    }

    public RecordRef getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(RecordRef unitsType) {
        this.unitsType = unitsType;
    }

    public RecordRef getStockUnit() {
        return this.stockUnit;
    }

    public void setStockUnit(RecordRef stockUnit) {
        this.stockUnit = stockUnit;
    }

    public RecordRef getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public void setPurchaseUnit(RecordRef purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public RecordRef getSaleUnit() {
        return this.saleUnit;
    }

    public void setSaleUnit(RecordRef saleUnit) {
        this.saleUnit = saleUnit;
    }

    public String getMinimumQuantityUnits() {
        return this.minimumQuantityUnits;
    }

    public void setMinimumQuantityUnits(String minimumQuantityUnits) {
        this.minimumQuantityUnits = minimumQuantityUnits;
    }

    public String getSafetyStockLevelUnits() {
        return this.safetyStockLevelUnits;
    }

    public void setSafetyStockLevelUnits(String safetyStockLevelUnits) {
        this.safetyStockLevelUnits = safetyStockLevelUnits;
    }

    public RecordRef getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public Boolean getTrackLandedCost() {
        return this.trackLandedCost;
    }

    public void setTrackLandedCost(Boolean trackLandedCost) {
        this.trackLandedCost = trackLandedCost;
    }

    public String getMatrixItemNameTemplate() {
        return this.matrixItemNameTemplate;
    }

    public void setMatrixItemNameTemplate(String matrixItemNameTemplate) {
        this.matrixItemNameTemplate = matrixItemNameTemplate;
    }

    public Boolean getIsDropShipItem() {
        return this.isDropShipItem;
    }

    public void setIsDropShipItem(Boolean isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }

    public Boolean getIsSpecialOrderItem() {
        return this.isSpecialOrderItem;
    }

    public void setIsSpecialOrderItem(Boolean isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }

    public String getStockDescription() {
        return this.stockDescription;
    }

    public void setStockDescription(String stockDescription) {
        this.stockDescription = stockDescription;
    }

    public RecordRef getDeferredRevenueAccount() {
        return this.deferredRevenueAccount;
    }

    public void setDeferredRevenueAccount(RecordRef deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }

    public Boolean getProducer() {
        return this.producer;
    }

    public void setProducer(Boolean producer) {
        this.producer = producer;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public String getMpn() {
        return this.mpn;
    }

    public void setMpn(String mpn) {
        this.mpn = mpn;
    }

    public Boolean getMultManufactureAddr() {
        return this.multManufactureAddr;
    }

    public void setMultManufactureAddr(Boolean multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }

    public String getManufacturerAddr1() {
        return this.manufacturerAddr1;
    }

    public void setManufacturerAddr1(String manufacturerAddr1) {
        this.manufacturerAddr1 = manufacturerAddr1;
    }

    public String getManufacturerCity() {
        return this.manufacturerCity;
    }

    public void setManufacturerCity(String manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }

    public String getManufacturerState() {
        return this.manufacturerState;
    }

    public void setManufacturerState(String manufacturerState) {
        this.manufacturerState = manufacturerState;
    }

    public String getManufacturerZip() {
        return this.manufacturerZip;
    }

    public void setManufacturerZip(String manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }

    public Country getCountryOfManufacture() {
        return this.countryOfManufacture;
    }

    public void setCountryOfManufacture(Country countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public RecordRef getDefaultItemShipMethod() {
        return this.defaultItemShipMethod;
    }

    public void setDefaultItemShipMethod(RecordRef defaultItemShipMethod) {
        this.defaultItemShipMethod = defaultItemShipMethod;
    }

    public ShippingCarrier getItemCarrier() {
        return this.itemCarrier;
    }

    public void setItemCarrier(ShippingCarrier itemCarrier) {
        this.itemCarrier = itemCarrier;
    }

    public Boolean getRoundUpAsComponent() {
        return this.roundUpAsComponent;
    }

    public void setRoundUpAsComponent(Boolean roundUpAsComponent) {
        this.roundUpAsComponent = roundUpAsComponent;
    }

    public Double getPurchaseOrderQuantity() {
        return this.purchaseOrderQuantity;
    }

    public void setPurchaseOrderQuantity(Double purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public Double getPurchaseOrderAmount() {
        return this.purchaseOrderAmount;
    }

    public void setPurchaseOrderAmount(Double purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public Double getPurchaseOrderQuantityDiff() {
        return this.purchaseOrderQuantityDiff;
    }

    public void setPurchaseOrderQuantityDiff(Double purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public Double getReceiptQuantity() {
        return this.receiptQuantity;
    }

    public void setReceiptQuantity(Double receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public Double getReceiptAmount() {
        return this.receiptAmount;
    }

    public void setReceiptAmount(Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public Double getReceiptQuantityDiff() {
        return this.receiptQuantityDiff;
    }

    public void setReceiptQuantityDiff(Double receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public RecordRefList getItemShipMethodList() {
        return this.itemShipMethodList;
    }

    public void setItemShipMethodList(RecordRefList itemShipMethodList) {
        this.itemShipMethodList = itemShipMethodList;
    }

    public String getManufacturerTaxId() {
        return this.manufacturerTaxId;
    }

    public void setManufacturerTaxId(String manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }

    public String getScheduleBNumber() {
        return this.scheduleBNumber;
    }

    public void setScheduleBNumber(String scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }

    public Long getScheduleBQuantity() {
        return this.scheduleBQuantity;
    }

    public void setScheduleBQuantity(Long scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }

    public ScheduleBCode getScheduleBCode() {
        return this.scheduleBCode;
    }

    public void setScheduleBCode(ScheduleBCode scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }

    public String getManufacturerTariff() {
        return this.manufacturerTariff;
    }

    public void setManufacturerTariff(String manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }

    public ItemPreferenceCriterion getPreferenceCriterion() {
        return this.preferenceCriterion;
    }

    public void setPreferenceCriterion(ItemPreferenceCriterion preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public void setMinimumQuantity(Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public Boolean getEnforceMinQtyInternally() {
        return this.enforceMinQtyInternally;
    }

    public void setEnforceMinQtyInternally(Boolean enforceMinQtyInternally) {
        this.enforceMinQtyInternally = enforceMinQtyInternally;
    }

    public Long getMaximumQuantity() {
        return this.maximumQuantity;
    }

    public void setMaximumQuantity(Long maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public RecordRef getShipPackage() {
        return this.shipPackage;
    }

    public void setShipPackage(RecordRef shipPackage) {
        this.shipPackage = shipPackage;
    }

    public Boolean getShipIndividually() {
        return this.shipIndividually;
    }

    public void setShipIndividually(Boolean shipIndividually) {
        this.shipIndividually = shipIndividually;
    }

    public RecordRef getSoftDescriptor() {
        return this.softDescriptor;
    }

    public void setSoftDescriptor(RecordRef softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public RecordRef getCostCategory() {
        return this.costCategory;
    }

    public void setCostCategory(RecordRef costCategory) {
        this.costCategory = costCategory;
    }

    public Boolean getPricesIncludeTax() {
        return this.pricesIncludeTax;
    }

    public void setPricesIncludeTax(Boolean pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }

    public RecordRef getQuantityPricingSchedule() {
        return this.quantityPricingSchedule;
    }

    public void setQuantityPricingSchedule(RecordRef quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }

    public Boolean getUseMarginalRates() {
        return this.useMarginalRates;
    }

    public void setUseMarginalRates(Boolean useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }

    public ItemCostEstimateType getCostEstimateType() {
        return this.costEstimateType;
    }

    public void setCostEstimateType(ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public Double getCostEstimate() {
        return this.costEstimate;
    }

    public void setCostEstimate(Double costEstimate) {
        this.costEstimate = costEstimate;
    }

    public Double getTransferPrice() {
        return this.transferPrice;
    }

    public void setTransferPrice(Double transferPrice) {
        this.transferPrice = transferPrice;
    }

    public ItemOverallQuantityPricingType getOverallQuantityPricingType() {
        return this.overallQuantityPricingType;
    }

    public void setOverallQuantityPricingType(ItemOverallQuantityPricingType overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }

    public RecordRef getPricingGroup() {
        return this.pricingGroup;
    }

    public void setPricingGroup(RecordRef pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public RecordRef getPreferredLocation() {
        return this.preferredLocation;
    }

    public void setPreferredLocation(RecordRef preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public Boolean getIsStorePickupAllowed() {
        return this.isStorePickupAllowed;
    }

    public void setIsStorePickupAllowed(Boolean isStorePickupAllowed) {
        this.isStorePickupAllowed = isStorePickupAllowed;
    }

    public Double getVsoePrice() {
        return this.vsoePrice;
    }

    public void setVsoePrice(Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public VsoeSopGroup getVsoeSopGroup() {
        return this.vsoeSopGroup;
    }

    public void setVsoeSopGroup(VsoeSopGroup vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }

    public VsoeDeferral getVsoeDeferral() {
        return this.vsoeDeferral;
    }

    public void setVsoeDeferral(VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public VsoePermitDiscount getVsoePermitDiscount() {
        return this.vsoePermitDiscount;
    }

    public void setVsoePermitDiscount(VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public Boolean getVsoeDelivered() {
        return this.vsoeDelivered;
    }

    public void setVsoeDelivered(Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public RecordRef getItemRevenueCategory() {
        return this.itemRevenueCategory;
    }

    public void setItemRevenueCategory(RecordRef itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCostUnits() {
        return this.costUnits;
    }

    public void setCostUnits(String costUnits) {
        this.costUnits = costUnits;
    }

    public String getQuantityReorderUnits() {
        return this.quantityReorderUnits;
    }

    public void setQuantityReorderUnits(String quantityReorderUnits) {
        this.quantityReorderUnits = quantityReorderUnits;
    }

    public Long getReorderMultiple() {
        return this.reorderMultiple;
    }

    public void setReorderMultiple(Long reorderMultiple) {
        this.reorderMultiple = reorderMultiple;
    }

    public Double getTotalValue() {
        return this.totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public Boolean getUseBins() {
        return this.useBins;
    }

    public void setUseBins(Boolean useBins) {
        this.useBins = useBins;
    }

    public Long getLeadTime() {
        return this.leadTime;
    }

    public void setLeadTime(Long leadTime) {
        this.leadTime = leadTime;
    }

    public Boolean getAutoLeadTime() {
        return this.autoLeadTime;
    }

    public void setAutoLeadTime(Boolean autoLeadTime) {
        this.autoLeadTime = autoLeadTime;
    }

    public Boolean getAutoReorderPoint() {
        return this.autoReorderPoint;
    }

    public void setAutoReorderPoint(Boolean autoReorderPoint) {
        this.autoReorderPoint = autoReorderPoint;
    }

    public Boolean getAutoPreferredStockLevel() {
        return this.autoPreferredStockLevel;
    }

    public void setAutoPreferredStockLevel(Boolean autoPreferredStockLevel) {
        this.autoPreferredStockLevel = autoPreferredStockLevel;
    }

    public Double getPreferredStockLevelDays() {
        return this.preferredStockLevelDays;
    }

    public void setPreferredStockLevelDays(Double preferredStockLevelDays) {
        this.preferredStockLevelDays = preferredStockLevelDays;
    }

    public Double getAverageCost() {
        return this.averageCost;
    }

    public void setAverageCost(Double averageCost) {
        this.averageCost = averageCost;
    }

    public Double getSafetyStockLevel() {
        return this.safetyStockLevel;
    }

    public void setSafetyStockLevel(Double safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public Double getLastPurchasePrice() {
        return this.lastPurchasePrice;
    }

    public void setLastPurchasePrice(Double lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }

    public Long getSafetyStockLevelDays() {
        return this.safetyStockLevelDays;
    }

    public void setSafetyStockLevelDays(Long safetyStockLevelDays) {
        this.safetyStockLevelDays = safetyStockLevelDays;
    }

    public Long getBackwardConsumptionDays() {
        return this.backwardConsumptionDays;
    }

    public void setBackwardConsumptionDays(Long backwardConsumptionDays) {
        this.backwardConsumptionDays = backwardConsumptionDays;
    }

    public Boolean getSeasonalDemand() {
        return this.seasonalDemand;
    }

    public void setSeasonalDemand(Boolean seasonalDemand) {
        this.seasonalDemand = seasonalDemand;
    }

    public Double getDemandModifier() {
        return this.demandModifier;
    }

    public void setDemandModifier(Double demandModifier) {
        this.demandModifier = demandModifier;
    }

    public String getStoreDisplayName() {
        return this.storeDisplayName;
    }

    public void setStoreDisplayName(String storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }

    public RecordRef getStoreDisplayThumbnail() {
        return this.storeDisplayThumbnail;
    }

    public void setStoreDisplayThumbnail(RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }

    public ItemWeightUnit getWeightUnit() {
        return this.weightUnit;
    }

    public void setWeightUnit(ItemWeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getWeightUnits() {
        return this.weightUnits;
    }

    public void setWeightUnits(String weightUnits) {
        this.weightUnits = weightUnits;
    }

    public RecordRef getStoreDisplayImage() {
        return this.storeDisplayImage;
    }

    public void setStoreDisplayImage(RecordRef storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }

    public String getStoreDescription() {
        return this.storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }

    public String getStoreDetailedDescription() {
        return this.storeDetailedDescription;
    }

    public void setStoreDetailedDescription(String storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }

    public RecordRef getStoreItemTemplate() {
        return this.storeItemTemplate;
    }

    public void setStoreItemTemplate(RecordRef storeItemTemplate) {
        this.storeItemTemplate = storeItemTemplate;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getMetaTagHtml() {
        return this.metaTagHtml;
    }

    public void setMetaTagHtml(String metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }

    public Boolean getExcludeFromSitemap() {
        return this.excludeFromSitemap;
    }

    public void setExcludeFromSitemap(Boolean excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }

    public SitemapPriority getSitemapPriority() {
        return this.sitemapPriority;
    }

    public void setSitemapPriority(SitemapPriority sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }

    public String getSearchKeywords() {
        return this.searchKeywords;
    }

    public void setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public Boolean getIsDonationItem() {
        return this.isDonationItem;
    }

    public void setIsDonationItem(Boolean isDonationItem) {
        this.isDonationItem = isDonationItem;
    }

    public Boolean getShowDefaultDonationAmount() {
        return this.showDefaultDonationAmount;
    }

    public void setShowDefaultDonationAmount(Boolean showDefaultDonationAmount) {
        this.showDefaultDonationAmount = showDefaultDonationAmount;
    }

    public Double getMaxDonationAmount() {
        return this.maxDonationAmount;
    }

    public void setMaxDonationAmount(Double maxDonationAmount) {
        this.maxDonationAmount = maxDonationAmount;
    }

    public String getShoppingDotComCategory() {
        return this.shoppingDotComCategory;
    }

    public void setShoppingDotComCategory(String shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }

    public Long getShopzillaCategoryId() {
        return this.shopzillaCategoryId;
    }

    public void setShopzillaCategoryId(Long shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }

    public String getNexTagCategory() {
        return this.nexTagCategory;
    }

    public void setNexTagCategory(String nexTagCategory) {
        this.nexTagCategory = nexTagCategory;
    }

    public Double getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public String getQuantityOnHandUnits() {
        return this.quantityOnHandUnits;
    }

    public void setQuantityOnHandUnits(String quantityOnHandUnits) {
        this.quantityOnHandUnits = quantityOnHandUnits;
    }

    public Double getOnHandValueMli() {
        return this.onHandValueMli;
    }

    public void setOnHandValueMli(Double onHandValueMli) {
        this.onHandValueMli = onHandValueMli;
    }

    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public Double getReorderPoint() {
        return this.reorderPoint;
    }

    public void setReorderPoint(Double reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public Double getPreferredStockLevel() {
        return this.preferredStockLevel;
    }

    public void setPreferredStockLevel(Double preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }

    public String getReorderPointUnits() {
        return this.reorderPointUnits;
    }

    public void setReorderPointUnits(String reorderPointUnits) {
        this.reorderPointUnits = reorderPointUnits;
    }

    public Double getDefaultReturnCost() {
        return this.defaultReturnCost;
    }

    public void setDefaultReturnCost(Double defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }

    public RecordRef getSupplyReplenishmentMethod() {
        return this.supplyReplenishmentMethod;
    }

    public void setSupplyReplenishmentMethod(RecordRef supplyReplenishmentMethod) {
        this.supplyReplenishmentMethod = supplyReplenishmentMethod;
    }

    public RecordRef getAlternateDemandSourceItem() {
        return this.alternateDemandSourceItem;
    }

    public void setAlternateDemandSourceItem(RecordRef alternateDemandSourceItem) {
        this.alternateDemandSourceItem = alternateDemandSourceItem;
    }

    public Double getFixedLotSize() {
        return this.fixedLotSize;
    }

    public void setFixedLotSize(Double fixedLotSize) {
        this.fixedLotSize = fixedLotSize;
    }

    public PeriodicLotSizeType getPeriodicLotSizeType() {
        return this.periodicLotSizeType;
    }

    public void setPeriodicLotSizeType(PeriodicLotSizeType periodicLotSizeType) {
        this.periodicLotSizeType = periodicLotSizeType;
    }

    public RecordRef getSupplyType() {
        return this.supplyType;
    }

    public void setSupplyType(RecordRef supplyType) {
        this.supplyType = supplyType;
    }

    public Long getDemandTimeFence() {
        return this.demandTimeFence;
    }

    public void setDemandTimeFence(Long demandTimeFence) {
        this.demandTimeFence = demandTimeFence;
    }

    public Long getSupplyTimeFence() {
        return this.supplyTimeFence;
    }

    public void setSupplyTimeFence(Long supplyTimeFence) {
        this.supplyTimeFence = supplyTimeFence;
    }

    public Long getRescheduleInDays() {
        return this.rescheduleInDays;
    }

    public void setRescheduleInDays(Long rescheduleInDays) {
        this.rescheduleInDays = rescheduleInDays;
    }

    public Long getRescheduleOutDays() {
        return this.rescheduleOutDays;
    }

    public void setRescheduleOutDays(Long rescheduleOutDays) {
        this.rescheduleOutDays = rescheduleOutDays;
    }

    public Long getPeriodicLotSizeDays() {
        return this.periodicLotSizeDays;
    }

    public void setPeriodicLotSizeDays(Long periodicLotSizeDays) {
        this.periodicLotSizeDays = periodicLotSizeDays;
    }

    public RecordRef getSupplyLotSizingMethod() {
        return this.supplyLotSizingMethod;
    }

    public void setSupplyLotSizingMethod(RecordRef supplyLotSizingMethod) {
        this.supplyLotSizingMethod = supplyLotSizingMethod;
    }

    public Long getForwardConsumptionDays() {
        return this.forwardConsumptionDays;
    }

    public void setForwardConsumptionDays(Long forwardConsumptionDays) {
        this.forwardConsumptionDays = forwardConsumptionDays;
    }

    public RecordRef getDemandSource() {
        return this.demandSource;
    }

    public void setDemandSource(RecordRef demandSource) {
        this.demandSource = demandSource;
    }

    public Double getQuantityOnOrder() {
        return this.quantityOnOrder;
    }

    public void setQuantityOnOrder(Double quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }

    public String getPreferredStockLevelUnits() {
        return this.preferredStockLevelUnits;
    }

    public void setPreferredStockLevelUnits(String preferredStockLevelUnits) {
        this.preferredStockLevelUnits = preferredStockLevelUnits;
    }

    public Double getQuantityCommitted() {
        return this.quantityCommitted;
    }

    public void setQuantityCommitted(Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public Double getQuantityAvailable() {
        return this.quantityAvailable;
    }

    public void setQuantityAvailable(Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Double getQuantityBackOrdered() {
        return this.quantityBackOrdered;
    }

    public void setQuantityBackOrdered(Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }

    public RecordRef getPurchaseTaxCode() {
        return this.purchaseTaxCode;
    }

    public void setPurchaseTaxCode(RecordRef purchaseTaxCode) {
        this.purchaseTaxCode = purchaseTaxCode;
    }

    public RecordRef getPurchasePriceVarianceAcct() {
        return this.purchasePriceVarianceAcct;
    }

    public void setPurchasePriceVarianceAcct(RecordRef purchasePriceVarianceAcct) {
        this.purchasePriceVarianceAcct = purchasePriceVarianceAcct;
    }

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public RecordRef getSalesTaxCode() {
        return this.salesTaxCode;
    }

    public void setSalesTaxCode(RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }

    public Boolean getOnSpecial() {
        return this.onSpecial;
    }

    public void setOnSpecial(Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }

    public Boolean getDontShowPrice() {
        return this.dontShowPrice;
    }

    public void setDontShowPrice(Boolean dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }

    public String getNoPriceMessage() {
        return this.noPriceMessage;
    }

    public void setNoPriceMessage(String noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }

    public String getOutOfStockMessage() {
        return this.outOfStockMessage;
    }

    public void setOutOfStockMessage(String outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }

    public String getSpecialsDescription() {
        return this.specialsDescription;
    }

    public void setSpecialsDescription(String specialsDescription) {
        this.specialsDescription = specialsDescription;
    }

    public ItemOutOfStockBehavior getOutOfStockBehavior() {
        return this.outOfStockBehavior;
    }

    public void setOutOfStockBehavior(ItemOutOfStockBehavior outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }

    public String getRelatedItemsDescription() {
        return this.relatedItemsDescription;
    }

    public void setRelatedItemsDescription(String relatedItemsDescription) {
        this.relatedItemsDescription = relatedItemsDescription;
    }

    public String getFeaturedDescription() {
        return this.featuredDescription;
    }

    public void setFeaturedDescription(String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }

    public ProductFeedList getProductFeedList() {
        return this.productFeedList;
    }

    public void setProductFeedList(ProductFeedList productFeedList) {
        this.productFeedList = productFeedList;
    }

    public String getUrlComponent() {
        return this.urlComponent;
    }

    public void setUrlComponent(String urlComponent) {
        this.urlComponent = urlComponent;
    }

    public ItemOptionsList getItemOptionsList() {
        return this.itemOptionsList;
    }

    public void setItemOptionsList(ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
    }

    public MatrixOptionList getMatrixOptionList() {
        return this.matrixOptionList;
    }

    public void setMatrixOptionList(MatrixOptionList matrixOptionList) {
        this.matrixOptionList = matrixOptionList;
    }

    public ItemVendorList getItemVendorList() {
        return this.itemVendorList;
    }

    public void setItemVendorList(ItemVendorList itemVendorList) {
        this.itemVendorList = itemVendorList;
    }

    public PricingMatrix getPricingMatrix() {
        return this.pricingMatrix;
    }

    public void setPricingMatrix(PricingMatrix pricingMatrix) {
        this.pricingMatrix = pricingMatrix;
    }

    public SerializedInventoryItemHierarchyVersionsList getHierarchyVersionsList() {
        return this.hierarchyVersionsList;
    }

    public void setHierarchyVersionsList(SerializedInventoryItemHierarchyVersionsList hierarchyVersionsList) {
        this.hierarchyVersionsList = hierarchyVersionsList;
    }

    public ItemAccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(ItemAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public RecordRefList getItemNumberOptionsList() {
        return this.itemNumberOptionsList;
    }

    public void setItemNumberOptionsList(RecordRefList itemNumberOptionsList) {
        this.itemNumberOptionsList = itemNumberOptionsList;
    }

    public SerializedInventoryItemNumbersList getNumbersList() {
        return this.numbersList;
    }

    public void setNumbersList(SerializedInventoryItemNumbersList numbersList) {
        this.numbersList = numbersList;
    }

    public InventoryItemBinNumberList getBinNumberList() {
        return this.binNumberList;
    }

    public void setBinNumberList(InventoryItemBinNumberList binNumberList) {
        this.binNumberList = binNumberList;
    }

    public SiteCategoryList getSiteCategoryList() {
        return this.siteCategoryList;
    }

    public void setSiteCategoryList(SiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }

    public SerializedInventoryItemLocationsList getLocationsList() {
        return this.locationsList;
    }

    public void setLocationsList(SerializedInventoryItemLocationsList locationsList) {
        this.locationsList = locationsList;
    }

    public TranslationList getTranslationsList() {
        return this.translationsList;
    }

    public void setTranslationsList(TranslationList translationsList) {
        this.translationsList = translationsList;
    }

    public PresentationItemList getPresentationItemList() {
        return this.presentationItemList;
    }

    public void setPresentationItemList(PresentationItemList presentationItemList) {
        this.presentationItemList = presentationItemList;
    }

    public Long getFutureHorizon() {
        return this.futureHorizon;
    }

    public void setFutureHorizon(Long futureHorizon) {
        this.futureHorizon = futureHorizon;
    }

    public RecordRef getConsumptionUnit() {
        return this.consumptionUnit;
    }

    public void setConsumptionUnit(RecordRef consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }

    public Boolean getEnableCatchWeight() {
        return this.enableCatchWeight;
    }

    public void setEnableCatchWeight(Boolean enableCatchWeight) {
        this.enableCatchWeight = enableCatchWeight;
    }

    public RecordRef getSecondaryUnitsType() {
        return this.secondaryUnitsType;
    }

    public void setSecondaryUnitsType(RecordRef secondaryUnitsType) {
        this.secondaryUnitsType = secondaryUnitsType;
    }

    public RecordRef getSecondaryBaseUnit() {
        return this.secondaryBaseUnit;
    }

    public void setSecondaryBaseUnit(RecordRef secondaryBaseUnit) {
        this.secondaryBaseUnit = secondaryBaseUnit;
    }

    public Double getConversionRate() {
        return this.conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public RecordRef getSecondaryStockUnit() {
        return this.secondaryStockUnit;
    }

    public void setSecondaryStockUnit(RecordRef secondaryStockUnit) {
        this.secondaryStockUnit = secondaryStockUnit;
    }

    public RecordRef getSecondarySaleUnit() {
        return this.secondarySaleUnit;
    }

    public void setSecondarySaleUnit(RecordRef secondarySaleUnit) {
        this.secondarySaleUnit = secondarySaleUnit;
    }

    public RecordRef getSecondaryPurchaseUnit() {
        return this.secondaryPurchaseUnit;
    }

    public void setSecondaryPurchaseUnit(RecordRef secondaryPurchaseUnit) {
        this.secondaryPurchaseUnit = secondaryPurchaseUnit;
    }

    public RecordRef getSecondaryConsumptionUnit() {
        return this.secondaryConsumptionUnit;
    }

    public void setSecondaryConsumptionUnit(RecordRef secondaryConsumptionUnit) {
        this.secondaryConsumptionUnit = secondaryConsumptionUnit;
    }

    public Double getLowerWarningLimit() {
        return this.lowerWarningLimit;
    }

    public void setLowerWarningLimit(Double lowerWarningLimit) {
        this.lowerWarningLimit = lowerWarningLimit;
    }

    public Double getUpperWarningLimit() {
        return this.upperWarningLimit;
    }

    public void setUpperWarningLimit(Double upperWarningLimit) {
        this.upperWarningLimit = upperWarningLimit;
    }

    public RecordRef getPlanningItemCategory() {
        return this.planningItemCategory;
    }

    public void setPlanningItemCategory(RecordRef planningItemCategory) {
        this.planningItemCategory = planningItemCategory;
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
        if (!(obj instanceof SerializedInventoryItem)) {
            return false;
        }
        SerializedInventoryItem other = (SerializedInventoryItem)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && this.upcCode.equals(other.getUpcCode())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.matrixType == null && other.getMatrixType() == null || this.matrixType != null && this.matrixType.equals(other.getMatrixType())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && this.isOnline.equals(other.getIsOnline())) && (this.isHazmatItem == null && other.getIsHazmatItem() == null || this.isHazmatItem != null && this.isHazmatItem.equals(other.getIsHazmatItem())) && (this.hazmatId == null && other.getHazmatId() == null || this.hazmatId != null && this.hazmatId.equals(other.getHazmatId())) && (this.hazmatShippingName == null && other.getHazmatShippingName() == null || this.hazmatShippingName != null && this.hazmatShippingName.equals(other.getHazmatShippingName())) && (this.hazmatHazardClass == null && other.getHazmatHazardClass() == null || this.hazmatHazardClass != null && this.hazmatHazardClass.equals(other.getHazmatHazardClass())) && (this.hazmatPackingGroup == null && other.getHazmatPackingGroup() == null || this.hazmatPackingGroup != null && this.hazmatPackingGroup.equals(other.getHazmatPackingGroup())) && (this.hazmatItemUnits == null && other.getHazmatItemUnits() == null || this.hazmatItemUnits != null && this.hazmatItemUnits.equals(other.getHazmatItemUnits())) && (this.hazmatItemUnitsQty == null && other.getHazmatItemUnitsQty() == null || this.hazmatItemUnitsQty != null && this.hazmatItemUnitsQty.equals(other.getHazmatItemUnitsQty())) && (this.isGcoCompliant == null && other.getIsGcoCompliant() == null || this.isGcoCompliant != null && this.isGcoCompliant.equals(other.getIsGcoCompliant())) && (this.offerSupport == null && other.getOfferSupport() == null || this.offerSupport != null && this.offerSupport.equals(other.getOfferSupport())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.costingMethod == null && other.getCostingMethod() == null || this.costingMethod != null && this.costingMethod.equals(other.getCostingMethod())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.purchaseDescription == null && other.getPurchaseDescription() == null || this.purchaseDescription != null && this.purchaseDescription.equals(other.getPurchaseDescription())) && (this.copyDescription == null && other.getCopyDescription() == null || this.copyDescription != null && this.copyDescription.equals(other.getCopyDescription())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.cogsAccount == null && other.getCogsAccount() == null || this.cogsAccount != null && this.cogsAccount.equals(other.getCogsAccount())) && (this.intercoCogsAccount == null && other.getIntercoCogsAccount() == null || this.intercoCogsAccount != null && this.intercoCogsAccount.equals(other.getIntercoCogsAccount())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && this.vendor.equals(other.getVendor())) && (this.salesDescription == null && other.getSalesDescription() == null || this.salesDescription != null && this.salesDescription.equals(other.getSalesDescription())) && (this.lastInvtCountDate == null && other.getLastInvtCountDate() == null || this.lastInvtCountDate != null && this.lastInvtCountDate.equals(other.getLastInvtCountDate())) && (this.nextInvtCountDate == null && other.getNextInvtCountDate() == null || this.nextInvtCountDate != null && this.nextInvtCountDate.equals(other.getNextInvtCountDate())) && (this.invtCountInterval == null && other.getInvtCountInterval() == null || this.invtCountInterval != null && this.invtCountInterval.equals(other.getInvtCountInterval())) && (this.invtClassification == null && other.getInvtClassification() == null || this.invtClassification != null && this.invtClassification.equals(other.getInvtClassification())) && (this.incomeAccount == null && other.getIncomeAccount() == null || this.incomeAccount != null && this.incomeAccount.equals(other.getIncomeAccount())) && (this.intercoIncomeAccount == null && other.getIntercoIncomeAccount() == null || this.intercoIncomeAccount != null && this.intercoIncomeAccount.equals(other.getIntercoIncomeAccount())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && this.taxSchedule.equals(other.getTaxSchedule())) && (this.dropshipExpenseAccount == null && other.getDropshipExpenseAccount() == null || this.dropshipExpenseAccount != null && this.dropshipExpenseAccount.equals(other.getDropshipExpenseAccount())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && this.revRecForecastRule.equals(other.getRevRecForecastRule())) && (this.revenueAllocationGroup == null && other.getRevenueAllocationGroup() == null || this.revenueAllocationGroup != null && this.revenueAllocationGroup.equals(other.getRevenueAllocationGroup())) && (this.createRevenuePlansOn == null && other.getCreateRevenuePlansOn() == null || this.createRevenuePlansOn != null && this.createRevenuePlansOn.equals(other.getCreateRevenuePlansOn())) && (this.directRevenuePosting == null && other.getDirectRevenuePosting() == null || this.directRevenuePosting != null && this.directRevenuePosting.equals(other.getDirectRevenuePosting())) && (this.assetAccount == null && other.getAssetAccount() == null || this.assetAccount != null && this.assetAccount.equals(other.getAssetAccount())) && (this.matchBillToReceipt == null && other.getMatchBillToReceipt() == null || this.matchBillToReceipt != null && this.matchBillToReceipt.equals(other.getMatchBillToReceipt())) && (this.billQtyVarianceAcct == null && other.getBillQtyVarianceAcct() == null || this.billQtyVarianceAcct != null && this.billQtyVarianceAcct.equals(other.getBillQtyVarianceAcct())) && (this.billPriceVarianceAcct == null && other.getBillPriceVarianceAcct() == null || this.billPriceVarianceAcct != null && this.billPriceVarianceAcct.equals(other.getBillPriceVarianceAcct())) && (this.billExchRateVarianceAcct == null && other.getBillExchRateVarianceAcct() == null || this.billExchRateVarianceAcct != null && this.billExchRateVarianceAcct.equals(other.getBillExchRateVarianceAcct())) && (this.gainLossAccount == null && other.getGainLossAccount() == null || this.gainLossAccount != null && this.gainLossAccount.equals(other.getGainLossAccount())) && (this.shippingCost == null && other.getShippingCost() == null || this.shippingCost != null && this.shippingCost.equals(other.getShippingCost())) && (this.handlingCost == null && other.getHandlingCost() == null || this.handlingCost != null && this.handlingCost.equals(other.getHandlingCost())) && (this.weight == null && other.getWeight() == null || this.weight != null && this.weight.equals(other.getWeight())) && (this.costingMethodDisplay == null && other.getCostingMethodDisplay() == null || this.costingMethodDisplay != null && this.costingMethodDisplay.equals(other.getCostingMethodDisplay())) && (this.shippingCostUnits == null && other.getShippingCostUnits() == null || this.shippingCostUnits != null && this.shippingCostUnits.equals(other.getShippingCostUnits())) && (this.handlingCostUnits == null && other.getHandlingCostUnits() == null || this.handlingCostUnits != null && this.handlingCostUnits.equals(other.getHandlingCostUnits())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && this.unitsType.equals(other.getUnitsType())) && (this.stockUnit == null && other.getStockUnit() == null || this.stockUnit != null && this.stockUnit.equals(other.getStockUnit())) && (this.purchaseUnit == null && other.getPurchaseUnit() == null || this.purchaseUnit != null && this.purchaseUnit.equals(other.getPurchaseUnit())) && (this.saleUnit == null && other.getSaleUnit() == null || this.saleUnit != null && this.saleUnit.equals(other.getSaleUnit())) && (this.minimumQuantityUnits == null && other.getMinimumQuantityUnits() == null || this.minimumQuantityUnits != null && this.minimumQuantityUnits.equals(other.getMinimumQuantityUnits())) && (this.safetyStockLevelUnits == null && other.getSafetyStockLevelUnits() == null || this.safetyStockLevelUnits != null && this.safetyStockLevelUnits.equals(other.getSafetyStockLevelUnits())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.trackLandedCost == null && other.getTrackLandedCost() == null || this.trackLandedCost != null && this.trackLandedCost.equals(other.getTrackLandedCost())) && (this.matrixItemNameTemplate == null && other.getMatrixItemNameTemplate() == null || this.matrixItemNameTemplate != null && this.matrixItemNameTemplate.equals(other.getMatrixItemNameTemplate())) && (this.isDropShipItem == null && other.getIsDropShipItem() == null || this.isDropShipItem != null && this.isDropShipItem.equals(other.getIsDropShipItem())) && (this.isSpecialOrderItem == null && other.getIsSpecialOrderItem() == null || this.isSpecialOrderItem != null && this.isSpecialOrderItem.equals(other.getIsSpecialOrderItem())) && (this.stockDescription == null && other.getStockDescription() == null || this.stockDescription != null && this.stockDescription.equals(other.getStockDescription())) && (this.deferredRevenueAccount == null && other.getDeferredRevenueAccount() == null || this.deferredRevenueAccount != null && this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount())) && (this.producer == null && other.getProducer() == null || this.producer != null && this.producer.equals(other.getProducer())) && (this.manufacturer == null && other.getManufacturer() == null || this.manufacturer != null && this.manufacturer.equals(other.getManufacturer())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.mpn == null && other.getMpn() == null || this.mpn != null && this.mpn.equals(other.getMpn())) && (this.multManufactureAddr == null && other.getMultManufactureAddr() == null || this.multManufactureAddr != null && this.multManufactureAddr.equals(other.getMultManufactureAddr())) && (this.manufacturerAddr1 == null && other.getManufacturerAddr1() == null || this.manufacturerAddr1 != null && this.manufacturerAddr1.equals(other.getManufacturerAddr1())) && (this.manufacturerCity == null && other.getManufacturerCity() == null || this.manufacturerCity != null && this.manufacturerCity.equals(other.getManufacturerCity())) && (this.manufacturerState == null && other.getManufacturerState() == null || this.manufacturerState != null && this.manufacturerState.equals(other.getManufacturerState())) && (this.manufacturerZip == null && other.getManufacturerZip() == null || this.manufacturerZip != null && this.manufacturerZip.equals(other.getManufacturerZip())) && (this.countryOfManufacture == null && other.getCountryOfManufacture() == null || this.countryOfManufacture != null && this.countryOfManufacture.equals(other.getCountryOfManufacture())) && (this.defaultItemShipMethod == null && other.getDefaultItemShipMethod() == null || this.defaultItemShipMethod != null && this.defaultItemShipMethod.equals(other.getDefaultItemShipMethod())) && (this.itemCarrier == null && other.getItemCarrier() == null || this.itemCarrier != null && this.itemCarrier.equals(other.getItemCarrier())) && (this.roundUpAsComponent == null && other.getRoundUpAsComponent() == null || this.roundUpAsComponent != null && this.roundUpAsComponent.equals(other.getRoundUpAsComponent())) && (this.purchaseOrderQuantity == null && other.getPurchaseOrderQuantity() == null || this.purchaseOrderQuantity != null && this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity())) && (this.purchaseOrderAmount == null && other.getPurchaseOrderAmount() == null || this.purchaseOrderAmount != null && this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount())) && (this.purchaseOrderQuantityDiff == null && other.getPurchaseOrderQuantityDiff() == null || this.purchaseOrderQuantityDiff != null && this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff())) && (this.receiptQuantity == null && other.getReceiptQuantity() == null || this.receiptQuantity != null && this.receiptQuantity.equals(other.getReceiptQuantity())) && (this.receiptAmount == null && other.getReceiptAmount() == null || this.receiptAmount != null && this.receiptAmount.equals(other.getReceiptAmount())) && (this.receiptQuantityDiff == null && other.getReceiptQuantityDiff() == null || this.receiptQuantityDiff != null && this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff())) && (this.itemShipMethodList == null && other.getItemShipMethodList() == null || this.itemShipMethodList != null && this.itemShipMethodList.equals(other.getItemShipMethodList())) && (this.manufacturerTaxId == null && other.getManufacturerTaxId() == null || this.manufacturerTaxId != null && this.manufacturerTaxId.equals(other.getManufacturerTaxId())) && (this.scheduleBNumber == null && other.getScheduleBNumber() == null || this.scheduleBNumber != null && this.scheduleBNumber.equals(other.getScheduleBNumber())) && (this.scheduleBQuantity == null && other.getScheduleBQuantity() == null || this.scheduleBQuantity != null && this.scheduleBQuantity.equals(other.getScheduleBQuantity())) && (this.scheduleBCode == null && other.getScheduleBCode() == null || this.scheduleBCode != null && this.scheduleBCode.equals(other.getScheduleBCode())) && (this.manufacturerTariff == null && other.getManufacturerTariff() == null || this.manufacturerTariff != null && this.manufacturerTariff.equals(other.getManufacturerTariff())) && (this.preferenceCriterion == null && other.getPreferenceCriterion() == null || this.preferenceCriterion != null && this.preferenceCriterion.equals(other.getPreferenceCriterion())) && (this.minimumQuantity == null && other.getMinimumQuantity() == null || this.minimumQuantity != null && this.minimumQuantity.equals(other.getMinimumQuantity())) && (this.enforceMinQtyInternally == null && other.getEnforceMinQtyInternally() == null || this.enforceMinQtyInternally != null && this.enforceMinQtyInternally.equals(other.getEnforceMinQtyInternally())) && (this.maximumQuantity == null && other.getMaximumQuantity() == null || this.maximumQuantity != null && this.maximumQuantity.equals(other.getMaximumQuantity())) && (this.shipPackage == null && other.getShipPackage() == null || this.shipPackage != null && this.shipPackage.equals(other.getShipPackage())) && (this.shipIndividually == null && other.getShipIndividually() == null || this.shipIndividually != null && this.shipIndividually.equals(other.getShipIndividually())) && (this.softDescriptor == null && other.getSoftDescriptor() == null || this.softDescriptor != null && this.softDescriptor.equals(other.getSoftDescriptor())) && (this.costCategory == null && other.getCostCategory() == null || this.costCategory != null && this.costCategory.equals(other.getCostCategory())) && (this.pricesIncludeTax == null && other.getPricesIncludeTax() == null || this.pricesIncludeTax != null && this.pricesIncludeTax.equals(other.getPricesIncludeTax())) && (this.quantityPricingSchedule == null && other.getQuantityPricingSchedule() == null || this.quantityPricingSchedule != null && this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule())) && (this.useMarginalRates == null && other.getUseMarginalRates() == null || this.useMarginalRates != null && this.useMarginalRates.equals(other.getUseMarginalRates())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.transferPrice == null && other.getTransferPrice() == null || this.transferPrice != null && this.transferPrice.equals(other.getTransferPrice())) && (this.overallQuantityPricingType == null && other.getOverallQuantityPricingType() == null || this.overallQuantityPricingType != null && this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType())) && (this.pricingGroup == null && other.getPricingGroup() == null || this.pricingGroup != null && this.pricingGroup.equals(other.getPricingGroup())) && (this.preferredLocation == null && other.getPreferredLocation() == null || this.preferredLocation != null && this.preferredLocation.equals(other.getPreferredLocation())) && (this.isStorePickupAllowed == null && other.getIsStorePickupAllowed() == null || this.isStorePickupAllowed != null && this.isStorePickupAllowed.equals(other.getIsStorePickupAllowed())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && this.vsoeSopGroup.equals(other.getVsoeSopGroup())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && this.itemRevenueCategory.equals(other.getItemRevenueCategory())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.costUnits == null && other.getCostUnits() == null || this.costUnits != null && this.costUnits.equals(other.getCostUnits())) && (this.quantityReorderUnits == null && other.getQuantityReorderUnits() == null || this.quantityReorderUnits != null && this.quantityReorderUnits.equals(other.getQuantityReorderUnits())) && (this.reorderMultiple == null && other.getReorderMultiple() == null || this.reorderMultiple != null && this.reorderMultiple.equals(other.getReorderMultiple())) && (this.totalValue == null && other.getTotalValue() == null || this.totalValue != null && this.totalValue.equals(other.getTotalValue())) && (this.useBins == null && other.getUseBins() == null || this.useBins != null && this.useBins.equals(other.getUseBins())) && (this.leadTime == null && other.getLeadTime() == null || this.leadTime != null && this.leadTime.equals(other.getLeadTime())) && (this.autoLeadTime == null && other.getAutoLeadTime() == null || this.autoLeadTime != null && this.autoLeadTime.equals(other.getAutoLeadTime())) && (this.autoReorderPoint == null && other.getAutoReorderPoint() == null || this.autoReorderPoint != null && this.autoReorderPoint.equals(other.getAutoReorderPoint())) && (this.autoPreferredStockLevel == null && other.getAutoPreferredStockLevel() == null || this.autoPreferredStockLevel != null && this.autoPreferredStockLevel.equals(other.getAutoPreferredStockLevel())) && (this.preferredStockLevelDays == null && other.getPreferredStockLevelDays() == null || this.preferredStockLevelDays != null && this.preferredStockLevelDays.equals(other.getPreferredStockLevelDays())) && (this.averageCost == null && other.getAverageCost() == null || this.averageCost != null && this.averageCost.equals(other.getAverageCost())) && (this.safetyStockLevel == null && other.getSafetyStockLevel() == null || this.safetyStockLevel != null && this.safetyStockLevel.equals(other.getSafetyStockLevel())) && (this.lastPurchasePrice == null && other.getLastPurchasePrice() == null || this.lastPurchasePrice != null && this.lastPurchasePrice.equals(other.getLastPurchasePrice())) && (this.safetyStockLevelDays == null && other.getSafetyStockLevelDays() == null || this.safetyStockLevelDays != null && this.safetyStockLevelDays.equals(other.getSafetyStockLevelDays())) && (this.backwardConsumptionDays == null && other.getBackwardConsumptionDays() == null || this.backwardConsumptionDays != null && this.backwardConsumptionDays.equals(other.getBackwardConsumptionDays())) && (this.seasonalDemand == null && other.getSeasonalDemand() == null || this.seasonalDemand != null && this.seasonalDemand.equals(other.getSeasonalDemand())) && (this.demandModifier == null && other.getDemandModifier() == null || this.demandModifier != null && this.demandModifier.equals(other.getDemandModifier())) && (this.storeDisplayName == null && other.getStoreDisplayName() == null || this.storeDisplayName != null && this.storeDisplayName.equals(other.getStoreDisplayName())) && (this.storeDisplayThumbnail == null && other.getStoreDisplayThumbnail() == null || this.storeDisplayThumbnail != null && this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail())) && (this.weightUnit == null && other.getWeightUnit() == null || this.weightUnit != null && this.weightUnit.equals(other.getWeightUnit())) && (this.weightUnits == null && other.getWeightUnits() == null || this.weightUnits != null && this.weightUnits.equals(other.getWeightUnits())) && (this.storeDisplayImage == null && other.getStoreDisplayImage() == null || this.storeDisplayImage != null && this.storeDisplayImage.equals(other.getStoreDisplayImage())) && (this.storeDescription == null && other.getStoreDescription() == null || this.storeDescription != null && this.storeDescription.equals(other.getStoreDescription())) && (this.storeDetailedDescription == null && other.getStoreDetailedDescription() == null || this.storeDetailedDescription != null && this.storeDetailedDescription.equals(other.getStoreDetailedDescription())) && (this.storeItemTemplate == null && other.getStoreItemTemplate() == null || this.storeItemTemplate != null && this.storeItemTemplate.equals(other.getStoreItemTemplate())) && (this.pageTitle == null && other.getPageTitle() == null || this.pageTitle != null && this.pageTitle.equals(other.getPageTitle())) && (this.metaTagHtml == null && other.getMetaTagHtml() == null || this.metaTagHtml != null && this.metaTagHtml.equals(other.getMetaTagHtml())) && (this.excludeFromSitemap == null && other.getExcludeFromSitemap() == null || this.excludeFromSitemap != null && this.excludeFromSitemap.equals(other.getExcludeFromSitemap())) && (this.sitemapPriority == null && other.getSitemapPriority() == null || this.sitemapPriority != null && this.sitemapPriority.equals(other.getSitemapPriority())) && (this.searchKeywords == null && other.getSearchKeywords() == null || this.searchKeywords != null && this.searchKeywords.equals(other.getSearchKeywords())) && (this.isDonationItem == null && other.getIsDonationItem() == null || this.isDonationItem != null && this.isDonationItem.equals(other.getIsDonationItem())) && (this.showDefaultDonationAmount == null && other.getShowDefaultDonationAmount() == null || this.showDefaultDonationAmount != null && this.showDefaultDonationAmount.equals(other.getShowDefaultDonationAmount())) && (this.maxDonationAmount == null && other.getMaxDonationAmount() == null || this.maxDonationAmount != null && this.maxDonationAmount.equals(other.getMaxDonationAmount())) && (this.shoppingDotComCategory == null && other.getShoppingDotComCategory() == null || this.shoppingDotComCategory != null && this.shoppingDotComCategory.equals(other.getShoppingDotComCategory())) && (this.shopzillaCategoryId == null && other.getShopzillaCategoryId() == null || this.shopzillaCategoryId != null && this.shopzillaCategoryId.equals(other.getShopzillaCategoryId())) && (this.nexTagCategory == null && other.getNexTagCategory() == null || this.nexTagCategory != null && this.nexTagCategory.equals(other.getNexTagCategory())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.quantityOnHandUnits == null && other.getQuantityOnHandUnits() == null || this.quantityOnHandUnits != null && this.quantityOnHandUnits.equals(other.getQuantityOnHandUnits())) && (this.onHandValueMli == null && other.getOnHandValueMli() == null || this.onHandValueMli != null && this.onHandValueMli.equals(other.getOnHandValueMli())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.reorderPoint == null && other.getReorderPoint() == null || this.reorderPoint != null && this.reorderPoint.equals(other.getReorderPoint())) && (this.preferredStockLevel == null && other.getPreferredStockLevel() == null || this.preferredStockLevel != null && this.preferredStockLevel.equals(other.getPreferredStockLevel())) && (this.reorderPointUnits == null && other.getReorderPointUnits() == null || this.reorderPointUnits != null && this.reorderPointUnits.equals(other.getReorderPointUnits())) && (this.defaultReturnCost == null && other.getDefaultReturnCost() == null || this.defaultReturnCost != null && this.defaultReturnCost.equals(other.getDefaultReturnCost())) && (this.supplyReplenishmentMethod == null && other.getSupplyReplenishmentMethod() == null || this.supplyReplenishmentMethod != null && this.supplyReplenishmentMethod.equals(other.getSupplyReplenishmentMethod())) && (this.alternateDemandSourceItem == null && other.getAlternateDemandSourceItem() == null || this.alternateDemandSourceItem != null && this.alternateDemandSourceItem.equals(other.getAlternateDemandSourceItem())) && (this.fixedLotSize == null && other.getFixedLotSize() == null || this.fixedLotSize != null && this.fixedLotSize.equals(other.getFixedLotSize())) && (this.periodicLotSizeType == null && other.getPeriodicLotSizeType() == null || this.periodicLotSizeType != null && this.periodicLotSizeType.equals(other.getPeriodicLotSizeType())) && (this.supplyType == null && other.getSupplyType() == null || this.supplyType != null && this.supplyType.equals(other.getSupplyType())) && (this.demandTimeFence == null && other.getDemandTimeFence() == null || this.demandTimeFence != null && this.demandTimeFence.equals(other.getDemandTimeFence())) && (this.supplyTimeFence == null && other.getSupplyTimeFence() == null || this.supplyTimeFence != null && this.supplyTimeFence.equals(other.getSupplyTimeFence())) && (this.rescheduleInDays == null && other.getRescheduleInDays() == null || this.rescheduleInDays != null && this.rescheduleInDays.equals(other.getRescheduleInDays())) && (this.rescheduleOutDays == null && other.getRescheduleOutDays() == null || this.rescheduleOutDays != null && this.rescheduleOutDays.equals(other.getRescheduleOutDays())) && (this.periodicLotSizeDays == null && other.getPeriodicLotSizeDays() == null || this.periodicLotSizeDays != null && this.periodicLotSizeDays.equals(other.getPeriodicLotSizeDays())) && (this.supplyLotSizingMethod == null && other.getSupplyLotSizingMethod() == null || this.supplyLotSizingMethod != null && this.supplyLotSizingMethod.equals(other.getSupplyLotSizingMethod())) && (this.forwardConsumptionDays == null && other.getForwardConsumptionDays() == null || this.forwardConsumptionDays != null && this.forwardConsumptionDays.equals(other.getForwardConsumptionDays())) && (this.demandSource == null && other.getDemandSource() == null || this.demandSource != null && this.demandSource.equals(other.getDemandSource())) && (this.quantityOnOrder == null && other.getQuantityOnOrder() == null || this.quantityOnOrder != null && this.quantityOnOrder.equals(other.getQuantityOnOrder())) && (this.preferredStockLevelUnits == null && other.getPreferredStockLevelUnits() == null || this.preferredStockLevelUnits != null && this.preferredStockLevelUnits.equals(other.getPreferredStockLevelUnits())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && this.quantityCommitted.equals(other.getQuantityCommitted())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.quantityBackOrdered == null && other.getQuantityBackOrdered() == null || this.quantityBackOrdered != null && this.quantityBackOrdered.equals(other.getQuantityBackOrdered())) && (this.purchaseTaxCode == null && other.getPurchaseTaxCode() == null || this.purchaseTaxCode != null && this.purchaseTaxCode.equals(other.getPurchaseTaxCode())) && (this.purchasePriceVarianceAcct == null && other.getPurchasePriceVarianceAcct() == null || this.purchasePriceVarianceAcct != null && this.purchasePriceVarianceAcct.equals(other.getPurchasePriceVarianceAcct())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.salesTaxCode == null && other.getSalesTaxCode() == null || this.salesTaxCode != null && this.salesTaxCode.equals(other.getSalesTaxCode())) && (this.onSpecial == null && other.getOnSpecial() == null || this.onSpecial != null && this.onSpecial.equals(other.getOnSpecial())) && (this.dontShowPrice == null && other.getDontShowPrice() == null || this.dontShowPrice != null && this.dontShowPrice.equals(other.getDontShowPrice())) && (this.noPriceMessage == null && other.getNoPriceMessage() == null || this.noPriceMessage != null && this.noPriceMessage.equals(other.getNoPriceMessage())) && (this.outOfStockMessage == null && other.getOutOfStockMessage() == null || this.outOfStockMessage != null && this.outOfStockMessage.equals(other.getOutOfStockMessage())) && (this.specialsDescription == null && other.getSpecialsDescription() == null || this.specialsDescription != null && this.specialsDescription.equals(other.getSpecialsDescription())) && (this.outOfStockBehavior == null && other.getOutOfStockBehavior() == null || this.outOfStockBehavior != null && this.outOfStockBehavior.equals(other.getOutOfStockBehavior())) && (this.relatedItemsDescription == null && other.getRelatedItemsDescription() == null || this.relatedItemsDescription != null && this.relatedItemsDescription.equals(other.getRelatedItemsDescription())) && (this.featuredDescription == null && other.getFeaturedDescription() == null || this.featuredDescription != null && this.featuredDescription.equals(other.getFeaturedDescription())) && (this.productFeedList == null && other.getProductFeedList() == null || this.productFeedList != null && this.productFeedList.equals(other.getProductFeedList())) && (this.urlComponent == null && other.getUrlComponent() == null || this.urlComponent != null && this.urlComponent.equals(other.getUrlComponent())) && (this.itemOptionsList == null && other.getItemOptionsList() == null || this.itemOptionsList != null && this.itemOptionsList.equals(other.getItemOptionsList())) && (this.matrixOptionList == null && other.getMatrixOptionList() == null || this.matrixOptionList != null && this.matrixOptionList.equals(other.getMatrixOptionList())) && (this.itemVendorList == null && other.getItemVendorList() == null || this.itemVendorList != null && this.itemVendorList.equals(other.getItemVendorList())) && (this.pricingMatrix == null && other.getPricingMatrix() == null || this.pricingMatrix != null && this.pricingMatrix.equals(other.getPricingMatrix())) && (this.hierarchyVersionsList == null && other.getHierarchyVersionsList() == null || this.hierarchyVersionsList != null && this.hierarchyVersionsList.equals(other.getHierarchyVersionsList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.itemNumberOptionsList == null && other.getItemNumberOptionsList() == null || this.itemNumberOptionsList != null && this.itemNumberOptionsList.equals(other.getItemNumberOptionsList())) && (this.numbersList == null && other.getNumbersList() == null || this.numbersList != null && this.numbersList.equals(other.getNumbersList())) && (this.binNumberList == null && other.getBinNumberList() == null || this.binNumberList != null && this.binNumberList.equals(other.getBinNumberList())) && (this.siteCategoryList == null && other.getSiteCategoryList() == null || this.siteCategoryList != null && this.siteCategoryList.equals(other.getSiteCategoryList())) && (this.locationsList == null && other.getLocationsList() == null || this.locationsList != null && this.locationsList.equals(other.getLocationsList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.presentationItemList == null && other.getPresentationItemList() == null || this.presentationItemList != null && this.presentationItemList.equals(other.getPresentationItemList())) && (this.futureHorizon == null && other.getFutureHorizon() == null || this.futureHorizon != null && this.futureHorizon.equals(other.getFutureHorizon())) && (this.consumptionUnit == null && other.getConsumptionUnit() == null || this.consumptionUnit != null && this.consumptionUnit.equals(other.getConsumptionUnit())) && (this.enableCatchWeight == null && other.getEnableCatchWeight() == null || this.enableCatchWeight != null && this.enableCatchWeight.equals(other.getEnableCatchWeight())) && (this.secondaryUnitsType == null && other.getSecondaryUnitsType() == null || this.secondaryUnitsType != null && this.secondaryUnitsType.equals(other.getSecondaryUnitsType())) && (this.secondaryBaseUnit == null && other.getSecondaryBaseUnit() == null || this.secondaryBaseUnit != null && this.secondaryBaseUnit.equals(other.getSecondaryBaseUnit())) && (this.conversionRate == null && other.getConversionRate() == null || this.conversionRate != null && this.conversionRate.equals(other.getConversionRate())) && (this.secondaryStockUnit == null && other.getSecondaryStockUnit() == null || this.secondaryStockUnit != null && this.secondaryStockUnit.equals(other.getSecondaryStockUnit())) && (this.secondarySaleUnit == null && other.getSecondarySaleUnit() == null || this.secondarySaleUnit != null && this.secondarySaleUnit.equals(other.getSecondarySaleUnit())) && (this.secondaryPurchaseUnit == null && other.getSecondaryPurchaseUnit() == null || this.secondaryPurchaseUnit != null && this.secondaryPurchaseUnit.equals(other.getSecondaryPurchaseUnit())) && (this.secondaryConsumptionUnit == null && other.getSecondaryConsumptionUnit() == null || this.secondaryConsumptionUnit != null && this.secondaryConsumptionUnit.equals(other.getSecondaryConsumptionUnit())) && (this.lowerWarningLimit == null && other.getLowerWarningLimit() == null || this.lowerWarningLimit != null && this.lowerWarningLimit.equals(other.getLowerWarningLimit())) && (this.upperWarningLimit == null && other.getUpperWarningLimit() == null || this.upperWarningLimit != null && this.upperWarningLimit.equals(other.getUpperWarningLimit())) && (this.planningItemCategory == null && other.getPlanningItemCategory() == null || this.planningItemCategory != null && this.planningItemCategory.equals(other.getPlanningItemCategory())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getItemId() != null) {
            _hashCode += this.getItemId().hashCode();
        }
        if (this.getUpcCode() != null) {
            _hashCode += this.getUpcCode().hashCode();
        }
        if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
        }
        if (this.getMatrixType() != null) {
            _hashCode += this.getMatrixType().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getVendorName() != null) {
            _hashCode += this.getVendorName().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getIsOnline() != null) {
            _hashCode += this.getIsOnline().hashCode();
        }
        if (this.getIsHazmatItem() != null) {
            _hashCode += this.getIsHazmatItem().hashCode();
        }
        if (this.getHazmatId() != null) {
            _hashCode += this.getHazmatId().hashCode();
        }
        if (this.getHazmatShippingName() != null) {
            _hashCode += this.getHazmatShippingName().hashCode();
        }
        if (this.getHazmatHazardClass() != null) {
            _hashCode += this.getHazmatHazardClass().hashCode();
        }
        if (this.getHazmatPackingGroup() != null) {
            _hashCode += this.getHazmatPackingGroup().hashCode();
        }
        if (this.getHazmatItemUnits() != null) {
            _hashCode += this.getHazmatItemUnits().hashCode();
        }
        if (this.getHazmatItemUnitsQty() != null) {
            _hashCode += this.getHazmatItemUnitsQty().hashCode();
        }
        if (this.getIsGcoCompliant() != null) {
            _hashCode += this.getIsGcoCompliant().hashCode();
        }
        if (this.getOfferSupport() != null) {
            _hashCode += this.getOfferSupport().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getAvailableToPartners() != null) {
            _hashCode += this.getAvailableToPartners().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getCostingMethod() != null) {
            _hashCode += this.getCostingMethod().hashCode();
        }
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getPurchaseDescription() != null) {
            _hashCode += this.getPurchaseDescription().hashCode();
        }
        if (this.getCopyDescription() != null) {
            _hashCode += this.getCopyDescription().hashCode();
        }
        if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getCogsAccount() != null) {
            _hashCode += this.getCogsAccount().hashCode();
        }
        if (this.getIntercoCogsAccount() != null) {
            _hashCode += this.getIntercoCogsAccount().hashCode();
        }
        if (this.getVendor() != null) {
            _hashCode += this.getVendor().hashCode();
        }
        if (this.getSalesDescription() != null) {
            _hashCode += this.getSalesDescription().hashCode();
        }
        if (this.getLastInvtCountDate() != null) {
            _hashCode += this.getLastInvtCountDate().hashCode();
        }
        if (this.getNextInvtCountDate() != null) {
            _hashCode += this.getNextInvtCountDate().hashCode();
        }
        if (this.getInvtCountInterval() != null) {
            _hashCode += this.getInvtCountInterval().hashCode();
        }
        if (this.getInvtClassification() != null) {
            _hashCode += this.getInvtClassification().hashCode();
        }
        if (this.getIncomeAccount() != null) {
            _hashCode += this.getIncomeAccount().hashCode();
        }
        if (this.getIntercoIncomeAccount() != null) {
            _hashCode += this.getIntercoIncomeAccount().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getTaxSchedule() != null) {
            _hashCode += this.getTaxSchedule().hashCode();
        }
        if (this.getDropshipExpenseAccount() != null) {
            _hashCode += this.getDropshipExpenseAccount().hashCode();
        }
        if (this.getRevenueRecognitionRule() != null) {
            _hashCode += this.getRevenueRecognitionRule().hashCode();
        }
        if (this.getRevRecForecastRule() != null) {
            _hashCode += this.getRevRecForecastRule().hashCode();
        }
        if (this.getRevenueAllocationGroup() != null) {
            _hashCode += this.getRevenueAllocationGroup().hashCode();
        }
        if (this.getCreateRevenuePlansOn() != null) {
            _hashCode += this.getCreateRevenuePlansOn().hashCode();
        }
        if (this.getDirectRevenuePosting() != null) {
            _hashCode += this.getDirectRevenuePosting().hashCode();
        }
        if (this.getAssetAccount() != null) {
            _hashCode += this.getAssetAccount().hashCode();
        }
        if (this.getMatchBillToReceipt() != null) {
            _hashCode += this.getMatchBillToReceipt().hashCode();
        }
        if (this.getBillQtyVarianceAcct() != null) {
            _hashCode += this.getBillQtyVarianceAcct().hashCode();
        }
        if (this.getBillPriceVarianceAcct() != null) {
            _hashCode += this.getBillPriceVarianceAcct().hashCode();
        }
        if (this.getBillExchRateVarianceAcct() != null) {
            _hashCode += this.getBillExchRateVarianceAcct().hashCode();
        }
        if (this.getGainLossAccount() != null) {
            _hashCode += this.getGainLossAccount().hashCode();
        }
        if (this.getShippingCost() != null) {
            _hashCode += this.getShippingCost().hashCode();
        }
        if (this.getHandlingCost() != null) {
            _hashCode += this.getHandlingCost().hashCode();
        }
        if (this.getWeight() != null) {
            _hashCode += this.getWeight().hashCode();
        }
        if (this.getCostingMethodDisplay() != null) {
            _hashCode += this.getCostingMethodDisplay().hashCode();
        }
        if (this.getShippingCostUnits() != null) {
            _hashCode += this.getShippingCostUnits().hashCode();
        }
        if (this.getHandlingCostUnits() != null) {
            _hashCode += this.getHandlingCostUnits().hashCode();
        }
        if (this.getUnitsType() != null) {
            _hashCode += this.getUnitsType().hashCode();
        }
        if (this.getStockUnit() != null) {
            _hashCode += this.getStockUnit().hashCode();
        }
        if (this.getPurchaseUnit() != null) {
            _hashCode += this.getPurchaseUnit().hashCode();
        }
        if (this.getSaleUnit() != null) {
            _hashCode += this.getSaleUnit().hashCode();
        }
        if (this.getMinimumQuantityUnits() != null) {
            _hashCode += this.getMinimumQuantityUnits().hashCode();
        }
        if (this.getSafetyStockLevelUnits() != null) {
            _hashCode += this.getSafetyStockLevelUnits().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getTrackLandedCost() != null) {
            _hashCode += this.getTrackLandedCost().hashCode();
        }
        if (this.getMatrixItemNameTemplate() != null) {
            _hashCode += this.getMatrixItemNameTemplate().hashCode();
        }
        if (this.getIsDropShipItem() != null) {
            _hashCode += this.getIsDropShipItem().hashCode();
        }
        if (this.getIsSpecialOrderItem() != null) {
            _hashCode += this.getIsSpecialOrderItem().hashCode();
        }
        if (this.getStockDescription() != null) {
            _hashCode += this.getStockDescription().hashCode();
        }
        if (this.getDeferredRevenueAccount() != null) {
            _hashCode += this.getDeferredRevenueAccount().hashCode();
        }
        if (this.getProducer() != null) {
            _hashCode += this.getProducer().hashCode();
        }
        if (this.getManufacturer() != null) {
            _hashCode += this.getManufacturer().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getMpn() != null) {
            _hashCode += this.getMpn().hashCode();
        }
        if (this.getMultManufactureAddr() != null) {
            _hashCode += this.getMultManufactureAddr().hashCode();
        }
        if (this.getManufacturerAddr1() != null) {
            _hashCode += this.getManufacturerAddr1().hashCode();
        }
        if (this.getManufacturerCity() != null) {
            _hashCode += this.getManufacturerCity().hashCode();
        }
        if (this.getManufacturerState() != null) {
            _hashCode += this.getManufacturerState().hashCode();
        }
        if (this.getManufacturerZip() != null) {
            _hashCode += this.getManufacturerZip().hashCode();
        }
        if (this.getCountryOfManufacture() != null) {
            _hashCode += this.getCountryOfManufacture().hashCode();
        }
        if (this.getDefaultItemShipMethod() != null) {
            _hashCode += this.getDefaultItemShipMethod().hashCode();
        }
        if (this.getItemCarrier() != null) {
            _hashCode += this.getItemCarrier().hashCode();
        }
        if (this.getRoundUpAsComponent() != null) {
            _hashCode += this.getRoundUpAsComponent().hashCode();
        }
        if (this.getPurchaseOrderQuantity() != null) {
            _hashCode += this.getPurchaseOrderQuantity().hashCode();
        }
        if (this.getPurchaseOrderAmount() != null) {
            _hashCode += this.getPurchaseOrderAmount().hashCode();
        }
        if (this.getPurchaseOrderQuantityDiff() != null) {
            _hashCode += this.getPurchaseOrderQuantityDiff().hashCode();
        }
        if (this.getReceiptQuantity() != null) {
            _hashCode += this.getReceiptQuantity().hashCode();
        }
        if (this.getReceiptAmount() != null) {
            _hashCode += this.getReceiptAmount().hashCode();
        }
        if (this.getReceiptQuantityDiff() != null) {
            _hashCode += this.getReceiptQuantityDiff().hashCode();
        }
        if (this.getItemShipMethodList() != null) {
            _hashCode += this.getItemShipMethodList().hashCode();
        }
        if (this.getManufacturerTaxId() != null) {
            _hashCode += this.getManufacturerTaxId().hashCode();
        }
        if (this.getScheduleBNumber() != null) {
            _hashCode += this.getScheduleBNumber().hashCode();
        }
        if (this.getScheduleBQuantity() != null) {
            _hashCode += this.getScheduleBQuantity().hashCode();
        }
        if (this.getScheduleBCode() != null) {
            _hashCode += this.getScheduleBCode().hashCode();
        }
        if (this.getManufacturerTariff() != null) {
            _hashCode += this.getManufacturerTariff().hashCode();
        }
        if (this.getPreferenceCriterion() != null) {
            _hashCode += this.getPreferenceCriterion().hashCode();
        }
        if (this.getMinimumQuantity() != null) {
            _hashCode += this.getMinimumQuantity().hashCode();
        }
        if (this.getEnforceMinQtyInternally() != null) {
            _hashCode += this.getEnforceMinQtyInternally().hashCode();
        }
        if (this.getMaximumQuantity() != null) {
            _hashCode += this.getMaximumQuantity().hashCode();
        }
        if (this.getShipPackage() != null) {
            _hashCode += this.getShipPackage().hashCode();
        }
        if (this.getShipIndividually() != null) {
            _hashCode += this.getShipIndividually().hashCode();
        }
        if (this.getSoftDescriptor() != null) {
            _hashCode += this.getSoftDescriptor().hashCode();
        }
        if (this.getCostCategory() != null) {
            _hashCode += this.getCostCategory().hashCode();
        }
        if (this.getPricesIncludeTax() != null) {
            _hashCode += this.getPricesIncludeTax().hashCode();
        }
        if (this.getQuantityPricingSchedule() != null) {
            _hashCode += this.getQuantityPricingSchedule().hashCode();
        }
        if (this.getUseMarginalRates() != null) {
            _hashCode += this.getUseMarginalRates().hashCode();
        }
        if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
        }
        if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
        }
        if (this.getTransferPrice() != null) {
            _hashCode += this.getTransferPrice().hashCode();
        }
        if (this.getOverallQuantityPricingType() != null) {
            _hashCode += this.getOverallQuantityPricingType().hashCode();
        }
        if (this.getPricingGroup() != null) {
            _hashCode += this.getPricingGroup().hashCode();
        }
        if (this.getPreferredLocation() != null) {
            _hashCode += this.getPreferredLocation().hashCode();
        }
        if (this.getIsStorePickupAllowed() != null) {
            _hashCode += this.getIsStorePickupAllowed().hashCode();
        }
        if (this.getVsoePrice() != null) {
            _hashCode += this.getVsoePrice().hashCode();
        }
        if (this.getVsoeSopGroup() != null) {
            _hashCode += this.getVsoeSopGroup().hashCode();
        }
        if (this.getVsoeDeferral() != null) {
            _hashCode += this.getVsoeDeferral().hashCode();
        }
        if (this.getVsoePermitDiscount() != null) {
            _hashCode += this.getVsoePermitDiscount().hashCode();
        }
        if (this.getVsoeDelivered() != null) {
            _hashCode += this.getVsoeDelivered().hashCode();
        }
        if (this.getItemRevenueCategory() != null) {
            _hashCode += this.getItemRevenueCategory().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getCostUnits() != null) {
            _hashCode += this.getCostUnits().hashCode();
        }
        if (this.getQuantityReorderUnits() != null) {
            _hashCode += this.getQuantityReorderUnits().hashCode();
        }
        if (this.getReorderMultiple() != null) {
            _hashCode += this.getReorderMultiple().hashCode();
        }
        if (this.getTotalValue() != null) {
            _hashCode += this.getTotalValue().hashCode();
        }
        if (this.getUseBins() != null) {
            _hashCode += this.getUseBins().hashCode();
        }
        if (this.getLeadTime() != null) {
            _hashCode += this.getLeadTime().hashCode();
        }
        if (this.getAutoLeadTime() != null) {
            _hashCode += this.getAutoLeadTime().hashCode();
        }
        if (this.getAutoReorderPoint() != null) {
            _hashCode += this.getAutoReorderPoint().hashCode();
        }
        if (this.getAutoPreferredStockLevel() != null) {
            _hashCode += this.getAutoPreferredStockLevel().hashCode();
        }
        if (this.getPreferredStockLevelDays() != null) {
            _hashCode += this.getPreferredStockLevelDays().hashCode();
        }
        if (this.getAverageCost() != null) {
            _hashCode += this.getAverageCost().hashCode();
        }
        if (this.getSafetyStockLevel() != null) {
            _hashCode += this.getSafetyStockLevel().hashCode();
        }
        if (this.getLastPurchasePrice() != null) {
            _hashCode += this.getLastPurchasePrice().hashCode();
        }
        if (this.getSafetyStockLevelDays() != null) {
            _hashCode += this.getSafetyStockLevelDays().hashCode();
        }
        if (this.getBackwardConsumptionDays() != null) {
            _hashCode += this.getBackwardConsumptionDays().hashCode();
        }
        if (this.getSeasonalDemand() != null) {
            _hashCode += this.getSeasonalDemand().hashCode();
        }
        if (this.getDemandModifier() != null) {
            _hashCode += this.getDemandModifier().hashCode();
        }
        if (this.getStoreDisplayName() != null) {
            _hashCode += this.getStoreDisplayName().hashCode();
        }
        if (this.getStoreDisplayThumbnail() != null) {
            _hashCode += this.getStoreDisplayThumbnail().hashCode();
        }
        if (this.getWeightUnit() != null) {
            _hashCode += this.getWeightUnit().hashCode();
        }
        if (this.getWeightUnits() != null) {
            _hashCode += this.getWeightUnits().hashCode();
        }
        if (this.getStoreDisplayImage() != null) {
            _hashCode += this.getStoreDisplayImage().hashCode();
        }
        if (this.getStoreDescription() != null) {
            _hashCode += this.getStoreDescription().hashCode();
        }
        if (this.getStoreDetailedDescription() != null) {
            _hashCode += this.getStoreDetailedDescription().hashCode();
        }
        if (this.getStoreItemTemplate() != null) {
            _hashCode += this.getStoreItemTemplate().hashCode();
        }
        if (this.getPageTitle() != null) {
            _hashCode += this.getPageTitle().hashCode();
        }
        if (this.getMetaTagHtml() != null) {
            _hashCode += this.getMetaTagHtml().hashCode();
        }
        if (this.getExcludeFromSitemap() != null) {
            _hashCode += this.getExcludeFromSitemap().hashCode();
        }
        if (this.getSitemapPriority() != null) {
            _hashCode += this.getSitemapPriority().hashCode();
        }
        if (this.getSearchKeywords() != null) {
            _hashCode += this.getSearchKeywords().hashCode();
        }
        if (this.getIsDonationItem() != null) {
            _hashCode += this.getIsDonationItem().hashCode();
        }
        if (this.getShowDefaultDonationAmount() != null) {
            _hashCode += this.getShowDefaultDonationAmount().hashCode();
        }
        if (this.getMaxDonationAmount() != null) {
            _hashCode += this.getMaxDonationAmount().hashCode();
        }
        if (this.getShoppingDotComCategory() != null) {
            _hashCode += this.getShoppingDotComCategory().hashCode();
        }
        if (this.getShopzillaCategoryId() != null) {
            _hashCode += this.getShopzillaCategoryId().hashCode();
        }
        if (this.getNexTagCategory() != null) {
            _hashCode += this.getNexTagCategory().hashCode();
        }
        if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
        }
        if (this.getQuantityOnHandUnits() != null) {
            _hashCode += this.getQuantityOnHandUnits().hashCode();
        }
        if (this.getOnHandValueMli() != null) {
            _hashCode += this.getOnHandValueMli().hashCode();
        }
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
        }
        if (this.getReorderPoint() != null) {
            _hashCode += this.getReorderPoint().hashCode();
        }
        if (this.getPreferredStockLevel() != null) {
            _hashCode += this.getPreferredStockLevel().hashCode();
        }
        if (this.getReorderPointUnits() != null) {
            _hashCode += this.getReorderPointUnits().hashCode();
        }
        if (this.getDefaultReturnCost() != null) {
            _hashCode += this.getDefaultReturnCost().hashCode();
        }
        if (this.getSupplyReplenishmentMethod() != null) {
            _hashCode += this.getSupplyReplenishmentMethod().hashCode();
        }
        if (this.getAlternateDemandSourceItem() != null) {
            _hashCode += this.getAlternateDemandSourceItem().hashCode();
        }
        if (this.getFixedLotSize() != null) {
            _hashCode += this.getFixedLotSize().hashCode();
        }
        if (this.getPeriodicLotSizeType() != null) {
            _hashCode += this.getPeriodicLotSizeType().hashCode();
        }
        if (this.getSupplyType() != null) {
            _hashCode += this.getSupplyType().hashCode();
        }
        if (this.getDemandTimeFence() != null) {
            _hashCode += this.getDemandTimeFence().hashCode();
        }
        if (this.getSupplyTimeFence() != null) {
            _hashCode += this.getSupplyTimeFence().hashCode();
        }
        if (this.getRescheduleInDays() != null) {
            _hashCode += this.getRescheduleInDays().hashCode();
        }
        if (this.getRescheduleOutDays() != null) {
            _hashCode += this.getRescheduleOutDays().hashCode();
        }
        if (this.getPeriodicLotSizeDays() != null) {
            _hashCode += this.getPeriodicLotSizeDays().hashCode();
        }
        if (this.getSupplyLotSizingMethod() != null) {
            _hashCode += this.getSupplyLotSizingMethod().hashCode();
        }
        if (this.getForwardConsumptionDays() != null) {
            _hashCode += this.getForwardConsumptionDays().hashCode();
        }
        if (this.getDemandSource() != null) {
            _hashCode += this.getDemandSource().hashCode();
        }
        if (this.getQuantityOnOrder() != null) {
            _hashCode += this.getQuantityOnOrder().hashCode();
        }
        if (this.getPreferredStockLevelUnits() != null) {
            _hashCode += this.getPreferredStockLevelUnits().hashCode();
        }
        if (this.getQuantityCommitted() != null) {
            _hashCode += this.getQuantityCommitted().hashCode();
        }
        if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
        }
        if (this.getQuantityBackOrdered() != null) {
            _hashCode += this.getQuantityBackOrdered().hashCode();
        }
        if (this.getPurchaseTaxCode() != null) {
            _hashCode += this.getPurchaseTaxCode().hashCode();
        }
        if (this.getPurchasePriceVarianceAcct() != null) {
            _hashCode += this.getPurchasePriceVarianceAcct().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getSalesTaxCode() != null) {
            _hashCode += this.getSalesTaxCode().hashCode();
        }
        if (this.getOnSpecial() != null) {
            _hashCode += this.getOnSpecial().hashCode();
        }
        if (this.getDontShowPrice() != null) {
            _hashCode += this.getDontShowPrice().hashCode();
        }
        if (this.getNoPriceMessage() != null) {
            _hashCode += this.getNoPriceMessage().hashCode();
        }
        if (this.getOutOfStockMessage() != null) {
            _hashCode += this.getOutOfStockMessage().hashCode();
        }
        if (this.getSpecialsDescription() != null) {
            _hashCode += this.getSpecialsDescription().hashCode();
        }
        if (this.getOutOfStockBehavior() != null) {
            _hashCode += this.getOutOfStockBehavior().hashCode();
        }
        if (this.getRelatedItemsDescription() != null) {
            _hashCode += this.getRelatedItemsDescription().hashCode();
        }
        if (this.getFeaturedDescription() != null) {
            _hashCode += this.getFeaturedDescription().hashCode();
        }
        if (this.getProductFeedList() != null) {
            _hashCode += this.getProductFeedList().hashCode();
        }
        if (this.getUrlComponent() != null) {
            _hashCode += this.getUrlComponent().hashCode();
        }
        if (this.getItemOptionsList() != null) {
            _hashCode += this.getItemOptionsList().hashCode();
        }
        if (this.getMatrixOptionList() != null) {
            _hashCode += this.getMatrixOptionList().hashCode();
        }
        if (this.getItemVendorList() != null) {
            _hashCode += this.getItemVendorList().hashCode();
        }
        if (this.getPricingMatrix() != null) {
            _hashCode += this.getPricingMatrix().hashCode();
        }
        if (this.getHierarchyVersionsList() != null) {
            _hashCode += this.getHierarchyVersionsList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getItemNumberOptionsList() != null) {
            _hashCode += this.getItemNumberOptionsList().hashCode();
        }
        if (this.getNumbersList() != null) {
            _hashCode += this.getNumbersList().hashCode();
        }
        if (this.getBinNumberList() != null) {
            _hashCode += this.getBinNumberList().hashCode();
        }
        if (this.getSiteCategoryList() != null) {
            _hashCode += this.getSiteCategoryList().hashCode();
        }
        if (this.getLocationsList() != null) {
            _hashCode += this.getLocationsList().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
        }
        if (this.getPresentationItemList() != null) {
            _hashCode += this.getPresentationItemList().hashCode();
        }
        if (this.getFutureHorizon() != null) {
            _hashCode += this.getFutureHorizon().hashCode();
        }
        if (this.getConsumptionUnit() != null) {
            _hashCode += this.getConsumptionUnit().hashCode();
        }
        if (this.getEnableCatchWeight() != null) {
            _hashCode += this.getEnableCatchWeight().hashCode();
        }
        if (this.getSecondaryUnitsType() != null) {
            _hashCode += this.getSecondaryUnitsType().hashCode();
        }
        if (this.getSecondaryBaseUnit() != null) {
            _hashCode += this.getSecondaryBaseUnit().hashCode();
        }
        if (this.getConversionRate() != null) {
            _hashCode += this.getConversionRate().hashCode();
        }
        if (this.getSecondaryStockUnit() != null) {
            _hashCode += this.getSecondaryStockUnit().hashCode();
        }
        if (this.getSecondarySaleUnit() != null) {
            _hashCode += this.getSecondarySaleUnit().hashCode();
        }
        if (this.getSecondaryPurchaseUnit() != null) {
            _hashCode += this.getSecondaryPurchaseUnit().hashCode();
        }
        if (this.getSecondaryConsumptionUnit() != null) {
            _hashCode += this.getSecondaryConsumptionUnit().hashCode();
        }
        if (this.getLowerWarningLimit() != null) {
            _hashCode += this.getLowerWarningLimit().hashCode();
        }
        if (this.getUpperWarningLimit() != null) {
            _hashCode += this.getUpperWarningLimit().hashCode();
        }
        if (this.getPlanningItemCategory() != null) {
            _hashCode += this.getPlanningItemCategory().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SerializedInventoryItem"));
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
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matrixType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "matrixType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemMatrixType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isHazmatItem");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isHazmatItem"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hazmatId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hazmatId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hazmatShippingName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hazmatShippingName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hazmatHazardClass");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hazmatHazardClass"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hazmatPackingGroup");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hazmatPackingGroup"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "HazmatPackingGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hazmatItemUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hazmatItemUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hazmatItemUnitsQty");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hazmatItemUnitsQty"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costingMethod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costingMethod"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemCostingMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cogsAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cogsAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoCogsAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "intercoCogsAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastInvtCountDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lastInvtCountDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextInvtCountDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nextInvtCountDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invtCountInterval");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "invtCountInterval"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invtClassification");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "invtClassification"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemInvtClassification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoIncomeAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "intercoIncomeAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dropshipExpenseAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "dropshipExpenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueAllocationGroup");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revenueAllocationGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createRevenuePlansOn");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "createRevenuePlansOn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("directRevenuePosting");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "directRevenuePosting"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assetAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "assetAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billQtyVarianceAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billQtyVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPriceVarianceAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billPriceVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billExchRateVarianceAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billExchRateVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gainLossAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "gainLossAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costingMethodDisplay");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costingMethodDisplay"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingCostUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shippingCostUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingCostUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "handlingCostUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stockUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "stockUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("minimumQuantityUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "minimumQuantityUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("safetyStockLevelUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "safetyStockLevelUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("trackLandedCost");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "trackLandedCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matrixItemNameTemplate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "matrixItemNameTemplate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "deferredRevenueAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("producer");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "producer"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerAddr1");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "manufacturerAddr1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultItemShipMethod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "defaultItemShipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCarrier");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemCarrier"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "ShippingCarrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roundUpAsComponent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "roundUpAsComponent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemShipMethodList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemShipMethodList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ScheduleBCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemPreferenceCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("enforceMinQtyInternally");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "enforceMinQtyInternally"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricesIncludeTax");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "pricesIncludeTax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferPrice");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "transferPrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemOverallQuantityPricingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredLocation");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isStorePickupAllowed");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isStorePickupAllowed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoeSopGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityReorderUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityReorderUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reorderMultiple");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "reorderMultiple"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "totalValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoLeadTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "autoLeadTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoReorderPoint");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "autoReorderPoint"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoPreferredStockLevel");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "autoPreferredStockLevel"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredStockLevelDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredStockLevelDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("safetyStockLevelDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "safetyStockLevelDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("backwardConsumptionDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "backwardConsumptionDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("seasonalDemand");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "seasonalDemand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandModifier");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "demandModifier"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDisplayName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "storeDisplayName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "weightUnit"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemWeightUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weightUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "weightUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeItemTemplate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "storeItemTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "SitemapPriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDonationItem");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isDonationItem"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("showDefaultDonationAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "showDefaultDonationAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maxDonationAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "maxDonationAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexTagCategory");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nexTagCategory"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHandUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityOnHandUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onHandValueMli");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "onHandValueMli"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reorderPoint");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "reorderPoint"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reorderPointUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "reorderPointUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyReplenishmentMethod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "supplyReplenishmentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("alternateDemandSourceItem");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "alternateDemandSourceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedLotSize");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fixedLotSize"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodicLotSizeType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "periodicLotSizeType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "PeriodicLotSizeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "supplyType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandTimeFence");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "demandTimeFence"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyTimeFence");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "supplyTimeFence"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rescheduleInDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "rescheduleInDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rescheduleOutDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "rescheduleOutDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodicLotSizeDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "periodicLotSizeDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supplyLotSizingMethod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "supplyLotSizingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("forwardConsumptionDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "forwardConsumptionDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandSource");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "demandSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredStockLevelUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredStockLevelUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseTaxCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchasePriceVarianceAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchasePriceVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noPriceMessage");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "noPriceMessage"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "outOfStockMessage"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("specialsDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "specialsDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemOutOfStockBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relatedItemsDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "relatedItemsDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("productFeedList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "productFeedList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ProductFeedList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemOptionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemOptionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemOptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matrixOptionList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "matrixOptionList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "MatrixOptionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemVendorList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemVendorList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemVendorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingMatrix");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "pricingMatrix"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "PricingMatrix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyVersionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hierarchyVersionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SerializedInventoryItemHierarchyVersionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemAccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemNumberOptionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemNumberOptionsList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numbersList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "numbersList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SerializedInventoryItemNumbersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumberList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "binNumberList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "InventoryItemBinNumberList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("siteCategoryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "siteCategoryList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SiteCategoryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locationsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SerializedInventoryItemLocationsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "TranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("presentationItemList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "presentationItemList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "PresentationItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("futureHorizon");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "futureHorizon"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consumptionUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "consumptionUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("enableCatchWeight");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "enableCatchWeight"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryUnitsType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "secondaryUnitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryBaseUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "secondaryBaseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryStockUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "secondaryStockUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondarySaleUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "secondarySaleUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryPurchaseUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "secondaryPurchaseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("secondaryConsumptionUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "secondaryConsumptionUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowerWarningLimit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lowerWarningLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upperWarningLimit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "upperWarningLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("planningItemCategory");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "planningItemCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

