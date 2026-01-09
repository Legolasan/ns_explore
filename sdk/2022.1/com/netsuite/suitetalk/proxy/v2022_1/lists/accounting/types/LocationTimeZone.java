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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class LocationTimeZone
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __africaCairo = "_africaCairo";
    public static final String __africaCasablanca = "_africaCasablanca";
    public static final String __africaJohannesburg = "_africaJohannesburg";
    public static final String __africaNairobi = "_africaNairobi";
    public static final String __africaTunis = "_africaTunis";
    public static final String __africaWindhoek = "_africaWindhoek";
    public static final String __americaAnchorage = "_americaAnchorage";
    public static final String __americaArgentinaBuenosAires = "_americaArgentinaBuenosAires";
    public static final String __americaBogota = "_americaBogota";
    public static final String __americaCaracas = "_americaCaracas";
    public static final String __americaCayenne = "_americaCayenne";
    public static final String __americaChicago = "_americaChicago";
    public static final String __americaChihuahua = "_americaChihuahua";
    public static final String __americaDenver = "_americaDenver";
    public static final String __americaGodthab = "_americaGodthab";
    public static final String __americaGuatemala = "_americaGuatemala";
    public static final String __americaHalifax = "_americaHalifax";
    public static final String __americaIndianaIndianapolis = "_americaIndianaIndianapolis";
    public static final String __americaLaPaz = "_americaLaPaz";
    public static final String __americaLosAngeles = "_americaLosAngeles";
    public static final String __americaManaus = "_americaManaus";
    public static final String __americaMexicoCity = "_americaMexicoCity";
    public static final String __americaMontevideo = "_americaMontevideo";
    public static final String __americaNewYork = "_americaNewYork";
    public static final String __americaNoronha = "_americaNoronha";
    public static final String __americaPhoenix = "_americaPhoenix";
    public static final String __americaRegina = "_americaRegina";
    public static final String __americaSantiago = "_americaSantiago";
    public static final String __americaSaoPaulo = "_americaSaoPaulo";
    public static final String __americaStJohns = "_americaStJohns";
    public static final String __americaTijuana = "_americaTijuana";
    public static final String __asiaAlmaty = "_asiaAlmaty";
    public static final String __asiaAmman = "_asiaAmman";
    public static final String __asiaBaghdad = "_asiaBaghdad";
    public static final String __asiaBaku = "_asiaBaku";
    public static final String __asiaBangkok = "_asiaBangkok";
    public static final String __asiaBeirut = "_asiaBeirut";
    public static final String __asiaDhaka = "_asiaDhaka";
    public static final String __asiaHongKong = "_asiaHongKong";
    public static final String __asiaIrkutsk = "_asiaIrkutsk";
    public static final String __asiaJerusalem = "_asiaJerusalem";
    public static final String __asiaKabul = "_asiaKabul";
    public static final String __asiaKarachi = "_asiaKarachi";
    public static final String __asiaKathmandu = "_asiaKathmandu";
    public static final String __asiaKolkata = "_asiaKolkata";
    public static final String __asiaKrasnoyarsk = "_asiaKrasnoyarsk";
    public static final String __asiaKualaLumpur = "_asiaKualaLumpur";
    public static final String __asiaMagadan = "_asiaMagadan";
    public static final String __asiaManila = "_asiaManila";
    public static final String __asiaMuscat = "_asiaMuscat";
    public static final String __asiaRangoon = "_asiaRangoon";
    public static final String __asiaRiyadh = "_asiaRiyadh";
    public static final String __asiaSeoul = "_asiaSeoul";
    public static final String __asiaTaipei = "_asiaTaipei";
    public static final String __asiaTashkent = "_asiaTashkent";
    public static final String __asiaTbilisi = "_asiaTbilisi";
    public static final String __asiaTehran = "_asiaTehran";
    public static final String __asiaTokyo = "_asiaTokyo";
    public static final String __asiaVladivostok = "_asiaVladivostok";
    public static final String __asiaYakutsk = "_asiaYakutsk";
    public static final String __asiaYekaterinburg = "_asiaYekaterinburg";
    public static final String __asiaYerevan = "_asiaYerevan";
    public static final String __atlanticAzores = "_atlanticAzores";
    public static final String __atlanticCapeVerde = "_atlanticCapeVerde";
    public static final String __atlanticReykjavik = "_atlanticReykjavik";
    public static final String __australiaAdelaide = "_australiaAdelaide";
    public static final String __australiaBrisbane = "_australiaBrisbane";
    public static final String __australiaDarwin = "_australiaDarwin";
    public static final String __australiaHobart = "_australiaHobart";
    public static final String __australiaPerth = "_australiaPerth";
    public static final String __australiaSydney = "_australiaSydney";
    public static final String __etcGmtPlus12 = "_etcGmtPlus12";
    public static final String __europeAmsterdam = "_europeAmsterdam";
    public static final String __europeBudapest = "_europeBudapest";
    public static final String __europeIstanbul = "_europeIstanbul";
    public static final String __europeKiev = "_europeKiev";
    public static final String __europeLondon = "_europeLondon";
    public static final String __europeMinsk = "_europeMinsk";
    public static final String __europeMoscow = "_europeMoscow";
    public static final String __europeParis = "_europeParis";
    public static final String __europeWarsaw = "_europeWarsaw";
    public static final String __pacificAuckland = "_pacificAuckland";
    public static final String __pacificGuam = "_pacificGuam";
    public static final String __pacificHonolulu = "_pacificHonolulu";
    public static final String __pacificKwajalein = "_pacificKwajalein";
    public static final String __pacificPagoPago = "_pacificPagoPago";
    public static final String __pacificTongatapu = "_pacificTongatapu";
    public static final LocationTimeZone _africaCairo = new LocationTimeZone("_africaCairo");
    public static final LocationTimeZone _africaCasablanca = new LocationTimeZone("_africaCasablanca");
    public static final LocationTimeZone _africaJohannesburg = new LocationTimeZone("_africaJohannesburg");
    public static final LocationTimeZone _africaNairobi = new LocationTimeZone("_africaNairobi");
    public static final LocationTimeZone _africaTunis = new LocationTimeZone("_africaTunis");
    public static final LocationTimeZone _africaWindhoek = new LocationTimeZone("_africaWindhoek");
    public static final LocationTimeZone _americaAnchorage = new LocationTimeZone("_americaAnchorage");
    public static final LocationTimeZone _americaArgentinaBuenosAires = new LocationTimeZone("_americaArgentinaBuenosAires");
    public static final LocationTimeZone _americaBogota = new LocationTimeZone("_americaBogota");
    public static final LocationTimeZone _americaCaracas = new LocationTimeZone("_americaCaracas");
    public static final LocationTimeZone _americaCayenne = new LocationTimeZone("_americaCayenne");
    public static final LocationTimeZone _americaChicago = new LocationTimeZone("_americaChicago");
    public static final LocationTimeZone _americaChihuahua = new LocationTimeZone("_americaChihuahua");
    public static final LocationTimeZone _americaDenver = new LocationTimeZone("_americaDenver");
    public static final LocationTimeZone _americaGodthab = new LocationTimeZone("_americaGodthab");
    public static final LocationTimeZone _americaGuatemala = new LocationTimeZone("_americaGuatemala");
    public static final LocationTimeZone _americaHalifax = new LocationTimeZone("_americaHalifax");
    public static final LocationTimeZone _americaIndianaIndianapolis = new LocationTimeZone("_americaIndianaIndianapolis");
    public static final LocationTimeZone _americaLaPaz = new LocationTimeZone("_americaLaPaz");
    public static final LocationTimeZone _americaLosAngeles = new LocationTimeZone("_americaLosAngeles");
    public static final LocationTimeZone _americaManaus = new LocationTimeZone("_americaManaus");
    public static final LocationTimeZone _americaMexicoCity = new LocationTimeZone("_americaMexicoCity");
    public static final LocationTimeZone _americaMontevideo = new LocationTimeZone("_americaMontevideo");
    public static final LocationTimeZone _americaNewYork = new LocationTimeZone("_americaNewYork");
    public static final LocationTimeZone _americaNoronha = new LocationTimeZone("_americaNoronha");
    public static final LocationTimeZone _americaPhoenix = new LocationTimeZone("_americaPhoenix");
    public static final LocationTimeZone _americaRegina = new LocationTimeZone("_americaRegina");
    public static final LocationTimeZone _americaSantiago = new LocationTimeZone("_americaSantiago");
    public static final LocationTimeZone _americaSaoPaulo = new LocationTimeZone("_americaSaoPaulo");
    public static final LocationTimeZone _americaStJohns = new LocationTimeZone("_americaStJohns");
    public static final LocationTimeZone _americaTijuana = new LocationTimeZone("_americaTijuana");
    public static final LocationTimeZone _asiaAlmaty = new LocationTimeZone("_asiaAlmaty");
    public static final LocationTimeZone _asiaAmman = new LocationTimeZone("_asiaAmman");
    public static final LocationTimeZone _asiaBaghdad = new LocationTimeZone("_asiaBaghdad");
    public static final LocationTimeZone _asiaBaku = new LocationTimeZone("_asiaBaku");
    public static final LocationTimeZone _asiaBangkok = new LocationTimeZone("_asiaBangkok");
    public static final LocationTimeZone _asiaBeirut = new LocationTimeZone("_asiaBeirut");
    public static final LocationTimeZone _asiaDhaka = new LocationTimeZone("_asiaDhaka");
    public static final LocationTimeZone _asiaHongKong = new LocationTimeZone("_asiaHongKong");
    public static final LocationTimeZone _asiaIrkutsk = new LocationTimeZone("_asiaIrkutsk");
    public static final LocationTimeZone _asiaJerusalem = new LocationTimeZone("_asiaJerusalem");
    public static final LocationTimeZone _asiaKabul = new LocationTimeZone("_asiaKabul");
    public static final LocationTimeZone _asiaKarachi = new LocationTimeZone("_asiaKarachi");
    public static final LocationTimeZone _asiaKathmandu = new LocationTimeZone("_asiaKathmandu");
    public static final LocationTimeZone _asiaKolkata = new LocationTimeZone("_asiaKolkata");
    public static final LocationTimeZone _asiaKrasnoyarsk = new LocationTimeZone("_asiaKrasnoyarsk");
    public static final LocationTimeZone _asiaKualaLumpur = new LocationTimeZone("_asiaKualaLumpur");
    public static final LocationTimeZone _asiaMagadan = new LocationTimeZone("_asiaMagadan");
    public static final LocationTimeZone _asiaManila = new LocationTimeZone("_asiaManila");
    public static final LocationTimeZone _asiaMuscat = new LocationTimeZone("_asiaMuscat");
    public static final LocationTimeZone _asiaRangoon = new LocationTimeZone("_asiaRangoon");
    public static final LocationTimeZone _asiaRiyadh = new LocationTimeZone("_asiaRiyadh");
    public static final LocationTimeZone _asiaSeoul = new LocationTimeZone("_asiaSeoul");
    public static final LocationTimeZone _asiaTaipei = new LocationTimeZone("_asiaTaipei");
    public static final LocationTimeZone _asiaTashkent = new LocationTimeZone("_asiaTashkent");
    public static final LocationTimeZone _asiaTbilisi = new LocationTimeZone("_asiaTbilisi");
    public static final LocationTimeZone _asiaTehran = new LocationTimeZone("_asiaTehran");
    public static final LocationTimeZone _asiaTokyo = new LocationTimeZone("_asiaTokyo");
    public static final LocationTimeZone _asiaVladivostok = new LocationTimeZone("_asiaVladivostok");
    public static final LocationTimeZone _asiaYakutsk = new LocationTimeZone("_asiaYakutsk");
    public static final LocationTimeZone _asiaYekaterinburg = new LocationTimeZone("_asiaYekaterinburg");
    public static final LocationTimeZone _asiaYerevan = new LocationTimeZone("_asiaYerevan");
    public static final LocationTimeZone _atlanticAzores = new LocationTimeZone("_atlanticAzores");
    public static final LocationTimeZone _atlanticCapeVerde = new LocationTimeZone("_atlanticCapeVerde");
    public static final LocationTimeZone _atlanticReykjavik = new LocationTimeZone("_atlanticReykjavik");
    public static final LocationTimeZone _australiaAdelaide = new LocationTimeZone("_australiaAdelaide");
    public static final LocationTimeZone _australiaBrisbane = new LocationTimeZone("_australiaBrisbane");
    public static final LocationTimeZone _australiaDarwin = new LocationTimeZone("_australiaDarwin");
    public static final LocationTimeZone _australiaHobart = new LocationTimeZone("_australiaHobart");
    public static final LocationTimeZone _australiaPerth = new LocationTimeZone("_australiaPerth");
    public static final LocationTimeZone _australiaSydney = new LocationTimeZone("_australiaSydney");
    public static final LocationTimeZone _etcGmtPlus12 = new LocationTimeZone("_etcGmtPlus12");
    public static final LocationTimeZone _europeAmsterdam = new LocationTimeZone("_europeAmsterdam");
    public static final LocationTimeZone _europeBudapest = new LocationTimeZone("_europeBudapest");
    public static final LocationTimeZone _europeIstanbul = new LocationTimeZone("_europeIstanbul");
    public static final LocationTimeZone _europeKiev = new LocationTimeZone("_europeKiev");
    public static final LocationTimeZone _europeLondon = new LocationTimeZone("_europeLondon");
    public static final LocationTimeZone _europeMinsk = new LocationTimeZone("_europeMinsk");
    public static final LocationTimeZone _europeMoscow = new LocationTimeZone("_europeMoscow");
    public static final LocationTimeZone _europeParis = new LocationTimeZone("_europeParis");
    public static final LocationTimeZone _europeWarsaw = new LocationTimeZone("_europeWarsaw");
    public static final LocationTimeZone _pacificAuckland = new LocationTimeZone("_pacificAuckland");
    public static final LocationTimeZone _pacificGuam = new LocationTimeZone("_pacificGuam");
    public static final LocationTimeZone _pacificHonolulu = new LocationTimeZone("_pacificHonolulu");
    public static final LocationTimeZone _pacificKwajalein = new LocationTimeZone("_pacificKwajalein");
    public static final LocationTimeZone _pacificPagoPago = new LocationTimeZone("_pacificPagoPago");
    public static final LocationTimeZone _pacificTongatapu = new LocationTimeZone("_pacificTongatapu");
    private static TypeDesc typeDesc = new TypeDesc(LocationTimeZone.class);

    protected LocationTimeZone(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static LocationTimeZone fromValue(String value) throws IllegalArgumentException {
        LocationTimeZone enumeration = (LocationTimeZone)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static LocationTimeZone fromString(String value) throws IllegalArgumentException {
        return LocationTimeZone.fromValue(value);
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
        return LocationTimeZone.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "LocationTimeZone"));
    }
}

