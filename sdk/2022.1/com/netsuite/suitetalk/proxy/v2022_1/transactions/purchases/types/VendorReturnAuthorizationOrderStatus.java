/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.EnumDeserializer
 *  org.apache.axis.encoding.ser.EnumSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class VendorReturnAuthorizationOrderStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __cancelled = "_cancelled";
    public static final String __closed = "_closed";
    public static final String __credited = "_credited";
    public static final String __partiallyReturned = "_partiallyReturned";
    public static final String __pendingApproval = "_pendingApproval";
    public static final String __pendingCredit = "_pendingCredit";
    public static final String __pendingCreditPartiallyReturned = "_pendingCreditPartiallyReturned";
    public static final String __pendingReturn = "_pendingReturn";
    public static final String __undefined = "_undefined";
    public static final VendorReturnAuthorizationOrderStatus _cancelled = new VendorReturnAuthorizationOrderStatus("_cancelled");
    public static final VendorReturnAuthorizationOrderStatus _closed = new VendorReturnAuthorizationOrderStatus("_closed");
    public static final VendorReturnAuthorizationOrderStatus _credited = new VendorReturnAuthorizationOrderStatus("_credited");
    public static final VendorReturnAuthorizationOrderStatus _partiallyReturned = new VendorReturnAuthorizationOrderStatus("_partiallyReturned");
    public static final VendorReturnAuthorizationOrderStatus _pendingApproval = new VendorReturnAuthorizationOrderStatus("_pendingApproval");
    public static final VendorReturnAuthorizationOrderStatus _pendingCredit = new VendorReturnAuthorizationOrderStatus("_pendingCredit");
    public static final VendorReturnAuthorizationOrderStatus _pendingCreditPartiallyReturned = new VendorReturnAuthorizationOrderStatus("_pendingCreditPartiallyReturned");
    public static final VendorReturnAuthorizationOrderStatus _pendingReturn = new VendorReturnAuthorizationOrderStatus("_pendingReturn");
    public static final VendorReturnAuthorizationOrderStatus _undefined = new VendorReturnAuthorizationOrderStatus("_undefined");
    private static TypeDesc typeDesc = new TypeDesc(VendorReturnAuthorizationOrderStatus.class);

    protected VendorReturnAuthorizationOrderStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static VendorReturnAuthorizationOrderStatus fromValue(String value) throws IllegalArgumentException {
        VendorReturnAuthorizationOrderStatus enumeration = (VendorReturnAuthorizationOrderStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static VendorReturnAuthorizationOrderStatus fromString(String value) throws IllegalArgumentException {
        return VendorReturnAuthorizationOrderStatus.fromValue(value);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this._value_;
    }

    public Object readResolve() throws ObjectStreamException {
        return VendorReturnAuthorizationOrderStatus.fromValue(this._value_);
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumSerializer(_javaType, _xmlType);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumDeserializer(_javaType, _xmlType);
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    static {
        typeDesc.setXmlType(new QName("urn:types.purchases_2022_1.transactions.webservices.netsuite.com", "VendorReturnAuthorizationOrderStatus"));
    }
}

