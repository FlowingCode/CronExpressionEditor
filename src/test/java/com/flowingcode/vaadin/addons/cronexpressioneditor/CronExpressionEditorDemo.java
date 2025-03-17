package com.flowingcode.vaadin.addons.cronexpressioneditor;

import java.util.Locale;
import com.flowingcode.vaadin.addons.cronexpressioneditor.CronExpressionEditor;
import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Default Setting Demo")
@SuppressWarnings("serial")
@Route(value = "cron-exp-editor/default", layout = CronExpressionEditorDemoView.class)
public class CronExpressionEditorDemo extends VerticalLayout {

  public CronExpressionEditorDemo() {

    TextField defaultCronTf = new TextField();
    defaultCronTf.setPlaceholder("Input a default cron expression");
    Button save = new Button("Save");

    CronExpressionEditor croneditor = new CronExpressionEditor();
    croneditor.setLabel("Custom default set");

    save.addClickListener(v -> {
      if (croneditor.setDefaultExpression(defaultCronTf.getValue())) {
        Notification.show("Default set succesfully");
      } else {
        Notification.show("Invalid cron, default not set");
      }

    });
    croneditor.setLocale(Locale.FRENCH);
    add(new HorizontalLayout(defaultCronTf, save), croneditor);
  }

}
