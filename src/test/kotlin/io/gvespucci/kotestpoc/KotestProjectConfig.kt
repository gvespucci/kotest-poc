package io.gvespucci.kotestpoc

import io.kotest.core.config.AbstractProjectConfig

object KotestProjectConfig : AbstractProjectConfig() {
    override val parallelism = 3
}
