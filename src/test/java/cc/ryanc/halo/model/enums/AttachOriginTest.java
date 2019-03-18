package cc.ryanc.halo.model.enums;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Attach origin test.
 *
 * @author johnniang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AttachOriginTest {

    @Autowired
    private ConversionService conversionService;

    @Test
    public void conversionTest() {
        assertThat(conversionService.convert("SERVER", AttachOrigin.class), equalTo(AttachOrigin.SERVER));
        assertThat(conversionService.convert("server", AttachOrigin.class), equalTo(AttachOrigin.SERVER));
        assertThat(conversionService.convert("Server", AttachOrigin.class), equalTo(AttachOrigin.SERVER));
    }
}