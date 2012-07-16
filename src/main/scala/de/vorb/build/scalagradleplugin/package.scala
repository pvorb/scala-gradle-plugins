package de.vorb.build

import org.gradle.api.{ Plugin, Project }
import groovy.lang.Closure

/**
 * Defines some implicit conversions for building Gradle plugins with Scala.
 */
package object scalagradleplugin {
  implicit def getClass(any: AnyRef) = any.getClass
  implicit def function2Closure(fn: () => Unit) = new Closure { fn() }
}
