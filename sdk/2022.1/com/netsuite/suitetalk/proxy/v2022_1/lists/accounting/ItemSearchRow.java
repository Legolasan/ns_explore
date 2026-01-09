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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AssemblyItemBomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BinSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetailSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryNumberBinSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryNumberSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemBinNumberSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemRevisionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.LocationSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MerchandiseHierarchyNodeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PricingSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.RevRecTemplateSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.VendorSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRow;
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

public class ItemSearchRow
extends SearchRow
implements Serializable {
    private ItemSearchRowBasic basic;
    private RevRecTemplateSearchRowBasic accountingBookRevRecScheduleJoin;
    private AssemblyItemBomSearchRowBasic assemblyItemBillOfMaterialsJoin;
    private BinSearchRowBasic binNumberJoin;
    private ItemBinNumberSearchRowBasic binOnHandJoin;
    private ItemSearchRowBasic correlatedItemJoin;
    private ItemRevisionSearchRowBasic effectiveRevisionJoin;
    private FileSearchRowBasic fileJoin;
    private MerchandiseHierarchyNodeSearchRowBasic hierarchyNodeJoin;
    private InventoryDetailSearchRowBasic inventoryDetailJoin;
    private LocationSearchRowBasic inventoryLocationJoin;
    private InventoryNumberSearchRowBasic inventoryNumberJoin;
    private InventoryNumberBinSearchRowBasic inventoryNumberBinOnHandJoin;
    private ItemSearchRowBasic memberItemJoin;
    private ItemRevisionSearchRowBasic obsoleteRevisionJoin;
    private ItemSearchRowBasic parentJoin;
    private LocationSearchRowBasic preferredLocationJoin;
    private VendorSearchRowBasic preferredVendorJoin;
    private PricingSearchRowBasic pricingJoin;
    private CustomerSearchRowBasic shopperJoin;
    private TransactionSearchRowBasic transactionJoin;
    private EmployeeSearchRowBasic userJoin;
    private NoteSearchRowBasic userNotesJoin;
    private VendorSearchRowBasic vendorJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemSearchRow.class, true);

    public ItemSearchRow() {
    }

    public ItemSearchRow(ItemSearchRowBasic basic, RevRecTemplateSearchRowBasic accountingBookRevRecScheduleJoin, AssemblyItemBomSearchRowBasic assemblyItemBillOfMaterialsJoin, BinSearchRowBasic binNumberJoin, ItemBinNumberSearchRowBasic binOnHandJoin, ItemSearchRowBasic correlatedItemJoin, ItemRevisionSearchRowBasic effectiveRevisionJoin, FileSearchRowBasic fileJoin, MerchandiseHierarchyNodeSearchRowBasic hierarchyNodeJoin, InventoryDetailSearchRowBasic inventoryDetailJoin, LocationSearchRowBasic inventoryLocationJoin, InventoryNumberSearchRowBasic inventoryNumberJoin, InventoryNumberBinSearchRowBasic inventoryNumberBinOnHandJoin, ItemSearchRowBasic memberItemJoin, ItemRevisionSearchRowBasic obsoleteRevisionJoin, ItemSearchRowBasic parentJoin, LocationSearchRowBasic preferredLocationJoin, VendorSearchRowBasic preferredVendorJoin, PricingSearchRowBasic pricingJoin, CustomerSearchRowBasic shopperJoin, TransactionSearchRowBasic transactionJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, VendorSearchRowBasic vendorJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.accountingBookRevRecScheduleJoin = accountingBookRevRecScheduleJoin;
        this.assemblyItemBillOfMaterialsJoin = assemblyItemBillOfMaterialsJoin;
        this.binNumberJoin = binNumberJoin;
        this.binOnHandJoin = binOnHandJoin;
        this.correlatedItemJoin = correlatedItemJoin;
        this.effectiveRevisionJoin = effectiveRevisionJoin;
        this.fileJoin = fileJoin;
        this.hierarchyNodeJoin = hierarchyNodeJoin;
        this.inventoryDetailJoin = inventoryDetailJoin;
        this.inventoryLocationJoin = inventoryLocationJoin;
        this.inventoryNumberJoin = inventoryNumberJoin;
        this.inventoryNumberBinOnHandJoin = inventoryNumberBinOnHandJoin;
        this.memberItemJoin = memberItemJoin;
        this.obsoleteRevisionJoin = obsoleteRevisionJoin;
        this.parentJoin = parentJoin;
        this.preferredLocationJoin = preferredLocationJoin;
        this.preferredVendorJoin = preferredVendorJoin;
        this.pricingJoin = pricingJoin;
        this.shopperJoin = shopperJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.vendorJoin = vendorJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public ItemSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ItemSearchRowBasic basic) {
        this.basic = basic;
    }

    public RevRecTemplateSearchRowBasic getAccountingBookRevRecScheduleJoin() {
        return this.accountingBookRevRecScheduleJoin;
    }

    public void setAccountingBookRevRecScheduleJoin(RevRecTemplateSearchRowBasic accountingBookRevRecScheduleJoin) {
        this.accountingBookRevRecScheduleJoin = accountingBookRevRecScheduleJoin;
    }

    public AssemblyItemBomSearchRowBasic getAssemblyItemBillOfMaterialsJoin() {
        return this.assemblyItemBillOfMaterialsJoin;
    }

    public void setAssemblyItemBillOfMaterialsJoin(AssemblyItemBomSearchRowBasic assemblyItemBillOfMaterialsJoin) {
        this.assemblyItemBillOfMaterialsJoin = assemblyItemBillOfMaterialsJoin;
    }

    public BinSearchRowBasic getBinNumberJoin() {
        return this.binNumberJoin;
    }

    public void setBinNumberJoin(BinSearchRowBasic binNumberJoin) {
        this.binNumberJoin = binNumberJoin;
    }

    public ItemBinNumberSearchRowBasic getBinOnHandJoin() {
        return this.binOnHandJoin;
    }

    public void setBinOnHandJoin(ItemBinNumberSearchRowBasic binOnHandJoin) {
        this.binOnHandJoin = binOnHandJoin;
    }

    public ItemSearchRowBasic getCorrelatedItemJoin() {
        return this.correlatedItemJoin;
    }

    public void setCorrelatedItemJoin(ItemSearchRowBasic correlatedItemJoin) {
        this.correlatedItemJoin = correlatedItemJoin;
    }

    public ItemRevisionSearchRowBasic getEffectiveRevisionJoin() {
        return this.effectiveRevisionJoin;
    }

    public void setEffectiveRevisionJoin(ItemRevisionSearchRowBasic effectiveRevisionJoin) {
        this.effectiveRevisionJoin = effectiveRevisionJoin;
    }

    public FileSearchRowBasic getFileJoin() {
        return this.fileJoin;
    }

    public void setFileJoin(FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }

    public MerchandiseHierarchyNodeSearchRowBasic getHierarchyNodeJoin() {
        return this.hierarchyNodeJoin;
    }

    public void setHierarchyNodeJoin(MerchandiseHierarchyNodeSearchRowBasic hierarchyNodeJoin) {
        this.hierarchyNodeJoin = hierarchyNodeJoin;
    }

    public InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return this.inventoryDetailJoin;
    }

    public void setInventoryDetailJoin(InventoryDetailSearchRowBasic inventoryDetailJoin) {
        this.inventoryDetailJoin = inventoryDetailJoin;
    }

    public LocationSearchRowBasic getInventoryLocationJoin() {
        return this.inventoryLocationJoin;
    }

    public void setInventoryLocationJoin(LocationSearchRowBasic inventoryLocationJoin) {
        this.inventoryLocationJoin = inventoryLocationJoin;
    }

    public InventoryNumberSearchRowBasic getInventoryNumberJoin() {
        return this.inventoryNumberJoin;
    }

    public void setInventoryNumberJoin(InventoryNumberSearchRowBasic inventoryNumberJoin) {
        this.inventoryNumberJoin = inventoryNumberJoin;
    }

    public InventoryNumberBinSearchRowBasic getInventoryNumberBinOnHandJoin() {
        return this.inventoryNumberBinOnHandJoin;
    }

    public void setInventoryNumberBinOnHandJoin(InventoryNumberBinSearchRowBasic inventoryNumberBinOnHandJoin) {
        this.inventoryNumberBinOnHandJoin = inventoryNumberBinOnHandJoin;
    }

    public ItemSearchRowBasic getMemberItemJoin() {
        return this.memberItemJoin;
    }

    public void setMemberItemJoin(ItemSearchRowBasic memberItemJoin) {
        this.memberItemJoin = memberItemJoin;
    }

    public ItemRevisionSearchRowBasic getObsoleteRevisionJoin() {
        return this.obsoleteRevisionJoin;
    }

    public void setObsoleteRevisionJoin(ItemRevisionSearchRowBasic obsoleteRevisionJoin) {
        this.obsoleteRevisionJoin = obsoleteRevisionJoin;
    }

    public ItemSearchRowBasic getParentJoin() {
        return this.parentJoin;
    }

    public void setParentJoin(ItemSearchRowBasic parentJoin) {
        this.parentJoin = parentJoin;
    }

    public LocationSearchRowBasic getPreferredLocationJoin() {
        return this.preferredLocationJoin;
    }

    public void setPreferredLocationJoin(LocationSearchRowBasic preferredLocationJoin) {
        this.preferredLocationJoin = preferredLocationJoin;
    }

    public VendorSearchRowBasic getPreferredVendorJoin() {
        return this.preferredVendorJoin;
    }

    public void setPreferredVendorJoin(VendorSearchRowBasic preferredVendorJoin) {
        this.preferredVendorJoin = preferredVendorJoin;
    }

    public PricingSearchRowBasic getPricingJoin() {
        return this.pricingJoin;
    }

    public void setPricingJoin(PricingSearchRowBasic pricingJoin) {
        this.pricingJoin = pricingJoin;
    }

    public CustomerSearchRowBasic getShopperJoin() {
        return this.shopperJoin;
    }

    public void setShopperJoin(CustomerSearchRowBasic shopperJoin) {
        this.shopperJoin = shopperJoin;
    }

    public TransactionSearchRowBasic getTransactionJoin() {
        return this.transactionJoin;
    }

    public void setTransactionJoin(TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }

    public EmployeeSearchRowBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }

    public NoteSearchRowBasic getUserNotesJoin() {
        return this.userNotesJoin;
    }

    public void setUserNotesJoin(NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    public VendorSearchRowBasic getVendorJoin() {
        return this.vendorJoin;
    }

    public void setVendorJoin(VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    public CustomSearchRowBasic[] getCustomSearchJoin() {
        return this.customSearchJoin;
    }

    public void setCustomSearchJoin(CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemSearchRow)) {
            return false;
        }
        ItemSearchRow other = (ItemSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.accountingBookRevRecScheduleJoin == null && other.getAccountingBookRevRecScheduleJoin() == null || this.accountingBookRevRecScheduleJoin != null && this.accountingBookRevRecScheduleJoin.equals(other.getAccountingBookRevRecScheduleJoin())) && (this.assemblyItemBillOfMaterialsJoin == null && other.getAssemblyItemBillOfMaterialsJoin() == null || this.assemblyItemBillOfMaterialsJoin != null && this.assemblyItemBillOfMaterialsJoin.equals(other.getAssemblyItemBillOfMaterialsJoin())) && (this.binNumberJoin == null && other.getBinNumberJoin() == null || this.binNumberJoin != null && this.binNumberJoin.equals(other.getBinNumberJoin())) && (this.binOnHandJoin == null && other.getBinOnHandJoin() == null || this.binOnHandJoin != null && this.binOnHandJoin.equals(other.getBinOnHandJoin())) && (this.correlatedItemJoin == null && other.getCorrelatedItemJoin() == null || this.correlatedItemJoin != null && this.correlatedItemJoin.equals(other.getCorrelatedItemJoin())) && (this.effectiveRevisionJoin == null && other.getEffectiveRevisionJoin() == null || this.effectiveRevisionJoin != null && this.effectiveRevisionJoin.equals(other.getEffectiveRevisionJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.hierarchyNodeJoin == null && other.getHierarchyNodeJoin() == null || this.hierarchyNodeJoin != null && this.hierarchyNodeJoin.equals(other.getHierarchyNodeJoin())) && (this.inventoryDetailJoin == null && other.getInventoryDetailJoin() == null || this.inventoryDetailJoin != null && this.inventoryDetailJoin.equals(other.getInventoryDetailJoin())) && (this.inventoryLocationJoin == null && other.getInventoryLocationJoin() == null || this.inventoryLocationJoin != null && this.inventoryLocationJoin.equals(other.getInventoryLocationJoin())) && (this.inventoryNumberJoin == null && other.getInventoryNumberJoin() == null || this.inventoryNumberJoin != null && this.inventoryNumberJoin.equals(other.getInventoryNumberJoin())) && (this.inventoryNumberBinOnHandJoin == null && other.getInventoryNumberBinOnHandJoin() == null || this.inventoryNumberBinOnHandJoin != null && this.inventoryNumberBinOnHandJoin.equals(other.getInventoryNumberBinOnHandJoin())) && (this.memberItemJoin == null && other.getMemberItemJoin() == null || this.memberItemJoin != null && this.memberItemJoin.equals(other.getMemberItemJoin())) && (this.obsoleteRevisionJoin == null && other.getObsoleteRevisionJoin() == null || this.obsoleteRevisionJoin != null && this.obsoleteRevisionJoin.equals(other.getObsoleteRevisionJoin())) && (this.parentJoin == null && other.getParentJoin() == null || this.parentJoin != null && this.parentJoin.equals(other.getParentJoin())) && (this.preferredLocationJoin == null && other.getPreferredLocationJoin() == null || this.preferredLocationJoin != null && this.preferredLocationJoin.equals(other.getPreferredLocationJoin())) && (this.preferredVendorJoin == null && other.getPreferredVendorJoin() == null || this.preferredVendorJoin != null && this.preferredVendorJoin.equals(other.getPreferredVendorJoin())) && (this.pricingJoin == null && other.getPricingJoin() == null || this.pricingJoin != null && this.pricingJoin.equals(other.getPricingJoin())) && (this.shopperJoin == null && other.getShopperJoin() == null || this.shopperJoin != null && this.shopperJoin.equals(other.getShopperJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.vendorJoin == null && other.getVendorJoin() == null || this.vendorJoin != null && this.vendorJoin.equals(other.getVendorJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getBasic() != null) {
            _hashCode += this.getBasic().hashCode();
        }
        if (this.getAccountingBookRevRecScheduleJoin() != null) {
            _hashCode += this.getAccountingBookRevRecScheduleJoin().hashCode();
        }
        if (this.getAssemblyItemBillOfMaterialsJoin() != null) {
            _hashCode += this.getAssemblyItemBillOfMaterialsJoin().hashCode();
        }
        if (this.getBinNumberJoin() != null) {
            _hashCode += this.getBinNumberJoin().hashCode();
        }
        if (this.getBinOnHandJoin() != null) {
            _hashCode += this.getBinOnHandJoin().hashCode();
        }
        if (this.getCorrelatedItemJoin() != null) {
            _hashCode += this.getCorrelatedItemJoin().hashCode();
        }
        if (this.getEffectiveRevisionJoin() != null) {
            _hashCode += this.getEffectiveRevisionJoin().hashCode();
        }
        if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
        }
        if (this.getHierarchyNodeJoin() != null) {
            _hashCode += this.getHierarchyNodeJoin().hashCode();
        }
        if (this.getInventoryDetailJoin() != null) {
            _hashCode += this.getInventoryDetailJoin().hashCode();
        }
        if (this.getInventoryLocationJoin() != null) {
            _hashCode += this.getInventoryLocationJoin().hashCode();
        }
        if (this.getInventoryNumberJoin() != null) {
            _hashCode += this.getInventoryNumberJoin().hashCode();
        }
        if (this.getInventoryNumberBinOnHandJoin() != null) {
            _hashCode += this.getInventoryNumberBinOnHandJoin().hashCode();
        }
        if (this.getMemberItemJoin() != null) {
            _hashCode += this.getMemberItemJoin().hashCode();
        }
        if (this.getObsoleteRevisionJoin() != null) {
            _hashCode += this.getObsoleteRevisionJoin().hashCode();
        }
        if (this.getParentJoin() != null) {
            _hashCode += this.getParentJoin().hashCode();
        }
        if (this.getPreferredLocationJoin() != null) {
            _hashCode += this.getPreferredLocationJoin().hashCode();
        }
        if (this.getPreferredVendorJoin() != null) {
            _hashCode += this.getPreferredVendorJoin().hashCode();
        }
        if (this.getPricingJoin() != null) {
            _hashCode += this.getPricingJoin().hashCode();
        }
        if (this.getShopperJoin() != null) {
            _hashCode += this.getShopperJoin().hashCode();
        }
        if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
        }
        if (this.getUserNotesJoin() != null) {
            _hashCode += this.getUserNotesJoin().hashCode();
        }
        if (this.getVendorJoin() != null) {
            _hashCode += this.getVendorJoin().hashCode();
        }
        if (this.getCustomSearchJoin() != null) {
            for (int i = 0; i < Array.getLength(this.getCustomSearchJoin()); ++i) {
                Object obj = Array.get(this.getCustomSearchJoin(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookRevRecScheduleJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "accountingBookRevRecScheduleJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RevRecTemplateSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assemblyItemBillOfMaterialsJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "assemblyItemBillOfMaterialsJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumberJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "binNumberJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binOnHandJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "binOnHandJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemBinNumberSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "correlatedItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveRevisionJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "effectiveRevisionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyNodeJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hierarchyNodeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetailJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryDetailJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetailSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryLocationJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryLocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryNumberJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryNumberJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryNumberSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryNumberBinOnHandJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryNumberBinOnHandJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryNumberBinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memberItemJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memberItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("obsoleteRevisionJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "obsoleteRevisionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredLocationJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredLocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredVendorJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredVendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "pricingJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PricingSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shopperJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shopperJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

