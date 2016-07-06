package com.memoizrlabs.shankkotlin

import com.memoizrlabs.Scope.scope
import com.memoizrlabs.Shank
import com.memoizrlabs.Shank.with
import org.junit.Assert.assertEquals
import org.junit.Test
import java.math.BigInteger

class Test {
    @Test
    fun wrapsCorrectly() {
        registerFactory(String::class) { -> "No param"}
        registerNamedFactory(String::class, "one") { -> "No param"}
        assertEquals(provideGlobalSingleton<String>(), "No param")
        assertEquals(provideNew<String>(), "No param")
        assertEquals(with(scope("one")).provideSingletonFor<String>(), "No param")
        assertEquals(Shank.named("one").provideNew<String>(), "No param")
        assertEquals(Shank.named("one").provideSingletonFor<String>(), "No param")

        registerFactory(String::class) { a: BigInteger -> "No param $a"}
        registerNamedFactory(String::class, "one") { a: BigInteger -> "No param $a"}
        assertEquals(provideGlobalSingleton<String>(BigInteger("2")), "No param 2")
        assertEquals(provideNew<String>(BigInteger("2")), "No param 2")
        assertEquals(with(scope("one")).provideSingletonFor<String>(BigInteger("2")), "No param 2")
        assertEquals(Shank.named("one").provideNew<String>(BigInteger("2")), "No param 2")
        assertEquals(Shank.named("one").provideSingletonFor<String>(BigInteger("2")), "No param 2")
    }

}