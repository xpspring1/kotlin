// EXPECTED_REACHABLE_NODES: 1254
package foo

object A {
    object B {
        val lambda = { "OK" }
    }
}

fun box() = A.B.lambda()

