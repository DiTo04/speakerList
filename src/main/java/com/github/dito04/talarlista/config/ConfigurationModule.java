package com.github.dito04.talarlista.config;

import java.util.Optional;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ConfigurationModule extends AbstractModule {

  @Provides
  @Port
  @Singleton
  int providePort() {
    return getEnv("PORT")
        .map(Integer::valueOf)
        .orElse(8000);
  }

  @Provides
  @StaticFileLocation
  @Singleton
  String provideStaticFileLocation() {
    return getEnv("STATIC_FOLDER").orElse("/static");
  }

  private Optional<String> getEnv(String env) {
    return Optional.ofNullable(System.getenv(env));
  }

}
