# study-security-basic 저장소입니다.

## 프로젝트 설정
- 프로젝트 선택
    - Project : Gradle Project
    - Language : Java
    - Spring Boot : 2.6.x
- Project Metadata
    - Group : study.security
    - Artifact : basic
    - Package name : study.security.basic
    - Packaging : Jar
    - Java : 11  

## 내용

### 스프링 시큐리티
- 인증 (Authentication)
    - 사이트에 접근하는 사람이 누구인지 시스템이 알아야 하기 위해 로그인 하는 과정이 필요하다
        - UsernamePassword 인증
            - Session 관리
            - 토큰 관리 (sessionless)
        - Sns 로그인 (소셜 로그인) : 인증 위임
- 권한 (Authorization)
    - 로그인한 사용자가 어떤 일을 할 수 있는지 권한을 설정한다. 권한이 있는 사용자에게만 페이지나 ㄹ소스 접근을 허용하도록 코딩 해야한다.
        - Secured : deprecated
        - PrePostAuthorize
        - AOP
- 메모리 사용자 인증
    - 간단히 특정된 소스를 위한 서비스나 테스트를 위해 사용하는 용도로 사용한다. 스프링 시큐리티를 테스트 하기 위한 용도로 사용한다.
        - 기본 사용자 로그인
        - application.yml 에 설정하고 로그인하기
        - UserDetailService 를 이용하기
- 스프링 시큐리티 필터
    - HeaderWriterFilter : Http 해더를 검사한다. 써야 할 건 잘 써있는지, 필요한 해더를 더해줘야 할 건 없는가?
    - CorsFilter : 허가된 사이트나 클라이언트의 요청인가?
    - CsrfFilter : 내가 내보낸 리소스에서 올라온 요청인가?
    - LogoutFilter : 지금 로그아웃하겠다고 하는건가?
    - UsernamePasswordAuthenticationFilter : username / password 로 로그인을 하려고 하는가? 만약 로그인이면 여기서 처리하고 가야 할 페이지로 보내 줄께.
    - ConcurrentSessionFilter : 여거저기서 로그인 하는걸 허용할 것인가?
    - BearerTokenAuthenticationFilter : Authorization 해더에 Bearer 토큰이 오면 인증 처리 해줄께.
    - BasicAuthenticationFilter : Authorization 해더에 Basic 토큰을 주면 검사해서 인증처리 해줄께.
    - RequestCacheAwareFilter : 방금 요청한 request 이력이 다음에 필요할 수 있으니 캐시에 담아놓을께.
    - SecurityContextHolderAwareRequestFilter : 보안 관련 Servlet 3 스펙을 지원하기 위한 필터라고 한다.(?)
    - RememberMeAuthenticationFilter : 아직 Authentication 인증이 안된 경우라면 RememberMe 쿠키를 검사해서 인증 처리해줄께
    - AnonymousAuthenticationFilter : 아직도 인증이 안되었으면 너는 Anonymous 사용자야
    - SessionManagementFilter : 서버에서 지정한 세션정책을 검사할께.
    - ExcpetionTranslationFilter : 나 이후에 인증이나 권한 예외가 발생하면 내가 잡아서 처리해 줄께.
    - FilterSecurityInterceptor : 여기까지 살아서 왔다면 인증이 있다는 거니, 니가 들어가려고 하는 request 에 들어갈 자격이 있는지 그리고 리턴한 결과를 너에게 보내줘도 되는건지 마지막으로 내가 점검해 줄께.
    - 그 밖에... OAuth2 나 Saml2, Cas, X509 등에 관한 필터들도 있습니다.

[[다음으로]](https://github.com/heechul90/study-security-login-basic)

[[복습하기//적용하기]](https://github.com/heechul90/heech-member-server)
