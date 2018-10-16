package com.tz.app

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class indexController {

    @GetMapping(value=Array("/index"))
    def index():String={
        return "helm is kubenete dependency package"
    }

}
