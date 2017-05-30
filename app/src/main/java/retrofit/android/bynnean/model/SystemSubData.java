package retrofit.android.bynnean.model;

/**
 * Created by 乾隆大帝001 on 2017/5/16.
 */

public class SystemSubData {
    String ip="192.168.169.121";
    String deviceId="3895u834u5983593";
    String mac="1234535345";
    String oui="100";
    String md5="45897893579375";
    String hwVersion="3493533";
    int swVersion=11111;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getOui() {
        return oui;
    }

    public void setOui(String oui) {
        this.oui = oui;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(String hwVersion) {
        this.hwVersion = hwVersion;
    }

    public int getSwVersion() {
        return swVersion;
    }

    public void setSwVersion(int swVersion) {
        this.swVersion = swVersion;
    }
}
