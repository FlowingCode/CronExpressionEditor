package com.flowingcode.vaadin.addons.cronexpressioneditor;

import com.flowingcode.vaadin.addons.cronexpressioneditor.CronExpressionEditor;
import com.flowingcode.vaadin.addons.demo.DemoSource;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@DemoSource
@PageTitle("Next Dates Visible Demo")
@SuppressWarnings("serial")
@Route(value = "cron-exp-editor/next-dates-visible", layout = CronExpressionEditorDemoView.class)
public class NextDatesVisibleDemo extends VerticalLayout {

  public NextDatesVisibleDemo() {
    CronExpressionEditor croneditor = new CronExpressionEditor();
    Checkbox checkbox = new Checkbox("Show next dates");
    croneditor.setNextDatesButtonVisible(false);
    checkbox.addValueChangeListener(v -> {
      croneditor.setNextDatesButtonVisible(v.getValue());
    });
    add(checkbox, croneditor);
  }

}
