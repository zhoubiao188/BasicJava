package cn.ityoudream.webflux;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@RestController
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/1")
    private String get1() {
        log.info("get1 start");
        String result = createStr();
        log.info("get1 end.");
        return result;
    }

    @GetMapping("/2")
    private Mono<String> get2() {
        log.info("get2 start");
        Mono<String> result = Mono.fromSupplier(() -> createStr());
        log.info("get2 end.");
        return result;
    }

    /**
     * Flux : 返回0-n个元素
     *
     * @return
     */
    @GetMapping(value = "/3", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    private Flux<String> flux() {
        Flux<String> result = Flux
                .fromStream(IntStream.range(1, 5).mapToObj(i -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                    }
                    return "flux data--" + i;
                }));
        return result;
    }

    private String createStr() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
        }
        return "some string";
    }

}

