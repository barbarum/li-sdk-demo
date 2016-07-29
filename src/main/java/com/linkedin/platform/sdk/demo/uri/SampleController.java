package com.linkedin.platform.sdk.demo.uri;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SampleController {

    @RequestMapping("/")
    public String index() {
        return "Sample API call!\n";
    }

}
