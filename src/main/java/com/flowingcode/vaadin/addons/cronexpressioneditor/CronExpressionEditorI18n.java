/*-
 * #%L
 * Cron Expression Editor Add-on
 * %%
 * Copyright (C) 2025 Flowing Code
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package com.flowingcode.vaadin.addons.cronexpressioneditor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Internationalization object for customizing the component UI texts. An instance with the default messages can be
 * obtained using {@link CronExpressionEditorI18n#createDefault()}.
 *
 * @author Sofia Nuñez / Flowing Code
 */
public class CronExpressionEditorI18n implements Serializable {
  private Map<LayoutOptions, String> layoutOptions;
  private String cronExpressionLabel;
  private String clearBtn;
  private String startsAtLabel;
  private Map<CronExpressionEditor.Units, String> units;
  private String descriptionLabel;
  private String descriptionPlaceholder;
  private String dayOfMonthLabel;
  private String repeatEveryLabel;
  private String month;
  private String showNextDatesBtn;
  private String commonExpressionsLabel;

  // tooltips
  private String timeAmountTooltip;
  private String daySelectorTooltip;
  private String startsAtTooltip;
  private String dayOfMonthTooltip;
  private String monthFieldTooltip;
  private String inputExpressionTooltip;

  /** Constructor for creating the default instance of the object. */
  private CronExpressionEditorI18n() {
    this.layoutOptions =
        Map.of(LayoutOptions.DAILY, "Daily", LayoutOptions.MONTHLY, "Monthly", LayoutOptions.ADVANCED, "Advanced");
    this.cronExpressionLabel = "Cron expression";
    this.clearBtn = "Clear";
    this.startsAtLabel = "Starts at";
    this.units = Map.of(CronExpressionEditor.Units.SECONDS, "Seconds", CronExpressionEditor.Units.MINUTES, "Minutes",
        CronExpressionEditor.Units.HOURS, "Hours");
    this.descriptionLabel = "Description";
    this.descriptionPlaceholder = "Expression invalid or empty";
    this.dayOfMonthLabel = "Day of month";
    this.repeatEveryLabel = "Repeat every";
    this.month = "Months";
    this.showNextDatesBtn = "Show next dates";
    this.commonExpressionsLabel = "Common expressions";
    this.timeAmountTooltip = "Enter the time interval for cron repetition, in minutes, seconds, or hours";
    this.daySelectorTooltip = "Select the days the task will occur; if none are selected, it defaults to daily";
    this.startsAtTooltip = "Choose the moment of the day that the task will begin";
    this.dayOfMonthTooltip = "Choose the day of the month to schedule the task";
    this.monthFieldTooltip = "Specify the interval (in months) for task execution";
    this.inputExpressionTooltip = "Cron expression generated. For manual setting, select advanced mode";

  }

  /**
   * Creates a new instance of {@code CronExpressionEditorI18n} with default values.
   *
   * @return a new {@code CronExpressionEditorI18n} instance
   */
  public static CronExpressionEditorI18n createDefault() {
    return new CronExpressionEditorI18n();
  }

  /**
   * Gets the label for the cron expression input.
   *
   * @return the cron expression label
   */
  public String getCronExpressionLabel() {
    return cronExpressionLabel;
  }

  /**
   * Sets the label for the cron expression input.
   *
   * @param cronExpressionLabel the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setCronExpressionLabel(String cronExpressionLabel) {
    this.cronExpressionLabel = cronExpressionLabel;
    return this;
  }

  /**
   * Gets the label for the clear button.
   *
   * @return the clear button label
   */
  public String getClearBtn() {
    return clearBtn;
  }

  /**
   * Sets the label for the clear button.
   *
   * @param clearBtn the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setClearBtn(String clearBtn) {
    this.clearBtn = clearBtn;
    return this;
  }

  /**
   * Gets the localized layout option labels.
   *
   * @return a map of layout options and their labels
   */
  public Map<LayoutOptions, String> getLayoutOptions() {
    return new HashMap<>(layoutOptions);
  }

  /**
   * Sets the localized layout option labels.
   *
   * @param layoutOptions a map of layout options and labels
   */
  public CronExpressionEditorI18n setLayoutOptions(Map<LayoutOptions, String> layoutOptions) {
    this.layoutOptions = new HashMap<>(layoutOptions);
    return this;
  }

  /**
   * Gets the label for the "Starts at" field.
   *
   * @return the starts at label
   */
  public String getStartsAtLabel() {
    return startsAtLabel;
  }

  /**
   * Sets the label for the "Starts at" field.
   *
   * @param startsAtLabel the label to set
   */
  public CronExpressionEditorI18n setStartsAtLabel(String startsAtLabel) {
    this.startsAtLabel = startsAtLabel;
    return this;
  }

  /**
   * Sets the label for the time picker (alias for starts at label).
   *
   * @param timePickerLabel the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setTimePickerLabel(String timePickerLabel) {
    this.startsAtLabel = timePickerLabel;
    return this;
  }

  /**
   * Gets the list of time unit labels.
   *
   * @return the list of unit labels
   */
  public Map<CronExpressionEditor.Units, String> getUnits() {
    return new HashMap<>(units);
  }

  /**
   * Sets the list of time unit labels.
   *
   * @param units the list of units
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setUnits(Map<CronExpressionEditor.Units, String> units) {
    this.units = units;
    return this;
  }

  /**
   * Gets the label for the description field.
   *
   * @return the description label
   */
  public String getDescriptionLabel() {
    return descriptionLabel;
  }

  /**
   * Sets the label for the description field.
   *
   * @param descriptionLabel the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setDescriptionLabel(String descriptionLabel) {
    this.descriptionLabel = descriptionLabel;
    return this;
  }

  /**
   * Gets the placeholder text for the description field.
   *
   * @return the description placeholder
   */
  public String getDescriptionPlaceholder() {
    return descriptionPlaceholder;
  }

  /**
   * Sets the placeholder text for the description field.
   *
   * @param descriptionPlaceholder the placeholder to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setDescriptionPlaceholder(String descriptionPlaceholder) {
    this.descriptionPlaceholder = descriptionPlaceholder;
    return this;
  }

  /**
   * Gets the label for the day-of-month field.
   *
   * @return the day-of-month label
   */
  public String getDayOfMonthLabel() {
    return dayOfMonthLabel;
  }

  /**
   * Sets the label for the day-of-month field.
   *
   * @param dayOfMonthLabel the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setDayOfMonthLabel(String dayOfMonthLabel) {
    this.dayOfMonthLabel = dayOfMonthLabel;
    return this;
  }

  /**
   * Gets the label for the "Repeat every" selector.
   *
   * @return the repeat-every label
   */
  public String getRepeatEveryLabel() {
    return repeatEveryLabel;
  }

  /**
   * Sets the label for the "Repeat every" selector.
   *
   * @param repeatEveryLabel the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setRepeatEveryLabel(String repeatEveryLabel) {
    this.repeatEveryLabel = repeatEveryLabel;
    return this;
  }

  /**
   * Gets the label for the month selector.
   *
   * @return the month label
   */
  public String getMonth() {
    return month;
  }

  /**
   * Sets the label for the month selector.
   *
   * @param month the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setMonth(String month) {
    this.month = month;
    return this;
  }

  /**
   * Gets the label for the "Show next dates" button.
   *
   * @return the button label
   */
  public String getShowNextDatesBtn() {
    return showNextDatesBtn;
  }

  /**
   * Sets the label for the "Show next dates" button.
   *
   * @param showNextDatesBtn the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setShowNextDatesBtn(String showNextDatesBtn) {
    this.showNextDatesBtn = showNextDatesBtn;
    return this;
  }

  /**
   * Gets the label for the common expressions section.
   *
   * @return the common expressions label
   */
  public String getCommonExpressionsLabel() {
    return commonExpressionsLabel;
  }

  /**
   * Sets the label for the common expressions section.
   *
   * @param commonExpressionsLabel the label to set
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setCommonExpressionsLabel(String commonExpressionsLabel) {
    this.commonExpressionsLabel = commonExpressionsLabel;
    return this;
  }

  /**
   * Gets the tooltip for the time amount input.
   *
   * @return the time amount tooltip
   */
  public String getTimeAmountTooltip() {
    return timeAmountTooltip;
  }

  /**
   * Sets the tooltip for the time amount input.
   *
   * @param timeAmountTooltip the tooltip text
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setTimeAmountTooltip(String timeAmountTooltip) {
    this.timeAmountTooltip = timeAmountTooltip;
    return this;
  }

  /**
   * Gets the tooltip for the day selector.
   *
   * @return the day selector tooltip
   */
  public String getDaySelectorTooltip() {
    return daySelectorTooltip;
  }

  /**
   * Sets the tooltip for the day selector.
   *
   * @param daySelectorTooltip the tooltip text
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setDaySelectorTooltip(String daySelectorTooltip) {
    this.daySelectorTooltip = daySelectorTooltip;
    return this;
  }

  /**
   * Gets the tooltip for the "Starts at" field.
   *
   * @return the starts-at tooltip
   */
  public String getStartsAtTooltip() {
    return startsAtTooltip;
  }

  /**
   * Sets the tooltip for the "Starts at" field.
   *
   * @param startsAtTooltip the tooltip text
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setStartsAtTooltip(String startsAtTooltip) {
    this.startsAtTooltip = startsAtTooltip;
    return this;
  }

  /**
   * Gets the tooltip for the day-of-month input field.
   *
   * @return the day-of-month tooltip
   */
  public String getDayOfMonthTooltip() {
    return dayOfMonthTooltip;
  }

  /**
   * Sets the tooltip for the day-of-month input field.
   *
   * @param dayOfMonthTooltip the tooltip text
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setDayOfMonthTooltip(String dayOfMonthTooltip) {
    this.dayOfMonthTooltip = dayOfMonthTooltip;
    return this;
  }

  /**
   * Gets the tooltip for the month input field.
   *
   * @return the month field tooltip
   */
  public String getMonthFieldTooltip() {
    return monthFieldTooltip;
  }

  /**
   * Sets the tooltip for the month input field.
   *
   * @param monthFieldTooltip the tooltip text
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setMonthFieldTooltip(String monthFieldTooltip) {
    this.monthFieldTooltip = monthFieldTooltip;
    return this;
  }

  /**
   * Gets the tooltip for the cron expression input.
   *
   * @return the input expression tooltip
   */
  public String getInputExpressionTooltip() {
    return inputExpressionTooltip;
  }

  /**
   * Sets the tooltip for the cron expression input.
   *
   * @param inputExpressionTooltip the tooltip text
   * @return this instance for method chaining
   */
  public CronExpressionEditorI18n setInputExpressionTooltip(String inputExpressionTooltip) {
    this.inputExpressionTooltip = inputExpressionTooltip;
    return this;
  }

}

