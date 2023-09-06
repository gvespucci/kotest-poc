package io.gvespucci.kotestpoc

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldNot
import io.kotest.matchers.string.beEmpty

class StringTest : ShouldSpec({

    should("a non-empty string be not empty") {
        "Kotest" shouldNot beEmpty()
    }
    should("an empty string be empty") {
        "" should beEmpty()
    }

})
