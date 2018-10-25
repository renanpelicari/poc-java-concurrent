package renanpr.poc.concurrent.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import renanpr.poc.concurrent.vo.CharacterVo;

import java.util.List;

@FeignClient(name = "mockapiClient", url = "http://5bd1c0cfbded6100135c2fcf.mockapi.io")
public interface MockapiClient {

    @GetMapping(value = "/people")
    List<CharacterVo> getCharacters();
}
