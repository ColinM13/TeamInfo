package com.example.demo;


import com.example.demo.controller.TeamController;
import com.example.demo.model.Team;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests extends AbstractTestNGSpringContextTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void contextLoads() {

	}

	@Test
	public void getTeamDallasStarsShouldReturnDallasStars() {
		Assert.assertEquals(this.testRestTemplate.getForObject("http://localhost:" + port + "/teams/stars", Team.class).getName(), "Stars");
	}

}
