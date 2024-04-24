package com.marco.stripeintegration.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePaymentResponse {
  private String clientSecret;

  public CreatePaymentResponse(String clientSecret){
      this.clientSecret = clientSecret;
  }
}
