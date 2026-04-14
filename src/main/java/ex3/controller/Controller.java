package ex3.controller;

import ex3.dto.ResponseDto;
import ex3.router.RouterPath;
import ex3.router.Routes;
import ex3.service.Service;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    public static final Service service = new Service();

    public static ResponseDto<Map<String, Object>> homeController(String selecteMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selecteMenu)) {
                RouterPath.current = Routes.ACCOUNT.name();
            } else if ("2".equals(selecteMenu)) {
                RouterPath.current = Routes.DEPOSIT.name();
            } else if ("3".equals(selecteMenu)) {
                // RouterPath.current = Routes.WITHDRAWAL.name();
            } else if ("4".equals(selecteMenu)) {
                // RouterPath.current = Routes.FIND_ACCOUUNT.name();
            } else if ("5".equals(selecteMenu)) {
                RouterPath.current = Routes.ACCOUNT_LIST.name();
            } else if ("6".equals(selecteMenu)) {
                RouterPath.current = Routes.HISTORY.name();
            } else if ("q".equals(selecteMenu)) {
                responseDto.setStatus(100);
            } else {
                throw new RuntimeException("해당 입력 값은 유효하지 않습니다. 다시 입력하세요.");
            }
        } catch (RuntimeException e) {
            Map<String, Object> errorMap = Map.of(
                    "message", e.getMessage());
            responseDto = new ResponseDto<>(400, errorMap);
        }
        return responseDto;
    }
}
