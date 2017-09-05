import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import process.Member;
import process.MemberRepository;
import process.ModuleCommonApplicationTests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by david100gom on 2017. 9. 5.
 *
 * Github : https://github.com/david100gom
 */
@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(classes = ModuleCommonApplicationTests.class)
@WebAppConfiguration
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void add () {
        memberRepository.save(new Member("jojoldu", "jojoldu@gmail.com"));
        Member saved = memberRepository.findOne(1L);
        assertThat(saved.getName(), is("jojoldu"));
    }
}