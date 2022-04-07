package com.cefoler.configuration.exception.unchecked.unchecked.impl.reflection.impl.member.impl.executable;

import com.cefoler.configuration.exception.unchecked.unchecked.impl.reflection.impl.member.UncheckedMemberException;
import com.cefoler.configuration.exception.checked.reflection.impl.member.impl.executable.ExecutableException;

public class UncheckedExecutableException extends UncheckedMemberException {

  private static final long serialVersionUID = 778187107196259634L;

  public UncheckedExecutableException(final ExecutableException cause) {
    super(cause);
  }

  public UncheckedExecutableException(final String error, final ExecutableException cause) {
    super(error, cause);
  }

}