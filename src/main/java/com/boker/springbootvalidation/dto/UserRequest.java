package com.boker.springbootvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {
    @NotNull(message = "username should not be null")
    private String userName;
    @Pattern(regexp = "^\\d{10}$", message = "invalid mobile number entered")
    private String userPhoneNo;
    @Email
    private String userEmail;
    @NotBlank(message = "nationality should not be blank")
    private String nationality;
    @Max(10)
    @Min(1)
    private int age;
    private  String gender;
}
