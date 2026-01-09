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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class SearchDate
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _fiscalHalfBeforeLast = "fiscalHalfBeforeLast";
    public static final String _fiscalHalfBeforeLastToDate = "fiscalHalfBeforeLastToDate";
    public static final String _fiscalQuarterBeforeLast = "fiscalQuarterBeforeLast";
    public static final String _fiscalQuarterBeforeLastToDate = "fiscalQuarterBeforeLastToDate";
    public static final String _fiscalYearBeforeLast = "fiscalYearBeforeLast";
    public static final String _fiscalYearBeforeLastToDate = "fiscalYearBeforeLastToDate";
    public static final String _fiveDaysAgo = "fiveDaysAgo";
    public static final String _fiveDaysFromNow = "fiveDaysFromNow";
    public static final String _fourDaysAgo = "fourDaysAgo";
    public static final String _fourDaysFromNow = "fourDaysFromNow";
    public static final String _fourWeeksStartingThisWeek = "fourWeeksStartingThisWeek";
    public static final String _lastBusinessWeek = "lastBusinessWeek";
    public static final String _lastFiscalHalf = "lastFiscalHalf";
    public static final String _lastFiscalHalfOneFiscalYearAgo = "lastFiscalHalfOneFiscalYearAgo";
    public static final String _lastFiscalHalfToDate = "lastFiscalHalfToDate";
    public static final String _lastFiscalQuarter = "lastFiscalQuarter";
    public static final String _lastFiscalQuarterOneFiscalYearAgo = "lastFiscalQuarterOneFiscalYearAgo";
    public static final String _lastFiscalQuarterToDate = "lastFiscalQuarterToDate";
    public static final String _lastFiscalQuarterTwoFiscalYearsAgo = "lastFiscalQuarterTwoFiscalYearsAgo";
    public static final String _lastFiscalYear = "lastFiscalYear";
    public static final String _lastFiscalYearToDate = "lastFiscalYearToDate";
    public static final String _lastMonth = "lastMonth";
    public static final String _lastMonthOneFiscalQuarterAgo = "lastMonthOneFiscalQuarterAgo";
    public static final String _lastMonthOneFiscalYearAgo = "lastMonthOneFiscalYearAgo";
    public static final String _lastMonthToDate = "lastMonthToDate";
    public static final String _lastMonthTwoFiscalQuartersAgo = "lastMonthTwoFiscalQuartersAgo";
    public static final String _lastMonthTwoFiscalYearsAgo = "lastMonthTwoFiscalYearsAgo";
    public static final String _lastRollingHalf = "lastRollingHalf";
    public static final String _lastRollingQuarter = "lastRollingQuarter";
    public static final String _lastRollingYear = "lastRollingYear";
    public static final String _lastWeek = "lastWeek";
    public static final String _lastWeekToDate = "lastWeekToDate";
    public static final String _monthAfterNext = "monthAfterNext";
    public static final String _monthAfterNextToDate = "monthAfterNextToDate";
    public static final String _monthBeforeLast = "monthBeforeLast";
    public static final String _monthBeforeLastToDate = "monthBeforeLastToDate";
    public static final String _nextBusinessWeek = "nextBusinessWeek";
    public static final String _nextFiscalHalf = "nextFiscalHalf";
    public static final String _nextFiscalQuarter = "nextFiscalQuarter";
    public static final String _nextFiscalYear = "nextFiscalYear";
    public static final String _nextFourWeeks = "nextFourWeeks";
    public static final String _nextMonth = "nextMonth";
    public static final String _nextOneHalf = "nextOneHalf";
    public static final String _nextOneMonth = "nextOneMonth";
    public static final String _nextOneQuarter = "nextOneQuarter";
    public static final String _nextOneWeek = "nextOneWeek";
    public static final String _nextOneYear = "nextOneYear";
    public static final String _nextWeek = "nextWeek";
    public static final String _ninetyDaysAgo = "ninetyDaysAgo";
    public static final String _ninetyDaysFromNow = "ninetyDaysFromNow";
    public static final String _oneYearBeforeLast = "oneYearBeforeLast";
    public static final String _previousFiscalQuartersLastFiscalYear = "previousFiscalQuartersLastFiscalYear";
    public static final String _previousFiscalQuartersThisFiscalYear = "previousFiscalQuartersThisFiscalYear";
    public static final String _previousMonthsLastFiscalHalf = "previousMonthsLastFiscalHalf";
    public static final String _previousMonthsLastFiscalQuarter = "previousMonthsLastFiscalQuarter";
    public static final String _previousMonthsLastFiscalYear = "previousMonthsLastFiscalYear";
    public static final String _previousMonthsSameFiscalHalfLastFiscalYear = "previousMonthsSameFiscalHalfLastFiscalYear";
    public static final String _previousMonthsSameFiscalQuarterLastFiscalYear = "previousMonthsSameFiscalQuarterLastFiscalYear";
    public static final String _previousMonthsThisFiscalHalf = "previousMonthsThisFiscalHalf";
    public static final String _previousMonthsThisFiscalQuarter = "previousMonthsThisFiscalQuarter";
    public static final String _previousMonthsThisFiscalYear = "previousMonthsThisFiscalYear";
    public static final String _previousOneDay = "previousOneDay";
    public static final String _previousOneHalf = "previousOneHalf";
    public static final String _previousOneMonth = "previousOneMonth";
    public static final String _previousOneQuarter = "previousOneQuarter";
    public static final String _previousOneWeek = "previousOneWeek";
    public static final String _previousOneYear = "previousOneYear";
    public static final String _previousRollingHalf = "previousRollingHalf";
    public static final String _previousRollingQuarter = "previousRollingQuarter";
    public static final String _previousRollingYear = "previousRollingYear";
    public static final String _sameDayFiscalQuarterBeforeLast = "sameDayFiscalQuarterBeforeLast";
    public static final String _sameDayFiscalYearBeforeLast = "sameDayFiscalYearBeforeLast";
    public static final String _sameDayLastFiscalQuarter = "sameDayLastFiscalQuarter";
    public static final String _sameDayLastFiscalYear = "sameDayLastFiscalYear";
    public static final String _sameDayLastMonth = "sameDayLastMonth";
    public static final String _sameDayLastWeek = "sameDayLastWeek";
    public static final String _sameDayMonthBeforeLast = "sameDayMonthBeforeLast";
    public static final String _sameDayWeekBeforeLast = "sameDayWeekBeforeLast";
    public static final String _sameFiscalHalfLastFiscalYear = "sameFiscalHalfLastFiscalYear";
    public static final String _sameFiscalHalfLastFiscalYearToDate = "sameFiscalHalfLastFiscalYearToDate";
    public static final String _sameFiscalQuarterFiscalYearBeforeLast = "sameFiscalQuarterFiscalYearBeforeLast";
    public static final String _sameFiscalQuarterLastFiscalYear = "sameFiscalQuarterLastFiscalYear";
    public static final String _sameFiscalQuarterLastFiscalYearToDate = "sameFiscalQuarterLastFiscalYearToDate";
    public static final String _sameMonthFiscalQuarterBeforeLast = "sameMonthFiscalQuarterBeforeLast";
    public static final String _sameMonthFiscalYearBeforeLast = "sameMonthFiscalYearBeforeLast";
    public static final String _sameMonthLastFiscalQuarter = "sameMonthLastFiscalQuarter";
    public static final String _sameMonthLastFiscalQuarterToDate = "sameMonthLastFiscalQuarterToDate";
    public static final String _sameMonthLastFiscalYear = "sameMonthLastFiscalYear";
    public static final String _sameMonthLastFiscalYearToDate = "sameMonthLastFiscalYearToDate";
    public static final String _sameWeekFiscalYearBeforeLast = "sameWeekFiscalYearBeforeLast";
    public static final String _sameWeekLastFiscalYear = "sameWeekLastFiscalYear";
    public static final String _sixtyDaysAgo = "sixtyDaysAgo";
    public static final String _sixtyDaysFromNow = "sixtyDaysFromNow";
    public static final String _startOfFiscalHalfBeforeLast = "startOfFiscalHalfBeforeLast";
    public static final String _startOfFiscalQuarterBeforeLast = "startOfFiscalQuarterBeforeLast";
    public static final String _startOfFiscalYearBeforeLast = "startOfFiscalYearBeforeLast";
    public static final String _startOfLastBusinessWeek = "startOfLastBusinessWeek";
    public static final String _startOfLastFiscalHalf = "startOfLastFiscalHalf";
    public static final String _startOfLastFiscalHalfOneFiscalYearAgo = "startOfLastFiscalHalfOneFiscalYearAgo";
    public static final String _startOfLastFiscalQuarter = "startOfLastFiscalQuarter";
    public static final String _startOfLastFiscalQuarterOneFiscalYearAgo = "startOfLastFiscalQuarterOneFiscalYearAgo";
    public static final String _startOfLastFiscalYear = "startOfLastFiscalYear";
    public static final String _startOfLastMonth = "startOfLastMonth";
    public static final String _startOfLastMonthOneFiscalQuarterAgo = "startOfLastMonthOneFiscalQuarterAgo";
    public static final String _startOfLastMonthOneFiscalYearAgo = "startOfLastMonthOneFiscalYearAgo";
    public static final String _startOfLastRollingHalf = "startOfLastRollingHalf";
    public static final String _startOfLastRollingQuarter = "startOfLastRollingQuarter";
    public static final String _startOfLastRollingYear = "startOfLastRollingYear";
    public static final String _startOfLastWeek = "startOfLastWeek";
    public static final String _startOfMonthBeforeLast = "startOfMonthBeforeLast";
    public static final String _startOfNextBusinessWeek = "startOfNextBusinessWeek";
    public static final String _startOfNextFiscalHalf = "startOfNextFiscalHalf";
    public static final String _startOfNextFiscalQuarter = "startOfNextFiscalQuarter";
    public static final String _startOfNextFiscalYear = "startOfNextFiscalYear";
    public static final String _startOfNextMonth = "startOfNextMonth";
    public static final String _startOfNextWeek = "startOfNextWeek";
    public static final String _startOfPreviousRollingHalf = "startOfPreviousRollingHalf";
    public static final String _startOfPreviousRollingQuarter = "startOfPreviousRollingQuarter";
    public static final String _startOfPreviousRollingYear = "startOfPreviousRollingYear";
    public static final String _startOfSameFiscalHalfLastFiscalYear = "startOfSameFiscalHalfLastFiscalYear";
    public static final String _startOfSameFiscalQuarterLastFiscalYear = "startOfSameFiscalQuarterLastFiscalYear";
    public static final String _startOfSameMonthLastFiscalQuarter = "startOfSameMonthLastFiscalQuarter";
    public static final String _startOfSameMonthLastFiscalYear = "startOfSameMonthLastFiscalYear";
    public static final String _startOfThisBusinessWeek = "startOfThisBusinessWeek";
    public static final String _startOfThisFiscalHalf = "startOfThisFiscalHalf";
    public static final String _startOfThisFiscalQuarter = "startOfThisFiscalQuarter";
    public static final String _startOfThisFiscalYear = "startOfThisFiscalYear";
    public static final String _startOfThisMonth = "startOfThisMonth";
    public static final String _startOfThisWeek = "startOfThisWeek";
    public static final String _startOfThisYear = "startOfThisYear";
    public static final String _startOfWeekBeforeLast = "startOfWeekBeforeLast";
    public static final String _tenDaysAgo = "tenDaysAgo";
    public static final String _tenDaysFromNow = "tenDaysFromNow";
    public static final String _thirtyDaysAgo = "thirtyDaysAgo";
    public static final String _thirtyDaysFromNow = "thirtyDaysFromNow";
    public static final String _thisBusinessWeek = "thisBusinessWeek";
    public static final String _thisFiscalHalf = "thisFiscalHalf";
    public static final String _thisFiscalHalfToDate = "thisFiscalHalfToDate";
    public static final String _thisFiscalQuarter = "thisFiscalQuarter";
    public static final String _thisFiscalQuarterToDate = "thisFiscalQuarterToDate";
    public static final String _thisFiscalYear = "thisFiscalYear";
    public static final String _thisFiscalYearToDate = "thisFiscalYearToDate";
    public static final String _thisMonth = "thisMonth";
    public static final String _thisMonthToDate = "thisMonthToDate";
    public static final String _thisRollingHalf = "thisRollingHalf";
    public static final String _thisRollingQuarter = "thisRollingQuarter";
    public static final String _thisRollingYear = "thisRollingYear";
    public static final String _thisWeek = "thisWeek";
    public static final String _thisWeekToDate = "thisWeekToDate";
    public static final String _thisYear = "thisYear";
    public static final String _threeDaysAgo = "threeDaysAgo";
    public static final String _threeDaysFromNow = "threeDaysFromNow";
    public static final String _threeFiscalQuartersAgo = "threeFiscalQuartersAgo";
    public static final String _threeFiscalQuartersAgoToDate = "threeFiscalQuartersAgoToDate";
    public static final String _threeFiscalYearsAgo = "threeFiscalYearsAgo";
    public static final String _threeFiscalYearsAgoToDate = "threeFiscalYearsAgoToDate";
    public static final String _threeMonthsAgo = "threeMonthsAgo";
    public static final String _threeMonthsAgoToDate = "threeMonthsAgoToDate";
    public static final String _today = "today";
    public static final String _tomorrow = "tomorrow";
    public static final String _twoDaysAgo = "twoDaysAgo";
    public static final String _twoDaysFromNow = "twoDaysFromNow";
    public static final String _weekAfterNext = "weekAfterNext";
    public static final String _weekAfterNextToDate = "weekAfterNextToDate";
    public static final String _weekBeforeLast = "weekBeforeLast";
    public static final String _weekBeforeLastToDate = "weekBeforeLastToDate";
    public static final String _yesterday = "yesterday";
    public static final SearchDate fiscalHalfBeforeLast = new SearchDate("fiscalHalfBeforeLast");
    public static final SearchDate fiscalHalfBeforeLastToDate = new SearchDate("fiscalHalfBeforeLastToDate");
    public static final SearchDate fiscalQuarterBeforeLast = new SearchDate("fiscalQuarterBeforeLast");
    public static final SearchDate fiscalQuarterBeforeLastToDate = new SearchDate("fiscalQuarterBeforeLastToDate");
    public static final SearchDate fiscalYearBeforeLast = new SearchDate("fiscalYearBeforeLast");
    public static final SearchDate fiscalYearBeforeLastToDate = new SearchDate("fiscalYearBeforeLastToDate");
    public static final SearchDate fiveDaysAgo = new SearchDate("fiveDaysAgo");
    public static final SearchDate fiveDaysFromNow = new SearchDate("fiveDaysFromNow");
    public static final SearchDate fourDaysAgo = new SearchDate("fourDaysAgo");
    public static final SearchDate fourDaysFromNow = new SearchDate("fourDaysFromNow");
    public static final SearchDate fourWeeksStartingThisWeek = new SearchDate("fourWeeksStartingThisWeek");
    public static final SearchDate lastBusinessWeek = new SearchDate("lastBusinessWeek");
    public static final SearchDate lastFiscalHalf = new SearchDate("lastFiscalHalf");
    public static final SearchDate lastFiscalHalfOneFiscalYearAgo = new SearchDate("lastFiscalHalfOneFiscalYearAgo");
    public static final SearchDate lastFiscalHalfToDate = new SearchDate("lastFiscalHalfToDate");
    public static final SearchDate lastFiscalQuarter = new SearchDate("lastFiscalQuarter");
    public static final SearchDate lastFiscalQuarterOneFiscalYearAgo = new SearchDate("lastFiscalQuarterOneFiscalYearAgo");
    public static final SearchDate lastFiscalQuarterToDate = new SearchDate("lastFiscalQuarterToDate");
    public static final SearchDate lastFiscalQuarterTwoFiscalYearsAgo = new SearchDate("lastFiscalQuarterTwoFiscalYearsAgo");
    public static final SearchDate lastFiscalYear = new SearchDate("lastFiscalYear");
    public static final SearchDate lastFiscalYearToDate = new SearchDate("lastFiscalYearToDate");
    public static final SearchDate lastMonth = new SearchDate("lastMonth");
    public static final SearchDate lastMonthOneFiscalQuarterAgo = new SearchDate("lastMonthOneFiscalQuarterAgo");
    public static final SearchDate lastMonthOneFiscalYearAgo = new SearchDate("lastMonthOneFiscalYearAgo");
    public static final SearchDate lastMonthToDate = new SearchDate("lastMonthToDate");
    public static final SearchDate lastMonthTwoFiscalQuartersAgo = new SearchDate("lastMonthTwoFiscalQuartersAgo");
    public static final SearchDate lastMonthTwoFiscalYearsAgo = new SearchDate("lastMonthTwoFiscalYearsAgo");
    public static final SearchDate lastRollingHalf = new SearchDate("lastRollingHalf");
    public static final SearchDate lastRollingQuarter = new SearchDate("lastRollingQuarter");
    public static final SearchDate lastRollingYear = new SearchDate("lastRollingYear");
    public static final SearchDate lastWeek = new SearchDate("lastWeek");
    public static final SearchDate lastWeekToDate = new SearchDate("lastWeekToDate");
    public static final SearchDate monthAfterNext = new SearchDate("monthAfterNext");
    public static final SearchDate monthAfterNextToDate = new SearchDate("monthAfterNextToDate");
    public static final SearchDate monthBeforeLast = new SearchDate("monthBeforeLast");
    public static final SearchDate monthBeforeLastToDate = new SearchDate("monthBeforeLastToDate");
    public static final SearchDate nextBusinessWeek = new SearchDate("nextBusinessWeek");
    public static final SearchDate nextFiscalHalf = new SearchDate("nextFiscalHalf");
    public static final SearchDate nextFiscalQuarter = new SearchDate("nextFiscalQuarter");
    public static final SearchDate nextFiscalYear = new SearchDate("nextFiscalYear");
    public static final SearchDate nextFourWeeks = new SearchDate("nextFourWeeks");
    public static final SearchDate nextMonth = new SearchDate("nextMonth");
    public static final SearchDate nextOneHalf = new SearchDate("nextOneHalf");
    public static final SearchDate nextOneMonth = new SearchDate("nextOneMonth");
    public static final SearchDate nextOneQuarter = new SearchDate("nextOneQuarter");
    public static final SearchDate nextOneWeek = new SearchDate("nextOneWeek");
    public static final SearchDate nextOneYear = new SearchDate("nextOneYear");
    public static final SearchDate nextWeek = new SearchDate("nextWeek");
    public static final SearchDate ninetyDaysAgo = new SearchDate("ninetyDaysAgo");
    public static final SearchDate ninetyDaysFromNow = new SearchDate("ninetyDaysFromNow");
    public static final SearchDate oneYearBeforeLast = new SearchDate("oneYearBeforeLast");
    public static final SearchDate previousFiscalQuartersLastFiscalYear = new SearchDate("previousFiscalQuartersLastFiscalYear");
    public static final SearchDate previousFiscalQuartersThisFiscalYear = new SearchDate("previousFiscalQuartersThisFiscalYear");
    public static final SearchDate previousMonthsLastFiscalHalf = new SearchDate("previousMonthsLastFiscalHalf");
    public static final SearchDate previousMonthsLastFiscalQuarter = new SearchDate("previousMonthsLastFiscalQuarter");
    public static final SearchDate previousMonthsLastFiscalYear = new SearchDate("previousMonthsLastFiscalYear");
    public static final SearchDate previousMonthsSameFiscalHalfLastFiscalYear = new SearchDate("previousMonthsSameFiscalHalfLastFiscalYear");
    public static final SearchDate previousMonthsSameFiscalQuarterLastFiscalYear = new SearchDate("previousMonthsSameFiscalQuarterLastFiscalYear");
    public static final SearchDate previousMonthsThisFiscalHalf = new SearchDate("previousMonthsThisFiscalHalf");
    public static final SearchDate previousMonthsThisFiscalQuarter = new SearchDate("previousMonthsThisFiscalQuarter");
    public static final SearchDate previousMonthsThisFiscalYear = new SearchDate("previousMonthsThisFiscalYear");
    public static final SearchDate previousOneDay = new SearchDate("previousOneDay");
    public static final SearchDate previousOneHalf = new SearchDate("previousOneHalf");
    public static final SearchDate previousOneMonth = new SearchDate("previousOneMonth");
    public static final SearchDate previousOneQuarter = new SearchDate("previousOneQuarter");
    public static final SearchDate previousOneWeek = new SearchDate("previousOneWeek");
    public static final SearchDate previousOneYear = new SearchDate("previousOneYear");
    public static final SearchDate previousRollingHalf = new SearchDate("previousRollingHalf");
    public static final SearchDate previousRollingQuarter = new SearchDate("previousRollingQuarter");
    public static final SearchDate previousRollingYear = new SearchDate("previousRollingYear");
    public static final SearchDate sameDayFiscalQuarterBeforeLast = new SearchDate("sameDayFiscalQuarterBeforeLast");
    public static final SearchDate sameDayFiscalYearBeforeLast = new SearchDate("sameDayFiscalYearBeforeLast");
    public static final SearchDate sameDayLastFiscalQuarter = new SearchDate("sameDayLastFiscalQuarter");
    public static final SearchDate sameDayLastFiscalYear = new SearchDate("sameDayLastFiscalYear");
    public static final SearchDate sameDayLastMonth = new SearchDate("sameDayLastMonth");
    public static final SearchDate sameDayLastWeek = new SearchDate("sameDayLastWeek");
    public static final SearchDate sameDayMonthBeforeLast = new SearchDate("sameDayMonthBeforeLast");
    public static final SearchDate sameDayWeekBeforeLast = new SearchDate("sameDayWeekBeforeLast");
    public static final SearchDate sameFiscalHalfLastFiscalYear = new SearchDate("sameFiscalHalfLastFiscalYear");
    public static final SearchDate sameFiscalHalfLastFiscalYearToDate = new SearchDate("sameFiscalHalfLastFiscalYearToDate");
    public static final SearchDate sameFiscalQuarterFiscalYearBeforeLast = new SearchDate("sameFiscalQuarterFiscalYearBeforeLast");
    public static final SearchDate sameFiscalQuarterLastFiscalYear = new SearchDate("sameFiscalQuarterLastFiscalYear");
    public static final SearchDate sameFiscalQuarterLastFiscalYearToDate = new SearchDate("sameFiscalQuarterLastFiscalYearToDate");
    public static final SearchDate sameMonthFiscalQuarterBeforeLast = new SearchDate("sameMonthFiscalQuarterBeforeLast");
    public static final SearchDate sameMonthFiscalYearBeforeLast = new SearchDate("sameMonthFiscalYearBeforeLast");
    public static final SearchDate sameMonthLastFiscalQuarter = new SearchDate("sameMonthLastFiscalQuarter");
    public static final SearchDate sameMonthLastFiscalQuarterToDate = new SearchDate("sameMonthLastFiscalQuarterToDate");
    public static final SearchDate sameMonthLastFiscalYear = new SearchDate("sameMonthLastFiscalYear");
    public static final SearchDate sameMonthLastFiscalYearToDate = new SearchDate("sameMonthLastFiscalYearToDate");
    public static final SearchDate sameWeekFiscalYearBeforeLast = new SearchDate("sameWeekFiscalYearBeforeLast");
    public static final SearchDate sameWeekLastFiscalYear = new SearchDate("sameWeekLastFiscalYear");
    public static final SearchDate sixtyDaysAgo = new SearchDate("sixtyDaysAgo");
    public static final SearchDate sixtyDaysFromNow = new SearchDate("sixtyDaysFromNow");
    public static final SearchDate startOfFiscalHalfBeforeLast = new SearchDate("startOfFiscalHalfBeforeLast");
    public static final SearchDate startOfFiscalQuarterBeforeLast = new SearchDate("startOfFiscalQuarterBeforeLast");
    public static final SearchDate startOfFiscalYearBeforeLast = new SearchDate("startOfFiscalYearBeforeLast");
    public static final SearchDate startOfLastBusinessWeek = new SearchDate("startOfLastBusinessWeek");
    public static final SearchDate startOfLastFiscalHalf = new SearchDate("startOfLastFiscalHalf");
    public static final SearchDate startOfLastFiscalHalfOneFiscalYearAgo = new SearchDate("startOfLastFiscalHalfOneFiscalYearAgo");
    public static final SearchDate startOfLastFiscalQuarter = new SearchDate("startOfLastFiscalQuarter");
    public static final SearchDate startOfLastFiscalQuarterOneFiscalYearAgo = new SearchDate("startOfLastFiscalQuarterOneFiscalYearAgo");
    public static final SearchDate startOfLastFiscalYear = new SearchDate("startOfLastFiscalYear");
    public static final SearchDate startOfLastMonth = new SearchDate("startOfLastMonth");
    public static final SearchDate startOfLastMonthOneFiscalQuarterAgo = new SearchDate("startOfLastMonthOneFiscalQuarterAgo");
    public static final SearchDate startOfLastMonthOneFiscalYearAgo = new SearchDate("startOfLastMonthOneFiscalYearAgo");
    public static final SearchDate startOfLastRollingHalf = new SearchDate("startOfLastRollingHalf");
    public static final SearchDate startOfLastRollingQuarter = new SearchDate("startOfLastRollingQuarter");
    public static final SearchDate startOfLastRollingYear = new SearchDate("startOfLastRollingYear");
    public static final SearchDate startOfLastWeek = new SearchDate("startOfLastWeek");
    public static final SearchDate startOfMonthBeforeLast = new SearchDate("startOfMonthBeforeLast");
    public static final SearchDate startOfNextBusinessWeek = new SearchDate("startOfNextBusinessWeek");
    public static final SearchDate startOfNextFiscalHalf = new SearchDate("startOfNextFiscalHalf");
    public static final SearchDate startOfNextFiscalQuarter = new SearchDate("startOfNextFiscalQuarter");
    public static final SearchDate startOfNextFiscalYear = new SearchDate("startOfNextFiscalYear");
    public static final SearchDate startOfNextMonth = new SearchDate("startOfNextMonth");
    public static final SearchDate startOfNextWeek = new SearchDate("startOfNextWeek");
    public static final SearchDate startOfPreviousRollingHalf = new SearchDate("startOfPreviousRollingHalf");
    public static final SearchDate startOfPreviousRollingQuarter = new SearchDate("startOfPreviousRollingQuarter");
    public static final SearchDate startOfPreviousRollingYear = new SearchDate("startOfPreviousRollingYear");
    public static final SearchDate startOfSameFiscalHalfLastFiscalYear = new SearchDate("startOfSameFiscalHalfLastFiscalYear");
    public static final SearchDate startOfSameFiscalQuarterLastFiscalYear = new SearchDate("startOfSameFiscalQuarterLastFiscalYear");
    public static final SearchDate startOfSameMonthLastFiscalQuarter = new SearchDate("startOfSameMonthLastFiscalQuarter");
    public static final SearchDate startOfSameMonthLastFiscalYear = new SearchDate("startOfSameMonthLastFiscalYear");
    public static final SearchDate startOfThisBusinessWeek = new SearchDate("startOfThisBusinessWeek");
    public static final SearchDate startOfThisFiscalHalf = new SearchDate("startOfThisFiscalHalf");
    public static final SearchDate startOfThisFiscalQuarter = new SearchDate("startOfThisFiscalQuarter");
    public static final SearchDate startOfThisFiscalYear = new SearchDate("startOfThisFiscalYear");
    public static final SearchDate startOfThisMonth = new SearchDate("startOfThisMonth");
    public static final SearchDate startOfThisWeek = new SearchDate("startOfThisWeek");
    public static final SearchDate startOfThisYear = new SearchDate("startOfThisYear");
    public static final SearchDate startOfWeekBeforeLast = new SearchDate("startOfWeekBeforeLast");
    public static final SearchDate tenDaysAgo = new SearchDate("tenDaysAgo");
    public static final SearchDate tenDaysFromNow = new SearchDate("tenDaysFromNow");
    public static final SearchDate thirtyDaysAgo = new SearchDate("thirtyDaysAgo");
    public static final SearchDate thirtyDaysFromNow = new SearchDate("thirtyDaysFromNow");
    public static final SearchDate thisBusinessWeek = new SearchDate("thisBusinessWeek");
    public static final SearchDate thisFiscalHalf = new SearchDate("thisFiscalHalf");
    public static final SearchDate thisFiscalHalfToDate = new SearchDate("thisFiscalHalfToDate");
    public static final SearchDate thisFiscalQuarter = new SearchDate("thisFiscalQuarter");
    public static final SearchDate thisFiscalQuarterToDate = new SearchDate("thisFiscalQuarterToDate");
    public static final SearchDate thisFiscalYear = new SearchDate("thisFiscalYear");
    public static final SearchDate thisFiscalYearToDate = new SearchDate("thisFiscalYearToDate");
    public static final SearchDate thisMonth = new SearchDate("thisMonth");
    public static final SearchDate thisMonthToDate = new SearchDate("thisMonthToDate");
    public static final SearchDate thisRollingHalf = new SearchDate("thisRollingHalf");
    public static final SearchDate thisRollingQuarter = new SearchDate("thisRollingQuarter");
    public static final SearchDate thisRollingYear = new SearchDate("thisRollingYear");
    public static final SearchDate thisWeek = new SearchDate("thisWeek");
    public static final SearchDate thisWeekToDate = new SearchDate("thisWeekToDate");
    public static final SearchDate thisYear = new SearchDate("thisYear");
    public static final SearchDate threeDaysAgo = new SearchDate("threeDaysAgo");
    public static final SearchDate threeDaysFromNow = new SearchDate("threeDaysFromNow");
    public static final SearchDate threeFiscalQuartersAgo = new SearchDate("threeFiscalQuartersAgo");
    public static final SearchDate threeFiscalQuartersAgoToDate = new SearchDate("threeFiscalQuartersAgoToDate");
    public static final SearchDate threeFiscalYearsAgo = new SearchDate("threeFiscalYearsAgo");
    public static final SearchDate threeFiscalYearsAgoToDate = new SearchDate("threeFiscalYearsAgoToDate");
    public static final SearchDate threeMonthsAgo = new SearchDate("threeMonthsAgo");
    public static final SearchDate threeMonthsAgoToDate = new SearchDate("threeMonthsAgoToDate");
    public static final SearchDate today = new SearchDate("today");
    public static final SearchDate tomorrow = new SearchDate("tomorrow");
    public static final SearchDate twoDaysAgo = new SearchDate("twoDaysAgo");
    public static final SearchDate twoDaysFromNow = new SearchDate("twoDaysFromNow");
    public static final SearchDate weekAfterNext = new SearchDate("weekAfterNext");
    public static final SearchDate weekAfterNextToDate = new SearchDate("weekAfterNextToDate");
    public static final SearchDate weekBeforeLast = new SearchDate("weekBeforeLast");
    public static final SearchDate weekBeforeLastToDate = new SearchDate("weekBeforeLastToDate");
    public static final SearchDate yesterday = new SearchDate("yesterday");
    private static TypeDesc typeDesc = new TypeDesc(SearchDate.class);

    protected SearchDate(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SearchDate fromValue(String value) throws IllegalArgumentException {
        SearchDate enumeration = (SearchDate)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SearchDate fromString(String value) throws IllegalArgumentException {
        return SearchDate.fromValue(value);
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
        return SearchDate.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchDate"));
    }
}

