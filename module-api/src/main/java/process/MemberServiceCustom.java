package process;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by david100gom on 2017. 9. 5.
 *
 * Github : https://github.com/david100gom
 */
@Service
@Component
public class MemberServiceCustom {

    private MemberRepository memberRepository;

    public MemberServiceCustom(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Long signup (Member member) {
        return memberRepository.save(member).getId();
    }
}