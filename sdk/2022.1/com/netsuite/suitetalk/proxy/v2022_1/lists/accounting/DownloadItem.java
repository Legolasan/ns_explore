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
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.PresentationItemList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.PricingMatrix;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.SiteCategoryList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemOutOfStockBehavior;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemOverallQuantityPricingType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.ItemCostEstimateType;
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

public class DownloadItem
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef customForm;
    private String salesDescription;
    private RecordRef quantityPricingSchedule;
    private RecordRef deferredRevenueAccount;
    private Boolean onSpecial;
    private String itemId;
    private String upcCode;
    private String displayName;
    private RecordRef parent;
    private Boolean isOnline;
    private Boolean isGcoCompliant;
    private Boolean offerSupport;
    private Boolean isInactive;
    private Boolean availableToPartners;
    private RecordRefList subsidiaryList;
    private RecordRef department;
    private Boolean includeChildren;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef incomeAccount;
    private Long numOfAllowedDownloads;
    private Long daysBeforeExpiration;
    private Boolean immediateDownload;
    private Boolean isTaxable;
    private RecordRef issueProduct;
    private RecordRef taxSchedule;
    private ItemCostEstimateType costEstimateType;
    private Double costEstimate;
    private RecordRef billingSchedule;
    private Boolean isFulfillable;
    private Boolean useMarginalRates;
    private ItemOverallQuantityPricingType overallQuantityPricingType;
    private RecordRef pricingGroup;
    private RecordRef revRecSchedule;
    private Double vsoePrice;
    private VsoeSopGroup vsoeSopGroup;
    private VsoeDeferral vsoeDeferral;
    private VsoePermitDiscount vsoePermitDiscount;
    private Boolean vsoeDelivered;
    private RecordRef itemRevenueCategory;
    private Boolean deferRevRec;
    private RecordRef revenueRecognitionRule;
    private RecordRef revRecForecastRule;
    private RecordRef revenueAllocationGroup;
    private RecordRef createRevenuePlansOn;
    private Boolean directRevenuePosting;
    private String storeDisplayName;
    private RecordRef storeDisplayThumbnail;
    private RecordRef storeDisplayImage;
    private String featuredDescription;
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
    private Boolean dontShowPrice;
    private String noPriceMessage;
    private String outOfStockMessage;
    private ItemOutOfStockBehavior outOfStockBehavior;
    private String relatedItemsDescription;
    private String specialsDescription;
    private PricingMatrix pricingMatrix;
    private ItemAccountingBookDetailList accountingBookDetailList;
    private SiteCategoryList siteCategoryList;
    private PresentationItemList presentationItemList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(DownloadItem.class, true);

    public DownloadItem() {
    }

    public DownloadItem(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef customForm, String salesDescription, RecordRef quantityPricingSchedule, RecordRef deferredRevenueAccount, Boolean onSpecial, String itemId, String upcCode, String displayName, RecordRef parent, Boolean isOnline, Boolean isGcoCompliant, Boolean offerSupport, Boolean isInactive, Boolean availableToPartners, RecordRefList subsidiaryList, RecordRef department, Boolean includeChildren, RecordRef _class, RecordRef location, RecordRef incomeAccount, Long numOfAllowedDownloads, Long daysBeforeExpiration, Boolean immediateDownload, Boolean isTaxable, RecordRef issueProduct, RecordRef taxSchedule, ItemCostEstimateType costEstimateType, Double costEstimate, RecordRef billingSchedule, Boolean isFulfillable, Boolean useMarginalRates, ItemOverallQuantityPricingType overallQuantityPricingType, RecordRef pricingGroup, RecordRef revRecSchedule, Double vsoePrice, VsoeSopGroup vsoeSopGroup, VsoeDeferral vsoeDeferral, VsoePermitDiscount vsoePermitDiscount, Boolean vsoeDelivered, RecordRef itemRevenueCategory, Boolean deferRevRec, RecordRef revenueRecognitionRule, RecordRef revRecForecastRule, RecordRef revenueAllocationGroup, RecordRef createRevenuePlansOn, Boolean directRevenuePosting, String storeDisplayName, RecordRef storeDisplayThumbnail, RecordRef storeDisplayImage, String featuredDescription, String storeDescription, String storeDetailedDescription, RecordRef storeItemTemplate, String pageTitle, String metaTagHtml, Boolean excludeFromSitemap, SitemapPriority sitemapPriority, String searchKeywords, Boolean isDonationItem, Boolean showDefaultDonationAmount, Double maxDonationAmount, Boolean dontShowPrice, String noPriceMessage, String outOfStockMessage, ItemOutOfStockBehavior outOfStockBehavior, String relatedItemsDescription, String specialsDescription, PricingMatrix pricingMatrix, ItemAccountingBookDetailList accountingBookDetailList, SiteCategoryList siteCategoryList, PresentationItemList presentationItemList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.salesDescription = salesDescription;
        this.quantityPricingSchedule = quantityPricingSchedule;
        this.deferredRevenueAccount = deferredRevenueAccount;
        this.onSpecial = onSpecial;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.parent = parent;
        this.isOnline = isOnline;
        this.isGcoCompliant = isGcoCompliant;
        this.offerSupport = offerSupport;
        this.isInactive = isInactive;
        this.availableToPartners = availableToPartners;
        this.subsidiaryList = subsidiaryList;
        this.department = department;
        this.includeChildren = includeChildren;
        this._class = _class;
        this.location = location;
        this.incomeAccount = incomeAccount;
        this.numOfAllowedDownloads = numOfAllowedDownloads;
        this.daysBeforeExpiration = daysBeforeExpiration;
        this.immediateDownload = immediateDownload;
        this.isTaxable = isTaxable;
        this.issueProduct = issueProduct;
        this.taxSchedule = taxSchedule;
        this.costEstimateType = costEstimateType;
        this.costEstimate = costEstimate;
        this.billingSchedule = billingSchedule;
        this.isFulfillable = isFulfillable;
        this.useMarginalRates = useMarginalRates;
        this.overallQuantityPricingType = overallQuantityPricingType;
        this.pricingGroup = pricingGroup;
        this.revRecSchedule = revRecSchedule;
        this.vsoePrice = vsoePrice;
        this.vsoeSopGroup = vsoeSopGroup;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.itemRevenueCategory = itemRevenueCategory;
        this.deferRevRec = deferRevRec;
        this.revenueRecognitionRule = revenueRecognitionRule;
        this.revRecForecastRule = revRecForecastRule;
        this.revenueAllocationGroup = revenueAllocationGroup;
        this.createRevenuePlansOn = createRevenuePlansOn;
        this.directRevenuePosting = directRevenuePosting;
        this.storeDisplayName = storeDisplayName;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.storeDisplayImage = storeDisplayImage;
        this.featuredDescription = featuredDescription;
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
        this.dontShowPrice = dontShowPrice;
        this.noPriceMessage = noPriceMessage;
        this.outOfStockMessage = outOfStockMessage;
        this.outOfStockBehavior = outOfStockBehavior;
        this.relatedItemsDescription = relatedItemsDescription;
        this.specialsDescription = specialsDescription;
        this.pricingMatrix = pricingMatrix;
        this.accountingBookDetailList = accountingBookDetailList;
        this.siteCategoryList = siteCategoryList;
        this.presentationItemList = presentationItemList;
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

    public String getSalesDescription() {
        return this.salesDescription;
    }

    public void setSalesDescription(String salesDescription) {
        this.salesDescription = salesDescription;
    }

    public RecordRef getQuantityPricingSchedule() {
        return this.quantityPricingSchedule;
    }

    public void setQuantityPricingSchedule(RecordRef quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }

    public RecordRef getDeferredRevenueAccount() {
        return this.deferredRevenueAccount;
    }

    public void setDeferredRevenueAccount(RecordRef deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }

    public Boolean getOnSpecial() {
        return this.onSpecial;
    }

    public void setOnSpecial(Boolean onSpecial) {
        this.onSpecial = onSpecial;
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

    public RecordRefList getSubsidiaryList() {
        return this.subsidiaryList;
    }

    public void setSubsidiaryList(RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public Boolean getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(Boolean includeChildren) {
        this.includeChildren = includeChildren;
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

    public RecordRef getIncomeAccount() {
        return this.incomeAccount;
    }

    public void setIncomeAccount(RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }

    public Long getNumOfAllowedDownloads() {
        return this.numOfAllowedDownloads;
    }

    public void setNumOfAllowedDownloads(Long numOfAllowedDownloads) {
        this.numOfAllowedDownloads = numOfAllowedDownloads;
    }

    public Long getDaysBeforeExpiration() {
        return this.daysBeforeExpiration;
    }

    public void setDaysBeforeExpiration(Long daysBeforeExpiration) {
        this.daysBeforeExpiration = daysBeforeExpiration;
    }

    public Boolean getImmediateDownload() {
        return this.immediateDownload;
    }

    public void setImmediateDownload(Boolean immediateDownload) {
        this.immediateDownload = immediateDownload;
    }

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public RecordRef getIssueProduct() {
        return this.issueProduct;
    }

    public void setIssueProduct(RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }

    public RecordRef getTaxSchedule() {
        return this.taxSchedule;
    }

    public void setTaxSchedule(RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
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

    public RecordRef getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public Boolean getIsFulfillable() {
        return this.isFulfillable;
    }

    public void setIsFulfillable(Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }

    public Boolean getUseMarginalRates() {
        return this.useMarginalRates;
    }

    public void setUseMarginalRates(Boolean useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
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

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
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

    public RecordRef getStoreDisplayImage() {
        return this.storeDisplayImage;
    }

    public void setStoreDisplayImage(RecordRef storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }

    public String getFeaturedDescription() {
        return this.featuredDescription;
    }

    public void setFeaturedDescription(String featuredDescription) {
        this.featuredDescription = featuredDescription;
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

    public String getSpecialsDescription() {
        return this.specialsDescription;
    }

    public void setSpecialsDescription(String specialsDescription) {
        this.specialsDescription = specialsDescription;
    }

    public PricingMatrix getPricingMatrix() {
        return this.pricingMatrix;
    }

    public void setPricingMatrix(PricingMatrix pricingMatrix) {
        this.pricingMatrix = pricingMatrix;
    }

    public ItemAccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(ItemAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public SiteCategoryList getSiteCategoryList() {
        return this.siteCategoryList;
    }

    public void setSiteCategoryList(SiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }

    public PresentationItemList getPresentationItemList() {
        return this.presentationItemList;
    }

    public void setPresentationItemList(PresentationItemList presentationItemList) {
        this.presentationItemList = presentationItemList;
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
        if (!(obj instanceof DownloadItem)) {
            return false;
        }
        DownloadItem other = (DownloadItem)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.salesDescription == null && other.getSalesDescription() == null || this.salesDescription != null && this.salesDescription.equals(other.getSalesDescription())) && (this.quantityPricingSchedule == null && other.getQuantityPricingSchedule() == null || this.quantityPricingSchedule != null && this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule())) && (this.deferredRevenueAccount == null && other.getDeferredRevenueAccount() == null || this.deferredRevenueAccount != null && this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount())) && (this.onSpecial == null && other.getOnSpecial() == null || this.onSpecial != null && this.onSpecial.equals(other.getOnSpecial())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && this.upcCode.equals(other.getUpcCode())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && this.isOnline.equals(other.getIsOnline())) && (this.isGcoCompliant == null && other.getIsGcoCompliant() == null || this.isGcoCompliant != null && this.isGcoCompliant.equals(other.getIsGcoCompliant())) && (this.offerSupport == null && other.getOfferSupport() == null || this.offerSupport != null && this.offerSupport.equals(other.getOfferSupport())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.incomeAccount == null && other.getIncomeAccount() == null || this.incomeAccount != null && this.incomeAccount.equals(other.getIncomeAccount())) && (this.numOfAllowedDownloads == null && other.getNumOfAllowedDownloads() == null || this.numOfAllowedDownloads != null && this.numOfAllowedDownloads.equals(other.getNumOfAllowedDownloads())) && (this.daysBeforeExpiration == null && other.getDaysBeforeExpiration() == null || this.daysBeforeExpiration != null && this.daysBeforeExpiration.equals(other.getDaysBeforeExpiration())) && (this.immediateDownload == null && other.getImmediateDownload() == null || this.immediateDownload != null && this.immediateDownload.equals(other.getImmediateDownload())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && this.taxSchedule.equals(other.getTaxSchedule())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.isFulfillable == null && other.getIsFulfillable() == null || this.isFulfillable != null && this.isFulfillable.equals(other.getIsFulfillable())) && (this.useMarginalRates == null && other.getUseMarginalRates() == null || this.useMarginalRates != null && this.useMarginalRates.equals(other.getUseMarginalRates())) && (this.overallQuantityPricingType == null && other.getOverallQuantityPricingType() == null || this.overallQuantityPricingType != null && this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType())) && (this.pricingGroup == null && other.getPricingGroup() == null || this.pricingGroup != null && this.pricingGroup.equals(other.getPricingGroup())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && this.vsoeSopGroup.equals(other.getVsoeSopGroup())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && this.itemRevenueCategory.equals(other.getItemRevenueCategory())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && this.revRecForecastRule.equals(other.getRevRecForecastRule())) && (this.revenueAllocationGroup == null && other.getRevenueAllocationGroup() == null || this.revenueAllocationGroup != null && this.revenueAllocationGroup.equals(other.getRevenueAllocationGroup())) && (this.createRevenuePlansOn == null && other.getCreateRevenuePlansOn() == null || this.createRevenuePlansOn != null && this.createRevenuePlansOn.equals(other.getCreateRevenuePlansOn())) && (this.directRevenuePosting == null && other.getDirectRevenuePosting() == null || this.directRevenuePosting != null && this.directRevenuePosting.equals(other.getDirectRevenuePosting())) && (this.storeDisplayName == null && other.getStoreDisplayName() == null || this.storeDisplayName != null && this.storeDisplayName.equals(other.getStoreDisplayName())) && (this.storeDisplayThumbnail == null && other.getStoreDisplayThumbnail() == null || this.storeDisplayThumbnail != null && this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail())) && (this.storeDisplayImage == null && other.getStoreDisplayImage() == null || this.storeDisplayImage != null && this.storeDisplayImage.equals(other.getStoreDisplayImage())) && (this.featuredDescription == null && other.getFeaturedDescription() == null || this.featuredDescription != null && this.featuredDescription.equals(other.getFeaturedDescription())) && (this.storeDescription == null && other.getStoreDescription() == null || this.storeDescription != null && this.storeDescription.equals(other.getStoreDescription())) && (this.storeDetailedDescription == null && other.getStoreDetailedDescription() == null || this.storeDetailedDescription != null && this.storeDetailedDescription.equals(other.getStoreDetailedDescription())) && (this.storeItemTemplate == null && other.getStoreItemTemplate() == null || this.storeItemTemplate != null && this.storeItemTemplate.equals(other.getStoreItemTemplate())) && (this.pageTitle == null && other.getPageTitle() == null || this.pageTitle != null && this.pageTitle.equals(other.getPageTitle())) && (this.metaTagHtml == null && other.getMetaTagHtml() == null || this.metaTagHtml != null && this.metaTagHtml.equals(other.getMetaTagHtml())) && (this.excludeFromSitemap == null && other.getExcludeFromSitemap() == null || this.excludeFromSitemap != null && this.excludeFromSitemap.equals(other.getExcludeFromSitemap())) && (this.sitemapPriority == null && other.getSitemapPriority() == null || this.sitemapPriority != null && this.sitemapPriority.equals(other.getSitemapPriority())) && (this.searchKeywords == null && other.getSearchKeywords() == null || this.searchKeywords != null && this.searchKeywords.equals(other.getSearchKeywords())) && (this.isDonationItem == null && other.getIsDonationItem() == null || this.isDonationItem != null && this.isDonationItem.equals(other.getIsDonationItem())) && (this.showDefaultDonationAmount == null && other.getShowDefaultDonationAmount() == null || this.showDefaultDonationAmount != null && this.showDefaultDonationAmount.equals(other.getShowDefaultDonationAmount())) && (this.maxDonationAmount == null && other.getMaxDonationAmount() == null || this.maxDonationAmount != null && this.maxDonationAmount.equals(other.getMaxDonationAmount())) && (this.dontShowPrice == null && other.getDontShowPrice() == null || this.dontShowPrice != null && this.dontShowPrice.equals(other.getDontShowPrice())) && (this.noPriceMessage == null && other.getNoPriceMessage() == null || this.noPriceMessage != null && this.noPriceMessage.equals(other.getNoPriceMessage())) && (this.outOfStockMessage == null && other.getOutOfStockMessage() == null || this.outOfStockMessage != null && this.outOfStockMessage.equals(other.getOutOfStockMessage())) && (this.outOfStockBehavior == null && other.getOutOfStockBehavior() == null || this.outOfStockBehavior != null && this.outOfStockBehavior.equals(other.getOutOfStockBehavior())) && (this.relatedItemsDescription == null && other.getRelatedItemsDescription() == null || this.relatedItemsDescription != null && this.relatedItemsDescription.equals(other.getRelatedItemsDescription())) && (this.specialsDescription == null && other.getSpecialsDescription() == null || this.specialsDescription != null && this.specialsDescription.equals(other.getSpecialsDescription())) && (this.pricingMatrix == null && other.getPricingMatrix() == null || this.pricingMatrix != null && this.pricingMatrix.equals(other.getPricingMatrix())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.siteCategoryList == null && other.getSiteCategoryList() == null || this.siteCategoryList != null && this.siteCategoryList.equals(other.getSiteCategoryList())) && (this.presentationItemList == null && other.getPresentationItemList() == null || this.presentationItemList != null && this.presentationItemList.equals(other.getPresentationItemList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getSalesDescription() != null) {
            _hashCode += this.getSalesDescription().hashCode();
        }
        if (this.getQuantityPricingSchedule() != null) {
            _hashCode += this.getQuantityPricingSchedule().hashCode();
        }
        if (this.getDeferredRevenueAccount() != null) {
            _hashCode += this.getDeferredRevenueAccount().hashCode();
        }
        if (this.getOnSpecial() != null) {
            _hashCode += this.getOnSpecial().hashCode();
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
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getIncomeAccount() != null) {
            _hashCode += this.getIncomeAccount().hashCode();
        }
        if (this.getNumOfAllowedDownloads() != null) {
            _hashCode += this.getNumOfAllowedDownloads().hashCode();
        }
        if (this.getDaysBeforeExpiration() != null) {
            _hashCode += this.getDaysBeforeExpiration().hashCode();
        }
        if (this.getImmediateDownload() != null) {
            _hashCode += this.getImmediateDownload().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
        }
        if (this.getTaxSchedule() != null) {
            _hashCode += this.getTaxSchedule().hashCode();
        }
        if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
        }
        if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getIsFulfillable() != null) {
            _hashCode += this.getIsFulfillable().hashCode();
        }
        if (this.getUseMarginalRates() != null) {
            _hashCode += this.getUseMarginalRates().hashCode();
        }
        if (this.getOverallQuantityPricingType() != null) {
            _hashCode += this.getOverallQuantityPricingType().hashCode();
        }
        if (this.getPricingGroup() != null) {
            _hashCode += this.getPricingGroup().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
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
        if (this.getStoreDisplayName() != null) {
            _hashCode += this.getStoreDisplayName().hashCode();
        }
        if (this.getStoreDisplayThumbnail() != null) {
            _hashCode += this.getStoreDisplayThumbnail().hashCode();
        }
        if (this.getStoreDisplayImage() != null) {
            _hashCode += this.getStoreDisplayImage().hashCode();
        }
        if (this.getFeaturedDescription() != null) {
            _hashCode += this.getFeaturedDescription().hashCode();
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
        if (this.getDontShowPrice() != null) {
            _hashCode += this.getDontShowPrice().hashCode();
        }
        if (this.getNoPriceMessage() != null) {
            _hashCode += this.getNoPriceMessage().hashCode();
        }
        if (this.getOutOfStockMessage() != null) {
            _hashCode += this.getOutOfStockMessage().hashCode();
        }
        if (this.getOutOfStockBehavior() != null) {
            _hashCode += this.getOutOfStockBehavior().hashCode();
        }
        if (this.getRelatedItemsDescription() != null) {
            _hashCode += this.getRelatedItemsDescription().hashCode();
        }
        if (this.getSpecialsDescription() != null) {
            _hashCode += this.getSpecialsDescription().hashCode();
        }
        if (this.getPricingMatrix() != null) {
            _hashCode += this.getPricingMatrix().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getSiteCategoryList() != null) {
            _hashCode += this.getSiteCategoryList().hashCode();
        }
        if (this.getPresentationItemList() != null) {
            _hashCode += this.getPresentationItemList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "DownloadItem"));
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
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "deferredRevenueAccount"));
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
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
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
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numOfAllowedDownloads");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "numOfAllowedDownloads"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysBeforeExpiration");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "daysBeforeExpiration"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("immediateDownload");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "immediateDownload"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "issueProduct"));
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
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billingSchedule"));
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
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revRecSchedule"));
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
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("specialsDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "specialsDescription"));
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
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemAccountingBookDetailList"));
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
        elemField.setFieldName("presentationItemList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "presentationItemList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "PresentationItemList"));
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

