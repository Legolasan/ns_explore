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
package com.netsuite.suitetalk.proxy.v2022_1.platform.faults.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class FaultCodeType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _ACCT_TEMP_UNAVAILABLE = "ACCT_TEMP_UNAVAILABLE";
    public static final String _EMAIL_ADDRS_REQD = "EMAIL_ADDRS_REQD";
    public static final String _INSUFFICIENT_PERMISSION = "INSUFFICIENT_PERMISSION";
    public static final String _INVALID_ACCT = "INVALID_ACCT";
    public static final String _INVALID_JOB_ID = "INVALID_JOB_ID";
    public static final String _INVALID_LOGIN_CREDENTIALS = "INVALID_LOGIN_CREDENTIALS";
    public static final String _INVALID_PAGE_INDEX = "INVALID_PAGE_INDEX";
    public static final String _INVALID_ROLE = "INVALID_ROLE";
    public static final String _INVALID_WS_VERSION = "INVALID_WS_VERSION";
    public static final String _JOB_NOT_COMPLETE = "JOB_NOT_COMPLETE";
    public static final String _LOGIN_DISABLED = "LOGIN_DISABLED";
    public static final String _MAX_RCRDS_EXCEEDED = "MAX_RCRDS_EXCEEDED";
    public static final String _OI_FEATURE_REQD = "OI_FEATURE_REQD";
    public static final String _OI_PERMISSION_REQD = "OI_PERMISSION_REQD";
    public static final String _PSWD_REQD = "PSWD_REQD";
    public static final String _ROLE_REQUIRED = "ROLE_REQUIRED";
    public static final String _SESSION_TIMED_OUT = "SESSION_TIMED_OUT";
    public static final String _UNEXPECTED_ERROR = "UNEXPECTED_ERROR";
    public static final String _UNSUPPORTED_WS_VERSION = "UNSUPPORTED_WS_VERSION";
    public static final String _USER_ERROR = "USER_ERROR";
    public static final String _WS_CONCUR_SESSION_DISALLWD = "WS_CONCUR_SESSION_DISALLWD";
    public static final String _WS_FEATURE_REQD = "WS_FEATURE_REQD";
    public static final String _WS_PERMISSION_REQD = "WS_PERMISSION_REQD";
    public static final String _WS_LOG_IN_REQD = "WS_LOG_IN_REQD";
    public static final String _WS_REQUEST_BLOCKED = "WS_REQUEST_BLOCKED";
    public static final FaultCodeType ACCT_TEMP_UNAVAILABLE = new FaultCodeType("ACCT_TEMP_UNAVAILABLE");
    public static final FaultCodeType EMAIL_ADDRS_REQD = new FaultCodeType("EMAIL_ADDRS_REQD");
    public static final FaultCodeType INSUFFICIENT_PERMISSION = new FaultCodeType("INSUFFICIENT_PERMISSION");
    public static final FaultCodeType INVALID_ACCT = new FaultCodeType("INVALID_ACCT");
    public static final FaultCodeType INVALID_JOB_ID = new FaultCodeType("INVALID_JOB_ID");
    public static final FaultCodeType INVALID_LOGIN_CREDENTIALS = new FaultCodeType("INVALID_LOGIN_CREDENTIALS");
    public static final FaultCodeType INVALID_PAGE_INDEX = new FaultCodeType("INVALID_PAGE_INDEX");
    public static final FaultCodeType INVALID_ROLE = new FaultCodeType("INVALID_ROLE");
    public static final FaultCodeType INVALID_WS_VERSION = new FaultCodeType("INVALID_WS_VERSION");
    public static final FaultCodeType JOB_NOT_COMPLETE = new FaultCodeType("JOB_NOT_COMPLETE");
    public static final FaultCodeType LOGIN_DISABLED = new FaultCodeType("LOGIN_DISABLED");
    public static final FaultCodeType MAX_RCRDS_EXCEEDED = new FaultCodeType("MAX_RCRDS_EXCEEDED");
    public static final FaultCodeType OI_FEATURE_REQD = new FaultCodeType("OI_FEATURE_REQD");
    public static final FaultCodeType OI_PERMISSION_REQD = new FaultCodeType("OI_PERMISSION_REQD");
    public static final FaultCodeType PSWD_REQD = new FaultCodeType("PSWD_REQD");
    public static final FaultCodeType ROLE_REQUIRED = new FaultCodeType("ROLE_REQUIRED");
    public static final FaultCodeType SESSION_TIMED_OUT = new FaultCodeType("SESSION_TIMED_OUT");
    public static final FaultCodeType UNEXPECTED_ERROR = new FaultCodeType("UNEXPECTED_ERROR");
    public static final FaultCodeType UNSUPPORTED_WS_VERSION = new FaultCodeType("UNSUPPORTED_WS_VERSION");
    public static final FaultCodeType USER_ERROR = new FaultCodeType("USER_ERROR");
    public static final FaultCodeType WS_CONCUR_SESSION_DISALLWD = new FaultCodeType("WS_CONCUR_SESSION_DISALLWD");
    public static final FaultCodeType WS_FEATURE_REQD = new FaultCodeType("WS_FEATURE_REQD");
    public static final FaultCodeType WS_PERMISSION_REQD = new FaultCodeType("WS_PERMISSION_REQD");
    public static final FaultCodeType WS_LOG_IN_REQD = new FaultCodeType("WS_LOG_IN_REQD");
    public static final FaultCodeType WS_REQUEST_BLOCKED = new FaultCodeType("WS_REQUEST_BLOCKED");
    private static TypeDesc typeDesc = new TypeDesc(FaultCodeType.class);

    protected FaultCodeType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static FaultCodeType fromValue(String value) throws IllegalArgumentException {
        FaultCodeType enumeration = (FaultCodeType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static FaultCodeType fromString(String value) throws IllegalArgumentException {
        return FaultCodeType.fromValue(value);
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
        return FaultCodeType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.faults_2022_1.platform.webservices.netsuite.com", "FaultCodeType"));
    }
}

