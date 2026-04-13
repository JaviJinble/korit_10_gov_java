package ex2.controller;

import ex2.dto.ResponseDto;
import ex2.router.RouterPath;
import ex2.router.Routes;

import java.util.HashMap;
import java.util.Map;

public class Controller {

    public static ResponseDto<Map<String, Object>> homeController(String selectedMenu) {
        ResponseDto<Map<String, Object>> responseDto = new ResponseDto<>(200, new HashMap<>());
        try {
            if ("1".equals(selectedMenu)) {
                RouterPath.current = Routes.ACCOUNT.name();
//                throw new RuntimeException("계좌등록 실패 유효한 계좌번호를 입력하세요.");
            } else if ("2".equals(selectedMenu)) {

            } else if ("3".equals(selectedMenu)) {

            } else if ("4".equals(selectedMenu)) {

            } else if ("5".equals(selectedMenu)) {

            } else if ("6".equals(selectedMenu)) {

            } else if ("q".equals(selectedMenu)) {
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
