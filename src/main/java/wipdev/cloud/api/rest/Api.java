package wipdev.cloud.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import wipdev.cloud.api.rest.response.Response;

@RestController
@RequestMapping("api")
public class Api {
	public Api() {
	}

	@GetMapping("/test")
	@ResponseBody
	public Response test() {

		System.out.println("teste");
		return Response.newResponse()
				.withDescricao("teste")
				.build();
	}
}
