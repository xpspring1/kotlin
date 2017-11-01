// EXPECTED_REACHABLE_NODES: 1253
// This test was adapted from compiler/testData/codegen/box/callableReference/function/.
package foo

class A {
    fun foo() = "OK"
}

fun box(): String {
    val x = A::foo
    var r = x(A())
    return r
}
