# spring-native-image-simple \  
This repo is used to run simple Spring Boot tests against GraalVM. 

## Instructions

1. Call `mvn clean install`
2. Call `mvn test -PnativeTest`
3. See the following result. Using ConditionalOnProperty doesn't cause any problems with GraalVM:

```build

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.5)

2023-04-25T15:13:36.005-04:00  INFO 69814 --- [           main] .i.MyClassWithConditionalOnPropertyTests : Starting AOT-processed MyClassWithConditionalOnPropertyTests using Java 17.0.5 with PID 69814 (started by mpeddada in /Users/mpeddada/IdeaProjects2/native-image-experiments/spring-native-image-simple)
2023-04-25T15:13:36.005-04:00  INFO 69814 --- [           main] .i.MyClassWithConditionalOnPropertyTests : No active profile set, falling back to 1 default profile: "default"
2023-04-25T15:13:36.021-04:00  INFO 69814 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 0 (http)
2023-04-25T15:13:36.021-04:00  INFO 69814 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-25T15:13:36.021-04:00  INFO 69814 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.7]
2023-04-25T15:13:36.028-04:00  INFO 69814 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-04-25T15:13:36.028-04:00  INFO 69814 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 22 ms
2023-04-25T15:13:36.052-04:00  INFO 69814 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 57215 (http) with context path ''
2023-04-25T15:13:36.053-04:00  INFO 69814 --- [           main] .i.MyClassWithConditionalOnPropertyTests : Started MyClassWithConditionalOnPropertyTests in 0.056 seconds (process running for 0.075)
2023-04-25T15:13:36.056-04:00  INFO 69814 --- [o-auto-1-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2023-04-25T15:13:36.056-04:00  INFO 69814 --- [o-auto-1-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2023-04-25T15:13:36.056-04:00  INFO 69814 --- [o-auto-1-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 0 ms
Running ConditionalOnProperty annotation verification
com.example.MyApplicationTest > contextLoads() SUCCESSFUL

com.example.mysample.it.MyAppIntegrationTests > contextLoads() SUCCESSFUL

com.example.mysample.it.MyClassWithConditionalOnPropertyTests > contextLoads() SUCCESSFUL


Test run finished after 169 ms
[         4 containers found      ]
[         0 containers skipped    ]
[         4 containers started    ]
[         0 containers aborted    ]
[         4 containers successful ]
[         0 containers failed     ]
[         3 tests found           ]
[         0 tests skipped         ]
[         3 tests started         ]
[         0 tests aborted         ]
[         3 tests successful      ]
[         0 tests failed          ]

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  03:16 min
[INFO] Finished at: 2023-04-25T15:13:36-04:00
[INFO] ------------------------------------------------------------------------
```
