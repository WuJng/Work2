package com.company;

/**
 * @description:
 * @author:wj
 * @date:Created in 2020-03-26 19:08
 * @version:0.0.1
 * @modified By:
 */

import JAVA2.src.com.company.Transport.AirTransport;
import JAVA2.src.com.company.Transport.Aircraft;
import JAVA2.src.com.company.Transport.Transport;
import JAVA2.src.com.company.Person.*;
import JAVA2.src.com.company.Transport.LandTransport;
import JAVA2.src.com.company.Transport.AirHotballon;
import JAVA2.src.com.company.Transport.LAutomobile;
import JAVA2.src.com.company.Transport.MaritimeMeansOfTransport;
import JAVA2.src.com.company.Transport.Airship;

import java.sql.SQLSyntaxErrorException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person Anna =  new Person();
        Anna.setId("201902236");

        Aircraft AnnaAircraft = new Aircraft();
        AnnaAircraft.setTransportId("AnnaAircraft");

        AirTransport AnnaAirTransport = new AirTransport();
        AnnaAirTransport.setTransportId("AnnaAircraft");

        Airship AnnaAirship = new Airship();
        AnnaAirship.setTransportId("AnnaAirship");

    }
}
