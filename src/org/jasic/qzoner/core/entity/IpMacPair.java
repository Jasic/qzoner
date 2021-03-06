package org.jasic.qzoner.core.entity;
/**
 * ip、物理地址对
 * User: Jasic
 * Date: 13-9-11
 */
public class IpMacPair {

    public IpMacPair() {
    }

    public IpMacPair(String ip, String mac) {
        this.ip = ip;
        this.mac = mac;
        this.subNet = "255.255.255.0";
    }

    public IpMacPair(String ip, String mac, String subNet) {
        this.ip = ip;
        this.mac = mac;
        this.subNet = subNet;
    }

    private String ip;
    private String mac;
    private String subNet;

    public String getSubNet() {
        return subNet;
    }

    public void setSubNet(String subNet) {
        this.subNet = subNet;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public String toString() {
        return "IpMacPair{" +
                "ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                '}';
    }
}
