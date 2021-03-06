package com.alleywayconsulting.piggybanker.server.dto;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Michael Lake on 2/16/16.
 * Copyright (c) Alleyway Consulting, LLC
 */

public class CoinDTO implements Serializable {

    public Date date;

    public Integer amount;

    public String day;

    public String barcodeContent;

    public Long sessionId;

    public CoinDTO(Long sessionId, Integer amount, String day, String barcodeContent) {
        this.sessionId = sessionId;
        this.date = Calendar.getInstance().getTime();
        this.amount = amount;
        this.day = day;
        this.barcodeContent = barcodeContent;
    }

}
