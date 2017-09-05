import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import process.Member;
import process.MemberServiceCustom;
import process.ModuleApiApplication;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by david100gom on 2017. 9. 5.
 *
 * Github : https://github.com/david100gom
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ModuleApiApplication.class)
@WebAppConfiguration
public class ModuleApiApplicationTests {

    @Autowired
    private MemberServiceCustom memberServiceCustom;

    @Test
    public void save() {
        Member member = new Member("jojoldu", "jojoldu@gmail.com");
        Long id = memberServiceCustom.signup(member);
        assertThat(id, is(1L));
    }
}
