// EXPECTED_REACHABLE_NODES: 1250
// This test was adapted from compiler/testData/codegen/box/callableReference/function/local/.
package foo

fun box(): String {
    var result = "Fail"

    fun changeToOK() { result = "OK" }

    val ok = ::changeToOK
    ok()
    return result
}
