package renanpr.poc.concurrent.service;

import org.springframework.stereotype.Service;
import renanpr.poc.concurrent.client.MockapiClient;
import renanpr.poc.concurrent.vo.CharacterVo;

import java.util.List;

@Service
public class ConcurrentService {

    private final MockapiClient mockapiClient;

    public ConcurrentService(MockapiClient mockapiClient) {
        this.mockapiClient = mockapiClient;
    }

    public List<CharacterVo> getCharacters() {
        return mockapiClient.getCharacters();
    }
}
