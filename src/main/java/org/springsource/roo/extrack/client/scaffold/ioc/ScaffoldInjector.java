package org.springsource.roo.extrack.client.scaffold.ioc;

import org.springsource.roo.extrack.client.scaffold.ScaffoldApp;
import com.google.gwt.inject.client.Ginjector;

public interface ScaffoldInjector extends Ginjector {

	ScaffoldApp getScaffoldApp();
}
