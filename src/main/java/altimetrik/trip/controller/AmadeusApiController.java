package altimetrik.trip.controller;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import altimetrik.trip.model.FlightData;

@Controller
public class AmadeusApiController {
	static String basicURL = "http://localhost:8091/customers";

	public static FlightData loadCustomerRESTHandler() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		ResponseEntity<FlightData> responseEntity = restTemplate.exchange(basicURL + "/", HttpMethod.GET,
				entity, FlightData.class);
		if (responseEntity.getStatusCode() == HttpStatus.OK)
			return responseEntity.getBody();
		else
			return null;
	}
}
