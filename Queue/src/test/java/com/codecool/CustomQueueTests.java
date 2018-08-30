package com.codecool;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CustomQueueTests {

    CustomQueue customQueue;

    @BeforeEach
    void setup() {
        customQueue = new CustomQueue();
    }

    @Test
    void testIsEmpty() {
        assertEquals(true, customQueue.isEmpty());
    }

    @Test
    void testSize() {
        assertEquals(0, customQueue.queueSize());
    }

    @Test
    void testEnqueue() {
        customQueue.enqueue("Wojtas", 0);
        customQueue.enqueue("Brzozo", 100);
        customQueue.enqueue("Tuleja", 2);

        assertAll(
                () -> assertEquals("Wojtas", customQueue.head.getValue()),
                () -> assertEquals("Brzozo", customQueue.tail.getValue())
        );
    }

    @Test
    void testPeek() {
        customQueue.enqueue("Brzozo", 100);
        customQueue.enqueue("Tuleja", 2);

        assertEquals("Tuleja", customQueue.peek().getValue());
    }

    @Test
    void testDequeue() {
        customQueue.enqueue("Brzozo", 100);
        customQueue.enqueue("Tuleja", 2);

        customQueue.dequeue();

        assertEquals("Brzozo", customQueue.head.getValue());
    }
}
