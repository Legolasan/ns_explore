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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemInvtClassification;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.PeriodicLotSizeType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InventoryItemLocations
implements Serializable {
    private String location;
    private Double quantityOnHand;
    private Double onHandValueMli;
    private Double averageCostMli;
    private Double lastPurchasePriceMli;
    private Double reorderPoint;
    private Boolean locationAllowStorePickup;
    private Double locationStorePickupBufferStock;
    private Double locationQtyAvailForStorePickup;
    private Double preferredStockLevel;
    private Long leadTime;
    private Double defaultReturnCost;
    private Double safetyStockLevel;
    private Double cost;
    private RecordRef inventoryCostTemplate;
    private Double buildTime;
    private Double fixedBuildTime;
    private Double buildTimeLotSize;
    private Calendar lastInvtCountDate;
    private Calendar nextInvtCountDate;
    private Boolean isWip;
    private Long invtCountInterval;
    private ItemInvtClassification invtClassification;
    private Double costingLotSize;
    private Double quantityOnOrder;
    private Double quantityCommitted;
    private Double quantityAvailable;
    private Double quantityBackOrdered;
    private RecordRef locationId;
    private RecordRef supplyReplenishmentMethod;
    private RecordRef alternateDemandSourceItem;
    private Double fixedLotSize;
    private PeriodicLotSizeType periodicLotSizeType;
    private Long periodicLotSizeDays;
    private RecordRef supplyType;
    private RecordRef supplyLotSizingMethod;
    private RecordRef demandSource;
    private Long backwardConsumptionDays;
    private Long forwardConsumptionDays;
    private Long demandTimeFence;
    private Long supplyTimeFence;
    private Long rescheduleInDays;
    private Long rescheduleOutDays;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InventoryItemLocations.class, true);

    public InventoryItemLocations() {
    }

    public InventoryItemLocations(String location, Double quantityOnHand, Double onHandValueMli, Double averageCostMli, Double lastPurchasePriceMli, Double reorderPoint, Boolean locationAllowStorePickup, Double locationStorePickupBufferStock, Double locationQtyAvailForStorePickup, Double preferredStockLevel, Long leadTime, Double defaultReturnCost, Double safetyStockLevel, Double cost, RecordRef inventoryCostTemplate, Double buildTime, Double fixedBuildTime, Double buildTimeLotSize, Calendar lastInvtCountDate, Calendar nextInvtCountDate, Boolean isWip, Long invtCountInterval, ItemInvtClassification invtClassification, Double costingLotSize, Double quantityOnOrder, Double quantityCommitted, Double quantityAvailable, Double quantityBackOrdered, RecordRef locationId, RecordRef supplyReplenishmentMethod, RecordRef alternateDemandSourceItem, Double fixedLotSize, PeriodicLotSizeType periodicLotSizeType, Long periodicLotSizeDays, RecordRef supplyType, RecordRef supplyLotSizingMethod, RecordRef demandSource, Long backwardConsumptionDays, Long forwardConsumptionDays, Long demandTimeFence, Long supplyTimeFence, Long rescheduleInDays, Long rescheduleOutDays) {
        this.location = location;
        this.quantityOnHand = quantityOnHand;
        this.onHandValueMli = onHandValueMli;
        this.averageCostMli = averageCostMli;
        this.lastPurchasePriceMli = lastPurchasePriceMli;
        this.reorderPoint = reorderPoint;
        this.locationAllowStorePickup = locationAllowStorePickup;
        this.locationStorePickupBufferStock = locationStorePickupBufferStock;
        this.locationQtyAvailForStorePickup = locationQtyAvailForStorePickup;
        this.preferredStockLevel = preferredStockLevel;
        this.leadTime = leadTime;
        this.defaultReturnCost = defaultReturnCost;
        this.safetyStockLevel = safetyStockLevel;
        this.cost = cost;
        this.inventoryCostTemplate = inventoryCostTemplate;
        this.buildTime = buildTime;
        this.fixedBuildTime = fixedBuildTime;
        this.buildTimeLotSize = buildTimeLotSize;
        this.lastInvtCountDate = lastInvtCountDate;
        this.nextInvtCountDate = nextInvtCountDate;
        this.isWip = isWip;
        this.invtCountInterval = invtCountInterval;
        this.invtClassification = invtClassification;
        this.costingLotSize = costingLotSize;
        this.quantityOnOrder = quantityOnOrder;
        this.quantityCommitted = quantityCommitted;
        this.quantityAvailable = quantityAvailable;
        this.quantityBackOrdered = quantityBackOrdered;
        this.locationId = locationId;
        this.supplyReplenishmentMethod = supplyReplenishmentMethod;
        this.alternateDemandSourceItem = alternateDemandSourceItem;
        this.fixedLotSize = fixedLotSize;
        this.periodicLotSizeType = periodicLotSizeType;
        this.periodicLotSizeDays = periodicLotSizeDays;
        this.supplyType = supplyType;
        this.supplyLotSizingMethod = supplyLotSizingMethod;
        this.demandSource = demandSource;
        this.backwardConsumptionDays = backwardConsumptionDays;
        this.forwardConsumptionDays = forwardConsumptionDays;
        this.demandTimeFence = demandTimeFence;
        this.supplyTimeFence = supplyTimeFence;
        this.rescheduleInDays = rescheduleInDays;
        this.rescheduleOutDays = rescheduleOutDays;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public Double getOnHandValueMli() {
        return this.onHandValueMli;
    }

    public void setOnHandValueMli(Double onHandValueMli) {
        this.onHandValueMli = onHandValueMli;
    }

    public Double getAverageCostMli() {
        return this.averageCostMli;
    }

    public void setAverageCostMli(Double averageCostMli) {
        this.averageCostMli = averageCostMli;
    }

    public Double getLastPurchasePriceMli() {
        return this.lastPurchasePriceMli;
    }

    public void setLastPurchasePriceMli(Double lastPurchasePriceMli) {
        this.lastPurchasePriceMli = lastPurchasePriceMli;
    }

    public Double getReorderPoint() {
        return this.reorderPoint;
    }

    public void setReorderPoint(Double reorderPoint) {
        this.reorderPoint = reorderPoint;
    }

    public Boolean getLocationAllowStorePickup() {
        return this.locationAllowStorePickup;
    }

    public void setLocationAllowStorePickup(Boolean locationAllowStorePickup) {
        this.locationAllowStorePickup = locationAllowStorePickup;
    }

    public Double getLocationStorePickupBufferStock() {
        return this.locationStorePickupBufferStock;
    }

    public void setLocationStorePickupBufferStock(Double locationStorePickupBufferStock) {
        this.locationStorePickupBufferStock = locationStorePickupBufferStock;
    }

    public Double getLocationQtyAvailForStorePickup() {
        return this.locationQtyAvailForStorePickup;
    }

    public void setLocationQtyAvailForStorePickup(Double locationQtyAvailForStorePickup) {
        this.locationQtyAvailForStorePickup = locationQtyAvailForStorePickup;
    }

    public Double getPreferredStockLevel() {
        return this.preferredStockLevel;
    }

    public void setPreferredStockLevel(Double preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }

    public Long getLeadTime() {
        return this.leadTime;
    }

    public void setLeadTime(Long leadTime) {
        this.leadTime = leadTime;
    }

    public Double getDefaultReturnCost() {
        return this.defaultReturnCost;
    }

    public void setDefaultReturnCost(Double defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }

    public Double getSafetyStockLevel() {
        return this.safetyStockLevel;
    }

    public void setSafetyStockLevel(Double safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public RecordRef getInventoryCostTemplate() {
        return this.inventoryCostTemplate;
    }

    public void setInventoryCostTemplate(RecordRef inventoryCostTemplate) {
        this.inventoryCostTemplate = inventoryCostTemplate;
    }

    public Double getBuildTime() {
        return this.buildTime;
    }

    public void setBuildTime(Double buildTime) {
        this.buildTime = buildTime;
    }

    public Double getFixedBuildTime() {
        return this.fixedBuildTime;
    }

    public void setFixedBuildTime(Double fixedBuildTime) {
        this.fixedBuildTime = fixedBuildTime;
    }

    public Double getBuildTimeLotSize() {
        return this.buildTimeLotSize;
    }

    public void setBuildTimeLotSize(Double buildTimeLotSize) {
        this.buildTimeLotSize = buildTimeLotSize;
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

    public Boolean getIsWip() {
        return this.isWip;
    }

    public void setIsWip(Boolean isWip) {
        this.isWip = isWip;
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

    public Double getCostingLotSize() {
        return this.costingLotSize;
    }

    public void setCostingLotSize(Double costingLotSize) {
        this.costingLotSize = costingLotSize;
    }

    public Double getQuantityOnOrder() {
        return this.quantityOnOrder;
    }

    public void setQuantityOnOrder(Double quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
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

    public RecordRef getLocationId() {
        return this.locationId;
    }

    public void setLocationId(RecordRef locationId) {
        this.locationId = locationId;
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

    public Long getPeriodicLotSizeDays() {
        return this.periodicLotSizeDays;
    }

    public void setPeriodicLotSizeDays(Long periodicLotSizeDays) {
        this.periodicLotSizeDays = periodicLotSizeDays;
    }

    public RecordRef getSupplyType() {
        return this.supplyType;
    }

    public void setSupplyType(RecordRef supplyType) {
        this.supplyType = supplyType;
    }

    public RecordRef getSupplyLotSizingMethod() {
        return this.supplyLotSizingMethod;
    }

    public void setSupplyLotSizingMethod(RecordRef supplyLotSizingMethod) {
        this.supplyLotSizingMethod = supplyLotSizingMethod;
    }

    public RecordRef getDemandSource() {
        return this.demandSource;
    }

    public void setDemandSource(RecordRef demandSource) {
        this.demandSource = demandSource;
    }

    public Long getBackwardConsumptionDays() {
        return this.backwardConsumptionDays;
    }

    public void setBackwardConsumptionDays(Long backwardConsumptionDays) {
        this.backwardConsumptionDays = backwardConsumptionDays;
    }

    public Long getForwardConsumptionDays() {
        return this.forwardConsumptionDays;
    }

    public void setForwardConsumptionDays(Long forwardConsumptionDays) {
        this.forwardConsumptionDays = forwardConsumptionDays;
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

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InventoryItemLocations)) {
            return false;
        }
        InventoryItemLocations other = (InventoryItemLocations)obj;
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
        boolean _equals = (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.onHandValueMli == null && other.getOnHandValueMli() == null || this.onHandValueMli != null && this.onHandValueMli.equals(other.getOnHandValueMli())) && (this.averageCostMli == null && other.getAverageCostMli() == null || this.averageCostMli != null && this.averageCostMli.equals(other.getAverageCostMli())) && (this.lastPurchasePriceMli == null && other.getLastPurchasePriceMli() == null || this.lastPurchasePriceMli != null && this.lastPurchasePriceMli.equals(other.getLastPurchasePriceMli())) && (this.reorderPoint == null && other.getReorderPoint() == null || this.reorderPoint != null && this.reorderPoint.equals(other.getReorderPoint())) && (this.locationAllowStorePickup == null && other.getLocationAllowStorePickup() == null || this.locationAllowStorePickup != null && this.locationAllowStorePickup.equals(other.getLocationAllowStorePickup())) && (this.locationStorePickupBufferStock == null && other.getLocationStorePickupBufferStock() == null || this.locationStorePickupBufferStock != null && this.locationStorePickupBufferStock.equals(other.getLocationStorePickupBufferStock())) && (this.locationQtyAvailForStorePickup == null && other.getLocationQtyAvailForStorePickup() == null || this.locationQtyAvailForStorePickup != null && this.locationQtyAvailForStorePickup.equals(other.getLocationQtyAvailForStorePickup())) && (this.preferredStockLevel == null && other.getPreferredStockLevel() == null || this.preferredStockLevel != null && this.preferredStockLevel.equals(other.getPreferredStockLevel())) && (this.leadTime == null && other.getLeadTime() == null || this.leadTime != null && this.leadTime.equals(other.getLeadTime())) && (this.defaultReturnCost == null && other.getDefaultReturnCost() == null || this.defaultReturnCost != null && this.defaultReturnCost.equals(other.getDefaultReturnCost())) && (this.safetyStockLevel == null && other.getSafetyStockLevel() == null || this.safetyStockLevel != null && this.safetyStockLevel.equals(other.getSafetyStockLevel())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.inventoryCostTemplate == null && other.getInventoryCostTemplate() == null || this.inventoryCostTemplate != null && this.inventoryCostTemplate.equals(other.getInventoryCostTemplate())) && (this.buildTime == null && other.getBuildTime() == null || this.buildTime != null && this.buildTime.equals(other.getBuildTime())) && (this.fixedBuildTime == null && other.getFixedBuildTime() == null || this.fixedBuildTime != null && this.fixedBuildTime.equals(other.getFixedBuildTime())) && (this.buildTimeLotSize == null && other.getBuildTimeLotSize() == null || this.buildTimeLotSize != null && this.buildTimeLotSize.equals(other.getBuildTimeLotSize())) && (this.lastInvtCountDate == null && other.getLastInvtCountDate() == null || this.lastInvtCountDate != null && this.lastInvtCountDate.equals(other.getLastInvtCountDate())) && (this.nextInvtCountDate == null && other.getNextInvtCountDate() == null || this.nextInvtCountDate != null && this.nextInvtCountDate.equals(other.getNextInvtCountDate())) && (this.isWip == null && other.getIsWip() == null || this.isWip != null && this.isWip.equals(other.getIsWip())) && (this.invtCountInterval == null && other.getInvtCountInterval() == null || this.invtCountInterval != null && this.invtCountInterval.equals(other.getInvtCountInterval())) && (this.invtClassification == null && other.getInvtClassification() == null || this.invtClassification != null && this.invtClassification.equals(other.getInvtClassification())) && (this.costingLotSize == null && other.getCostingLotSize() == null || this.costingLotSize != null && this.costingLotSize.equals(other.getCostingLotSize())) && (this.quantityOnOrder == null && other.getQuantityOnOrder() == null || this.quantityOnOrder != null && this.quantityOnOrder.equals(other.getQuantityOnOrder())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && this.quantityCommitted.equals(other.getQuantityCommitted())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.quantityBackOrdered == null && other.getQuantityBackOrdered() == null || this.quantityBackOrdered != null && this.quantityBackOrdered.equals(other.getQuantityBackOrdered())) && (this.locationId == null && other.getLocationId() == null || this.locationId != null && this.locationId.equals(other.getLocationId())) && (this.supplyReplenishmentMethod == null && other.getSupplyReplenishmentMethod() == null || this.supplyReplenishmentMethod != null && this.supplyReplenishmentMethod.equals(other.getSupplyReplenishmentMethod())) && (this.alternateDemandSourceItem == null && other.getAlternateDemandSourceItem() == null || this.alternateDemandSourceItem != null && this.alternateDemandSourceItem.equals(other.getAlternateDemandSourceItem())) && (this.fixedLotSize == null && other.getFixedLotSize() == null || this.fixedLotSize != null && this.fixedLotSize.equals(other.getFixedLotSize())) && (this.periodicLotSizeType == null && other.getPeriodicLotSizeType() == null || this.periodicLotSizeType != null && this.periodicLotSizeType.equals(other.getPeriodicLotSizeType())) && (this.periodicLotSizeDays == null && other.getPeriodicLotSizeDays() == null || this.periodicLotSizeDays != null && this.periodicLotSizeDays.equals(other.getPeriodicLotSizeDays())) && (this.supplyType == null && other.getSupplyType() == null || this.supplyType != null && this.supplyType.equals(other.getSupplyType())) && (this.supplyLotSizingMethod == null && other.getSupplyLotSizingMethod() == null || this.supplyLotSizingMethod != null && this.supplyLotSizingMethod.equals(other.getSupplyLotSizingMethod())) && (this.demandSource == null && other.getDemandSource() == null || this.demandSource != null && this.demandSource.equals(other.getDemandSource())) && (this.backwardConsumptionDays == null && other.getBackwardConsumptionDays() == null || this.backwardConsumptionDays != null && this.backwardConsumptionDays.equals(other.getBackwardConsumptionDays())) && (this.forwardConsumptionDays == null && other.getForwardConsumptionDays() == null || this.forwardConsumptionDays != null && this.forwardConsumptionDays.equals(other.getForwardConsumptionDays())) && (this.demandTimeFence == null && other.getDemandTimeFence() == null || this.demandTimeFence != null && this.demandTimeFence.equals(other.getDemandTimeFence())) && (this.supplyTimeFence == null && other.getSupplyTimeFence() == null || this.supplyTimeFence != null && this.supplyTimeFence.equals(other.getSupplyTimeFence())) && (this.rescheduleInDays == null && other.getRescheduleInDays() == null || this.rescheduleInDays != null && this.rescheduleInDays.equals(other.getRescheduleInDays())) && (this.rescheduleOutDays == null && other.getRescheduleOutDays() == null || this.rescheduleOutDays != null && this.rescheduleOutDays.equals(other.getRescheduleOutDays()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
        }
        if (this.getOnHandValueMli() != null) {
            _hashCode += this.getOnHandValueMli().hashCode();
        }
        if (this.getAverageCostMli() != null) {
            _hashCode += this.getAverageCostMli().hashCode();
        }
        if (this.getLastPurchasePriceMli() != null) {
            _hashCode += this.getLastPurchasePriceMli().hashCode();
        }
        if (this.getReorderPoint() != null) {
            _hashCode += this.getReorderPoint().hashCode();
        }
        if (this.getLocationAllowStorePickup() != null) {
            _hashCode += this.getLocationAllowStorePickup().hashCode();
        }
        if (this.getLocationStorePickupBufferStock() != null) {
            _hashCode += this.getLocationStorePickupBufferStock().hashCode();
        }
        if (this.getLocationQtyAvailForStorePickup() != null) {
            _hashCode += this.getLocationQtyAvailForStorePickup().hashCode();
        }
        if (this.getPreferredStockLevel() != null) {
            _hashCode += this.getPreferredStockLevel().hashCode();
        }
        if (this.getLeadTime() != null) {
            _hashCode += this.getLeadTime().hashCode();
        }
        if (this.getDefaultReturnCost() != null) {
            _hashCode += this.getDefaultReturnCost().hashCode();
        }
        if (this.getSafetyStockLevel() != null) {
            _hashCode += this.getSafetyStockLevel().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getInventoryCostTemplate() != null) {
            _hashCode += this.getInventoryCostTemplate().hashCode();
        }
        if (this.getBuildTime() != null) {
            _hashCode += this.getBuildTime().hashCode();
        }
        if (this.getFixedBuildTime() != null) {
            _hashCode += this.getFixedBuildTime().hashCode();
        }
        if (this.getBuildTimeLotSize() != null) {
            _hashCode += this.getBuildTimeLotSize().hashCode();
        }
        if (this.getLastInvtCountDate() != null) {
            _hashCode += this.getLastInvtCountDate().hashCode();
        }
        if (this.getNextInvtCountDate() != null) {
            _hashCode += this.getNextInvtCountDate().hashCode();
        }
        if (this.getIsWip() != null) {
            _hashCode += this.getIsWip().hashCode();
        }
        if (this.getInvtCountInterval() != null) {
            _hashCode += this.getInvtCountInterval().hashCode();
        }
        if (this.getInvtClassification() != null) {
            _hashCode += this.getInvtClassification().hashCode();
        }
        if (this.getCostingLotSize() != null) {
            _hashCode += this.getCostingLotSize().hashCode();
        }
        if (this.getQuantityOnOrder() != null) {
            _hashCode += this.getQuantityOnOrder().hashCode();
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
        if (this.getLocationId() != null) {
            _hashCode += this.getLocationId().hashCode();
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
        if (this.getPeriodicLotSizeDays() != null) {
            _hashCode += this.getPeriodicLotSizeDays().hashCode();
        }
        if (this.getSupplyType() != null) {
            _hashCode += this.getSupplyType().hashCode();
        }
        if (this.getSupplyLotSizingMethod() != null) {
            _hashCode += this.getSupplyLotSizingMethod().hashCode();
        }
        if (this.getDemandSource() != null) {
            _hashCode += this.getDemandSource().hashCode();
        }
        if (this.getBackwardConsumptionDays() != null) {
            _hashCode += this.getBackwardConsumptionDays().hashCode();
        }
        if (this.getForwardConsumptionDays() != null) {
            _hashCode += this.getForwardConsumptionDays().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "InventoryItemLocations"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "location"));
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
        elemField.setFieldName("onHandValueMli");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "onHandValueMli"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("averageCostMli");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "averageCostMli"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastPurchasePriceMli");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lastPurchasePriceMli"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("locationAllowStorePickup");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locationAllowStorePickup"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationStorePickupBufferStock");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locationStorePickupBufferStock"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationQtyAvailForStorePickup");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locationQtyAvailForStorePickup"));
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
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("inventoryCostTemplate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "buildTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fixedBuildTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fixedBuildTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildTimeLotSize");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "buildTimeLotSize"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("isWip");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isWip"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("costingLotSize");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costingLotSize"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("locationId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locationId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("periodicLotSizeDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "periodicLotSizeDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("supplyLotSizingMethod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "supplyLotSizingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("backwardConsumptionDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "backwardConsumptionDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
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
    }
}

