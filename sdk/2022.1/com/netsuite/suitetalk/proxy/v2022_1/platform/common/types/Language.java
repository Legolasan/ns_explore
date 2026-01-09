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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class Language
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __afrikaans = "_afrikaans";
    public static final String __albanian = "_albanian";
    public static final String __arabic = "_arabic";
    public static final String __armenian = "_armenian";
    public static final String __bengali = "_bengali";
    public static final String __bosnian = "_bosnian";
    public static final String __bulgarian = "_bulgarian";
    public static final String __catalan = "_catalan";
    public static final String __chineseSimplified = "_chineseSimplified";
    public static final String __chineseTraditional = "_chineseTraditional";
    public static final String __croatian = "_croatian";
    public static final String __czech = "_czech";
    public static final String __danish = "_danish";
    public static final String __dutch = "_dutch";
    public static final String __englishAu = "_englishAu";
    public static final String __englishCa = "_englishCa";
    public static final String __englishInternational = "_englishInternational";
    public static final String __englishUK = "_englishUK";
    public static final String __englishUS = "_englishUS";
    public static final String __estonian = "_estonian";
    public static final String __filipino = "_filipino";
    public static final String __finnish = "_finnish";
    public static final String __frenchCanada = "_frenchCanada";
    public static final String __frenchFrance = "_frenchFrance";
    public static final String __german = "_german";
    public static final String __greek = "_greek";
    public static final String __gujarati = "_gujarati";
    public static final String __haitian = "_haitian";
    public static final String __hebrew = "_hebrew";
    public static final String __hindi = "_hindi";
    public static final String __hungarian = "_hungarian";
    public static final String __icelandic = "_icelandic";
    public static final String __indonesian = "_indonesian";
    public static final String __italian = "_italian";
    public static final String __japanese = "_japanese";
    public static final String __kannada = "_kannada";
    public static final String __korean = "_korean";
    public static final String __latinAmericanSpanish = "_latinAmericanSpanish";
    public static final String __latvian = "_latvian";
    public static final String __lithuanian = "_lithuanian";
    public static final String __luxembourgish = "_luxembourgish";
    public static final String __malay = "_malay";
    public static final String __marathi = "_marathi";
    public static final String __norwegian = "_norwegian";
    public static final String __persianIran = "_persianIran";
    public static final String __polish = "_polish";
    public static final String __portugueseBrazil = "_portugueseBrazil";
    public static final String __portuguesePortugal = "_portuguesePortugal";
    public static final String __punjabi = "_punjabi";
    public static final String __romanian = "_romanian";
    public static final String __russian = "_russian";
    public static final String __serbianCyrillic = "_serbianCyrillic";
    public static final String __serbianLatin = "_serbianLatin";
    public static final String __slovak = "_slovak";
    public static final String __slovenian = "_slovenian";
    public static final String __spanish = "_spanish";
    public static final String __swedish = "_swedish";
    public static final String __tamil = "_tamil";
    public static final String __telugu = "_telugu";
    public static final String __thai = "_thai";
    public static final String __turkish = "_turkish";
    public static final String __ukrainian = "_ukrainian";
    public static final String __vietnamese = "_vietnamese";
    public static final Language _afrikaans = new Language("_afrikaans");
    public static final Language _albanian = new Language("_albanian");
    public static final Language _arabic = new Language("_arabic");
    public static final Language _armenian = new Language("_armenian");
    public static final Language _bengali = new Language("_bengali");
    public static final Language _bosnian = new Language("_bosnian");
    public static final Language _bulgarian = new Language("_bulgarian");
    public static final Language _catalan = new Language("_catalan");
    public static final Language _chineseSimplified = new Language("_chineseSimplified");
    public static final Language _chineseTraditional = new Language("_chineseTraditional");
    public static final Language _croatian = new Language("_croatian");
    public static final Language _czech = new Language("_czech");
    public static final Language _danish = new Language("_danish");
    public static final Language _dutch = new Language("_dutch");
    public static final Language _englishAu = new Language("_englishAu");
    public static final Language _englishCa = new Language("_englishCa");
    public static final Language _englishInternational = new Language("_englishInternational");
    public static final Language _englishUK = new Language("_englishUK");
    public static final Language _englishUS = new Language("_englishUS");
    public static final Language _estonian = new Language("_estonian");
    public static final Language _filipino = new Language("_filipino");
    public static final Language _finnish = new Language("_finnish");
    public static final Language _frenchCanada = new Language("_frenchCanada");
    public static final Language _frenchFrance = new Language("_frenchFrance");
    public static final Language _german = new Language("_german");
    public static final Language _greek = new Language("_greek");
    public static final Language _gujarati = new Language("_gujarati");
    public static final Language _haitian = new Language("_haitian");
    public static final Language _hebrew = new Language("_hebrew");
    public static final Language _hindi = new Language("_hindi");
    public static final Language _hungarian = new Language("_hungarian");
    public static final Language _icelandic = new Language("_icelandic");
    public static final Language _indonesian = new Language("_indonesian");
    public static final Language _italian = new Language("_italian");
    public static final Language _japanese = new Language("_japanese");
    public static final Language _kannada = new Language("_kannada");
    public static final Language _korean = new Language("_korean");
    public static final Language _latinAmericanSpanish = new Language("_latinAmericanSpanish");
    public static final Language _latvian = new Language("_latvian");
    public static final Language _lithuanian = new Language("_lithuanian");
    public static final Language _luxembourgish = new Language("_luxembourgish");
    public static final Language _malay = new Language("_malay");
    public static final Language _marathi = new Language("_marathi");
    public static final Language _norwegian = new Language("_norwegian");
    public static final Language _persianIran = new Language("_persianIran");
    public static final Language _polish = new Language("_polish");
    public static final Language _portugueseBrazil = new Language("_portugueseBrazil");
    public static final Language _portuguesePortugal = new Language("_portuguesePortugal");
    public static final Language _punjabi = new Language("_punjabi");
    public static final Language _romanian = new Language("_romanian");
    public static final Language _russian = new Language("_russian");
    public static final Language _serbianCyrillic = new Language("_serbianCyrillic");
    public static final Language _serbianLatin = new Language("_serbianLatin");
    public static final Language _slovak = new Language("_slovak");
    public static final Language _slovenian = new Language("_slovenian");
    public static final Language _spanish = new Language("_spanish");
    public static final Language _swedish = new Language("_swedish");
    public static final Language _tamil = new Language("_tamil");
    public static final Language _telugu = new Language("_telugu");
    public static final Language _thai = new Language("_thai");
    public static final Language _turkish = new Language("_turkish");
    public static final Language _ukrainian = new Language("_ukrainian");
    public static final Language _vietnamese = new Language("_vietnamese");
    private static TypeDesc typeDesc = new TypeDesc(Language.class);

    protected Language(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static Language fromValue(String value) throws IllegalArgumentException {
        Language enumeration = (Language)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static Language fromString(String value) throws IllegalArgumentException {
        return Language.fromValue(value);
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
        return Language.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Language"));
    }
}

