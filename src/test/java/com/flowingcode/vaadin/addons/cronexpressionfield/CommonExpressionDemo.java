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
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Set common expressions Demo")
@SuppressWarnings("serial")
@Route(value = "cron-expression-field/common-exp", layout = CronExpressionFieldDemoView.class)
public class CommonExpressionDemo extends VerticalLayout {

  public CommonExpressionDemo() {
    CronExpressionField croneField = new CronExpressionField();
    croneField.addCommonExpressions("0 0 2 4 1/2 ?", "0 0 2 ? * 1,2,3");
    TextField expressionToAdd = new TextField("Add a new common cron");
    Button save = new Button("Save");
    save.addClickListener(e -> {
      if (croneField.addCommonExpressions(expressionToAdd.getValue())) {
        Notification.show("Successfully added");
      } else {
        Notification.show("Invalid cron expression");
      }

    });
    croneField.setCommonExpressionsVisible(true);
    Span valueDisplay = new Span();
    croneField.addValueChangeListener(v -> valueDisplay.setText("Current expression: " + v.getValue()));
    add(new Div(expressionToAdd, save), croneField, valueDisplay);
  }
}
