package com.koroyan.restassuredexample.services;

import com.koroyan.restassuredexample.pojos.request.*;
import com.koroyan.restassuredexample.pojos.request.getlistbyname.GetListByName;

public class RequestService {

    public static Envelope getAddIntegerRequestModel(int arg1, int arg2){
       return new Envelope(
               new Envelope.Header(),
               new Body(new AddInteger(arg1,arg2))
       );
    }

    public static Envelope getFindPersonRequestModel(String id){
        return new Envelope(
                new Envelope.Header(),
                new Body(new FindPerson(id)));
    }

    public static Envelope getListByNameRequestModel(String name) {
        return new Envelope(
                new Envelope.Header(),
                new Body(new GetListByName(name)));
    }
}
