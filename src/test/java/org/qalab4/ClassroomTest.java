package org.qalab4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {
    Classroom classroom;
    @BeforeEach
    void setUp() {
        classroom = new Classroom();
    }
    @Test
    void testMultiply() {
        assertEquals(39, classroom.multiply(39, 1), "Integer multiplication");
    }
    @Test
    void testDivide() {
        assertEquals(39, classroom.divide(39, 1), "Integer division");
    }
    @Test
    void testAdd() {
        assertEquals(40, classroom.add(39, 1), "Integer addition");
    }
    @Test
    void testSubtract() {
        assertEquals(38, classroom.subtract(39, 1), "Integer subtraction");
    }
    @Test
    void testSquare() {
        assertEquals(36, classroom.square(6), "Integer square");
    }
}
// checking something
