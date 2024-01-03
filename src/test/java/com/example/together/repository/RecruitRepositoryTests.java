package com.example.together.repository;

import com.together.togetherpj.domain.Recruit;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class RecruitRepositoryTests {

    @Autowired
    private RecruitRepository recruitRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void findbyId(){
        Long id=1L;
        Recruit recruit = recruitRepository.findById(id).orElseThrow();
        log.info(recruit.getCity());

    }


    /* @Test
      *
       public void testInsert() throws ParseException{


           SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");


           Recruit recruit = Recruit.builder()
                   .title("recruit test")
                   .city("yangyang")
                   .content("양양갈사람")
                   .perNum(3)
                   .recruitWriter(memberRepository.findByEmail("test@test.com").orElseThrow(() ->{
                       throw new UsernameNotFoundException("아이디 혹은 비밀번호가 잘못됐습니다.");
                   }))
                   .startdate(formatter.parse("2023-04-29"))
                   .enddate(formatter.parse("2023-04-30"))
                   .build();

           Recruit result = recruitRepository.save(recruit);
       }

    @Test
    public void testSelect(){
        Long cno = 1L;
        Optional<Recruit> result = recruitRepository.findById(cno);
        Recruit recruit = result.orElseThrow();
        log.info(recruit);
    }
*/

}