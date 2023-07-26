package com.neoris.devopstest.app.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.neoris.devopstest.app.models.RequestParam;


@ExtendWith(org.mockito.junit.jupiter.MockitoExtension.class)
public class DevopsServiceConrollerTest {
	
	private MockMvc mockMvc;

	@InjectMocks
	private DevopsServiceConroller serviceController;

	@Test
	public void TestSuccesfully() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(serviceController).build();
		
		RequestParam objRequest = new RequestParam();
		objRequest.setFromPerson("JUAN ");
		objRequest.setMessage("HOLA");
		objRequest.setTimeToLifeSec("45");
		objRequest.setToPerson("SEBASTIAN");

		MvcResult mvcResult = mockMvc
				.perform(post("/DevOps").contentType(MediaType.APPLICATION_JSON).content(asJsonString(objRequest)))
				.andExpect(status().is2xxSuccessful()).andReturn();
	}
	
	private String asJsonString(Object object) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }

}
