/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.template.soy.types;

/** A placeholder for errors during parsing. */
public final class ErrorType extends SoyType {

  private static final ErrorType INSTANCE = new ErrorType();

  private ErrorType() {}

  public static ErrorType getInstance() {
    return INSTANCE;
  }

  @Override
  public Kind getKind() {
    return Kind.ERROR;
  }

  @Override
  boolean doIsAssignableFromNonUnionType(SoyType srcType) {
    return false;
  }

  @Override
  public String toString() {
    return "$error$";
  }
}
