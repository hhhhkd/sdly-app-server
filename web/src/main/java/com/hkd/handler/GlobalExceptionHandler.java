package com.hkd.handler;

import com.hkd.enums.ResultCode;
import com.hkd.exceptions.BusinessException;
import com.hkd.helper.ParameterInvalidItemHelper;
import com.hkd.model.other.ParameterInvalidItem;
import com.hkd.result.PlatformResult;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by huangkd on 2019/1/23.
 * 统一异常处理
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


   /* *//**
     * 违反约束异常
     * @param e
     * @param request
     * @return
     */
    /*@ExceptionHandler(ConstraintViolationException.class)
    public PlatformResult handleConstraintViolationException(ConstraintViolationException e, HttpServletRequest request){
        log.info("handleConstraintViolationException start, uri:{}, caused by: ", request.getRequestURI(), e);
        //无效参数列表
        List<ParameterInvalidItem> parameterInvalidItems = ParameterInvalidItemHelper.convertCVEToParameterInvalidItem(e);
        return PlatformResult.failure(ResultCode.PARAM_IS_INVALID,parameterInvalidItems);
    }


    *//**
     * 处理参数绑定时异常
     * @param e
     * @param request
     * @return
     *//*
    @ExceptionHandler(BindException.class)
    public PlatformResult handleBindException(BindException e, HttpServletRequest request) {
        log.info("handleBindException start, uri:{}, caused by: ", request.getRequestURI(), e);
        //无效参数列表
        List<ParameterInvalidItem> parameterInvalidItemList = ParameterInvalidItemHelper.converBRToParameterInvalidItem(e.getBindingResult());
        return PlatformResult.failure(ResultCode.PARAM_IS_INVALID, parameterInvalidItemList);
    }
*/
    /**
     * @param e
     * @param request
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public PlatformResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e, HttpServletRequest request) {
        log.info("handleMethodArgumentNotValidException start, uri:{}, caused by: ", request.getRequestURI(), e);
        //无效参数列表
        List<ParameterInvalidItem> parameterInvalidItemList = ParameterInvalidItemHelper.converBRToParameterInvalidItem(e.getBindingResult());
        return PlatformResult.failure(ResultCode.PARAM_IS_INVALID, parameterInvalidItemList);
    }


    @ExceptionHandler(MissingServletRequestParameterException.class)
    public PlatformResult handleMissingServletRequestParameterException(MissingServletRequestParameterException e, HttpServletRequest request){
        log.info("handleMissingServletRequestParameterException start, uri:{}, caused by: ", request.getRequestURI(), e);
        Map<String,String> map= Maps.newHashMap();
        map.put(e.getParameterName(),e.getMessage());
        return PlatformResult.failure(ResultCode.PARAM_IS_INVALID,map);
    }


    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public PlatformResult handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e,HttpServletRequest request){
        return PlatformResult.failure(ResultCode.NOT_SUPPORT_REQ_METHOD);
    }
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public PlatformResult handleHttpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e){
        return PlatformResult.failure(ResultCode.NOT_SUPPORT_MEDIA_TYPE);
    }

    @ExceptionHandler(BadCredentialsException.class)
    public PlatformResult handleBadCredentialsException(BadCredentialsException e,HttpServletRequest request){
        return PlatformResult.failure(ResultCode.USERNAME_PASSWORD_ERROR);
    }

    /**
     * 处理业务异常
     * @param request
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public PlatformResult handleBusinessException(BusinessException e, HttpServletRequest request){
        log.warn("handleBusinessException start, uri:{}, exception:{}, caused by: {}", request.getRequestURI(), e.getClass(), e.getStackTrace());
        return PlatformResult.failure(e.getResultCode(),e.getData());
    }


    @ExceptionHandler(HttpMessageNotReadableException.class)
    public PlatformResult handleHttpMessageNotReadableException(HttpMessageNotReadableException e,HttpServletRequest request){
        return PlatformResult.failure(ResultCode.PARAM_IS_INVALID);


    }

    @ExceptionHandler(AccessDeniedException.class)
    public PlatformResult handleAccessDeniedException(AccessDeniedException e,HttpServletRequest request){
        return PlatformResult.failure(ResultCode.PERMISSIONS_INSUFFICIENT);
    }
    //其他异常
    @ExceptionHandler(Throwable.class)
    public PlatformResult handleException(Throwable e,HttpServletRequest request){
        log.error("handleThrowable start, uri:{}, caused by: ", request.getRequestURI(), e);
        return PlatformResult.failure(ResultCode.SYSTEM_INNER_ERROR);
    }

}
