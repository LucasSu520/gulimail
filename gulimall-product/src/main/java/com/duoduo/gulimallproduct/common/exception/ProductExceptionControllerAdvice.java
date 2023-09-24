package com.duoduo.gulimallproduct.common.exception;

import com.duoduo.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice
public class ProductExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handMethodNotValidException(MethodArgumentNotValidException e){
      log.error("参数校验不通过, {}, {}",e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldError();
        Map<String, String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach(
                fieldError -> {
                    errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
                }
        );
        return R.error().put("data",errorMap);
    }

    @ExceptionHandler(value = Exception.class)
    public R handException(Throwable throwable){
        log.error("发生了不可预知的异常, {}", throwable.getMessage());
        return R.error();
    }
}
