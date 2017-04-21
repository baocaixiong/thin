package org.thin.ugc;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.boot.SpringApplication;


@SpringBootApplication
@ComponentScans({@ComponentScan("org.thin.ugc"),
        @ComponentScan("org.thin.common")}
)
public class ThinApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ThinApplication.class, args);
    }
}

