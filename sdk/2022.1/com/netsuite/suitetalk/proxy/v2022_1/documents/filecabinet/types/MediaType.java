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
package com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class MediaType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __APPCACHE = "_APPCACHE";
    public static final String __AUTOCAD = "_AUTOCAD";
    public static final String __BMPIMAGE = "_BMPIMAGE";
    public static final String __CERTIFICATE = "_CERTIFICATE";
    public static final String __CFF = "_CFF";
    public static final String __CONFIG = "_CONFIG";
    public static final String __CSV = "_CSV";
    public static final String __EOT = "_EOT";
    public static final String __EXCEL = "_EXCEL";
    public static final String __FLASH = "_FLASH";
    public static final String __FREEMARKER = "_FREEMARKER";
    public static final String __GIFIMAGE = "_GIFIMAGE";
    public static final String __GZIP = "_GZIP";
    public static final String __HTMLDOC = "_HTMLDOC";
    public static final String __ICON = "_ICON";
    public static final String __IMAGE = "_IMAGE";
    public static final String __JAVASCRIPT = "_JAVASCRIPT";
    public static final String __JPGIMAGE = "_JPGIMAGE";
    public static final String __JSON = "_JSON";
    public static final String __LZH = "_LZH";
    public static final String __MESSAGERFC = "_MESSAGERFC";
    public static final String __MISCBINARY = "_MISCBINARY";
    public static final String __MISCTEXT = "_MISCTEXT";
    public static final String __MP3 = "_MP3";
    public static final String __MPEGMOVIE = "_MPEGMOVIE";
    public static final String __MSPROJECT = "_MSPROJECT";
    public static final String __OTF = "_OTF";
    public static final String __PDF = "_PDF";
    public static final String __PJPGIMAGE = "_PJPGIMAGE";
    public static final String __PLAINTEXT = "_PLAINTEXT";
    public static final String __PNGIMAGE = "_PNGIMAGE";
    public static final String __POSTSCRIPT = "_POSTSCRIPT";
    public static final String __POWERPOINT = "_POWERPOINT";
    public static final String __QUICKTIME = "_QUICKTIME";
    public static final String __RTF = "_RTF";
    public static final String __SCSS = "_SCSS";
    public static final String __SMS = "_SMS";
    public static final String __STYLESHEET = "_STYLESHEET";
    public static final String __SVG = "_SVG";
    public static final String __TAR = "_TAR";
    public static final String __TARCOMP = "_TARCOMP";
    public static final String __TIFFIMAGE = "_TIFFIMAGE";
    public static final String __TTF = "_TTF";
    public static final String __VISIO = "_VISIO";
    public static final String __WEBAPPPAGE = "_WEBAPPPAGE";
    public static final String __WEBAPPSCRIPT = "_WEBAPPSCRIPT";
    public static final String __WOFF = "_WOFF";
    public static final String __WOFF2 = "_WOFF2";
    public static final String __WORD = "_WORD";
    public static final String __XMLDOC = "_XMLDOC";
    public static final String __XSD = "_XSD";
    public static final String __ZIP = "_ZIP";
    public static final MediaType _APPCACHE = new MediaType("_APPCACHE");
    public static final MediaType _AUTOCAD = new MediaType("_AUTOCAD");
    public static final MediaType _BMPIMAGE = new MediaType("_BMPIMAGE");
    public static final MediaType _CERTIFICATE = new MediaType("_CERTIFICATE");
    public static final MediaType _CFF = new MediaType("_CFF");
    public static final MediaType _CONFIG = new MediaType("_CONFIG");
    public static final MediaType _CSV = new MediaType("_CSV");
    public static final MediaType _EOT = new MediaType("_EOT");
    public static final MediaType _EXCEL = new MediaType("_EXCEL");
    public static final MediaType _FLASH = new MediaType("_FLASH");
    public static final MediaType _FREEMARKER = new MediaType("_FREEMARKER");
    public static final MediaType _GIFIMAGE = new MediaType("_GIFIMAGE");
    public static final MediaType _GZIP = new MediaType("_GZIP");
    public static final MediaType _HTMLDOC = new MediaType("_HTMLDOC");
    public static final MediaType _ICON = new MediaType("_ICON");
    public static final MediaType _IMAGE = new MediaType("_IMAGE");
    public static final MediaType _JAVASCRIPT = new MediaType("_JAVASCRIPT");
    public static final MediaType _JPGIMAGE = new MediaType("_JPGIMAGE");
    public static final MediaType _JSON = new MediaType("_JSON");
    public static final MediaType _LZH = new MediaType("_LZH");
    public static final MediaType _MESSAGERFC = new MediaType("_MESSAGERFC");
    public static final MediaType _MISCBINARY = new MediaType("_MISCBINARY");
    public static final MediaType _MISCTEXT = new MediaType("_MISCTEXT");
    public static final MediaType _MP3 = new MediaType("_MP3");
    public static final MediaType _MPEGMOVIE = new MediaType("_MPEGMOVIE");
    public static final MediaType _MSPROJECT = new MediaType("_MSPROJECT");
    public static final MediaType _OTF = new MediaType("_OTF");
    public static final MediaType _PDF = new MediaType("_PDF");
    public static final MediaType _PJPGIMAGE = new MediaType("_PJPGIMAGE");
    public static final MediaType _PLAINTEXT = new MediaType("_PLAINTEXT");
    public static final MediaType _PNGIMAGE = new MediaType("_PNGIMAGE");
    public static final MediaType _POSTSCRIPT = new MediaType("_POSTSCRIPT");
    public static final MediaType _POWERPOINT = new MediaType("_POWERPOINT");
    public static final MediaType _QUICKTIME = new MediaType("_QUICKTIME");
    public static final MediaType _RTF = new MediaType("_RTF");
    public static final MediaType _SCSS = new MediaType("_SCSS");
    public static final MediaType _SMS = new MediaType("_SMS");
    public static final MediaType _STYLESHEET = new MediaType("_STYLESHEET");
    public static final MediaType _SVG = new MediaType("_SVG");
    public static final MediaType _TAR = new MediaType("_TAR");
    public static final MediaType _TARCOMP = new MediaType("_TARCOMP");
    public static final MediaType _TIFFIMAGE = new MediaType("_TIFFIMAGE");
    public static final MediaType _TTF = new MediaType("_TTF");
    public static final MediaType _VISIO = new MediaType("_VISIO");
    public static final MediaType _WEBAPPPAGE = new MediaType("_WEBAPPPAGE");
    public static final MediaType _WEBAPPSCRIPT = new MediaType("_WEBAPPSCRIPT");
    public static final MediaType _WOFF = new MediaType("_WOFF");
    public static final MediaType _WOFF2 = new MediaType("_WOFF2");
    public static final MediaType _WORD = new MediaType("_WORD");
    public static final MediaType _XMLDOC = new MediaType("_XMLDOC");
    public static final MediaType _XSD = new MediaType("_XSD");
    public static final MediaType _ZIP = new MediaType("_ZIP");
    private static TypeDesc typeDesc = new TypeDesc(MediaType.class);

    protected MediaType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static MediaType fromValue(String value) throws IllegalArgumentException {
        MediaType enumeration = (MediaType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static MediaType fromString(String value) throws IllegalArgumentException {
        return MediaType.fromValue(value);
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
        return MediaType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "MediaType"));
    }
}

