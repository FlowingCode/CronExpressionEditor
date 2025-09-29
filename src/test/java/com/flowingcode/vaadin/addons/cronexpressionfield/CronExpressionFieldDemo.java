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
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Default Setting Demo")
@SuppressWarnings("serial")
@Route(value = "cron-expression-field/default", layout = CronExpressionFieldDemoView.class)
public class CronExpressionFieldDemo extends VerticalLayout {

  public CronExpressionFieldDemo() {
    TextField defaultCronTf = new TextField();
    defaultCronTf.setPlaceholder("Input a default cron expression");
    Button save = new Button("Save");

    CronExpressionField cronField = new CronExpressionField();
    cronField.setLabel("Custom default set");

    save.addClickListener(v -> {
      if (cronField.setDefaultExpression(defaultCronTf.getValue())) {
        Notification.show("Default set successfully");
      } else {
        Notification.show("Invalid cron, default not set");
      }

    });
    Span valueDisplay = new Span();
    cronField.addValueChangeListener(v -> valueDisplay.setText("Current expression: " + v.getValue()));
    add(new HorizontalLayout(defaultCronTf, save), cronField, valueDisplay);
  }

}
