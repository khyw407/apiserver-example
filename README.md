# <apiserver-example>

# 1. ApiserverApplication.java
<img width="530" alt="apiserverapplication" src="https://user-images.githubusercontent.com/37721713/46646492-7105c700-cbc5-11e8-94f2-51bfc65008a5.PNG">


*@SpringBootApplication 

    -스프링부트 애플리케이션임을 나타내는 어노테이션을 의미


    -@Configuration, @EnableAutoConfiguration, @ComponentScan을 포함하는 의미를 갖는다. 


        @Configuration - 스프링의 자바 기반 구성 클래스를 지정한다. (스프링 컨테이너가 해당 클래스를 빈 정의의 소스로 사용한다는 의미)
                                             
                                             
        @EnableAutoConfiguration - classpath를 기반으로 ApplicationContext가 생성될 수 있도록 하는 역할.
                            
                            
        @ComponentScan - 메인클래스가 위치한 root package를 기본 속성으로 사용하여 자동으로 다른 컴포넌트 클래스들을 검색하여 빈으로 등록
                                             
                                             

*SpringApplication.run

    -스프링부트 애플리케이션을 실행시키는 메소드

# 2. ResourceServerConfiguration.java
<img width="530" alt="resourceserverconfiguration" src="https://user-images.githubusercontent.com/37721713/46646510-83800080-cbc5-11e8-8bc1-f17b9b8af610.PNG">


*@Configuration

    - 스프링의 자바 기반 구성 클래스를 지정한다. (스프링 컨테이너가 해당 클래스를 빈 정의의 소스로 사용한다는 의미)
    
    
*@EnableResourceServer

    - API 호출에 대한 요청을 검증하도록 설정, 유효한 Access token이 없는 요청의 경우 거부하도록 한다.(스프링 시큐리티 필터를 동작)
    
    
*ResourceServerConfigurerAdapter

    - ResourceOAuthSecurityConfiguration 클래스가 상속한 ResourceServerConfigurerAdapter는 ResourceServerConfigurer 인터페이스를 구현한 
      단순 창구역할을 하는 클래스이다. configure(ResourceServerSecurityConfigurer), configure(HttpSecurity) 두 메소드를 재정의해서 
      사용할 수 있다. 여기서는 configure(HttpSecurity)를 재정의하여 /test 리소스에 대한 접근을 제한한다.

# 3. SampleTest.java
<img width="530" alt="sampletest" src="https://user-images.githubusercontent.com/37721713/46646512-85e25a80-cbc5-11e8-8e6c-c3aebc70e1b2.PNG">


*@RestContoller

    - 해당 클래스가 controller 역할을 수행한다는 의미, @RestController는 @Controller와 달리 리턴 시 뷰를 만드는 것이 아닌 
      REST 방식의 데이터를 리턴한다.
      
      
*@RequestMapping

    - 요청을 어떤 Controller, 어떤 메소드가 처리할지를 맵핑하기 위한 어노테이션

# 4. application.yml
<img width="530" alt="application" src="https://user-images.githubusercontent.com/37721713/46646495-76fba800-cbc5-11e8-9939-368c4a2d1fae.PNG">


*security:oauth2:resource:token-info-uri

    - OAuth 인가 서버를 지정한다. 해당 access token이 유효한지 확인할 수 있도록 하는 설정.
    

*logging:level:org.springframework.security

    - org.springframework.security에만 로그 레벨을 디버그로 지정
