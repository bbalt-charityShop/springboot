package com.bbalt.charityshop.business.web;

import com.bbalt.charityshop.business.dal.action.response.ResponseData;
import com.bbalt.charityshop.business.util.exception.BusinessException;
import com.bbalt.charityshop.business.util.exception.LoginException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

/**
 * <pre>
 * 异常响应处理。将异常包装为固定的格式并返回。
 * 指定格式为{@link ResponseEntity}。
 * </pre>
 * 
 * @author fenggang
 */
@ControllerAdvice
public class ControllerAssist {

	private Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 注册全局数据编辑器，若传递的数据为空字串 转成 null
	 * 
	 * @param binder
	 *          数据绑定
	 * @param request
	 *          web请求
	 */
	@InitBinder
	public void registerCustomEditors(WebDataBinder binder, WebRequest request) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}

	/**
	 * 处理请求参数验证异常
	 * 
	 * @param exception
	 * @param request
	 * @return
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception,
                                                                   HttpServletRequest request) {
		logger.info("", exception);
		String message = "methoe error";
		BindingResult bindingResult = exception.getBindingResult();
		if (bindingResult != null && bindingResult.hasErrors()) {
			List<ObjectError> objectErrorList = bindingResult.getAllErrors();
			if (!objectErrorList.isEmpty()) {
				message = objectErrorList.get(0).getDefaultMessage();
			}
		}
		ResponseData<?> result = new ResponseData<>();
		result.jsonFill(2, message, null);
		return ResponseEntity.ok(result);
	}

	/**
	 * 处理服务器端数据访问错误
	 * 
	 * @param request
	 *          请求对象
	 * @param exception
	 *          异常对象
	 * @param locale
	 *          地理信息
	 * @return
	 */
	// , DataAccessException.class, DataAccessResourceFailureException.class, DataIntegrityViolationException.class
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ SQLException.class })
	@ResponseBody
	public ResponseEntity<?> handleSQLException(HttpServletRequest request, Exception exception, Locale locale) {
		logger.info("", exception);
		ResponseData<?> result = new ResponseData<>();
		result.jsonFill(2, exception.getMessage(), null);
		return ResponseEntity.ok(result);
	}

	/**
	 * 处理服务器端RuntimeException
	 * 
	 * @param request
	 *          请求对象
	 * @param exception
	 *          异常对象
	 * @param locale
	 *          地理信息
	 * @return
	 */
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ Exception.class })
	@ResponseBody
	public ResponseEntity<?> handleAllException(HttpServletRequest request, Exception exception, Locale locale) {
		logger.info("", exception);
		ResponseData<?> result = new ResponseData<>();
		result.jsonFill(2, exception.getMessage(), null);
		return ResponseEntity.ok(result);
	}
	
	/**
	 * 处理登录验证异常
	 * 
	 * @param exception
	 * @param request
	 * @return
	 */
	@ExceptionHandler({LoginException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ResponseEntity<?> handleLoginException(LoginException exception,
                                                  HttpServletRequest request) {
		ResponseData<Boolean> responseData = new ResponseData<>();
		responseData.jsonFill(3, "未登录", null);
		return ResponseEntity.ok(responseData);
	}

	/**
	 * 处理business验证异常
	 * 
	 * @param exception
	 * @param request
	 * @return
	 */
	@ExceptionHandler({BusinessException.class})
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ResponseEntity<?> handleBusinessException(BusinessException exception,
                                                     HttpServletRequest request) {
		logger.info("", exception);
		ResponseData<?> result = new ResponseData<>();
		result.jsonFill(2, exception.getMessage(), null);
		return ResponseEntity.ok(result);
	}

}
