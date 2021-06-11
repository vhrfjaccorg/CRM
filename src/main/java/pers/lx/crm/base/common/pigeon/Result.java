package pers.lx.crm.base.common.pigeon;
;
import java.util.HashMap;

/**
 * Created by lxl on 2017/2/9.
 */
    public class Result {

    private HashMap<String,Object>  param = new HashMap<String, Object>();

    private boolean success = true ;

    private String error ;

    public HashMap<String, Object> getParam() {
        return param;
    }

    public void setParam(HashMap<String, Object> param) {
        this.param = param;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void addParam(String key, Object value){
        param.put(key,value) ;
    }

    public Object getParamValue(String key){
        if( param == null ){
            return null ;
        }
        return param.get(key) ;
    }

    public void setError(String error) {
        this.error = error;
        if( error != null ){
            this.setSuccess(false);
        }
    }
}
