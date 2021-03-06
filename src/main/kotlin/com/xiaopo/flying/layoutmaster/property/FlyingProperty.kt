package com.xiaopo.flying.layoutmaster.property

import com.xiaopo.flying.layoutmaster.property.EnumPropertyType.Boolean
import com.xiaopo.flying.layoutmaster.property.PropertyType.*

/**
 * @author wupanjie on 2018/4/4.
 */
data class FlyingProperty(
    val name: String,
    val method: String,
    val parameter: String,
    val type: PropertyType<*>,
    val supportAnimate: kotlin.Boolean = true) {

  companion object {
    fun of(name: String,
           method: String,
           type: PropertyType<*>,
           supportAnimate: kotlin.Boolean = true): FlyingProperty {
      return FlyingProperty(name, method, "", type, supportAnimate)
    }

    fun layout(name: String,
               parameter: String,
               type: PropertyType<*>,
               supportAnimate: kotlin.Boolean = true): FlyingProperty {
      return FlyingProperty(name, "", parameter, type, supportAnimate)
    }

    fun customOf(name: String, method: String): FlyingProperty {
      return FlyingProperty(name, method, "", Custom)
    }

    fun customBoolean(name: String, method: String): FlyingProperty {
      return FlyingProperty(name, method, "", Boolean)
    }

    fun customColor(name: String, method: String): FlyingProperty {
      return FlyingProperty(name, method, "", Color)
    }

    fun customLayout(name: String, parameter: String): FlyingProperty {
      return FlyingProperty(name, "", parameter, LAYOUT)
    }
  }

}
