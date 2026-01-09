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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class EmployeeCompensationCurrency
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __aed = "_aed";
    public static final String __afa = "_afa";
    public static final String __afn = "_afn";
    public static final String __all = "_all";
    public static final String __amd = "_amd";
    public static final String __ang = "_ang";
    public static final String __aoa = "_aoa";
    public static final String __ars = "_ars";
    public static final String __aud = "_aud";
    public static final String __awg = "_awg";
    public static final String __azn = "_azn";
    public static final String __bam = "_bam";
    public static final String __bbd = "_bbd";
    public static final String __bdt = "_bdt";
    public static final String __bgn = "_bgn";
    public static final String __bhd = "_bhd";
    public static final String __bif = "_bif";
    public static final String __bmd = "_bmd";
    public static final String __bnd = "_bnd";
    public static final String __bob = "_bob";
    public static final String __brl = "_brl";
    public static final String __bsd = "_bsd";
    public static final String __btn = "_btn";
    public static final String __bwp = "_bwp";
    public static final String __byn = "_byn";
    public static final String __byr = "_byr";
    public static final String __bzd = "_bzd";
    public static final String __cad = "_cad";
    public static final String __cdf = "_cdf";
    public static final String __chf = "_chf";
    public static final String __clp = "_clp";
    public static final String __cny = "_cny";
    public static final String __cop = "_cop";
    public static final String __crc = "_crc";
    public static final String __csd = "_csd";
    public static final String __cuc = "_cuc";
    public static final String __cup = "_cup";
    public static final String __cve = "_cve";
    public static final String __cyp = "_cyp";
    public static final String __czk = "_czk";
    public static final String __djf = "_djf";
    public static final String __dkk = "_dkk";
    public static final String __dop = "_dop";
    public static final String __dzd = "_dzd";
    public static final String __ecs = "_ecs";
    public static final String __eek = "_eek";
    public static final String __egp = "_egp";
    public static final String __ern = "_ern";
    public static final String __etb = "_etb";
    public static final String __eur = "_eur";
    public static final String __fjd = "_fjd";
    public static final String __fkp = "_fkp";
    public static final String __gbp = "_gbp";
    public static final String __gel = "_gel";
    public static final String __ggp = "_ggp";
    public static final String __ghc = "_ghc";
    public static final String __ghs = "_ghs";
    public static final String __gip = "_gip";
    public static final String __gmd = "_gmd";
    public static final String __gnf = "_gnf";
    public static final String __gtq = "_gtq";
    public static final String __gyd = "_gyd";
    public static final String __hkd = "_hkd";
    public static final String __hnl = "_hnl";
    public static final String __hrk = "_hrk";
    public static final String __htg = "_htg";
    public static final String __huf = "_huf";
    public static final String __idr = "_idr";
    public static final String __ils = "_ils";
    public static final String __imp = "_imp";
    public static final String __inr = "_inr";
    public static final String __iqd = "_iqd";
    public static final String __irr = "_irr";
    public static final String __isk = "_isk";
    public static final String __jep = "_jep";
    public static final String __jmd = "_jmd";
    public static final String __jod = "_jod";
    public static final String __jpy = "_jpy";
    public static final String __kes = "_kes";
    public static final String __kgs = "_kgs";
    public static final String __khr = "_khr";
    public static final String __kmf = "_kmf";
    public static final String __kpw = "_kpw";
    public static final String __krw = "_krw";
    public static final String __kwd = "_kwd";
    public static final String __kyd = "_kyd";
    public static final String __kzt = "_kzt";
    public static final String __lak = "_lak";
    public static final String __lbp = "_lbp";
    public static final String __lkr = "_lkr";
    public static final String __lrd = "_lrd";
    public static final String __lsl = "_lsl";
    public static final String __ltl = "_ltl";
    public static final String __lvl = "_lvl";
    public static final String __lyd = "_lyd";
    public static final String __mad = "_mad";
    public static final String __mdl = "_mdl";
    public static final String __mfg = "_mfg";
    public static final String __mga = "_mga";
    public static final String __mkd = "_mkd";
    public static final String __mmk = "_mmk";
    public static final String __mnt = "_mnt";
    public static final String __mop = "_mop";
    public static final String __mro = "_mro";
    public static final String __mru = "_mru";
    public static final String __mtl = "_mtl";
    public static final String __mur = "_mur";
    public static final String __mvr = "_mvr";
    public static final String __mwk = "_mwk";
    public static final String __mxn = "_mxn";
    public static final String __myr = "_myr";
    public static final String __mzm = "_mzm";
    public static final String __mzn = "_mzn";
    public static final String __nad = "_nad";
    public static final String __ngn = "_ngn";
    public static final String __nio = "_nio";
    public static final String __nok = "_nok";
    public static final String __npr = "_npr";
    public static final String __nzd = "_nzd";
    public static final String __omr = "_omr";
    public static final String __pab = "_pab";
    public static final String __pen = "_pen";
    public static final String __pgk = "_pgk";
    public static final String __php = "_php";
    public static final String __pkr = "_pkr";
    public static final String __pln = "_pln";
    public static final String __pyg = "_pyg";
    public static final String __qar = "_qar";
    public static final String __rol = "_rol";
    public static final String __ron = "_ron";
    public static final String __rsd = "_rsd";
    public static final String __rub = "_rub";
    public static final String __rur = "_rur";
    public static final String __rwf = "_rwf";
    public static final String __sar = "_sar";
    public static final String __sbd = "_sbd";
    public static final String __scr = "_scr";
    public static final String __sdd = "_sdd";
    public static final String __sdg = "_sdg";
    public static final String __sek = "_sek";
    public static final String __sgd = "_sgd";
    public static final String __shp = "_shp";
    public static final String __sit = "_sit";
    public static final String __skk = "_skk";
    public static final String __sll = "_sll";
    public static final String __sos = "_sos";
    public static final String __spl = "_spl";
    public static final String __srd = "_srd";
    public static final String __srg = "_srg";
    public static final String __ssp = "_ssp";
    public static final String __std = "_std";
    public static final String __stn = "_stn";
    public static final String __svc = "_svc";
    public static final String __syp = "_syp";
    public static final String __szl = "_szl";
    public static final String __thb = "_thb";
    public static final String __tjs = "_tjs";
    public static final String __tmm = "_tmm";
    public static final String __tmt = "_tmt";
    public static final String __tnd = "_tnd";
    public static final String __top = "_top";
    public static final String __trl = "_trl";
    public static final String __try = "_try";
    public static final String __ttd = "_ttd";
    public static final String __tvd = "_tvd";
    public static final String __twd = "_twd";
    public static final String __tzs = "_tzs";
    public static final String __uah = "_uah";
    public static final String __ugx = "_ugx";
    public static final String __usd = "_usd";
    public static final String __uyu = "_uyu";
    public static final String __uzs = "_uzs";
    public static final String __veb = "_veb";
    public static final String __vef = "_vef";
    public static final String __ves = "_ves";
    public static final String __vnd = "_vnd";
    public static final String __vuv = "_vuv";
    public static final String __wst = "_wst";
    public static final String __wsx = "_wsx";
    public static final String __xaf = "_xaf";
    public static final String __xag = "_xag";
    public static final String __xau = "_xau";
    public static final String __xcd = "_xcd";
    public static final String __xdr = "_xdr";
    public static final String __xof = "_xof";
    public static final String __xop = "_xop";
    public static final String __xpd = "_xpd";
    public static final String __xpf = "_xpf";
    public static final String __xpt = "_xpt";
    public static final String __yer = "_yer";
    public static final String __yum = "_yum";
    public static final String __zar = "_zar";
    public static final String __zmk = "_zmk";
    public static final String __zmw = "_zmw";
    public static final String __zrn = "_zrn";
    public static final String __zwd = "_zwd";
    public static final String __zwl = "_zwl";
    public static final EmployeeCompensationCurrency _aed = new EmployeeCompensationCurrency("_aed");
    public static final EmployeeCompensationCurrency _afa = new EmployeeCompensationCurrency("_afa");
    public static final EmployeeCompensationCurrency _afn = new EmployeeCompensationCurrency("_afn");
    public static final EmployeeCompensationCurrency _all = new EmployeeCompensationCurrency("_all");
    public static final EmployeeCompensationCurrency _amd = new EmployeeCompensationCurrency("_amd");
    public static final EmployeeCompensationCurrency _ang = new EmployeeCompensationCurrency("_ang");
    public static final EmployeeCompensationCurrency _aoa = new EmployeeCompensationCurrency("_aoa");
    public static final EmployeeCompensationCurrency _ars = new EmployeeCompensationCurrency("_ars");
    public static final EmployeeCompensationCurrency _aud = new EmployeeCompensationCurrency("_aud");
    public static final EmployeeCompensationCurrency _awg = new EmployeeCompensationCurrency("_awg");
    public static final EmployeeCompensationCurrency _azn = new EmployeeCompensationCurrency("_azn");
    public static final EmployeeCompensationCurrency _bam = new EmployeeCompensationCurrency("_bam");
    public static final EmployeeCompensationCurrency _bbd = new EmployeeCompensationCurrency("_bbd");
    public static final EmployeeCompensationCurrency _bdt = new EmployeeCompensationCurrency("_bdt");
    public static final EmployeeCompensationCurrency _bgn = new EmployeeCompensationCurrency("_bgn");
    public static final EmployeeCompensationCurrency _bhd = new EmployeeCompensationCurrency("_bhd");
    public static final EmployeeCompensationCurrency _bif = new EmployeeCompensationCurrency("_bif");
    public static final EmployeeCompensationCurrency _bmd = new EmployeeCompensationCurrency("_bmd");
    public static final EmployeeCompensationCurrency _bnd = new EmployeeCompensationCurrency("_bnd");
    public static final EmployeeCompensationCurrency _bob = new EmployeeCompensationCurrency("_bob");
    public static final EmployeeCompensationCurrency _brl = new EmployeeCompensationCurrency("_brl");
    public static final EmployeeCompensationCurrency _bsd = new EmployeeCompensationCurrency("_bsd");
    public static final EmployeeCompensationCurrency _btn = new EmployeeCompensationCurrency("_btn");
    public static final EmployeeCompensationCurrency _bwp = new EmployeeCompensationCurrency("_bwp");
    public static final EmployeeCompensationCurrency _byn = new EmployeeCompensationCurrency("_byn");
    public static final EmployeeCompensationCurrency _byr = new EmployeeCompensationCurrency("_byr");
    public static final EmployeeCompensationCurrency _bzd = new EmployeeCompensationCurrency("_bzd");
    public static final EmployeeCompensationCurrency _cad = new EmployeeCompensationCurrency("_cad");
    public static final EmployeeCompensationCurrency _cdf = new EmployeeCompensationCurrency("_cdf");
    public static final EmployeeCompensationCurrency _chf = new EmployeeCompensationCurrency("_chf");
    public static final EmployeeCompensationCurrency _clp = new EmployeeCompensationCurrency("_clp");
    public static final EmployeeCompensationCurrency _cny = new EmployeeCompensationCurrency("_cny");
    public static final EmployeeCompensationCurrency _cop = new EmployeeCompensationCurrency("_cop");
    public static final EmployeeCompensationCurrency _crc = new EmployeeCompensationCurrency("_crc");
    public static final EmployeeCompensationCurrency _csd = new EmployeeCompensationCurrency("_csd");
    public static final EmployeeCompensationCurrency _cuc = new EmployeeCompensationCurrency("_cuc");
    public static final EmployeeCompensationCurrency _cup = new EmployeeCompensationCurrency("_cup");
    public static final EmployeeCompensationCurrency _cve = new EmployeeCompensationCurrency("_cve");
    public static final EmployeeCompensationCurrency _cyp = new EmployeeCompensationCurrency("_cyp");
    public static final EmployeeCompensationCurrency _czk = new EmployeeCompensationCurrency("_czk");
    public static final EmployeeCompensationCurrency _djf = new EmployeeCompensationCurrency("_djf");
    public static final EmployeeCompensationCurrency _dkk = new EmployeeCompensationCurrency("_dkk");
    public static final EmployeeCompensationCurrency _dop = new EmployeeCompensationCurrency("_dop");
    public static final EmployeeCompensationCurrency _dzd = new EmployeeCompensationCurrency("_dzd");
    public static final EmployeeCompensationCurrency _ecs = new EmployeeCompensationCurrency("_ecs");
    public static final EmployeeCompensationCurrency _eek = new EmployeeCompensationCurrency("_eek");
    public static final EmployeeCompensationCurrency _egp = new EmployeeCompensationCurrency("_egp");
    public static final EmployeeCompensationCurrency _ern = new EmployeeCompensationCurrency("_ern");
    public static final EmployeeCompensationCurrency _etb = new EmployeeCompensationCurrency("_etb");
    public static final EmployeeCompensationCurrency _eur = new EmployeeCompensationCurrency("_eur");
    public static final EmployeeCompensationCurrency _fjd = new EmployeeCompensationCurrency("_fjd");
    public static final EmployeeCompensationCurrency _fkp = new EmployeeCompensationCurrency("_fkp");
    public static final EmployeeCompensationCurrency _gbp = new EmployeeCompensationCurrency("_gbp");
    public static final EmployeeCompensationCurrency _gel = new EmployeeCompensationCurrency("_gel");
    public static final EmployeeCompensationCurrency _ggp = new EmployeeCompensationCurrency("_ggp");
    public static final EmployeeCompensationCurrency _ghc = new EmployeeCompensationCurrency("_ghc");
    public static final EmployeeCompensationCurrency _ghs = new EmployeeCompensationCurrency("_ghs");
    public static final EmployeeCompensationCurrency _gip = new EmployeeCompensationCurrency("_gip");
    public static final EmployeeCompensationCurrency _gmd = new EmployeeCompensationCurrency("_gmd");
    public static final EmployeeCompensationCurrency _gnf = new EmployeeCompensationCurrency("_gnf");
    public static final EmployeeCompensationCurrency _gtq = new EmployeeCompensationCurrency("_gtq");
    public static final EmployeeCompensationCurrency _gyd = new EmployeeCompensationCurrency("_gyd");
    public static final EmployeeCompensationCurrency _hkd = new EmployeeCompensationCurrency("_hkd");
    public static final EmployeeCompensationCurrency _hnl = new EmployeeCompensationCurrency("_hnl");
    public static final EmployeeCompensationCurrency _hrk = new EmployeeCompensationCurrency("_hrk");
    public static final EmployeeCompensationCurrency _htg = new EmployeeCompensationCurrency("_htg");
    public static final EmployeeCompensationCurrency _huf = new EmployeeCompensationCurrency("_huf");
    public static final EmployeeCompensationCurrency _idr = new EmployeeCompensationCurrency("_idr");
    public static final EmployeeCompensationCurrency _ils = new EmployeeCompensationCurrency("_ils");
    public static final EmployeeCompensationCurrency _imp = new EmployeeCompensationCurrency("_imp");
    public static final EmployeeCompensationCurrency _inr = new EmployeeCompensationCurrency("_inr");
    public static final EmployeeCompensationCurrency _iqd = new EmployeeCompensationCurrency("_iqd");
    public static final EmployeeCompensationCurrency _irr = new EmployeeCompensationCurrency("_irr");
    public static final EmployeeCompensationCurrency _isk = new EmployeeCompensationCurrency("_isk");
    public static final EmployeeCompensationCurrency _jep = new EmployeeCompensationCurrency("_jep");
    public static final EmployeeCompensationCurrency _jmd = new EmployeeCompensationCurrency("_jmd");
    public static final EmployeeCompensationCurrency _jod = new EmployeeCompensationCurrency("_jod");
    public static final EmployeeCompensationCurrency _jpy = new EmployeeCompensationCurrency("_jpy");
    public static final EmployeeCompensationCurrency _kes = new EmployeeCompensationCurrency("_kes");
    public static final EmployeeCompensationCurrency _kgs = new EmployeeCompensationCurrency("_kgs");
    public static final EmployeeCompensationCurrency _khr = new EmployeeCompensationCurrency("_khr");
    public static final EmployeeCompensationCurrency _kmf = new EmployeeCompensationCurrency("_kmf");
    public static final EmployeeCompensationCurrency _kpw = new EmployeeCompensationCurrency("_kpw");
    public static final EmployeeCompensationCurrency _krw = new EmployeeCompensationCurrency("_krw");
    public static final EmployeeCompensationCurrency _kwd = new EmployeeCompensationCurrency("_kwd");
    public static final EmployeeCompensationCurrency _kyd = new EmployeeCompensationCurrency("_kyd");
    public static final EmployeeCompensationCurrency _kzt = new EmployeeCompensationCurrency("_kzt");
    public static final EmployeeCompensationCurrency _lak = new EmployeeCompensationCurrency("_lak");
    public static final EmployeeCompensationCurrency _lbp = new EmployeeCompensationCurrency("_lbp");
    public static final EmployeeCompensationCurrency _lkr = new EmployeeCompensationCurrency("_lkr");
    public static final EmployeeCompensationCurrency _lrd = new EmployeeCompensationCurrency("_lrd");
    public static final EmployeeCompensationCurrency _lsl = new EmployeeCompensationCurrency("_lsl");
    public static final EmployeeCompensationCurrency _ltl = new EmployeeCompensationCurrency("_ltl");
    public static final EmployeeCompensationCurrency _lvl = new EmployeeCompensationCurrency("_lvl");
    public static final EmployeeCompensationCurrency _lyd = new EmployeeCompensationCurrency("_lyd");
    public static final EmployeeCompensationCurrency _mad = new EmployeeCompensationCurrency("_mad");
    public static final EmployeeCompensationCurrency _mdl = new EmployeeCompensationCurrency("_mdl");
    public static final EmployeeCompensationCurrency _mfg = new EmployeeCompensationCurrency("_mfg");
    public static final EmployeeCompensationCurrency _mga = new EmployeeCompensationCurrency("_mga");
    public static final EmployeeCompensationCurrency _mkd = new EmployeeCompensationCurrency("_mkd");
    public static final EmployeeCompensationCurrency _mmk = new EmployeeCompensationCurrency("_mmk");
    public static final EmployeeCompensationCurrency _mnt = new EmployeeCompensationCurrency("_mnt");
    public static final EmployeeCompensationCurrency _mop = new EmployeeCompensationCurrency("_mop");
    public static final EmployeeCompensationCurrency _mro = new EmployeeCompensationCurrency("_mro");
    public static final EmployeeCompensationCurrency _mru = new EmployeeCompensationCurrency("_mru");
    public static final EmployeeCompensationCurrency _mtl = new EmployeeCompensationCurrency("_mtl");
    public static final EmployeeCompensationCurrency _mur = new EmployeeCompensationCurrency("_mur");
    public static final EmployeeCompensationCurrency _mvr = new EmployeeCompensationCurrency("_mvr");
    public static final EmployeeCompensationCurrency _mwk = new EmployeeCompensationCurrency("_mwk");
    public static final EmployeeCompensationCurrency _mxn = new EmployeeCompensationCurrency("_mxn");
    public static final EmployeeCompensationCurrency _myr = new EmployeeCompensationCurrency("_myr");
    public static final EmployeeCompensationCurrency _mzm = new EmployeeCompensationCurrency("_mzm");
    public static final EmployeeCompensationCurrency _mzn = new EmployeeCompensationCurrency("_mzn");
    public static final EmployeeCompensationCurrency _nad = new EmployeeCompensationCurrency("_nad");
    public static final EmployeeCompensationCurrency _ngn = new EmployeeCompensationCurrency("_ngn");
    public static final EmployeeCompensationCurrency _nio = new EmployeeCompensationCurrency("_nio");
    public static final EmployeeCompensationCurrency _nok = new EmployeeCompensationCurrency("_nok");
    public static final EmployeeCompensationCurrency _npr = new EmployeeCompensationCurrency("_npr");
    public static final EmployeeCompensationCurrency _nzd = new EmployeeCompensationCurrency("_nzd");
    public static final EmployeeCompensationCurrency _omr = new EmployeeCompensationCurrency("_omr");
    public static final EmployeeCompensationCurrency _pab = new EmployeeCompensationCurrency("_pab");
    public static final EmployeeCompensationCurrency _pen = new EmployeeCompensationCurrency("_pen");
    public static final EmployeeCompensationCurrency _pgk = new EmployeeCompensationCurrency("_pgk");
    public static final EmployeeCompensationCurrency _php = new EmployeeCompensationCurrency("_php");
    public static final EmployeeCompensationCurrency _pkr = new EmployeeCompensationCurrency("_pkr");
    public static final EmployeeCompensationCurrency _pln = new EmployeeCompensationCurrency("_pln");
    public static final EmployeeCompensationCurrency _pyg = new EmployeeCompensationCurrency("_pyg");
    public static final EmployeeCompensationCurrency _qar = new EmployeeCompensationCurrency("_qar");
    public static final EmployeeCompensationCurrency _rol = new EmployeeCompensationCurrency("_rol");
    public static final EmployeeCompensationCurrency _ron = new EmployeeCompensationCurrency("_ron");
    public static final EmployeeCompensationCurrency _rsd = new EmployeeCompensationCurrency("_rsd");
    public static final EmployeeCompensationCurrency _rub = new EmployeeCompensationCurrency("_rub");
    public static final EmployeeCompensationCurrency _rur = new EmployeeCompensationCurrency("_rur");
    public static final EmployeeCompensationCurrency _rwf = new EmployeeCompensationCurrency("_rwf");
    public static final EmployeeCompensationCurrency _sar = new EmployeeCompensationCurrency("_sar");
    public static final EmployeeCompensationCurrency _sbd = new EmployeeCompensationCurrency("_sbd");
    public static final EmployeeCompensationCurrency _scr = new EmployeeCompensationCurrency("_scr");
    public static final EmployeeCompensationCurrency _sdd = new EmployeeCompensationCurrency("_sdd");
    public static final EmployeeCompensationCurrency _sdg = new EmployeeCompensationCurrency("_sdg");
    public static final EmployeeCompensationCurrency _sek = new EmployeeCompensationCurrency("_sek");
    public static final EmployeeCompensationCurrency _sgd = new EmployeeCompensationCurrency("_sgd");
    public static final EmployeeCompensationCurrency _shp = new EmployeeCompensationCurrency("_shp");
    public static final EmployeeCompensationCurrency _sit = new EmployeeCompensationCurrency("_sit");
    public static final EmployeeCompensationCurrency _skk = new EmployeeCompensationCurrency("_skk");
    public static final EmployeeCompensationCurrency _sll = new EmployeeCompensationCurrency("_sll");
    public static final EmployeeCompensationCurrency _sos = new EmployeeCompensationCurrency("_sos");
    public static final EmployeeCompensationCurrency _spl = new EmployeeCompensationCurrency("_spl");
    public static final EmployeeCompensationCurrency _srd = new EmployeeCompensationCurrency("_srd");
    public static final EmployeeCompensationCurrency _srg = new EmployeeCompensationCurrency("_srg");
    public static final EmployeeCompensationCurrency _ssp = new EmployeeCompensationCurrency("_ssp");
    public static final EmployeeCompensationCurrency _std = new EmployeeCompensationCurrency("_std");
    public static final EmployeeCompensationCurrency _stn = new EmployeeCompensationCurrency("_stn");
    public static final EmployeeCompensationCurrency _svc = new EmployeeCompensationCurrency("_svc");
    public static final EmployeeCompensationCurrency _syp = new EmployeeCompensationCurrency("_syp");
    public static final EmployeeCompensationCurrency _szl = new EmployeeCompensationCurrency("_szl");
    public static final EmployeeCompensationCurrency _thb = new EmployeeCompensationCurrency("_thb");
    public static final EmployeeCompensationCurrency _tjs = new EmployeeCompensationCurrency("_tjs");
    public static final EmployeeCompensationCurrency _tmm = new EmployeeCompensationCurrency("_tmm");
    public static final EmployeeCompensationCurrency _tmt = new EmployeeCompensationCurrency("_tmt");
    public static final EmployeeCompensationCurrency _tnd = new EmployeeCompensationCurrency("_tnd");
    public static final EmployeeCompensationCurrency _top = new EmployeeCompensationCurrency("_top");
    public static final EmployeeCompensationCurrency _trl = new EmployeeCompensationCurrency("_trl");
    public static final EmployeeCompensationCurrency _try = new EmployeeCompensationCurrency("_try");
    public static final EmployeeCompensationCurrency _ttd = new EmployeeCompensationCurrency("_ttd");
    public static final EmployeeCompensationCurrency _tvd = new EmployeeCompensationCurrency("_tvd");
    public static final EmployeeCompensationCurrency _twd = new EmployeeCompensationCurrency("_twd");
    public static final EmployeeCompensationCurrency _tzs = new EmployeeCompensationCurrency("_tzs");
    public static final EmployeeCompensationCurrency _uah = new EmployeeCompensationCurrency("_uah");
    public static final EmployeeCompensationCurrency _ugx = new EmployeeCompensationCurrency("_ugx");
    public static final EmployeeCompensationCurrency _usd = new EmployeeCompensationCurrency("_usd");
    public static final EmployeeCompensationCurrency _uyu = new EmployeeCompensationCurrency("_uyu");
    public static final EmployeeCompensationCurrency _uzs = new EmployeeCompensationCurrency("_uzs");
    public static final EmployeeCompensationCurrency _veb = new EmployeeCompensationCurrency("_veb");
    public static final EmployeeCompensationCurrency _vef = new EmployeeCompensationCurrency("_vef");
    public static final EmployeeCompensationCurrency _ves = new EmployeeCompensationCurrency("_ves");
    public static final EmployeeCompensationCurrency _vnd = new EmployeeCompensationCurrency("_vnd");
    public static final EmployeeCompensationCurrency _vuv = new EmployeeCompensationCurrency("_vuv");
    public static final EmployeeCompensationCurrency _wst = new EmployeeCompensationCurrency("_wst");
    public static final EmployeeCompensationCurrency _wsx = new EmployeeCompensationCurrency("_wsx");
    public static final EmployeeCompensationCurrency _xaf = new EmployeeCompensationCurrency("_xaf");
    public static final EmployeeCompensationCurrency _xag = new EmployeeCompensationCurrency("_xag");
    public static final EmployeeCompensationCurrency _xau = new EmployeeCompensationCurrency("_xau");
    public static final EmployeeCompensationCurrency _xcd = new EmployeeCompensationCurrency("_xcd");
    public static final EmployeeCompensationCurrency _xdr = new EmployeeCompensationCurrency("_xdr");
    public static final EmployeeCompensationCurrency _xof = new EmployeeCompensationCurrency("_xof");
    public static final EmployeeCompensationCurrency _xop = new EmployeeCompensationCurrency("_xop");
    public static final EmployeeCompensationCurrency _xpd = new EmployeeCompensationCurrency("_xpd");
    public static final EmployeeCompensationCurrency _xpf = new EmployeeCompensationCurrency("_xpf");
    public static final EmployeeCompensationCurrency _xpt = new EmployeeCompensationCurrency("_xpt");
    public static final EmployeeCompensationCurrency _yer = new EmployeeCompensationCurrency("_yer");
    public static final EmployeeCompensationCurrency _yum = new EmployeeCompensationCurrency("_yum");
    public static final EmployeeCompensationCurrency _zar = new EmployeeCompensationCurrency("_zar");
    public static final EmployeeCompensationCurrency _zmk = new EmployeeCompensationCurrency("_zmk");
    public static final EmployeeCompensationCurrency _zmw = new EmployeeCompensationCurrency("_zmw");
    public static final EmployeeCompensationCurrency _zrn = new EmployeeCompensationCurrency("_zrn");
    public static final EmployeeCompensationCurrency _zwd = new EmployeeCompensationCurrency("_zwd");
    public static final EmployeeCompensationCurrency _zwl = new EmployeeCompensationCurrency("_zwl");
    private static TypeDesc typeDesc = new TypeDesc(EmployeeCompensationCurrency.class);

    protected EmployeeCompensationCurrency(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static EmployeeCompensationCurrency fromValue(String value) throws IllegalArgumentException {
        EmployeeCompensationCurrency enumeration = (EmployeeCompensationCurrency)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static EmployeeCompensationCurrency fromString(String value) throws IllegalArgumentException {
        return EmployeeCompensationCurrency.fromValue(value);
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
        return EmployeeCompensationCurrency.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeCompensationCurrency"));
    }
}

