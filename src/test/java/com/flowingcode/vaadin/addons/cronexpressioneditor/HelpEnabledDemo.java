package com.flowingcode.vaadin.addons.cronexpressioneditor;

import com.flowingcode.vaadin.addons.cronexpressioneditor.CronExpressionEditor;
import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Help enabled Demo")
@SuppressWarnings("serial")
@Route(value = "cron-exp-editor/help-enabled", layout = CronExpressionEditorDemoView.class)
public class HelpEnabledDemo extends Div {
  public HelpEnabledDemo() {
    CronExpressionEditor croneditor = new CronExpressionEditor();
    croneditor.setHelpEnabled(true);
    croneditor.addValueChangeListener(v -> System.out.println("value: " + v.getValue()));

    add(croneditor);
  }
}
