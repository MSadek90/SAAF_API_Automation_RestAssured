package com.api.Checker;

import java.util.ArrayList;
import java.util.List;

import com.api.DataLoader.RealEstateDataLoader;
import com.api.annotations.RealEstateProjectsActionsConfig;

import com.api.models.Response.RealEstateProjects.RealEstateProjectResponse;
import com.api.models.UtilsModels.CheckActionsModel;

public class RealEstateProjectActionsChecker {

    public static List<CheckActionsModel> checkProjectActions(RealEstateProjectResponse response)
            throws IllegalArgumentException, IllegalAccessException {

        List<CheckActionsModel> falseEndpoints = new ArrayList<>();

        // #1. Get the 'actions' object and the 'projectId' from the response
        var actions = response.getData().getActions();

        // #2. Get all declared fields from the Actions class using reflection
        var fields = actions.getClass().getDeclaredFields();

        // #3. Start a loop to iterate through each field
        for (var field : fields) {
            // #4. Make the field accessible (to read private fields)
            field.setAccessible(true);

            // #5. Check if the field name starts with "can"
            if (field.isAnnotationPresent(RealEstateProjectsActionsConfig.class) && field.getName().startsWith("can")) {
                // #6. Get the boolean value of the field from the actions object
                boolean value = field.getBoolean(actions);

                // #7. If the value is 'false', extract the action name from the field name
                if (!value) {
                    String apiEndpoint = field.getAnnotation(RealEstateProjectsActionsConfig.class).endpoint();
                    Object BodyTemp = null;
                    if (field.getName().equals("canReceivePayment")) {
                        BodyTemp = new RealEstateDataLoader().receiveProjectPaymentLoadData();
                    }
                    // #8. Put all endpoints in List and return them only
                    falseEndpoints.add(new CheckActionsModel(apiEndpoint, BodyTemp));
                }
            }
        }
        return falseEndpoints;
    }

}
