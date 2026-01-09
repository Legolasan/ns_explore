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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemAccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemMemberList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemOptionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.KitItemHierarchyVersionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.PresentationItemList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.PricingMatrix;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ProductFeedList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.SiteCategoryList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.TranslationList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.HazmatPackingGroup;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemOutOfStockBehavior;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemOverallQuantityPricingType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemPreferenceCriterion;
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

public class KitItem
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef customForm;
    private String itemId;
    private String upcCode;
    private String displayName;
    private RecordRef parent;
    private Boolean printItems;
    private Boolean isOnline;
    private Boolean isGcoCompliant;
    private Boolean offerSupport;
    private Boolean isInactive;
    private Boolean availableToPartners;
    private RecordRef department;
    private RecordRefList subsidiaryList;
    private RecordRef _class;
    private Boolean includeChildren;
    private RecordRef location;
    private String description;
    private RecordRef incomeAccount;
    private RecordRef taxSchedule;
    private Double shippingCost;
    private Double handlingCost;
    private Boolean isTaxable;
    private Boolean deferRevRec;
    private RecordRef revenueRecognitionRule;
    private RecordRef revRecForecastRule;
    private RecordRef revenueAllocationGroup;
    private RecordRef createRevenuePlansOn;
    private Boolean directRevenuePosting;
    private Boolean contingentRevenueHandling;
    private RecordRef revReclassFXAccount;
    private RecordRef salesTaxCode;
    private Double weight;
    private RecordRef weightUnit;
    private Double rate;
    private RecordRef billingSchedule;
    private RecordRef deferredRevenueAccount;
    private RecordRef revRecSchedule;
    private String stockDescription;
    private Boolean producer;
    private String manufacturer;
    private String mpn;
    private Boolean multManufactureAddr;
    private String manufactureraddr1;
    private String manufacturerCity;
    private String manufacturerState;
    private String manufacturerZip;
    private Country countryOfManufacture;
    private RecordRef defaultItemShipMethod;
    private ShippingCarrier itemCarrier;
    private RecordRefList itemShipMethodList;
    private String manufacturerTaxId;
    private String scheduleBNumber;
    private Long scheduleBQuantity;
    private RecordRef scheduleBCode;
    private String manufacturerTariff;
    private ItemPreferenceCriterion preferenceCriterion;
    private RecordRef issueProduct;
    private Long minimumQuantity;
    private Boolean enforceMinQtyInternally;
    private Long maximumQuantity;
    private RecordRef softDescriptor;
    private Boolean isFulfillable;
    private Boolean pricesIncludeTax;
    private RecordRef quantityPricingSchedule;
    private Boolean useMarginalRates;
    private ItemCostEstimateType costEstimateType;
    private Boolean isHazmatItem;
    private String hazmatId;
    private String hazmatShippingName;
    private String hazmatHazardClass;
    private HazmatPackingGroup hazmatPackingGroup;
    private String hazmatItemUnits;
    private Double hazmatItemUnitsQty;
    private Double costEstimate;
    private ItemOverallQuantityPricingType overallQuantityPricingType;
    private RecordRef pricingGroup;
    private Double vsoePrice;
    private VsoeSopGroup vsoeSopGroup;
    private VsoeDeferral vsoeDeferral;
    private VsoePermitDiscount vsoePermitDiscount;
    private Boolean vsoeDelivered;
    private RecordRef itemRevenueCategory;
    private Boolean shipIndividually;
    private RecordRef shipPackage;
    private String storeDisplayName;
    private RecordRef storeDisplayThumbnail;
    private String outOfStockMessage;
    private RecordRef storeDisplayImage;
    private String storeDescription;
    private String storeDetailedDescription;
    private RecordRef storeItemTemplate;
    private String pageTitle;
    private String urlComponent;
    private String metaTagHtml;
    private Boolean excludeFromSitemap;
    private SitemapPriority sitemapPriority;
    private String searchKeywords;
    private ItemOptionsList itemOptionsList;
    private Boolean isDonationItem;
    private Boolean showDefaultDonationAmount;
    private Double maxDonationAmount;
    private Boolean dontShowPrice;
    private String noPriceMessage;
    private String shoppingDotComCategory;
    private Long shopzillaCategoryId;
    private ItemOutOfStockBehavior outOfStockBehavior;
    private String nexTagCategory;
    private ProductFeedList productFeedList;
    private String relatedItemsDescription;
    private Boolean onSpecial;
    private String specialsDescription;
    private String featuredDescription;
    private PricingMatrix pricingMatrix;
    private SiteCategoryList siteCategoryList;
    private ItemMemberList memberList;
    private ItemAccountingBookDetailList accountingBookDetailList;
    private TranslationList translationsList;
    private PresentationItemList presentationItemList;
    private KitItemHierarchyVersionsList hierarchyVersionsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(KitItem.class, true);

    public KitItem() {
    }

    public KitItem(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef customForm, String itemId, String upcCode, String displayName, RecordRef parent, Boolean printItems, Boolean isOnline, Boolean isGcoCompliant, Boolean offerSupport, Boolean isInactive, Boolean availableToPartners, RecordRef department, RecordRefList subsidiaryList, RecordRef _class, Boolean includeChildren, RecordRef location, String description, RecordRef incomeAccount, RecordRef taxSchedule, Double shippingCost, Double handlingCost, Boolean isTaxable, Boolean deferRevRec, RecordRef revenueRecognitionRule, RecordRef revRecForecastRule, RecordRef revenueAllocationGroup, RecordRef createRevenuePlansOn, Boolean directRevenuePosting, Boolean contingentRevenueHandling, RecordRef revReclassFXAccount, RecordRef salesTaxCode, Double weight, RecordRef weightUnit, Double rate, RecordRef billingSchedule, RecordRef deferredRevenueAccount, RecordRef revRecSchedule, String stockDescription, Boolean producer, String manufacturer, String mpn, Boolean multManufactureAddr, String manufactureraddr1, String manufacturerCity, String manufacturerState, String manufacturerZip, Country countryOfManufacture, RecordRef defaultItemShipMethod, ShippingCarrier itemCarrier, RecordRefList itemShipMethodList, String manufacturerTaxId, String scheduleBNumber, Long scheduleBQuantity, RecordRef scheduleBCode, String manufacturerTariff, ItemPreferenceCriterion preferenceCriterion, RecordRef issueProduct, Long minimumQuantity, Boolean enforceMinQtyInternally, Long maximumQuantity, RecordRef softDescriptor, Boolean isFulfillable, Boolean pricesIncludeTax, RecordRef quantityPricingSchedule, Boolean useMarginalRates, ItemCostEstimateType costEstimateType, Boolean isHazmatItem, String hazmatId, String hazmatShippingName, String hazmatHazardClass, HazmatPackingGroup hazmatPackingGroup, String hazmatItemUnits, Double hazmatItemUnitsQty, Double costEstimate, ItemOverallQuantityPricingType overallQuantityPricingType, RecordRef pricingGroup, Double vsoePrice, VsoeSopGroup vsoeSopGroup, VsoeDeferral vsoeDeferral, VsoePermitDiscount vsoePermitDiscount, Boolean vsoeDelivered, RecordRef itemRevenueCategory, Boolean shipIndividually, RecordRef shipPackage, String storeDisplayName, RecordRef storeDisplayThumbnail, String outOfStockMessage, RecordRef storeDisplayImage, String storeDescription, String storeDetailedDescription, RecordRef storeItemTemplate, String pageTitle, String urlComponent, String metaTagHtml, Boolean excludeFromSitemap, SitemapPriority sitemapPriority, String searchKeywords, ItemOptionsList itemOptionsList, Boolean isDonationItem, Boolean showDefaultDonationAmount, Double maxDonationAmount, Boolean dontShowPrice, String noPriceMessage, String shoppingDotComCategory, Long shopzillaCategoryId, ItemOutOfStockBehavior outOfStockBehavior, String nexTagCategory, ProductFeedList productFeedList, String relatedItemsDescription, Boolean onSpecial, String specialsDescription, String featuredDescription, PricingMatrix pricingMatrix, SiteCategoryList siteCategoryList, ItemMemberList memberList, ItemAccountingBookDetailList accountingBookDetailList, TranslationList translationsList, PresentationItemList presentationItemList, KitItemHierarchyVersionsList hierarchyVersionsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.parent = parent;
        this.printItems = printItems;
        this.isOnline = isOnline;
        this.isGcoCompliant = isGcoCompliant;
        this.offerSupport = offerSupport;
        this.isInactive = isInactive;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this.subsidiaryList = subsidiaryList;
        this._class = _class;
        this.includeChildren = includeChildren;
        this.location = location;
        this.description = description;
        this.incomeAccount = incomeAccount;
        this.taxSchedule = taxSchedule;
        this.shippingCost = shippingCost;
        this.handlingCost = handlingCost;
        this.isTaxable = isTaxable;
        this.deferRevRec = deferRevRec;
        this.revenueRecognitionRule = revenueRecognitionRule;
        this.revRecForecastRule = revRecForecastRule;
        this.revenueAllocationGroup = revenueAllocationGroup;
        this.createRevenuePlansOn = createRevenuePlansOn;
        this.directRevenuePosting = directRevenuePosting;
        this.contingentRevenueHandling = contingentRevenueHandling;
        this.revReclassFXAccount = revReclassFXAccount;
        this.salesTaxCode = salesTaxCode;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.rate = rate;
        this.billingSchedule = billingSchedule;
        this.deferredRevenueAccount = deferredRevenueAccount;
        this.revRecSchedule = revRecSchedule;
        this.stockDescription = stockDescription;
        this.producer = producer;
        this.manufacturer = manufacturer;
        this.mpn = mpn;
        this.multManufactureAddr = multManufactureAddr;
        this.manufactureraddr1 = manufactureraddr1;
        this.manufacturerCity = manufacturerCity;
        this.manufacturerState = manufacturerState;
        this.manufacturerZip = manufacturerZip;
        this.countryOfManufacture = countryOfManufacture;
        this.defaultItemShipMethod = defaultItemShipMethod;
        this.itemCarrier = itemCarrier;
        this.itemShipMethodList = itemShipMethodList;
        this.manufacturerTaxId = manufacturerTaxId;
        this.scheduleBNumber = scheduleBNumber;
        this.scheduleBQuantity = scheduleBQuantity;
        this.scheduleBCode = scheduleBCode;
        this.manufacturerTariff = manufacturerTariff;
        this.preferenceCriterion = preferenceCriterion;
        this.issueProduct = issueProduct;
        this.minimumQuantity = minimumQuantity;
        this.enforceMinQtyInternally = enforceMinQtyInternally;
        this.maximumQuantity = maximumQuantity;
        this.softDescriptor = softDescriptor;
        this.isFulfillable = isFulfillable;
        this.pricesIncludeTax = pricesIncludeTax;
        this.quantityPricingSchedule = quantityPricingSchedule;
        this.useMarginalRates = useMarginalRates;
        this.costEstimateType = costEstimateType;
        this.isHazmatItem = isHazmatItem;
        this.hazmatId = hazmatId;
        this.hazmatShippingName = hazmatShippingName;
        this.hazmatHazardClass = hazmatHazardClass;
        this.hazmatPackingGroup = hazmatPackingGroup;
        this.hazmatItemUnits = hazmatItemUnits;
        this.hazmatItemUnitsQty = hazmatItemUnitsQty;
        this.costEstimate = costEstimate;
        this.overallQuantityPricingType = overallQuantityPricingType;
        this.pricingGroup = pricingGroup;
        this.vsoePrice = vsoePrice;
        this.vsoeSopGroup = vsoeSopGroup;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.itemRevenueCategory = itemRevenueCategory;
        this.shipIndividually = shipIndividually;
        this.shipPackage = shipPackage;
        this.storeDisplayName = storeDisplayName;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.outOfStockMessage = outOfStockMessage;
        this.storeDisplayImage = storeDisplayImage;
        this.storeDescription = storeDescription;
        this.storeDetailedDescription = storeDetailedDescription;
        this.storeItemTemplate = storeItemTemplate;
        this.pageTitle = pageTitle;
        this.urlComponent = urlComponent;
        this.metaTagHtml = metaTagHtml;
        this.excludeFromSitemap = excludeFromSitemap;
        this.sitemapPriority = sitemapPriority;
        this.searchKeywords = searchKeywords;
        this.itemOptionsList = itemOptionsList;
        this.isDonationItem = isDonationItem;
        this.showDefaultDonationAmount = showDefaultDonationAmount;
        this.maxDonationAmount = maxDonationAmount;
        this.dontShowPrice = dontShowPrice;
        this.noPriceMessage = noPriceMessage;
        this.shoppingDotComCategory = shoppingDotComCategory;
        this.shopzillaCategoryId = shopzillaCategoryId;
        this.outOfStockBehavior = outOfStockBehavior;
        this.nexTagCategory = nexTagCategory;
        this.productFeedList = productFeedList;
        this.relatedItemsDescription = relatedItemsDescription;
        this.onSpecial = onSpecial;
        this.specialsDescription = specialsDescription;
        this.featuredDescription = featuredDescription;
        this.pricingMatrix = pricingMatrix;
        this.siteCategoryList = siteCategoryList;
        this.memberList = memberList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.translationsList = translationsList;
        this.presentationItemList = presentationItemList;
        this.hierarchyVersionsList = hierarchyVersionsList;
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

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public Boolean getPrintItems() {
        return this.printItems;
    }

    public void setPrintItems(Boolean printItems) {
        this.printItems = printItems;
    }

    public Boolean getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
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

    public RecordRefList getSubsidiaryList() {
        return this.subsidiaryList;
    }

    public void setSubsidiaryList(RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public Boolean getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordRef getIncomeAccount() {
        return this.incomeAccount;
    }

    public void setIncomeAccount(RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }

    public RecordRef getTaxSchedule() {
        return this.taxSchedule;
    }

    public void setTaxSchedule(RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
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

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public Boolean getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(Boolean deferRevRec) {
        this.deferRevRec = deferRevRec;
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

    public Boolean getContingentRevenueHandling() {
        return this.contingentRevenueHandling;
    }

    public void setContingentRevenueHandling(Boolean contingentRevenueHandling) {
        this.contingentRevenueHandling = contingentRevenueHandling;
    }

    public RecordRef getRevReclassFXAccount() {
        return this.revReclassFXAccount;
    }

    public void setRevReclassFXAccount(RecordRef revReclassFXAccount) {
        this.revReclassFXAccount = revReclassFXAccount;
    }

    public RecordRef getSalesTaxCode() {
        return this.salesTaxCode;
    }

    public void setSalesTaxCode(RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public RecordRef getWeightUnit() {
        return this.weightUnit;
    }

    public void setWeightUnit(RecordRef weightUnit) {
        this.weightUnit = weightUnit;
    }

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public RecordRef getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public RecordRef getDeferredRevenueAccount() {
        return this.deferredRevenueAccount;
    }

    public void setDeferredRevenueAccount(RecordRef deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public String getStockDescription() {
        return this.stockDescription;
    }

    public void setStockDescription(String stockDescription) {
        this.stockDescription = stockDescription;
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

    public String getManufactureraddr1() {
        return this.manufactureraddr1;
    }

    public void setManufactureraddr1(String manufactureraddr1) {
        this.manufactureraddr1 = manufactureraddr1;
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

    public RecordRef getScheduleBCode() {
        return this.scheduleBCode;
    }

    public void setScheduleBCode(RecordRef scheduleBCode) {
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

    public RecordRef getIssueProduct() {
        return this.issueProduct;
    }

    public void setIssueProduct(RecordRef issueProduct) {
        this.issueProduct = issueProduct;
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

    public RecordRef getSoftDescriptor() {
        return this.softDescriptor;
    }

    public void setSoftDescriptor(RecordRef softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public Boolean getIsFulfillable() {
        return this.isFulfillable;
    }

    public void setIsFulfillable(Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
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

    public Double getCostEstimate() {
        return this.costEstimate;
    }

    public void setCostEstimate(Double costEstimate) {
        this.costEstimate = costEstimate;
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

    public Boolean getShipIndividually() {
        return this.shipIndividually;
    }

    public void setShipIndividually(Boolean shipIndividually) {
        this.shipIndividually = shipIndividually;
    }

    public RecordRef getShipPackage() {
        return this.shipPackage;
    }

    public void setShipPackage(RecordRef shipPackage) {
        this.shipPackage = shipPackage;
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

    public String getOutOfStockMessage() {
        return this.outOfStockMessage;
    }

    public void setOutOfStockMessage(String outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
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

    public String getUrlComponent() {
        return this.urlComponent;
    }

    public void setUrlComponent(String urlComponent) {
        this.urlComponent = urlComponent;
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

    public ItemOptionsList getItemOptionsList() {
        return this.itemOptionsList;
    }

    public void setItemOptionsList(ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
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

    public ItemOutOfStockBehavior getOutOfStockBehavior() {
        return this.outOfStockBehavior;
    }

    public void setOutOfStockBehavior(ItemOutOfStockBehavior outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }

    public String getNexTagCategory() {
        return this.nexTagCategory;
    }

    public void setNexTagCategory(String nexTagCategory) {
        this.nexTagCategory = nexTagCategory;
    }

    public ProductFeedList getProductFeedList() {
        return this.productFeedList;
    }

    public void setProductFeedList(ProductFeedList productFeedList) {
        this.productFeedList = productFeedList;
    }

    public String getRelatedItemsDescription() {
        return this.relatedItemsDescription;
    }

    public void setRelatedItemsDescription(String relatedItemsDescription) {
        this.relatedItemsDescription = relatedItemsDescription;
    }

    public Boolean getOnSpecial() {
        return this.onSpecial;
    }

    public void setOnSpecial(Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }

    public String getSpecialsDescription() {
        return this.specialsDescription;
    }

    public void setSpecialsDescription(String specialsDescription) {
        this.specialsDescription = specialsDescription;
    }

    public String getFeaturedDescription() {
        return this.featuredDescription;
    }

    public void setFeaturedDescription(String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }

    public PricingMatrix getPricingMatrix() {
        return this.pricingMatrix;
    }

    public void setPricingMatrix(PricingMatrix pricingMatrix) {
        this.pricingMatrix = pricingMatrix;
    }

    public SiteCategoryList getSiteCategoryList() {
        return this.siteCategoryList;
    }

    public void setSiteCategoryList(SiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }

    public ItemMemberList getMemberList() {
        return this.memberList;
    }

    public void setMemberList(ItemMemberList memberList) {
        this.memberList = memberList;
    }

    public ItemAccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(ItemAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
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

    public KitItemHierarchyVersionsList getHierarchyVersionsList() {
        return this.hierarchyVersionsList;
    }

    public void setHierarchyVersionsList(KitItemHierarchyVersionsList hierarchyVersionsList) {
        this.hierarchyVersionsList = hierarchyVersionsList;
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
        if (!(obj instanceof KitItem)) {
            return false;
        }
        KitItem other = (KitItem)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && this.upcCode.equals(other.getUpcCode())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.printItems == null && other.getPrintItems() == null || this.printItems != null && this.printItems.equals(other.getPrintItems())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && this.isOnline.equals(other.getIsOnline())) && (this.isGcoCompliant == null && other.getIsGcoCompliant() == null || this.isGcoCompliant != null && this.isGcoCompliant.equals(other.getIsGcoCompliant())) && (this.offerSupport == null && other.getOfferSupport() == null || this.offerSupport != null && this.offerSupport.equals(other.getOfferSupport())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.incomeAccount == null && other.getIncomeAccount() == null || this.incomeAccount != null && this.incomeAccount.equals(other.getIncomeAccount())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && this.taxSchedule.equals(other.getTaxSchedule())) && (this.shippingCost == null && other.getShippingCost() == null || this.shippingCost != null && this.shippingCost.equals(other.getShippingCost())) && (this.handlingCost == null && other.getHandlingCost() == null || this.handlingCost != null && this.handlingCost.equals(other.getHandlingCost())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && this.revRecForecastRule.equals(other.getRevRecForecastRule())) && (this.revenueAllocationGroup == null && other.getRevenueAllocationGroup() == null || this.revenueAllocationGroup != null && this.revenueAllocationGroup.equals(other.getRevenueAllocationGroup())) && (this.createRevenuePlansOn == null && other.getCreateRevenuePlansOn() == null || this.createRevenuePlansOn != null && this.createRevenuePlansOn.equals(other.getCreateRevenuePlansOn())) && (this.directRevenuePosting == null && other.getDirectRevenuePosting() == null || this.directRevenuePosting != null && this.directRevenuePosting.equals(other.getDirectRevenuePosting())) && (this.contingentRevenueHandling == null && other.getContingentRevenueHandling() == null || this.contingentRevenueHandling != null && this.contingentRevenueHandling.equals(other.getContingentRevenueHandling())) && (this.revReclassFXAccount == null && other.getRevReclassFXAccount() == null || this.revReclassFXAccount != null && this.revReclassFXAccount.equals(other.getRevReclassFXAccount())) && (this.salesTaxCode == null && other.getSalesTaxCode() == null || this.salesTaxCode != null && this.salesTaxCode.equals(other.getSalesTaxCode())) && (this.weight == null && other.getWeight() == null || this.weight != null && this.weight.equals(other.getWeight())) && (this.weightUnit == null && other.getWeightUnit() == null || this.weightUnit != null && this.weightUnit.equals(other.getWeightUnit())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.deferredRevenueAccount == null && other.getDeferredRevenueAccount() == null || this.deferredRevenueAccount != null && this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.stockDescription == null && other.getStockDescription() == null || this.stockDescription != null && this.stockDescription.equals(other.getStockDescription())) && (this.producer == null && other.getProducer() == null || this.producer != null && this.producer.equals(other.getProducer())) && (this.manufacturer == null && other.getManufacturer() == null || this.manufacturer != null && this.manufacturer.equals(other.getManufacturer())) && (this.mpn == null && other.getMpn() == null || this.mpn != null && this.mpn.equals(other.getMpn())) && (this.multManufactureAddr == null && other.getMultManufactureAddr() == null || this.multManufactureAddr != null && this.multManufactureAddr.equals(other.getMultManufactureAddr())) && (this.manufactureraddr1 == null && other.getManufactureraddr1() == null || this.manufactureraddr1 != null && this.manufactureraddr1.equals(other.getManufactureraddr1())) && (this.manufacturerCity == null && other.getManufacturerCity() == null || this.manufacturerCity != null && this.manufacturerCity.equals(other.getManufacturerCity())) && (this.manufacturerState == null && other.getManufacturerState() == null || this.manufacturerState != null && this.manufacturerState.equals(other.getManufacturerState())) && (this.manufacturerZip == null && other.getManufacturerZip() == null || this.manufacturerZip != null && this.manufacturerZip.equals(other.getManufacturerZip())) && (this.countryOfManufacture == null && other.getCountryOfManufacture() == null || this.countryOfManufacture != null && this.countryOfManufacture.equals(other.getCountryOfManufacture())) && (this.defaultItemShipMethod == null && other.getDefaultItemShipMethod() == null || this.defaultItemShipMethod != null && this.defaultItemShipMethod.equals(other.getDefaultItemShipMethod())) && (this.itemCarrier == null && other.getItemCarrier() == null || this.itemCarrier != null && this.itemCarrier.equals(other.getItemCarrier())) && (this.itemShipMethodList == null && other.getItemShipMethodList() == null || this.itemShipMethodList != null && this.itemShipMethodList.equals(other.getItemShipMethodList())) && (this.manufacturerTaxId == null && other.getManufacturerTaxId() == null || this.manufacturerTaxId != null && this.manufacturerTaxId.equals(other.getManufacturerTaxId())) && (this.scheduleBNumber == null && other.getScheduleBNumber() == null || this.scheduleBNumber != null && this.scheduleBNumber.equals(other.getScheduleBNumber())) && (this.scheduleBQuantity == null && other.getScheduleBQuantity() == null || this.scheduleBQuantity != null && this.scheduleBQuantity.equals(other.getScheduleBQuantity())) && (this.scheduleBCode == null && other.getScheduleBCode() == null || this.scheduleBCode != null && this.scheduleBCode.equals(other.getScheduleBCode())) && (this.manufacturerTariff == null && other.getManufacturerTariff() == null || this.manufacturerTariff != null && this.manufacturerTariff.equals(other.getManufacturerTariff())) && (this.preferenceCriterion == null && other.getPreferenceCriterion() == null || this.preferenceCriterion != null && this.preferenceCriterion.equals(other.getPreferenceCriterion())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.minimumQuantity == null && other.getMinimumQuantity() == null || this.minimumQuantity != null && this.minimumQuantity.equals(other.getMinimumQuantity())) && (this.enforceMinQtyInternally == null && other.getEnforceMinQtyInternally() == null || this.enforceMinQtyInternally != null && this.enforceMinQtyInternally.equals(other.getEnforceMinQtyInternally())) && (this.maximumQuantity == null && other.getMaximumQuantity() == null || this.maximumQuantity != null && this.maximumQuantity.equals(other.getMaximumQuantity())) && (this.softDescriptor == null && other.getSoftDescriptor() == null || this.softDescriptor != null && this.softDescriptor.equals(other.getSoftDescriptor())) && (this.isFulfillable == null && other.getIsFulfillable() == null || this.isFulfillable != null && this.isFulfillable.equals(other.getIsFulfillable())) && (this.pricesIncludeTax == null && other.getPricesIncludeTax() == null || this.pricesIncludeTax != null && this.pricesIncludeTax.equals(other.getPricesIncludeTax())) && (this.quantityPricingSchedule == null && other.getQuantityPricingSchedule() == null || this.quantityPricingSchedule != null && this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule())) && (this.useMarginalRates == null && other.getUseMarginalRates() == null || this.useMarginalRates != null && this.useMarginalRates.equals(other.getUseMarginalRates())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.isHazmatItem == null && other.getIsHazmatItem() == null || this.isHazmatItem != null && this.isHazmatItem.equals(other.getIsHazmatItem())) && (this.hazmatId == null && other.getHazmatId() == null || this.hazmatId != null && this.hazmatId.equals(other.getHazmatId())) && (this.hazmatShippingName == null && other.getHazmatShippingName() == null || this.hazmatShippingName != null && this.hazmatShippingName.equals(other.getHazmatShippingName())) && (this.hazmatHazardClass == null && other.getHazmatHazardClass() == null || this.hazmatHazardClass != null && this.hazmatHazardClass.equals(other.getHazmatHazardClass())) && (this.hazmatPackingGroup == null && other.getHazmatPackingGroup() == null || this.hazmatPackingGroup != null && this.hazmatPackingGroup.equals(other.getHazmatPackingGroup())) && (this.hazmatItemUnits == null && other.getHazmatItemUnits() == null || this.hazmatItemUnits != null && this.hazmatItemUnits.equals(other.getHazmatItemUnits())) && (this.hazmatItemUnitsQty == null && other.getHazmatItemUnitsQty() == null || this.hazmatItemUnitsQty != null && this.hazmatItemUnitsQty.equals(other.getHazmatItemUnitsQty())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.overallQuantityPricingType == null && other.getOverallQuantityPricingType() == null || this.overallQuantityPricingType != null && this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType())) && (this.pricingGroup == null && other.getPricingGroup() == null || this.pricingGroup != null && this.pricingGroup.equals(other.getPricingGroup())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && this.vsoeSopGroup.equals(other.getVsoeSopGroup())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && this.itemRevenueCategory.equals(other.getItemRevenueCategory())) && (this.shipIndividually == null && other.getShipIndividually() == null || this.shipIndividually != null && this.shipIndividually.equals(other.getShipIndividually())) && (this.shipPackage == null && other.getShipPackage() == null || this.shipPackage != null && this.shipPackage.equals(other.getShipPackage())) && (this.storeDisplayName == null && other.getStoreDisplayName() == null || this.storeDisplayName != null && this.storeDisplayName.equals(other.getStoreDisplayName())) && (this.storeDisplayThumbnail == null && other.getStoreDisplayThumbnail() == null || this.storeDisplayThumbnail != null && this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail())) && (this.outOfStockMessage == null && other.getOutOfStockMessage() == null || this.outOfStockMessage != null && this.outOfStockMessage.equals(other.getOutOfStockMessage())) && (this.storeDisplayImage == null && other.getStoreDisplayImage() == null || this.storeDisplayImage != null && this.storeDisplayImage.equals(other.getStoreDisplayImage())) && (this.storeDescription == null && other.getStoreDescription() == null || this.storeDescription != null && this.storeDescription.equals(other.getStoreDescription())) && (this.storeDetailedDescription == null && other.getStoreDetailedDescription() == null || this.storeDetailedDescription != null && this.storeDetailedDescription.equals(other.getStoreDetailedDescription())) && (this.storeItemTemplate == null && other.getStoreItemTemplate() == null || this.storeItemTemplate != null && this.storeItemTemplate.equals(other.getStoreItemTemplate())) && (this.pageTitle == null && other.getPageTitle() == null || this.pageTitle != null && this.pageTitle.equals(other.getPageTitle())) && (this.urlComponent == null && other.getUrlComponent() == null || this.urlComponent != null && this.urlComponent.equals(other.getUrlComponent())) && (this.metaTagHtml == null && other.getMetaTagHtml() == null || this.metaTagHtml != null && this.metaTagHtml.equals(other.getMetaTagHtml())) && (this.excludeFromSitemap == null && other.getExcludeFromSitemap() == null || this.excludeFromSitemap != null && this.excludeFromSitemap.equals(other.getExcludeFromSitemap())) && (this.sitemapPriority == null && other.getSitemapPriority() == null || this.sitemapPriority != null && this.sitemapPriority.equals(other.getSitemapPriority())) && (this.searchKeywords == null && other.getSearchKeywords() == null || this.searchKeywords != null && this.searchKeywords.equals(other.getSearchKeywords())) && (this.itemOptionsList == null && other.getItemOptionsList() == null || this.itemOptionsList != null && this.itemOptionsList.equals(other.getItemOptionsList())) && (this.isDonationItem == null && other.getIsDonationItem() == null || this.isDonationItem != null && this.isDonationItem.equals(other.getIsDonationItem())) && (this.showDefaultDonationAmount == null && other.getShowDefaultDonationAmount() == null || this.showDefaultDonationAmount != null && this.showDefaultDonationAmount.equals(other.getShowDefaultDonationAmount())) && (this.maxDonationAmount == null && other.getMaxDonationAmount() == null || this.maxDonationAmount != null && this.maxDonationAmount.equals(other.getMaxDonationAmount())) && (this.dontShowPrice == null && other.getDontShowPrice() == null || this.dontShowPrice != null && this.dontShowPrice.equals(other.getDontShowPrice())) && (this.noPriceMessage == null && other.getNoPriceMessage() == null || this.noPriceMessage != null && this.noPriceMessage.equals(other.getNoPriceMessage())) && (this.shoppingDotComCategory == null && other.getShoppingDotComCategory() == null || this.shoppingDotComCategory != null && this.shoppingDotComCategory.equals(other.getShoppingDotComCategory())) && (this.shopzillaCategoryId == null && other.getShopzillaCategoryId() == null || this.shopzillaCategoryId != null && this.shopzillaCategoryId.equals(other.getShopzillaCategoryId())) && (this.outOfStockBehavior == null && other.getOutOfStockBehavior() == null || this.outOfStockBehavior != null && this.outOfStockBehavior.equals(other.getOutOfStockBehavior())) && (this.nexTagCategory == null && other.getNexTagCategory() == null || this.nexTagCategory != null && this.nexTagCategory.equals(other.getNexTagCategory())) && (this.productFeedList == null && other.getProductFeedList() == null || this.productFeedList != null && this.productFeedList.equals(other.getProductFeedList())) && (this.relatedItemsDescription == null && other.getRelatedItemsDescription() == null || this.relatedItemsDescription != null && this.relatedItemsDescription.equals(other.getRelatedItemsDescription())) && (this.onSpecial == null && other.getOnSpecial() == null || this.onSpecial != null && this.onSpecial.equals(other.getOnSpecial())) && (this.specialsDescription == null && other.getSpecialsDescription() == null || this.specialsDescription != null && this.specialsDescription.equals(other.getSpecialsDescription())) && (this.featuredDescription == null && other.getFeaturedDescription() == null || this.featuredDescription != null && this.featuredDescription.equals(other.getFeaturedDescription())) && (this.pricingMatrix == null && other.getPricingMatrix() == null || this.pricingMatrix != null && this.pricingMatrix.equals(other.getPricingMatrix())) && (this.siteCategoryList == null && other.getSiteCategoryList() == null || this.siteCategoryList != null && this.siteCategoryList.equals(other.getSiteCategoryList())) && (this.memberList == null && other.getMemberList() == null || this.memberList != null && this.memberList.equals(other.getMemberList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.presentationItemList == null && other.getPresentationItemList() == null || this.presentationItemList != null && this.presentationItemList.equals(other.getPresentationItemList())) && (this.hierarchyVersionsList == null && other.getHierarchyVersionsList() == null || this.hierarchyVersionsList != null && this.hierarchyVersionsList.equals(other.getHierarchyVersionsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPrintItems() != null) {
            _hashCode += this.getPrintItems().hashCode();
        }
        if (this.getIsOnline() != null) {
            _hashCode += this.getIsOnline().hashCode();
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
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getIncomeAccount() != null) {
            _hashCode += this.getIncomeAccount().hashCode();
        }
        if (this.getTaxSchedule() != null) {
            _hashCode += this.getTaxSchedule().hashCode();
        }
        if (this.getShippingCost() != null) {
            _hashCode += this.getShippingCost().hashCode();
        }
        if (this.getHandlingCost() != null) {
            _hashCode += this.getHandlingCost().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getDeferRevRec() != null) {
            _hashCode += this.getDeferRevRec().hashCode();
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
        if (this.getContingentRevenueHandling() != null) {
            _hashCode += this.getContingentRevenueHandling().hashCode();
        }
        if (this.getRevReclassFXAccount() != null) {
            _hashCode += this.getRevReclassFXAccount().hashCode();
        }
        if (this.getSalesTaxCode() != null) {
            _hashCode += this.getSalesTaxCode().hashCode();
        }
        if (this.getWeight() != null) {
            _hashCode += this.getWeight().hashCode();
        }
        if (this.getWeightUnit() != null) {
            _hashCode += this.getWeightUnit().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getDeferredRevenueAccount() != null) {
            _hashCode += this.getDeferredRevenueAccount().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getStockDescription() != null) {
            _hashCode += this.getStockDescription().hashCode();
        }
        if (this.getProducer() != null) {
            _hashCode += this.getProducer().hashCode();
        }
        if (this.getManufacturer() != null) {
            _hashCode += this.getManufacturer().hashCode();
        }
        if (this.getMpn() != null) {
            _hashCode += this.getMpn().hashCode();
        }
        if (this.getMultManufactureAddr() != null) {
            _hashCode += this.getMultManufactureAddr().hashCode();
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
        if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
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
        if (this.getSoftDescriptor() != null) {
            _hashCode += this.getSoftDescriptor().hashCode();
        }
        if (this.getIsFulfillable() != null) {
            _hashCode += this.getIsFulfillable().hashCode();
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
        if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
        }
        if (this.getOverallQuantityPricingType() != null) {
            _hashCode += this.getOverallQuantityPricingType().hashCode();
        }
        if (this.getPricingGroup() != null) {
            _hashCode += this.getPricingGroup().hashCode();
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
        if (this.getShipIndividually() != null) {
            _hashCode += this.getShipIndividually().hashCode();
        }
        if (this.getShipPackage() != null) {
            _hashCode += this.getShipPackage().hashCode();
        }
        if (this.getStoreDisplayName() != null) {
            _hashCode += this.getStoreDisplayName().hashCode();
        }
        if (this.getStoreDisplayThumbnail() != null) {
            _hashCode += this.getStoreDisplayThumbnail().hashCode();
        }
        if (this.getOutOfStockMessage() != null) {
            _hashCode += this.getOutOfStockMessage().hashCode();
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
        if (this.getUrlComponent() != null) {
            _hashCode += this.getUrlComponent().hashCode();
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
        if (this.getItemOptionsList() != null) {
            _hashCode += this.getItemOptionsList().hashCode();
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
        if (this.getDontShowPrice() != null) {
            _hashCode += this.getDontShowPrice().hashCode();
        }
        if (this.getNoPriceMessage() != null) {
            _hashCode += this.getNoPriceMessage().hashCode();
        }
        if (this.getShoppingDotComCategory() != null) {
            _hashCode += this.getShoppingDotComCategory().hashCode();
        }
        if (this.getShopzillaCategoryId() != null) {
            _hashCode += this.getShopzillaCategoryId().hashCode();
        }
        if (this.getOutOfStockBehavior() != null) {
            _hashCode += this.getOutOfStockBehavior().hashCode();
        }
        if (this.getNexTagCategory() != null) {
            _hashCode += this.getNexTagCategory().hashCode();
        }
        if (this.getProductFeedList() != null) {
            _hashCode += this.getProductFeedList().hashCode();
        }
        if (this.getRelatedItemsDescription() != null) {
            _hashCode += this.getRelatedItemsDescription().hashCode();
        }
        if (this.getOnSpecial() != null) {
            _hashCode += this.getOnSpecial().hashCode();
        }
        if (this.getSpecialsDescription() != null) {
            _hashCode += this.getSpecialsDescription().hashCode();
        }
        if (this.getFeaturedDescription() != null) {
            _hashCode += this.getFeaturedDescription().hashCode();
        }
        if (this.getPricingMatrix() != null) {
            _hashCode += this.getPricingMatrix().hashCode();
        }
        if (this.getSiteCategoryList() != null) {
            _hashCode += this.getSiteCategoryList().hashCode();
        }
        if (this.getMemberList() != null) {
            _hashCode += this.getMemberList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
        }
        if (this.getPresentationItemList() != null) {
            _hashCode += this.getPresentationItemList().hashCode();
        }
        if (this.getHierarchyVersionsList() != null) {
            _hashCode += this.getHierarchyVersionsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "KitItem"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("printItems");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "printItems"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
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
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxSchedule"));
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
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("contingentRevenueHandling");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "contingentRevenueHandling"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revReclassFXAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revReclassFXAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("weight");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "weightUnit"));
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
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("manufactureraddr1");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "manufactureraddr1"));
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
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costEstimate"));
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
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "outOfStockMessage"));
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
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "urlComponent"));
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
        elemField.setFieldName("itemOptionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemOptionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemOptionsList"));
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
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemOutOfStockBehavior"));
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
        elemField.setFieldName("productFeedList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "productFeedList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ProductFeedList"));
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
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("siteCategoryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "siteCategoryList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SiteCategoryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memberList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memberList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemMemberList"));
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
        elemField.setFieldName("hierarchyVersionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hierarchyVersionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "KitItemHierarchyVersionsList"));
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

