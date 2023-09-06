package io.gvespucci.kotestpoc

import io.kotest.core.spec.style.ShouldSpec
import io.kotest.matchers.shouldNot
import io.kotest.matchers.string.beEmpty

class ProofOfConceptTest : ShouldSpec({

    should("an empty string be empty") {
        "Kotest" shouldNot beEmpty()
    }

})
