package documentando.api.rest.handler;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Resource
	private MessageSource messageSource;
	
	private HttpHeaders headers() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return headers;
	}
	
	private ResponseError responseError(String messagem,HttpStatus statusCode) {
		ResponseError re = new ResponseError();
		re.setStatus("error");
		re.setError(messagem);
		re.setStatusCode(statusCode.value());
		return re;
	}
	
	//@ExceptionHandler({BusinessException.class})
	//private ResponseEntity<Object> handleBussinessException(BusinessException e, WebRequest request){
		//ResponseError error = responseError(e.getMessage(),HttpStatus.CONFLICT));
	//	return handle
	//}
	
}
