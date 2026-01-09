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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CustomizationFieldType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __checkBox = "_checkBox";
    public static final String __currency = "_currency";
    public static final String __date = "_date";
    public static final String __datetime = "_datetime";
    public static final String __decimalNumber = "_decimalNumber";
    public static final String __document = "_document";
    public static final String __eMailAddress = "_eMailAddress";
    public static final String __freeFormText = "_freeFormText";
    public static final String __help = "_help";
    public static final String __hyperlink = "_hyperlink";
    public static final String __image = "_image";
    public static final String __inlineHTML = "_inlineHTML";
    public static final String __integerNumber = "_integerNumber";
    public static final String __listRecord = "_listRecord";
    public static final String __longText = "_longText";
    public static final String __multipleSelect = "_multipleSelect";
    public static final String __password = "_password";
    public static final String __percent = "_percent";
    public static final String __phoneNumber = "_phoneNumber";
    public static final String __richText = "_richText";
    public static final String __textArea = "_textArea";
    public static final String __timeOfDay = "_timeOfDay";
    public static final CustomizationFieldType _checkBox = new CustomizationFieldType("_checkBox");
    public static final CustomizationFieldType _currency = new CustomizationFieldType("_currency");
    public static final CustomizationFieldType _date = new CustomizationFieldType("_date");
    public static final CustomizationFieldType _datetime = new CustomizationFieldType("_datetime");
    public static final CustomizationFieldType _decimalNumber = new CustomizationFieldType("_decimalNumber");
    public static final CustomizationFieldType _document = new CustomizationFieldType("_document");
    public static final CustomizationFieldType _eMailAddress = new CustomizationFieldType("_eMailAddress");
    public static final CustomizationFieldType _freeFormText = new CustomizationFieldType("_freeFormText");
    public static final CustomizationFieldType _help = new CustomizationFieldType("_help");
    public static final CustomizationFieldType _hyperlink = new CustomizationFieldType("_hyperlink");
    public static final CustomizationFieldType _image = new CustomizationFieldType("_image");
    public static final CustomizationFieldType _inlineHTML = new CustomizationFieldType("_inlineHTML");
    public static final CustomizationFieldType _integerNumber = new CustomizationFieldType("_integerNumber");
    public static final CustomizationFieldType _listRecord = new CustomizationFieldType("_listRecord");
    public static final CustomizationFieldType _longText = new CustomizationFieldType("_longText");
    public static final CustomizationFieldType _multipleSelect = new CustomizationFieldType("_multipleSelect");
    public static final CustomizationFieldType _password = new CustomizationFieldType("_password");
    public static final CustomizationFieldType _percent = new CustomizationFieldType("_percent");
    public static final CustomizationFieldType _phoneNumber = new CustomizationFieldType("_phoneNumber");
    public static final CustomizationFieldType _richText = new CustomizationFieldType("_richText");
    public static final CustomizationFieldType _textArea = new CustomizationFieldType("_textArea");
    public static final CustomizationFieldType _timeOfDay = new CustomizationFieldType("_timeOfDay");
    private static TypeDesc typeDesc = new TypeDesc(CustomizationFieldType.class);

    protected CustomizationFieldType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomizationFieldType fromValue(String value) throws IllegalArgumentException {
        CustomizationFieldType enumeration = (CustomizationFieldType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomizationFieldType fromString(String value) throws IllegalArgumentException {
        return CustomizationFieldType.fromValue(value);
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
        return CustomizationFieldType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationFieldType"));
    }
}

