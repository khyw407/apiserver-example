# <apiserver-example>

# 1. ApiserverApplication.java
<img width="530" alt="apiserverapplication" src="https://user-images.githubusercontent.com/37721713/46646492-7105c700-cbc5-11e8-94f2-51bfc65008a5.PNG">


*@SpringBootApplication 

    *스프링부트 애플리케이션임을 나타내는 어노테이션을 의미


    *@Configuration, @EnableAutoConfiguration, @ComponentScan을 포함하는 의미를 갖는다. 


        *@Configuration - 스프링의 자바 기반 구성 클래스를 지정한다. 
                      스프링 컨테이너가 해당 클래스를 빈 정의의 소스로 사용한다는 의미
                                             
                                             
        *@EnableAutoConfiguration - classpath를 기반으로 ApplicationContext가 생성될 수 있도록 하는 역할.
                            
                            
        *@ComponentScan - 메인클래스가 위치한 root package를 기본 속성으로 사용하여 자동으로 다른 컴포넌트 클래스들을 검색하여 빈으로 등록
                                             
                                             

*SpringApplication.run

    *스프링부트 애플리케이션을 실행시키는 메소드

# 2. ResourceServerConfiguration.java
<img width="530" alt="resourceserverconfiguration" src="https://user-images.githubusercontent.com/37721713/46646510-83800080-cbc5-11e8-8bc1-f17b9b8af610.PNG">


# 3. SampleTest.java
<img width="530" alt="sampletest" src="https://user-images.githubusercontent.com/37721713/46646512-85e25a80-cbc5-11e8-8e6c-c3aebc70e1b2.PNG">


# 4. application.yml
<img width="530" alt="application" src="https://user-images.githubusercontent.com/37721713/46646495-76fba800-cbc5-11e8-9939-368c4a2d1fae.PNG">


# 5. pom.xml
<img width="530" alt="pom1" src="https://user-images.githubusercontent.com/37721713/46646505-7cf18900-cbc5-11e8-97ce-07be01941557.PNG">

<img width="530" alt="pom2" src="https://user-images.githubusercontent.com/37721713/46646507-80851000-cbc5-11e8-89c4-106b677bf4ae.PNG">
