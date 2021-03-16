package com.example.demo;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Metrics;
import io.micrometer.statsd.StatsdConfig;
import io.micrometer.statsd.StatsdFlavor;
import io.micrometer.statsd.StatsdMeterRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
//		StatsdConfig config = new StatsdConfig() {
//			@Override
//			public String get(String k) { return null; }
//			@Override
//			public StatsdFlavor flavor() { return StatsdFlavor.ETSY; }
//
//			@Override
//			public int port() {
//				return 8129;
//			}
//
//			@Override
//			public boolean enabled() {
//				return true;
//			}
//		};
//
//		MeterRegistry registry = new StatsdMeterRegistry(config, Clock.SYSTEM);
//
//		Metrics.globalRegistry.add(registry);

		SpringApplication.run(App.class, args);
	}

}

