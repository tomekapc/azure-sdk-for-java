/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Long term retention policy.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "retentionPolicyType")
@JsonTypeName("LongTermRetentionPolicy")
public class LongTermRetentionPolicy extends RetentionPolicy {
    /**
     * Daily retention schedule of the protection policy.
     */
    @JsonProperty(value = "dailySchedule")
    private DailyRetentionSchedule dailySchedule;

    /**
     * Weekly retention schedule of the protection policy.
     */
    @JsonProperty(value = "weeklySchedule")
    private WeeklyRetentionSchedule weeklySchedule;

    /**
     * Monthly retention schedule of the protection policy.
     */
    @JsonProperty(value = "monthlySchedule")
    private MonthlyRetentionSchedule monthlySchedule;

    /**
     * Yearly retention schedule of the protection policy.
     */
    @JsonProperty(value = "yearlySchedule")
    private YearlyRetentionSchedule yearlySchedule;

    /**
     * Get daily retention schedule of the protection policy.
     *
     * @return the dailySchedule value
     */
    public DailyRetentionSchedule dailySchedule() {
        return this.dailySchedule;
    }

    /**
     * Set daily retention schedule of the protection policy.
     *
     * @param dailySchedule the dailySchedule value to set
     * @return the LongTermRetentionPolicy object itself.
     */
    public LongTermRetentionPolicy withDailySchedule(DailyRetentionSchedule dailySchedule) {
        this.dailySchedule = dailySchedule;
        return this;
    }

    /**
     * Get weekly retention schedule of the protection policy.
     *
     * @return the weeklySchedule value
     */
    public WeeklyRetentionSchedule weeklySchedule() {
        return this.weeklySchedule;
    }

    /**
     * Set weekly retention schedule of the protection policy.
     *
     * @param weeklySchedule the weeklySchedule value to set
     * @return the LongTermRetentionPolicy object itself.
     */
    public LongTermRetentionPolicy withWeeklySchedule(WeeklyRetentionSchedule weeklySchedule) {
        this.weeklySchedule = weeklySchedule;
        return this;
    }

    /**
     * Get monthly retention schedule of the protection policy.
     *
     * @return the monthlySchedule value
     */
    public MonthlyRetentionSchedule monthlySchedule() {
        return this.monthlySchedule;
    }

    /**
     * Set monthly retention schedule of the protection policy.
     *
     * @param monthlySchedule the monthlySchedule value to set
     * @return the LongTermRetentionPolicy object itself.
     */
    public LongTermRetentionPolicy withMonthlySchedule(MonthlyRetentionSchedule monthlySchedule) {
        this.monthlySchedule = monthlySchedule;
        return this;
    }

    /**
     * Get yearly retention schedule of the protection policy.
     *
     * @return the yearlySchedule value
     */
    public YearlyRetentionSchedule yearlySchedule() {
        return this.yearlySchedule;
    }

    /**
     * Set yearly retention schedule of the protection policy.
     *
     * @param yearlySchedule the yearlySchedule value to set
     * @return the LongTermRetentionPolicy object itself.
     */
    public LongTermRetentionPolicy withYearlySchedule(YearlyRetentionSchedule yearlySchedule) {
        this.yearlySchedule = yearlySchedule;
        return this;
    }

}
