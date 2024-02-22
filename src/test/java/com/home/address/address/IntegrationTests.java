package com.home.address.address;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class IntegrationTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    @WithMockUser(username = "profileService", password = "profileServicePass", roles = "USER")
    public void whenGetRequestMade_ThenReturnAnAddress() throws Exception {
        mockMvc
                .perform(
                        get("/address").queryParam("userId", UUID.randomUUID().toString())
                                .contentType(APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

}
