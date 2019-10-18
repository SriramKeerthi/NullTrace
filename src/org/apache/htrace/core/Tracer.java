package org.apache.htrace.core;

/**
 * Dummy Tracer
 */
public final class Tracer {
  private Tracer() {}

  public static Span getCurrentSpan() {
    return null;
  }

  public static Tracer curThreadTracer() {
    return null;
  }
}
