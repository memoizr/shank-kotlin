package com.memoizrlabs.shankkotlin

import com.memoizrlabs.NamedScopedCache
import com.memoizrlabs.ScopedCache
import com.memoizrlabs.Shank
import com.memoizrlabs.Shank.registerFactory
import com.memoizrlabs.Shank.registerNamedFactory
import kotlin.reflect.KClass

inline fun <reified T : Any> ScopedCache.provideSingletonFor(): T = provideSingleton(T::class.java)
inline fun <reified T : Any, A: Any> ScopedCache.provideSingletonFor(arg1: A): T = provideSingleton(T::class.java, arg1)
inline fun <reified T : Any, A: Any, B: Any> ScopedCache.provideSingletonFor(arg1: A, arg2: B): T = provideSingleton(T::class.java, arg1, arg2)
inline fun <reified T : Any, A: Any, B: Any, C: Any> ScopedCache.provideSingletonFor(arg1: A, arg2: B, arg3: C): T = provideSingleton(T::class.java, arg1, arg2, arg3)
inline fun <reified T : Any, A: Any, B: Any, C: Any, D: Any> ScopedCache.provideSingletonFor(arg1: A, arg2: B, arg3: C, arg4: D): T = provideSingleton(T::class.java, arg1, arg2, arg3, arg4)

inline fun <reified T : Any> provideGlobalSingleton(): T = Shank.provideSingleton(T::class.java)
inline fun <reified T : Any, A: Any> provideGlobalSingleton(arg1: A): T = Shank.provideSingleton(T::class.java, arg1)
inline fun <reified T : Any, A: Any, B: Any> provideGlobalSingleton(arg1: A, arg2: B): T = Shank.provideSingleton(T::class.java, arg1, arg2)
inline fun <reified T : Any, A: Any, B: Any, C: Any> provideGlobalSingleton(arg1: A, arg2: B, arg3: C): T = Shank.provideSingleton(T::class.java, arg1, arg2, arg3)
inline fun <reified T : Any, A: Any, B: Any, C: Any, D: Any> provideGlobalSingleton(arg1: A, arg2: B, arg3: C, arg4: D): T = Shank.provideSingleton(T::class.java, arg1, arg2, arg3, arg4)

inline fun <reified T : Any> provideNew(): T = Shank.provideNew(T::class.java)
inline fun <reified T : Any, A: Any> provideNew(arg1: A): T = Shank.provideNew(T::class.java, arg1)
inline fun <reified T : Any, A: Any, B: Any> provideNew(arg1: A, arg2: B): T = Shank.provideNew(T::class.java, arg1, arg2)
inline fun <reified T : Any, A: Any, B: Any, C: Any> provideNew(arg1: A, arg2: B, arg3: C): T = Shank.provideNew(T::class.java, arg1, arg2, arg3)
inline fun <reified T : Any, A: Any, B: Any, C: Any, D: Any> provideNew(arg1: A, arg2: B, arg3: C, arg4: D): T = Shank.provideNew(T::class.java, arg1, arg2, arg3, arg4)

inline fun <reified T : Any> NamedScopedCache.provideNew(): T = this.provideNew(T::class.java)
inline fun <reified T : Any, A: Any> NamedScopedCache.provideNew(arg1: A): T = this.provideNew(T::class.java, arg1)
inline fun <reified T : Any, A: Any, B: Any> NamedScopedCache.provideNew(arg1: A, arg2: B): T = this.provideNew(T::class.java, arg1, arg2)
inline fun <reified T : Any, A: Any, B: Any, C: Any> NamedScopedCache.provideNew(arg1: A, arg2: B, arg3: C): T = this.provideNew(T::class.java, arg1, arg2, arg3)
inline fun <reified T : Any, A: Any, B: Any, C: Any, D: Any> NamedScopedCache.provideNew(arg1: A, arg2: B, arg3: C, arg4: D): T = this.provideNew(T::class.java, arg1, arg2, arg3, arg4)

fun <T : Any> registerFactory(objectClass: KClass<T>, factory: () -> T) = registerFactory(objectClass.java, factory)
fun <T : Any, A: Any> registerFactory(objectClass: KClass<T>, factory: (arg1: A) -> T) = registerFactory(objectClass.java, factory)
fun <T : Any, A: Any, B: Any> registerFactory(objectClass: KClass<T>, factory: (arg1: A, arg2 :B) -> T) = registerFactory(objectClass.java, factory)
fun <T : Any, A: Any, B: Any, C: Any> registerFactory(objectClass: KClass<T>, factory: (arg1: A, arg2 :B, arg3: C) -> T) = registerFactory(objectClass.java, factory)
fun <T : Any, A: Any, B: Any, C: Any, D: Any> registerFactory(objectClass: KClass<T>, factory: (arg1: A, arg2 :B, arg3: C, arg4: D) -> T) = registerFactory(objectClass.java, factory)

fun <T : Any> registerNamedFactory(objectClass: KClass<T>, name: String, factory: () -> T) = registerNamedFactory(objectClass.java, name, factory)
fun <T : Any, A: Any> registerNamedFactory(objectClass: KClass<T>, name: String, factory: (arg1: A) -> T) = registerNamedFactory(objectClass.java, name, factory)
fun <T : Any, A: Any, B: Any> registerNamedFactory(objectClass: KClass<T>, name: String, factory: (arg1: A, arg2 :B) -> T) = registerNamedFactory(objectClass.java, name, factory)
fun <T : Any, A: Any, B: Any, C: Any> registerNamedFactory(objectClass: KClass<T>, name: String, factory: (arg1: A, arg2 :B, arg3: C) -> T) = registerNamedFactory(objectClass.java, name, factory)
fun <T : Any, A: Any, B: Any, C: Any, D: Any> registerNamedFactory(objectClass: KClass<T>, name: String, factory: (arg1: A, arg2 :B, arg3: C, arg4: D) -> T) = registerNamedFactory(objectClass.java, name, factory)
