package hello.typeconverter.type;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

// 127.0.0.1:8080 to this class
@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class IpPort {

    private String ip;
    private int port;
}
