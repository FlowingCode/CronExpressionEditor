package com.flowingcode.vaadin.addons.cronexpressioneditor;

import java.util.Locale;
import java.util.ResourceBundle;
import com.flowingcode.vaadin.addons.cronexpressioneditor.CronExpressionEditor;
import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.function.SerializableFunction;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Set common expressions Demo")
@SuppressWarnings("serial")
@Route(value = "cron-exp-editor/common-exp", layout = CronExpressionEditorDemoView.class)
public class CommonExpressionDemo extends VerticalLayout {

  public CommonExpressionDemo() {
    CronExpressionEditor croneditor = new CronExpressionEditor();
    croneditor.addCommonExpressions("0 0 2 4 1/2 ?", "0 0 2 ? * 1,2,3");
    TextField expressionToAdd = new TextField("add a new common cron");
    Button save = new Button("save");
    save.addClickListener(e -> {
      if (croneditor.addCommonExpressions(expressionToAdd.getValue())) {
        Notification.show("Successfully added");
      } else {
        Notification.show("invalid cron expression");
      }

    });
    croneditor.setCommonExpressionsVisible(true);
    add(new Div(expressionToAdd, save), croneditor);
  }
}
