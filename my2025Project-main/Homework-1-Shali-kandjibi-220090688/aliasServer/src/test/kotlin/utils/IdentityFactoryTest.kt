//package utils
//
//import jetbrains.kotlin.course.alias.util.IdentifierFactory
//import org.junit.jupiter.api.Assertions.assertEquals
//import org.junit.jupiter.api.Test
//
//class IdentityFactoryTest {
//    @Test
//    fun testUniqueIdentifier() {
//        val factory = IdentifierFactory()
//        val id1 = factory.uniqueIdentifier()
//        val id2 = factory.uniqueIdentifier()
//        val id3 = factory.uniqueIdentifier()
//
//        assertEquals(0, id1)
//        assertEquals(1, id2)
//        assertEquals(2, id3)
//    }
//
//    @Test
//    fun testCounter() {
//        val factory = IdentifierFactory()
//        factory.uniqueIdentifier()
//        factory.uniqueIdentifier()
//        assertEquals(2, factory.counter)
//    }
//}