package pers.lx.crm.base.common.pigeon;

import java.util.HashMap;

/**
 * Created by lxl on 2017/2/9.
 */
public class Result {

    private HashMap<String,Object> map = new HashMap<String, Object>();

    private boolean success = false ;

    public HashMap<String, Object> getMap() {
        return map;
    }

    public void setMap(HashMap<String, Object> map) {
        this.map = map;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
