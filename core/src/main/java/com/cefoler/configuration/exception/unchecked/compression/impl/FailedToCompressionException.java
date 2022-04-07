package com.cefoler.configuration.exception.unchecked.compression.impl;

import com.cefoler.configuration.exception.unchecked.compression.CompressionException;

public class FailedToCompressionException extends CompressionException {

  private static final long serialVersionUID = -1522763878459092660L;

  public FailedToCompressionException() {
  }

  public FailedToCompressionException(final String error) {
    super(error);
  }

  public FailedToCompressionException(final Throwable cause) {
    super(cause);
  }

  public FailedToCompressionException(final String error, final Throwable cause) {
    super(error, cause);
  }

}