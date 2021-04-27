package com.testcase.web.demo.repository;

import com.testcase.web.demo.entity.Cats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class CatsRepositoryTest {
    @Autowired
    private CatsRepository catsRepository;

    @Test
    void findAll() {
        System.out.println(catsRepository.findAll().size());
    }


    @Test
    void findById() {
    }

    @Test
    void findCatsByRand() {
    }

    @Test
    void findTopById() {
    }

    @Test
    void getMaxId() {
        System.out.println(catsRepository.getMaxId());
    }
}