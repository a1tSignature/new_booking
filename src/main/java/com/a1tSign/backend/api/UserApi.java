package com.a1tSign.backend.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        value = "/users",
        consumes = "application/json",
        produces = "application/json"
)
public class UserApi {


}
