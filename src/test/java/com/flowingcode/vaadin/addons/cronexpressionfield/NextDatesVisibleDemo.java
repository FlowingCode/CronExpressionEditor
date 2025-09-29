/*-
 * #%L
 * Cron Expression Field Add-on
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
package com.flowingcode.vaadin.addons.cronexpressionfield;

import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Next Dates Visible Demo")
@SuppressWarnings("serial")
@Route(value = "cron-expression-field/next-dates-visible", layout = CronExpressionFieldDemoView.class)
public class NextDatesVisibleDemo extends VerticalLayout {

  public NextDatesVisibleDemo() {
    CronExpressionField cronField = new CronExpressionField();
    Checkbox checkbox = new Checkbox("Show next dates");
    cronField.setNextDatesButtonVisible(false);
    checkbox.addValueChangeListener(v -> {
      cronField.setNextDatesButtonVisible(v.getValue());
    });
    add(checkbox, cronField);
  }

}
