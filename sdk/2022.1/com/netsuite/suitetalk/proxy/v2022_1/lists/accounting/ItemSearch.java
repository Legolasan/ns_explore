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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AssemblyItemBomSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BinSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetailSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryNumberBinSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryNumberSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemBinNumberSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemRevisionSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.LocationSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MerchandiseHierarchyNodeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PricingSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.RevRecTemplateSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.VendorSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecord;
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

public class ItemSearch
extends SearchRecord
implements Serializable {
    private ItemSearchBasic basic;
    private RevRecTemplateSearchBasic accountingBookRevRecScheduleJoin;
    private AssemblyItemBomSearchBasic assemblyItemBillOfMaterialsJoin;
    private BinSearchBasic binNumberJoin;
    private ItemBinNumberSearchBasic binOnHandJoin;
    private ItemSearchBasic correlatedItemJoin;
    private ItemRevisionSearchBasic effectiveRevisionJoin;
    private FileSearchBasic fileJoin;
    private MerchandiseHierarchyNodeSearchBasic hierarchyNodeJoin;
    private InventoryDetailSearchBasic inventoryDetailJoin;
    private LocationSearchBasic inventoryLocationJoin;
    private InventoryNumberSearchBasic inventoryNumberJoin;
    private InventoryNumberBinSearchBasic inventoryNumberBinOnHandJoin;
    private ItemSearchBasic memberItemJoin;
    private ItemRevisionSearchBasic obsoleteRevisionJoin;
    private ItemSearchBasic parentJoin;
    private LocationSearchBasic preferredLocationJoin;
    private VendorSearchBasic preferredVendorJoin;
    private PricingSearchBasic pricingJoin;
    private CustomerSearchBasic shopperJoin;
    private TransactionSearchBasic transactionJoin;
    private EmployeeSearchBasic userJoin;
    private NoteSearchBasic userNotesJoin;
    private VendorSearchBasic vendorJoin;
    private CustomSearchJoin[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemSearch.class, true);

    public ItemSearch() {
    }

    public ItemSearch(ItemSearchBasic basic, RevRecTemplateSearchBasic accountingBookRevRecScheduleJoin, AssemblyItemBomSearchBasic assemblyItemBillOfMaterialsJoin, BinSearchBasic binNumberJoin, ItemBinNumberSearchBasic binOnHandJoin, ItemSearchBasic correlatedItemJoin, ItemRevisionSearchBasic effectiveRevisionJoin, FileSearchBasic fileJoin, MerchandiseHierarchyNodeSearchBasic hierarchyNodeJoin, InventoryDetailSearchBasic inventoryDetailJoin, LocationSearchBasic inventoryLocationJoin, InventoryNumberSearchBasic inventoryNumberJoin, InventoryNumberBinSearchBasic inventoryNumberBinOnHandJoin, ItemSearchBasic memberItemJoin, ItemRevisionSearchBasic obsoleteRevisionJoin, ItemSearchBasic parentJoin, LocationSearchBasic preferredLocationJoin, VendorSearchBasic preferredVendorJoin, PricingSearchBasic pricingJoin, CustomerSearchBasic shopperJoin, TransactionSearchBasic transactionJoin, EmployeeSearchBasic userJoin, NoteSearchBasic userNotesJoin, VendorSearchBasic vendorJoin, CustomSearchJoin[] customSearchJoin) {
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

    public ItemSearchBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ItemSearchBasic basic) {
        this.basic = basic;
    }

    public RevRecTemplateSearchBasic getAccountingBookRevRecScheduleJoin() {
        return this.accountingBookRevRecScheduleJoin;
    }

    public void setAccountingBookRevRecScheduleJoin(RevRecTemplateSearchBasic accountingBookRevRecScheduleJoin) {
        this.accountingBookRevRecScheduleJoin = accountingBookRevRecScheduleJoin;
    }

    public AssemblyItemBomSearchBasic getAssemblyItemBillOfMaterialsJoin() {
        return this.assemblyItemBillOfMaterialsJoin;
    }

    public void setAssemblyItemBillOfMaterialsJoin(AssemblyItemBomSearchBasic assemblyItemBillOfMaterialsJoin) {
        this.assemblyItemBillOfMaterialsJoin = assemblyItemBillOfMaterialsJoin;
    }

    public BinSearchBasic getBinNumberJoin() {
        return this.binNumberJoin;
    }

    public void setBinNumberJoin(BinSearchBasic binNumberJoin) {
        this.binNumberJoin = binNumberJoin;
    }

    public ItemBinNumberSearchBasic getBinOnHandJoin() {
        return this.binOnHandJoin;
    }

    public void setBinOnHandJoin(ItemBinNumberSearchBasic binOnHandJoin) {
        this.binOnHandJoin = binOnHandJoin;
    }

    public ItemSearchBasic getCorrelatedItemJoin() {
        return this.correlatedItemJoin;
    }

    public void setCorrelatedItemJoin(ItemSearchBasic correlatedItemJoin) {
        this.correlatedItemJoin = correlatedItemJoin;
    }

    public ItemRevisionSearchBasic getEffectiveRevisionJoin() {
        return this.effectiveRevisionJoin;
    }

    public void setEffectiveRevisionJoin(ItemRevisionSearchBasic effectiveRevisionJoin) {
        this.effectiveRevisionJoin = effectiveRevisionJoin;
    }

    public FileSearchBasic getFileJoin() {
        return this.fileJoin;
    }

    public void setFileJoin(FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }

    public MerchandiseHierarchyNodeSearchBasic getHierarchyNodeJoin() {
        return this.hierarchyNodeJoin;
    }

    public void setHierarchyNodeJoin(MerchandiseHierarchyNodeSearchBasic hierarchyNodeJoin) {
        this.hierarchyNodeJoin = hierarchyNodeJoin;
    }

    public InventoryDetailSearchBasic getInventoryDetailJoin() {
        return this.inventoryDetailJoin;
    }

    public void setInventoryDetailJoin(InventoryDetailSearchBasic inventoryDetailJoin) {
        this.inventoryDetailJoin = inventoryDetailJoin;
    }

    public LocationSearchBasic getInventoryLocationJoin() {
        return this.inventoryLocationJoin;
    }

    public void setInventoryLocationJoin(LocationSearchBasic inventoryLocationJoin) {
        this.inventoryLocationJoin = inventoryLocationJoin;
    }

    public InventoryNumberSearchBasic getInventoryNumberJoin() {
        return this.inventoryNumberJoin;
    }

    public void setInventoryNumberJoin(InventoryNumberSearchBasic inventoryNumberJoin) {
        this.inventoryNumberJoin = inventoryNumberJoin;
    }

    public InventoryNumberBinSearchBasic getInventoryNumberBinOnHandJoin() {
        return this.inventoryNumberBinOnHandJoin;
    }

    public void setInventoryNumberBinOnHandJoin(InventoryNumberBinSearchBasic inventoryNumberBinOnHandJoin) {
        this.inventoryNumberBinOnHandJoin = inventoryNumberBinOnHandJoin;
    }

    public ItemSearchBasic getMemberItemJoin() {
        return this.memberItemJoin;
    }

    public void setMemberItemJoin(ItemSearchBasic memberItemJoin) {
        this.memberItemJoin = memberItemJoin;
    }

    public ItemRevisionSearchBasic getObsoleteRevisionJoin() {
        return this.obsoleteRevisionJoin;
    }

    public void setObsoleteRevisionJoin(ItemRevisionSearchBasic obsoleteRevisionJoin) {
        this.obsoleteRevisionJoin = obsoleteRevisionJoin;
    }

    public ItemSearchBasic getParentJoin() {
        return this.parentJoin;
    }

    public void setParentJoin(ItemSearchBasic parentJoin) {
        this.parentJoin = parentJoin;
    }

    public LocationSearchBasic getPreferredLocationJoin() {
        return this.preferredLocationJoin;
    }

    public void setPreferredLocationJoin(LocationSearchBasic preferredLocationJoin) {
        this.preferredLocationJoin = preferredLocationJoin;
    }

    public VendorSearchBasic getPreferredVendorJoin() {
        return this.preferredVendorJoin;
    }

    public void setPreferredVendorJoin(VendorSearchBasic preferredVendorJoin) {
        this.preferredVendorJoin = preferredVendorJoin;
    }

    public PricingSearchBasic getPricingJoin() {
        return this.pricingJoin;
    }

    public void setPricingJoin(PricingSearchBasic pricingJoin) {
        this.pricingJoin = pricingJoin;
    }

    public CustomerSearchBasic getShopperJoin() {
        return this.shopperJoin;
    }

    public void setShopperJoin(CustomerSearchBasic shopperJoin) {
        this.shopperJoin = shopperJoin;
    }

    public TransactionSearchBasic getTransactionJoin() {
        return this.transactionJoin;
    }

    public void setTransactionJoin(TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }

    public EmployeeSearchBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    public NoteSearchBasic getUserNotesJoin() {
        return this.userNotesJoin;
    }

    public void setUserNotesJoin(NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    public VendorSearchBasic getVendorJoin() {
        return this.vendorJoin;
    }

    public void setVendorJoin(VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    public CustomSearchJoin[] getCustomSearchJoin() {
        return this.customSearchJoin;
    }

    public void setCustomSearchJoin(CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemSearch)) {
            return false;
        }
        ItemSearch other = (ItemSearch)obj;
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemSearch"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookRevRecScheduleJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "accountingBookRevRecScheduleJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RevRecTemplateSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assemblyItemBillOfMaterialsJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "assemblyItemBillOfMaterialsJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumberJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "binNumberJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BinSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binOnHandJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "binOnHandJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemBinNumberSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("correlatedItemJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "correlatedItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveRevisionJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "effectiveRevisionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemRevisionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyNodeJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hierarchyNodeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetailJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryDetailJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetailSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryLocationJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryLocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryNumberJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryNumberJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryNumberSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryNumberBinOnHandJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inventoryNumberBinOnHandJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryNumberBinSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memberItemJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memberItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("obsoleteRevisionJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "obsoleteRevisionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemRevisionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredLocationJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredLocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredVendorJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredVendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "pricingJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PricingSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shopperJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shopperJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

