package process;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by david100gom on 2017. 9. 5.
 *
 * Github : https://github.com/david100gom
 */
@RestController
public class MemberController {

    @GetMapping("/")
    public Member get() {
        return new Member("jojoldu", "jojoldu@gmail.com");
    }
}
