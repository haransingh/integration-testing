package com.test.integration;

import com.test.integration.blog.BlogRequestDTO;
import com.test.integration.blog.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class IntegrationTestApplicationTests extends AbstractContainerBaseTest {
	@MockBean
	private BlogService blogService;

	@Autowired
	private MockMvc mockMvc;


	/*@Test
	public void testCreateBlog() throws Exception {
		BlogRequestDTO blogRequestDTO = new BlogRequestDTO("test", "test");
		ResultActions response = mockMvc.perform(MockMvcRequestBuilders.post("api/v1/blog", blogRequestDTO));
		response.andExpect(MockMvcResultMatchers.status().isOk());
	}*/

}
