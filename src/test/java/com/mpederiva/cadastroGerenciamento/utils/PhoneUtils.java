package com.mpederiva.cadastroGerenciamento.Utils;

import com.mpederiva.cadastroGerenciamento.dto.request.PhoneDTO;
import com.mpederiva.cadastroGerenciamento.entity.Phone;
import com.mpederiva.cadastroGerenciamento.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "(11)90000-0000";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
