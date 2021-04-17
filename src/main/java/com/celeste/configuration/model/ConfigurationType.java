package com.celeste.configuration.model;

import com.celeste.configuration.model.provider.Configuration;
import com.celeste.configuration.model.provider.json.JsonProvider;
import com.celeste.configuration.model.provider.yaml.YamlProvider;
import com.google.common.collect.ImmutableList;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

@Getter
public enum ConfigurationType {

  JSON(JsonProvider.class, "JSON"),
  YAML(YamlProvider.class, "YAML", "YML");

  @NotNull
  private final Class<? extends Configuration> provider;

  @NotNull
  private final List<String> names;

  ConfigurationType(@NotNull final Class<? extends Configuration> provider, @NotNull final String... names) {
    this.provider = provider;
    this.names = ImmutableList.copyOf(names);
  }

  /**
   * Gets the configuration by their type
   * @param name String
   * @return ConfigurationType
   */
  @NotNull
  public static ConfigurationType getConfiguration(@NotNull final String name) {
    return Arrays.stream(values())
      .filter(type -> type.getNames().contains(name.toUpperCase()))
      .findFirst()
      .orElse(JSON);
  }

}