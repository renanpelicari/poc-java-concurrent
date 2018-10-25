package renanpr.poc.concurrent.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import renanpr.poc.concurrent.service.ConcurrentService;
import renanpr.poc.concurrent.vo.CharacterVo;

import java.util.List;

@RestController
@RequestMapping(value = "/concurrent", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConcurrentController {

    private final ConcurrentService concurrentService;

    public ConcurrentController(ConcurrentService concurrentService) {
        this.concurrentService = concurrentService;
    }

    @GetMapping(value = "/people")
    public List<CharacterVo> getCharacters() {
        return concurrentService.getCharacters();
    }
}
