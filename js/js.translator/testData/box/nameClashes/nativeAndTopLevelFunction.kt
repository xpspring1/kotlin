// EXPECTED_REACHABLE_NODES: 1251
package test

external fun foo(ignore: dynamic): String

@JsName("foo")
fun foo() = "K"

fun box() = foo(0) + foo()