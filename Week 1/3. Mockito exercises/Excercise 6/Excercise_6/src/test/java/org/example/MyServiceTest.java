package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testInteractionOrder() {

        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.execute();

        InOrder inOrder = Mockito.inOrder(mockApi);

        inOrder.verify(mockApi).firstMethod();
        inOrder.verify(mockApi).secondMethod();
    }
}