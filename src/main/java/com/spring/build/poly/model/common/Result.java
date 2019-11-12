package com.spring.build.poly.model.common;

import java.io.Serializable;

/**
 * @author Air
 */
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1935441745945143584L;

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public StatusInfo getResult() {
        return result;
    }

    public void setResult(StatusInfo result) {
        this.result = result;
    }

    private StatusInfo result;

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.result = StatusInfo.success();
        result.data = data;
        return result;
    }

    public static <T> Result<T> error(String errCode, String errMsg) {
        Result<T> result = new Result<>();
        result.result = StatusInfo.error(errCode, errMsg);
        return result;
    }

    public static <T> Result<T> error(StatusInfo errorInfo) {
        Result<T> result = new Result<>();
        result.result = StatusInfo.error(errorInfo.errorCode, errorInfo.errorMsg);
        return result;
    }

    public static <T> Result<T> error(ErrorCodeEnum errorEnum) {
        Result<T> result = new Result<>();
        result.result = StatusInfo.error(errorEnum.getCode(), errorEnum.getMsg());
        return result;
    }


    public static <T> Result<T> errorConfirm(String errCode, String errMsg) {
        Result<T> result = new Result<>();
        result.result = StatusInfo.errorConfirm(errCode, errMsg);
        return result;
    }


    public static class StatusInfo {

        private boolean success;

        private String errorCode;

        private String errorMsg;

        private boolean confirm;

        private static StatusInfo success() {
            StatusInfo info = new StatusInfo();
            info.success = true;
            return info;
        }

        public static StatusInfo error(String errCode, String errMsg) {
            StatusInfo info = new StatusInfo();
            info.success = false;
            info.errorCode = errCode;
            info.errorMsg = errMsg;
            return info;
        }

        public static StatusInfo errorConfirm(String errCode, String errMsg) {
            StatusInfo info = new StatusInfo();
            info.success = false;
            info.confirm = true;
            info.errorCode = errCode;
            info.errorMsg = errMsg;
            return info;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public boolean isConfirm() {
            return confirm;
        }

        public void setConfirm(boolean confirm) {
            this.confirm = confirm;
        }
    }
}
