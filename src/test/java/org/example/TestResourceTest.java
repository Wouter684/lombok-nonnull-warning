package org.example;

import org.junit.jupiter.api.Test;

import lombok.val;

import static jakarta.ws.rs.core.Response.Status.ACCEPTED;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TestResourceTest {

    private final TestResource testResource = new TestResource();

    @Test
    void testResource_validInput_returnsAccepted() {
        // When
        val response = testResource.testResource("Test");

        // Then
        assertEquals(ACCEPTED.getStatusCode(), response.getStatus());
    }

    @Test
    void testResource_nullInput_throwsNullPointerException() {
        // When & Then
        val exception = assertThrows(
                NullPointerException.class,
                () -> testResource.testResource(null)
        );
        assertEquals("requestBody is marked non-null but is null", exception.getMessage());
    }
}