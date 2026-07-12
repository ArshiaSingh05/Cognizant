package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testVoidMethodException() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        doThrow(new RuntimeException("Exception"))
                .when(mockApi)
                .processData();

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> {
            service.execute();
        });

        verify(mockApi).processData();
    }
}