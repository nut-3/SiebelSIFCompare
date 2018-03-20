package ru.nut3.siebelsifcompare.logic;

import com.siebel.data.SiebelDataBean;
import com.siebel.data.SiebelException;

public class SiebelConnect extends SiebelDataBean {
    private String login, password, serverAddress, enterprise, busComp;
    private static String locale = "enu";
    private int serverPort;

    public SiebelConnect(String login, String password, String serverAddress, String enterprise, String busComp, int serverPort) throws SiebelException {
        super("Siebel://" + serverAddress + ":" + serverPort + "/" + enterprise + "/" + busComp, login, password, locale);
        this.login = login;
        this.password = password;
        this.serverAddress = serverAddress;
        this.enterprise = enterprise;
        this.busComp = busComp;
        this.serverPort = serverPort;
    }

    public boolean logoff() {

        return false;
    }
}
