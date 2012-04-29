package org.springsource.roo.extrack.client.scaffold.ioc;

import org.springsource.roo.extrack.client.managed.request.ApplicationRequestFactory;
import org.springsource.roo.extrack.client.scaffold.request.EventSourceRequestTransport;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;


public class ScaffoldModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(ApplicationRequestFactory.class).toProvider(RequestFactoryProvider.class).in(Singleton.class);
		bind(PlaceController.class).toProvider(PlaceControllerProvider.class).in(Singleton.class);
	}

	static class PlaceControllerProvider implements Provider<PlaceController> {
		private final PlaceController placeController;

		@Inject
		public PlaceControllerProvider(EventBus eventBus) {
			this.placeController = new PlaceController(eventBus);
		}

		public PlaceController get() {
			return placeController;
		}
	}

	static class RequestFactoryProvider implements Provider<ApplicationRequestFactory> {
		private final ApplicationRequestFactory requestFactory;

		@Inject
		public RequestFactoryProvider(EventBus eventBus) {
			requestFactory = GWT.create(ApplicationRequestFactory.class);
			requestFactory.initialize(eventBus, new EventSourceRequestTransport(eventBus));
		}

		public ApplicationRequestFactory get() {
			return requestFactory;
		}
	}
}
