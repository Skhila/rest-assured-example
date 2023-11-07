package com.koroyan.restassuredexample.repository.getlistbyname;

import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;
import com.koroyan.restassuredexample.pojos.response.PersonIdentification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.koroyan.restassuredexample.data.ExpectedData.*;

public class ListByNameResultData {
    public static GetListByNameResult getPersonsList() {
        List<PersonIdentification> expectedNamesList = Arrays.asList(firstXavier, secondXavier, thirdXavier, fourthXavier);

        return new GetListByNameResult(expectedNamesList);
    }
}
