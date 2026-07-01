import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVoidMethod() {

        ExternalApi mockApi = mock(ExternalApi.class);

        doNothing().when(mockApi).sendData();

        MyService service = new MyService(mockApi);

        service.processData();

        verify(mockApi).sendData();
    }
}