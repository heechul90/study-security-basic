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