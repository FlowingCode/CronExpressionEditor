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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import com.vaadin.flow.i18n.I18NProvider;

public class TranslationProvider implements I18NProvider {
  
  public static final String BUNDLE_PREFIX = "messages";

  public final Locale LOCALE_EN = Locale.ENGLISH;

  private List<Locale> locales = Collections.unmodifiableList(Arrays.asList(Locale.ENGLISH));

  @Override
  public List<Locale> getProvidedLocales() {
    return locales;
  }

  @Override
  public String getTranslation(String key, Locale locale, Object... params) {
    // TODO Auto-generated method stub
    return null;
  }

}
