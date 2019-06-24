package lotto.controller;

import lotto.service.PaymentInfoService;
import spark.Request;
import spark.Response;

import java.sql.SQLDataException;
import java.util.HashMap;
import java.util.Map;

import static lotto.controller.common.CommonController.nullable;
import static lotto.controller.common.CommonController.render;

public class PaymentInfoController {
    private PaymentInfoController() {
        throw new AssertionError();
    }

    public static String goPayment(Request request, Response response) throws SQLDataException {
        String userName = nullable(request.queryParams("user_name"));

        // TODO: 2019-06-13 How to process insert result? void?
        int userInsertResult = PaymentInfoService.getInstance().insertUser(userName);

        Map<String, Object> model = new HashMap<>();
        model.put("name", userName);
        return render(model, "lottoPaymentInfo.html");
    }
}
