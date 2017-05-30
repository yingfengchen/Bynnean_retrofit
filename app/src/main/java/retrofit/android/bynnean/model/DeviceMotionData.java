package retrofit.android.bynnean.model;

import android.bluetooth.BluetoothClass;

/**
 * Created by 乾隆大帝001 on 2017/5/16.
 */

public class DeviceMotionData {
    String handler;
    DeviceSub sub;

    public DeviceMotionData(String handler, DeviceSub sub) {
        this.handler = handler;
        this.sub = sub;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public DeviceSub getSub() {
        return sub;
    }

    public void setSub(DeviceSub sub) {
        this.sub = sub;
    }

    public static class  DeviceSub{

        String mac;
        String module;

        public DeviceSub(String mac, String module) {
            this.mac = mac;
            this.module = module;
        }

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public String getModule() {
            return module;
        }

        public void setModule(String module) {
            this.module = module;
        }
    }
}
